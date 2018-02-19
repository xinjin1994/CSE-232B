import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class XPathEvalVisitor extends XPathBaseVisitor<ArrayList<Node>> {
    private ArrayList<Node> curr = new ArrayList();

    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {
        String filename = ctx.filename().PATH().getText();
        filename = filename.substring(1, filename.length() - 1).replace("\"\"", "\"");
        File file = new File(filename);
        ArrayList<Node> ret = new ArrayList();
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(doc != null) {
            doc.getDocumentElement().normalize();
            ret.add(doc);
        }
        curr = ret;
        return ret;
    }

    @Override
    public ArrayList<Node> visitAp_all(XPathParser.Ap_allContext ctx) {
        this.visit(ctx.doc());
        LinkedList<Node> tmp = new LinkedList<>(curr);
        ArrayList<Node> ret = new ArrayList<>(curr);
        while(!tmp.isEmpty()) {
            Node n = tmp.poll();
            tmp.addAll(getChildren(n));
            ret.addAll(getChildren(n));
        }
        curr = ret;
        return this.visit(ctx.rp());
    }

    private ArrayList<Node> getChildren(Node n) {
        ArrayList<Node> ret = new ArrayList<>();
        NodeList nList = n.getChildNodes();
        for(int i=0; i<nList.getLength();i++){
            ret.add(nList.item(i));
        }
        return ret;
    }

    @Override
    public ArrayList<Node> visitAp_descendant(XPathParser.Ap_descendantContext ctx) {
        this.visit(ctx.doc());
        ArrayList<Node> ret = getChildren(curr.get(0));
        curr = ret;
        return this.visit(ctx.rp());
    }

    //    not sure about the relation of tagName and node
    @Override
    public ArrayList<Node> visitRp_tagName(XPathParser.Rp_tagNameContext ctx) {
        ArrayList<Node> ret = new ArrayList<>();
        for(Node n : curr) {
            for(Node child : getChildren(n)) {
                if(child.getNodeType() == Node.ELEMENT_NODE) {
                    Element el = (Element) child;
                    if(el.getNodeName().equals(ctx.getText())) {
                        ret.add(child);
                    }
                }
            }
        }
        curr = ret;
        return ret;
    }


    // not sure
    @Override
    public ArrayList<Node> visitRp_star(XPathParser.Rp_starContext ctx) {
        ArrayList<Node> ret = new ArrayList<>();
        for(Node n : curr){
            for(Node child :getChildren(n)) {
                ret.add(child);
            }
        }
        curr = ret;
        return ret;
    }

    @Override
    public ArrayList<Node> visitRp_dot(XPathParser.Rp_dotContext ctx) {
        return curr;
    }

    @Override
    public ArrayList<Node> visitRp_dotdot(XPathParser.Rp_dotdotContext ctx) {
        HashSet<Node> par = new HashSet<Node>();
        for(Node n : curr) {
            par.add(n.getParentNode());
        }
        curr = new ArrayList<Node>(par);
        return curr;
    }

    @Override
    public ArrayList<Node> visitRp_text(XPathParser.Rp_textContext ctx) {
        ArrayList<Node> ret = new ArrayList<>();
        for(Node n : curr) {
            for(Node child : getChildren(n)) {
                if(child.getNodeType() == Node.TEXT_NODE) {
                    System.out.print(child.getTextContent());
                    ret.add(child);
                }
            }
        }
        return ret;
    }

    // what should we return? what is curr now?
    @Override
    public ArrayList<Node> visitRp_attName(XPathParser.Rp_attNameContext ctx) {
        ArrayList<Node> ret = new ArrayList<>();
        String attrName = ctx.NAME().getText();
        for(Node n : curr) {
            if(n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            String attr = ((Element)n).getAttribute(attrName);
            if(attr != "") {
                ret.add(n);
                attr = attrName +"=\""+ attr +"\"";
                System.out.println(attr);
            }
        }
        curr = ret;
        return ret;
    }

    @Override
    public ArrayList<Node> visitRp_paren(XPathParser.Rp_parenContext ctx) {
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitRp_descendant(XPathParser.Rp_descendantContext ctx) {
        this.visit(ctx.rp(0));
        return this.visit(ctx.rp(1));
    }

    @Override
    public ArrayList<Node> visitRp_all(XPathParser.Rp_allContext ctx) {
        this.visit(ctx.rp(0));
        LinkedList<Node> tmp = new LinkedList<>(curr);
        ArrayList<Node> ret = new ArrayList<>(curr);
        while(!tmp.isEmpty()) {
            Node n = tmp.poll();
            tmp.addAll(getChildren(n));
            ret.addAll(getChildren(n));
        }
        curr = ret;
        return this.visit(ctx.rp(1));
    }

    @Override
    public ArrayList<Node> visitRp_filter(XPathParser.Rp_filterContext ctx) {
        this.visit(ctx.rp());
        ArrayList<Node> tmp = new ArrayList<Node>(curr);
        ArrayList<Node> ret = new ArrayList<Node>();
        for(Node n : tmp) {
            curr = new ArrayList<Node>();
            curr.add(n);
            ArrayList<Node> filter = visit(ctx.filter());
            if (!filter.isEmpty()) {
                ret.add(n);
            }
        }
        curr = ret;
        return ret;
    }

    @Override
    public ArrayList<Node> visitRp_combine(XPathParser.Rp_combineContext ctx) {
        ArrayList<Node> tmp = curr;
        ArrayList<Node> ret = visit(ctx.rp(0));
        curr = tmp;
        ret.addAll(visit(ctx.rp(1)));
        curr = ret;
        return ret;
    }

    @Override
    public ArrayList<Node> visitFilter_rp(XPathParser.Filter_rpContext ctx) {
        ArrayList<Node> tmp = curr;
        ArrayList<Node> ret = visit(ctx.rp());
        curr = tmp;
        return ret;
    }


    @Override
    public ArrayList<Node> visitFilter_equal(XPathParser.Filter_equalContext ctx) {
        ArrayList<Node> tmp = curr;
        ArrayList<Node> ret1 = this.visit(ctx.rp(0));
        curr = tmp;
        ArrayList<Node> ret2 = this.visit(ctx.rp(1));
        curr = tmp;
        boolean flag = false;
        for(Node n1 : ret1) {
            for(Node n2 :ret2) {
                if(n1.isEqualNode(n2)) {
                    flag = true;
                    break;
                }
            }
        }
        ArrayList<Node> ret = new ArrayList<>();
        if(flag) ret = curr;
        return ret;
    }

    @Override
    public ArrayList<Node> visitFilter_is(XPathParser.Filter_isContext ctx) {
        ArrayList<Node> tmp = curr;
        ArrayList<Node> ret1 = this.visit(ctx.rp(0));
        curr = tmp;
        ArrayList<Node> ret2 = this.visit(ctx.rp(1));
        curr = tmp;
        boolean flag = false;
        for(Node n1 : ret1) {
            for(Node n2 :ret2) {
                if(n1 == n2) {
                    flag = true;
                    break;
                }
            }
        }
        ArrayList<Node> ret = new ArrayList<>();
        if(flag) ret = curr;
        return ret;
    }


    @Override
    public ArrayList<Node> visitFilter_paren(XPathParser.Filter_parenContext ctx) {
        return this.visit(ctx.filter());
    }


    @Override
    public ArrayList<Node> visitFilter_and(XPathParser.Filter_andContext ctx) {
        ArrayList<Node> tmp = curr;
        Set<Node> ret1 = new HashSet<Node>(visit(ctx.filter(0)));
        curr = tmp;
        Set<Node> ret2 = new HashSet<Node>(visit(ctx.filter(0)));
        curr = tmp;
        ret1.retainAll(ret2);
        curr = new ArrayList<Node>(ret1);
        return curr;
    }

    @Override
    public ArrayList<Node> visitFilter_or(XPathParser.Filter_orContext ctx) {
        ArrayList<Node> tmp = curr;
        Set<Node> ret1 = new HashSet<Node>(visit(ctx.filter(0)));
        curr = tmp;
        Set<Node> ret2 = new HashSet<Node>(visit(ctx.filter(0)));
        curr = tmp;
        ret1.addAll(ret2);
        curr = new ArrayList<Node>(ret1);
        return curr;
    }

    @Override
    public ArrayList<Node> visitFilter_not(XPathParser.Filter_notContext ctx) {
        ArrayList<Node> tmp = new ArrayList<Node>(curr);
        ArrayList<Node> ret = new ArrayList<Node>();
        for(Node n : tmp) {
            curr = new ArrayList<Node>();
            curr.add(n);
            ArrayList<Node> filter = visit(ctx.filter());
            if(filter.isEmpty()) {
                ret.add(n);
            }
        }
        curr = ret;
        return curr;
    }

    @Override
    public ArrayList<Node> visitXq_var(XPathParser.Xq_varContext ctx) {
        return super.visitXq_var(ctx);
    }

    @Override
    public ArrayList<Node> visitXq_strConstant(XPathParser.Xq_strConstantContext ctx) {
        return super.visitXq_strConstant(ctx);
    }

    @Override
    public ArrayList<Node> visitXq_ap(XPathParser.Xq_apContext ctx) {
        return super.visitXq_ap(ctx);
    }


}
