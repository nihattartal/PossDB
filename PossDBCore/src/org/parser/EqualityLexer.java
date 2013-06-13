// $ANTLR 3.4 F:\\workspace\\PossDB\\Grammers\\Equality.g 2012-05-29 13:20:35

package org.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EqualityLexer extends Lexer {
    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int DOT=5;
    public static final int EQUAL=6;
    public static final int ID=7;
    public static final int NEWLINE=8;
    public static final int WS=9;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public EqualityLexer() {} 
    public EqualityLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EqualityLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "F:\\workspace\\PossDB\\Grammers\\Equality.g"; }

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:32:16: ( '0' .. '9' )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:33:5: ( '.' )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:33:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:10: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+ )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
            {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* )
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:39: ( ( DIGIT )* )
            	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:40: ( DIGIT )*
            	    {
            	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:34:40: ( DIGIT )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:35:10: ( ( '\\r' )? '\\n' )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:35:11: ( '\\r' )? '\\n'
            {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:35:11: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\Equality.g:35:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:36:10: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:36:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:36:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\workspace\\PossDB\\Grammers\\Equality.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


             _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:37:13: ( '=' )
            // F:\\workspace\\PossDB\\Grammers\\Equality.g:37:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    public void mTokens() throws RecognitionException {
        // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:8: ( DOT | ID | NEWLINE | WS | EQUAL )
        int alt5=5;
        switch ( input.LA(1) ) {
        case '.':
            {
            alt5=1;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=2;
            }
            break;
        case '\r':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='\n') ) {
                int LA5_4 = input.LA(3);

                if ( ((LA5_4 >= '\t' && LA5_4 <= '\n')||(LA5_4 >= '\f' && LA5_4 <= '\r')||LA5_4==' ') ) {
                    alt5=4;
                }
                else {
                    alt5=3;
                }
            }
            else {
                alt5=4;
            }
            }
            break;
        case '\n':
            {
            int LA5_4 = input.LA(2);

            if ( ((LA5_4 >= '\t' && LA5_4 <= '\n')||(LA5_4 >= '\f' && LA5_4 <= '\r')||LA5_4==' ') ) {
                alt5=4;
            }
            else {
                alt5=3;
            }
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt5=4;
            }
            break;
        case '=':
            {
            alt5=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:10: DOT
                {
                mDOT(); 


                }
                break;
            case 2 :
                // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:14: ID
                {
                mID(); 


                }
                break;
            case 3 :
                // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:17: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 4 :
                // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:25: WS
                {
                mWS(); 


                }
                break;
            case 5 :
                // F:\\workspace\\PossDB\\Grammers\\Equality.g:1:28: EQUAL
                {
                mEQUAL(); 


                }
                break;

        }

    }


 

}