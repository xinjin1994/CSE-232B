import java.io.File;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import java.util.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class Main {

    public static void main(String[] args) throws Exception {
        XPathLexer lexer = new XPathLexer(new ANTLRFileStream("XQueryTest.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XPathParser parser = new XPathParser(tokens);
        boolean rewrite = true;
        if (rewrite) {
            XPathParser.XqContext FLWRctx = parser.xq();
            XQueryRewriter rewriter = new XQueryRewriter();
            rewriter.parseFLWR(FLWRctx);
            String rewirteXq = rewriter.constructJoin();
            try (PrintWriter out = new PrintWriter("rewriteFile.txt")) {
                out.println(rewirteXq);
            }
            lexer = new XPathLexer(new ANTLRFileStream("rewriteFile.txt"));
            tokens = new CommonTokenStream(lexer);

            parser = new XPathParser(tokens);
        } else {
            ParseTree tree = parser.xq();
            XPathEvalVisitor eval = new XPathEvalVisitor();
            ArrayList<Node> finalResult = eval.visit(tree);
//        System.out.println("\n===========================================================================");
//        for (Node n : finalResult) {
//            System.out.println(n.getTextContent());
//        }
//        System.out.println(finalResult.size() + " results\n");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document doc;
            try {
                doc = dbf.newDocumentBuilder().newDocument();
            } catch (ParserConfigurationException ex) {
                return;
            }
            Element ele = doc.createElement("INIT");
            for (Node element : finalResult) {
                if (element != null) {
                    Node importedNode = doc.importNode(element, true);
                    ele.appendChild(importedNode);
                }
            }
            doc.appendChild(ele);
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("xqueries.xml"));

            transformer.transform(source, result);

        }
    }
}
