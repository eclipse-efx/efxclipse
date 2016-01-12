package org.eclipse.fx.ide.css.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslLexer extends Lexer {
    public static final int Import=7;
    public static final int Page=9;
    public static final int RULE_IMPORTANT_SYM=43;
    public static final int Keyframes=5;
    public static final int LeftParenthesis=27;
    public static final int RULE_UNDERSCORE=47;
    public static final int RULE_CSSSTRING=55;
    public static final int Ampersand=26;
    public static final int AsteriskEqualsSign=15;
    public static final int RULE_PERCENT=52;
    public static final int RightSquareBracket=38;
    public static final int ExclamationMark=24;
    public static final int GreaterThanSign=34;
    public static final int Url_1=11;
    public static final int RULE_COMMA=51;
    public static final int Media=8;
    public static final int RightParenthesis=28;
    public static final int RULE_COLON=58;
    public static final int RULE_HASHMARK=50;
    public static final int Not=12;
    public static final int VerticalLine=40;
    public static final int RULE_DASHMATCH=57;
    public static final int RULE_ML_COMMENT=53;
    public static final int CircumflexAccentEqualsSign=21;
    public static final int LeftSquareBracket=37;
    public static final int Ur=23;
    public static final int RULE_INCLUDES=56;
    public static final int ReverseSolidusLeftParenthesis=19;
    public static final int RULE_ONE_HEX_LETTER=45;
    public static final int ReverseSolidusApostrophe=18;
    public static final int Url=13;
    public static final int EqualsSign=33;
    public static final int RULE_ONE_INT=44;
    public static final int RULE_DASH=48;
    public static final int Not_1=10;
    public static final int RULE_PLUS=49;
    public static final int ReverseSolidusSpace=16;
    public static final int Solidus=31;
    public static final int RightCurlyBracket=41;
    public static final int EOF=-1;
    public static final int Asterisk=29;
    public static final int RULE_ONE_NON_HEX_LETTER=46;
    public static final int No=22;
    public static final int FullStop=30;
    public static final int RULE_WS=54;
    public static final int LeftCurlyBracket=39;
    public static final int Charset=6;
    public static final int Tilde=42;
    public static final int DollarSignEqualsSign=14;
    public static final int CommercialAt=36;
    public static final int Semicolon=32;
    public static final int ReverseSolidusQuotationMark=17;
    public static final int FontFace=4;
    public static final int ReverseSolidusRightParenthesis=20;
    public static final int QuestionMark=35;
    public static final int DollarSign=25;

    // delegates
    // delegators

    public InternalCssDslLexer() {;} 
    public InternalCssDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCssDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCssDslLexer.g"; }

    // $ANTLR start "FontFace"
    public final void mFontFace() throws RecognitionException {
        try {
            int _type = FontFace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:14:10: ( '@' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) '-' ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalCssDslLexer.g:14:12: '@' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) '-' ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('-'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FontFace"

    // $ANTLR start "Keyframes"
    public final void mKeyframes() throws RecognitionException {
        try {
            int _type = Keyframes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:16:11: ( '@' ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalCssDslLexer.g:16:13: '@' ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' ) ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            match('@'); 
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Keyframes"

    // $ANTLR start "Charset"
    public final void mCharset() throws RecognitionException {
        try {
            int _type = Charset;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:18:9: ( '@' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalCssDslLexer.g:18:11: '@' ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            match('@'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Charset"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:20:8: ( '@' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalCssDslLexer.g:20:10: '@' ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            match('@'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Media"
    public final void mMedia() throws RecognitionException {
        try {
            int _type = Media;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:22:7: ( '@' ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) )
            // InternalCssDslLexer.g:22:9: '@' ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' )
            {
            match('@'); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Media"

    // $ANTLR start "Page"
    public final void mPage() throws RecognitionException {
        try {
            int _type = Page;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:24:6: ( '@' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalCssDslLexer.g:24:8: '@' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            match('@'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Page"

    // $ANTLR start "Not_1"
    public final void mNot_1() throws RecognitionException {
        try {
            int _type = Not_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:26:7: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) '(' )
            // InternalCssDslLexer.g:26:9: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) '('
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not_1"

    // $ANTLR start "Url_1"
    public final void mUrl_1() throws RecognitionException {
        try {
            int _type = Url_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:28:7: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'L' | 'l' ) '(' )
            // InternalCssDslLexer.g:28:9: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'L' | 'l' ) '('
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url_1"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:30:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalCssDslLexer.g:30:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Url"
    public final void mUrl() throws RecognitionException {
        try {
            int _type = Url;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:32:5: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'L' | 'l' ) )
            // InternalCssDslLexer.g:32:7: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Url"

    // $ANTLR start "DollarSignEqualsSign"
    public final void mDollarSignEqualsSign() throws RecognitionException {
        try {
            int _type = DollarSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:34:22: ( '$' '=' )
            // InternalCssDslLexer.g:34:24: '$' '='
            {
            match('$'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSignEqualsSign"

    // $ANTLR start "AsteriskEqualsSign"
    public final void mAsteriskEqualsSign() throws RecognitionException {
        try {
            int _type = AsteriskEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:36:20: ( '*' '=' )
            // InternalCssDslLexer.g:36:22: '*' '='
            {
            match('*'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsteriskEqualsSign"

    // $ANTLR start "ReverseSolidusSpace"
    public final void mReverseSolidusSpace() throws RecognitionException {
        try {
            int _type = ReverseSolidusSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:38:21: ( '\\\\' ' ' )
            // InternalCssDslLexer.g:38:23: '\\\\' ' '
            {
            match('\\'); 
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusSpace"

    // $ANTLR start "ReverseSolidusQuotationMark"
    public final void mReverseSolidusQuotationMark() throws RecognitionException {
        try {
            int _type = ReverseSolidusQuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:40:29: ( '\\\\' '\"' )
            // InternalCssDslLexer.g:40:31: '\\\\' '\"'
            {
            match('\\'); 
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusQuotationMark"

    // $ANTLR start "ReverseSolidusApostrophe"
    public final void mReverseSolidusApostrophe() throws RecognitionException {
        try {
            int _type = ReverseSolidusApostrophe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:42:26: ( '\\\\' '\\'' )
            // InternalCssDslLexer.g:42:28: '\\\\' '\\''
            {
            match('\\'); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusApostrophe"

    // $ANTLR start "ReverseSolidusLeftParenthesis"
    public final void mReverseSolidusLeftParenthesis() throws RecognitionException {
        try {
            int _type = ReverseSolidusLeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:44:31: ( '\\\\' '(' )
            // InternalCssDslLexer.g:44:33: '\\\\' '('
            {
            match('\\'); 
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusLeftParenthesis"

    // $ANTLR start "ReverseSolidusRightParenthesis"
    public final void mReverseSolidusRightParenthesis() throws RecognitionException {
        try {
            int _type = ReverseSolidusRightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:46:32: ( '\\\\' ')' )
            // InternalCssDslLexer.g:46:34: '\\\\' ')'
            {
            match('\\'); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReverseSolidusRightParenthesis"

    // $ANTLR start "CircumflexAccentEqualsSign"
    public final void mCircumflexAccentEqualsSign() throws RecognitionException {
        try {
            int _type = CircumflexAccentEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:48:28: ( '^' '=' )
            // InternalCssDslLexer.g:48:30: '^' '='
            {
            match('^'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccentEqualsSign"

    // $ANTLR start "No"
    public final void mNo() throws RecognitionException {
        try {
            int _type = No;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:50:4: ( ( 'N' | 'n' ) ( 'O' | 'o' ) )
            // InternalCssDslLexer.g:50:6: ( 'N' | 'n' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "No"

    // $ANTLR start "Ur"
    public final void mUr() throws RecognitionException {
        try {
            int _type = Ur;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:52:4: ( ( 'U' | 'u' ) ( 'R' | 'r' ) )
            // InternalCssDslLexer.g:52:6: ( 'U' | 'u' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ur"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:54:17: ( '!' )
            // InternalCssDslLexer.g:54:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "DollarSign"
    public final void mDollarSign() throws RecognitionException {
        try {
            int _type = DollarSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:56:12: ( '$' )
            // InternalCssDslLexer.g:56:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:58:11: ( '&' )
            // InternalCssDslLexer.g:58:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:60:17: ( '(' )
            // InternalCssDslLexer.g:60:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:62:18: ( ')' )
            // InternalCssDslLexer.g:62:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:64:10: ( '*' )
            // InternalCssDslLexer.g:64:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:66:10: ( '.' )
            // InternalCssDslLexer.g:66:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:68:9: ( '/' )
            // InternalCssDslLexer.g:68:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:70:11: ( ';' )
            // InternalCssDslLexer.g:70:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:72:12: ( '=' )
            // InternalCssDslLexer.g:72:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:74:17: ( '>' )
            // InternalCssDslLexer.g:74:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:76:14: ( '?' )
            // InternalCssDslLexer.g:76:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:78:14: ( '@' )
            // InternalCssDslLexer.g:78:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:80:19: ( '[' )
            // InternalCssDslLexer.g:80:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:82:20: ( ']' )
            // InternalCssDslLexer.g:82:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:84:18: ( '{' )
            // InternalCssDslLexer.g:84:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:86:14: ( '|' )
            // InternalCssDslLexer.g:86:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:88:19: ( '}' )
            // InternalCssDslLexer.g:88:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "Tilde"
    public final void mTilde() throws RecognitionException {
        try {
            int _type = Tilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:90:7: ( '~' )
            // InternalCssDslLexer.g:90:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tilde"

    // $ANTLR start "RULE_IMPORTANT_SYM"
    public final void mRULE_IMPORTANT_SYM() throws RecognitionException {
        try {
            int _type = RULE_IMPORTANT_SYM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:94:20: ( '!important' )
            // InternalCssDslLexer.g:94:22: '!important'
            {
            match("!important"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORTANT_SYM"

    // $ANTLR start "RULE_ONE_INT"
    public final void mRULE_ONE_INT() throws RecognitionException {
        try {
            int _type = RULE_ONE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:96:14: ( '0' .. '9' )
            // InternalCssDslLexer.g:96:16: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_INT"

    // $ANTLR start "RULE_ONE_HEX_LETTER"
    public final void mRULE_ONE_HEX_LETTER() throws RecognitionException {
        try {
            int _type = RULE_ONE_HEX_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:98:21: ( ( 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalCssDslLexer.g:98:23: ( 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_HEX_LETTER"

    // $ANTLR start "RULE_ONE_NON_HEX_LETTER"
    public final void mRULE_ONE_NON_HEX_LETTER() throws RecognitionException {
        try {
            int _type = RULE_ONE_NON_HEX_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:100:25: ( ( 'g' .. 'z' | 'G' .. 'Z' ) )
            // InternalCssDslLexer.g:100:27: ( 'g' .. 'z' | 'G' .. 'Z' )
            {
            if ( (input.LA(1)>='G' && input.LA(1)<='Z')||(input.LA(1)>='g' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_NON_HEX_LETTER"

    // $ANTLR start "RULE_UNDERSCORE"
    public final void mRULE_UNDERSCORE() throws RecognitionException {
        try {
            int _type = RULE_UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:102:17: ( '_' )
            // InternalCssDslLexer.g:102:19: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDERSCORE"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:104:11: ( '-' )
            // InternalCssDslLexer.g:104:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:106:11: ( '+' )
            // InternalCssDslLexer.g:106:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_HASHMARK"
    public final void mRULE_HASHMARK() throws RecognitionException {
        try {
            int _type = RULE_HASHMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:108:15: ( '#' )
            // InternalCssDslLexer.g:108:17: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASHMARK"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:110:12: ( ',' )
            // InternalCssDslLexer.g:110:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:112:14: ( '%' )
            // InternalCssDslLexer.g:112:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:114:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCssDslLexer.g:114:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCssDslLexer.g:114:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCssDslLexer.g:114:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:116:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCssDslLexer.g:116:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCssDslLexer.g:116:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCssDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_CSSSTRING"
    public final void mRULE_CSSSTRING() throws RecognitionException {
        try {
            int _type = RULE_CSSSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:118:16: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCssDslLexer.g:118:18: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCssDslLexer.g:118:18: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCssDslLexer.g:118:19: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCssDslLexer.g:118:23: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCssDslLexer.g:118:24: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='f')||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCssDslLexer.g:118:96: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCssDslLexer.g:118:116: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCssDslLexer.g:118:121: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCssDslLexer.g:118:122: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='f')||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCssDslLexer.g:118:194: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CSSSTRING"

    // $ANTLR start "RULE_INCLUDES"
    public final void mRULE_INCLUDES() throws RecognitionException {
        try {
            int _type = RULE_INCLUDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:120:15: ( '~=' )
            // InternalCssDslLexer.g:120:17: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDES"

    // $ANTLR start "RULE_DASHMATCH"
    public final void mRULE_DASHMATCH() throws RecognitionException {
        try {
            int _type = RULE_DASHMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:122:16: ( '|=' )
            // InternalCssDslLexer.g:122:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASHMATCH"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCssDslLexer.g:124:12: ( ':' )
            // InternalCssDslLexer.g:124:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    public void mTokens() throws RecognitionException {
        // InternalCssDslLexer.g:1:8: ( FontFace | Keyframes | Charset | Import | Media | Page | Not_1 | Url_1 | Not | Url | DollarSignEqualsSign | AsteriskEqualsSign | ReverseSolidusSpace | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusLeftParenthesis | ReverseSolidusRightParenthesis | CircumflexAccentEqualsSign | No | Ur | ExclamationMark | DollarSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | FullStop | Solidus | Semicolon | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_IMPORTANT_SYM | RULE_ONE_INT | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_UNDERSCORE | RULE_DASH | RULE_PLUS | RULE_HASHMARK | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_CSSSTRING | RULE_INCLUDES | RULE_DASHMATCH | RULE_COLON )
        int alt6=55;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalCssDslLexer.g:1:10: FontFace
                {
                mFontFace(); 

                }
                break;
            case 2 :
                // InternalCssDslLexer.g:1:19: Keyframes
                {
                mKeyframes(); 

                }
                break;
            case 3 :
                // InternalCssDslLexer.g:1:29: Charset
                {
                mCharset(); 

                }
                break;
            case 4 :
                // InternalCssDslLexer.g:1:37: Import
                {
                mImport(); 

                }
                break;
            case 5 :
                // InternalCssDslLexer.g:1:44: Media
                {
                mMedia(); 

                }
                break;
            case 6 :
                // InternalCssDslLexer.g:1:50: Page
                {
                mPage(); 

                }
                break;
            case 7 :
                // InternalCssDslLexer.g:1:55: Not_1
                {
                mNot_1(); 

                }
                break;
            case 8 :
                // InternalCssDslLexer.g:1:61: Url_1
                {
                mUrl_1(); 

                }
                break;
            case 9 :
                // InternalCssDslLexer.g:1:67: Not
                {
                mNot(); 

                }
                break;
            case 10 :
                // InternalCssDslLexer.g:1:71: Url
                {
                mUrl(); 

                }
                break;
            case 11 :
                // InternalCssDslLexer.g:1:75: DollarSignEqualsSign
                {
                mDollarSignEqualsSign(); 

                }
                break;
            case 12 :
                // InternalCssDslLexer.g:1:96: AsteriskEqualsSign
                {
                mAsteriskEqualsSign(); 

                }
                break;
            case 13 :
                // InternalCssDslLexer.g:1:115: ReverseSolidusSpace
                {
                mReverseSolidusSpace(); 

                }
                break;
            case 14 :
                // InternalCssDslLexer.g:1:135: ReverseSolidusQuotationMark
                {
                mReverseSolidusQuotationMark(); 

                }
                break;
            case 15 :
                // InternalCssDslLexer.g:1:163: ReverseSolidusApostrophe
                {
                mReverseSolidusApostrophe(); 

                }
                break;
            case 16 :
                // InternalCssDslLexer.g:1:188: ReverseSolidusLeftParenthesis
                {
                mReverseSolidusLeftParenthesis(); 

                }
                break;
            case 17 :
                // InternalCssDslLexer.g:1:218: ReverseSolidusRightParenthesis
                {
                mReverseSolidusRightParenthesis(); 

                }
                break;
            case 18 :
                // InternalCssDslLexer.g:1:249: CircumflexAccentEqualsSign
                {
                mCircumflexAccentEqualsSign(); 

                }
                break;
            case 19 :
                // InternalCssDslLexer.g:1:276: No
                {
                mNo(); 

                }
                break;
            case 20 :
                // InternalCssDslLexer.g:1:279: Ur
                {
                mUr(); 

                }
                break;
            case 21 :
                // InternalCssDslLexer.g:1:282: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 22 :
                // InternalCssDslLexer.g:1:298: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 23 :
                // InternalCssDslLexer.g:1:309: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 24 :
                // InternalCssDslLexer.g:1:319: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 25 :
                // InternalCssDslLexer.g:1:335: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 26 :
                // InternalCssDslLexer.g:1:352: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 27 :
                // InternalCssDslLexer.g:1:361: FullStop
                {
                mFullStop(); 

                }
                break;
            case 28 :
                // InternalCssDslLexer.g:1:370: Solidus
                {
                mSolidus(); 

                }
                break;
            case 29 :
                // InternalCssDslLexer.g:1:378: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 30 :
                // InternalCssDslLexer.g:1:388: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 31 :
                // InternalCssDslLexer.g:1:399: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 32 :
                // InternalCssDslLexer.g:1:415: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 33 :
                // InternalCssDslLexer.g:1:428: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 34 :
                // InternalCssDslLexer.g:1:441: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 35 :
                // InternalCssDslLexer.g:1:459: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 36 :
                // InternalCssDslLexer.g:1:478: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 37 :
                // InternalCssDslLexer.g:1:495: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 38 :
                // InternalCssDslLexer.g:1:508: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 39 :
                // InternalCssDslLexer.g:1:526: Tilde
                {
                mTilde(); 

                }
                break;
            case 40 :
                // InternalCssDslLexer.g:1:532: RULE_IMPORTANT_SYM
                {
                mRULE_IMPORTANT_SYM(); 

                }
                break;
            case 41 :
                // InternalCssDslLexer.g:1:551: RULE_ONE_INT
                {
                mRULE_ONE_INT(); 

                }
                break;
            case 42 :
                // InternalCssDslLexer.g:1:564: RULE_ONE_HEX_LETTER
                {
                mRULE_ONE_HEX_LETTER(); 

                }
                break;
            case 43 :
                // InternalCssDslLexer.g:1:584: RULE_ONE_NON_HEX_LETTER
                {
                mRULE_ONE_NON_HEX_LETTER(); 

                }
                break;
            case 44 :
                // InternalCssDslLexer.g:1:608: RULE_UNDERSCORE
                {
                mRULE_UNDERSCORE(); 

                }
                break;
            case 45 :
                // InternalCssDslLexer.g:1:624: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 46 :
                // InternalCssDslLexer.g:1:634: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 47 :
                // InternalCssDslLexer.g:1:644: RULE_HASHMARK
                {
                mRULE_HASHMARK(); 

                }
                break;
            case 48 :
                // InternalCssDslLexer.g:1:658: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 49 :
                // InternalCssDslLexer.g:1:669: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 50 :
                // InternalCssDslLexer.g:1:682: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalCssDslLexer.g:1:698: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalCssDslLexer.g:1:706: RULE_CSSSTRING
                {
                mRULE_CSSSTRING(); 

                }
                break;
            case 53 :
                // InternalCssDslLexer.g:1:721: RULE_INCLUDES
                {
                mRULE_INCLUDES(); 

                }
                break;
            case 54 :
                // InternalCssDslLexer.g:1:735: RULE_DASHMATCH
                {
                mRULE_DASHMATCH(); 

                }
                break;
            case 55 :
                // InternalCssDslLexer.g:1:750: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\52\2\32\1\56\1\60\2\uffff\1\67\4\uffff\1\71\7\uffff\1\73\1\uffff\1\75\23\uffff\1\77\1\101\21\uffff\1\103\1\uffff\1\105\5\uffff";
    static final String DFA6_eofS =
        "\106\uffff";
    static final String DFA6_minS =
        "\1\11\1\103\1\117\1\122\2\75\1\40\1\uffff\1\151\4\uffff\1\52\7\uffff\1\75\1\uffff\1\75\23\uffff\1\124\1\114\21\uffff\1\50\1\uffff\1\50\5\uffff";
    static final String DFA6_maxS =
        "\1\176\1\160\1\157\1\162\2\75\1\51\1\uffff\1\151\4\uffff\1\52\7\uffff\1\75\1\uffff\1\75\23\uffff\1\164\1\154\21\uffff\1\50\1\uffff\1\50\5\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\22\1\uffff\1\27\1\30\1\31\1\33\1\uffff\1\35\1\36\1\37\1\40\1\42\1\43\1\44\1\uffff\1\46\1\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\63\1\64\1\67\1\1\1\2\1\3\1\4\1\5\1\6\1\41\2\uffff\1\13\1\26\1\14\1\32\1\15\1\16\1\17\1\20\1\21\1\50\1\25\1\62\1\34\1\66\1\45\1\65\1\47\1\uffff\1\23\1\uffff\1\24\1\7\1\11\1\10\1\12";
    static final String DFA6_specialS =
        "\106\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\1\10\1\42\1\36\1\4\1\40\1\11\1\42\1\12\1\13\1\5\1\35\1\37\1\34\1\14\1\15\12\30\1\43\1\16\1\uffff\1\17\1\20\1\21\1\1\6\31\7\32\1\2\6\32\1\3\5\32\1\22\1\6\1\23\1\7\1\33\1\uffff\6\31\7\32\1\2\6\32\1\3\5\32\1\24\1\25\1\26\1\27",
            "\1\46\2\uffff\1\44\2\uffff\1\47\1\uffff\1\45\1\uffff\1\50\2\uffff\1\51\22\uffff\1\46\2\uffff\1\44\2\uffff\1\47\1\uffff\1\45\1\uffff\1\50\2\uffff\1\51",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55",
            "\1\57",
            "\1\61\1\uffff\1\62\4\uffff\1\63\1\64\1\65",
            "",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76\37\uffff\1\76",
            "\1\100\37\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FontFace | Keyframes | Charset | Import | Media | Page | Not_1 | Url_1 | Not | Url | DollarSignEqualsSign | AsteriskEqualsSign | ReverseSolidusSpace | ReverseSolidusQuotationMark | ReverseSolidusApostrophe | ReverseSolidusLeftParenthesis | ReverseSolidusRightParenthesis | CircumflexAccentEqualsSign | No | Ur | ExclamationMark | DollarSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | FullStop | Solidus | Semicolon | EqualsSign | GreaterThanSign | QuestionMark | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_IMPORTANT_SYM | RULE_ONE_INT | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_UNDERSCORE | RULE_DASH | RULE_PLUS | RULE_HASHMARK | RULE_COMMA | RULE_PERCENT | RULE_ML_COMMENT | RULE_WS | RULE_CSSSTRING | RULE_INCLUDES | RULE_DASHMATCH | RULE_COLON );";
        }
    }
 

}