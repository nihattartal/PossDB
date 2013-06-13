package org.parser;

import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main {

    /**
     * @param args
     * @throws IOException 
     * @throws RecognitionException 
     */
    public static void main(String[] args) throws Exception {

        //ANTLRStringStream in = new ANTLRStringStream(s);
        ANTLRInputStream in = new ANTLRInputStream(System.in);
        CreateTableLexer lexer = new CreateTableLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTableParser parser = new CreateTableParser(tokens);
        parser.parse();
        System.out.println(Query.q.getPossQLQuery());
    }
}
