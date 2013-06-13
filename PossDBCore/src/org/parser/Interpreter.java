package org.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Interpreter {
    
    private Interpreter() {
        
    }
    
    public static Query getQuery(String str) throws RecognitionException {
        ANTLRStringStream in = new ANTLRStringStream(str);
        CreateTableLexer lexer = new CreateTableLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTableParser parser = new CreateTableParser(tokens);
        parser.parse();
        return Query.q;
    }
    
    public static Query getQuery(InputStream is) throws RecognitionException, IOException {
        ANTLRInputStream in = new ANTLRInputStream(is);
        CreateTableLexer lexer = new CreateTableLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreateTableParser parser = new CreateTableParser(tokens);
        parser.parse();
        return Query.q;
    }
}
