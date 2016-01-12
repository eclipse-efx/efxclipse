package org.eclipse.fx.ide.css.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FontFace", "Keyframes", "Charset", "Import", "Media", "Page", "Not_1", "Url_1", "Not", "Url", "DollarSignEqualsSign", "AsteriskEqualsSign", "ReverseSolidusSpace", "ReverseSolidusQuotationMark", "ReverseSolidusApostrophe", "ReverseSolidusLeftParenthesis", "ReverseSolidusRightParenthesis", "CircumflexAccentEqualsSign", "No", "Ur", "ExclamationMark", "DollarSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "FullStop", "Solidus", "Semicolon", "EqualsSign", "GreaterThanSign", "QuestionMark", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "Tilde", "RULE_IMPORTANT_SYM", "RULE_ONE_INT", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER", "RULE_UNDERSCORE", "RULE_DASH", "RULE_PLUS", "RULE_HASHMARK", "RULE_COMMA", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_CSSSTRING", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_COLON"
    };
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


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCssDslParser.g"; }



     	private CssDslGrammarAccess grammarAccess;

        public InternalCssDslParser(TokenStream input, CssDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Stylesheet";
       	}

       	@Override
       	protected CssDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStylesheet"
    // InternalCssDslParser.g:57:1: entryRuleStylesheet returns [EObject current=null] : iv_ruleStylesheet= ruleStylesheet EOF ;
    public final EObject entryRuleStylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStylesheet = null;


        try {
            // InternalCssDslParser.g:57:51: (iv_ruleStylesheet= ruleStylesheet EOF )
            // InternalCssDslParser.g:58:2: iv_ruleStylesheet= ruleStylesheet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStylesheetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStylesheet=ruleStylesheet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStylesheet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // InternalCssDslParser.g:64:1: ruleStylesheet returns [EObject current=null] : ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* ) ;
    public final EObject ruleStylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_charset_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_ruleset_2_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_page_4_0 = null;

        EObject lv_font_face_5_0 = null;

        EObject lv_keyframes_6_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:70:2: ( ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* ) )
            // InternalCssDslParser.g:71:2: ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* )
            {
            // InternalCssDslParser.g:71:2: ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* )
            // InternalCssDslParser.g:72:3: ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )*
            {
            // InternalCssDslParser.g:72:3: ( (lv_charset_0_0= ruleCharsetRule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Charset) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCssDslParser.g:73:4: (lv_charset_0_0= ruleCharsetRule )
                    {
                    // InternalCssDslParser.g:73:4: (lv_charset_0_0= ruleCharsetRule )
                    // InternalCssDslParser.g:74:5: lv_charset_0_0= ruleCharsetRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStylesheetAccess().getCharsetCharsetRuleParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_charset_0_0=ruleCharsetRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getStylesheetRule());
                      					}
                      					set(
                      						current,
                      						"charset",
                      						lv_charset_0_0,
                      						"org.eclipse.fx.ide.css.CssDsl.CharsetRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssDslParser.g:91:3: ( (lv_imports_1_0= ruleImportRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCssDslParser.g:92:4: (lv_imports_1_0= ruleImportRule )
            	    {
            	    // InternalCssDslParser.g:92:4: (lv_imports_1_0= ruleImportRule )
            	    // InternalCssDslParser.g:93:5: lv_imports_1_0= ruleImportRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImportRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_1_0,
            	      						"org.eclipse.fx.ide.css.CssDsl.ImportRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCssDslParser.g:110:3: ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )*
            loop3:
            do {
                int alt3=6;
                switch ( input.LA(1) ) {
                case Not:
                case Url:
                case No:
                case Ur:
                case Asterisk:
                case FullStop:
                case LeftSquareBracket:
                case VerticalLine:
                case RULE_ONE_HEX_LETTER:
                case RULE_ONE_NON_HEX_LETTER:
                case RULE_UNDERSCORE:
                case RULE_DASH:
                case RULE_HASHMARK:
                case RULE_COLON:
                    {
                    alt3=1;
                    }
                    break;
                case Media:
                    {
                    alt3=2;
                    }
                    break;
                case Page:
                    {
                    alt3=3;
                    }
                    break;
                case FontFace:
                    {
                    alt3=4;
                    }
                    break;
                case Keyframes:
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalCssDslParser.g:111:4: ( (lv_ruleset_2_0= ruleRuleset ) )
            	    {
            	    // InternalCssDslParser.g:111:4: ( (lv_ruleset_2_0= ruleRuleset ) )
            	    // InternalCssDslParser.g:112:5: (lv_ruleset_2_0= ruleRuleset )
            	    {
            	    // InternalCssDslParser.g:112:5: (lv_ruleset_2_0= ruleRuleset )
            	    // InternalCssDslParser.g:113:6: lv_ruleset_2_0= ruleRuleset
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_ruleset_2_0=ruleRuleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ruleset",
            	      							lv_ruleset_2_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.Ruleset");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCssDslParser.g:131:4: ( (lv_media_3_0= ruleMediaRule ) )
            	    {
            	    // InternalCssDslParser.g:131:4: ( (lv_media_3_0= ruleMediaRule ) )
            	    // InternalCssDslParser.g:132:5: (lv_media_3_0= ruleMediaRule )
            	    {
            	    // InternalCssDslParser.g:132:5: (lv_media_3_0= ruleMediaRule )
            	    // InternalCssDslParser.g:133:6: lv_media_3_0= ruleMediaRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaRuleParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_media_3_0=ruleMediaRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"media",
            	      							lv_media_3_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.MediaRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCssDslParser.g:151:4: ( (lv_page_4_0= rulePageRule ) )
            	    {
            	    // InternalCssDslParser.g:151:4: ( (lv_page_4_0= rulePageRule ) )
            	    // InternalCssDslParser.g:152:5: (lv_page_4_0= rulePageRule )
            	    {
            	    // InternalCssDslParser.g:152:5: (lv_page_4_0= rulePageRule )
            	    // InternalCssDslParser.g:153:6: lv_page_4_0= rulePageRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStylesheetAccess().getPagePageRuleParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_page_4_0=rulePageRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"page",
            	      							lv_page_4_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.PageRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCssDslParser.g:171:4: ( (lv_font_face_5_0= ruleFontFaceRule ) )
            	    {
            	    // InternalCssDslParser.g:171:4: ( (lv_font_face_5_0= ruleFontFaceRule ) )
            	    // InternalCssDslParser.g:172:5: (lv_font_face_5_0= ruleFontFaceRule )
            	    {
            	    // InternalCssDslParser.g:172:5: (lv_font_face_5_0= ruleFontFaceRule )
            	    // InternalCssDslParser.g:173:6: lv_font_face_5_0= ruleFontFaceRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStylesheetAccess().getFont_faceFontFaceRuleParserRuleCall_2_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_font_face_5_0=ruleFontFaceRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"font_face",
            	      							lv_font_face_5_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.FontFaceRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCssDslParser.g:191:4: ( (lv_keyframes_6_0= ruleKeyframesRule ) )
            	    {
            	    // InternalCssDslParser.g:191:4: ( (lv_keyframes_6_0= ruleKeyframesRule ) )
            	    // InternalCssDslParser.g:192:5: (lv_keyframes_6_0= ruleKeyframesRule )
            	    {
            	    // InternalCssDslParser.g:192:5: (lv_keyframes_6_0= ruleKeyframesRule )
            	    // InternalCssDslParser.g:193:6: lv_keyframes_6_0= ruleKeyframesRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStylesheetAccess().getKeyframesKeyframesRuleParserRuleCall_2_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_keyframes_6_0=ruleKeyframesRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"keyframes",
            	      							lv_keyframes_6_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.KeyframesRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleCharsetRule"
    // InternalCssDslParser.g:215:1: entryRuleCharsetRule returns [EObject current=null] : iv_ruleCharsetRule= ruleCharsetRule EOF ;
    public final EObject entryRuleCharsetRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharsetRule = null;


        try {
            // InternalCssDslParser.g:215:52: (iv_ruleCharsetRule= ruleCharsetRule EOF )
            // InternalCssDslParser.g:216:2: iv_ruleCharsetRule= ruleCharsetRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharsetRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharsetRule=ruleCharsetRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharsetRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharsetRule"


    // $ANTLR start "ruleCharsetRule"
    // InternalCssDslParser.g:222:1: ruleCharsetRule returns [EObject current=null] : (otherlv_0= Charset ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleCharsetRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_charset_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:228:2: ( (otherlv_0= Charset ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= Semicolon ) )
            // InternalCssDslParser.g:229:2: (otherlv_0= Charset ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= Semicolon )
            {
            // InternalCssDslParser.g:229:2: (otherlv_0= Charset ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= Semicolon )
            // InternalCssDslParser.g:230:3: otherlv_0= Charset ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Charset,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCharsetRuleAccess().getCharsetKeyword_0());
              		
            }
            // InternalCssDslParser.g:234:3: ( (lv_charset_1_0= RULE_CSSSTRING ) )
            // InternalCssDslParser.g:235:4: (lv_charset_1_0= RULE_CSSSTRING )
            {
            // InternalCssDslParser.g:235:4: (lv_charset_1_0= RULE_CSSSTRING )
            // InternalCssDslParser.g:236:5: lv_charset_1_0= RULE_CSSSTRING
            {
            lv_charset_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_charset_1_0, grammarAccess.getCharsetRuleAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCharsetRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"charset",
              						lv_charset_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.CSSSTRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCharsetRuleAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharsetRule"


    // $ANTLR start "entryRuleImportRule"
    // InternalCssDslParser.g:260:1: entryRuleImportRule returns [EObject current=null] : iv_ruleImportRule= ruleImportRule EOF ;
    public final EObject entryRuleImportRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportRule = null;


        try {
            // InternalCssDslParser.g:260:51: (iv_ruleImportRule= ruleImportRule EOF )
            // InternalCssDslParser.g:261:2: iv_ruleImportRule= ruleImportRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportRule=ruleImportRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportRule"


    // $ANTLR start "ruleImportRule"
    // InternalCssDslParser.g:267:1: ruleImportRule returns [EObject current=null] : (otherlv_0= Import ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleImportRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_4=null;
        EObject this_URLType_2 = null;

        EObject lv_mediaList_3_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:273:2: ( (otherlv_0= Import ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= Semicolon ) )
            // InternalCssDslParser.g:274:2: (otherlv_0= Import ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= Semicolon )
            {
            // InternalCssDslParser.g:274:2: (otherlv_0= Import ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= Semicolon )
            // InternalCssDslParser.g:275:3: otherlv_0= Import ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportRuleAccess().getImportKeyword_0());
              		
            }
            // InternalCssDslParser.g:279:3: ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CSSSTRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==Url_1) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCssDslParser.g:280:4: ( (lv_value_1_0= RULE_CSSSTRING ) )
                    {
                    // InternalCssDslParser.g:280:4: ( (lv_value_1_0= RULE_CSSSTRING ) )
                    // InternalCssDslParser.g:281:5: (lv_value_1_0= RULE_CSSSTRING )
                    {
                    // InternalCssDslParser.g:281:5: (lv_value_1_0= RULE_CSSSTRING )
                    // InternalCssDslParser.g:282:6: lv_value_1_0= RULE_CSSSTRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getImportRuleAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getImportRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.fx.ide.css.CssDsl.CSSSTRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:299:4: (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? )
                    {
                    // InternalCssDslParser.g:299:4: (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? )
                    // InternalCssDslParser.g:300:5: this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImportRuleAccess().getURLTypeParserRuleCall_1_1_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_URLType_2=ruleURLType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_URLType_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalCssDslParser.g:308:5: ( (lv_mediaList_3_0= ruleMediaList ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=Not && LA4_0<=Url)||(LA4_0>=No && LA4_0<=Ur)||(LA4_0>=RULE_ONE_HEX_LETTER && LA4_0<=RULE_DASH)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCssDslParser.g:309:6: (lv_mediaList_3_0= ruleMediaList )
                            {
                            // InternalCssDslParser.g:309:6: (lv_mediaList_3_0= ruleMediaList )
                            // InternalCssDslParser.g:310:7: lv_mediaList_3_0= ruleMediaList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getImportRuleAccess().getMediaListMediaListParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_6);
                            lv_mediaList_3_0=ruleMediaList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getImportRuleRule());
                              							}
                              							set(
                              								current,
                              								"mediaList",
                              								lv_mediaList_3_0,
                              								"org.eclipse.fx.ide.css.CssDsl.MediaList");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getImportRuleAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportRule"


    // $ANTLR start "entryRulePageRule"
    // InternalCssDslParser.g:337:1: entryRulePageRule returns [EObject current=null] : iv_rulePageRule= rulePageRule EOF ;
    public final EObject entryRulePageRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageRule = null;


        try {
            // InternalCssDslParser.g:337:49: (iv_rulePageRule= rulePageRule EOF )
            // InternalCssDslParser.g:338:2: iv_rulePageRule= rulePageRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePageRule=rulePageRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageRule"


    // $ANTLR start "rulePageRule"
    // InternalCssDslParser.g:344:1: rulePageRule returns [EObject current=null] : ( () otherlv_1= Page ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket ) ;
    public final EObject rulePageRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_pseudoPage_2_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_declarations_6_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:350:2: ( ( () otherlv_1= Page ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket ) )
            // InternalCssDslParser.g:351:2: ( () otherlv_1= Page ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket )
            {
            // InternalCssDslParser.g:351:2: ( () otherlv_1= Page ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket )
            // InternalCssDslParser.g:352:3: () otherlv_1= Page ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket
            {
            // InternalCssDslParser.g:352:3: ()
            // InternalCssDslParser.g:353:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPageRuleAccess().getPageRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Page,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPageRuleAccess().getPageKeyword_1());
              		
            }
            // InternalCssDslParser.g:363:3: ( (lv_pseudoPage_2_0= rulePseudoPage ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCssDslParser.g:364:4: (lv_pseudoPage_2_0= rulePseudoPage )
                    {
                    // InternalCssDslParser.g:364:4: (lv_pseudoPage_2_0= rulePseudoPage )
                    // InternalCssDslParser.g:365:5: lv_pseudoPage_2_0= rulePseudoPage
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPageRuleAccess().getPseudoPagePseudoPageParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_pseudoPage_2_0=rulePseudoPage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPageRuleRule());
                      					}
                      					set(
                      						current,
                      						"pseudoPage",
                      						lv_pseudoPage_2_0,
                      						"org.eclipse.fx.ide.css.CssDsl.PseudoPage");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCssDslParser.g:386:3: ( (lv_declarations_4_0= ruleCssDeclaration ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Not && LA7_0<=Url)||(LA7_0>=No && LA7_0<=Ur)||(LA7_0>=RULE_ONE_HEX_LETTER && LA7_0<=RULE_DASH)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCssDslParser.g:387:4: (lv_declarations_4_0= ruleCssDeclaration )
                    {
                    // InternalCssDslParser.g:387:4: (lv_declarations_4_0= ruleCssDeclaration )
                    // InternalCssDslParser.g:388:5: lv_declarations_4_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_4_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPageRuleRule());
                      					}
                      					add(
                      						current,
                      						"declarations",
                      						lv_declarations_4_0,
                      						"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssDslParser.g:405:3: (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Semicolon) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCssDslParser.g:406:4: otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getPageRuleAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalCssDslParser.g:410:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( ((LA8_0>=Not && LA8_0<=Url)||(LA8_0>=No && LA8_0<=Ur)||(LA8_0>=RULE_ONE_HEX_LETTER && LA8_0<=RULE_DASH)) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalCssDslParser.g:411:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            {
            	            // InternalCssDslParser.g:411:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            // InternalCssDslParser.g:412:6: lv_declarations_6_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_5_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_6_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getPageRuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"declarations",
            	              							lv_declarations_6_0,
            	              							"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageRule"


    // $ANTLR start "entryRulePseudoPage"
    // InternalCssDslParser.g:438:1: entryRulePseudoPage returns [String current=null] : iv_rulePseudoPage= rulePseudoPage EOF ;
    public final String entryRulePseudoPage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePseudoPage = null;


        try {
            // InternalCssDslParser.g:438:50: (iv_rulePseudoPage= rulePseudoPage EOF )
            // InternalCssDslParser.g:439:2: iv_rulePseudoPage= rulePseudoPage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoPageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoPage=rulePseudoPage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoPage.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoPage"


    // $ANTLR start "rulePseudoPage"
    // InternalCssDslParser.g:445:1: rulePseudoPage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) ;
    public final AntlrDatatypeRuleToken rulePseudoPage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:451:2: ( (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier ) )
            // InternalCssDslParser.g:452:2: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            {
            // InternalCssDslParser.g:452:2: (this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier )
            // InternalCssDslParser.g:453:3: this_COLON_0= RULE_COLON this_Identifier_1= ruleIdentifier
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_COLON_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_COLON_0, grammarAccess.getPseudoPageAccess().getCOLONTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPseudoPageAccess().getIdentifierParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Identifier_1=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Identifier_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoPage"


    // $ANTLR start "entryRuleMediaRule"
    // InternalCssDslParser.g:474:1: entryRuleMediaRule returns [EObject current=null] : iv_ruleMediaRule= ruleMediaRule EOF ;
    public final EObject entryRuleMediaRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaRule = null;


        try {
            // InternalCssDslParser.g:474:50: (iv_ruleMediaRule= ruleMediaRule EOF )
            // InternalCssDslParser.g:475:2: iv_ruleMediaRule= ruleMediaRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMediaRule=ruleMediaRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMediaRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaRule"


    // $ANTLR start "ruleMediaRule"
    // InternalCssDslParser.g:481:1: ruleMediaRule returns [EObject current=null] : (otherlv_0= Media ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= LeftCurlyBracket ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleMediaRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_medialist_1_0 = null;

        EObject lv_rulesets_3_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:487:2: ( (otherlv_0= Media ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= LeftCurlyBracket ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= RightCurlyBracket ) )
            // InternalCssDslParser.g:488:2: (otherlv_0= Media ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= LeftCurlyBracket ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= RightCurlyBracket )
            {
            // InternalCssDslParser.g:488:2: (otherlv_0= Media ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= LeftCurlyBracket ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= RightCurlyBracket )
            // InternalCssDslParser.g:489:3: otherlv_0= Media ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= LeftCurlyBracket ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Media,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMediaRuleAccess().getMediaKeyword_0());
              		
            }
            // InternalCssDslParser.g:493:3: ( (lv_medialist_1_0= ruleMediaList ) )
            // InternalCssDslParser.g:494:4: (lv_medialist_1_0= ruleMediaList )
            {
            // InternalCssDslParser.g:494:4: (lv_medialist_1_0= ruleMediaList )
            // InternalCssDslParser.g:495:5: lv_medialist_1_0= ruleMediaList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMediaRuleAccess().getMedialistMediaListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_medialist_1_0=ruleMediaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMediaRuleRule());
              					}
              					set(
              						current,
              						"medialist",
              						lv_medialist_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.MediaList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMediaRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCssDslParser.g:516:3: ( (lv_rulesets_3_0= ruleRuleset ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=Not && LA10_0<=Url)||(LA10_0>=No && LA10_0<=Ur)||(LA10_0>=Asterisk && LA10_0<=FullStop)||LA10_0==LeftSquareBracket||LA10_0==VerticalLine||(LA10_0>=RULE_ONE_HEX_LETTER && LA10_0<=RULE_DASH)||LA10_0==RULE_HASHMARK||LA10_0==RULE_COLON) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCssDslParser.g:517:4: (lv_rulesets_3_0= ruleRuleset )
            	    {
            	    // InternalCssDslParser.g:517:4: (lv_rulesets_3_0= ruleRuleset )
            	    // InternalCssDslParser.g:518:5: lv_rulesets_3_0= ruleRuleset
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMediaRuleAccess().getRulesetsRulesetParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rulesets_3_0=ruleRuleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMediaRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rulesets",
            	      						lv_rulesets_3_0,
            	      						"org.eclipse.fx.ide.css.CssDsl.Ruleset");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMediaRuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaRule"


    // $ANTLR start "entryRuleMediaList"
    // InternalCssDslParser.g:543:1: entryRuleMediaList returns [EObject current=null] : iv_ruleMediaList= ruleMediaList EOF ;
    public final EObject entryRuleMediaList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediaList = null;


        try {
            // InternalCssDslParser.g:543:50: (iv_ruleMediaList= ruleMediaList EOF )
            // InternalCssDslParser.g:544:2: iv_ruleMediaList= ruleMediaList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMediaList=ruleMediaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMediaList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaList"


    // $ANTLR start "ruleMediaList"
    // InternalCssDslParser.g:550:1: ruleMediaList returns [EObject current=null] : ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* ) ;
    public final EObject ruleMediaList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_entry_0_0 = null;

        EObject lv_entry_2_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:556:2: ( ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* ) )
            // InternalCssDslParser.g:557:2: ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* )
            {
            // InternalCssDslParser.g:557:2: ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* )
            // InternalCssDslParser.g:558:3: ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )*
            {
            // InternalCssDslParser.g:558:3: ( (lv_entry_0_0= ruleMedia ) )
            // InternalCssDslParser.g:559:4: (lv_entry_0_0= ruleMedia )
            {
            // InternalCssDslParser.g:559:4: (lv_entry_0_0= ruleMedia )
            // InternalCssDslParser.g:560:5: lv_entry_0_0= ruleMedia
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_entry_0_0=ruleMedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMediaListRule());
              					}
              					add(
              						current,
              						"entry",
              						lv_entry_0_0,
              						"org.eclipse.fx.ide.css.CssDsl.Media");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:577:3: (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCssDslParser.g:578:4: this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_1, grammarAccess.getMediaListAccess().getCOMMATerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalCssDslParser.g:582:4: ( (lv_entry_2_0= ruleMedia ) )
            	    // InternalCssDslParser.g:583:5: (lv_entry_2_0= ruleMedia )
            	    {
            	    // InternalCssDslParser.g:583:5: (lv_entry_2_0= ruleMedia )
            	    // InternalCssDslParser.g:584:6: lv_entry_2_0= ruleMedia
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_entry_2_0=ruleMedia();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMediaListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entry",
            	      							lv_entry_2_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.Media");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaList"


    // $ANTLR start "entryRuleMedia"
    // InternalCssDslParser.g:606:1: entryRuleMedia returns [EObject current=null] : iv_ruleMedia= ruleMedia EOF ;
    public final EObject entryRuleMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedia = null;


        try {
            // InternalCssDslParser.g:606:46: (iv_ruleMedia= ruleMedia EOF )
            // InternalCssDslParser.g:607:2: iv_ruleMedia= ruleMedia EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMedia=ruleMedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMedia; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalCssDslParser.g:613:1: ruleMedia returns [EObject current=null] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final EObject ruleMedia() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:619:2: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // InternalCssDslParser.g:620:2: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // InternalCssDslParser.g:620:2: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalCssDslParser.g:621:3: (lv_name_0_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:621:3: (lv_name_0_0= ruleIdentifier )
            // InternalCssDslParser.g:622:4: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getMediaAccess().getNameIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getMediaRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.fx.ide.css.CssDsl.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleFontFaceRule"
    // InternalCssDslParser.g:642:1: entryRuleFontFaceRule returns [EObject current=null] : iv_ruleFontFaceRule= ruleFontFaceRule EOF ;
    public final EObject entryRuleFontFaceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFontFaceRule = null;


        try {
            // InternalCssDslParser.g:642:53: (iv_ruleFontFaceRule= ruleFontFaceRule EOF )
            // InternalCssDslParser.g:643:2: iv_ruleFontFaceRule= ruleFontFaceRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFontFaceRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFontFaceRule=ruleFontFaceRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFontFaceRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontFaceRule"


    // $ANTLR start "ruleFontFaceRule"
    // InternalCssDslParser.g:649:1: ruleFontFaceRule returns [EObject current=null] : ( () otherlv_1= FontFace otherlv_2= LeftCurlyBracket ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleFontFaceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_declarations_5_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:655:2: ( ( () otherlv_1= FontFace otherlv_2= LeftCurlyBracket ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= RightCurlyBracket ) )
            // InternalCssDslParser.g:656:2: ( () otherlv_1= FontFace otherlv_2= LeftCurlyBracket ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= RightCurlyBracket )
            {
            // InternalCssDslParser.g:656:2: ( () otherlv_1= FontFace otherlv_2= LeftCurlyBracket ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= RightCurlyBracket )
            // InternalCssDslParser.g:657:3: () otherlv_1= FontFace otherlv_2= LeftCurlyBracket ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= RightCurlyBracket
            {
            // InternalCssDslParser.g:657:3: ()
            // InternalCssDslParser.g:658:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFontFaceRuleAccess().getFontFaceRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FontFace,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFontFaceRuleAccess().getFontFaceKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFontFaceRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCssDslParser.g:672:3: ( (lv_declarations_3_0= ruleCssDeclaration ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=Not && LA12_0<=Url)||(LA12_0>=No && LA12_0<=Ur)||(LA12_0>=RULE_ONE_HEX_LETTER && LA12_0<=RULE_DASH)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCssDslParser.g:673:4: (lv_declarations_3_0= ruleCssDeclaration )
                    {
                    // InternalCssDslParser.g:673:4: (lv_declarations_3_0= ruleCssDeclaration )
                    // InternalCssDslParser.g:674:5: lv_declarations_3_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_3_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFontFaceRuleRule());
                      					}
                      					add(
                      						current,
                      						"declarations",
                      						lv_declarations_3_0,
                      						"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssDslParser.g:691:3: (otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Semicolon) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCssDslParser.g:692:4: otherlv_4= Semicolon ( (lv_declarations_5_0= ruleCssDeclaration ) )?
            	    {
            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getFontFaceRuleAccess().getSemicolonKeyword_4_0());
            	      			
            	    }
            	    // InternalCssDslParser.g:696:4: ( (lv_declarations_5_0= ruleCssDeclaration ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=Not && LA13_0<=Url)||(LA13_0>=No && LA13_0<=Ur)||(LA13_0>=RULE_ONE_HEX_LETTER && LA13_0<=RULE_DASH)) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalCssDslParser.g:697:5: (lv_declarations_5_0= ruleCssDeclaration )
            	            {
            	            // InternalCssDslParser.g:697:5: (lv_declarations_5_0= ruleCssDeclaration )
            	            // InternalCssDslParser.g:698:6: lv_declarations_5_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_5_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getFontFaceRuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"declarations",
            	              							lv_declarations_5_0,
            	              							"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFontFaceRuleAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontFaceRule"


    // $ANTLR start "entryRuleKeyframesRule"
    // InternalCssDslParser.g:724:1: entryRuleKeyframesRule returns [EObject current=null] : iv_ruleKeyframesRule= ruleKeyframesRule EOF ;
    public final EObject entryRuleKeyframesRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyframesRule = null;


        try {
            // InternalCssDslParser.g:724:54: (iv_ruleKeyframesRule= ruleKeyframesRule EOF )
            // InternalCssDslParser.g:725:2: iv_ruleKeyframesRule= ruleKeyframesRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyframesRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyframesRule=ruleKeyframesRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyframesRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyframesRule"


    // $ANTLR start "ruleKeyframesRule"
    // InternalCssDslParser.g:731:1: ruleKeyframesRule returns [EObject current=null] : ( () otherlv_1= Keyframes ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= LeftCurlyBracket ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleKeyframesRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_keyframeselectors_4_0 = null;

        EObject lv_keyframeselectors_6_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:737:2: ( ( () otherlv_1= Keyframes ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= LeftCurlyBracket ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= RightCurlyBracket ) )
            // InternalCssDslParser.g:738:2: ( () otherlv_1= Keyframes ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= LeftCurlyBracket ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= RightCurlyBracket )
            {
            // InternalCssDslParser.g:738:2: ( () otherlv_1= Keyframes ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= LeftCurlyBracket ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= RightCurlyBracket )
            // InternalCssDslParser.g:739:3: () otherlv_1= Keyframes ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= LeftCurlyBracket ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= RightCurlyBracket
            {
            // InternalCssDslParser.g:739:3: ()
            // InternalCssDslParser.g:740:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getKeyframesRuleAccess().getKeyframesRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Keyframes,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyframesRuleAccess().getKeyframesKeyword_1());
              		
            }
            // InternalCssDslParser.g:750:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalCssDslParser.g:751:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:751:4: (lv_name_2_0= ruleIdentifier )
            // InternalCssDslParser.g:752:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyframesRuleAccess().getNameIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyframesRuleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getKeyframesRuleAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCssDslParser.g:773:3: ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=Not && LA15_0<=Url)||(LA15_0>=No && LA15_0<=Ur)||LA15_0==FullStop||(LA15_0>=RULE_ONE_INT && LA15_0<=RULE_PLUS)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCssDslParser.g:774:4: (lv_keyframeselectors_4_0= ruleKeyframeSelector )
                    {
                    // InternalCssDslParser.g:774:4: (lv_keyframeselectors_4_0= ruleKeyframeSelector )
                    // InternalCssDslParser.g:775:5: lv_keyframeselectors_4_0= ruleKeyframeSelector
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_keyframeselectors_4_0=ruleKeyframeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getKeyframesRuleRule());
                      					}
                      					add(
                      						current,
                      						"keyframeselectors",
                      						lv_keyframeselectors_4_0,
                      						"org.eclipse.fx.ide.css.CssDsl.KeyframeSelector");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssDslParser.g:792:3: (otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Semicolon) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCssDslParser.g:793:4: otherlv_5= Semicolon ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )?
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getKeyframesRuleAccess().getSemicolonKeyword_5_0());
            	      			
            	    }
            	    // InternalCssDslParser.g:797:4: ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=Not && LA16_0<=Url)||(LA16_0>=No && LA16_0<=Ur)||LA16_0==FullStop||(LA16_0>=RULE_ONE_INT && LA16_0<=RULE_PLUS)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalCssDslParser.g:798:5: (lv_keyframeselectors_6_0= ruleKeyframeSelector )
            	            {
            	            // InternalCssDslParser.g:798:5: (lv_keyframeselectors_6_0= ruleKeyframeSelector )
            	            // InternalCssDslParser.g:799:6: lv_keyframeselectors_6_0= ruleKeyframeSelector
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_5_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_keyframeselectors_6_0=ruleKeyframeSelector();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getKeyframesRuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"keyframeselectors",
            	              							lv_keyframeselectors_6_0,
            	              							"org.eclipse.fx.ide.css.CssDsl.KeyframeSelector");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getKeyframesRuleAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyframesRule"


    // $ANTLR start "entryRuleKeyframeSelector"
    // InternalCssDslParser.g:825:1: entryRuleKeyframeSelector returns [EObject current=null] : iv_ruleKeyframeSelector= ruleKeyframeSelector EOF ;
    public final EObject entryRuleKeyframeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyframeSelector = null;


        try {
            // InternalCssDslParser.g:825:57: (iv_ruleKeyframeSelector= ruleKeyframeSelector EOF )
            // InternalCssDslParser.g:826:2: iv_ruleKeyframeSelector= ruleKeyframeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyframeSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyframeSelector=ruleKeyframeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyframeSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyframeSelector"


    // $ANTLR start "ruleKeyframeSelector"
    // InternalCssDslParser.g:832:1: ruleKeyframeSelector returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleKeyframeSelector() throws RecognitionException {
        EObject current = null;

        Token this_PERCENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_percentage_1_0 = null;

        EObject lv_declarations_4_0 = null;

        EObject lv_declarations_6_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:838:2: ( ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket ) )
            // InternalCssDslParser.g:839:2: ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket )
            {
            // InternalCssDslParser.g:839:2: ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket )
            // InternalCssDslParser.g:840:3: ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= LeftCurlyBracket ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= RightCurlyBracket
            {
            // InternalCssDslParser.g:840:3: ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=Not && LA18_1<=Url)||(LA18_1>=No && LA18_1<=Ur)||(LA18_1>=RULE_ONE_HEX_LETTER && LA18_1<=RULE_UNDERSCORE)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==FullStop||LA18_1==RULE_ONE_INT) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case RULE_UNDERSCORE:
                {
                alt18=1;
                }
                break;
            case FullStop:
            case RULE_ONE_INT:
            case RULE_PLUS:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCssDslParser.g:841:4: ( (lv_type_0_0= ruleIdentifier ) )
                    {
                    // InternalCssDslParser.g:841:4: ( (lv_type_0_0= ruleIdentifier ) )
                    // InternalCssDslParser.g:842:5: (lv_type_0_0= ruleIdentifier )
                    {
                    // InternalCssDslParser.g:842:5: (lv_type_0_0= ruleIdentifier )
                    // InternalCssDslParser.g:843:6: lv_type_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getKeyframeSelectorAccess().getTypeIdentifierParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_type_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getKeyframeSelectorRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_0_0,
                      							"org.eclipse.fx.ide.css.CssDsl.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:861:4: ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT )
                    {
                    // InternalCssDslParser.g:861:4: ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT )
                    // InternalCssDslParser.g:862:5: ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT
                    {
                    // InternalCssDslParser.g:862:5: ( (lv_percentage_1_0= ruleNum ) )
                    // InternalCssDslParser.g:863:6: (lv_percentage_1_0= ruleNum )
                    {
                    // InternalCssDslParser.g:863:6: (lv_percentage_1_0= ruleNum )
                    // InternalCssDslParser.g:864:7: lv_percentage_1_0= ruleNum
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getKeyframeSelectorAccess().getPercentageNumParserRuleCall_0_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_percentage_1_0=ruleNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getKeyframeSelectorRule());
                      							}
                      							set(
                      								current,
                      								"percentage",
                      								lv_percentage_1_0,
                      								"org.eclipse.fx.ide.css.CssDsl.Num");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    this_PERCENT_2=(Token)match(input,RULE_PERCENT,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_PERCENT_2, grammarAccess.getKeyframeSelectorAccess().getPERCENTTerminalRuleCall_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getKeyframeSelectorAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCssDslParser.g:891:3: ( (lv_declarations_4_0= ruleCssDeclaration ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=Not && LA19_0<=Url)||(LA19_0>=No && LA19_0<=Ur)||(LA19_0>=RULE_ONE_HEX_LETTER && LA19_0<=RULE_DASH)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCssDslParser.g:892:4: (lv_declarations_4_0= ruleCssDeclaration )
                    {
                    // InternalCssDslParser.g:892:4: (lv_declarations_4_0= ruleCssDeclaration )
                    // InternalCssDslParser.g:893:5: lv_declarations_4_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_4_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getKeyframeSelectorRule());
                      					}
                      					add(
                      						current,
                      						"declarations",
                      						lv_declarations_4_0,
                      						"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssDslParser.g:910:3: (otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Semicolon) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCssDslParser.g:911:4: otherlv_5= Semicolon ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getKeyframeSelectorAccess().getSemicolonKeyword_3_0());
            	      			
            	    }
            	    // InternalCssDslParser.g:915:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=Not && LA20_0<=Url)||(LA20_0>=No && LA20_0<=Ur)||(LA20_0>=RULE_ONE_HEX_LETTER && LA20_0<=RULE_DASH)) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalCssDslParser.g:916:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            {
            	            // InternalCssDslParser.g:916:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            // InternalCssDslParser.g:917:6: lv_declarations_6_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_3_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_6_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getKeyframeSelectorRule());
            	              						}
            	              						add(
            	              							current,
            	              							"declarations",
            	              							lv_declarations_6_0,
            	              							"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getKeyframeSelectorAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyframeSelector"


    // $ANTLR start "entryRuleRuleset"
    // InternalCssDslParser.g:943:1: entryRuleRuleset returns [EObject current=null] : iv_ruleRuleset= ruleRuleset EOF ;
    public final EObject entryRuleRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleset = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:945:2: (iv_ruleRuleset= ruleRuleset EOF )
            // InternalCssDslParser.g:946:2: iv_ruleRuleset= ruleRuleset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleset=ruleRuleset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleset; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRuleset"


    // $ANTLR start "ruleRuleset"
    // InternalCssDslParser.g:955:1: ruleRuleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= LeftCurlyBracket ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )? otherlv_10= RightCurlyBracket ) ;
    public final EObject ruleRuleset() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_COMMA_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_3_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_declarations_8_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:962:2: ( ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= LeftCurlyBracket ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )? otherlv_10= RightCurlyBracket ) )
            // InternalCssDslParser.g:963:2: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= LeftCurlyBracket ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )? otherlv_10= RightCurlyBracket )
            {
            // InternalCssDslParser.g:963:2: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= LeftCurlyBracket ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )? otherlv_10= RightCurlyBracket )
            // InternalCssDslParser.g:964:3: ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= LeftCurlyBracket ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )? otherlv_10= RightCurlyBracket
            {
            // InternalCssDslParser.g:964:3: ( (lv_selectors_0_0= ruleSelector ) )
            // InternalCssDslParser.g:965:4: (lv_selectors_0_0= ruleSelector )
            {
            // InternalCssDslParser.g:965:4: (lv_selectors_0_0= ruleSelector )
            // InternalCssDslParser.g:966:5: lv_selectors_0_0= ruleSelector
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_selectors_0_0=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRulesetRule());
              					}
              					add(
              						current,
              						"selectors",
              						lv_selectors_0_0,
              						"org.eclipse.fx.ide.css.CssDsl.Selector");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:983:3: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalCssDslParser.g:984:4: (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) )
            	    {
            	    // InternalCssDslParser.g:984:4: (this_WS_1= RULE_WS )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_WS) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalCssDslParser.g:985:5: this_WS_1= RULE_WS
            	    	    {
            	    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_WS_1, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_2, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalCssDslParser.g:994:4: ( (lv_selectors_3_0= ruleSelector ) )
            	    // InternalCssDslParser.g:995:5: (lv_selectors_3_0= ruleSelector )
            	    {
            	    // InternalCssDslParser.g:995:5: (lv_selectors_3_0= ruleSelector )
            	    // InternalCssDslParser.g:996:6: lv_selectors_3_0= ruleSelector
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_selectors_3_0=ruleSelector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRulesetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"selectors",
            	      							lv_selectors_3_0,
            	      							"org.eclipse.fx.ide.css.CssDsl.Selector");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalCssDslParser.g:1014:3: (this_WS_4= RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCssDslParser.g:1015:4: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_4, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,LeftCurlyBracket,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCssDslParser.g:1024:3: ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=Not && LA27_0<=Url)||(LA27_0>=No && LA27_0<=Ur)||(LA27_0>=RULE_ONE_HEX_LETTER && LA27_0<=RULE_DASH)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCssDslParser.g:1025:4: ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= Semicolon )?
                    {
                    // InternalCssDslParser.g:1025:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )
                    // InternalCssDslParser.g:1026:5: (lv_declarations_6_0= ruleCssDeclaration )
                    {
                    // InternalCssDslParser.g:1026:5: (lv_declarations_6_0= ruleCssDeclaration )
                    // InternalCssDslParser.g:1027:6: lv_declarations_6_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_6_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRulesetRule());
                      						}
                      						add(
                      							current,
                      							"declarations",
                      							lv_declarations_6_0,
                      							"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssDslParser.g:1044:4: (otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Semicolon) ) {
                            int LA25_1 = input.LA(2);

                            if ( ((LA25_1>=Not && LA25_1<=Url)||(LA25_1>=No && LA25_1<=Ur)||(LA25_1>=RULE_ONE_HEX_LETTER && LA25_1<=RULE_DASH)) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1045:5: otherlv_7= Semicolon ( (lv_declarations_8_0= ruleCssDeclaration ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Semicolon,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalCssDslParser.g:1049:5: ( (lv_declarations_8_0= ruleCssDeclaration ) )
                    	    // InternalCssDslParser.g:1050:6: (lv_declarations_8_0= ruleCssDeclaration )
                    	    {
                    	    // InternalCssDslParser.g:1050:6: (lv_declarations_8_0= ruleCssDeclaration )
                    	    // InternalCssDslParser.g:1051:7: lv_declarations_8_0= ruleCssDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_declarations_8_0=ruleCssDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRulesetRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"declarations",
                    	      								lv_declarations_8_0,
                    	      								"org.eclipse.fx.ide.css.CssDsl.CssDeclaration");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalCssDslParser.g:1069:4: (otherlv_9= Semicolon )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==Semicolon) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalCssDslParser.g:1070:5: otherlv_9= Semicolon
                            {
                            otherlv_9=(Token)match(input,Semicolon,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_9, grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRuleset"


    // $ANTLR start "entryRuleCssDeclaration"
    // InternalCssDslParser.g:1087:1: entryRuleCssDeclaration returns [EObject current=null] : iv_ruleCssDeclaration= ruleCssDeclaration EOF ;
    public final EObject entryRuleCssDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:1089:2: (iv_ruleCssDeclaration= ruleCssDeclaration EOF )
            // InternalCssDslParser.g:1090:2: iv_ruleCssDeclaration= ruleCssDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssDeclaration=ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCssDeclaration"


    // $ANTLR start "ruleCssDeclaration"
    // InternalCssDslParser.g:1099:1: ruleCssDeclaration returns [EObject current=null] : ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? ) ;
    public final EObject ruleCssDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token this_COLON_2=null;
        Token lv_important_4_0=null;
        EObject lv_property_0_0 = null;

        EObject lv_valueTokens_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:1106:2: ( ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? ) )
            // InternalCssDslParser.g:1107:2: ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? )
            {
            // InternalCssDslParser.g:1107:2: ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? )
            // InternalCssDslParser.g:1108:3: ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )?
            {
            // InternalCssDslParser.g:1108:3: ( (lv_property_0_0= ruleCssProperty ) )
            // InternalCssDslParser.g:1109:4: (lv_property_0_0= ruleCssProperty )
            {
            // InternalCssDslParser.g:1109:4: (lv_property_0_0= ruleCssProperty )
            // InternalCssDslParser.g:1110:5: lv_property_0_0= ruleCssProperty
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCssDeclarationAccess().getPropertyCssPropertyParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_property_0_0=ruleCssProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCssDeclarationRule());
              					}
              					set(
              						current,
              						"property",
              						lv_property_0_0,
              						"org.eclipse.fx.ide.css.CssDsl.CssProperty");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:1127:3: (this_WS_1= RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCssDslParser.g:1128:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getCssDeclarationAccess().getWSTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_COLON_2, grammarAccess.getCssDeclarationAccess().getCOLONTerminalRuleCall_2());
              		
            }
            // InternalCssDslParser.g:1137:3: ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalCssDslParser.g:1138:4: ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok )
            	    {
            	    // InternalCssDslParser.g:1142:4: (lv_valueTokens_3_0= ruleCssTok )
            	    // InternalCssDslParser.g:1143:5: lv_valueTokens_3_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCssDeclarationAccess().getValueTokensCssTokParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_valueTokens_3_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCssDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"valueTokens",
            	      						lv_valueTokens_3_0,
            	      						"org.eclipse.fx.ide.css.CssDsl.CssTok");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // InternalCssDslParser.g:1160:3: ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IMPORTANT_SYM) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCssDslParser.g:1161:4: (lv_important_4_0= RULE_IMPORTANT_SYM )
                    {
                    // InternalCssDslParser.g:1161:4: (lv_important_4_0= RULE_IMPORTANT_SYM )
                    // InternalCssDslParser.g:1162:5: lv_important_4_0= RULE_IMPORTANT_SYM
                    {
                    lv_important_4_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_important_4_0, grammarAccess.getCssDeclarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCssDeclarationRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"important",
                      						true,
                      						"org.eclipse.fx.ide.css.CssDsl.IMPORTANT_SYM");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCssDeclaration"


    // $ANTLR start "entryRuleSelector"
    // InternalCssDslParser.g:1185:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:1187:2: (iv_ruleSelector= ruleSelector EOF )
            // InternalCssDslParser.g:1188:2: iv_ruleSelector= ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalCssDslParser.g:1197:1: ruleSelector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_3_0 = null;

        AntlrDatatypeRuleToken lv_combinator_5_0 = null;

        EObject lv_selector_7_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:1204:2: ( ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? ) )
            // InternalCssDslParser.g:1205:2: ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? )
            {
            // InternalCssDslParser.g:1205:2: ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? )
            // InternalCssDslParser.g:1206:3: ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?
            {
            // InternalCssDslParser.g:1206:3: ( (lv_simpleselectors_0_0= ruleSimpleSelector ) )
            // InternalCssDslParser.g:1207:4: (lv_simpleselectors_0_0= ruleSimpleSelector )
            {
            // InternalCssDslParser.g:1207:4: (lv_simpleselectors_0_0= ruleSimpleSelector )
            // InternalCssDslParser.g:1208:5: lv_simpleselectors_0_0= ruleSimpleSelector
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimpleSelectorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_simpleselectors_0_0=ruleSimpleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSelectorRule());
              					}
              					add(
              						current,
              						"simpleselectors",
              						lv_simpleselectors_0_0,
              						"org.eclipse.fx.ide.css.CssDsl.SimpleSelector");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:1225:3: ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalCssDslParser.g:1226:4: ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) )
                    {
                    // InternalCssDslParser.g:1226:4: ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) )
                    // InternalCssDslParser.g:1227:5: ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) )
                    {
                    // InternalCssDslParser.g:1227:5: ( (lv_combinator_1_0= ruleCombinator ) )
                    // InternalCssDslParser.g:1228:6: (lv_combinator_1_0= ruleCombinator )
                    {
                    // InternalCssDslParser.g:1228:6: (lv_combinator_1_0= ruleCombinator )
                    // InternalCssDslParser.g:1229:7: lv_combinator_1_0= ruleCombinator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    lv_combinator_1_0=ruleCombinator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSelectorRule());
                      							}
                      							set(
                      								current,
                      								"combinator",
                      								lv_combinator_1_0,
                      								"org.eclipse.fx.ide.css.CssDsl.Combinator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCssDslParser.g:1246:5: (this_WS_2= RULE_WS )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_WS) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1247:6: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_WS_2, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // InternalCssDslParser.g:1252:5: ( (lv_selector_3_0= ruleSelector ) )
                    // InternalCssDslParser.g:1253:6: (lv_selector_3_0= ruleSelector )
                    {
                    // InternalCssDslParser.g:1253:6: (lv_selector_3_0= ruleSelector )
                    // InternalCssDslParser.g:1254:7: lv_selector_3_0= ruleSelector
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_selector_3_0=ruleSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSelectorRule());
                      							}
                      							set(
                      								current,
                      								"selector",
                      								lv_selector_3_0,
                      								"org.eclipse.fx.ide.css.CssDsl.Selector");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1273:4: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) )
                    {
                    // InternalCssDslParser.g:1273:4: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) )
                    // InternalCssDslParser.g:1274:5: (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) )
                    {
                    // InternalCssDslParser.g:1274:5: (this_WS_4= RULE_WS )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_WS) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1275:6: this_WS_4= RULE_WS
                    	    {
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_WS_4, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    // InternalCssDslParser.g:1280:5: ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GreaterThanSign||LA34_0==Tilde||LA34_0==RULE_PLUS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalCssDslParser.g:1281:6: ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )*
                            {
                            // InternalCssDslParser.g:1281:6: ( (lv_combinator_5_0= ruleCombinator ) )
                            // InternalCssDslParser.g:1282:7: (lv_combinator_5_0= ruleCombinator )
                            {
                            // InternalCssDslParser.g:1282:7: (lv_combinator_5_0= ruleCombinator )
                            // InternalCssDslParser.g:1283:8: lv_combinator_5_0= ruleCombinator
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_28);
                            lv_combinator_5_0=ruleCombinator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getSelectorRule());
                              								}
                              								set(
                              									current,
                              									"combinator",
                              									lv_combinator_5_0,
                              									"org.eclipse.fx.ide.css.CssDsl.Combinator");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalCssDslParser.g:1300:6: (this_WS_6= RULE_WS )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_WS) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalCssDslParser.g:1301:7: this_WS_6= RULE_WS
                            	    {
                            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_6, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1());
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalCssDslParser.g:1307:5: ( (lv_selector_7_0= ruleSelector ) )
                    // InternalCssDslParser.g:1308:6: (lv_selector_7_0= ruleSelector )
                    {
                    // InternalCssDslParser.g:1308:6: (lv_selector_7_0= ruleSelector )
                    // InternalCssDslParser.g:1309:7: lv_selector_7_0= ruleSelector
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_selector_7_0=ruleSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSelectorRule());
                      							}
                      							set(
                      								current,
                      								"selector",
                      								lv_selector_7_0,
                      								"org.eclipse.fx.ide.css.CssDsl.Selector");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSimpleSelectorForNegation"
    // InternalCssDslParser.g:1335:1: entryRuleSimpleSelectorForNegation returns [EObject current=null] : iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF ;
    public final EObject entryRuleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelectorForNegation = null;


        try {
            // InternalCssDslParser.g:1335:66: (iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF )
            // InternalCssDslParser.g:1336:2: iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSelectorForNegation=ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelectorForNegation"


    // $ANTLR start "ruleSimpleSelectorForNegation"
    // InternalCssDslParser.g:1342:1: ruleSimpleSelectorForNegation returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) ;
    public final EObject ruleSimpleSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1348:2: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) )
            // InternalCssDslParser.g:1349:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            {
            // InternalCssDslParser.g:1349:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=Not && LA39_0<=Url)||(LA39_0>=No && LA39_0<=Ur)||LA39_0==Asterisk||LA39_0==VerticalLine||(LA39_0>=RULE_ONE_HEX_LETTER && LA39_0<=RULE_DASH)) ) {
                alt39=1;
            }
            else if ( (LA39_0==FullStop||LA39_0==LeftSquareBracket||LA39_0==RULE_HASHMARK||LA39_0==RULE_COLON) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCssDslParser.g:1350:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    {
                    // InternalCssDslParser.g:1350:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    // InternalCssDslParser.g:1351:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    {
                    // InternalCssDslParser.g:1351:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // InternalCssDslParser.g:1352:5: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // InternalCssDslParser.g:1352:5: ( (lv_element_0_0= ruleElementSelector ) )
                            // InternalCssDslParser.g:1353:6: (lv_element_0_0= ruleElementSelector )
                            {
                            // InternalCssDslParser.g:1353:6: (lv_element_0_0= ruleElementSelector )
                            // InternalCssDslParser.g:1354:7: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                              							}
                              							set(
                              								current,
                              								"element",
                              								lv_element_0_0,
                              								"org.eclipse.fx.ide.css.CssDsl.ElementSelector");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCssDslParser.g:1372:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // InternalCssDslParser.g:1372:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // InternalCssDslParser.g:1373:6: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // InternalCssDslParser.g:1373:6: (lv_universal_1_0= ruleUniversalSelector )
                            // InternalCssDslParser.g:1374:7: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                              							}
                              							set(
                              								current,
                              								"universal",
                              								lv_universal_1_0,
                              								"org.eclipse.fx.ide.css.CssDsl.UniversalSelector");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalCssDslParser.g:1392:4: ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==FullStop||LA37_0==LeftSquareBracket||LA37_0==RULE_HASHMARK||LA37_0==RULE_COLON) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1393:5: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    {
                    	    // InternalCssDslParser.g:1393:5: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    // InternalCssDslParser.g:1394:6: lv_subSelectors_2_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_subSelectors_2_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"subSelectors",
                    	      							lv_subSelectors_2_0,
                    	      							"org.eclipse.fx.ide.css.CssDsl.SubSelectorForNegation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1413:3: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    {
                    // InternalCssDslParser.g:1413:3: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_HASHMARK) && (synpred2_InternalCssDslParser())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==FullStop) && (synpred2_InternalCssDslParser())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==LeftSquareBracket) && (synpred2_InternalCssDslParser())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==RULE_COLON) && (synpred2_InternalCssDslParser())) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1414:4: ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    {
                    	    // InternalCssDslParser.g:1418:4: (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    // InternalCssDslParser.g:1419:5: lv_subSelectors_3_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_subSelectors_3_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElementForParent(grammarAccess.getSimpleSelectorForNegationRule());
                    	      					}
                    	      					add(
                    	      						current,
                    	      						"subSelectors",
                    	      						lv_subSelectors_3_0,
                    	      						"org.eclipse.fx.ide.css.CssDsl.SubSelectorForNegation");
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSelectorForNegation"


    // $ANTLR start "entryRuleSubSelectorForNegation"
    // InternalCssDslParser.g:1440:1: entryRuleSubSelectorForNegation returns [EObject current=null] : iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF ;
    public final EObject entryRuleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelectorForNegation = null;


        try {
            // InternalCssDslParser.g:1440:63: (iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF )
            // InternalCssDslParser.g:1441:2: iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubSelectorForNegation=ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelectorForNegation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSelectorForNegation"


    // $ANTLR start "ruleSubSelectorForNegation"
    // InternalCssDslParser.g:1447:1: ruleSubSelectorForNegation returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final EObject ruleSubSelectorForNegation() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClass_3 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1453:2: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // InternalCssDslParser.g:1454:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // InternalCssDslParser.g:1454:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt40=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt40=1;
                }
                break;
            case FullStop:
                {
                alt40=2;
                }
                break;
            case LeftSquareBracket:
                {
                alt40=3;
                }
                break;
            case RULE_COLON:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalCssDslParser.g:1455:3: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdSelector_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1464:3: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassSelector_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1473:3: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeSelector_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1482:3: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClass_3=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClass_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubSelectorForNegation"


    // $ANTLR start "entryRuleSimpleSelector"
    // InternalCssDslParser.g:1494:1: entryRuleSimpleSelector returns [EObject current=null] : iv_ruleSimpleSelector= ruleSimpleSelector EOF ;
    public final EObject entryRuleSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1496:2: (iv_ruleSimpleSelector= ruleSimpleSelector EOF )
            // InternalCssDslParser.g:1497:2: iv_ruleSimpleSelector= ruleSimpleSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSelector=ruleSimpleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelector"


    // $ANTLR start "ruleSimpleSelector"
    // InternalCssDslParser.g:1506:1: ruleSimpleSelector returns [EObject current=null] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final EObject ruleSimpleSelector() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_universal_1_0 = null;

        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1513:2: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // InternalCssDslParser.g:1514:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // InternalCssDslParser.g:1514:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=Not && LA44_0<=Url)||(LA44_0>=No && LA44_0<=Ur)||LA44_0==Asterisk||LA44_0==VerticalLine||(LA44_0>=RULE_ONE_HEX_LETTER && LA44_0<=RULE_DASH)) ) {
                alt44=1;
            }
            else if ( (LA44_0==FullStop||LA44_0==LeftSquareBracket||LA44_0==RULE_HASHMARK||LA44_0==RULE_COLON) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalCssDslParser.g:1515:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // InternalCssDslParser.g:1515:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // InternalCssDslParser.g:1516:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // InternalCssDslParser.g:1516:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // InternalCssDslParser.g:1517:5: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // InternalCssDslParser.g:1517:5: ( (lv_element_0_0= ruleElementSelector ) )
                            // InternalCssDslParser.g:1518:6: (lv_element_0_0= ruleElementSelector )
                            {
                            // InternalCssDslParser.g:1518:6: (lv_element_0_0= ruleElementSelector )
                            // InternalCssDslParser.g:1519:7: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleSelectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleSelectorRule());
                              							}
                              							set(
                              								current,
                              								"element",
                              								lv_element_0_0,
                              								"org.eclipse.fx.ide.css.CssDsl.ElementSelector");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCssDslParser.g:1537:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // InternalCssDslParser.g:1537:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // InternalCssDslParser.g:1538:6: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // InternalCssDslParser.g:1538:6: (lv_universal_1_0= ruleUniversalSelector )
                            // InternalCssDslParser.g:1539:7: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSimpleSelectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSimpleSelectorRule());
                              							}
                              							set(
                              								current,
                              								"universal",
                              								lv_universal_1_0,
                              								"org.eclipse.fx.ide.css.CssDsl.UniversalSelector");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalCssDslParser.g:1557:4: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==FullStop||LA42_0==LeftSquareBracket||LA42_0==RULE_HASHMARK||LA42_0==RULE_COLON) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1558:5: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // InternalCssDslParser.g:1558:5: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // InternalCssDslParser.g:1559:6: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_subSelectors_2_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSimpleSelectorRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"subSelectors",
                    	      							lv_subSelectors_2_0,
                    	      							"org.eclipse.fx.ide.css.CssDsl.SubSelector");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1578:3: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // InternalCssDslParser.g:1578:3: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==FullStop||LA43_0==LeftSquareBracket||LA43_0==RULE_HASHMARK||LA43_0==RULE_COLON) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1579:4: (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // InternalCssDslParser.g:1579:4: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // InternalCssDslParser.g:1580:5: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_subSelectors_3_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElementForParent(grammarAccess.getSimpleSelectorRule());
                    	      					}
                    	      					add(
                    	      						current,
                    	      						"subSelectors",
                    	      						lv_subSelectors_3_0,
                    	      						"org.eclipse.fx.ide.css.CssDsl.SubSelector");
                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSimpleSelector"


    // $ANTLR start "entryRuleSubSelector"
    // InternalCssDslParser.g:1604:1: entryRuleSubSelector returns [EObject current=null] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final EObject entryRuleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSelector = null;


        try {
            // InternalCssDslParser.g:1604:52: (iv_ruleSubSelector= ruleSubSelector EOF )
            // InternalCssDslParser.g:1605:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubSelector=ruleSubSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // InternalCssDslParser.g:1611:1: ruleSubSelector returns [EObject current=null] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) ;
    public final EObject ruleSubSelector() throws RecognitionException {
        EObject current = null;

        EObject this_IdSelector_0 = null;

        EObject this_ClassSelector_1 = null;

        EObject this_AttributeSelector_2 = null;

        EObject this_PseudoClassOrFunc_3 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1617:2: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) )
            // InternalCssDslParser.g:1618:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            {
            // InternalCssDslParser.g:1618:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            int alt45=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt45=1;
                }
                break;
            case FullStop:
                {
                alt45=2;
                }
                break;
            case LeftSquareBracket:
                {
                alt45=3;
                }
                break;
            case RULE_COLON:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalCssDslParser.g:1619:3: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdSelector_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1628:3: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassSelector_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1637:3: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeSelector_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1646:3: this_PseudoClassOrFunc_3= rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClassOrFunc_3=rulePseudoClassOrFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClassOrFunc_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalCssDslParser.g:1658:1: entryRuleAttributeSelector returns [EObject current=null] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final EObject entryRuleAttributeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSelector = null;


        try {
            // InternalCssDslParser.g:1658:58: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // InternalCssDslParser.g:1659:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeSelector=ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalCssDslParser.g:1665:1: ruleAttributeSelector returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleAttributeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_1 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1671:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalCssDslParser.g:1672:2: ( () otherlv_1= LeftSquareBracket ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalCssDslParser.g:1672:2: ( () otherlv_1= LeftSquareBracket ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= RightSquareBracket )
            // InternalCssDslParser.g:1673:3: () otherlv_1= LeftSquareBracket ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalCssDslParser.g:1673:3: ()
            // InternalCssDslParser.g:1674:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalCssDslParser.g:1684:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalCssDslParser.g:1685:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:1685:4: (lv_name_2_0= ruleIdentifier )
            // InternalCssDslParser.g:1686:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:1703:3: ( ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=DollarSignEqualsSign && LA48_0<=AsteriskEqualsSign)||LA48_0==CircumflexAccentEqualsSign||LA48_0==EqualsSign||(LA48_0>=RULE_INCLUDES && LA48_0<=RULE_DASHMATCH)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCssDslParser.g:1704:4: ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    {
                    // InternalCssDslParser.g:1704:4: ( ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // InternalCssDslParser.g:1705:5: ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // InternalCssDslParser.g:1705:5: ( (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // InternalCssDslParser.g:1706:6: (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // InternalCssDslParser.g:1706:6: (lv_op_3_1= CircumflexAccentEqualsSign | lv_op_3_2= DollarSignEqualsSign | lv_op_3_3= AsteriskEqualsSign | lv_op_3_4= EqualsSign | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt46=6;
                    switch ( input.LA(1) ) {
                    case CircumflexAccentEqualsSign:
                        {
                        alt46=1;
                        }
                        break;
                    case DollarSignEqualsSign:
                        {
                        alt46=2;
                        }
                        break;
                    case AsteriskEqualsSign:
                        {
                        alt46=3;
                        }
                        break;
                    case EqualsSign:
                        {
                        alt46=4;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt46=5;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt46=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }

                    switch (alt46) {
                        case 1 :
                            // InternalCssDslParser.g:1707:7: lv_op_3_1= CircumflexAccentEqualsSign
                            {
                            lv_op_3_1=(Token)match(input,CircumflexAccentEqualsSign,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_1, grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_3_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalCssDslParser.g:1718:7: lv_op_3_2= DollarSignEqualsSign
                            {
                            lv_op_3_2=(Token)match(input,DollarSignEqualsSign,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_2, grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_3_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalCssDslParser.g:1729:7: lv_op_3_3= AsteriskEqualsSign
                            {
                            lv_op_3_3=(Token)match(input,AsteriskEqualsSign,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_3, grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_3_3, null);
                              						
                            }

                            }
                            break;
                        case 4 :
                            // InternalCssDslParser.g:1740:7: lv_op_3_4= EqualsSign
                            {
                            lv_op_3_4=(Token)match(input,EqualsSign,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_4, grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_3_4, null);
                              						
                            }

                            }
                            break;
                        case 5 :
                            // InternalCssDslParser.g:1751:7: lv_op_3_5= RULE_INCLUDES
                            {
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_5, grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"op",
                              								lv_op_3_5,
                              								"org.eclipse.fx.ide.css.CssDsl.INCLUDES");
                              						
                            }

                            }
                            break;
                        case 6 :
                            // InternalCssDslParser.g:1766:7: lv_op_3_6= RULE_DASHMATCH
                            {
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_3_6, grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"op",
                              								lv_op_3_6,
                              								"org.eclipse.fx.ide.css.CssDsl.DASHMATCH");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalCssDslParser.g:1783:4: ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    // InternalCssDslParser.g:1784:5: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    {
                    // InternalCssDslParser.g:1784:5: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    // InternalCssDslParser.g:1785:6: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    {
                    // InternalCssDslParser.g:1785:6: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=Not && LA47_0<=Url)||(LA47_0>=No && LA47_0<=Ur)||(LA47_0>=RULE_ONE_HEX_LETTER && LA47_0<=RULE_DASH)) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_CSSSTRING) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalCssDslParser.g:1786:7: lv_value_4_1= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            lv_value_4_1=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAttributeSelectorRule());
                              							}
                              							set(
                              								current,
                              								"value",
                              								lv_value_4_1,
                              								"org.eclipse.fx.ide.css.CssDsl.Identifier");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalCssDslParser.g:1802:7: lv_value_4_2= RULE_CSSSTRING
                            {
                            lv_value_4_2=(Token)match(input,RULE_CSSSTRING,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_4_2, grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAttributeSelectorRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"value",
                              								lv_value_4_2,
                              								"org.eclipse.fx.ide.css.CssDsl.CSSSTRING");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // InternalCssDslParser.g:1828:1: entryRuleClassSelector returns [EObject current=null] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final EObject entryRuleClassSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassSelector = null;


        try {
            // InternalCssDslParser.g:1828:54: (iv_ruleClassSelector= ruleClassSelector EOF )
            // InternalCssDslParser.g:1829:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassSelector=ruleClassSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // InternalCssDslParser.g:1835:1: ruleClassSelector returns [EObject current=null] : ( () otherlv_1= FullStop ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleClassSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1841:2: ( ( () otherlv_1= FullStop ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // InternalCssDslParser.g:1842:2: ( () otherlv_1= FullStop ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // InternalCssDslParser.g:1842:2: ( () otherlv_1= FullStop ( (lv_name_2_0= ruleIdentifier ) ) )
            // InternalCssDslParser.g:1843:3: () otherlv_1= FullStop ( (lv_name_2_0= ruleIdentifier ) )
            {
            // InternalCssDslParser.g:1843:3: ()
            // InternalCssDslParser.g:1844:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getClassSelectorAccess().getClassSelectorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassSelectorAccess().getFullStopKeyword_1());
              		
            }
            // InternalCssDslParser.g:1854:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalCssDslParser.g:1855:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:1855:4: (lv_name_2_0= ruleIdentifier )
            // InternalCssDslParser.g:1856:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassSelectorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalCssDslParser.g:1877:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // InternalCssDslParser.g:1877:56: (iv_ruleElementSelector= ruleElementSelector EOF )
            // InternalCssDslParser.g:1878:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalCssDslParser.g:1884:1: ruleElementSelector returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1890:2: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalCssDslParser.g:1891:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalCssDslParser.g:1891:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalCssDslParser.g:1892:3: () ( (lv_name_1_0= ruleIdentifier ) )
            {
            // InternalCssDslParser.g:1892:3: ()
            // InternalCssDslParser.g:1893:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:1899:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalCssDslParser.g:1900:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:1900:4: (lv_name_1_0= ruleIdentifier )
            // InternalCssDslParser.g:1901:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementSelectorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // InternalCssDslParser.g:1922:1: entryRuleUniversalSelector returns [EObject current=null] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final EObject entryRuleUniversalSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalSelector = null;


        try {
            // InternalCssDslParser.g:1922:58: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // InternalCssDslParser.g:1923:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUniversalSelector=ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniversalSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // InternalCssDslParser.g:1929:1: ruleUniversalSelector returns [EObject current=null] : ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= Asterisk ) ;
    public final EObject ruleUniversalSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1935:2: ( ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= Asterisk ) )
            // InternalCssDslParser.g:1936:2: ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= Asterisk )
            {
            // InternalCssDslParser.g:1936:2: ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= Asterisk )
            // InternalCssDslParser.g:1937:3: () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= Asterisk
            {
            // InternalCssDslParser.g:1937:3: ()
            // InternalCssDslParser.g:1938:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:1944:3: ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=Not && LA49_0<=Url)||(LA49_0>=No && LA49_0<=Ur)||LA49_0==VerticalLine||(LA49_0>=RULE_ONE_HEX_LETTER && LA49_0<=RULE_DASH)) ) {
                alt49=1;
            }
            else if ( (LA49_0==Asterisk) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==VerticalLine) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalCssDslParser.g:1945:4: (lv_namespace_1_0= ruleCssNamespacePrefix )
                    {
                    // InternalCssDslParser.g:1945:4: (lv_namespace_1_0= ruleCssNamespacePrefix )
                    // InternalCssDslParser.g:1946:5: lv_namespace_1_0= ruleCssNamespacePrefix
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getUniversalSelectorAccess().getNamespaceCssNamespacePrefixParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    lv_namespace_1_0=ruleCssNamespacePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getUniversalSelectorRule());
                      					}
                      					set(
                      						current,
                      						"namespace",
                      						lv_namespace_1_0,
                      						"org.eclipse.fx.ide.css.CssDsl.CssNamespacePrefix");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // InternalCssDslParser.g:1971:1: entryRuleIdSelector returns [EObject current=null] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final EObject entryRuleIdSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdSelector = null;


        try {
            // InternalCssDslParser.g:1971:51: (iv_ruleIdSelector= ruleIdSelector EOF )
            // InternalCssDslParser.g:1972:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdSelector=ruleIdSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // InternalCssDslParser.g:1978:1: ruleIdSelector returns [EObject current=null] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final EObject ruleIdSelector() throws RecognitionException {
        EObject current = null;

        Token this_HASHMARK_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:1984:2: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // InternalCssDslParser.g:1985:2: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // InternalCssDslParser.g:1985:2: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            // InternalCssDslParser.g:1986:3: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) )
            {
            // InternalCssDslParser.g:1986:3: ()
            // InternalCssDslParser.g:1987:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIdSelectorAccess().getIdSelectorAction_0(),
              					current);
              			
            }

            }

            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASHMARK_1, grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1());
              		
            }
            // InternalCssDslParser.g:1997:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalCssDslParser.g:1998:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:1998:4: (lv_name_2_0= ruleIdentifier )
            // InternalCssDslParser.g:1999:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIdSelectorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRuleCssNamespacePrefix"
    // InternalCssDslParser.g:2020:1: entryRuleCssNamespacePrefix returns [String current=null] : iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF ;
    public final String entryRuleCssNamespacePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCssNamespacePrefix = null;


        try {
            // InternalCssDslParser.g:2020:58: (iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF )
            // InternalCssDslParser.g:2021:2: iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssNamespacePrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssNamespacePrefix=ruleCssNamespacePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssNamespacePrefix.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssNamespacePrefix"


    // $ANTLR start "ruleCssNamespacePrefix"
    // InternalCssDslParser.g:2027:1: ruleCssNamespacePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Identifier_0= ruleIdentifier | kw= Asterisk )? kw= VerticalLine ) ;
    public final AntlrDatatypeRuleToken ruleCssNamespacePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2033:2: ( ( (this_Identifier_0= ruleIdentifier | kw= Asterisk )? kw= VerticalLine ) )
            // InternalCssDslParser.g:2034:2: ( (this_Identifier_0= ruleIdentifier | kw= Asterisk )? kw= VerticalLine )
            {
            // InternalCssDslParser.g:2034:2: ( (this_Identifier_0= ruleIdentifier | kw= Asterisk )? kw= VerticalLine )
            // InternalCssDslParser.g:2035:3: (this_Identifier_0= ruleIdentifier | kw= Asterisk )? kw= VerticalLine
            {
            // InternalCssDslParser.g:2035:3: (this_Identifier_0= ruleIdentifier | kw= Asterisk )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=Not && LA50_0<=Url)||(LA50_0>=No && LA50_0<=Ur)||(LA50_0>=RULE_ONE_HEX_LETTER && LA50_0<=RULE_DASH)) ) {
                alt50=1;
            }
            else if ( (LA50_0==Asterisk) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // InternalCssDslParser.g:2036:4: this_Identifier_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCssNamespacePrefixAccess().getIdentifierParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_Identifier_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Identifier_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2047:4: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCssNamespacePrefixAccess().getAsteriskKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,VerticalLine,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCssNamespacePrefixAccess().getVerticalLineKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssNamespacePrefix"


    // $ANTLR start "entryRuleCssProperty"
    // InternalCssDslParser.g:2062:1: entryRuleCssProperty returns [EObject current=null] : iv_ruleCssProperty= ruleCssProperty EOF ;
    public final EObject entryRuleCssProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssProperty = null;


        try {
            // InternalCssDslParser.g:2062:52: (iv_ruleCssProperty= ruleCssProperty EOF )
            // InternalCssDslParser.g:2063:2: iv_ruleCssProperty= ruleCssProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssProperty=ruleCssProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssProperty"


    // $ANTLR start "ruleCssProperty"
    // InternalCssDslParser.g:2069:1: ruleCssProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final EObject ruleCssProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2075:2: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // InternalCssDslParser.g:2076:2: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // InternalCssDslParser.g:2076:2: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // InternalCssDslParser.g:2077:3: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // InternalCssDslParser.g:2077:3: ()
            // InternalCssDslParser.g:2078:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCssPropertyAccess().getCssPropertyAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2084:3: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // InternalCssDslParser.g:2085:4: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // InternalCssDslParser.g:2085:4: (lv_name_1_0= ruleValidPropertyIdent )
            // InternalCssDslParser.g:2086:5: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCssPropertyAccess().getNameValidPropertyIdentParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCssPropertyRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.ValidPropertyIdent");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssProperty"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // InternalCssDslParser.g:2107:1: entryRuleValidPropertyIdent returns [String current=null] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final String entryRuleValidPropertyIdent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidPropertyIdent = null;


        try {
            // InternalCssDslParser.g:2107:58: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // InternalCssDslParser.g:2108:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // InternalCssDslParser.g:2114:1: ruleValidPropertyIdent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleValidPropertyIdent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2120:2: (this_Identifier_0= ruleIdentifier )
            // InternalCssDslParser.g:2121:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClassOrFunc"
    // InternalCssDslParser.g:2134:1: entryRulePseudoClassOrFunc returns [EObject current=null] : iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF ;
    public final EObject entryRulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassOrFunc = null;


        try {
            // InternalCssDslParser.g:2134:58: (iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF )
            // InternalCssDslParser.g:2135:2: iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClassOrFunc=rulePseudoClassOrFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassOrFunc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassOrFunc"


    // $ANTLR start "rulePseudoClassOrFunc"
    // InternalCssDslParser.g:2141:1: rulePseudoClassOrFunc returns [EObject current=null] : (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) ;
    public final EObject rulePseudoClassOrFunc() throws RecognitionException {
        EObject current = null;

        EObject this_PseudoClass_0 = null;

        EObject this_PseudoClassFunction_1 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2147:2: ( (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) )
            // InternalCssDslParser.g:2148:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            {
            // InternalCssDslParser.g:2148:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalCssDslParser.g:2149:3: this_PseudoClass_0= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClass_0=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2158:3: this_PseudoClassFunction_1= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClassFunction_1=rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClassFunction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassOrFunc"


    // $ANTLR start "entryRulePseudoClass"
    // InternalCssDslParser.g:2170:1: entryRulePseudoClass returns [EObject current=null] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final EObject entryRulePseudoClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClass = null;


        try {
            // InternalCssDslParser.g:2170:52: (iv_rulePseudoClass= rulePseudoClass EOF )
            // InternalCssDslParser.g:2171:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClass=rulePseudoClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // InternalCssDslParser.g:2177:1: rulePseudoClass returns [EObject current=null] : (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) ) ;
    public final EObject rulePseudoClass() throws RecognitionException {
        EObject current = null;

        Token this_COLON_0=null;
        Token this_COLON_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2183:2: ( (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) ) )
            // InternalCssDslParser.g:2184:2: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) )
            {
            // InternalCssDslParser.g:2184:2: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) )
            // InternalCssDslParser.g:2185:3: this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) )
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_COLON_0, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0());
              		
            }
            // InternalCssDslParser.g:2189:3: (this_COLON_1= RULE_COLON )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_COLON) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCssDslParser.g:2190:4: this_COLON_1= RULE_COLON
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_1, grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCssDslParser.g:2195:3: ( (lv_name_2_0= rulePseudoClassName ) )
            // InternalCssDslParser.g:2196:4: (lv_name_2_0= rulePseudoClassName )
            {
            // InternalCssDslParser.g:2196:4: (lv_name_2_0= rulePseudoClassName )
            // InternalCssDslParser.g:2197:5: lv_name_2_0= rulePseudoClassName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPseudoClassAccess().getNamePseudoClassNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPseudoClassRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.CssDsl.PseudoClassName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // InternalCssDslParser.g:2218:1: entryRulePseudoClassName returns [String current=null] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final String entryRulePseudoClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePseudoClassName = null;


        try {
            // InternalCssDslParser.g:2218:55: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // InternalCssDslParser.g:2219:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // InternalCssDslParser.g:2225:1: rulePseudoClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken rulePseudoClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2231:2: (this_Identifier_0= ruleIdentifier )
            // InternalCssDslParser.g:2232:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPseudoClassNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // InternalCssDslParser.g:2245:1: entryRulePseudoClassFunction returns [EObject current=null] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final EObject entryRulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassFunction = null;


        try {
            // InternalCssDslParser.g:2245:60: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // InternalCssDslParser.g:2246:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClassFunction=rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // InternalCssDslParser.g:2252:1: rulePseudoClassFunction returns [EObject current=null] : ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis ) ) ;
    public final EObject rulePseudoClassFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_not_0_0 = null;

        EObject lv_paramSelector_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_params_6_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2258:2: ( ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis ) ) )
            // InternalCssDslParser.g:2259:2: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis ) )
            {
            // InternalCssDslParser.g:2259:2: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_COLON) ) {
                int LA54_1 = input.LA(2);

                if ( ((LA54_1>=Not && LA54_1<=Url)||(LA54_1>=No && LA54_1<=Ur)||(LA54_1>=RULE_ONE_HEX_LETTER && LA54_1<=RULE_DASH)) ) {
                    alt54=2;
                }
                else if ( (LA54_1==Not_1) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCssDslParser.g:2260:3: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis )
                    {
                    // InternalCssDslParser.g:2260:3: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis )
                    // InternalCssDslParser.g:2261:4: ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= RightParenthesis
                    {
                    // InternalCssDslParser.g:2261:4: ( (lv_not_0_0= ruleNotFunctionCall ) )
                    // InternalCssDslParser.g:2262:5: (lv_not_0_0= ruleNotFunctionCall )
                    {
                    // InternalCssDslParser.g:2262:5: (lv_not_0_0= ruleNotFunctionCall )
                    // InternalCssDslParser.g:2263:6: lv_not_0_0= ruleNotFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_not_0_0=ruleNotFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      						}
                      						set(
                      							current,
                      							"not",
                      							true,
                      							"org.eclipse.fx.ide.css.CssDsl.NotFunctionCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssDslParser.g:2280:4: ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) )
                    // InternalCssDslParser.g:2281:5: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    {
                    // InternalCssDslParser.g:2281:5: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    // InternalCssDslParser.g:2282:6: lv_paramSelector_1_0= ruleSimpleSelectorForNegation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_paramSelector_1_0=ruleSimpleSelectorForNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      						}
                      						set(
                      							current,
                      							"paramSelector",
                      							lv_paramSelector_1_0,
                      							"org.eclipse.fx.ide.css.CssDsl.SimpleSelectorForNegation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2305:3: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis )
                    {
                    // InternalCssDslParser.g:2305:3: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis )
                    // InternalCssDslParser.g:2306:4: this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= LeftParenthesis ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= RightParenthesis
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_3, grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0());
                      			
                    }
                    // InternalCssDslParser.g:2310:4: ( (lv_name_4_0= ruleIdentifier ) )
                    // InternalCssDslParser.g:2311:5: (lv_name_4_0= ruleIdentifier )
                    {
                    // InternalCssDslParser.g:2311:5: (lv_name_4_0= ruleIdentifier )
                    // InternalCssDslParser.g:2312:6: lv_name_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_name_4_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_4_0,
                      							"org.eclipse.fx.ide.css.CssDsl.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2());
                      			
                    }
                    // InternalCssDslParser.g:2333:4: ( (lv_params_6_0= ruleCssTok ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=Url_1 && LA53_0<=Url)||(LA53_0>=No && LA53_0<=Ur)||LA53_0==FullStop||(LA53_0>=RULE_ONE_INT && LA53_0<=RULE_PERCENT)||(LA53_0>=RULE_WS && LA53_0<=RULE_CSSSTRING)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalCssDslParser.g:2334:5: (lv_params_6_0= ruleCssTok )
                    	    {
                    	    // InternalCssDslParser.g:2334:5: (lv_params_6_0= ruleCssTok )
                    	    // InternalCssDslParser.g:2335:6: lv_params_6_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_params_6_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getPseudoClassFunctionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"params",
                    	      							lv_params_6_0,
                    	      							"org.eclipse.fx.ide.css.CssDsl.CssTok");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRuleNotFunctionCall"
    // InternalCssDslParser.g:2361:1: entryRuleNotFunctionCall returns [String current=null] : iv_ruleNotFunctionCall= ruleNotFunctionCall EOF ;
    public final String entryRuleNotFunctionCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotFunctionCall = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2363:2: (iv_ruleNotFunctionCall= ruleNotFunctionCall EOF )
            // InternalCssDslParser.g:2364:2: iv_ruleNotFunctionCall= ruleNotFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotFunctionCall=ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotFunctionCall.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNotFunctionCall"


    // $ANTLR start "ruleNotFunctionCall"
    // InternalCssDslParser.g:2373:1: ruleNotFunctionCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_COLON_0= RULE_COLON kw= Not_1 ) ;
    public final AntlrDatatypeRuleToken ruleNotFunctionCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COLON_0=null;
        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2380:2: ( (this_COLON_0= RULE_COLON kw= Not_1 ) )
            // InternalCssDslParser.g:2381:2: (this_COLON_0= RULE_COLON kw= Not_1 )
            {
            // InternalCssDslParser.g:2381:2: (this_COLON_0= RULE_COLON kw= Not_1 )
            // InternalCssDslParser.g:2382:3: this_COLON_0= RULE_COLON kw= Not_1
            {
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_COLON_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_COLON_0, grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,Not_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getNotFunctionCallAccess().getNotKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNotFunctionCall"


    // $ANTLR start "entryRuleCombinator"
    // InternalCssDslParser.g:2401:1: entryRuleCombinator returns [String current=null] : iv_ruleCombinator= ruleCombinator EOF ;
    public final String entryRuleCombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCombinator = null;


        try {
            // InternalCssDslParser.g:2401:50: (iv_ruleCombinator= ruleCombinator EOF )
            // InternalCssDslParser.g:2402:2: iv_ruleCombinator= ruleCombinator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinator=ruleCombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinator"


    // $ANTLR start "ruleCombinator"
    // InternalCssDslParser.g:2408:1: ruleCombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | kw= GreaterThanSign | kw= Tilde ) ;
    public final AntlrDatatypeRuleToken ruleCombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:2414:2: ( (this_PLUS_0= RULE_PLUS | kw= GreaterThanSign | kw= Tilde ) )
            // InternalCssDslParser.g:2415:2: (this_PLUS_0= RULE_PLUS | kw= GreaterThanSign | kw= Tilde )
            {
            // InternalCssDslParser.g:2415:2: (this_PLUS_0= RULE_PLUS | kw= GreaterThanSign | kw= Tilde )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt55=1;
                }
                break;
            case GreaterThanSign:
                {
                alt55=2;
                }
                break;
            case Tilde:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalCssDslParser.g:2416:3: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PLUS_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_PLUS_0, grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2424:3: kw= GreaterThanSign
                    {
                    kw=(Token)match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2430:3: kw= Tilde
                    {
                    kw=(Token)match(input,Tilde,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCombinatorAccess().getTildeKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCombinator"


    // $ANTLR start "entryRuleSymbolTok"
    // InternalCssDslParser.g:2439:1: entryRuleSymbolTok returns [EObject current=null] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final EObject entryRuleSymbolTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolTok = null;


        try {
            // InternalCssDslParser.g:2439:50: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // InternalCssDslParser.g:2440:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbolTok=ruleSymbolTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // InternalCssDslParser.g:2446:1: ruleSymbolTok returns [EObject current=null] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final EObject ruleSymbolTok() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:2452:2: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // InternalCssDslParser.g:2453:2: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // InternalCssDslParser.g:2453:2: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // InternalCssDslParser.g:2454:3: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // InternalCssDslParser.g:2454:3: ()
            // InternalCssDslParser.g:2455:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSymbolTokAccess().getSymbolTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2461:3: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // InternalCssDslParser.g:2462:4: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // InternalCssDslParser.g:2462:4: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // InternalCssDslParser.g:2463:5: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // InternalCssDslParser.g:2463:5: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_COMMA) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_PERCENT) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalCssDslParser.g:2464:6: lv_symbol_1_1= RULE_COMMA
                    {
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_1_1, grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSymbolTokRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"symbol",
                      							lv_symbol_1_1,
                      							"org.eclipse.fx.ide.css.CssDsl.COMMA");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2479:6: lv_symbol_1_2= RULE_PERCENT
                    {
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_1_2, grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSymbolTokRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"symbol",
                      							lv_symbol_1_2,
                      							"org.eclipse.fx.ide.css.CssDsl.PERCENT");
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // InternalCssDslParser.g:2500:1: entryRuleWSTok returns [EObject current=null] : iv_ruleWSTok= ruleWSTok EOF ;
    public final EObject entryRuleWSTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2502:2: (iv_ruleWSTok= ruleWSTok EOF )
            // InternalCssDslParser.g:2503:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWSTok=ruleWSTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWSTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // InternalCssDslParser.g:2512:1: ruleWSTok returns [EObject current=null] : ( () this_WS_1= RULE_WS ) ;
    public final EObject ruleWSTok() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2519:2: ( ( () this_WS_1= RULE_WS ) )
            // InternalCssDslParser.g:2520:2: ( () this_WS_1= RULE_WS )
            {
            // InternalCssDslParser.g:2520:2: ( () this_WS_1= RULE_WS )
            // InternalCssDslParser.g:2521:3: () this_WS_1= RULE_WS
            {
            // InternalCssDslParser.g:2521:3: ()
            // InternalCssDslParser.g:2522:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWSTokAccess().getWSTokAction_0(),
              					current);
              			
            }

            }

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WS_1, grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // InternalCssDslParser.g:2539:1: entryRuleStringTok returns [EObject current=null] : iv_ruleStringTok= ruleStringTok EOF ;
    public final EObject entryRuleStringTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTok = null;


        try {
            // InternalCssDslParser.g:2539:50: (iv_ruleStringTok= ruleStringTok EOF )
            // InternalCssDslParser.g:2540:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringTok=ruleStringTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // InternalCssDslParser.g:2546:1: ruleStringTok returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) ;
    public final EObject ruleStringTok() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:2552:2: ( ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) )
            // InternalCssDslParser.g:2553:2: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            {
            // InternalCssDslParser.g:2553:2: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            // InternalCssDslParser.g:2554:3: () ( (lv_value_1_0= RULE_CSSSTRING ) )
            {
            // InternalCssDslParser.g:2554:3: ()
            // InternalCssDslParser.g:2555:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringTokAccess().getStringTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2561:3: ( (lv_value_1_0= RULE_CSSSTRING ) )
            // InternalCssDslParser.g:2562:4: (lv_value_1_0= RULE_CSSSTRING )
            {
            // InternalCssDslParser.g:2562:4: (lv_value_1_0= RULE_CSSSTRING )
            // InternalCssDslParser.g:2563:5: lv_value_1_0= RULE_CSSSTRING
            {
            lv_value_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringTokRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.CSSSTRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleNumberTok"
    // InternalCssDslParser.g:2583:1: entryRuleNumberTok returns [EObject current=null] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final EObject entryRuleNumberTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2585:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // InternalCssDslParser.g:2586:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberTok=ruleNumberTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // InternalCssDslParser.g:2595:1: ruleNumberTok returns [EObject current=null] : ( () ( (lv_val_1_0= ruleNum ) ) ) ;
    public final EObject ruleNumberTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2602:2: ( ( () ( (lv_val_1_0= ruleNum ) ) ) )
            // InternalCssDslParser.g:2603:2: ( () ( (lv_val_1_0= ruleNum ) ) )
            {
            // InternalCssDslParser.g:2603:2: ( () ( (lv_val_1_0= ruleNum ) ) )
            // InternalCssDslParser.g:2604:3: () ( (lv_val_1_0= ruleNum ) )
            {
            // InternalCssDslParser.g:2604:3: ()
            // InternalCssDslParser.g:2605:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNumberTokAccess().getNumberTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2611:3: ( (lv_val_1_0= ruleNum ) )
            // InternalCssDslParser.g:2612:4: (lv_val_1_0= ruleNum )
            {
            // InternalCssDslParser.g:2612:4: (lv_val_1_0= ruleNum )
            // InternalCssDslParser.g:2613:5: lv_val_1_0= ruleNum
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNumberTokRule());
              					}
              					set(
              						current,
              						"val",
              						lv_val_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.Num");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleUrlTok"
    // InternalCssDslParser.g:2637:1: entryRuleUrlTok returns [EObject current=null] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final EObject entryRuleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTok = null;


        try {
            // InternalCssDslParser.g:2637:47: (iv_ruleUrlTok= ruleUrlTok EOF )
            // InternalCssDslParser.g:2638:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUrlTok=ruleUrlTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUrlTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // InternalCssDslParser.g:2644:1: ruleUrlTok returns [EObject current=null] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final EObject ruleUrlTok() throws RecognitionException {
        EObject current = null;

        EObject lv_url_1_0 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2650:2: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // InternalCssDslParser.g:2651:2: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // InternalCssDslParser.g:2651:2: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // InternalCssDslParser.g:2652:3: () ( (lv_url_1_0= ruleURLType ) )
            {
            // InternalCssDslParser.g:2652:3: ()
            // InternalCssDslParser.g:2653:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUrlTokAccess().getUrlTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2659:3: ( (lv_url_1_0= ruleURLType ) )
            // InternalCssDslParser.g:2660:4: (lv_url_1_0= ruleURLType )
            {
            // InternalCssDslParser.g:2660:4: (lv_url_1_0= ruleURLType )
            // InternalCssDslParser.g:2661:5: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_url_1_0=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getUrlTokRule());
              					}
              					set(
              						current,
              						"url",
              						lv_url_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.URLType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // InternalCssDslParser.g:2682:1: entryRuleColorTok returns [EObject current=null] : iv_ruleColorTok= ruleColorTok EOF ;
    public final EObject entryRuleColorTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2684:2: (iv_ruleColorTok= ruleColorTok EOF )
            // InternalCssDslParser.g:2685:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColorTok=ruleColorTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColorTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // InternalCssDslParser.g:2694:1: ruleColorTok returns [EObject current=null] : ( () ( (lv_value_1_0= ruleHex ) ) ) ;
    public final EObject ruleColorTok() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2701:2: ( ( () ( (lv_value_1_0= ruleHex ) ) ) )
            // InternalCssDslParser.g:2702:2: ( () ( (lv_value_1_0= ruleHex ) ) )
            {
            // InternalCssDslParser.g:2702:2: ( () ( (lv_value_1_0= ruleHex ) ) )
            // InternalCssDslParser.g:2703:3: () ( (lv_value_1_0= ruleHex ) )
            {
            // InternalCssDslParser.g:2703:3: ()
            // InternalCssDslParser.g:2704:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getColorTokAccess().getColorTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2710:3: ( (lv_value_1_0= ruleHex ) )
            // InternalCssDslParser.g:2711:4: (lv_value_1_0= ruleHex )
            {
            // InternalCssDslParser.g:2711:4: (lv_value_1_0= ruleHex )
            // InternalCssDslParser.g:2712:5: lv_value_1_0= ruleHex
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getColorTokRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.Hex");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleIdentifierOrFuncTok"
    // InternalCssDslParser.g:2736:1: entryRuleIdentifierOrFuncTok returns [EObject current=null] : iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF ;
    public final EObject entryRuleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierOrFuncTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2738:2: (iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF )
            // InternalCssDslParser.g:2739:2: iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierOrFuncTok=ruleIdentifierOrFuncTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierOrFuncTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierOrFuncTok"


    // $ANTLR start "ruleIdentifierOrFuncTok"
    // InternalCssDslParser.g:2748:1: ruleIdentifierOrFuncTok returns [EObject current=null] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )? ) ;
    public final EObject ruleIdentifierOrFuncTok() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2755:2: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )? ) )
            // InternalCssDslParser.g:2756:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )? )
            {
            // InternalCssDslParser.g:2756:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )? )
            // InternalCssDslParser.g:2757:3: () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )?
            {
            // InternalCssDslParser.g:2757:3: ()
            // InternalCssDslParser.g:2758:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0(),
              					current);
              			
            }

            }

            // InternalCssDslParser.g:2764:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalCssDslParser.g:2765:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalCssDslParser.g:2765:4: (lv_name_1_0= ruleIdentifier )
            // InternalCssDslParser.g:2766:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssDslParser.g:2783:3: ( () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LeftParenthesis) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCssDslParser.g:2784:4: () otherlv_3= LeftParenthesis ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= RightParenthesis
                    {
                    // InternalCssDslParser.g:2784:4: ()
                    // InternalCssDslParser.g:2785:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,LeftParenthesis,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalCssDslParser.g:2795:4: ( (lv_params_4_0= ruleCssTok ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=Url_1 && LA57_0<=Url)||(LA57_0>=No && LA57_0<=Ur)||LA57_0==FullStop||(LA57_0>=RULE_ONE_INT && LA57_0<=RULE_PERCENT)||(LA57_0>=RULE_WS && LA57_0<=RULE_CSSSTRING)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalCssDslParser.g:2796:5: (lv_params_4_0= ruleCssTok )
                    	    {
                    	    // InternalCssDslParser.g:2796:5: (lv_params_4_0= ruleCssTok )
                    	    // InternalCssDslParser.g:2797:6: lv_params_4_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_params_4_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIdentifierOrFuncTokRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"params",
                    	      							lv_params_4_0,
                    	      							"org.eclipse.fx.ide.css.CssDsl.CssTok");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifierOrFuncTok"


    // $ANTLR start "entryRuleCssTok"
    // InternalCssDslParser.g:2826:1: entryRuleCssTok returns [EObject current=null] : iv_ruleCssTok= ruleCssTok EOF ;
    public final EObject entryRuleCssTok() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2828:2: (iv_ruleCssTok= ruleCssTok EOF )
            // InternalCssDslParser.g:2829:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssTok=ruleCssTok();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssTok; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // InternalCssDslParser.g:2838:1: ruleCssTok returns [EObject current=null] : (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) ;
    public final EObject ruleCssTok() throws RecognitionException {
        EObject current = null;

        EObject this_IdentifierOrFuncTok_0 = null;

        EObject this_SymbolTok_1 = null;

        EObject this_WSTok_2 = null;

        EObject this_StringTok_3 = null;

        EObject this_NumberTok_4 = null;

        EObject this_UrlTok_5 = null;

        EObject this_ColorTok_6 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2845:2: ( (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) )
            // InternalCssDslParser.g:2846:2: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            {
            // InternalCssDslParser.g:2846:2: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            int alt59=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA59_1 = input.LA(2);

                if ( ((LA59_1>=Not && LA59_1<=Url)||(LA59_1>=No && LA59_1<=Ur)||(LA59_1>=RULE_ONE_HEX_LETTER && LA59_1<=RULE_UNDERSCORE)) ) {
                    alt59=1;
                }
                else if ( (LA59_1==FullStop||LA59_1==RULE_ONE_INT) ) {
                    alt59=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case RULE_UNDERSCORE:
                {
                alt59=1;
                }
                break;
            case RULE_COMMA:
            case RULE_PERCENT:
                {
                alt59=2;
                }
                break;
            case RULE_WS:
                {
                alt59=3;
                }
                break;
            case RULE_CSSSTRING:
                {
                alt59=4;
                }
                break;
            case FullStop:
            case RULE_ONE_INT:
            case RULE_PLUS:
                {
                alt59=5;
                }
                break;
            case Url_1:
                {
                alt59=6;
                }
                break;
            case RULE_HASHMARK:
                {
                alt59=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalCssDslParser.g:2847:3: this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdentifierOrFuncTok_0=ruleIdentifierOrFuncTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdentifierOrFuncTok_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2856:3: this_SymbolTok_1= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolTok_1=ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolTok_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2865:3: this_WSTok_2= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WSTok_2=ruleWSTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WSTok_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:2874:3: this_StringTok_3= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringTok_3=ruleStringTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringTok_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:2883:3: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberTok_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:2892:3: this_UrlTok_5= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UrlTok_5=ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UrlTok_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCssDslParser.g:2901:3: this_ColorTok_6= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorTok_6=ruleColorTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorTok_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRuleURLType"
    // InternalCssDslParser.g:2916:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2918:2: (iv_ruleURLType= ruleURLType EOF )
            // InternalCssDslParser.g:2919:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleURLType=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // InternalCssDslParser.g:2928:1: ruleURLType returns [EObject current=null] : (otherlv_0= Url_1 ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_url_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:2935:2: ( (otherlv_0= Url_1 ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= RightParenthesis ) )
            // InternalCssDslParser.g:2936:2: (otherlv_0= Url_1 ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= RightParenthesis )
            {
            // InternalCssDslParser.g:2936:2: (otherlv_0= Url_1 ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= RightParenthesis )
            // InternalCssDslParser.g:2937:3: otherlv_0= Url_1 ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,Url_1,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
              		
            }
            // InternalCssDslParser.g:2941:3: ( (lv_url_1_0= ruleValidURL ) )
            // InternalCssDslParser.g:2942:4: (lv_url_1_0= ruleValidURL )
            {
            // InternalCssDslParser.g:2942:4: (lv_url_1_0= ruleValidURL )
            // InternalCssDslParser.g:2943:5: lv_url_1_0= ruleValidURL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_url_1_0=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getURLTypeRule());
              					}
              					set(
              						current,
              						"url",
              						lv_url_1_0,
              						"org.eclipse.fx.ide.css.CssDsl.ValidURL");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleValidURLSymbol"
    // InternalCssDslParser.g:2971:1: entryRuleValidURLSymbol returns [String current=null] : iv_ruleValidURLSymbol= ruleValidURLSymbol EOF ;
    public final String entryRuleValidURLSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURLSymbol = null;


        try {
            // InternalCssDslParser.g:2971:54: (iv_ruleValidURLSymbol= ruleValidURLSymbol EOF )
            // InternalCssDslParser.g:2972:2: iv_ruleValidURLSymbol= ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidURLSymbol=ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURLSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidURLSymbol"


    // $ANTLR start "ruleValidURLSymbol"
    // InternalCssDslParser.g:2978:1: ruleValidURLSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | kw= FullStop | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= Tilde | this_COLON_4= RULE_COLON | kw= Solidus | kw= QuestionMark | this_HASHMARK_7= RULE_HASHMARK | kw= LeftSquareBracket | kw= RightSquareBracket | kw= CommercialAt | kw= ExclamationMark | kw= DollarSign | kw= Ampersand | kw= Asterisk | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= Semicolon | (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack ) ) ;
    public final AntlrDatatypeRuleToken ruleValidURLSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token kw=null;
        Token this_UNDERSCORE_2=null;
        Token this_COLON_4=null;
        Token this_HASHMARK_7=null;
        Token this_PLUS_15=null;
        Token this_COMMA_16=null;
        AntlrDatatypeRuleToken this_KeywordHack_19 = null;



        	enterRule();

        try {
            // InternalCssDslParser.g:2984:2: ( (this_DASH_0= RULE_DASH | kw= FullStop | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= Tilde | this_COLON_4= RULE_COLON | kw= Solidus | kw= QuestionMark | this_HASHMARK_7= RULE_HASHMARK | kw= LeftSquareBracket | kw= RightSquareBracket | kw= CommercialAt | kw= ExclamationMark | kw= DollarSign | kw= Ampersand | kw= Asterisk | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= Semicolon | (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack ) ) )
            // InternalCssDslParser.g:2985:2: (this_DASH_0= RULE_DASH | kw= FullStop | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= Tilde | this_COLON_4= RULE_COLON | kw= Solidus | kw= QuestionMark | this_HASHMARK_7= RULE_HASHMARK | kw= LeftSquareBracket | kw= RightSquareBracket | kw= CommercialAt | kw= ExclamationMark | kw= DollarSign | kw= Ampersand | kw= Asterisk | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= Semicolon | (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack ) )
            {
            // InternalCssDslParser.g:2985:2: (this_DASH_0= RULE_DASH | kw= FullStop | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= Tilde | this_COLON_4= RULE_COLON | kw= Solidus | kw= QuestionMark | this_HASHMARK_7= RULE_HASHMARK | kw= LeftSquareBracket | kw= RightSquareBracket | kw= CommercialAt | kw= ExclamationMark | kw= DollarSign | kw= Ampersand | kw= Asterisk | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= Semicolon | (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack ) )
            int alt60=19;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                alt60=1;
                }
                break;
            case FullStop:
                {
                alt60=2;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt60=3;
                }
                break;
            case Tilde:
                {
                alt60=4;
                }
                break;
            case RULE_COLON:
                {
                alt60=5;
                }
                break;
            case Solidus:
                {
                alt60=6;
                }
                break;
            case QuestionMark:
                {
                alt60=7;
                }
                break;
            case RULE_HASHMARK:
                {
                alt60=8;
                }
                break;
            case LeftSquareBracket:
                {
                alt60=9;
                }
                break;
            case RightSquareBracket:
                {
                alt60=10;
                }
                break;
            case CommercialAt:
                {
                alt60=11;
                }
                break;
            case ExclamationMark:
                {
                alt60=12;
                }
                break;
            case DollarSign:
                {
                alt60=13;
                }
                break;
            case Ampersand:
                {
                alt60=14;
                }
                break;
            case Asterisk:
                {
                alt60=15;
                }
                break;
            case RULE_PLUS:
                {
                alt60=16;
                }
                break;
            case RULE_COMMA:
                {
                alt60=17;
                }
                break;
            case Semicolon:
                {
                alt60=18;
                }
                break;
            case EqualsSign:
                {
                alt60=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalCssDslParser.g:2986:3: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DASH_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DASH_0, grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2994:3: kw= FullStop
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:3000:3: this_UNDERSCORE_2= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UNDERSCORE_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_UNDERSCORE_2, grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:3008:3: kw= Tilde
                    {
                    kw=(Token)match(input,Tilde,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:3014:3: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_COLON_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_COLON_4, grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:3022:3: kw= Solidus
                    {
                    kw=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCssDslParser.g:3028:3: kw= QuestionMark
                    {
                    kw=(Token)match(input,QuestionMark,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalCssDslParser.g:3034:3: this_HASHMARK_7= RULE_HASHMARK
                    {
                    this_HASHMARK_7=(Token)match(input,RULE_HASHMARK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HASHMARK_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HASHMARK_7, grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalCssDslParser.g:3042:3: kw= LeftSquareBracket
                    {
                    kw=(Token)match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalCssDslParser.g:3048:3: kw= RightSquareBracket
                    {
                    kw=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalCssDslParser.g:3054:3: kw= CommercialAt
                    {
                    kw=(Token)match(input,CommercialAt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalCssDslParser.g:3060:3: kw= ExclamationMark
                    {
                    kw=(Token)match(input,ExclamationMark,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalCssDslParser.g:3066:3: kw= DollarSign
                    {
                    kw=(Token)match(input,DollarSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalCssDslParser.g:3072:3: kw= Ampersand
                    {
                    kw=(Token)match(input,Ampersand,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalCssDslParser.g:3078:3: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalCssDslParser.g:3084:3: this_PLUS_15= RULE_PLUS
                    {
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PLUS_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_PLUS_15, grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalCssDslParser.g:3092:3: this_COMMA_16= RULE_COMMA
                    {
                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_COMMA_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_COMMA_16, grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalCssDslParser.g:3100:3: kw= Semicolon
                    {
                    kw=(Token)match(input,Semicolon,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalCssDslParser.g:3106:3: (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack )
                    {
                    // InternalCssDslParser.g:3106:3: (kw= EqualsSign this_KeywordHack_19= ruleKeywordHack )
                    // InternalCssDslParser.g:3107:4: kw= EqualsSign this_KeywordHack_19= ruleKeywordHack
                    {
                    kw=(Token)match(input,EqualsSign,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_KeywordHack_19=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_KeywordHack_19);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleKeywordHack"
    // InternalCssDslParser.g:3127:1: entryRuleKeywordHack returns [String current=null] : iv_ruleKeywordHack= ruleKeywordHack EOF ;
    public final String entryRuleKeywordHack() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeywordHack = null;


        try {
            // InternalCssDslParser.g:3127:51: (iv_ruleKeywordHack= ruleKeywordHack EOF )
            // InternalCssDslParser.g:3128:2: iv_ruleKeywordHack= ruleKeywordHack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeywordHackRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeywordHack=ruleKeywordHack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeywordHack.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywordHack"


    // $ANTLR start "ruleKeywordHack"
    // InternalCssDslParser.g:3134:1: ruleKeywordHack returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Not | kw= No | kw= Url | kw= Ur ) ;
    public final AntlrDatatypeRuleToken ruleKeywordHack() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:3140:2: ( (kw= Not | kw= No | kw= Url | kw= Ur ) )
            // InternalCssDslParser.g:3141:2: (kw= Not | kw= No | kw= Url | kw= Ur )
            {
            // InternalCssDslParser.g:3141:2: (kw= Not | kw= No | kw= Url | kw= Ur )
            int alt61=4;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt61=1;
                }
                break;
            case No:
                {
                alt61=2;
                }
                break;
            case Url:
                {
                alt61=3;
                }
                break;
            case Ur:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalCssDslParser.g:3142:3: kw= Not
                    {
                    kw=(Token)match(input,Not,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNotKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:3148:3: kw= No
                    {
                    kw=(Token)match(input,No,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordHackAccess().getNoKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:3154:3: kw= Url
                    {
                    kw=(Token)match(input,Url,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrlKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:3160:3: kw= Ur
                    {
                    kw=(Token)match(input,Ur,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKeywordHackAccess().getUrKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeywordHack"


    // $ANTLR start "entryRuleValidURL"
    // InternalCssDslParser.g:3169:1: entryRuleValidURL returns [String current=null] : iv_ruleValidURL= ruleValidURL EOF ;
    public final String entryRuleValidURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidURL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3171:2: (iv_ruleValidURL= ruleValidURL EOF )
            // InternalCssDslParser.g:3172:2: iv_ruleValidURL= ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidURLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidURL=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleValidURL"


    // $ANTLR start "ruleValidURL"
    // InternalCssDslParser.g:3181:1: ruleValidURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleValidURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CSSSTRING_0=null;
        Token this_ONE_HEX_LETTER_3=null;
        Token this_ONE_NON_HEX_LETTER_4=null;
        Token this_ONE_INT_5=null;
        Token kw=null;
        Token this_PERCENT_11=null;
        Token this_ONE_INT_12=null;
        Token this_ONE_HEX_LETTER_13=null;
        Token this_ONE_INT_14=null;
        Token this_ONE_HEX_LETTER_15=null;
        AntlrDatatypeRuleToken this_ValidURLSymbol_1 = null;

        AntlrDatatypeRuleToken this_KeywordHack_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3188:2: ( (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) )
            // InternalCssDslParser.g:3189:2: (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            {
            // InternalCssDslParser.g:3189:2: (this_CSSSTRING_0= RULE_CSSSTRING | (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_CSSSTRING) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=Not && LA65_0<=Url)||(LA65_0>=ReverseSolidusSpace && LA65_0<=ReverseSolidusRightParenthesis)||(LA65_0>=No && LA65_0<=Ampersand)||(LA65_0>=Asterisk && LA65_0<=EqualsSign)||(LA65_0>=QuestionMark && LA65_0<=RightSquareBracket)||LA65_0==Tilde||(LA65_0>=RULE_ONE_INT && LA65_0<=RULE_PERCENT)||LA65_0==RULE_COLON) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalCssDslParser.g:3190:3: this_CSSSTRING_0= RULE_CSSSTRING
                    {
                    this_CSSSTRING_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CSSSTRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CSSSTRING_0, grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:3198:3: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    {
                    // InternalCssDslParser.g:3198:3: (this_ValidURLSymbol_1= ruleValidURLSymbol | this_KeywordHack_2= ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= ReverseSolidusSpace | kw= ReverseSolidusLeftParenthesis | kw= ReverseSolidusRightParenthesis | kw= ReverseSolidusApostrophe | kw= ReverseSolidusQuotationMark | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=12;
                        switch ( input.LA(1) ) {
                        case ExclamationMark:
                        case DollarSign:
                        case Ampersand:
                        case Asterisk:
                        case FullStop:
                        case Solidus:
                        case Semicolon:
                        case EqualsSign:
                        case QuestionMark:
                        case CommercialAt:
                        case LeftSquareBracket:
                        case RightSquareBracket:
                        case Tilde:
                        case RULE_UNDERSCORE:
                        case RULE_DASH:
                        case RULE_PLUS:
                        case RULE_HASHMARK:
                        case RULE_COMMA:
                        case RULE_COLON:
                            {
                            alt64=1;
                            }
                            break;
                        case Not:
                        case Url:
                        case No:
                        case Ur:
                            {
                            alt64=2;
                            }
                            break;
                        case RULE_ONE_HEX_LETTER:
                            {
                            alt64=3;
                            }
                            break;
                        case RULE_ONE_NON_HEX_LETTER:
                            {
                            alt64=4;
                            }
                            break;
                        case RULE_ONE_INT:
                            {
                            alt64=5;
                            }
                            break;
                        case ReverseSolidusSpace:
                            {
                            alt64=6;
                            }
                            break;
                        case ReverseSolidusLeftParenthesis:
                            {
                            alt64=7;
                            }
                            break;
                        case ReverseSolidusRightParenthesis:
                            {
                            alt64=8;
                            }
                            break;
                        case ReverseSolidusApostrophe:
                            {
                            alt64=9;
                            }
                            break;
                        case ReverseSolidusQuotationMark:
                            {
                            alt64=10;
                            }
                            break;
                        case RULE_PERCENT:
                            {
                            alt64=11;
                            }
                            break;

                        }

                        switch (alt64) {
                    	case 1 :
                    	    // InternalCssDslParser.g:3199:4: this_ValidURLSymbol_1= ruleValidURLSymbol
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				newCompositeNode(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    this_ValidURLSymbol_1=ruleValidURLSymbol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_ValidURLSymbol_1);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				afterParserOrEnumRuleCall();
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCssDslParser.g:3210:4: this_KeywordHack_2= ruleKeywordHack
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				newCompositeNode(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    this_KeywordHack_2=ruleKeywordHack();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_KeywordHack_2);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				afterParserOrEnumRuleCall();
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalCssDslParser.g:3221:4: this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER
                    	    {
                    	    this_ONE_HEX_LETTER_3=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_ONE_HEX_LETTER_3);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_ONE_HEX_LETTER_3, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalCssDslParser.g:3229:4: this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER
                    	    {
                    	    this_ONE_NON_HEX_LETTER_4=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_ONE_NON_HEX_LETTER_4);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_ONE_NON_HEX_LETTER_4, grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalCssDslParser.g:3237:4: this_ONE_INT_5= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_5=(Token)match(input,RULE_ONE_INT,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(this_ONE_INT_5);
                    	      			
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_ONE_INT_5, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalCssDslParser.g:3245:4: kw= ReverseSolidusSpace
                    	    {
                    	    kw=(Token)match(input,ReverseSolidusSpace,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalCssDslParser.g:3251:4: kw= ReverseSolidusLeftParenthesis
                    	    {
                    	    kw=(Token)match(input,ReverseSolidusLeftParenthesis,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalCssDslParser.g:3257:4: kw= ReverseSolidusRightParenthesis
                    	    {
                    	    kw=(Token)match(input,ReverseSolidusRightParenthesis,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalCssDslParser.g:3263:4: kw= ReverseSolidusApostrophe
                    	    {
                    	    kw=(Token)match(input,ReverseSolidusApostrophe,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // InternalCssDslParser.g:3269:4: kw= ReverseSolidusQuotationMark
                    	    {
                    	    kw=(Token)match(input,ReverseSolidusQuotationMark,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				current.merge(kw);
                    	      				newLeafNode(kw, grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9());
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 11 :
                    	    // InternalCssDslParser.g:3275:4: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    {
                    	    // InternalCssDslParser.g:3275:4: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    // InternalCssDslParser.g:3276:5: this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    {
                    	    this_PERCENT_11=(Token)match(input,RULE_PERCENT,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_PERCENT_11);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_PERCENT_11, grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0());
                    	      				
                    	    }
                    	    // InternalCssDslParser.g:3283:5: (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER )
                    	    int alt62=2;
                    	    int LA62_0 = input.LA(1);

                    	    if ( (LA62_0==RULE_ONE_INT) ) {
                    	        alt62=1;
                    	    }
                    	    else if ( (LA62_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt62=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 62, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt62) {
                    	        case 1 :
                    	            // InternalCssDslParser.g:3284:6: this_ONE_INT_12= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_12=(Token)match(input,RULE_ONE_INT,FOLLOW_45); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_ONE_INT_12);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_ONE_INT_12, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalCssDslParser.g:3292:6: this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_13=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_45); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_ONE_HEX_LETTER_13);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_ONE_HEX_LETTER_13, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalCssDslParser.g:3300:5: (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    int alt63=2;
                    	    int LA63_0 = input.LA(1);

                    	    if ( (LA63_0==RULE_ONE_INT) ) {
                    	        alt63=1;
                    	    }
                    	    else if ( (LA63_0==RULE_ONE_HEX_LETTER) ) {
                    	        alt63=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 63, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt63) {
                    	        case 1 :
                    	            // InternalCssDslParser.g:3301:6: this_ONE_INT_14= RULE_ONE_INT
                    	            {
                    	            this_ONE_INT_14=(Token)match(input,RULE_ONE_INT,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_ONE_INT_14);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_ONE_INT_14, grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalCssDslParser.g:3309:6: this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER
                    	            {
                    	            this_ONE_HEX_LETTER_15=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_ONE_HEX_LETTER_15);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_ONE_HEX_LETTER_15, grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleValidURL"


    // $ANTLR start "entryRuleIdentifier"
    // InternalCssDslParser.g:3326:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3328:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalCssDslParser.g:3329:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalCssDslParser.g:3338:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token this_UNDERSCORE_5=null;
        Token this_DASH_6=null;
        Token this_ONE_HEX_LETTER_7=null;
        Token this_ONE_NON_HEX_LETTER_8=null;
        Token this_ONE_INT_9=null;
        AntlrDatatypeRuleToken this_KeywordHack_4 = null;

        AntlrDatatypeRuleToken this_KeywordHack_10 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3345:2: ( ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* ) )
            // InternalCssDslParser.g:3346:2: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            {
            // InternalCssDslParser.g:3346:2: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )* )
            // InternalCssDslParser.g:3347:3: (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            {
            // InternalCssDslParser.g:3347:3: (this_DASH_0= RULE_DASH )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DASH) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCssDslParser.g:3348:4: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_0, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0());
                      			
                    }

                    }
                    break;

            }

            // InternalCssDslParser.g:3356:3: (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | this_KeywordHack_4= ruleKeywordHack )
            int alt67=4;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt67=1;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt67=2;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt67=3;
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalCssDslParser.g:3357:4: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UNDERSCORE_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNDERSCORE_1, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:3365:4: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    {
                    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ONE_HEX_LETTER_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:3373:4: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    {
                    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ONE_NON_HEX_LETTER_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ONE_NON_HEX_LETTER_3, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:3381:4: this_KeywordHack_4= ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_KeywordHack_4=ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_KeywordHack_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalCssDslParser.g:3392:3: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*
            loop69:
            do {
                int alt69=2;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // InternalCssDslParser.g:3393:4: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    {
            	    // InternalCssDslParser.g:3407:4: (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack )
            	    int alt68=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_UNDERSCORE:
            	        {
            	        alt68=1;
            	        }
            	        break;
            	    case RULE_DASH:
            	        {
            	        alt68=2;
            	        }
            	        break;
            	    case RULE_ONE_HEX_LETTER:
            	        {
            	        alt68=3;
            	        }
            	        break;
            	    case RULE_ONE_NON_HEX_LETTER:
            	        {
            	        alt68=4;
            	        }
            	        break;
            	    case RULE_ONE_INT:
            	        {
            	        alt68=5;
            	        }
            	        break;
            	    case Not:
            	    case Url:
            	    case No:
            	    case Ur:
            	        {
            	        alt68=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt68) {
            	        case 1 :
            	            // InternalCssDslParser.g:3408:5: this_UNDERSCORE_5= RULE_UNDERSCORE
            	            {
            	            this_UNDERSCORE_5=(Token)match(input,RULE_UNDERSCORE,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_UNDERSCORE_5);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_UNDERSCORE_5, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCssDslParser.g:3416:5: this_DASH_6= RULE_DASH
            	            {
            	            this_DASH_6=(Token)match(input,RULE_DASH,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_DASH_6);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_DASH_6, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1());
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalCssDslParser.g:3424:5: this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_7=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ONE_HEX_LETTER_7);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ONE_HEX_LETTER_7, grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2());
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalCssDslParser.g:3432:5: this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER
            	            {
            	            this_ONE_NON_HEX_LETTER_8=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ONE_NON_HEX_LETTER_8);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ONE_NON_HEX_LETTER_8, grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3());
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalCssDslParser.g:3440:5: this_ONE_INT_9= RULE_ONE_INT
            	            {
            	            this_ONE_INT_9=(Token)match(input,RULE_ONE_INT,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ONE_INT_9);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ONE_INT_9, grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4());
            	              				
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalCssDslParser.g:3448:5: this_KeywordHack_10= ruleKeywordHack
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5());
            	              				
            	            }
            	            pushFollow(FOLLOW_46);
            	            this_KeywordHack_10=ruleKeywordHack();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_KeywordHack_10);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNum"
    // InternalCssDslParser.g:3467:1: entryRuleNum returns [String current=null] : iv_ruleNum= ruleNum EOF ;
    public final String entryRuleNum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNum = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3469:2: (iv_ruleNum= ruleNum EOF )
            // InternalCssDslParser.g:3470:2: iv_ruleNum= ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNum=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNum.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalCssDslParser.g:3479:1: ruleNum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) ;
    public final AntlrDatatypeRuleToken ruleNum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        Token kw=null;
        Token this_ONE_INT_3=null;
        Token this_ONE_INT_4=null;
        Token this_ONE_INT_6=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:3486:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) )
            // InternalCssDslParser.g:3487:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            {
            // InternalCssDslParser.g:3487:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            // InternalCssDslParser.g:3488:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            {
            // InternalCssDslParser.g:3488:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_PLUS) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_DASH) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // InternalCssDslParser.g:3489:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:3497:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCssDslParser.g:3505:3: ( (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==FullStop) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ONE_INT) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalCssDslParser.g:3506:4: (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    {
                    // InternalCssDslParser.g:3506:4: (kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    // InternalCssDslParser.g:3507:5: kw= FullStop ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_0_0());
                      				
                    }
                    // InternalCssDslParser.g:3512:5: ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_ONE_INT) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred4_InternalCssDslParser()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalCssDslParser.g:3513:6: ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_3=(Token)match(input,RULE_ONE_INT,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ONE_INT_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_ONE_INT_3, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:3524:4: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    {
                    // InternalCssDslParser.g:3524:4: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    // InternalCssDslParser.g:3525:5: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    {
                    // InternalCssDslParser.g:3525:5: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_ONE_INT) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred5_InternalCssDslParser()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalCssDslParser.g:3526:6: ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ONE_INT_4);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_ONE_INT_4, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // InternalCssDslParser.g:3535:5: ( ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==FullStop) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==RULE_ONE_INT) ) {
                            int LA74_3 = input.LA(3);

                            if ( (synpred6_InternalCssDslParser()) ) {
                                alt74=1;
                            }
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalCssDslParser.g:3536:6: ( ( FullStop )=>kw= FullStop ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            {
                            // InternalCssDslParser.g:3536:6: ( ( FullStop )=>kw= FullStop )
                            // InternalCssDslParser.g:3537:7: ( FullStop )=>kw= FullStop
                            {
                            kw=(Token)match(input,FullStop,FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(kw);
                              							newLeafNode(kw, grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0());
                              						
                            }

                            }

                            // InternalCssDslParser.g:3544:6: ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            int cnt73=0;
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==RULE_ONE_INT) ) {
                                    int LA73_2 = input.LA(2);

                                    if ( (synpred7_InternalCssDslParser()) ) {
                                        alt73=1;
                                    }


                                }


                                switch (alt73) {
                            	case 1 :
                            	    // InternalCssDslParser.g:3545:7: ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT
                            	    {
                            	    this_ONE_INT_6=(Token)match(input,RULE_ONE_INT,FOLLOW_49); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(this_ONE_INT_6);
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_ONE_INT_6, grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1());
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt73 >= 1 ) break loop73;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(73, input);
                                        throw eee;
                                }
                                cnt73++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleHex"
    // InternalCssDslParser.g:3564:1: entryRuleHex returns [String current=null] : iv_ruleHex= ruleHex EOF ;
    public final String entryRuleHex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHex = null;


        try {
            // InternalCssDslParser.g:3564:43: (iv_ruleHex= ruleHex EOF )
            // InternalCssDslParser.g:3565:2: iv_ruleHex= ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHex=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHex.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHex"


    // $ANTLR start "ruleHex"
    // InternalCssDslParser.g:3571:1: ruleHex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) ;
    public final AntlrDatatypeRuleToken ruleHex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASHMARK_0=null;
        Token this_ONE_INT_1=null;
        Token this_ONE_HEX_LETTER_2=null;


        	enterRule();

        try {
            // InternalCssDslParser.g:3577:2: ( (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) )
            // InternalCssDslParser.g:3578:2: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            {
            // InternalCssDslParser.g:3578:2: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            // InternalCssDslParser.g:3579:3: this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            {
            this_HASHMARK_0=(Token)match(input,RULE_HASHMARK,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_HASHMARK_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASHMARK_0, grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0());
              		
            }
            // InternalCssDslParser.g:3586:3: ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ONE_HEX_LETTER) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred8_InternalCssDslParser()) ) {
                        alt77=1;
                    }


                }
                else if ( (LA77_0==RULE_ONE_INT) ) {
                    int LA77_3 = input.LA(2);

                    if ( (synpred8_InternalCssDslParser()) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // InternalCssDslParser.g:3587:4: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    {
            	    // InternalCssDslParser.g:3593:4: (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_ONE_INT) ) {
            	        alt76=1;
            	    }
            	    else if ( (LA76_0==RULE_ONE_HEX_LETTER) ) {
            	        alt76=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 76, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalCssDslParser.g:3594:5: this_ONE_INT_1= RULE_ONE_INT
            	            {
            	            this_ONE_INT_1=(Token)match(input,RULE_ONE_INT,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ONE_INT_1);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ONE_INT_1, grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCssDslParser.g:3602:5: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
            	            {
            	            this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ONE_HEX_LETTER_2);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ONE_HEX_LETTER_2, grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHex"

    // $ANTLR start synpred1_InternalCssDslParser
    public final void synpred1_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:1138:4: ( ( ruleCssTok ) )
        // InternalCssDslParser.g:1138:5: ( ruleCssTok )
        {
        // InternalCssDslParser.g:1138:5: ( ruleCssTok )
        // InternalCssDslParser.g:1139:5: ruleCssTok
        {
        pushFollow(FOLLOW_2);
        ruleCssTok();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCssDslParser

    // $ANTLR start synpred2_InternalCssDslParser
    public final void synpred2_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:1414:4: ( ( ruleSubSelectorForNegation ) )
        // InternalCssDslParser.g:1414:5: ( ruleSubSelectorForNegation )
        {
        // InternalCssDslParser.g:1414:5: ( ruleSubSelectorForNegation )
        // InternalCssDslParser.g:1415:5: ruleSubSelectorForNegation
        {
        pushFollow(FOLLOW_2);
        ruleSubSelectorForNegation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCssDslParser

    // $ANTLR start synpred3_InternalCssDslParser
    public final void synpred3_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3393:4: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )
        // InternalCssDslParser.g:3393:5: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        {
        // InternalCssDslParser.g:3393:5: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        int alt78=6;
        switch ( input.LA(1) ) {
        case RULE_UNDERSCORE:
            {
            alt78=1;
            }
            break;
        case RULE_DASH:
            {
            alt78=2;
            }
            break;
        case RULE_ONE_HEX_LETTER:
            {
            alt78=3;
            }
            break;
        case RULE_ONE_NON_HEX_LETTER:
            {
            alt78=4;
            }
            break;
        case RULE_ONE_INT:
            {
            alt78=5;
            }
            break;
        case Not:
        case Url:
        case No:
        case Ur:
            {
            alt78=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 78, 0, input);

            throw nvae;
        }

        switch (alt78) {
            case 1 :
                // InternalCssDslParser.g:3394:5: RULE_UNDERSCORE
                {
                match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalCssDslParser.g:3396:5: RULE_DASH
                {
                match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalCssDslParser.g:3398:5: RULE_ONE_HEX_LETTER
                {
                match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalCssDslParser.g:3400:5: RULE_ONE_NON_HEX_LETTER
                {
                match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalCssDslParser.g:3402:5: RULE_ONE_INT
                {
                match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 6 :
                // InternalCssDslParser.g:3404:5: ruleKeywordHack
                {
                pushFollow(FOLLOW_2);
                ruleKeywordHack();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_InternalCssDslParser

    // $ANTLR start synpred4_InternalCssDslParser
    public final void synpred4_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3513:6: ( RULE_ONE_INT )
        // InternalCssDslParser.g:3513:7: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCssDslParser

    // $ANTLR start synpred5_InternalCssDslParser
    public final void synpred5_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3526:6: ( RULE_ONE_INT )
        // InternalCssDslParser.g:3526:7: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCssDslParser

    // $ANTLR start synpred6_InternalCssDslParser
    public final void synpred6_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3537:7: ( FullStop )
        // InternalCssDslParser.g:3537:8: FullStop
        {
        match(input,FullStop,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCssDslParser

    // $ANTLR start synpred7_InternalCssDslParser
    public final void synpred7_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3545:7: ( RULE_ONE_INT )
        // InternalCssDslParser.g:3545:8: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalCssDslParser

    // $ANTLR start synpred8_InternalCssDslParser
    public final void synpred8_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:3587:4: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )
        // InternalCssDslParser.g:3587:5: ( RULE_ONE_INT | RULE_ONE_HEX_LETTER )
        {
        if ( (input.LA(1)>=RULE_ONE_INT && input.LA(1)<=RULE_ONE_HEX_LETTER) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred8_InternalCssDslParser

    // Delegated rules

    public final boolean synpred8_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\47\2\uffff";
    static final String dfa_3s = "\2\66\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\1";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\13\uffff\1\3\2\uffff\1\1",
            "\1\2\13\uffff\1\3\2\uffff\1\1",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 983:3: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )*";
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\1\22\uffff";
    static final String dfa_9s = "\1\13\22\uffff";
    static final String dfa_10s = "\1\67\22\uffff";
    static final String dfa_11s = "\1\uffff\1\2\21\1";
    static final String dfa_12s = "\1\0\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\21\1\6\1\10\10\uffff\1\7\1\11\6\uffff\1\17\1\uffff\1\1\10\uffff\1\1\1\uffff\1\1\1\20\1\4\1\5\1\3\1\2\1\16\1\22\1\12\1\13\1\uffff\1\14\1\15",
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
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 1137:3: ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==EOF||LA29_0==Semicolon||LA29_0==RightCurlyBracket||LA29_0==RULE_IMPORTANT_SYM) ) {s = 1;}

                        else if ( (LA29_0==RULE_DASH) && (synpred1_InternalCssDslParser())) {s = 2;}

                        else if ( (LA29_0==RULE_UNDERSCORE) && (synpred1_InternalCssDslParser())) {s = 3;}

                        else if ( (LA29_0==RULE_ONE_HEX_LETTER) && (synpred1_InternalCssDslParser())) {s = 4;}

                        else if ( (LA29_0==RULE_ONE_NON_HEX_LETTER) && (synpred1_InternalCssDslParser())) {s = 5;}

                        else if ( (LA29_0==Not) && (synpred1_InternalCssDslParser())) {s = 6;}

                        else if ( (LA29_0==No) && (synpred1_InternalCssDslParser())) {s = 7;}

                        else if ( (LA29_0==Url) && (synpred1_InternalCssDslParser())) {s = 8;}

                        else if ( (LA29_0==Ur) && (synpred1_InternalCssDslParser())) {s = 9;}

                        else if ( (LA29_0==RULE_COMMA) && (synpred1_InternalCssDslParser())) {s = 10;}

                        else if ( (LA29_0==RULE_PERCENT) && (synpred1_InternalCssDslParser())) {s = 11;}

                        else if ( (LA29_0==RULE_WS) && (synpred1_InternalCssDslParser())) {s = 12;}

                        else if ( (LA29_0==RULE_CSSSTRING) && (synpred1_InternalCssDslParser())) {s = 13;}

                        else if ( (LA29_0==RULE_PLUS) && (synpred1_InternalCssDslParser())) {s = 14;}

                        else if ( (LA29_0==FullStop) && (synpred1_InternalCssDslParser())) {s = 15;}

                        else if ( (LA29_0==RULE_ONE_INT) && (synpred1_InternalCssDslParser())) {s = 16;}

                        else if ( (LA29_0==Url_1) && (synpred1_InternalCssDslParser())) {s = 17;}

                        else if ( (LA29_0==RULE_HASHMARK) && (synpred1_InternalCssDslParser())) {s = 18;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\5\uffff";
    static final String dfa_15s = "\1\3\4\uffff";
    static final String dfa_16s = "\1\42\1\uffff\1\14\2\uffff";
    static final String dfa_17s = "\1\66\1\uffff\1\72\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_19s = "\5\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\4\uffff\1\3\2\uffff\1\1\6\uffff\1\1\1\uffff\1\3\2\uffff\1\2",
            "",
            "\2\4\10\uffff\2\4\5\uffff\2\4\3\uffff\1\4\2\uffff\1\4\1\uffff\1\3\1\4\1\uffff\1\4\2\uffff\6\4\1\3\2\uffff\1\2\3\uffff\1\4",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1225:3: ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?";
        }
    }
    static final String dfa_21s = "\24\uffff";
    static final String dfa_22s = "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String dfa_23s = "\11\14\1\uffff\11\14\1\uffff";
    static final String dfa_24s = "\1\60\1\57\7\72\1\uffff\11\72\1\uffff";
    static final String dfa_25s = "\11\uffff\1\2\11\uffff\1\1";
    static final String dfa_26s = "\24\uffff}>";
    static final String[] dfa_27s = {
            "\1\5\1\7\10\uffff\1\6\1\10\5\uffff\1\11\12\uffff\1\11\4\uffff\1\3\1\4\1\2\1\1",
            "\1\5\1\7\10\uffff\1\6\1\10\25\uffff\1\3\1\4\1\2",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\4\uffff\1\23\1\uffff\1\23\6\uffff\1\23\2\uffff\1\11\3\uffff\1\16\1\14\1\15\1\12\1\13\1\uffff\1\23\7\uffff\1\23",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1351:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String[] dfa_28s = {
            "\1\5\1\7\10\uffff\1\6\1\10\5\uffff\1\11\12\uffff\1\11\4\uffff\1\3\1\4\1\2\1\1",
            "\1\5\1\7\10\uffff\1\6\1\10\25\uffff\1\3\1\4\1\2",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            "\1\17\1\21\10\uffff\1\20\1\22\6\uffff\1\23\3\uffff\1\23\2\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\23\1\uffff\1\16\1\14\1\15\1\12\1\13\3\23\2\uffff\1\23\3\uffff\1\23",
            ""
    };
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1516:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String dfa_29s = "\25\uffff";
    static final String dfa_30s = "\5\uffff\20\3";
    static final String dfa_31s = "\1\72\1\12\2\uffff\21\14";
    static final String dfa_32s = "\2\72\2\uffff\1\57\20\72";
    static final String dfa_33s = "\2\uffff\1\2\1\1\21\uffff";
    static final String dfa_34s = "\25\uffff}>";
    static final String[] dfa_35s = {
            "\1\1",
            "\1\2\1\uffff\1\10\1\12\10\uffff\1\11\1\13\25\uffff\1\6\1\7\1\5\1\4\11\uffff\1\3",
            "",
            "",
            "\1\10\1\12\10\uffff\1\11\1\13\25\uffff\1\6\1\7\1\5",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\20\1\16\1\17\1\14\1\15\3\3\2\uffff\1\3\3\uffff\1\3"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "2148:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )";
        }
    }
    static final String dfa_36s = "\14\uffff";
    static final String dfa_37s = "\1\1\13\uffff";
    static final String dfa_38s = "\1\13\1\uffff\11\0\1\uffff";
    static final String dfa_39s = "\1\72\1\uffff\11\0\1\uffff";
    static final String dfa_40s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_41s = "\2\uffff\1\7\1\6\1\0\1\10\1\2\1\3\1\4\1\5\1\1\1\uffff}>";
    static final String[] dfa_42s = {
            "\1\1\1\6\1\10\2\1\5\uffff\1\1\1\7\1\11\3\uffff\2\1\1\uffff\1\1\1\uffff\3\1\2\uffff\7\1\1\12\1\4\1\5\1\3\1\2\4\1\1\uffff\5\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 3392:3: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | this_KeywordHack_10= ruleKeywordHack ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0405E12060C033B2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0405E12060C03332L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0080000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001E00100C03000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0400008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001E20100C03000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001E00000C03000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0405E32060C03000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003F20140C03000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0048008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0405E12060C03000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E20000C03000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00DFF00040C03800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00DFF80040C03802L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0042040400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0445E12060C03000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0447E52460C03000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0404002040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0405E12060C03002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x030000420020C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0081E00000C03000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0401E00000C03000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00DFF00050C03800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x049FF47BE7DF3000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x041FF47BE7DF3002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001F00000C03002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100040000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000300000000002L});

}