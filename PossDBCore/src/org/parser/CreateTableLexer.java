// $ANTLR 3.4 G:\\workspace\\PossDB\\Grammers\\CreateTable.g 2013-03-24 17:28:14

package org.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CreateTableLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CreateTableLexer() {} 
    public CreateTableLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreateTableLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "G:\\workspace\\PossDB\\Grammers\\CreateTable.g"; }

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:6:7: ( '-' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:7:7: ( '\\'\\'' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:7:9: '\\'\\''
            {
            match("''"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:234:12: ( 'A' | 'a' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:235:12: ( 'B' | 'b' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:236:12: ( 'C' | 'c' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:237:12: ( 'D' | 'd' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:238:12: ( 'E' | 'e' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:239:12: ( 'F' | 'f' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:240:12: ( 'G' | 'g' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
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
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:241:12: ( 'H' | 'h' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:242:11: ( 'I' | 'i' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:243:11: ( 'J' | 'j' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:244:11: ( 'K' | 'k' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
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
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:245:11: ( 'L' | 'l' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:246:11: ( 'M' | 'm' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:247:11: ( 'N' | 'n' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:248:11: ( 'O' | 'o' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:249:11: ( 'P' | 'p' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:250:11: ( 'Q' | 'q' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
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
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:251:11: ( 'R' | 'r' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:252:11: ( 'S' | 's' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:253:11: ( 'T' | 't' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:254:11: ( 'U' | 'u' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:255:11: ( 'V' | 'v' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:256:11: ( 'W' | 'w' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
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
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:257:11: ( 'X' | 'x' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:258:11: ( 'Y' | 'y' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:259:11: ( 'Z' | 'z' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
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
    // $ANTLR end "Z"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:260:16: ( '0' .. '9' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:279:11: ( I N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:279:15: I N
            {
            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:280:11: ( C R E A T E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:280:15: C R E A T E
            {
            mC(); 


            mR(); 


            mE(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:281:11: ( F R O M )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:281:15: F R O M
            {
            mF(); 


            mR(); 


            mO(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:282:11: ( I N N E R )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:282:15: I N N E R
            {
            mI(); 


            mN(); 


            mN(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:283:11: ( I N S E R T )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:283:15: I N S E R T
            {
            mI(); 


            mN(); 


            mS(); 


            mE(); 


            mR(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:284:11: ( I N T O )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:284:15: I N T O
            {
            mI(); 


            mN(); 


            mT(); 


            mO(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:285:11: ( J O I N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:285:15: J O I N
            {
            mJ(); 


            mO(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:286:11: ( S E L E C T )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:286:15: S E L E C T
            {
            mS(); 


            mE(); 


            mL(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:287:11: ( T A B L E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:287:15: T A B L E
            {
            mT(); 


            mA(); 


            mB(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:288:11: ( V A L U E S )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:288:15: V A L U E S
            {
            mV(); 


            mA(); 


            mL(); 


            mU(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "CONDITION"
    public final void mCONDITION() throws RecognitionException {
        try {
            int _type = CONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:289:11: ( C O N D I T I O N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:289:15: C O N D I T I O N
            {
            mC(); 


            mO(); 


            mN(); 


            mD(); 


            mI(); 


            mT(); 


            mI(); 


            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONDITION"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:290:11: ( W H E R E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:290:15: W H E R E
            {
            mW(); 


            mH(); 


            mE(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:291:11: ( A N D )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:291:15: A N D
            {
            mA(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:292:11: ( O R )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:292:15: O R
            {
            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:293:11: ( N O T )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:293:15: N O T
            {
            mN(); 


            mO(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:294:9: ( T R U E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:294:13: T R U E
            {
            mT(); 


            mR(); 


            mU(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:295:10: ( F A L S E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:295:14: F A L S E
            {
            mF(); 


            mA(); 


            mL(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "UNKNOWN"
    public final void mUNKNOWN() throws RecognitionException {
        try {
            int _type = UNKNOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:296:11: ( U N K N O W N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:296:15: U N K N O W N
            {
            mU(); 


            mN(); 


            mK(); 


            mN(); 


            mO(); 


            mW(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNKNOWN"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:297:11: ( I S )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:297:15: I S
            {
            mI(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "POSSIBLE"
    public final void mPOSSIBLE() throws RecognitionException {
        try {
            int _type = POSSIBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:298:11: ( P O S S I B L E )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:298:15: P O S S I B L E
            {
            mP(); 


            mO(); 


            mS(); 


            mS(); 


            mI(); 


            mB(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSSIBLE"

    // $ANTLR start "CERTAIN"
    public final void mCERTAIN() throws RecognitionException {
        try {
            int _type = CERTAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:299:11: ( C E R T A I N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:299:15: C E R T A I N
            {
            mC(); 


            mE(); 


            mR(); 


            mT(); 


            mA(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CERTAIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:300:7: ( O N )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:300:11: O N
            {
            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:301:11: ( A S )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:301:15: A S
            {
            mA(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASTERIK"
    public final void mASTERIK() throws RecognitionException {
        try {
            int _type = ASTERIK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:303:11: ( '*' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:303:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERIK"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:304:12: ( '\\'' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:304:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:305:13: ( '(' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:305:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "LEFT_TRIANGLE"
    public final void mLEFT_TRIANGLE() throws RecognitionException {
        try {
            int _type = LEFT_TRIANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:306:15: ( '<' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:306:17: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_TRIANGLE"

    // $ANTLR start "RIGHT_TRIANGLE"
    public final void mRIGHT_TRIANGLE() throws RecognitionException {
        try {
            int _type = RIGHT_TRIANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:307:16: ( '>' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:307:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_TRIANGLE"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:308:13: ( ')' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:308:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:309:13: ( ',' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:309:15: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:310:13: ( ';' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:310:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:311:9: ( '.' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:311:11: '.'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:312:13: ( '=' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:312:15: '='
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

    // $ANTLR start "EXCLAMATION"
    public final void mEXCLAMATION() throws RecognitionException {
        try {
            int _type = EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:313:13: ( '!' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:313:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLAMATION"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:314:13: ( '!=' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:314:15: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:316:13: ( ( DIGIT )+ )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:316:14: ( DIGIT )+
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:316:14: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:10: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+ )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* )
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:39: ( ( DIGIT )* )
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:40: ( DIGIT )*
            	    {
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:318:40: ( DIGIT )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:10: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+ )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='#'||LA5_0=='='||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:12: ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* )
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='='||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:51: ( ( DIGIT )* )
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:52: ( DIGIT )*
            	    {
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:319:52: ( DIGIT )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:320:10: ( ( '\\r' )? '\\n' )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:320:11: ( '\\r' )? '\\n'
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:320:11: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:320:11: '\\r'
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
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:321:10: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:321:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:321:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    public void mTokens() throws RecognitionException {
        // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:8: ( T__71 | T__72 | IN | CREATE | FROM | INNER | INSERT | INTO | JOIN | SELECT | TABLE | VALUES | CONDITION | WHERE | AND | OR | NOT | TRUE | FALSE | UNKNOWN | IS | POSSIBLE | CERTAIN | ON | AS | ASTERIK | QUOTE | LEFT_PAREN | LEFT_TRIANGLE | RIGHT_TRIANGLE | RIGHT_PAREN | COMMA | SEMICOLON | DOT | EQUAL | EXCLAMATION | NOT_EQUAL | NUMBER | ID | VARIABLE | NEWLINE | WS )
        int alt8=42;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:10: T__71
                {
                mT__71(); 


                }
                break;
            case 2 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:16: T__72
                {
                mT__72(); 


                }
                break;
            case 3 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:22: IN
                {
                mIN(); 


                }
                break;
            case 4 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:25: CREATE
                {
                mCREATE(); 


                }
                break;
            case 5 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:32: FROM
                {
                mFROM(); 


                }
                break;
            case 6 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:37: INNER
                {
                mINNER(); 


                }
                break;
            case 7 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:43: INSERT
                {
                mINSERT(); 


                }
                break;
            case 8 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:50: INTO
                {
                mINTO(); 


                }
                break;
            case 9 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:55: JOIN
                {
                mJOIN(); 


                }
                break;
            case 10 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:60: SELECT
                {
                mSELECT(); 


                }
                break;
            case 11 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:67: TABLE
                {
                mTABLE(); 


                }
                break;
            case 12 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:73: VALUES
                {
                mVALUES(); 


                }
                break;
            case 13 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:80: CONDITION
                {
                mCONDITION(); 


                }
                break;
            case 14 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:90: WHERE
                {
                mWHERE(); 


                }
                break;
            case 15 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:96: AND
                {
                mAND(); 


                }
                break;
            case 16 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:100: OR
                {
                mOR(); 


                }
                break;
            case 17 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:103: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:107: TRUE
                {
                mTRUE(); 


                }
                break;
            case 19 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:112: FALSE
                {
                mFALSE(); 


                }
                break;
            case 20 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:118: UNKNOWN
                {
                mUNKNOWN(); 


                }
                break;
            case 21 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:126: IS
                {
                mIS(); 


                }
                break;
            case 22 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:129: POSSIBLE
                {
                mPOSSIBLE(); 


                }
                break;
            case 23 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:138: CERTAIN
                {
                mCERTAIN(); 


                }
                break;
            case 24 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:146: ON
                {
                mON(); 


                }
                break;
            case 25 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:149: AS
                {
                mAS(); 


                }
                break;
            case 26 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:152: ASTERIK
                {
                mASTERIK(); 


                }
                break;
            case 27 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:160: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 28 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:166: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 29 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:177: LEFT_TRIANGLE
                {
                mLEFT_TRIANGLE(); 


                }
                break;
            case 30 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:191: RIGHT_TRIANGLE
                {
                mRIGHT_TRIANGLE(); 


                }
                break;
            case 31 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:206: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 32 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:218: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 33 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:224: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 34 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:234: DOT
                {
                mDOT(); 


                }
                break;
            case 35 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:238: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 36 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:244: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 37 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:256: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 38 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:266: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 39 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:273: ID
                {
                mID(); 


                }
                break;
            case 40 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:276: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 41 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:285: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 42 :
                // G:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:293: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\2\uffff\1\41\15\42\10\uffff\1\70\1\72\1\uffff\1\42\1\uffff\1\37"+
        "\1\73\4\uffff\1\74\1\100\15\42\1\115\1\116\1\117\3\42\5\uffff\3"+
        "\42\1\uffff\13\42\1\141\3\uffff\1\142\4\42\1\147\3\42\1\153\1\42"+
        "\1\155\2\42\1\160\2\42\2\uffff\2\42\1\165\1\42\1\uffff\3\42\1\uffff"+
        "\1\172\1\uffff\1\42\1\174\1\uffff\1\42\1\176\2\42\1\uffff\1\u0081"+
        "\1\u0082\2\42\1\uffff\1\u0085\1\uffff\1\u0086\1\uffff\2\42\2\uffff"+
        "\1\42\1\u008a\2\uffff\1\u008b\2\42\2\uffff\1\u008e\1\u008f\2\uffff";
    static final String DFA8_eofS =
        "\u0090\uffff";
    static final String DFA8_minS =
        "\1\11\1\uffff\1\47\15\43\10\uffff\1\43\1\75\1\uffff\1\43\1\uffff"+
        "\1\12\1\11\4\uffff\25\43\5\uffff\3\43\1\uffff\14\43\3\uffff\21\43"+
        "\2\uffff\4\43\1\uffff\3\43\1\uffff\1\43\1\uffff\2\43\1\uffff\4\43"+
        "\1\uffff\4\43\1\uffff\1\43\1\uffff\1\43\1\uffff\2\43\2\uffff\2\43"+
        "\2\uffff\3\43\2\uffff\2\43\2\uffff";
    static final String DFA8_maxS =
        "\1\172\1\uffff\1\47\15\172\10\uffff\1\172\1\75\1\uffff\1\172\1\uffff"+
        "\1\12\1\40\4\uffff\25\172\5\uffff\3\172\1\uffff\14\172\3\uffff\21"+
        "\172\2\uffff\4\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\4\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2"+
        "\uffff\2\172\2\uffff\3\172\2\uffff\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\16\uffff\1\32\1\34\1\35\1\36\1\37\1\40\1\41\1\42\2"+
        "\uffff\1\46\1\uffff\1\50\2\uffff\1\52\1\2\1\33\1\47\25\uffff\1\43"+
        "\1\45\1\44\1\51\1\3\3\uffff\1\25\14\uffff\1\31\1\20\1\30\21\uffff"+
        "\1\17\1\21\4\uffff\1\10\3\uffff\1\5\1\uffff\1\11\2\uffff\1\22\4"+
        "\uffff\1\6\4\uffff\1\23\1\uffff\1\13\1\uffff\1\16\2\uffff\1\7\1"+
        "\4\2\uffff\1\12\1\14\3\uffff\1\27\1\24\2\uffff\1\26\1\15";
    static final String DFA8_specialS =
        "\u0090\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\37\1\36\1\uffff\1\37\1\35\22\uffff\1\37\1\31\1\uffff\1\34"+
            "\3\uffff\1\2\1\21\1\24\1\20\1\uffff\1\25\1\1\1\27\1\uffff\12"+
            "\32\1\uffff\1\26\1\22\1\30\1\23\2\uffff\1\13\1\33\1\4\2\33\1"+
            "\5\2\33\1\3\1\6\3\33\1\15\1\14\1\17\2\33\1\7\1\10\1\16\1\11"+
            "\1\12\3\33\4\uffff\1\33\1\uffff\1\13\1\33\1\4\2\33\1\5\2\33"+
            "\1\3\1\6\3\33\1\15\1\14\1\17\2\33\1\7\1\10\1\16\1\11\1\12\3"+
            "\33",
            "",
            "\1\40",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\43\4\33\1"+
            "\44\7\33\4\uffff\1\33\1\uffff\15\33\1\43\4\33\1\44\7\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\50\11\33\1"+
            "\47\2\33\1\46\10\33\4\uffff\1\33\1\uffff\4\33\1\50\11\33\1\47"+
            "\2\33\1\46\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\52\20\33\1\51\10"+
            "\33\4\uffff\1\33\1\uffff\1\52\20\33\1\51\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\53\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\53\13\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\54\25\33\4"+
            "\uffff\1\33\1\uffff\4\33\1\54\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\55\20\33\1\56\10"+
            "\33\4\uffff\1\33\1\uffff\1\55\20\33\1\56\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\57\31\33\4\uffff"+
            "\1\33\1\uffff\1\57\31\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\7\33\1\60\22\33\4"+
            "\uffff\1\33\1\uffff\7\33\1\60\22\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\61\4\33\1"+
            "\62\7\33\4\uffff\1\33\1\uffff\15\33\1\61\4\33\1\62\7\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\64\3\33\1"+
            "\63\10\33\4\uffff\1\33\1\uffff\15\33\1\64\3\33\1\63\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\65\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\65\13\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\66\14\33"+
            "\4\uffff\1\33\1\uffff\15\33\1\66\14\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\67\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\67\13\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\14\uffff\12\34\3\uffff\1\34\3\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\1\71",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\36",
            "\2\37\1\uffff\2\37\22\uffff\1\37",
            "",
            "",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\75\4\33\1"+
            "\76\1\77\6\33\4\uffff\1\33\1\uffff\15\33\1\75\4\33\1\76\1\77"+
            "\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\101\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\101\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\102\14\33"+
            "\4\uffff\1\33\1\uffff\15\33\1\102\14\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\21\33\1\103\10\33"+
            "\4\uffff\1\33\1\uffff\21\33\1\103\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\104\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\104\13\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\13\33\1\105\16\33"+
            "\4\uffff\1\33\1\uffff\13\33\1\105\16\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\10\33\1\106\21\33"+
            "\4\uffff\1\33\1\uffff\10\33\1\106\21\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\13\33\1\107\16\33"+
            "\4\uffff\1\33\1\uffff\13\33\1\107\16\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\33\1\110\30\33"+
            "\4\uffff\1\33\1\uffff\1\33\1\110\30\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\24\33\1\111\5\33"+
            "\4\uffff\1\33\1\uffff\24\33\1\111\5\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\13\33\1\112\16\33"+
            "\4\uffff\1\33\1\uffff\13\33\1\112\16\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\113\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\113\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\3\33\1\114\26\33"+
            "\4\uffff\1\33\1\uffff\3\33\1\114\26\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\120\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\120\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\12\33\1\121\17\33"+
            "\4\uffff\1\33\1\uffff\12\33\1\121\17\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\22\33\1\122\7\33"+
            "\4\uffff\1\33\1\uffff\22\33\1\122\7\33",
            "",
            "",
            "",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\123\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\123\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\124\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\124\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\125\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\125\13\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\126\31\33\4\uffff"+
            "\1\33\1\uffff\1\126\31\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\3\33\1\127\26\33"+
            "\4\uffff\1\33\1\uffff\3\33\1\127\26\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\130\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\130\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\14\33\1\131\15\33"+
            "\4\uffff\1\33\1\uffff\14\33\1\131\15\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\22\33\1\132\7\33"+
            "\4\uffff\1\33\1\uffff\22\33\1\132\7\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\133\14\33"+
            "\4\uffff\1\33\1\uffff\15\33\1\133\14\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\134\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\134\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\13\33\1\135\16\33"+
            "\4\uffff\1\33\1\uffff\13\33\1\135\16\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\136\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\136\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\24\33\1\137\5\33"+
            "\4\uffff\1\33\1\uffff\24\33\1\137\5\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\21\33\1\140\10\33"+
            "\4\uffff\1\33\1\uffff\21\33\1\140\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\143\14\33"+
            "\4\uffff\1\33\1\uffff\15\33\1\143\14\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\22\33\1\144\7\33"+
            "\4\uffff\1\33\1\uffff\22\33\1\144\7\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\21\33\1\145\10\33"+
            "\4\uffff\1\33\1\uffff\21\33\1\145\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\21\33\1\146\10\33"+
            "\4\uffff\1\33\1\uffff\21\33\1\146\10\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\150\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\150\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\10\33\1\151\21\33"+
            "\4\uffff\1\33\1\uffff\10\33\1\151\21\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\152\31\33\4\uffff"+
            "\1\33\1\uffff\1\152\31\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\154\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\154\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\2\33\1\156\27\33"+
            "\4\uffff\1\33\1\uffff\2\33\1\156\27\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\157\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\157\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\161\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\161\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\162\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\162\25\33",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\163\13\33"+
            "\4\uffff\1\33\1\uffff\16\33\1\163\13\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\10\33\1\164\21\33"+
            "\4\uffff\1\33\1\uffff\10\33\1\164\21\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\166\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\166\6\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\167\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\167\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\170\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\170\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\10\33\1\171\21\33"+
            "\4\uffff\1\33\1\uffff\10\33\1\171\21\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\23\33\1\173\6\33"+
            "\4\uffff\1\33\1\uffff\23\33\1\173\6\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\22\33\1\175\7\33"+
            "\4\uffff\1\33\1\uffff\22\33\1\175\7\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\26\33\1\177\3\33"+
            "\4\uffff\1\33\1\uffff\26\33\1\177\3\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\1\33\1\u0080\30\33"+
            "\4\uffff\1\33\1\uffff\1\33\1\u0080\30\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\10\33\1\u0083\21"+
            "\33\4\uffff\1\33\1\uffff\10\33\1\u0083\21\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\u0084\14"+
            "\33\4\uffff\1\33\1\uffff\15\33\1\u0084\14\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\u0087\14"+
            "\33\4\uffff\1\33\1\uffff\15\33\1\u0087\14\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\13\33\1\u0088\16"+
            "\33\4\uffff\1\33\1\uffff\13\33\1\u0088\16\33",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\16\33\1\u0089\13"+
            "\33\4\uffff\1\33\1\uffff\16\33\1\u0089\13\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\4\33\1\u008c\25\33"+
            "\4\uffff\1\33\1\uffff\4\33\1\u008c\25\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\15\33\1\u008d\14"+
            "\33\4\uffff\1\33\1\uffff\15\33\1\u008d\14\33",
            "",
            "",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\34\14\uffff\12\45\3\uffff\1\34\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__71 | T__72 | IN | CREATE | FROM | INNER | INSERT | INTO | JOIN | SELECT | TABLE | VALUES | CONDITION | WHERE | AND | OR | NOT | TRUE | FALSE | UNKNOWN | IS | POSSIBLE | CERTAIN | ON | AS | ASTERIK | QUOTE | LEFT_PAREN | LEFT_TRIANGLE | RIGHT_TRIANGLE | RIGHT_PAREN | COMMA | SEMICOLON | DOT | EQUAL | EXCLAMATION | NOT_EQUAL | NUMBER | ID | VARIABLE | NEWLINE | WS );";
        }
    }
 

}