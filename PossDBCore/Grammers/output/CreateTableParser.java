// $ANTLR 3.4 F:\\workspace\\PossDB\\Grammers\\CreateTable.g 2012-11-22 14:10:34

package org.parser;

import java.util.List;
import org.parser.QueryList;
import org.parser.ColumnList;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CreateTableParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "ASTERIK", "B", "C", "CERTAIN", "COMMA", "CONDITION", "CREATE", "D", "DIGIT", "DOT", "E", "EQUAL", "EXCLAMATION", "F", "FALSE", "FROM", "G", "H", "I", "ID", "INNER", "INSERT", "INTO", "IS", "J", "JOIN", "K", "L", "LEFT_PAREN", "LEFT_TRIANGLE", "M", "N", "NEWLINE", "NOT", "NOT_EQUAL", "NUMBER", "O", "ON", "OR", "P", "POSSIBLE", "Q", "QUOTE", "R", "RIGHT_PAREN", "RIGHT_TRIANGLE", "S", "SELECT", "SEMICOLON", "T", "TABLE", "TRUE", "U", "UNKNOWN", "V", "VALUES", "VARIABLE", "W", "WHERE", "WS", "X", "Y", "Z", "'\\'\\''"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int A=4;
    public static final int AND=5;
    public static final int ASTERIK=6;
    public static final int B=7;
    public static final int C=8;
    public static final int CERTAIN=9;
    public static final int COMMA=10;
    public static final int CONDITION=11;
    public static final int CREATE=12;
    public static final int D=13;
    public static final int DIGIT=14;
    public static final int DOT=15;
    public static final int E=16;
    public static final int EQUAL=17;
    public static final int EXCLAMATION=18;
    public static final int F=19;
    public static final int FALSE=20;
    public static final int FROM=21;
    public static final int G=22;
    public static final int H=23;
    public static final int I=24;
    public static final int ID=25;
    public static final int INNER=26;
    public static final int INSERT=27;
    public static final int INTO=28;
    public static final int IS=29;
    public static final int J=30;
    public static final int JOIN=31;
    public static final int K=32;
    public static final int L=33;
    public static final int LEFT_PAREN=34;
    public static final int LEFT_TRIANGLE=35;
    public static final int M=36;
    public static final int N=37;
    public static final int NEWLINE=38;
    public static final int NOT=39;
    public static final int NOT_EQUAL=40;
    public static final int NUMBER=41;
    public static final int O=42;
    public static final int ON=43;
    public static final int OR=44;
    public static final int P=45;
    public static final int POSSIBLE=46;
    public static final int Q=47;
    public static final int QUOTE=48;
    public static final int R=49;
    public static final int RIGHT_PAREN=50;
    public static final int RIGHT_TRIANGLE=51;
    public static final int S=52;
    public static final int SELECT=53;
    public static final int SEMICOLON=54;
    public static final int T=55;
    public static final int TABLE=56;
    public static final int TRUE=57;
    public static final int U=58;
    public static final int UNKNOWN=59;
    public static final int V=60;
    public static final int VALUES=61;
    public static final int VARIABLE=62;
    public static final int W=63;
    public static final int WHERE=64;
    public static final int WS=65;
    public static final int X=66;
    public static final int Y=67;
    public static final int Z=68;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CreateTableParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreateTableParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CreateTableParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\workspace\\PossDB\\Grammers\\CreateTable.g"; }



    // $ANTLR start "parse"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:15:1: parse : ( create_table | insert_tuple | select | is_functions );
    public final void parse() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:15:8: ( create_table | insert_tuple | select | is_functions )
            int alt1=4;
            switch ( input.LA(1) ) {
            case CREATE:
                {
                alt1=1;
                }
                break;
            case INSERT:
                {
                alt1=2;
                }
                break;
            case SELECT:
                {
                alt1=3;
                }
                break;
            case IS:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:4: create_table
                    {
                    pushFollow(FOLLOW_create_table_in_parse29);
                    create_table();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:19: insert_tuple
                    {
                    pushFollow(FOLLOW_insert_tuple_in_parse33);
                    insert_tuple();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:34: select
                    {
                    pushFollow(FOLLOW_select_in_parse37);
                    select();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:43: is_functions
                    {
                    pushFollow(FOLLOW_is_functions_in_parse41);
                    is_functions();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parse"



    // $ANTLR start "create_table"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:18:1: create_table : CREATE TABLE table_name table_element_list SEMICOLON ;
    public final void create_table() throws RecognitionException {
        CreateTableParser.table_name_return table_name1 =null;

        List table_element_list2 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:19:2: ( CREATE TABLE table_name table_element_list SEMICOLON )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:19:4: CREATE TABLE table_name table_element_list SEMICOLON
            {
            match(input,CREATE,FOLLOW_CREATE_in_create_table50); 

            match(input,TABLE,FOLLOW_TABLE_in_create_table52); 

            pushFollow(FOLLOW_table_name_in_create_table54);
            table_name1=table_name();

            state._fsp--;


            pushFollow(FOLLOW_table_element_list_in_create_table59);
            table_element_list2=table_element_list();

            state._fsp--;



            		        Query.q = new CreateTable();
            			Query.q.setTableName((table_name1!=null?input.toString(table_name1.start,table_name1.stop):null)); 
            			Query.q.columns   = (ColumnList) table_element_list2;
            		

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_create_table66); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "create_table"



    // $ANTLR start "insert_tuple"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:27:1: insert_tuple : INSERT INTO table_name VALUES integer_list ( CONDITION condition )? SEMICOLON ;
    public final void insert_tuple() throws RecognitionException {
        CreateTableParser.table_name_return table_name3 =null;

        List integer_list4 =null;

        String condition5 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:28:9: ( INSERT INTO table_name VALUES integer_list ( CONDITION condition )? SEMICOLON )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:28:11: INSERT INTO table_name VALUES integer_list ( CONDITION condition )? SEMICOLON
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert_tuple83); 

            match(input,INTO,FOLLOW_INTO_in_insert_tuple85); 

            pushFollow(FOLLOW_table_name_in_insert_tuple87);
            table_name3=table_name();

            state._fsp--;


            match(input,VALUES,FOLLOW_VALUES_in_insert_tuple89); 

            pushFollow(FOLLOW_integer_list_in_insert_tuple108);
            integer_list4=integer_list();

            state._fsp--;



            		        Query.q = new InsertIntoTable();
            			Query.q.setTableName((table_name3!=null?input.toString(table_name3.start,table_name3.stop):null)); 
            			Query.q.intList   = (QueryList) integer_list4;
            		

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:33:5: ( CONDITION condition )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONDITION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:34:8: CONDITION condition
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_insert_tuple121); 

                    pushFollow(FOLLOW_condition_in_insert_tuple123);
                    condition5=condition();

                    state._fsp--;



                    		        ((InsertIntoTable)Query.q).condition = condition5;
                    		     

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_insert_tuple137); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "insert_tuple"



    // $ANTLR start "condition"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:40:1: condition returns [String cond] : LEFT_PAREN condi= everything RIGHT_PAREN ;
    public final String condition() throws RecognitionException {
        String cond = null;


        CreateTableParser.everything_return condi =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:41:2: ( LEFT_PAREN condi= everything RIGHT_PAREN )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:41:4: LEFT_PAREN condi= everything RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_condition151); 

            pushFollow(FOLLOW_everything_in_condition155);
            condi=everything();

            state._fsp--;


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_condition158); 

            cond = String.valueOf((condi!=null?input.toString(condi.start,condi.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cond;
    }
    // $ANTLR end "condition"


    public static class table_name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "table_name"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:43:1: table_name : ( schema DOT )? table ;
    public final CreateTableParser.table_name_return table_name() throws RecognitionException {
        CreateTableParser.table_name_return retval = new CreateTableParser.table_name_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:44:2: ( ( schema DOT )? table )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:44:4: ( schema DOT )? table
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:44:4: ( schema DOT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOT) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:44:5: schema DOT
                    {
                    pushFollow(FOLLOW_schema_in_table_name172);
                    schema();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_table_name174); 

                    }
                    break;

            }


            pushFollow(FOLLOW_table_in_table_name178);
            table();

            state._fsp--;


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
    // $ANTLR end "table_name"



    // $ANTLR start "table_element_list"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:46:1: table_element_list returns [List cols] : LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN ;
    public final List table_element_list() throws RecognitionException {
        List cols = null;


        Column column =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:47:2: ( LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:47:4: LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN
            {
            cols = new ColumnList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_element_list194); 

            pushFollow(FOLLOW_column_name_in_table_element_list198);
            column=column_name();

            state._fsp--;


            cols.add(column);

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:47:89: ( COMMA column= column_name )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:47:90: COMMA column= column_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_element_list203); 

            	    pushFollow(FOLLOW_column_name_in_table_element_list207);
            	    column=column_name();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_element_list215); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "table_element_list"



    // $ANTLR start "select_element_list"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:49:1: select_element_list returns [List cols] :column= column_name ( COMMA column= column_name )* ;
    public final List select_element_list() throws RecognitionException {
        List cols = null;


        Column column =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:50:2: (column= column_name ( COMMA column= column_name )* )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:50:4: column= column_name ( COMMA column= column_name )*
            {
            cols = new ColumnList();

            pushFollow(FOLLOW_column_name_in_select_element_list233);
            column=column_name();

            state._fsp--;


            cols.add(column);

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:50:79: ( COMMA column= column_name )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:50:80: COMMA column= column_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_select_element_list239); 

            	    pushFollow(FOLLOW_column_name_in_select_element_list243);
            	    column=column_name();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "select_element_list"



    // $ANTLR start "table_element_list_with_quote"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:52:1: table_element_list_with_quote returns [List cols] : LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN ;
    public final List table_element_list_with_quote() throws RecognitionException {
        List cols = null;


        String column =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:53:9: ( LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:53:11: LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN
            {
            cols = new QueryList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_element_list_with_quote271); 

            pushFollow(FOLLOW_quoted_item_in_table_element_list_with_quote276);
            column=quoted_item();

            state._fsp--;


            cols.add(column);

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:53:97: ( COMMA column= quoted_item )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:53:98: COMMA column= quoted_item
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_element_list_with_quote282); 

            	    pushFollow(FOLLOW_quoted_item_in_table_element_list_with_quote287);
            	    column=quoted_item();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_element_list_with_quote295); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "table_element_list_with_quote"



    // $ANTLR start "integer_list"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:55:1: integer_list returns [List cols] : LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN ;
    public final List integer_list() throws RecognitionException {
        List cols = null;


        Token column=null;

        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:56:9: ( LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:56:11: LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN
            {
            cols = new QueryList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_integer_list326); 

            column=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_integer_list331); 

            cols.add(column.getText());

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:56:97: ( COMMA column= NUMBER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:56:98: COMMA column= NUMBER
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_integer_list337); 

            	    column=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_integer_list342); 

            	    cols.add(column.getText());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_integer_list350); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "integer_list"



    // $ANTLR start "column_name"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:58:1: column_name returns [Column name] : column_definition ;
    public final Column column_name() throws RecognitionException {
        Column name = null;


        Column column_definition6 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:59:2: ( column_definition )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:59:4: column_definition
            {
            pushFollow(FOLLOW_column_definition_in_column_name372);
            column_definition6=column_definition();

            state._fsp--;


            name = column_definition6; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "column_name"



    // $ANTLR start "column_definition"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:61:1: column_definition returns [Column col] : ( schema DOT )? sel= ( ID | ASTERIK ) ( columnalias )? ;
    public final Column column_definition() throws RecognitionException {
        Column col = null;


        Token sel=null;
        CreateTableParser.schema_return schema7 =null;

        CreateTableParser.columnalias_return columnalias8 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:2: ( ( schema DOT )? sel= ( ID | ASTERIK ) ( columnalias )? )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:4: ( schema DOT )? sel= ( ID | ASTERIK ) ( columnalias )?
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:4: ( schema DOT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOT) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:5: schema DOT
                    {
                    pushFollow(FOLLOW_schema_in_column_definition388);
                    schema7=schema();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_column_definition390); 

                    }
                    break;

            }


            sel=(Token)input.LT(1);

            if ( input.LA(1)==ASTERIK||input.LA(1)==ID ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:35: ( columnalias )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:36: columnalias
                    {
                    pushFollow(FOLLOW_columnalias_in_column_definition403);
                    columnalias8=columnalias();

                    state._fsp--;


                    }
                    break;

            }


             
            	     col = new Column();
            	     
            	     if ((schema7!=null?input.toString(schema7.start,schema7.stop):null) != null) {
            	         col.tableName = (schema7!=null?input.toString(schema7.start,schema7.stop):null).toUpperCase();
            	     }
            	     col.name = (sel!=null?sel.getText():null).toUpperCase();
            	     if ((columnalias8!=null?input.toString(columnalias8.start,columnalias8.stop):null) != null) {
            	        col.alias = (columnalias8!=null?input.toString(columnalias8.start,columnalias8.stop):null).toUpperCase();
            	     }
            	 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return col;
    }
    // $ANTLR end "column_definition"



    // $ANTLR start "quoted_item"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:74:1: quoted_item returns [String name] : QUOTE qtext= onlysinglequotes QUOTE ;
    public final String quoted_item() throws RecognitionException {
        String name = null;


        CreateTableParser.onlysinglequotes_return qtext =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:75:2: ( QUOTE qtext= onlysinglequotes QUOTE )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:75:5: QUOTE qtext= onlysinglequotes QUOTE
            {
            match(input,QUOTE,FOLLOW_QUOTE_in_quoted_item422); 

            pushFollow(FOLLOW_onlysinglequotes_in_quoted_item426);
            qtext=onlysinglequotes();

            state._fsp--;


            match(input,QUOTE,FOLLOW_QUOTE_in_quoted_item428); 

            name = "'" + String.valueOf((qtext!=null?input.toString(qtext.start,qtext.stop):null)).toUpperCase() + "'" ; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "quoted_item"



    // $ANTLR start "condition_text"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:78:1: condition_text : ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )* ;
    public final void condition_text() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:80:2: ( ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )* )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:80:4: ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )*
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:80:4: ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= EQUAL && LA10_0 <= EXCLAMATION)||LA10_0==ID||LA10_0==LEFT_PAREN||LA10_0==QUOTE||LA10_0==RIGHT_PAREN||LA10_0==VARIABLE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            	    {
            	    if ( (input.LA(1) >= EQUAL && input.LA(1) <= EXCLAMATION)||input.LA(1)==ID||input.LA(1)==LEFT_PAREN||input.LA(1)==QUOTE||input.LA(1)==RIGHT_PAREN||input.LA(1)==VARIABLE ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condition_text"



    // $ANTLR start "select"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:82:1: select : SELECT select_element_list from ( WHERE search_condition )? SEMICOLON ;
    public final void select() throws RecognitionException {
        List from9 =null;

        List select_element_list10 =null;

        String search_condition11 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:83:2: ( SELECT select_element_list from ( WHERE search_condition )? SEMICOLON )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:83:5: SELECT select_element_list from ( WHERE search_condition )? SEMICOLON
            {
            match(input,SELECT,FOLLOW_SELECT_in_select479); 

            pushFollow(FOLLOW_select_element_list_in_select481);
            select_element_list10=select_element_list();

            state._fsp--;


            pushFollow(FOLLOW_from_in_select483);
            from9=from();

            state._fsp--;



            	   Query.q = new Select();
            	   Query.q.tableNames = (ColumnList) from9;
            	   Query.q.columns = (ColumnList) select_element_list10;
            	   ((Select) Query.q ).generateShowList();
            	

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:89:2: ( WHERE search_condition )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==WHERE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:90:13: WHERE search_condition
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_select502); 

                    pushFollow(FOLLOW_search_condition_in_select504);
                    search_condition11=search_condition();

                    state._fsp--;



                    	     ((Select)Query.q).whereCondition = search_condition11.toUpperCase();
                    	    

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_select522); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select"


    public static class everything_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "everything"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:1: everything : ( RIGHT_PAREN | LEFT_PAREN | . )* ;
    public final CreateTableParser.everything_return everything() throws RecognitionException {
        CreateTableParser.everything_return retval = new CreateTableParser.everything_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:11: ( ( RIGHT_PAREN | LEFT_PAREN | . )* )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:13: ( RIGHT_PAREN | LEFT_PAREN | . )*
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:13: ( RIGHT_PAREN | LEFT_PAREN | . )*
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case RIGHT_PAREN:
                    {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1 >= A && LA12_1 <= 69)) ) {
                        alt12=1;
                    }


                    }
                    break;
                case SEMICOLON:
                    {
                    int LA12_2 = input.LA(2);

                    if ( ((LA12_2 >= A && LA12_2 <= 69)) ) {
                        alt12=3;
                    }


                    }
                    break;
                case LEFT_PAREN:
                    {
                    alt12=2;
                    }
                    break;
                case A:
                case AND:
                case ASTERIK:
                case B:
                case C:
                case CERTAIN:
                case COMMA:
                case CONDITION:
                case CREATE:
                case D:
                case DIGIT:
                case DOT:
                case E:
                case EQUAL:
                case EXCLAMATION:
                case F:
                case FALSE:
                case FROM:
                case G:
                case H:
                case I:
                case ID:
                case INNER:
                case INSERT:
                case INTO:
                case IS:
                case J:
                case JOIN:
                case K:
                case L:
                case LEFT_TRIANGLE:
                case M:
                case N:
                case NEWLINE:
                case NOT:
                case NOT_EQUAL:
                case NUMBER:
                case O:
                case ON:
                case OR:
                case P:
                case POSSIBLE:
                case Q:
                case QUOTE:
                case R:
                case RIGHT_TRIANGLE:
                case S:
                case SELECT:
                case T:
                case TABLE:
                case TRUE:
                case U:
                case UNKNOWN:
                case V:
                case VALUES:
                case VARIABLE:
                case W:
                case WHERE:
                case WS:
                case X:
                case Y:
                case Z:
                case 69:
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:14: RIGHT_PAREN
            	    {
            	    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_everything531); 

            	    }
            	    break;
            	case 2 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:28: LEFT_PAREN
            	    {
            	    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_everything535); 

            	    }
            	    break;
            	case 3 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:97:41: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "everything"



    // $ANTLR start "search_condition"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:99:1: search_condition returns [String text] : everything ;
    public final String search_condition() throws RecognitionException {
        String text = null;


        CreateTableParser.everything_return everything12 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:100:2: ( everything )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:100:4: everything
            {
            pushFollow(FOLLOW_everything_in_search_condition555);
            everything12=everything();

            state._fsp--;


             text = (everything12!=null?input.toString(everything12.start,everything12.stop):null);  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return text;
    }
    // $ANTLR end "search_condition"



    // $ANTLR start "from"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:102:1: from returns [List cols] : FROM select_element_list ;
    public final List from() throws RecognitionException {
        List cols = null;


        List select_element_list13 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:102:26: ( FROM select_element_list )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:103:5: FROM select_element_list
            {
            match(input,FROM,FOLLOW_FROM_in_from575); 

            pushFollow(FOLLOW_select_element_list_in_from577);
            select_element_list13=select_element_list();

            state._fsp--;



                   cols = (ColumnList) select_element_list13;
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "from"



    // $ANTLR start "is_functions"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:108:1: is_functions : IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON ;
    public final void is_functions() throws RecognitionException {
        Token type=null;
        List isFunctionBody14 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:109:2: ( IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:109:4: IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON
            {
            match(input,IS,FOLLOW_IS_in_is_functions591); 

            type=(Token)input.LT(1);

            if ( input.LA(1)==CERTAIN||input.LA(1)==POSSIBLE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_isFunctionBody_in_is_functions603);
            isFunctionBody14=isFunctionBody();

            state._fsp--;



            	             Query.q = new IsFunction();
            	             ((IsFunction)Query.q).type = (type!=null?type.getText():null);
            	             Query.q.columns = (ColumnList) isFunctionBody14;
            	             
            	        

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_is_functions636); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "is_functions"



    // $ANTLR start "isFunctionBody"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:118:1: isFunctionBody returns [List cols] : LEFT_PAREN tupple_element_list_with_quote COMMA quoted_item RIGHT_PAREN ;
    public final List isFunctionBody() throws RecognitionException {
        List cols = null;


        List tupple_element_list_with_quote15 =null;

        String quoted_item16 =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:119:2: ( LEFT_PAREN tupple_element_list_with_quote COMMA quoted_item RIGHT_PAREN )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:119:4: LEFT_PAREN tupple_element_list_with_quote COMMA quoted_item RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_isFunctionBody649); 

            pushFollow(FOLLOW_tupple_element_list_with_quote_in_isFunctionBody651);
            tupple_element_list_with_quote15=tupple_element_list_with_quote();

            state._fsp--;



            	     cols = tupple_element_list_with_quote15;
            	

            match(input,COMMA,FOLLOW_COMMA_in_isFunctionBody655); 

            pushFollow(FOLLOW_quoted_item_in_isFunctionBody657);
            quoted_item16=quoted_item();

            state._fsp--;



            	     cols.add(quoted_item16);
            	

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_isFunctionBody661); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "isFunctionBody"



    // $ANTLR start "tupple_element_list_with_quote"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:125:1: tupple_element_list_with_quote returns [List cols] : LEFT_TRIANGLE column= quoted_item ( COMMA column= quoted_item )* RIGHT_TRIANGLE ;
    public final List tupple_element_list_with_quote() throws RecognitionException {
        List cols = null;


        String column =null;


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:126:9: ( LEFT_TRIANGLE column= quoted_item ( COMMA column= quoted_item )* RIGHT_TRIANGLE )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:126:11: LEFT_TRIANGLE column= quoted_item ( COMMA column= quoted_item )* RIGHT_TRIANGLE
            {
            cols = new QueryList();

            match(input,LEFT_TRIANGLE,FOLLOW_LEFT_TRIANGLE_in_tupple_element_list_with_quote683); 

            pushFollow(FOLLOW_quoted_item_in_tupple_element_list_with_quote687);
            column=quoted_item();

            state._fsp--;


            cols.add(column);

            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:126:99: ( COMMA column= quoted_item )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:126:100: COMMA column= quoted_item
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupple_element_list_with_quote693); 

            	    pushFollow(FOLLOW_quoted_item_in_tupple_element_list_with_quote698);
            	    column=quoted_item();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,RIGHT_TRIANGLE,FOLLOW_RIGHT_TRIANGLE_in_tupple_element_list_with_quote706); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cols;
    }
    // $ANTLR end "tupple_element_list_with_quote"


    public static class schema_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "schema"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:128:1: schema : ID ;
    public final CreateTableParser.schema_return schema() throws RecognitionException {
        CreateTableParser.schema_return retval = new CreateTableParser.schema_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:128:8: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:128:10: ID
            {
            match(input,ID,FOLLOW_ID_in_schema723); 

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
    // $ANTLR end "schema"



    // $ANTLR start "table"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:129:1: table : ID ;
    public final void table() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:129:7: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:129:9: ID
            {
            match(input,ID,FOLLOW_ID_in_table730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "table"


    public static class onlysinglequotes_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "onlysinglequotes"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:1: onlysinglequotes : ( (~ ( '\\'' ) | ( '\\'\\'' ) )* ) ;
    public final CreateTableParser.onlysinglequotes_return onlysinglequotes() throws RecognitionException {
        CreateTableParser.onlysinglequotes_return retval = new CreateTableParser.onlysinglequotes_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:18: ( ( (~ ( '\\'' ) | ( '\\'\\'' ) )* ) )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:21: ( (~ ( '\\'' ) | ( '\\'\\'' ) )* )
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:21: ( (~ ( '\\'' ) | ( '\\'\\'' ) )* )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:22: (~ ( '\\'' ) | ( '\\'\\'' ) )*
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:22: (~ ( '\\'' ) | ( '\\'\\'' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= A && LA14_0 <= Q)||(LA14_0 >= R && LA14_0 <= 69)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            	    {
            	    if ( (input.LA(1) >= A && input.LA(1) <= Q)||(input.LA(1) >= R && input.LA(1) <= 69) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


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
    // $ANTLR end "onlysinglequotes"



    // $ANTLR start "anycondition"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:131:1: anycondition : ID ;
    public final void anycondition() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:131:18: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:131:20: ID
            {
            match(input,ID,FOLLOW_ID_in_anycondition764); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "anycondition"


    public static class columnalias_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "columnalias"
    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:132:1: columnalias : ID ;
    public final CreateTableParser.columnalias_return columnalias() throws RecognitionException {
        CreateTableParser.columnalias_return retval = new CreateTableParser.columnalias_return();
        retval.start = input.LT(1);


        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:132:15: ( ID )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:132:17: ID
            {
            match(input,ID,FOLLOW_ID_in_columnalias774); 

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
    // $ANTLR end "columnalias"

    // Delegated rules


 

    public static final BitSet FOLLOW_create_table_in_parse29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_tuple_in_parse33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_parse37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_functions_in_parse41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table52 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_table_name_in_create_table54 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_table_element_list_in_create_table59 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_create_table66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_tuple83 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INTO_in_insert_tuple85 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_table_name_in_insert_tuple87 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_tuple89 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_integer_list_in_insert_tuple108 = new BitSet(new long[]{0x0040000000000800L});
    public static final BitSet FOLLOW_CONDITION_in_insert_tuple121 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_condition_in_insert_tuple123 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_insert_tuple137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_condition151 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000003FL});
    public static final BitSet FOLLOW_everything_in_condition155 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_condition158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_in_table_name172 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_table_name174 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_table_in_table_name178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_table_element_list194 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_column_name_in_table_element_list198 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_COMMA_in_table_element_list203 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_column_name_in_table_element_list207 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_table_element_list215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_select_element_list233 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_select_element_list239 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_column_name_in_select_element_list243 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_table_element_list_with_quote271 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_table_element_list_with_quote276 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_COMMA_in_table_element_list_with_quote282 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_table_element_list_with_quote287 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_table_element_list_with_quote295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_integer_list326 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NUMBER_in_integer_list331 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_COMMA_in_integer_list337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NUMBER_in_integer_list342 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_integer_list350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_definition_in_column_name372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_in_column_definition388 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_column_definition390 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_set_in_column_definition396 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_columnalias_in_column_definition403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_quoted_item422 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000003FL});
    public static final BitSet FOLLOW_onlysinglequotes_in_quoted_item426 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_QUOTE_in_quoted_item428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select479 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_select_element_list_in_select481 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_from_in_select483 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHERE_in_select502 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000003FL});
    public static final BitSet FOLLOW_search_condition_in_select504 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_select522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_everything531 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003FL});
    public static final BitSet FOLLOW_LEFT_PAREN_in_everything535 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003FL});
    public static final BitSet FOLLOW_everything_in_search_condition555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from575 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_select_element_list_in_from577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_is_functions591 = new BitSet(new long[]{0x0000400000000200L});
    public static final BitSet FOLLOW_set_in_is_functions595 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_isFunctionBody_in_is_functions603 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_is_functions636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_isFunctionBody649 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_tupple_element_list_with_quote_in_isFunctionBody651 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_isFunctionBody655 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_isFunctionBody657 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_isFunctionBody661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TRIANGLE_in_tupple_element_list_with_quote683 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_tupple_element_list_with_quote687 = new BitSet(new long[]{0x0008000000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupple_element_list_with_quote693 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_tupple_element_list_with_quote698 = new BitSet(new long[]{0x0008000000000400L});
    public static final BitSet FOLLOW_RIGHT_TRIANGLE_in_tupple_element_list_with_quote706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_schema723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_anycondition764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_columnalias774 = new BitSet(new long[]{0x0000000000000002L});

}