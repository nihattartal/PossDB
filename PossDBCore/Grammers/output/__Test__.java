import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import org.parser.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        CreateTableLexer lex = new CreateTableLexer(new ANTLRFileStream("F:\\workspace\\PossDB\\Grammers\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        CreateTableParser g = new CreateTableParser(tokens, 49100, null);
        try {
            g.searchCondition();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}