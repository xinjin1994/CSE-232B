import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.w3c.dom.Node;
import java.util.*;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

    public static void main(String[] args) throws Exception {
        XPathLexer lexer = new XPathLexer(new ANTLRFileStream("/Users/yaxuanwang/Documents/Courses/CSE232/project/XQueryTest.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XPathParser parser = new XPathParser(tokens);
        ParseTree tree = parser.xq();
        XPathEvalVisitor eval = new XPathEvalVisitor();
        ArrayList<Node> finalResult = eval.visit(tree);
        System.out.println("\n===========================================================================");
        for (Node n : finalResult) {
            System.out.println(n.getTextContent());
        }
        System.out.println(finalResult.size() + " results\n");

//            JFrame frame = new JFrame("Antlr AST");
//            JPanel panel = new JPanel();
//            TreeViewer viewr = new TreeViewer(Arrays.asList(
//                    parser.getRuleNames()),tree);
//            viewr.setScale(1.5);//scale a little
//            panel.add(viewr);
//            frame.add(panel);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(200,200);
//            frame.setVisible(true);
    }
}
