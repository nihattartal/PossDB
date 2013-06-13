// $ANTLR 3.4 F:\\workspace\\PossDB\\Grammers\\CreateTable.g 2012-11-22 14:10:34

package org.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CreateTableLexer extends Lexer {
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
    public String getGrammarFileName() { return "F:\\workspace\\PossDB\\Grammers\\CreateTable.g"; }

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:6:7: ( '\\'\\'' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:6:9: '\\'\\''
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
    // $ANTLR end "T__69"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:137:12: ( 'A' | 'a' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:138:12: ( 'B' | 'b' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:139:12: ( 'C' | 'c' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:140:12: ( 'D' | 'd' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:141:12: ( 'E' | 'e' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:142:12: ( 'F' | 'f' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:143:12: ( 'G' | 'g' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:144:12: ( 'H' | 'h' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:145:11: ( 'I' | 'i' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:146:11: ( 'J' | 'j' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:147:11: ( 'K' | 'k' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:148:11: ( 'L' | 'l' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:149:11: ( 'M' | 'm' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:150:11: ( 'N' | 'n' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:151:11: ( 'O' | 'o' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:152:11: ( 'P' | 'p' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:153:11: ( 'Q' | 'q' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:154:11: ( 'R' | 'r' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:155:11: ( 'S' | 's' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:156:11: ( 'T' | 't' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:157:11: ( 'U' | 'u' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:158:11: ( 'V' | 'v' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:159:11: ( 'W' | 'w' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:160:11: ( 'X' | 'x' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:161:11: ( 'Y' | 'y' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:162:11: ( 'Z' | 'z' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:163:16: ( '0' .. '9' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:182:11: ( C R E A T E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:182:15: C R E A T E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:183:11: ( F R O M )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:183:15: F R O M
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:184:11: ( I N N E R )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:184:15: I N N E R
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:185:11: ( I N S E R T )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:185:15: I N S E R T
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:186:11: ( I N T O )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:186:15: I N T O
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:187:11: ( J O I N )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:187:15: J O I N
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:188:11: ( S E L E C T )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:188:15: S E L E C T
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:189:11: ( T A B L E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:189:15: T A B L E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:190:11: ( V A L U E S )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:190:15: V A L U E S
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:191:11: ( C O N D I T I O N )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:191:15: C O N D I T I O N
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:192:11: ( W H E R E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:192:15: W H E R E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:193:11: ( A N D )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:193:15: A N D
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:194:11: ( O R )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:194:15: O R
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:195:11: ( N O T )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:195:15: N O T
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:196:9: ( T R U E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:196:13: T R U E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:197:10: ( F A L S E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:197:14: F A L S E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:11: ( U N K N O W N )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:198:15: U N K N O W N
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:199:11: ( I S )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:199:15: I S
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:200:11: ( P O S S I B L E )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:200:15: P O S S I B L E
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:11: ( C E R T A I N )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:201:15: C E R T A I N
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:202:7: ( O N )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:202:11: O N
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

    // $ANTLR start "ASTERIK"
    public final void mASTERIK() throws RecognitionException {
        try {
            int _type = ASTERIK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:204:11: ( '*' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:204:15: '*'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:205:12: ( '\\'' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:205:14: '\\''
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:206:13: ( '(' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:206:15: '('
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:207:15: ( '<' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:207:17: '<'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:208:16: ( '>' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:208:18: '>'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:209:13: ( ')' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:209:15: ')'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:210:13: ( ',' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:210:15: ','
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:211:13: ( ';' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:211:15: ';'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:212:9: ( '.' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:212:11: '.'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:213:13: ( '=' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:213:15: '='
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:214:13: ( '!' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:214:15: '!'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:215:13: ( '!=' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:215:15: '!='
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:217:13: ( ( DIGIT )+ )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:217:14: ( DIGIT )+
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:217:14: ( DIGIT )+
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
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:10: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+ )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* ) )+
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
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( DIGIT )* )
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:39: ( ( DIGIT )* )
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:40: ( DIGIT )*
            	    {
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:219:40: ( DIGIT )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:10: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+ )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* ) )+
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
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:12: ( 'a' .. 'z' | 'A' .. 'Z' | '#' | '_' | '=' ) ( ( DIGIT )* )
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='='||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:51: ( ( DIGIT )* )
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:52: ( DIGIT )*
            	    {
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:220:52: ( DIGIT )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:10: ( ( '\\r' )? '\\n' )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:11: ( '\\r' )? '\\n'
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:11: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:221:11: '\\r'
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
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:222:10: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:222:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:222:12: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:
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
        // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:8: ( T__69 | CREATE | FROM | INNER | INSERT | INTO | JOIN | SELECT | TABLE | VALUES | CONDITION | WHERE | AND | OR | NOT | TRUE | FALSE | UNKNOWN | IS | POSSIBLE | CERTAIN | ON | ASTERIK | QUOTE | LEFT_PAREN | LEFT_TRIANGLE | RIGHT_TRIANGLE | RIGHT_PAREN | COMMA | SEMICOLON | DOT | EQUAL | EXCLAMATION | NOT_EQUAL | NUMBER | ID | VARIABLE | NEWLINE | WS )
        int alt8=39;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:10: T__69
                {
                mT__69(); 


                }
                break;
            case 2 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:16: CREATE
                {
                mCREATE(); 


                }
                break;
            case 3 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:23: FROM
                {
                mFROM(); 


                }
                break;
            case 4 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:28: INNER
                {
                mINNER(); 


                }
                break;
            case 5 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:34: INSERT
                {
                mINSERT(); 


                }
                break;
            case 6 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:41: INTO
                {
                mINTO(); 


                }
                break;
            case 7 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:46: JOIN
                {
                mJOIN(); 


                }
                break;
            case 8 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:51: SELECT
                {
                mSELECT(); 


                }
                break;
            case 9 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:58: TABLE
                {
                mTABLE(); 


                }
                break;
            case 10 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:64: VALUES
                {
                mVALUES(); 


                }
                break;
            case 11 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:71: CONDITION
                {
                mCONDITION(); 


                }
                break;
            case 12 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:81: WHERE
                {
                mWHERE(); 


                }
                break;
            case 13 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:87: AND
                {
                mAND(); 


                }
                break;
            case 14 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:91: OR
                {
                mOR(); 


                }
                break;
            case 15 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:94: NOT
                {
                mNOT(); 


                }
                break;
            case 16 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:98: TRUE
                {
                mTRUE(); 


                }
                break;
            case 17 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:103: FALSE
                {
                mFALSE(); 


                }
                break;
            case 18 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:109: UNKNOWN
                {
                mUNKNOWN(); 


                }
                break;
            case 19 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:117: IS
                {
                mIS(); 


                }
                break;
            case 20 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:120: POSSIBLE
                {
                mPOSSIBLE(); 


                }
                break;
            case 21 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:129: CERTAIN
                {
                mCERTAIN(); 


                }
                break;
            case 22 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:137: ON
                {
                mON(); 


                }
                break;
            case 23 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:140: ASTERIK
                {
                mASTERIK(); 


                }
                break;
            case 24 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:148: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 25 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:154: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 26 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:165: LEFT_TRIANGLE
                {
                mLEFT_TRIANGLE(); 


                }
                break;
            case 27 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:179: RIGHT_TRIANGLE
                {
                mRIGHT_TRIANGLE(); 


                }
                break;
            case 28 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:194: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 29 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:206: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 30 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:212: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 31 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:222: DOT
                {
                mDOT(); 


                }
                break;
            case 32 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:226: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 33 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:232: EXCLAMATION
                {
                mEXCLAMATION(); 


                }
                break;
            case 34 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:244: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 35 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:254: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 36 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:261: ID
                {
                mID(); 


                }
                break;
            case 37 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:264: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 38 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:273: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 39 :
                // F:\\workspace\\PossDB\\Grammers\\CreateTable.g:1:281: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\40\15\41\10\uffff\1\66\1\70\1\uffff\1\41\1\uffff\1\36"+
        "\1\71\4\uffff\7\41\1\102\7\41\1\112\1\113\3\41\4\uffff\10\41\1\uffff"+
        "\6\41\1\135\2\uffff\1\136\5\41\1\144\3\41\1\150\1\151\2\41\1\154"+
        "\2\41\2\uffff\5\41\1\uffff\1\164\1\165\1\41\2\uffff\1\41\1\170\1"+
        "\uffff\1\41\1\172\2\41\1\175\2\41\2\uffff\1\u0080\1\u0081\1\uffff"+
        "\1\u0082\1\uffff\2\41\1\uffff\1\41\1\u0086\3\uffff\1\u0087\2\41"+
        "\2\uffff\1\u008a\1\u008b\2\uffff";
    static final String DFA8_eofS =
        "\u008c\uffff";
    static final String DFA8_minS =
        "\1\11\1\47\15\43\10\uffff\1\43\1\75\1\uffff\1\43\1\uffff\1\12\1"+
        "\11\4\uffff\24\43\4\uffff\10\43\1\uffff\7\43\2\uffff\21\43\2\uffff"+
        "\5\43\1\uffff\3\43\2\uffff\2\43\1\uffff\7\43\2\uffff\2\43\1\uffff"+
        "\1\43\1\uffff\2\43\1\uffff\2\43\3\uffff\3\43\2\uffff\2\43\2\uffff";
    static final String DFA8_maxS =
        "\1\172\1\47\15\172\10\uffff\1\172\1\75\1\uffff\1\172\1\uffff\1\12"+
        "\1\40\4\uffff\24\172\4\uffff\10\172\1\uffff\7\172\2\uffff\21\172"+
        "\2\uffff\5\172\1\uffff\3\172\2\uffff\2\172\1\uffff\7\172\2\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\3\uffff\3\172\2"+
        "\uffff\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\17\uffff\1\27\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff\1\43\1"+
        "\uffff\1\45\2\uffff\1\47\1\1\1\30\1\44\24\uffff\1\40\1\42\1\41\1"+
        "\46\10\uffff\1\23\7\uffff\1\16\1\26\21\uffff\1\15\1\17\5\uffff\1"+
        "\3\3\uffff\1\6\1\7\2\uffff\1\20\7\uffff\1\21\1\4\2\uffff\1\11\1"+
        "\uffff\1\14\2\uffff\1\2\2\uffff\1\5\1\10\1\12\3\uffff\1\25\1\22"+
        "\2\uffff\1\24\1\13";
    static final String DFA8_specialS =
        "\u008c\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\36\1\35\1\uffff\1\36\1\34\22\uffff\1\36\1\30\1\uffff\1\33"+
            "\3\uffff\1\1\1\20\1\23\1\17\1\uffff\1\24\1\uffff\1\26\1\uffff"+
            "\12\31\1\uffff\1\25\1\21\1\27\1\22\2\uffff\1\12\1\32\1\2\2\32"+
            "\1\3\2\32\1\4\1\5\3\32\1\14\1\13\1\16\2\32\1\6\1\7\1\15\1\10"+
            "\1\11\3\32\4\uffff\1\32\1\uffff\1\12\1\32\1\2\2\32\1\3\2\32"+
            "\1\4\1\5\3\32\1\14\1\13\1\16\2\32\1\6\1\7\1\15\1\10\1\11\3\32",
            "\1\37",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\44\11\32\1"+
            "\43\2\32\1\42\10\32\4\uffff\1\32\1\uffff\4\32\1\44\11\32\1\43"+
            "\2\32\1\42\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\47\20\32\1\46\10"+
            "\32\4\uffff\1\32\1\uffff\1\47\20\32\1\46\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\50\4\32\1"+
            "\51\7\32\4\uffff\1\32\1\uffff\15\32\1\50\4\32\1\51\7\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\52\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\52\13\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\53\25\32\4"+
            "\uffff\1\32\1\uffff\4\32\1\53\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\54\20\32\1\55\10"+
            "\32\4\uffff\1\32\1\uffff\1\54\20\32\1\55\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\56\31\32\4\uffff"+
            "\1\32\1\uffff\1\56\31\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\7\32\1\57\22\32\4"+
            "\uffff\1\32\1\uffff\7\32\1\57\22\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\60\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\60\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\62\3\32\1"+
            "\61\10\32\4\uffff\1\32\1\uffff\15\32\1\62\3\32\1\61\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\63\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\63\13\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\64\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\64\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\65\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\65\13\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\14\uffff\12\33\3\uffff\1\33\3\uffff\32\33\4\uffff\1\33"+
            "\1\uffff\32\33",
            "\1\67",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\35",
            "\2\36\1\uffff\2\36\22\uffff\1\36",
            "",
            "",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\72\25\32\4"+
            "\uffff\1\32\1\uffff\4\32\1\72\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\73\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\73\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\21\32\1\74\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\74\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\75\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\75\13\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\13\32\1\76\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\76\16\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\77\4\32\1"+
            "\100\1\101\6\32\4\uffff\1\32\1\uffff\15\32\1\77\4\32\1\100\1"+
            "\101\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\10\32\1\103\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\103\21\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\13\32\1\104\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\104\16\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\32\1\105\30\32"+
            "\4\uffff\1\32\1\uffff\1\32\1\105\30\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\24\32\1\106\5\32"+
            "\4\uffff\1\32\1\uffff\24\32\1\106\5\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\13\32\1\107\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\107\16\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\110\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\110\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\3\32\1\111\26\32"+
            "\4\uffff\1\32\1\uffff\3\32\1\111\26\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\114\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\114\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\12\32\1\115\17\32"+
            "\4\uffff\1\32\1\uffff\12\32\1\115\17\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\22\32\1\116\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\116\7\32",
            "",
            "",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\117\31\32\4\uffff"+
            "\1\32\1\uffff\1\117\31\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\3\32\1\120\26\32"+
            "\4\uffff\1\32\1\uffff\3\32\1\120\26\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\121\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\121\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\14\32\1\122\15\32"+
            "\4\uffff\1\32\1\uffff\14\32\1\122\15\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\22\32\1\123\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\123\7\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\124\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\124\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\125\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\125\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\126\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\126\13\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\127\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\127\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\130\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\130\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\13\32\1\131\16\32"+
            "\4\uffff\1\32\1\uffff\13\32\1\131\16\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\132\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\132\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\24\32\1\133\5\32"+
            "\4\uffff\1\32\1\uffff\24\32\1\133\5\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\21\32\1\134\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\134\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\137\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\137\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\22\32\1\140\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\140\7\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\141\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\141\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\10\32\1\142\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\142\21\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\143\31\32\4\uffff"+
            "\1\32\1\uffff\1\143\31\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\145\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\145\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\21\32\1\146\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\146\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\21\32\1\147\10\32"+
            "\4\uffff\1\32\1\uffff\21\32\1\147\10\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\2\32\1\152\27\32"+
            "\4\uffff\1\32\1\uffff\2\32\1\152\27\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\153\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\153\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\155\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\155\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\156\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\156\25\32",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\157\13\32"+
            "\4\uffff\1\32\1\uffff\16\32\1\157\13\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\10\32\1\160\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\160\21\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\161\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\161\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\162\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\162\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\10\32\1\163\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\163\21\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\166\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\166\6\32",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\23\32\1\167\6\32"+
            "\4\uffff\1\32\1\uffff\23\32\1\167\6\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\22\32\1\171\7\32"+
            "\4\uffff\1\32\1\uffff\22\32\1\171\7\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\26\32\1\173\3\32"+
            "\4\uffff\1\32\1\uffff\26\32\1\173\3\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\1\32\1\174\30\32"+
            "\4\uffff\1\32\1\uffff\1\32\1\174\30\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\10\32\1\176\21\32"+
            "\4\uffff\1\32\1\uffff\10\32\1\176\21\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\177\14\32"+
            "\4\uffff\1\32\1\uffff\15\32\1\177\14\32",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\u0083\14"+
            "\32\4\uffff\1\32\1\uffff\15\32\1\u0083\14\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\13\32\1\u0084\16"+
            "\32\4\uffff\1\32\1\uffff\13\32\1\u0084\16\32",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\16\32\1\u0085\13"+
            "\32\4\uffff\1\32\1\uffff\16\32\1\u0085\13\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\4\32\1\u0088\25\32"+
            "\4\uffff\1\32\1\uffff\4\32\1\u0088\25\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\15\32\1\u0089\14"+
            "\32\4\uffff\1\32\1\uffff\15\32\1\u0089\14\32",
            "",
            "",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\14\uffff\12\45\3\uffff\1\33\3\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
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
            return "1:1: Tokens : ( T__69 | CREATE | FROM | INNER | INSERT | INTO | JOIN | SELECT | TABLE | VALUES | CONDITION | WHERE | AND | OR | NOT | TRUE | FALSE | UNKNOWN | IS | POSSIBLE | CERTAIN | ON | ASTERIK | QUOTE | LEFT_PAREN | LEFT_TRIANGLE | RIGHT_TRIANGLE | RIGHT_PAREN | COMMA | SEMICOLON | DOT | EQUAL | EXCLAMATION | NOT_EQUAL | NUMBER | ID | VARIABLE | NEWLINE | WS );";
        }
    }
 

}