package wyk;

import Expr.ExprLexer;
import Expr.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.*;


public class aaaa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        while (true) {
            String x = br.readLine();
            run(x);
        }
    }

    private static void run(String expr) {

        CharStream in = CharStreams.fromString(expr);
        ExprLexer lexer = new ExprLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree parseTree = parser.prog();
        EvalVisitor visitor = new EvalVisitor();
//        Integer rtn = (Integer)
        visitor.visit(parseTree);
//        System.out.println(rtn.toString());
    }
}
