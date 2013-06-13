// $ANTLR 3.4 F:\\workspace\\PossDB\\Grammers\\Equality.g 2012-05-29 13:20:35

package org.parser;

import java.util.List;
import org.parser.QueryList;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EqualityParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "DOT", "EQUAL", "ID", "NEWLINE", "WS"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int DOT=5;
    public static final int EQUAL=6;
    public static final int ID=7;
    public static final int NEWLINE=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EqualityParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EqualityParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EqualityParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\workspace\\PossDB\\Grammers\\Equality.g"; }



    // $ANTLR start "parseEquality"
    // F:\\workspace\\PossDB\\Grammers\\Equality.g:16:1: parseEquality returns [Equality equality] : ( ( schema1 DOT )? table1 EQUAL ( schema2 DOT )? table2 ) ;
    public final Equality parseEquality() throws RecognitionException {
        Equality equality = null;


        EqualityParser.schema1_return schema11 =null;

        EqualityParser.schema2_return schema22 =null;

        EqualityParser.table1_return table13 =null;

        EqualityParser.table2_return table24 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:17:2: ( ( ( schema1 DOT )? table1 EQUAL ( schema2 DOT )? table2 ) )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:2: ( ( schema1 DOT )? table1 EQUAL ( schema2 DOT )? table2 )
            {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:2: ( ( schema1 DOT )? table1 EQUAL ( schema2 DOT )? table2 )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:3: ( schema1 DOT )? table1 EQUAL ( schema2 DOT )? table2
            {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:3: ( schema1 DOT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOT) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:4: schema1 DOT
                    {
                    pushFollow(FOLLOW_schema1_in_parseEquality34);
                    schema11=schema1();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_parseEquality36); 

                    }
                    break;

            }


            pushFollow(FOLLOW_table1_in_parseEquality40);
            table13=table1();

            state._fsp--;


            match(input,EQUAL,FOLLOW_EQUAL_in_parseEquality42); 

            // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:31: ( schema2 DOT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOT) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\Equality.g:18:32: schema2 DOT
                    {
                    pushFollow(FOLLOW_schema2_in_parseEquality45);
                    schema22=schema2();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_parseEquality47); 

                    }
                    break;

            }


            pushFollow(FOLLOW_table2_in_parseEquality51);
            table24=table2();

            state._fsp--;


            }



                 Equality e = new Equality();
                 e.schema1 = (schema11!=null?input.toString(schema11.start,schema11.stop):null);
                 e.schema2 = (schema22!=null?input.toString(schema22.start,schema22.stop):null);
                 e.table1 =  (table13!=null?input.toString(table13.start,table13.stop):null);
                 e.table2 =  (table24!=null?input.toString(table24.start,table24.stop):null);
                 equality = e;
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return equality;
    }
    // $ANTLR end "parseEquality"


    public static class schema1_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "schema1"
    // F:\\workspace\\PossDB\\Grammers\\Equality.g:27:1: schema1 : ID ;
    public final EqualityParser.schema1_return schema1() throws RecognitionException {
        EqualityParser.schema1_return retval = new EqualityParser.schema1_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:27:9: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:27:11: ID
            {
            match(input,ID,FOLLOW_ID_in_schema163); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema1"


    public static class schema2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "schema2"
    // F:\\workspace\\PossDB\\Grammers\\Equality.g:28:1: schema2 : ID ;
    public final EqualityParser.schema2_return schema2() throws RecognitionException {
        EqualityParser.schema2_return retval = new EqualityParser.schema2_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:28:9: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:28:11: ID
            {
            match(input,ID,FOLLOW_ID_in_schema270); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema2"


    public static class table1_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "table1"
    // F:\\workspace\\PossDB\\Grammers\\Equality.g:29:1: table1 : ID ;
    public final EqualityParser.table1_return table1() throws RecognitionException {
        EqualityParser.table1_return retval = new EqualityParser.table1_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:29:8: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:29:10: ID
            {
            match(input,ID,FOLLOW_ID_in_table177); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table1"


    public static class table2_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "table2"
    // F:\\workspace\\PossDB\\Grammers\\Equality.g:30:1: table2 : ID ;
    public final EqualityParser.table2_return table2() throws RecognitionException {
        EqualityParser.table2_return retval = new EqualityParser.table2_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:30:8: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:30:10: ID
            {
            match(input,ID,FOLLOW_ID_in_table284); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table2"

    // Delegated rules


 

    public static final BitSet FOLLOW_schema1_in_parseEquality34 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_parseEquality36 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_table1_in_parseEquality40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_parseEquality42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_schema2_in_parseEquality45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DOT_in_parseEquality47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_table2_in_parseEquality51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table284 = new BitSet(new long[]{0x0000000000000002L});

}