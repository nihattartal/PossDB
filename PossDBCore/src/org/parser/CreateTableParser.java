// $ANTLR 3.4 G:\\workspace\\PossDB\\Grammers\\CreateTable.g 2013-03-24 17:28:14

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "AS", "ASTERIK", "B", "C", "CERTAIN", "COMMA", "CONDITION", "CREATE", "D", "DIGIT", "DOT", "E", "EQUAL", "EXCLAMATION", "F", "FALSE", "FROM", "G", "H", "I", "ID", "IN", "INNER", "INSERT", "INTO", "IS", "J", "JOIN", "K", "L", "LEFT_PAREN", "LEFT_TRIANGLE", "M", "N", "NEWLINE", "NOT", "NOT_EQUAL", "NUMBER", "O", "ON", "OR", "P", "POSSIBLE", "Q", "QUOTE", "R", "RIGHT_PAREN", "RIGHT_TRIANGLE", "S", "SELECT", "SEMICOLON", "T", "TABLE", "TRUE", "U", "UNKNOWN", "V", "VALUES", "VARIABLE", "W", "WHERE", "WS", "X", "Y", "Z", "'-'", "'\\'\\''"
    };

    public static final int EOF=-1;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int A=4;
    public static final int AND=5;
    public static final int AS=6;
    public static final int ASTERIK=7;
    public static final int B=8;
    public static final int C=9;
    public static final int CERTAIN=10;
    public static final int COMMA=11;
    public static final int CONDITION=12;
    public static final int CREATE=13;
    public static final int D=14;
    public static final int DIGIT=15;
    public static final int DOT=16;
    public static final int E=17;
    public static final int EQUAL=18;
    public static final int EXCLAMATION=19;
    public static final int F=20;
    public static final int FALSE=21;
    public static final int FROM=22;
    public static final int G=23;
    public static final int H=24;
    public static final int I=25;
    public static final int ID=26;
    public static final int IN=27;
    public static final int INNER=28;
    public static final int INSERT=29;
    public static final int INTO=30;
    public static final int IS=31;
    public static final int J=32;
    public static final int JOIN=33;
    public static final int K=34;
    public static final int L=35;
    public static final int LEFT_PAREN=36;
    public static final int LEFT_TRIANGLE=37;
    public static final int M=38;
    public static final int N=39;
    public static final int NEWLINE=40;
    public static final int NOT=41;
    public static final int NOT_EQUAL=42;
    public static final int NUMBER=43;
    public static final int O=44;
    public static final int ON=45;
    public static final int OR=46;
    public static final int P=47;
    public static final int POSSIBLE=48;
    public static final int Q=49;
    public static final int QUOTE=50;
    public static final int R=51;
    public static final int RIGHT_PAREN=52;
    public static final int RIGHT_TRIANGLE=53;
    public static final int S=54;
    public static final int SELECT=55;
    public static final int SEMICOLON=56;
    public static final int T=57;
    public static final int TABLE=58;
    public static final int TRUE=59;
    public static final int U=60;
    public static final int UNKNOWN=61;
    public static final int V=62;
    public static final int VALUES=63;
    public static final int VARIABLE=64;
    public static final int W=65;
    public static final int WHERE=66;
    public static final int WS=67;
    public static final int X=68;
    public static final int Y=69;
    public static final int Z=70;

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
    public String getGrammarFileName() { return "G:\\workspace\\PossDB\\Grammers\\CreateTable.g"; }



    // $ANTLR start "parse"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:15:1: parse : ( create_table | insert_tuple | select | is_functions );
    public final void parse() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:15:8: ( create_table | insert_tuple | select | is_functions )
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
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:4: create_table
                    {
                    pushFollow(FOLLOW_create_table_in_parse29);
                    create_table();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:19: insert_tuple
                    {
                    pushFollow(FOLLOW_insert_tuple_in_parse33);
                    insert_tuple();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:34: select
                    {
                    pushFollow(FOLLOW_select_in_parse37);
                    select();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:16:43: is_functions
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:18:1: create_table : CREATE TABLE table_name table_element_list SEMICOLON ;
    public final void create_table() throws RecognitionException {
        CreateTableParser.table_name_return table_name1 =null;

        List table_element_list2 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:19:2: ( CREATE TABLE table_name table_element_list SEMICOLON )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:19:4: CREATE TABLE table_name table_element_list SEMICOLON
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
            		        Column c = new Column();
            		        c.name = (table_name1!=null?input.toString(table_name1.start,table_name1.stop):null).toUpperCase();
            			Query.q.setTableName(c); 
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:29:1: insert_tuple : INSERT INTO table_name VALUES integer_list ( CONDITION LEFT_PAREN boolean_value_expression RIGHT_PAREN )? SEMICOLON ;
    public final void insert_tuple() throws RecognitionException {
        CreateTableParser.table_name_return table_name3 =null;

        List integer_list4 =null;

        CreateTableParser.boolean_value_expression_return boolean_value_expression5 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:30:9: ( INSERT INTO table_name VALUES integer_list ( CONDITION LEFT_PAREN boolean_value_expression RIGHT_PAREN )? SEMICOLON )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:30:11: INSERT INTO table_name VALUES integer_list ( CONDITION LEFT_PAREN boolean_value_expression RIGHT_PAREN )? SEMICOLON
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
            			Column c = new Column();
            		        c.name = (table_name3!=null?input.toString(table_name3.start,table_name3.stop):null).toUpperCase();
            			Query.q.setTableName(c); 
            			Query.q.intList   = (QueryList) integer_list4;
            		

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:37:5: ( CONDITION LEFT_PAREN boolean_value_expression RIGHT_PAREN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONDITION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:38:8: CONDITION LEFT_PAREN boolean_value_expression RIGHT_PAREN
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_insert_tuple121); 

                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_insert_tuple123); 

                    pushFollow(FOLLOW_boolean_value_expression_in_insert_tuple125);
                    boolean_value_expression5=boolean_value_expression();

                    state._fsp--;



                    		        ((InsertIntoTable)Query.q).condition = (boolean_value_expression5!=null?input.toString(boolean_value_expression5.start,boolean_value_expression5.stop):null).toUpperCase();
                    		     

                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_insert_tuple129); 

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_insert_tuple140); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:44:1: condition returns [String cond] : LEFT_PAREN onlysinglequotes RIGHT_PAREN ;
    public final String condition() throws RecognitionException {
        String cond = null;


        CreateTableParser.onlysinglequotes_return onlysinglequotes6 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:45:2: ( LEFT_PAREN onlysinglequotes RIGHT_PAREN )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:45:4: LEFT_PAREN onlysinglequotes RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_condition154); 

            pushFollow(FOLLOW_onlysinglequotes_in_condition157);
            onlysinglequotes6=onlysinglequotes();

            state._fsp--;


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_condition160); 

            cond = (onlysinglequotes6!=null?input.toString(onlysinglequotes6.start,onlysinglequotes6.stop):null); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:47:1: table_name : ( schema DOT )? table ;
    public final CreateTableParser.table_name_return table_name() throws RecognitionException {
        CreateTableParser.table_name_return retval = new CreateTableParser.table_name_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:48:2: ( ( schema DOT )? table )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:48:4: ( schema DOT )? table
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:48:4: ( schema DOT )?
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
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:48:5: schema DOT
                    {
                    pushFollow(FOLLOW_schema_in_table_name174);
                    schema();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_table_name176); 

                    }
                    break;

            }


            pushFollow(FOLLOW_table_in_table_name180);
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:50:1: table_element_list returns [List cols] : LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN ;
    public final List table_element_list() throws RecognitionException {
        List cols = null;


        Column column =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:51:2: ( LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:51:4: LEFT_PAREN column= column_name ( COMMA column= column_name )* RIGHT_PAREN
            {
            cols = new ColumnList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_element_list196); 

            pushFollow(FOLLOW_column_name_in_table_element_list200);
            column=column_name();

            state._fsp--;


            cols.add(column);

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:51:89: ( COMMA column= column_name )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:51:90: COMMA column= column_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_element_list205); 

            	    pushFollow(FOLLOW_column_name_in_table_element_list209);
            	    column=column_name();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_element_list217); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:53:1: select_element_list returns [List cols] :column= column_name ( COMMA column= column_name )* ;
    public final List select_element_list() throws RecognitionException {
        List cols = null;


        Column column =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:54:2: (column= column_name ( COMMA column= column_name )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:54:4: column= column_name ( COMMA column= column_name )*
            {
            cols = new ColumnList();

            pushFollow(FOLLOW_column_name_in_select_element_list235);
            column=column_name();

            state._fsp--;


            cols.add(column);

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:54:79: ( COMMA column= column_name )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:54:80: COMMA column= column_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_select_element_list241); 

            	    pushFollow(FOLLOW_column_name_in_select_element_list245);
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:56:1: table_element_list_with_quote returns [List cols] : LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN ;
    public final List table_element_list_with_quote() throws RecognitionException {
        List cols = null;


        String column =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:57:9: ( LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:57:11: LEFT_PAREN column= quoted_item ( COMMA column= quoted_item )* RIGHT_PAREN
            {
            cols = new QueryList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_table_element_list_with_quote273); 

            pushFollow(FOLLOW_quoted_item_in_table_element_list_with_quote278);
            column=quoted_item();

            state._fsp--;


            cols.add(column);

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:57:97: ( COMMA column= quoted_item )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:57:98: COMMA column= quoted_item
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_table_element_list_with_quote284); 

            	    pushFollow(FOLLOW_quoted_item_in_table_element_list_with_quote289);
            	    column=quoted_item();

            	    state._fsp--;


            	    cols.add(column);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_table_element_list_with_quote297); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:59:1: integer_list returns [List cols] : LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN ;
    public final List integer_list() throws RecognitionException {
        List cols = null;


        Token column=null;

        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:60:9: ( LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:60:11: LEFT_PAREN column= NUMBER ( COMMA column= NUMBER )* RIGHT_PAREN
            {
            cols = new QueryList();

            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_integer_list328); 

            column=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_integer_list333); 

            cols.add(column.getText());

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:60:97: ( COMMA column= NUMBER )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:60:98: COMMA column= NUMBER
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_integer_list339); 

            	    column=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_integer_list344); 

            	    cols.add(column.getText());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_integer_list352); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:62:1: column_name returns [Column name] : column_definition ;
    public final Column column_name() throws RecognitionException {
        Column name = null;


        Column column_definition7 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:63:2: ( column_definition )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:63:4: column_definition
            {
            pushFollow(FOLLOW_column_definition_in_column_name374);
            column_definition7=column_definition();

            state._fsp--;


            name = column_definition7; 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:65:1: column_definition returns [Column col] : ( schema DOT )? sel= ( ID | ASTERIK ) ( ( AS )? columnalias )? ;
    public final Column column_definition() throws RecognitionException {
        Column col = null;


        Token sel=null;
        CreateTableParser.schema_return schema8 =null;

        CreateTableParser.columnalias_return columnalias9 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:2: ( ( schema DOT )? sel= ( ID | ASTERIK ) ( ( AS )? columnalias )? )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:4: ( schema DOT )? sel= ( ID | ASTERIK ) ( ( AS )? columnalias )?
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:4: ( schema DOT )?
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
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:5: schema DOT
                    {
                    pushFollow(FOLLOW_schema_in_column_definition390);
                    schema8=schema();

                    state._fsp--;


                    match(input,DOT,FOLLOW_DOT_in_column_definition392); 

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


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:35: ( ( AS )? columnalias )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==AS||LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:36: ( AS )? columnalias
                    {
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:36: ( AS )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==AS) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:66:37: AS
                            {
                            match(input,AS,FOLLOW_AS_in_column_definition406); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_columnalias_in_column_definition410);
                    columnalias9=columnalias();

                    state._fsp--;


                    }
                    break;

            }


             
            	     col = new Column();
            	     
            	     if ((schema8!=null?input.toString(schema8.start,schema8.stop):null) != null) {
            	         col.tableName = (schema8!=null?input.toString(schema8.start,schema8.stop):null).toUpperCase();
            	     }
            	     col.name = (sel!=null?sel.getText():null).toUpperCase();
            	     if ((columnalias9!=null?input.toString(columnalias9.start,columnalias9.stop):null) != null) {
            	        col.alias = (columnalias9!=null?input.toString(columnalias9.start,columnalias9.stop):null).toUpperCase();
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:78:1: quoted_item returns [String name] : QUOTE qtext= onlysinglequotes QUOTE ;
    public final String quoted_item() throws RecognitionException {
        String name = null;


        CreateTableParser.onlysinglequotes_return qtext =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:79:2: ( QUOTE qtext= onlysinglequotes QUOTE )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:79:5: QUOTE qtext= onlysinglequotes QUOTE
            {
            match(input,QUOTE,FOLLOW_QUOTE_in_quoted_item429); 

            pushFollow(FOLLOW_onlysinglequotes_in_quoted_item433);
            qtext=onlysinglequotes();

            state._fsp--;


            match(input,QUOTE,FOLLOW_QUOTE_in_quoted_item435); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:82:1: condition_text : ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )* ;
    public final void condition_text() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:84:2: ( ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:84:4: ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )*
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:84:4: ( ID | VARIABLE | EQUAL | QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= EQUAL && LA11_0 <= EXCLAMATION)||LA11_0==ID||LA11_0==LEFT_PAREN||LA11_0==QUOTE||LA11_0==RIGHT_PAREN||LA11_0==VARIABLE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            	    break loop11;
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:86:1: select : SELECT select_element_list from ( jointables )* ( WHERE search_condition )? SEMICOLON ;
    public final void select() throws RecognitionException {
        List from10 =null;

        List select_element_list11 =null;

        Column jointables12 =null;

        String search_condition13 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:87:2: ( SELECT select_element_list from ( jointables )* ( WHERE search_condition )? SEMICOLON )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:87:5: SELECT select_element_list from ( jointables )* ( WHERE search_condition )? SEMICOLON
            {
            match(input,SELECT,FOLLOW_SELECT_in_select486); 

            pushFollow(FOLLOW_select_element_list_in_select488);
            select_element_list11=select_element_list();

            state._fsp--;


            pushFollow(FOLLOW_from_in_select490);
            from10=from();

            state._fsp--;



            	   Query.q = new Select();
            	   Query.q.tableNames = (ColumnList) from10;
            	   Query.q.columns = (ColumnList) select_element_list11;
            	   ((Select) Query.q ).generateShowList();
            	

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:94:2: ( jointables )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==INNER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:95:13: jointables
            	    {
            	    pushFollow(FOLLOW_jointables_in_select510);
            	    jointables12=jointables();

            	    state._fsp--;



            	                     Query.q.setTableName(jointables12);
            	                

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:100:2: ( WHERE search_condition )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WHERE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:101:13: WHERE search_condition
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_select533); 

                    pushFollow(FOLLOW_search_condition_in_select535);
                    search_condition13=search_condition();

                    state._fsp--;



                    	        ((Select)Query.q).whereCondition.add(search_condition13.toUpperCase());
                    	    

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_select551); 

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



    // $ANTLR start "select_in"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:108:1: select_in : SELECT select_element_list from ( jointables )* ( WHERE search_condition )? ;
    public final void select_in() throws RecognitionException {
        List from14 =null;

        List select_element_list15 =null;

        Column jointables16 =null;

        String search_condition17 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:109:2: ( SELECT select_element_list from ( jointables )* ( WHERE search_condition )? )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:109:5: SELECT select_element_list from ( jointables )* ( WHERE search_condition )?
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_in561); 

            pushFollow(FOLLOW_select_element_list_in_select_in563);
            select_element_list15=select_element_list();

            state._fsp--;


            pushFollow(FOLLOW_from_in_select_in565);
            from14=from();

            state._fsp--;



            	   ((IsFunction) Query.q).query = new Select();
            	   ((IsFunction) Query.q).query.tableNames = (ColumnList) from14;
            	   ((IsFunction) Query.q).query.columns = (ColumnList) select_element_list15;
            	   ((IsFunction) Query.q).query.generateShowList();
            	

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:116:2: ( jointables )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==INNER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:117:13: jointables
            	    {
            	    pushFollow(FOLLOW_jointables_in_select_in585);
            	    jointables16=jointables();

            	    state._fsp--;



            	                     ((IsFunction) Query.q).query.setTableName(jointables16);
            	                

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:122:2: ( WHERE search_condition )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WHERE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:123:13: WHERE search_condition
                    {
                    match(input,WHERE,FOLLOW_WHERE_in_select_in608); 

                    pushFollow(FOLLOW_search_condition_in_select_in610);
                    search_condition17=search_condition();

                    state._fsp--;



                    	        ((IsFunction) Query.q).query.whereCondition.add(search_condition17.toUpperCase());
                    	    

                    }
                    break;

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
        return ;
    }
    // $ANTLR end "select_in"


    public static class everything_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "everything"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:1: everything : ( RIGHT_PAREN | LEFT_PAREN | . )* ;
    public final CreateTableParser.everything_return everything() throws RecognitionException {
        CreateTableParser.everything_return retval = new CreateTableParser.everything_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:11: ( ( RIGHT_PAREN | LEFT_PAREN | . )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:13: ( RIGHT_PAREN | LEFT_PAREN | . )*
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:13: ( RIGHT_PAREN | LEFT_PAREN | . )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1 >= A && LA16_1 <= 72)) ) {
                        alt16=3;
                    }


                    }
                    break;
                case RIGHT_PAREN:
                    {
                    alt16=1;
                    }
                    break;
                case LEFT_PAREN:
                    {
                    alt16=2;
                    }
                    break;
                case A:
                case AND:
                case AS:
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
                case IN:
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
                case 71:
                case 72:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:14: RIGHT_PAREN
            	    {
            	    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_everything635); 

            	    }
            	    break;
            	case 2 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:28: LEFT_PAREN
            	    {
            	    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_everything639); 

            	    }
            	    break;
            	case 3 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:130:41: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:132:1: search_condition returns [String text] : everything ;
    public final String search_condition() throws RecognitionException {
        String text = null;


        CreateTableParser.everything_return everything18 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:133:2: ( everything )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:133:4: everything
            {
            pushFollow(FOLLOW_everything_in_search_condition659);
            everything18=everything();

            state._fsp--;


             text = (everything18!=null?input.toString(everything18.start,everything18.stop):null);  

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:135:1: from returns [List cols] : FROM select_element_list ;
    public final List from() throws RecognitionException {
        List cols = null;


        List select_element_list19 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:135:26: ( FROM select_element_list )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:136:5: FROM select_element_list
            {
            match(input,FROM,FOLLOW_FROM_in_from679); 

            pushFollow(FOLLOW_select_element_list_in_from681);
            select_element_list19=select_element_list();

            state._fsp--;



                   cols = (ColumnList) select_element_list19;
                

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



    // $ANTLR start "jointables"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:140:1: jointables returns [Column colum] : INNER JOIN column_definition ON boolean_value_expression ;
    public final Column jointables() throws RecognitionException {
        Column colum = null;


        Column column_definition20 =null;

        CreateTableParser.boolean_value_expression_return boolean_value_expression21 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:140:34: ( INNER JOIN column_definition ON boolean_value_expression )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:141:5: INNER JOIN column_definition ON boolean_value_expression
            {
            match(input,INNER,FOLLOW_INNER_in_jointables699); 

            match(input,JOIN,FOLLOW_JOIN_in_jointables701); 

            pushFollow(FOLLOW_column_definition_in_jointables703);
            column_definition20=column_definition();

            state._fsp--;



                colum = column_definition20;


            match(input,ON,FOLLOW_ON_in_jointables707); 

            pushFollow(FOLLOW_boolean_value_expression_in_jointables709);
            boolean_value_expression21=boolean_value_expression();

            state._fsp--;



            	        ((Select)Query.q).whereCondition.add((boolean_value_expression21!=null?input.toString(boolean_value_expression21.start,boolean_value_expression21.stop):null).toUpperCase());
            	    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return colum;
    }
    // $ANTLR end "jointables"


    public static class boolean_value_expression_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "boolean_value_expression"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:149:1: boolean_value_expression : ( ( LEFT_PAREN bool_val_exp RIGHT_PAREN ) ( OR boolean_value_expression )* ( AND boolean_value_expression )* | bool_val_exp );
    public final CreateTableParser.boolean_value_expression_return boolean_value_expression() throws RecognitionException {
        CreateTableParser.boolean_value_expression_return retval = new CreateTableParser.boolean_value_expression_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:2: ( ( LEFT_PAREN bool_val_exp RIGHT_PAREN ) ( OR boolean_value_expression )* ( AND boolean_value_expression )* | bool_val_exp )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:4: ( LEFT_PAREN bool_val_exp RIGHT_PAREN ) ( OR boolean_value_expression )* ( AND boolean_value_expression )*
                    {
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:4: ( LEFT_PAREN bool_val_exp RIGHT_PAREN )
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:5: LEFT_PAREN bool_val_exp RIGHT_PAREN
                    {
                    match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_boolean_value_expression724); 

                    pushFollow(FOLLOW_bool_val_exp_in_boolean_value_expression726);
                    bool_val_exp();

                    state._fsp--;


                    match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_boolean_value_expression728); 

                    }


                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:42: ( OR boolean_value_expression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==OR) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:44: OR boolean_value_expression
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_boolean_value_expression733); 

                    	    pushFollow(FOLLOW_boolean_value_expression_in_boolean_value_expression735);
                    	    boolean_value_expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:76: ( AND boolean_value_expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==AND) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:78: AND boolean_value_expression
                    	    {
                    	    match(input,AND,FOLLOW_AND_in_boolean_value_expression743); 

                    	    pushFollow(FOLLOW_boolean_value_expression_in_boolean_value_expression745);
                    	    boolean_value_expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:151:19: bool_val_exp
                    {
                    pushFollow(FOLLOW_bool_val_exp_in_boolean_value_expression770);
                    bool_val_exp();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "boolean_value_expression"



    // $ANTLR start "bool_val_exp"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:154:1: bool_val_exp : boolean_test ( OR boolean_test )* ( AND boolean_test )* ;
    public final void bool_val_exp() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:2: ( boolean_test ( OR boolean_test )* ( AND boolean_test )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:4: boolean_test ( OR boolean_test )* ( AND boolean_test )*
            {
            pushFollow(FOLLOW_boolean_test_in_bool_val_exp782);
            boolean_test();

            state._fsp--;


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:17: ( OR boolean_test )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:19: OR boolean_test
            	    {
            	    match(input,OR,FOLLOW_OR_in_bool_val_exp786); 

            	    pushFollow(FOLLOW_boolean_test_in_bool_val_exp788);
            	    boolean_test();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:38: ( AND boolean_test )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:40: AND boolean_test
            	    {
            	    match(input,AND,FOLLOW_AND_in_bool_val_exp795); 

            	    pushFollow(FOLLOW_boolean_test_in_bool_val_exp798);
            	    boolean_test();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "bool_val_exp"



    // $ANTLR start "boolean_test"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:157:1: boolean_test : ( parenthesized_boolean_value_expression | nonparenthesized_value_expression_primary );
    public final void boolean_test() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:158:9: ( parenthesized_boolean_value_expression | nonparenthesized_value_expression_primary )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LEFT_PAREN) ) {
                alt22=1;
            }
            else if ( (LA22_0==ASTERIK||LA22_0==ID||LA22_0==NUMBER||LA22_0==71) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:158:11: parenthesized_boolean_value_expression
                    {
                    pushFollow(FOLLOW_parenthesized_boolean_value_expression_in_boolean_test818);
                    parenthesized_boolean_value_expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:159:4: nonparenthesized_value_expression_primary
                    {
                    pushFollow(FOLLOW_nonparenthesized_value_expression_primary_in_boolean_test823);
                    nonparenthesized_value_expression_primary();

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
    // $ANTLR end "boolean_test"



    // $ANTLR start "parenthesized_boolean_value_expression"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:163:1: parenthesized_boolean_value_expression : LEFT_PAREN value_expression RIGHT_PAREN ;
    public final void parenthesized_boolean_value_expression() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:164:2: ( LEFT_PAREN value_expression RIGHT_PAREN )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:164:5: LEFT_PAREN value_expression RIGHT_PAREN
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_parenthesized_boolean_value_expression836); 

            pushFollow(FOLLOW_value_expression_in_parenthesized_boolean_value_expression838);
            value_expression();

            state._fsp--;


            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_parenthesized_boolean_value_expression840); 

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
    // $ANTLR end "parenthesized_boolean_value_expression"



    // $ANTLR start "nonparenthesized_value_expression_primary"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:166:1: nonparenthesized_value_expression_primary : value_expression ;
    public final void nonparenthesized_value_expression_primary() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:167:2: ( value_expression )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:167:4: value_expression
            {
            pushFollow(FOLLOW_value_expression_in_nonparenthesized_value_expression_primary850);
            value_expression();

            state._fsp--;


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
    // $ANTLR end "nonparenthesized_value_expression_primary"



    // $ANTLR start "value_expression"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:169:1: value_expression : ( col_col_eq | col_num_eq | num_col_eq | col_col_neq | col_num_neq | num_col_neq | num_num_eq | num_num_neq );
    public final void value_expression() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:170:2: ( col_col_eq | col_num_eq | num_col_eq | col_col_neq | col_num_neq | num_col_neq | num_num_eq | num_num_neq )
            int alt23=8;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:170:4: col_col_eq
                    {
                    pushFollow(FOLLOW_col_col_eq_in_value_expression860);
                    col_col_eq();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:171:10: col_num_eq
                    {
                    pushFollow(FOLLOW_col_num_eq_in_value_expression872);
                    col_num_eq();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:172:10: num_col_eq
                    {
                    pushFollow(FOLLOW_num_col_eq_in_value_expression884);
                    num_col_eq();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:173:10: col_col_neq
                    {
                    pushFollow(FOLLOW_col_col_neq_in_value_expression895);
                    col_col_neq();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:174:10: col_num_neq
                    {
                    pushFollow(FOLLOW_col_num_neq_in_value_expression907);
                    col_num_neq();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:175:10: num_col_neq
                    {
                    pushFollow(FOLLOW_num_col_neq_in_value_expression919);
                    num_col_neq();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:176:10: num_num_eq
                    {
                    pushFollow(FOLLOW_num_num_eq_in_value_expression930);
                    num_num_eq();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:177:10: num_num_neq
                    {
                    pushFollow(FOLLOW_num_num_neq_in_value_expression941);
                    num_num_neq();

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
    // $ANTLR end "value_expression"



    // $ANTLR start "col_col_eq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:179:1: col_col_eq : column_name EQUAL column_name ;
    public final void col_col_eq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:180:2: ( column_name EQUAL column_name )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:180:4: column_name EQUAL column_name
            {
            pushFollow(FOLLOW_column_name_in_col_col_eq951);
            column_name();

            state._fsp--;


            match(input,EQUAL,FOLLOW_EQUAL_in_col_col_eq953); 

            pushFollow(FOLLOW_column_name_in_col_col_eq955);
            column_name();

            state._fsp--;


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
    // $ANTLR end "col_col_eq"



    // $ANTLR start "col_num_eq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:182:1: col_num_eq : column_name EQUAL NUMBER ;
    public final void col_num_eq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:183:2: ( column_name EQUAL NUMBER )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:183:4: column_name EQUAL NUMBER
            {
            pushFollow(FOLLOW_column_name_in_col_num_eq967);
            column_name();

            state._fsp--;


            match(input,EQUAL,FOLLOW_EQUAL_in_col_num_eq969); 

            match(input,NUMBER,FOLLOW_NUMBER_in_col_num_eq971); 

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
    // $ANTLR end "col_num_eq"



    // $ANTLR start "num_col_eq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:185:1: num_col_eq : NUMBER EQUAL column_name ;
    public final void num_col_eq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:186:2: ( NUMBER EQUAL column_name )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:186:5: NUMBER EQUAL column_name
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_num_col_eq983); 

            match(input,EQUAL,FOLLOW_EQUAL_in_num_col_eq985); 

            pushFollow(FOLLOW_column_name_in_num_col_eq987);
            column_name();

            state._fsp--;


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
    // $ANTLR end "num_col_eq"



    // $ANTLR start "col_col_neq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:188:1: col_col_neq : column_name NOT_EQUAL column_name ;
    public final void col_col_neq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:189:2: ( column_name NOT_EQUAL column_name )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:189:4: column_name NOT_EQUAL column_name
            {
            pushFollow(FOLLOW_column_name_in_col_col_neq998);
            column_name();

            state._fsp--;


            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_col_col_neq1000); 

            pushFollow(FOLLOW_column_name_in_col_col_neq1002);
            column_name();

            state._fsp--;


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
    // $ANTLR end "col_col_neq"



    // $ANTLR start "col_num_neq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:191:1: col_num_neq : column_name NOT_EQUAL NUMBER ;
    public final void col_num_neq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:192:2: ( column_name NOT_EQUAL NUMBER )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:192:4: column_name NOT_EQUAL NUMBER
            {
            pushFollow(FOLLOW_column_name_in_col_num_neq1013);
            column_name();

            state._fsp--;


            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_col_num_neq1015); 

            match(input,NUMBER,FOLLOW_NUMBER_in_col_num_neq1017); 

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
    // $ANTLR end "col_num_neq"



    // $ANTLR start "num_col_neq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:194:1: num_col_neq : NUMBER NOT_EQUAL column_name ;
    public final void num_col_neq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:195:2: ( NUMBER NOT_EQUAL column_name )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:195:5: NUMBER NOT_EQUAL column_name
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_num_col_neq1028); 

            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_num_col_neq1030); 

            pushFollow(FOLLOW_column_name_in_num_col_neq1032);
            column_name();

            state._fsp--;


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
    // $ANTLR end "num_col_neq"



    // $ANTLR start "num_num_eq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:197:1: num_num_eq : ( '-' )* NUMBER EQUAL ( '-' )* NUMBER ;
    public final void num_num_eq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:2: ( ( '-' )* NUMBER EQUAL ( '-' )* NUMBER )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:4: ( '-' )* NUMBER EQUAL ( '-' )* NUMBER
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:4: ( '-' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==71) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:5: '-'
            	    {
            	    match(input,71,FOLLOW_71_in_num_num_eq1044); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match(input,NUMBER,FOLLOW_NUMBER_in_num_num_eq1048); 

            match(input,EQUAL,FOLLOW_EQUAL_in_num_num_eq1050); 

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:24: ( '-' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==71) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:25: '-'
            	    {
            	    match(input,71,FOLLOW_71_in_num_num_eq1053); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match(input,NUMBER,FOLLOW_NUMBER_in_num_num_eq1057); 

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
    // $ANTLR end "num_num_eq"



    // $ANTLR start "num_num_neq"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:200:1: num_num_neq : ( '-' )* NUMBER NOT_EQUAL ( '-' )* NUMBER ;
    public final void num_num_neq() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:2: ( ( '-' )* NUMBER NOT_EQUAL ( '-' )* NUMBER )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:4: ( '-' )* NUMBER NOT_EQUAL ( '-' )* NUMBER
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:4: ( '-' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==71) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:5: '-'
            	    {
            	    match(input,71,FOLLOW_71_in_num_num_neq1070); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match(input,NUMBER,FOLLOW_NUMBER_in_num_num_neq1074); 

            match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_num_num_neq1076); 

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:28: ( '-' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==71) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:29: '-'
            	    {
            	    match(input,71,FOLLOW_71_in_num_num_neq1079); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match(input,NUMBER,FOLLOW_NUMBER_in_num_num_neq1083); 

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
    // $ANTLR end "num_num_neq"



    // $ANTLR start "is_functions"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:203:1: is_functions : IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON ;
    public final void is_functions() throws RecognitionException {
        Token type=null;
        List isFunctionBody22 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:204:2: ( IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:204:4: IS type= ( POSSIBLE | CERTAIN ) isFunctionBody SEMICOLON
            {
            match(input,IS,FOLLOW_IS_in_is_functions1094); 

            type=(Token)input.LT(1);

            if ( input.LA(1)==CERTAIN||input.LA(1)==POSSIBLE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            Query.q = new IsFunction(); ((IsFunction)Query.q).type = (type!=null?type.getText():null);

            pushFollow(FOLLOW_isFunctionBody_in_is_functions1108);
            isFunctionBody22=isFunctionBody();

            state._fsp--;



            	             
            	             Query.q.isFunctionList = (ArrayList<Object>) isFunctionBody22;
            	             
            	        

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_is_functions1141); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:212:1: isFunctionBody returns [List cols] : LEFT_PAREN tupple_element_list_with_quote RIGHT_PAREN IN (tab= ID | select_in ) ;
    public final List isFunctionBody() throws RecognitionException {
        List cols = null;


        Token tab=null;
        List tupple_element_list_with_quote23 =null;


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:213:2: ( LEFT_PAREN tupple_element_list_with_quote RIGHT_PAREN IN (tab= ID | select_in ) )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:213:4: LEFT_PAREN tupple_element_list_with_quote RIGHT_PAREN IN (tab= ID | select_in )
            {
            match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_isFunctionBody1154); 

            pushFollow(FOLLOW_tupple_element_list_with_quote_in_isFunctionBody1156);
            tupple_element_list_with_quote23=tupple_element_list_with_quote();

            state._fsp--;



            	     cols = tupple_element_list_with_quote23;
            	

            match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_isFunctionBody1160); 

            match(input,IN,FOLLOW_IN_in_isFunctionBody1162); 

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:215:19: (tab= ID | select_in )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==SELECT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:215:20: tab= ID
                    {
                    tab=(Token)match(input,ID,FOLLOW_ID_in_isFunctionBody1167); 

                     ((IsFunction) Query.q).inTableName = (tab!=null?tab.getText():null);

                    }
                    break;
                case 2 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:215:80: select_in
                    {
                    pushFollow(FOLLOW_select_in_in_isFunctionBody1173);
                    select_in();

                    state._fsp--;


                    }
                    break;

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
        return cols;
    }
    // $ANTLR end "isFunctionBody"



    // $ANTLR start "tupple_element_list_with_quote"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:217:1: tupple_element_list_with_quote returns [List cols] :column= ID COMMA num= NUMBER ( COMMA column= ID )* ;
    public final List tupple_element_list_with_quote() throws RecognitionException {
        List cols = null;


        Token column=null;
        Token num=null;

        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:218:9: (column= ID COMMA num= NUMBER ( COMMA column= ID )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:218:11: column= ID COMMA num= NUMBER ( COMMA column= ID )*
            {
            cols = new ArrayList();

            column=(Token)match(input,ID,FOLLOW_ID_in_tupple_element_list_with_quote1198); 

            cols.add((column!=null?column.getText():null));

            match(input,COMMA,FOLLOW_COMMA_in_tupple_element_list_with_quote1202); 

            num=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_tupple_element_list_with_quote1206); 

            cols.add((num!=null?num.getText():null));

            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:218:116: ( COMMA column= ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:218:117: COMMA column= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupple_element_list_with_quote1211); 

            	    column=(Token)match(input,ID,FOLLOW_ID_in_tupple_element_list_with_quote1216); 

            	    cols.add((column!=null?column.getText():null));

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "tupple_element_list_with_quote"


    public static class schema_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "schema"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:1: schema : ID ;
    public final CreateTableParser.schema_return schema() throws RecognitionException {
        CreateTableParser.schema_return retval = new CreateTableParser.schema_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:8: ( ID )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:10: ID
            {
            match(input,ID,FOLLOW_ID_in_schema1238); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:1: table : ID ;
    public final void table() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:7: ( ID )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:9: ID
            {
            match(input,ID,FOLLOW_ID_in_table1245); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:1: onlysinglequotes : ( (~ ( '\\'' ) | ( '\\'\\'' ) )* ) ;
    public final CreateTableParser.onlysinglequotes_return onlysinglequotes() throws RecognitionException {
        CreateTableParser.onlysinglequotes_return retval = new CreateTableParser.onlysinglequotes_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:18: ( ( (~ ( '\\'' ) | ( '\\'\\'' ) )* ) )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:21: ( (~ ( '\\'' ) | ( '\\'\\'' ) )* )
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:21: ( (~ ( '\\'' ) | ( '\\'\\'' ) )* )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:22: (~ ( '\\'' ) | ( '\\'\\'' ) )*
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:223:22: (~ ( '\\'' ) | ( '\\'\\'' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RIGHT_PAREN) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1 >= A && LA30_1 <= 72)) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0 >= A && LA30_0 <= Q)||LA30_0==R||(LA30_0 >= RIGHT_TRIANGLE && LA30_0 <= 72)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            	    {
            	    if ( (input.LA(1) >= A && input.LA(1) <= Q)||(input.LA(1) >= R && input.LA(1) <= 72) ) {
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
            	    break loop30;
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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:225:1: anycondition : ID ;
    public final void anycondition() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:225:18: ( ID )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:225:20: ID
            {
            match(input,ID,FOLLOW_ID_in_anycondition1281); 

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
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:226:1: columnalias : ID ;
    public final CreateTableParser.columnalias_return columnalias() throws RecognitionException {
        CreateTableParser.columnalias_return retval = new CreateTableParser.columnalias_return();
        retval.start = input.LT(1);


        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:226:15: ( ID )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:226:17: ID
            {
            match(input,ID,FOLLOW_ID_in_columnalias1291); 

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



    // $ANTLR start "equal"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:228:1: equal : '=' ;
    public final void equal() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:228:7: ( '=' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:228:9: '='
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_equal1299); 

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
    // $ANTLR end "equal"



    // $ANTLR start "number"
    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:1: number : ( '-' )* ( DIGIT )+ ;
    public final void number() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:13: ( ( '-' )* ( DIGIT )+ )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:14: ( '-' )* ( DIGIT )+
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:14: ( '-' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==71) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:15: '-'
            	    {
            	    match(input,71,FOLLOW_71_in_number1311); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:21: ( DIGIT )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==DIGIT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:229:22: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_number1316); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "number"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA19_eotS =
        "\55\uffff";
    static final String DFA19_eofS =
        "\55\uffff";
    static final String DFA19_minS =
        "\2\7\2\uffff\2\6\1\22\1\53\1\7\1\32\1\22\4\7\1\22\10\5\1\53\3\5"+
        "\1\53\1\5\2\53\1\uffff\1\7\1\32\1\5\1\7\1\32\1\5\1\7\1\32\1\5\1"+
        "\7\1\32\1\5";
    static final String DFA19_maxS =
        "\2\107\2\uffff\3\52\1\107\2\32\1\52\2\53\2\107\1\52\10\64\1\107"+
        "\3\64\1\107\1\64\2\107\1\uffff\2\32\1\64\2\32\1\64\2\32\1\64\2\32"+
        "\1\64";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\1\34\uffff\1\1\14\uffff";
    static final String DFA19_specialS =
        "\55\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\22\uffff\1\2\11\uffff\1\1\6\uffff\1\2\33\uffff\1\2",
            "\1\5\22\uffff\1\4\11\uffff\1\3\6\uffff\1\6\33\uffff\1\7",
            "",
            "",
            "\1\11\11\uffff\1\10\1\uffff\1\13\7\uffff\1\12\17\uffff\1\14",
            "\1\11\13\uffff\1\13\7\uffff\1\12\17\uffff\1\14",
            "\1\15\27\uffff\1\16",
            "\1\17\33\uffff\1\7",
            "\1\5\22\uffff\1\5",
            "\1\12",
            "\1\13\27\uffff\1\14",
            "\1\22\22\uffff\1\21\20\uffff\1\20",
            "\1\25\22\uffff\1\24\20\uffff\1\23",
            "\1\27\22\uffff\1\26\20\uffff\1\31\33\uffff\1\30",
            "\1\33\22\uffff\1\32\20\uffff\1\35\33\uffff\1\34",
            "\1\36\27\uffff\1\37",
            "\1\3\50\uffff\1\3\5\uffff\1\40",
            "\1\40\1\42\11\uffff\1\41\11\uffff\1\43\23\uffff\1\40\5\uffff"+
            "\1\40",
            "\1\40\1\42\23\uffff\1\43\23\uffff\1\40\5\uffff\1\40",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\40\1\45\11\uffff\1\44\11\uffff\1\46\23\uffff\1\40\5\uffff"+
            "\1\40",
            "\1\40\1\45\23\uffff\1\46\23\uffff\1\40\5\uffff\1\40",
            "\1\40\1\50\11\uffff\1\47\11\uffff\1\51\23\uffff\1\40\5\uffff"+
            "\1\40",
            "\1\40\1\50\23\uffff\1\51\23\uffff\1\40\5\uffff\1\40",
            "\1\31\33\uffff\1\30",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\40\1\53\11\uffff\1\52\11\uffff\1\54\23\uffff\1\40\5\uffff"+
            "\1\40",
            "\1\40\1\53\23\uffff\1\54\23\uffff\1\40\5\uffff\1\40",
            "\1\35\33\uffff\1\34",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\31\33\uffff\1\30",
            "\1\35\33\uffff\1\34",
            "",
            "\1\22\22\uffff\1\22",
            "\1\43",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\25\22\uffff\1\25",
            "\1\46",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\27\22\uffff\1\27",
            "\1\51",
            "\1\40\50\uffff\1\40\5\uffff\1\40",
            "\1\33\22\uffff\1\33",
            "\1\54",
            "\1\40\50\uffff\1\40\5\uffff\1\40"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "149:1: boolean_value_expression : ( ( LEFT_PAREN bool_val_exp RIGHT_PAREN ) ( OR boolean_value_expression )* ( AND boolean_value_expression )* | bool_val_exp );";
        }
    }
    static final String DFA20_eotS =
        "\111\uffff";
    static final String DFA20_eofS =
        "\111\uffff";
    static final String DFA20_minS =
        "\1\5\1\uffff\2\7\2\6\1\22\1\53\2\6\1\22\1\53\1\7\1\32\1\22\4\7\1"+
        "\22\1\7\1\32\1\22\4\7\1\22\10\uffff\1\53\3\uffff\1\53\1\uffff\2"+
        "\53\10\5\1\53\3\5\1\53\1\5\2\53\1\uffff\1\7\1\32\1\5\1\7\1\32\1"+
        "\5\1\7\1\32\1\5\1\7\1\32\1\5";
    static final String DFA20_maxS =
        "\1\102\1\uffff\2\107\3\52\1\107\3\52\1\107\2\32\1\52\2\53\2\107"+
        "\1\52\2\32\1\52\2\53\2\107\1\52\10\uffff\1\107\3\uffff\1\107\1\uffff"+
        "\2\107\10\64\1\107\3\64\1\107\1\64\2\107\1\uffff\2\32\1\64\2\32"+
        "\1\64\2\32\1\64\2\32\1\64";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\32\uffff\10\1\1\uffff\3\1\1\uffff\1\1\22\uffff\1\1"+
        "\14\uffff";
    static final String DFA20_specialS =
        "\111\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\26\uffff\1\1\21\uffff\1\2\5\uffff\1\1\3\uffff\1\1\11\uffff"+
            "\1\1",
            "",
            "\1\5\22\uffff\1\4\11\uffff\1\3\6\uffff\1\6\33\uffff\1\7",
            "\1\11\22\uffff\1\10\11\uffff\1\1\6\uffff\1\12\33\uffff\1\13",
            "\1\15\11\uffff\1\14\1\uffff\1\17\7\uffff\1\16\17\uffff\1\20",
            "\1\15\13\uffff\1\17\7\uffff\1\16\17\uffff\1\20",
            "\1\21\27\uffff\1\22",
            "\1\23\33\uffff\1\7",
            "\1\25\11\uffff\1\24\1\uffff\1\27\7\uffff\1\26\17\uffff\1\30",
            "\1\25\13\uffff\1\27\7\uffff\1\26\17\uffff\1\30",
            "\1\31\27\uffff\1\32",
            "\1\33\33\uffff\1\13",
            "\1\5\22\uffff\1\5",
            "\1\16",
            "\1\17\27\uffff\1\20",
            "\1\36\22\uffff\1\35\20\uffff\1\34",
            "\1\41\22\uffff\1\40\20\uffff\1\37",
            "\1\43\22\uffff\1\42\20\uffff\1\45\33\uffff\1\44",
            "\1\47\22\uffff\1\46\20\uffff\1\51\33\uffff\1\50",
            "\1\52\27\uffff\1\53",
            "\1\11\22\uffff\1\11",
            "\1\26",
            "\1\27\27\uffff\1\30",
            "\1\56\22\uffff\1\55\20\uffff\1\54",
            "\1\61\22\uffff\1\60\20\uffff\1\57",
            "\1\63\22\uffff\1\62\20\uffff\1\65\33\uffff\1\64",
            "\1\67\22\uffff\1\66\20\uffff\1\71\33\uffff\1\70",
            "\1\72\27\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\33\uffff\1\44",
            "",
            "",
            "",
            "\1\51\33\uffff\1\50",
            "",
            "\1\45\33\uffff\1\44",
            "\1\51\33\uffff\1\50",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\76\11\uffff\1\75\11\uffff\1\77\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\76\23\uffff\1\77\23\uffff\1\1\5\uffff\1\74",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\101\11\uffff\1\100\11\uffff\1\102\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\101\23\uffff\1\102\23\uffff\1\1\5\uffff\1\74",
            "\1\1\1\104\11\uffff\1\103\11\uffff\1\105\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\104\23\uffff\1\105\23\uffff\1\1\5\uffff\1\74",
            "\1\65\33\uffff\1\64",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\107\11\uffff\1\106\11\uffff\1\110\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\107\23\uffff\1\110\23\uffff\1\1\5\uffff\1\74",
            "\1\71\33\uffff\1\70",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\65\33\uffff\1\64",
            "\1\71\33\uffff\1\70",
            "",
            "\1\56\22\uffff\1\56",
            "\1\77",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\61\22\uffff\1\61",
            "\1\102",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\63\22\uffff\1\63",
            "\1\105",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\67\22\uffff\1\67",
            "\1\110",
            "\1\1\50\uffff\1\1\5\uffff\1\74"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 155:17: ( OR boolean_test )*";
        }
    }
    static final String DFA21_eotS =
        "\111\uffff";
    static final String DFA21_eofS =
        "\111\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\2\7\2\6\1\22\1\53\2\6\1\22\1\53\1\7\1\32\1\22\4\7\1"+
        "\22\1\7\1\32\1\22\4\7\1\22\10\uffff\1\53\3\uffff\1\53\1\uffff\2"+
        "\53\10\5\1\53\3\5\1\53\1\5\2\53\1\uffff\1\7\1\32\1\5\1\7\1\32\1"+
        "\5\1\7\1\32\1\5\1\7\1\32\1\5";
    static final String DFA21_maxS =
        "\1\102\1\uffff\2\107\3\52\1\107\3\52\1\107\2\32\1\52\2\53\2\107"+
        "\1\52\2\32\1\52\2\53\2\107\1\52\10\uffff\1\107\3\uffff\1\107\1\uffff"+
        "\2\107\10\64\1\107\3\64\1\107\1\64\2\107\1\uffff\2\32\1\64\2\32"+
        "\1\64\2\32\1\64\2\32\1\64";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\32\uffff\10\1\1\uffff\3\1\1\uffff\1\1\22\uffff\1\1"+
        "\14\uffff";
    static final String DFA21_specialS =
        "\111\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\26\uffff\1\1\21\uffff\1\1\5\uffff\1\1\3\uffff\1\1\11\uffff"+
            "\1\1",
            "",
            "\1\5\22\uffff\1\4\11\uffff\1\3\6\uffff\1\6\33\uffff\1\7",
            "\1\11\22\uffff\1\10\11\uffff\1\1\6\uffff\1\12\33\uffff\1\13",
            "\1\15\11\uffff\1\14\1\uffff\1\17\7\uffff\1\16\17\uffff\1\20",
            "\1\15\13\uffff\1\17\7\uffff\1\16\17\uffff\1\20",
            "\1\21\27\uffff\1\22",
            "\1\23\33\uffff\1\7",
            "\1\25\11\uffff\1\24\1\uffff\1\27\7\uffff\1\26\17\uffff\1\30",
            "\1\25\13\uffff\1\27\7\uffff\1\26\17\uffff\1\30",
            "\1\31\27\uffff\1\32",
            "\1\33\33\uffff\1\13",
            "\1\5\22\uffff\1\5",
            "\1\16",
            "\1\17\27\uffff\1\20",
            "\1\36\22\uffff\1\35\20\uffff\1\34",
            "\1\41\22\uffff\1\40\20\uffff\1\37",
            "\1\43\22\uffff\1\42\20\uffff\1\45\33\uffff\1\44",
            "\1\47\22\uffff\1\46\20\uffff\1\51\33\uffff\1\50",
            "\1\52\27\uffff\1\53",
            "\1\11\22\uffff\1\11",
            "\1\26",
            "\1\27\27\uffff\1\30",
            "\1\56\22\uffff\1\55\20\uffff\1\54",
            "\1\61\22\uffff\1\60\20\uffff\1\57",
            "\1\63\22\uffff\1\62\20\uffff\1\65\33\uffff\1\64",
            "\1\67\22\uffff\1\66\20\uffff\1\71\33\uffff\1\70",
            "\1\72\27\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\33\uffff\1\44",
            "",
            "",
            "",
            "\1\51\33\uffff\1\50",
            "",
            "\1\45\33\uffff\1\44",
            "\1\51\33\uffff\1\50",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\76\11\uffff\1\75\11\uffff\1\77\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\76\23\uffff\1\77\23\uffff\1\1\5\uffff\1\74",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\101\11\uffff\1\100\11\uffff\1\102\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\101\23\uffff\1\102\23\uffff\1\1\5\uffff\1\74",
            "\1\1\1\104\11\uffff\1\103\11\uffff\1\105\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\104\23\uffff\1\105\23\uffff\1\1\5\uffff\1\74",
            "\1\65\33\uffff\1\64",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\1\1\107\11\uffff\1\106\11\uffff\1\110\23\uffff\1\1\5\uffff"+
            "\1\74",
            "\1\1\1\107\23\uffff\1\110\23\uffff\1\1\5\uffff\1\74",
            "\1\71\33\uffff\1\70",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\65\33\uffff\1\64",
            "\1\71\33\uffff\1\70",
            "",
            "\1\56\22\uffff\1\56",
            "\1\77",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\61\22\uffff\1\61",
            "\1\102",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\63\22\uffff\1\63",
            "\1\105",
            "\1\1\50\uffff\1\1\5\uffff\1\74",
            "\1\67\22\uffff\1\67",
            "\1\110",
            "\1\1\50\uffff\1\1\5\uffff\1\74"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 155:38: ( AND boolean_test )*";
        }
    }
    static final String DFA23_eotS =
        "\25\uffff";
    static final String DFA23_eofS =
        "\25\uffff";
    static final String DFA23_minS =
        "\1\7\2\6\1\22\1\53\1\7\1\32\1\22\4\7\1\22\10\uffff";
    static final String DFA23_maxS =
        "\1\107\3\52\1\107\2\32\1\52\2\53\2\107\1\52\10\uffff";
    static final String DFA23_acceptS =
        "\15\uffff\1\2\1\1\1\5\1\4\1\3\1\7\1\6\1\10";
    static final String DFA23_specialS =
        "\25\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\22\uffff\1\1\20\uffff\1\3\33\uffff\1\4",
            "\1\6\11\uffff\1\5\1\uffff\1\10\7\uffff\1\7\17\uffff\1\11",
            "\1\6\13\uffff\1\10\7\uffff\1\7\17\uffff\1\11",
            "\1\12\27\uffff\1\13",
            "\1\14\33\uffff\1\4",
            "\1\2\22\uffff\1\2",
            "\1\7",
            "\1\10\27\uffff\1\11",
            "\1\16\22\uffff\1\16\20\uffff\1\15",
            "\1\20\22\uffff\1\20\20\uffff\1\17",
            "\1\21\22\uffff\1\21\20\uffff\1\22\33\uffff\1\22",
            "\1\23\22\uffff\1\23\20\uffff\1\24\33\uffff\1\24",
            "\1\22\27\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "169:1: value_expression : ( col_col_eq | col_num_eq | num_col_eq | col_col_neq | col_num_neq | num_col_neq | num_num_eq | num_num_neq );";
        }
    }
 

    public static final BitSet FOLLOW_create_table_in_parse29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_tuple_in_parse33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_parse37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_is_functions_in_parse41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table52 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_table_name_in_create_table54 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_table_element_list_in_create_table59 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_create_table66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_tuple83 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INTO_in_insert_tuple85 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_table_name_in_insert_tuple87 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_tuple89 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_integer_list_in_insert_tuple108 = new BitSet(new long[]{0x0100000000001000L});
    public static final BitSet FOLLOW_CONDITION_in_insert_tuple121 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_insert_tuple123 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_value_expression_in_insert_tuple125 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_insert_tuple129 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_insert_tuple140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_condition154 = new BitSet(new long[]{0xFFFBFFFFFFFFFFF0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_onlysinglequotes_in_condition157 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_condition160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_in_table_name174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_table_name176 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_table_in_table_name180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_table_element_list196 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_table_element_list200 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_COMMA_in_table_element_list205 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_table_element_list209 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_table_element_list217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_select_element_list235 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_select_element_list241 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_select_element_list245 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_table_element_list_with_quote273 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_table_element_list_with_quote278 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_COMMA_in_table_element_list_with_quote284 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_quoted_item_in_table_element_list_with_quote289 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_table_element_list_with_quote297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_integer_list328 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUMBER_in_integer_list333 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_COMMA_in_integer_list339 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUMBER_in_integer_list344 = new BitSet(new long[]{0x0010000000000800L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_integer_list352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_definition_in_column_name374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_in_column_definition390 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_column_definition392 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_set_in_column_definition398 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_AS_in_column_definition406 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_columnalias_in_column_definition410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_quoted_item429 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_onlysinglequotes_in_quoted_item433 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_QUOTE_in_quoted_item435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select486 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_select_element_list_in_select488 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_from_in_select490 = new BitSet(new long[]{0x0100000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_jointables_in_select510 = new BitSet(new long[]{0x0100000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_select533 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_search_condition_in_select535 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_select551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_in561 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_select_element_list_in_select_in563 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_from_in_select_in565 = new BitSet(new long[]{0x0000000010000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_jointables_in_select_in585 = new BitSet(new long[]{0x0000000010000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_select_in608 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000001FFL});
    public static final BitSet FOLLOW_search_condition_in_select_in610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_everything635 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000000000001FFL});
    public static final BitSet FOLLOW_LEFT_PAREN_in_everything639 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000000000001FFL});
    public static final BitSet FOLLOW_everything_in_search_condition659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from679 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_select_element_list_in_from681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNER_in_jointables699 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_JOIN_in_jointables701 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_definition_in_jointables703 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ON_in_jointables707 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_value_expression_in_jointables709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_boolean_value_expression724 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_bool_val_exp_in_boolean_value_expression726 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_boolean_value_expression728 = new BitSet(new long[]{0x0000400000000022L});
    public static final BitSet FOLLOW_OR_in_boolean_value_expression733 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_value_expression_in_boolean_value_expression735 = new BitSet(new long[]{0x0000400000000022L});
    public static final BitSet FOLLOW_AND_in_boolean_value_expression743 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_value_expression_in_boolean_value_expression745 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_bool_val_exp_in_boolean_value_expression770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_test_in_bool_val_exp782 = new BitSet(new long[]{0x0000400000000022L});
    public static final BitSet FOLLOW_OR_in_bool_val_exp786 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_test_in_bool_val_exp788 = new BitSet(new long[]{0x0000400000000022L});
    public static final BitSet FOLLOW_AND_in_bool_val_exp795 = new BitSet(new long[]{0x0000081004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_boolean_test_in_bool_val_exp798 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_parenthesized_boolean_value_expression_in_boolean_test818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonparenthesized_value_expression_primary_in_boolean_test823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_parenthesized_boolean_value_expression836 = new BitSet(new long[]{0x0000080004000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_value_expression_in_parenthesized_boolean_value_expression838 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_parenthesized_boolean_value_expression840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_nonparenthesized_value_expression_primary850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_col_eq_in_value_expression860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_num_eq_in_value_expression872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_col_eq_in_value_expression884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_col_neq_in_value_expression895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_num_neq_in_value_expression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_col_neq_in_value_expression919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_num_eq_in_value_expression930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_num_neq_in_value_expression941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_col_col_eq951 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_col_col_eq953 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_col_col_eq955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_col_num_eq967 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_col_num_eq969 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUMBER_in_col_num_eq971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_num_col_eq983 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_num_col_eq985 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_num_col_eq987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_col_col_neq998 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_col_col_neq1000 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_col_col_neq1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_col_num_neq1013 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_col_num_neq1015 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUMBER_in_col_num_neq1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_num_col_neq1028 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_num_col_neq1030 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_column_name_in_num_col_neq1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_num_num_eq1044 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_num_num_eq1048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_num_num_eq1050 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_num_num_eq1053 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_num_num_eq1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_num_num_neq1070 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_num_num_neq1074 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_num_num_neq1076 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_num_num_neq1079 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_num_num_neq1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_is_functions1094 = new BitSet(new long[]{0x0001000000000400L});
    public static final BitSet FOLLOW_set_in_is_functions1098 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_isFunctionBody_in_is_functions1108 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_is_functions1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_isFunctionBody1154 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_tupple_element_list_with_quote_in_isFunctionBody1156 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_isFunctionBody1160 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IN_in_isFunctionBody1162 = new BitSet(new long[]{0x0080000004000000L});
    public static final BitSet FOLLOW_ID_in_isFunctionBody1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_in_isFunctionBody1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tupple_element_list_with_quote1198 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_tupple_element_list_with_quote1202 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUMBER_in_tupple_element_list_with_quote1206 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_tupple_element_list_with_quote1211 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_tupple_element_list_with_quote1216 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ID_in_schema1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_anycondition1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_columnalias1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_equal1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_number1311 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DIGIT_in_number1316 = new BitSet(new long[]{0x0000000000008002L});

}