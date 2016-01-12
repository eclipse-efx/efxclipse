package org.eclipse.fx.ide.css.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.fx.ide.css.idea.lang.CssDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalCssDslParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CSSSTRING", "RULE_COLON", "RULE_COMMA", "RULE_PERCENT", "RULE_WS", "RULE_IMPORTANT_SYM", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_HASHMARK", "RULE_PLUS", "RULE_DASH", "RULE_UNDERSCORE", "RULE_ONE_HEX_LETTER", "RULE_ONE_NON_HEX_LETTER", "RULE_ONE_INT", "RULE_ML_COMMENT", "'@charset'", "';'", "'@import'", "'@page'", "'{'", "'}'", "'@media'", "'@font-face'", "'@keyframes'", "'['", "'^='", "'$='", "'*='", "'='", "']'", "'.'", "'*'", "'|'", "')'", "'('", "'not('", "'>'", "'~'", "'url('", "'/'", "'?'", "'@'", "'!'", "'$'", "'&'", "'not'", "'no'", "'url'", "'ur'", "'\\\\ '", "'\\\\('", "'\\\\)'", "'\\\\\\''", "'\\\\\"'"
    };
    public static final int T__50=50;
    public static final int RULE_IMPORTANT_SYM=9;
    public static final int RULE_CSSSTRING=4;
    public static final int RULE_UNDERSCORE=15;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_PERCENT=7;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_COMMA=6;
    public static final int RULE_COLON=5;
    public static final int RULE_HASHMARK=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_DASHMATCH=11;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_INCLUDES=10;
    public static final int T__21=21;
    public static final int RULE_ONE_HEX_LETTER=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DASH=14;
    public static final int RULE_ONE_INT=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=13;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ONE_NON_HEX_LETTER=17;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public PsiInternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalCssDsl.g"; }



    	protected CssDslGrammarAccess grammarAccess;

    	protected CssDslElementTypeProvider elementTypeProvider;

    	public PsiInternalCssDslParser(PsiBuilder builder, TokenStream input, CssDslElementTypeProvider elementTypeProvider, CssDslGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Stylesheet";
    	}




    // $ANTLR start "entryRuleStylesheet"
    // PsiInternalCssDsl.g:52:1: entryRuleStylesheet returns [Boolean current=false] : iv_ruleStylesheet= ruleStylesheet EOF ;
    public final Boolean entryRuleStylesheet() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStylesheet = null;


        try {
            // PsiInternalCssDsl.g:52:52: (iv_ruleStylesheet= ruleStylesheet EOF )
            // PsiInternalCssDsl.g:53:2: iv_ruleStylesheet= ruleStylesheet EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getStylesheetElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // PsiInternalCssDsl.g:59:1: ruleStylesheet returns [Boolean current=false] : ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* ) ;
    public final Boolean ruleStylesheet() throws RecognitionException {
        Boolean current = false;

        Boolean lv_charset_0_0 = null;

        Boolean lv_imports_1_0 = null;

        Boolean lv_ruleset_2_0 = null;

        Boolean lv_media_3_0 = null;

        Boolean lv_page_4_0 = null;

        Boolean lv_font_face_5_0 = null;

        Boolean lv_keyframes_6_0 = null;


        try {
            // PsiInternalCssDsl.g:60:1: ( ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* ) )
            // PsiInternalCssDsl.g:61:2: ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* )
            {
            // PsiInternalCssDsl.g:61:2: ( ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )* )
            // PsiInternalCssDsl.g:62:3: ( (lv_charset_0_0= ruleCharsetRule ) )? ( (lv_imports_1_0= ruleImportRule ) )* ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )*
            {
            // PsiInternalCssDsl.g:62:3: ( (lv_charset_0_0= ruleCharsetRule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // PsiInternalCssDsl.g:63:4: (lv_charset_0_0= ruleCharsetRule )
                    {
                    // PsiInternalCssDsl.g:63:4: (lv_charset_0_0= ruleCharsetRule )
                    // PsiInternalCssDsl.g:64:5: lv_charset_0_0= ruleCharsetRule
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getStylesheet_CharsetCharsetRuleParserRuleCall_0_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_charset_0_0=ruleCharsetRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCssDsl.g:77:3: ( (lv_imports_1_0= ruleImportRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalCssDsl.g:78:4: (lv_imports_1_0= ruleImportRule )
            	    {
            	    // PsiInternalCssDsl.g:78:4: (lv_imports_1_0= ruleImportRule )
            	    // PsiInternalCssDsl.g:79:5: lv_imports_1_0= ruleImportRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getStylesheet_ImportsImportRuleParserRuleCall_1_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImportRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // PsiInternalCssDsl.g:92:3: ( ( (lv_ruleset_2_0= ruleRuleset ) ) | ( (lv_media_3_0= ruleMediaRule ) ) | ( (lv_page_4_0= rulePageRule ) ) | ( (lv_font_face_5_0= ruleFontFaceRule ) ) | ( (lv_keyframes_6_0= ruleKeyframesRule ) ) )*
            loop3:
            do {
                int alt3=6;
                switch ( input.LA(1) ) {
                case RULE_COLON:
                case RULE_HASHMARK:
                case RULE_DASH:
                case RULE_UNDERSCORE:
                case RULE_ONE_HEX_LETTER:
                case RULE_ONE_NON_HEX_LETTER:
                case 29:
                case 35:
                case 36:
                case 37:
                case 50:
                case 51:
                case 52:
                case 53:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 23:
                    {
                    alt3=3;
                    }
                    break;
                case 27:
                    {
                    alt3=4;
                    }
                    break;
                case 28:
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // PsiInternalCssDsl.g:93:4: ( (lv_ruleset_2_0= ruleRuleset ) )
            	    {
            	    // PsiInternalCssDsl.g:93:4: ( (lv_ruleset_2_0= ruleRuleset ) )
            	    // PsiInternalCssDsl.g:94:5: (lv_ruleset_2_0= ruleRuleset )
            	    {
            	    // PsiInternalCssDsl.g:94:5: (lv_ruleset_2_0= ruleRuleset )
            	    // PsiInternalCssDsl.g:95:6: lv_ruleset_2_0= ruleRuleset
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getStylesheet_RulesetRulesetParserRuleCall_2_0_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_ruleset_2_0=ruleRuleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // PsiInternalCssDsl.g:109:4: ( (lv_media_3_0= ruleMediaRule ) )
            	    {
            	    // PsiInternalCssDsl.g:109:4: ( (lv_media_3_0= ruleMediaRule ) )
            	    // PsiInternalCssDsl.g:110:5: (lv_media_3_0= ruleMediaRule )
            	    {
            	    // PsiInternalCssDsl.g:110:5: (lv_media_3_0= ruleMediaRule )
            	    // PsiInternalCssDsl.g:111:6: lv_media_3_0= ruleMediaRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getStylesheet_MediaMediaRuleParserRuleCall_2_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_media_3_0=ruleMediaRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // PsiInternalCssDsl.g:125:4: ( (lv_page_4_0= rulePageRule ) )
            	    {
            	    // PsiInternalCssDsl.g:125:4: ( (lv_page_4_0= rulePageRule ) )
            	    // PsiInternalCssDsl.g:126:5: (lv_page_4_0= rulePageRule )
            	    {
            	    // PsiInternalCssDsl.g:126:5: (lv_page_4_0= rulePageRule )
            	    // PsiInternalCssDsl.g:127:6: lv_page_4_0= rulePageRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getStylesheet_PagePageRuleParserRuleCall_2_2_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_page_4_0=rulePageRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // PsiInternalCssDsl.g:141:4: ( (lv_font_face_5_0= ruleFontFaceRule ) )
            	    {
            	    // PsiInternalCssDsl.g:141:4: ( (lv_font_face_5_0= ruleFontFaceRule ) )
            	    // PsiInternalCssDsl.g:142:5: (lv_font_face_5_0= ruleFontFaceRule )
            	    {
            	    // PsiInternalCssDsl.g:142:5: (lv_font_face_5_0= ruleFontFaceRule )
            	    // PsiInternalCssDsl.g:143:6: lv_font_face_5_0= ruleFontFaceRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getStylesheet_Font_faceFontFaceRuleParserRuleCall_2_3_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_font_face_5_0=ruleFontFaceRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // PsiInternalCssDsl.g:157:4: ( (lv_keyframes_6_0= ruleKeyframesRule ) )
            	    {
            	    // PsiInternalCssDsl.g:157:4: ( (lv_keyframes_6_0= ruleKeyframesRule ) )
            	    // PsiInternalCssDsl.g:158:5: (lv_keyframes_6_0= ruleKeyframesRule )
            	    {
            	    // PsiInternalCssDsl.g:158:5: (lv_keyframes_6_0= ruleKeyframesRule )
            	    // PsiInternalCssDsl.g:159:6: lv_keyframes_6_0= ruleKeyframesRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getStylesheet_KeyframesKeyframesRuleParserRuleCall_2_4_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_keyframes_6_0=ruleKeyframesRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleCharsetRule"
    // PsiInternalCssDsl.g:177:1: entryRuleCharsetRule returns [Boolean current=false] : iv_ruleCharsetRule= ruleCharsetRule EOF ;
    public final Boolean entryRuleCharsetRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCharsetRule = null;


        try {
            // PsiInternalCssDsl.g:177:53: (iv_ruleCharsetRule= ruleCharsetRule EOF )
            // PsiInternalCssDsl.g:178:2: iv_ruleCharsetRule= ruleCharsetRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCharsetRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharsetRule"


    // $ANTLR start "ruleCharsetRule"
    // PsiInternalCssDsl.g:184:1: ruleCharsetRule returns [Boolean current=false] : (otherlv_0= '@charset' ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= ';' ) ;
    public final Boolean ruleCharsetRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_charset_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalCssDsl.g:185:1: ( (otherlv_0= '@charset' ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= ';' ) )
            // PsiInternalCssDsl.g:186:2: (otherlv_0= '@charset' ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= ';' )
            {
            // PsiInternalCssDsl.g:186:2: (otherlv_0= '@charset' ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= ';' )
            // PsiInternalCssDsl.g:187:3: otherlv_0= '@charset' ( (lv_charset_1_0= RULE_CSSSTRING ) ) otherlv_2= ';'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCharsetRule_CharsetKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssDsl.g:194:3: ( (lv_charset_1_0= RULE_CSSSTRING ) )
            // PsiInternalCssDsl.g:195:4: (lv_charset_1_0= RULE_CSSSTRING )
            {
            // PsiInternalCssDsl.g:195:4: (lv_charset_1_0= RULE_CSSSTRING )
            // PsiInternalCssDsl.g:196:5: lv_charset_1_0= RULE_CSSSTRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getCharsetRule_CharsetCSSSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_charset_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_charset_1_0);
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCharsetRule_SemicolonKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharsetRule"


    // $ANTLR start "entryRuleImportRule"
    // PsiInternalCssDsl.g:222:1: entryRuleImportRule returns [Boolean current=false] : iv_ruleImportRule= ruleImportRule EOF ;
    public final Boolean entryRuleImportRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleImportRule = null;


        try {
            // PsiInternalCssDsl.g:222:52: (iv_ruleImportRule= ruleImportRule EOF )
            // PsiInternalCssDsl.g:223:2: iv_ruleImportRule= ruleImportRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getImportRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportRule"


    // $ANTLR start "ruleImportRule"
    // PsiInternalCssDsl.g:229:1: ruleImportRule returns [Boolean current=false] : (otherlv_0= '@import' ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= ';' ) ;
    public final Boolean ruleImportRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_4=null;
        Boolean this_URLType_2 = null;

        Boolean lv_mediaList_3_0 = null;


        try {
            // PsiInternalCssDsl.g:230:1: ( (otherlv_0= '@import' ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= ';' ) )
            // PsiInternalCssDsl.g:231:2: (otherlv_0= '@import' ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= ';' )
            {
            // PsiInternalCssDsl.g:231:2: (otherlv_0= '@import' ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= ';' )
            // PsiInternalCssDsl.g:232:3: otherlv_0= '@import' ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) ) otherlv_4= ';'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getImportRule_ImportKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssDsl.g:239:3: ( ( (lv_value_1_0= RULE_CSSSTRING ) ) | (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CSSSTRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
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
                    // PsiInternalCssDsl.g:240:4: ( (lv_value_1_0= RULE_CSSSTRING ) )
                    {
                    // PsiInternalCssDsl.g:240:4: ( (lv_value_1_0= RULE_CSSSTRING ) )
                    // PsiInternalCssDsl.g:241:5: (lv_value_1_0= RULE_CSSSTRING )
                    {
                    // PsiInternalCssDsl.g:241:5: (lv_value_1_0= RULE_CSSSTRING )
                    // PsiInternalCssDsl.g:242:6: lv_value_1_0= RULE_CSSSTRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getImportRule_ValueCSSSTRINGTerminalRuleCall_1_0_0ElementType());
                      					
                    }
                    lv_value_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_1_0);
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:258:4: (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? )
                    {
                    // PsiInternalCssDsl.g:258:4: (this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )? )
                    // PsiInternalCssDsl.g:259:5: this_URLType_2= ruleURLType ( (lv_mediaList_3_0= ruleMediaList ) )?
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getImportRule_URLTypeParserRuleCall_1_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_URLType_2=ruleURLType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_URLType_2;
                      					doneComposite();
                      				
                    }
                    // PsiInternalCssDsl.g:267:5: ( (lv_mediaList_3_0= ruleMediaList ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_DASH && LA4_0<=RULE_ONE_NON_HEX_LETTER)||(LA4_0>=50 && LA4_0<=53)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // PsiInternalCssDsl.g:268:6: (lv_mediaList_3_0= ruleMediaList )
                            {
                            // PsiInternalCssDsl.g:268:6: (lv_mediaList_3_0= ruleMediaList )
                            // PsiInternalCssDsl.g:269:7: lv_mediaList_3_0= ruleMediaList
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getImportRule_MediaListMediaListParserRuleCall_1_1_1_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_6);
                            lv_mediaList_3_0=ruleMediaList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getImportRule_SemicolonKeyword_2ElementType());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportRule"


    // $ANTLR start "entryRulePageRule"
    // PsiInternalCssDsl.g:295:1: entryRulePageRule returns [Boolean current=false] : iv_rulePageRule= rulePageRule EOF ;
    public final Boolean entryRulePageRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageRule = null;


        try {
            // PsiInternalCssDsl.g:295:50: (iv_rulePageRule= rulePageRule EOF )
            // PsiInternalCssDsl.g:296:2: iv_rulePageRule= rulePageRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPageRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageRule"


    // $ANTLR start "rulePageRule"
    // PsiInternalCssDsl.g:302:1: rulePageRule returns [Boolean current=false] : ( () otherlv_1= '@page' ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' ) ;
    public final Boolean rulePageRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_pseudoPage_2_0 = null;

        Boolean lv_declarations_4_0 = null;

        Boolean lv_declarations_6_0 = null;


        try {
            // PsiInternalCssDsl.g:303:1: ( ( () otherlv_1= '@page' ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' ) )
            // PsiInternalCssDsl.g:304:2: ( () otherlv_1= '@page' ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' )
            {
            // PsiInternalCssDsl.g:304:2: ( () otherlv_1= '@page' ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' )
            // PsiInternalCssDsl.g:305:3: () otherlv_1= '@page' ( (lv_pseudoPage_2_0= rulePseudoPage ) )? otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}'
            {
            // PsiInternalCssDsl.g:305:3: ()
            // PsiInternalCssDsl.g:306:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getPageRule_PageRuleAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPageRule_PageKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssDsl.g:319:3: ( (lv_pseudoPage_2_0= rulePseudoPage ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalCssDsl.g:320:4: (lv_pseudoPage_2_0= rulePseudoPage )
                    {
                    // PsiInternalCssDsl.g:320:4: (lv_pseudoPage_2_0= rulePseudoPage )
                    // PsiInternalCssDsl.g:321:5: lv_pseudoPage_2_0= rulePseudoPage
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getPageRule_PseudoPagePseudoPageParserRuleCall_2_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_pseudoPage_2_0=rulePseudoPage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPageRule_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalCssDsl.g:341:3: ( (lv_declarations_4_0= ruleCssDeclaration ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_DASH && LA7_0<=RULE_ONE_NON_HEX_LETTER)||(LA7_0>=50 && LA7_0<=53)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalCssDsl.g:342:4: (lv_declarations_4_0= ruleCssDeclaration )
                    {
                    // PsiInternalCssDsl.g:342:4: (lv_declarations_4_0= ruleCssDeclaration )
                    // PsiInternalCssDsl.g:343:5: lv_declarations_4_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getPageRule_DeclarationsCssDeclarationParserRuleCall_4_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_4_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCssDsl.g:356:3: (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalCssDsl.g:357:4: otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getPageRule_SemicolonKeyword_5_0ElementType());
            	      			
            	    }
            	    otherlv_5=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(otherlv_5);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:364:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( ((LA8_0>=RULE_DASH && LA8_0<=RULE_ONE_NON_HEX_LETTER)||(LA8_0>=50 && LA8_0<=53)) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // PsiInternalCssDsl.g:365:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            {
            	            // PsiInternalCssDsl.g:365:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            // PsiInternalCssDsl.g:366:6: lv_declarations_6_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						markComposite(elementTypeProvider.getPageRule_DeclarationsCssDeclarationParserRuleCall_5_1_0ElementType());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_6_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneComposite();
            	              						if(!current) {
            	              							associateWithSemanticElement();
            	              							current = true;
            	              						}
            	              					
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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPageRule_RightCurlyBracketKeyword_6ElementType());
              		
            }
            otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_7);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageRule"


    // $ANTLR start "entryRulePseudoPage"
    // PsiInternalCssDsl.g:391:1: entryRulePseudoPage returns [Boolean current=false] : iv_rulePseudoPage= rulePseudoPage EOF ;
    public final Boolean entryRulePseudoPage() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoPage = null;


        try {
            // PsiInternalCssDsl.g:391:52: (iv_rulePseudoPage= rulePseudoPage EOF )
            // PsiInternalCssDsl.g:392:2: iv_rulePseudoPage= rulePseudoPage EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoPageElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoPage=rulePseudoPage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoPage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoPage"


    // $ANTLR start "rulePseudoPage"
    // PsiInternalCssDsl.g:398:1: rulePseudoPage returns [Boolean current=false] : (this_COLON_0= RULE_COLON ruleIdentifier ) ;
    public final Boolean rulePseudoPage() throws RecognitionException {
        Boolean current = false;

        Token this_COLON_0=null;

        try {
            // PsiInternalCssDsl.g:399:1: ( (this_COLON_0= RULE_COLON ruleIdentifier ) )
            // PsiInternalCssDsl.g:400:2: (this_COLON_0= RULE_COLON ruleIdentifier )
            {
            // PsiInternalCssDsl.g:400:2: (this_COLON_0= RULE_COLON ruleIdentifier )
            // PsiInternalCssDsl.g:401:3: this_COLON_0= RULE_COLON ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPseudoPage_COLONTerminalRuleCall_0ElementType());
              		
            }
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_COLON_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getPseudoPage_IdentifierParserRuleCall_1ElementType());
              		
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoPage"


    // $ANTLR start "entryRuleMediaRule"
    // PsiInternalCssDsl.g:419:1: entryRuleMediaRule returns [Boolean current=false] : iv_ruleMediaRule= ruleMediaRule EOF ;
    public final Boolean entryRuleMediaRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMediaRule = null;


        try {
            // PsiInternalCssDsl.g:419:51: (iv_ruleMediaRule= ruleMediaRule EOF )
            // PsiInternalCssDsl.g:420:2: iv_ruleMediaRule= ruleMediaRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMediaRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaRule"


    // $ANTLR start "ruleMediaRule"
    // PsiInternalCssDsl.g:426:1: ruleMediaRule returns [Boolean current=false] : (otherlv_0= '@media' ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= '}' ) ;
    public final Boolean ruleMediaRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_medialist_1_0 = null;

        Boolean lv_rulesets_3_0 = null;


        try {
            // PsiInternalCssDsl.g:427:1: ( (otherlv_0= '@media' ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= '}' ) )
            // PsiInternalCssDsl.g:428:2: (otherlv_0= '@media' ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= '}' )
            {
            // PsiInternalCssDsl.g:428:2: (otherlv_0= '@media' ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= '}' )
            // PsiInternalCssDsl.g:429:3: otherlv_0= '@media' ( (lv_medialist_1_0= ruleMediaList ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleRuleset ) )* otherlv_4= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getMediaRule_MediaKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssDsl.g:436:3: ( (lv_medialist_1_0= ruleMediaList ) )
            // PsiInternalCssDsl.g:437:4: (lv_medialist_1_0= ruleMediaList )
            {
            // PsiInternalCssDsl.g:437:4: (lv_medialist_1_0= ruleMediaList )
            // PsiInternalCssDsl.g:438:5: lv_medialist_1_0= ruleMediaList
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getMediaRule_MedialistMediaListParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_10);
            lv_medialist_1_0=ruleMediaList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getMediaRule_LeftCurlyBracketKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssDsl.g:458:3: ( (lv_rulesets_3_0= ruleRuleset ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COLON||LA10_0==RULE_HASHMARK||(LA10_0>=RULE_DASH && LA10_0<=RULE_ONE_NON_HEX_LETTER)||LA10_0==29||(LA10_0>=35 && LA10_0<=37)||(LA10_0>=50 && LA10_0<=53)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalCssDsl.g:459:4: (lv_rulesets_3_0= ruleRuleset )
            	    {
            	    // PsiInternalCssDsl.g:459:4: (lv_rulesets_3_0= ruleRuleset )
            	    // PsiInternalCssDsl.g:460:5: lv_rulesets_3_0= ruleRuleset
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getMediaRule_RulesetsRulesetParserRuleCall_3_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rulesets_3_0=ruleRuleset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getMediaRule_RightCurlyBracketKeyword_4ElementType());
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaRule"


    // $ANTLR start "entryRuleMediaList"
    // PsiInternalCssDsl.g:484:1: entryRuleMediaList returns [Boolean current=false] : iv_ruleMediaList= ruleMediaList EOF ;
    public final Boolean entryRuleMediaList() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMediaList = null;


        try {
            // PsiInternalCssDsl.g:484:51: (iv_ruleMediaList= ruleMediaList EOF )
            // PsiInternalCssDsl.g:485:2: iv_ruleMediaList= ruleMediaList EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMediaListElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaList"


    // $ANTLR start "ruleMediaList"
    // PsiInternalCssDsl.g:491:1: ruleMediaList returns [Boolean current=false] : ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* ) ;
    public final Boolean ruleMediaList() throws RecognitionException {
        Boolean current = false;

        Token this_COMMA_1=null;
        Boolean lv_entry_0_0 = null;

        Boolean lv_entry_2_0 = null;


        try {
            // PsiInternalCssDsl.g:492:1: ( ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* ) )
            // PsiInternalCssDsl.g:493:2: ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* )
            {
            // PsiInternalCssDsl.g:493:2: ( ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )* )
            // PsiInternalCssDsl.g:494:3: ( (lv_entry_0_0= ruleMedia ) ) (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )*
            {
            // PsiInternalCssDsl.g:494:3: ( (lv_entry_0_0= ruleMedia ) )
            // PsiInternalCssDsl.g:495:4: (lv_entry_0_0= ruleMedia )
            {
            // PsiInternalCssDsl.g:495:4: (lv_entry_0_0= ruleMedia )
            // PsiInternalCssDsl.g:496:5: lv_entry_0_0= ruleMedia
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getMediaList_EntryMediaParserRuleCall_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_15);
            lv_entry_0_0=ruleMedia();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:509:3: (this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // PsiInternalCssDsl.g:510:4: this_COMMA_1= RULE_COMMA ( (lv_entry_2_0= ruleMedia ) )
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getMediaList_COMMATerminalRuleCall_1_0ElementType());
            	      			
            	    }
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_COMMA_1);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:517:4: ( (lv_entry_2_0= ruleMedia ) )
            	    // PsiInternalCssDsl.g:518:5: (lv_entry_2_0= ruleMedia )
            	    {
            	    // PsiInternalCssDsl.g:518:5: (lv_entry_2_0= ruleMedia )
            	    // PsiInternalCssDsl.g:519:6: lv_entry_2_0= ruleMedia
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getMediaList_EntryMediaParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_entry_2_0=ruleMedia();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaList"


    // $ANTLR start "entryRuleMedia"
    // PsiInternalCssDsl.g:537:1: entryRuleMedia returns [Boolean current=false] : iv_ruleMedia= ruleMedia EOF ;
    public final Boolean entryRuleMedia() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMedia = null;


        try {
            // PsiInternalCssDsl.g:537:47: (iv_ruleMedia= ruleMedia EOF )
            // PsiInternalCssDsl.g:538:2: iv_ruleMedia= ruleMedia EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMediaElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // PsiInternalCssDsl.g:544:1: ruleMedia returns [Boolean current=false] : ( (lv_name_0_0= ruleIdentifier ) ) ;
    public final Boolean ruleMedia() throws RecognitionException {
        Boolean current = false;

        Boolean lv_name_0_0 = null;


        try {
            // PsiInternalCssDsl.g:545:1: ( ( (lv_name_0_0= ruleIdentifier ) ) )
            // PsiInternalCssDsl.g:546:2: ( (lv_name_0_0= ruleIdentifier ) )
            {
            // PsiInternalCssDsl.g:546:2: ( (lv_name_0_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:547:3: (lv_name_0_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:547:3: (lv_name_0_0= ruleIdentifier )
            // PsiInternalCssDsl.g:548:4: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				markComposite(elementTypeProvider.getMedia_NameIdentifierParserRuleCall_0ElementType());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				doneComposite();
              				if(!current) {
              					associateWithSemanticElement();
              					current = true;
              				}
              			
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleFontFaceRule"
    // PsiInternalCssDsl.g:564:1: entryRuleFontFaceRule returns [Boolean current=false] : iv_ruleFontFaceRule= ruleFontFaceRule EOF ;
    public final Boolean entryRuleFontFaceRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFontFaceRule = null;


        try {
            // PsiInternalCssDsl.g:564:54: (iv_ruleFontFaceRule= ruleFontFaceRule EOF )
            // PsiInternalCssDsl.g:565:2: iv_ruleFontFaceRule= ruleFontFaceRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFontFaceRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontFaceRule"


    // $ANTLR start "ruleFontFaceRule"
    // PsiInternalCssDsl.g:571:1: ruleFontFaceRule returns [Boolean current=false] : ( () otherlv_1= '@font-face' otherlv_2= '{' ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= '}' ) ;
    public final Boolean ruleFontFaceRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_declarations_3_0 = null;

        Boolean lv_declarations_5_0 = null;


        try {
            // PsiInternalCssDsl.g:572:1: ( ( () otherlv_1= '@font-face' otherlv_2= '{' ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= '}' ) )
            // PsiInternalCssDsl.g:573:2: ( () otherlv_1= '@font-face' otherlv_2= '{' ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= '}' )
            {
            // PsiInternalCssDsl.g:573:2: ( () otherlv_1= '@font-face' otherlv_2= '{' ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= '}' )
            // PsiInternalCssDsl.g:574:3: () otherlv_1= '@font-face' otherlv_2= '{' ( (lv_declarations_3_0= ruleCssDeclaration ) )? (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )* otherlv_6= '}'
            {
            // PsiInternalCssDsl.g:574:3: ()
            // PsiInternalCssDsl.g:575:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getFontFaceRule_FontFaceRuleAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFontFaceRule_FontFaceKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFontFaceRule_LeftCurlyBracketKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssDsl.g:595:3: ( (lv_declarations_3_0= ruleCssDeclaration ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_DASH && LA12_0<=RULE_ONE_NON_HEX_LETTER)||(LA12_0>=50 && LA12_0<=53)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalCssDsl.g:596:4: (lv_declarations_3_0= ruleCssDeclaration )
                    {
                    // PsiInternalCssDsl.g:596:4: (lv_declarations_3_0= ruleCssDeclaration )
                    // PsiInternalCssDsl.g:597:5: lv_declarations_3_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getFontFaceRule_DeclarationsCssDeclarationParserRuleCall_3_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_3_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCssDsl.g:610:3: (otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalCssDsl.g:611:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleCssDeclaration ) )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getFontFaceRule_SemicolonKeyword_4_0ElementType());
            	      			
            	    }
            	    otherlv_4=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(otherlv_4);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:618:4: ( (lv_declarations_5_0= ruleCssDeclaration ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=RULE_DASH && LA13_0<=RULE_ONE_NON_HEX_LETTER)||(LA13_0>=50 && LA13_0<=53)) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // PsiInternalCssDsl.g:619:5: (lv_declarations_5_0= ruleCssDeclaration )
            	            {
            	            // PsiInternalCssDsl.g:619:5: (lv_declarations_5_0= ruleCssDeclaration )
            	            // PsiInternalCssDsl.g:620:6: lv_declarations_5_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						markComposite(elementTypeProvider.getFontFaceRule_DeclarationsCssDeclarationParserRuleCall_4_1_0ElementType());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_5_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneComposite();
            	              						if(!current) {
            	              							associateWithSemanticElement();
            	              							current = true;
            	              						}
            	              					
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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFontFaceRule_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontFaceRule"


    // $ANTLR start "entryRuleKeyframesRule"
    // PsiInternalCssDsl.g:645:1: entryRuleKeyframesRule returns [Boolean current=false] : iv_ruleKeyframesRule= ruleKeyframesRule EOF ;
    public final Boolean entryRuleKeyframesRule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleKeyframesRule = null;


        try {
            // PsiInternalCssDsl.g:645:55: (iv_ruleKeyframesRule= ruleKeyframesRule EOF )
            // PsiInternalCssDsl.g:646:2: iv_ruleKeyframesRule= ruleKeyframesRule EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getKeyframesRuleElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyframesRule"


    // $ANTLR start "ruleKeyframesRule"
    // PsiInternalCssDsl.g:652:1: ruleKeyframesRule returns [Boolean current=false] : ( () otherlv_1= '@keyframes' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '{' ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= '}' ) ;
    public final Boolean ruleKeyframesRule() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_name_2_0 = null;

        Boolean lv_keyframeselectors_4_0 = null;

        Boolean lv_keyframeselectors_6_0 = null;


        try {
            // PsiInternalCssDsl.g:653:1: ( ( () otherlv_1= '@keyframes' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '{' ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= '}' ) )
            // PsiInternalCssDsl.g:654:2: ( () otherlv_1= '@keyframes' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '{' ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= '}' )
            {
            // PsiInternalCssDsl.g:654:2: ( () otherlv_1= '@keyframes' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '{' ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= '}' )
            // PsiInternalCssDsl.g:655:3: () otherlv_1= '@keyframes' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '{' ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )? (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )* otherlv_7= '}'
            {
            // PsiInternalCssDsl.g:655:3: ()
            // PsiInternalCssDsl.g:656:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getKeyframesRule_KeyframesRuleAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getKeyframesRule_KeyframesKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssDsl.g:669:3: ( (lv_name_2_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:670:4: (lv_name_2_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:670:4: (lv_name_2_0= ruleIdentifier )
            // PsiInternalCssDsl.g:671:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getKeyframesRule_NameIdentifierParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getKeyframesRule_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalCssDsl.g:691:3: ( (lv_keyframeselectors_4_0= ruleKeyframeSelector ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLUS && LA15_0<=RULE_ONE_INT)||LA15_0==35||(LA15_0>=50 && LA15_0<=53)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalCssDsl.g:692:4: (lv_keyframeselectors_4_0= ruleKeyframeSelector )
                    {
                    // PsiInternalCssDsl.g:692:4: (lv_keyframeselectors_4_0= ruleKeyframeSelector )
                    // PsiInternalCssDsl.g:693:5: lv_keyframeselectors_4_0= ruleKeyframeSelector
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getKeyframesRule_KeyframeselectorsKeyframeSelectorParserRuleCall_4_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_keyframeselectors_4_0=ruleKeyframeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCssDsl.g:706:3: (otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // PsiInternalCssDsl.g:707:4: otherlv_5= ';' ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getKeyframesRule_SemicolonKeyword_5_0ElementType());
            	      			
            	    }
            	    otherlv_5=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(otherlv_5);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:714:4: ( (lv_keyframeselectors_6_0= ruleKeyframeSelector ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=RULE_PLUS && LA16_0<=RULE_ONE_INT)||LA16_0==35||(LA16_0>=50 && LA16_0<=53)) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // PsiInternalCssDsl.g:715:5: (lv_keyframeselectors_6_0= ruleKeyframeSelector )
            	            {
            	            // PsiInternalCssDsl.g:715:5: (lv_keyframeselectors_6_0= ruleKeyframeSelector )
            	            // PsiInternalCssDsl.g:716:6: lv_keyframeselectors_6_0= ruleKeyframeSelector
            	            {
            	            if ( state.backtracking==0 ) {

            	              						markComposite(elementTypeProvider.getKeyframesRule_KeyframeselectorsKeyframeSelectorParserRuleCall_5_1_0ElementType());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_keyframeselectors_6_0=ruleKeyframeSelector();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneComposite();
            	              						if(!current) {
            	              							associateWithSemanticElement();
            	              							current = true;
            	              						}
            	              					
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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getKeyframesRule_RightCurlyBracketKeyword_6ElementType());
              		
            }
            otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_7);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyframesRule"


    // $ANTLR start "entryRuleKeyframeSelector"
    // PsiInternalCssDsl.g:741:1: entryRuleKeyframeSelector returns [Boolean current=false] : iv_ruleKeyframeSelector= ruleKeyframeSelector EOF ;
    public final Boolean entryRuleKeyframeSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleKeyframeSelector = null;


        try {
            // PsiInternalCssDsl.g:741:58: (iv_ruleKeyframeSelector= ruleKeyframeSelector EOF )
            // PsiInternalCssDsl.g:742:2: iv_ruleKeyframeSelector= ruleKeyframeSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getKeyframeSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyframeSelector"


    // $ANTLR start "ruleKeyframeSelector"
    // PsiInternalCssDsl.g:748:1: ruleKeyframeSelector returns [Boolean current=false] : ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' ) ;
    public final Boolean ruleKeyframeSelector() throws RecognitionException {
        Boolean current = false;

        Token this_PERCENT_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_type_0_0 = null;

        Boolean lv_percentage_1_0 = null;

        Boolean lv_declarations_4_0 = null;

        Boolean lv_declarations_6_0 = null;


        try {
            // PsiInternalCssDsl.g:749:1: ( ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' ) )
            // PsiInternalCssDsl.g:750:2: ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' )
            {
            // PsiInternalCssDsl.g:750:2: ( ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}' )
            // PsiInternalCssDsl.g:751:3: ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) ) otherlv_3= '{' ( (lv_declarations_4_0= ruleCssDeclaration ) )? (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )* otherlv_7= '}'
            {
            // PsiInternalCssDsl.g:751:3: ( ( (lv_type_0_0= ruleIdentifier ) ) | ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA18_1 = input.LA(2);

                if ( ((LA18_1>=RULE_UNDERSCORE && LA18_1<=RULE_ONE_NON_HEX_LETTER)||(LA18_1>=50 && LA18_1<=53)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==RULE_ONE_INT||LA18_1==35) ) {
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
            case RULE_UNDERSCORE:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt18=1;
                }
                break;
            case RULE_PLUS:
            case RULE_ONE_INT:
            case 35:
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
                    // PsiInternalCssDsl.g:752:4: ( (lv_type_0_0= ruleIdentifier ) )
                    {
                    // PsiInternalCssDsl.g:752:4: ( (lv_type_0_0= ruleIdentifier ) )
                    // PsiInternalCssDsl.g:753:5: (lv_type_0_0= ruleIdentifier )
                    {
                    // PsiInternalCssDsl.g:753:5: (lv_type_0_0= ruleIdentifier )
                    // PsiInternalCssDsl.g:754:6: lv_type_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getKeyframeSelector_TypeIdentifierParserRuleCall_0_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_type_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:768:4: ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT )
                    {
                    // PsiInternalCssDsl.g:768:4: ( ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT )
                    // PsiInternalCssDsl.g:769:5: ( (lv_percentage_1_0= ruleNum ) ) this_PERCENT_2= RULE_PERCENT
                    {
                    // PsiInternalCssDsl.g:769:5: ( (lv_percentage_1_0= ruleNum ) )
                    // PsiInternalCssDsl.g:770:6: (lv_percentage_1_0= ruleNum )
                    {
                    // PsiInternalCssDsl.g:770:6: (lv_percentage_1_0= ruleNum )
                    // PsiInternalCssDsl.g:771:7: lv_percentage_1_0= ruleNum
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getKeyframeSelector_PercentageNumParserRuleCall_0_1_0_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_percentage_1_0=ruleNum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getKeyframeSelector_PERCENTTerminalRuleCall_0_1_1ElementType());
                      				
                    }
                    this_PERCENT_2=(Token)match(input,RULE_PERCENT,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(this_PERCENT_2);
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getKeyframeSelector_LeftCurlyBracketKeyword_1ElementType());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalCssDsl.g:800:3: ( (lv_declarations_4_0= ruleCssDeclaration ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_DASH && LA19_0<=RULE_ONE_NON_HEX_LETTER)||(LA19_0>=50 && LA19_0<=53)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalCssDsl.g:801:4: (lv_declarations_4_0= ruleCssDeclaration )
                    {
                    // PsiInternalCssDsl.g:801:4: (lv_declarations_4_0= ruleCssDeclaration )
                    // PsiInternalCssDsl.g:802:5: lv_declarations_4_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getKeyframeSelector_DeclarationsCssDeclarationParserRuleCall_2_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_4_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCssDsl.g:815:3: (otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // PsiInternalCssDsl.g:816:4: otherlv_5= ';' ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getKeyframeSelector_SemicolonKeyword_3_0ElementType());
            	      			
            	    }
            	    otherlv_5=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(otherlv_5);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:823:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_DASH && LA20_0<=RULE_ONE_NON_HEX_LETTER)||(LA20_0>=50 && LA20_0<=53)) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // PsiInternalCssDsl.g:824:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            {
            	            // PsiInternalCssDsl.g:824:5: (lv_declarations_6_0= ruleCssDeclaration )
            	            // PsiInternalCssDsl.g:825:6: lv_declarations_6_0= ruleCssDeclaration
            	            {
            	            if ( state.backtracking==0 ) {

            	              						markComposite(elementTypeProvider.getKeyframeSelector_DeclarationsCssDeclarationParserRuleCall_3_1_0ElementType());
            	              					
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_declarations_6_0=ruleCssDeclaration();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneComposite();
            	              						if(!current) {
            	              							associateWithSemanticElement();
            	              							current = true;
            	              						}
            	              					
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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getKeyframeSelector_RightCurlyBracketKeyword_4ElementType());
              		
            }
            otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_7);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyframeSelector"


    // $ANTLR start "entryRuleRuleset"
    // PsiInternalCssDsl.g:850:1: entryRuleRuleset returns [Boolean current=false] : iv_ruleRuleset= ruleRuleset EOF ;
    public final Boolean entryRuleRuleset() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRuleset = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:852:2: (iv_ruleRuleset= ruleRuleset EOF )
            // PsiInternalCssDsl.g:853:2: iv_ruleRuleset= ruleRuleset EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getRulesetElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRuleset"


    // $ANTLR start "ruleRuleset"
    // PsiInternalCssDsl.g:862:1: ruleRuleset returns [Boolean current=false] : ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' ) ;
    public final Boolean ruleRuleset() throws RecognitionException {
        Boolean current = false;

        Token this_WS_1=null;
        Token this_COMMA_2=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Boolean lv_selectors_0_0 = null;

        Boolean lv_selectors_3_0 = null;

        Boolean lv_declarations_6_0 = null;

        Boolean lv_declarations_8_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:865:2: ( ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' ) )
            // PsiInternalCssDsl.g:866:2: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' )
            {
            // PsiInternalCssDsl.g:866:2: ( ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}' )
            // PsiInternalCssDsl.g:867:3: ( (lv_selectors_0_0= ruleSelector ) ) ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )* (this_WS_4= RULE_WS )* otherlv_5= '{' ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )? otherlv_10= '}'
            {
            // PsiInternalCssDsl.g:867:3: ( (lv_selectors_0_0= ruleSelector ) )
            // PsiInternalCssDsl.g:868:4: (lv_selectors_0_0= ruleSelector )
            {
            // PsiInternalCssDsl.g:868:4: (lv_selectors_0_0= ruleSelector )
            // PsiInternalCssDsl.g:869:5: lv_selectors_0_0= ruleSelector
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getRuleset_SelectorsSelectorParserRuleCall_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_18);
            lv_selectors_0_0=ruleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:882:3: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // PsiInternalCssDsl.g:883:4: (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) )
            	    {
            	    // PsiInternalCssDsl.g:883:4: (this_WS_1= RULE_WS )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_WS) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // PsiInternalCssDsl.g:884:5: this_WS_1= RULE_WS
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      					markLeaf(elementTypeProvider.getRuleset_WSTerminalRuleCall_1_0ElementType());
            	    	      				
            	    	    }
            	    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					doneLeaf(this_WS_1);
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getRuleset_COMMATerminalRuleCall_1_1ElementType());
            	      			
            	    }
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_COMMA_2);
            	      			
            	    }
            	    // PsiInternalCssDsl.g:899:4: ( (lv_selectors_3_0= ruleSelector ) )
            	    // PsiInternalCssDsl.g:900:5: (lv_selectors_3_0= ruleSelector )
            	    {
            	    // PsiInternalCssDsl.g:900:5: (lv_selectors_3_0= ruleSelector )
            	    // PsiInternalCssDsl.g:901:6: lv_selectors_3_0= ruleSelector
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getRuleset_SelectorsSelectorParserRuleCall_1_2_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_selectors_3_0=ruleSelector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // PsiInternalCssDsl.g:915:3: (this_WS_4= RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // PsiInternalCssDsl.g:916:4: this_WS_4= RULE_WS
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getRuleset_WSTerminalRuleCall_2ElementType());
            	      			
            	    }
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_WS_4);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getRuleset_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_5=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
            }
            // PsiInternalCssDsl.g:931:3: ( ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_DASH && LA27_0<=RULE_ONE_NON_HEX_LETTER)||(LA27_0>=50 && LA27_0<=53)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalCssDsl.g:932:4: ( (lv_declarations_6_0= ruleCssDeclaration ) ) (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )* (otherlv_9= ';' )?
                    {
                    // PsiInternalCssDsl.g:932:4: ( (lv_declarations_6_0= ruleCssDeclaration ) )
                    // PsiInternalCssDsl.g:933:5: (lv_declarations_6_0= ruleCssDeclaration )
                    {
                    // PsiInternalCssDsl.g:933:5: (lv_declarations_6_0= ruleCssDeclaration )
                    // PsiInternalCssDsl.g:934:6: lv_declarations_6_0= ruleCssDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getRuleset_DeclarationsCssDeclarationParserRuleCall_4_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_declarations_6_0=ruleCssDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalCssDsl.g:947:4: (otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            int LA25_1 = input.LA(2);

                            if ( ((LA25_1>=RULE_DASH && LA25_1<=RULE_ONE_NON_HEX_LETTER)||(LA25_1>=50 && LA25_1<=53)) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:948:5: otherlv_7= ';' ( (lv_declarations_8_0= ruleCssDeclaration ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getRuleset_SemicolonKeyword_4_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_7=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_7);
                    	      				
                    	    }
                    	    // PsiInternalCssDsl.g:955:5: ( (lv_declarations_8_0= ruleCssDeclaration ) )
                    	    // PsiInternalCssDsl.g:956:6: (lv_declarations_8_0= ruleCssDeclaration )
                    	    {
                    	    // PsiInternalCssDsl.g:956:6: (lv_declarations_8_0= ruleCssDeclaration )
                    	    // PsiInternalCssDsl.g:957:7: lv_declarations_8_0= ruleCssDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getRuleset_DeclarationsCssDeclarationParserRuleCall_4_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_declarations_8_0=ruleCssDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // PsiInternalCssDsl.g:971:4: (otherlv_9= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==21) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // PsiInternalCssDsl.g:972:5: otherlv_9= ';'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getRuleset_SemicolonKeyword_4_2ElementType());
                              				
                            }
                            otherlv_9=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_9);
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getRuleset_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_10=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_10);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRuleset"


    // $ANTLR start "entryRuleCssDeclaration"
    // PsiInternalCssDsl.g:995:1: entryRuleCssDeclaration returns [Boolean current=false] : iv_ruleCssDeclaration= ruleCssDeclaration EOF ;
    public final Boolean entryRuleCssDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssDeclaration = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:997:2: (iv_ruleCssDeclaration= ruleCssDeclaration EOF )
            // PsiInternalCssDsl.g:998:2: iv_ruleCssDeclaration= ruleCssDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCssDeclarationElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCssDeclaration"


    // $ANTLR start "ruleCssDeclaration"
    // PsiInternalCssDsl.g:1007:1: ruleCssDeclaration returns [Boolean current=false] : ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? ) ;
    public final Boolean ruleCssDeclaration() throws RecognitionException {
        Boolean current = false;

        Token this_WS_1=null;
        Token this_COLON_2=null;
        Token lv_important_4_0=null;
        Boolean lv_property_0_0 = null;

        Boolean lv_valueTokens_3_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:1010:2: ( ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? ) )
            // PsiInternalCssDsl.g:1011:2: ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? )
            {
            // PsiInternalCssDsl.g:1011:2: ( ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )? )
            // PsiInternalCssDsl.g:1012:3: ( (lv_property_0_0= ruleCssProperty ) ) (this_WS_1= RULE_WS )* this_COLON_2= RULE_COLON ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+ ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )?
            {
            // PsiInternalCssDsl.g:1012:3: ( (lv_property_0_0= ruleCssProperty ) )
            // PsiInternalCssDsl.g:1013:4: (lv_property_0_0= ruleCssProperty )
            {
            // PsiInternalCssDsl.g:1013:4: (lv_property_0_0= ruleCssProperty )
            // PsiInternalCssDsl.g:1014:5: lv_property_0_0= ruleCssProperty
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCssDeclaration_PropertyCssPropertyParserRuleCall_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_24);
            lv_property_0_0=ruleCssProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:1027:3: (this_WS_1= RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // PsiInternalCssDsl.g:1028:4: this_WS_1= RULE_WS
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getCssDeclaration_WSTerminalRuleCall_1ElementType());
            	      			
            	    }
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_WS_1);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCssDeclaration_COLONTerminalRuleCall_2ElementType());
              		
            }
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_COLON_2);
              		
            }
            // PsiInternalCssDsl.g:1043:3: ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // PsiInternalCssDsl.g:1044:4: ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok )
            	    {
            	    // PsiInternalCssDsl.g:1048:4: (lv_valueTokens_3_0= ruleCssTok )
            	    // PsiInternalCssDsl.g:1049:5: lv_valueTokens_3_0= ruleCssTok
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getCssDeclaration_ValueTokensCssTokParserRuleCall_3_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_valueTokens_3_0=ruleCssTok();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
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

            // PsiInternalCssDsl.g:1062:3: ( (lv_important_4_0= RULE_IMPORTANT_SYM ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IMPORTANT_SYM) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalCssDsl.g:1063:4: (lv_important_4_0= RULE_IMPORTANT_SYM )
                    {
                    // PsiInternalCssDsl.g:1063:4: (lv_important_4_0= RULE_IMPORTANT_SYM )
                    // PsiInternalCssDsl.g:1064:5: lv_important_4_0= RULE_IMPORTANT_SYM
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getCssDeclaration_ImportantIMPORTANT_SYMTerminalRuleCall_4_0ElementType());
                      				
                    }
                    lv_important_4_0=(Token)match(input,RULE_IMPORTANT_SYM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_important_4_0);
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCssDeclaration"


    // $ANTLR start "entryRuleSelector"
    // PsiInternalCssDsl.g:1086:1: entryRuleSelector returns [Boolean current=false] : iv_ruleSelector= ruleSelector EOF ;
    public final Boolean entryRuleSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:1088:2: (iv_ruleSelector= ruleSelector EOF )
            // PsiInternalCssDsl.g:1089:2: iv_ruleSelector= ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // PsiInternalCssDsl.g:1098:1: ruleSelector returns [Boolean current=false] : ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? ) ;
    public final Boolean ruleSelector() throws RecognitionException {
        Boolean current = false;

        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        Boolean lv_simpleselectors_0_0 = null;

        Boolean lv_combinator_1_0 = null;

        Boolean lv_selector_3_0 = null;

        Boolean lv_combinator_5_0 = null;

        Boolean lv_selector_7_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // PsiInternalCssDsl.g:1101:2: ( ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? ) )
            // PsiInternalCssDsl.g:1102:2: ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? )
            {
            // PsiInternalCssDsl.g:1102:2: ( ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )? )
            // PsiInternalCssDsl.g:1103:3: ( (lv_simpleselectors_0_0= ruleSimpleSelector ) ) ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?
            {
            // PsiInternalCssDsl.g:1103:3: ( (lv_simpleselectors_0_0= ruleSimpleSelector ) )
            // PsiInternalCssDsl.g:1104:4: (lv_simpleselectors_0_0= ruleSimpleSelector )
            {
            // PsiInternalCssDsl.g:1104:4: (lv_simpleselectors_0_0= ruleSimpleSelector )
            // PsiInternalCssDsl.g:1105:5: lv_simpleselectors_0_0= ruleSimpleSelector
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getSelector_SimpleselectorsSimpleSelectorParserRuleCall_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_27);
            lv_simpleselectors_0_0=ruleSimpleSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:1118:3: ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // PsiInternalCssDsl.g:1119:4: ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) )
                    {
                    // PsiInternalCssDsl.g:1119:4: ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) )
                    // PsiInternalCssDsl.g:1120:5: ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) )
                    {
                    // PsiInternalCssDsl.g:1120:5: ( (lv_combinator_1_0= ruleCombinator ) )
                    // PsiInternalCssDsl.g:1121:6: (lv_combinator_1_0= ruleCombinator )
                    {
                    // PsiInternalCssDsl.g:1121:6: (lv_combinator_1_0= ruleCombinator )
                    // PsiInternalCssDsl.g:1122:7: lv_combinator_1_0= ruleCombinator
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getSelector_CombinatorCombinatorParserRuleCall_1_0_0_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_28);
                    lv_combinator_1_0=ruleCombinator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }

                    // PsiInternalCssDsl.g:1135:5: (this_WS_2= RULE_WS )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_WS) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:1136:6: this_WS_2= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markLeaf(elementTypeProvider.getSelector_WSTerminalRuleCall_1_0_1ElementType());
                    	      					
                    	    }
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_28); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneLeaf(this_WS_2);
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // PsiInternalCssDsl.g:1144:5: ( (lv_selector_3_0= ruleSelector ) )
                    // PsiInternalCssDsl.g:1145:6: (lv_selector_3_0= ruleSelector )
                    {
                    // PsiInternalCssDsl.g:1145:6: (lv_selector_3_0= ruleSelector )
                    // PsiInternalCssDsl.g:1146:7: lv_selector_3_0= ruleSelector
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getSelector_SelectorSelectorParserRuleCall_1_0_2_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_selector_3_0=ruleSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:1161:4: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) )
                    {
                    // PsiInternalCssDsl.g:1161:4: ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) )
                    // PsiInternalCssDsl.g:1162:5: (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) )
                    {
                    // PsiInternalCssDsl.g:1162:5: (this_WS_4= RULE_WS )+
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
                    	    // PsiInternalCssDsl.g:1163:6: this_WS_4= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markLeaf(elementTypeProvider.getSelector_WSTerminalRuleCall_1_1_0ElementType());
                    	      					
                    	    }
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneLeaf(this_WS_4);
                    	      					
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

                    // PsiInternalCssDsl.g:1171:5: ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_PLUS||(LA34_0>=41 && LA34_0<=42)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // PsiInternalCssDsl.g:1172:6: ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )*
                            {
                            // PsiInternalCssDsl.g:1172:6: ( (lv_combinator_5_0= ruleCombinator ) )
                            // PsiInternalCssDsl.g:1173:7: (lv_combinator_5_0= ruleCombinator )
                            {
                            // PsiInternalCssDsl.g:1173:7: (lv_combinator_5_0= ruleCombinator )
                            // PsiInternalCssDsl.g:1174:8: lv_combinator_5_0= ruleCombinator
                            {
                            if ( state.backtracking==0 ) {

                              								markComposite(elementTypeProvider.getSelector_CombinatorCombinatorParserRuleCall_1_1_1_0_0ElementType());
                              							
                            }
                            pushFollow(FOLLOW_28);
                            lv_combinator_5_0=ruleCombinator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneComposite();
                              								if(!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalCssDsl.g:1187:6: (this_WS_6= RULE_WS )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_WS) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // PsiInternalCssDsl.g:1188:7: this_WS_6= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getSelector_WSTerminalRuleCall_1_1_1_1ElementType());
                            	      						
                            	    }
                            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_WS_6);
                            	      						
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

                    // PsiInternalCssDsl.g:1197:5: ( (lv_selector_7_0= ruleSelector ) )
                    // PsiInternalCssDsl.g:1198:6: (lv_selector_7_0= ruleSelector )
                    {
                    // PsiInternalCssDsl.g:1198:6: (lv_selector_7_0= ruleSelector )
                    // PsiInternalCssDsl.g:1199:7: lv_selector_7_0= ruleSelector
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getSelector_SelectorSelectorParserRuleCall_1_1_2_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_selector_7_0=ruleSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSimpleSelectorForNegation"
    // PsiInternalCssDsl.g:1221:1: entryRuleSimpleSelectorForNegation returns [Boolean current=false] : iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF ;
    public final Boolean entryRuleSimpleSelectorForNegation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSimpleSelectorForNegation = null;


        try {
            // PsiInternalCssDsl.g:1221:67: (iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF )
            // PsiInternalCssDsl.g:1222:2: iv_ruleSimpleSelectorForNegation= ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSimpleSelectorForNegationElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelectorForNegation"


    // $ANTLR start "ruleSimpleSelectorForNegation"
    // PsiInternalCssDsl.g:1228:1: ruleSimpleSelectorForNegation returns [Boolean current=false] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) ;
    public final Boolean ruleSimpleSelectorForNegation() throws RecognitionException {
        Boolean current = false;

        Boolean lv_element_0_0 = null;

        Boolean lv_universal_1_0 = null;

        Boolean lv_subSelectors_2_0 = null;

        Boolean lv_subSelectors_3_0 = null;


        try {
            // PsiInternalCssDsl.g:1229:1: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ ) )
            // PsiInternalCssDsl.g:1230:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            {
            // PsiInternalCssDsl.g:1230:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* ) | ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+ )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_DASH && LA39_0<=RULE_ONE_NON_HEX_LETTER)||(LA39_0>=36 && LA39_0<=37)||(LA39_0>=50 && LA39_0<=53)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_COLON||LA39_0==RULE_HASHMARK||LA39_0==29||LA39_0==35) ) {
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
                    // PsiInternalCssDsl.g:1231:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    {
                    // PsiInternalCssDsl.g:1231:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )* )
                    // PsiInternalCssDsl.g:1232:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    {
                    // PsiInternalCssDsl.g:1232:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // PsiInternalCssDsl.g:1233:5: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // PsiInternalCssDsl.g:1233:5: ( (lv_element_0_0= ruleElementSelector ) )
                            // PsiInternalCssDsl.g:1234:6: (lv_element_0_0= ruleElementSelector )
                            {
                            // PsiInternalCssDsl.g:1234:6: (lv_element_0_0= ruleElementSelector )
                            // PsiInternalCssDsl.g:1235:7: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getSimpleSelectorForNegation_ElementElementSelectorParserRuleCall_0_0_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalCssDsl.g:1249:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // PsiInternalCssDsl.g:1249:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // PsiInternalCssDsl.g:1250:6: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // PsiInternalCssDsl.g:1250:6: (lv_universal_1_0= ruleUniversalSelector )
                            // PsiInternalCssDsl.g:1251:7: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getSimpleSelectorForNegation_UniversalUniversalSelectorParserRuleCall_0_0_1_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // PsiInternalCssDsl.g:1265:4: ( (lv_subSelectors_2_0= ruleSubSelectorForNegation ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_COLON||LA37_0==RULE_HASHMARK||LA37_0==29||LA37_0==35) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:1266:5: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    {
                    	    // PsiInternalCssDsl.g:1266:5: (lv_subSelectors_2_0= ruleSubSelectorForNegation )
                    	    // PsiInternalCssDsl.g:1267:6: lv_subSelectors_2_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getSimpleSelectorForNegation_SubSelectorsSubSelectorForNegationParserRuleCall_0_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_subSelectors_2_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      						if(!current) {
                    	      							associateWithSemanticElement();
                    	      							current = true;
                    	      						}
                    	      					
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
                    // PsiInternalCssDsl.g:1282:3: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    {
                    // PsiInternalCssDsl.g:1282:3: ( ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_HASHMARK) && (synpred2_PsiInternalCssDsl())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==35) && (synpred2_PsiInternalCssDsl())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==29) && (synpred2_PsiInternalCssDsl())) {
                            alt38=1;
                        }
                        else if ( (LA38_0==RULE_COLON) && (synpred2_PsiInternalCssDsl())) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:1283:4: ( ( ruleSubSelectorForNegation ) )=> (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    {
                    	    // PsiInternalCssDsl.g:1287:4: (lv_subSelectors_3_0= ruleSubSelectorForNegation )
                    	    // PsiInternalCssDsl.g:1288:5: lv_subSelectors_3_0= ruleSubSelectorForNegation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markComposite(elementTypeProvider.getSimpleSelectorForNegation_SubSelectorsSubSelectorForNegationParserRuleCall_1_0ElementType());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_subSelectors_3_0=ruleSubSelectorForNegation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneComposite();
                    	      					if(!current) {
                    	      						associateWithSemanticElement();
                    	      						current = true;
                    	      					}
                    	      				
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSelectorForNegation"


    // $ANTLR start "entryRuleSubSelectorForNegation"
    // PsiInternalCssDsl.g:1305:1: entryRuleSubSelectorForNegation returns [Boolean current=false] : iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF ;
    public final Boolean entryRuleSubSelectorForNegation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubSelectorForNegation = null;


        try {
            // PsiInternalCssDsl.g:1305:64: (iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF )
            // PsiInternalCssDsl.g:1306:2: iv_ruleSubSelectorForNegation= ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSubSelectorForNegationElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSelectorForNegation"


    // $ANTLR start "ruleSubSelectorForNegation"
    // PsiInternalCssDsl.g:1312:1: ruleSubSelectorForNegation returns [Boolean current=false] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) ;
    public final Boolean ruleSubSelectorForNegation() throws RecognitionException {
        Boolean current = false;

        Boolean this_IdSelector_0 = null;

        Boolean this_ClassSelector_1 = null;

        Boolean this_AttributeSelector_2 = null;

        Boolean this_PseudoClass_3 = null;


        try {
            // PsiInternalCssDsl.g:1313:1: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass ) )
            // PsiInternalCssDsl.g:1314:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            {
            // PsiInternalCssDsl.g:1314:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClass_3= rulePseudoClass )
            int alt40=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt40=1;
                }
                break;
            case 35:
                {
                alt40=2;
                }
                break;
            case 29:
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
                    // PsiInternalCssDsl.g:1315:3: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelectorForNegation_IdSelectorParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdSelector_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:1324:3: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelectorForNegation_ClassSelectorParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassSelector_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:1333:3: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelectorForNegation_AttributeSelectorParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeSelector_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:1342:3: this_PseudoClass_3= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelectorForNegation_PseudoClassParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClass_3=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClass_3;
                      			doneComposite();
                      		
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleSubSelectorForNegation"


    // $ANTLR start "entryRuleSimpleSelector"
    // PsiInternalCssDsl.g:1354:1: entryRuleSimpleSelector returns [Boolean current=false] : iv_ruleSimpleSelector= ruleSimpleSelector EOF ;
    public final Boolean entryRuleSimpleSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSimpleSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:1356:2: (iv_ruleSimpleSelector= ruleSimpleSelector EOF )
            // PsiInternalCssDsl.g:1357:2: iv_ruleSimpleSelector= ruleSimpleSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSimpleSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSelector"


    // $ANTLR start "ruleSimpleSelector"
    // PsiInternalCssDsl.g:1366:1: ruleSimpleSelector returns [Boolean current=false] : ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) ;
    public final Boolean ruleSimpleSelector() throws RecognitionException {
        Boolean current = false;

        Boolean lv_element_0_0 = null;

        Boolean lv_universal_1_0 = null;

        Boolean lv_subSelectors_2_0 = null;

        Boolean lv_subSelectors_3_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:1369:2: ( ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ ) )
            // PsiInternalCssDsl.g:1370:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            {
            // PsiInternalCssDsl.g:1370:2: ( ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* ) | ( (lv_subSelectors_3_0= ruleSubSelector ) )+ )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_DASH && LA44_0<=RULE_ONE_NON_HEX_LETTER)||(LA44_0>=36 && LA44_0<=37)||(LA44_0>=50 && LA44_0<=53)) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_COLON||LA44_0==RULE_HASHMARK||LA44_0==29||LA44_0==35) ) {
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
                    // PsiInternalCssDsl.g:1371:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    {
                    // PsiInternalCssDsl.g:1371:3: ( ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )* )
                    // PsiInternalCssDsl.g:1372:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) ) ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    {
                    // PsiInternalCssDsl.g:1372:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // PsiInternalCssDsl.g:1373:5: ( (lv_element_0_0= ruleElementSelector ) )
                            {
                            // PsiInternalCssDsl.g:1373:5: ( (lv_element_0_0= ruleElementSelector ) )
                            // PsiInternalCssDsl.g:1374:6: (lv_element_0_0= ruleElementSelector )
                            {
                            // PsiInternalCssDsl.g:1374:6: (lv_element_0_0= ruleElementSelector )
                            // PsiInternalCssDsl.g:1375:7: lv_element_0_0= ruleElementSelector
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getSimpleSelector_ElementElementSelectorParserRuleCall_0_0_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_element_0_0=ruleElementSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalCssDsl.g:1389:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            {
                            // PsiInternalCssDsl.g:1389:5: ( (lv_universal_1_0= ruleUniversalSelector ) )
                            // PsiInternalCssDsl.g:1390:6: (lv_universal_1_0= ruleUniversalSelector )
                            {
                            // PsiInternalCssDsl.g:1390:6: (lv_universal_1_0= ruleUniversalSelector )
                            // PsiInternalCssDsl.g:1391:7: lv_universal_1_0= ruleUniversalSelector
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getSimpleSelector_UniversalUniversalSelectorParserRuleCall_0_0_1_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_31);
                            lv_universal_1_0=ruleUniversalSelector();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // PsiInternalCssDsl.g:1405:4: ( (lv_subSelectors_2_0= ruleSubSelector ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_COLON||LA42_0==RULE_HASHMARK||LA42_0==29||LA42_0==35) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:1406:5: (lv_subSelectors_2_0= ruleSubSelector )
                    	    {
                    	    // PsiInternalCssDsl.g:1406:5: (lv_subSelectors_2_0= ruleSubSelector )
                    	    // PsiInternalCssDsl.g:1407:6: lv_subSelectors_2_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getSimpleSelector_SubSelectorsSubSelectorParserRuleCall_0_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_subSelectors_2_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      						if(!current) {
                    	      							associateWithSemanticElement();
                    	      							current = true;
                    	      						}
                    	      					
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
                    // PsiInternalCssDsl.g:1422:3: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    {
                    // PsiInternalCssDsl.g:1422:3: ( (lv_subSelectors_3_0= ruleSubSelector ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_COLON||LA43_0==RULE_HASHMARK||LA43_0==29||LA43_0==35) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:1423:4: (lv_subSelectors_3_0= ruleSubSelector )
                    	    {
                    	    // PsiInternalCssDsl.g:1423:4: (lv_subSelectors_3_0= ruleSubSelector )
                    	    // PsiInternalCssDsl.g:1424:5: lv_subSelectors_3_0= ruleSubSelector
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markComposite(elementTypeProvider.getSimpleSelector_SubSelectorsSubSelectorParserRuleCall_1_0ElementType());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_subSelectors_3_0=ruleSubSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneComposite();
                    	      					if(!current) {
                    	      						associateWithSemanticElement();
                    	      						current = true;
                    	      					}
                    	      				
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSimpleSelector"


    // $ANTLR start "entryRuleSubSelector"
    // PsiInternalCssDsl.g:1444:1: entryRuleSubSelector returns [Boolean current=false] : iv_ruleSubSelector= ruleSubSelector EOF ;
    public final Boolean entryRuleSubSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubSelector = null;


        try {
            // PsiInternalCssDsl.g:1444:53: (iv_ruleSubSelector= ruleSubSelector EOF )
            // PsiInternalCssDsl.g:1445:2: iv_ruleSubSelector= ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSubSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // PsiInternalCssDsl.g:1451:1: ruleSubSelector returns [Boolean current=false] : (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) ;
    public final Boolean ruleSubSelector() throws RecognitionException {
        Boolean current = false;

        Boolean this_IdSelector_0 = null;

        Boolean this_ClassSelector_1 = null;

        Boolean this_AttributeSelector_2 = null;

        Boolean this_PseudoClassOrFunc_3 = null;


        try {
            // PsiInternalCssDsl.g:1452:1: ( (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc ) )
            // PsiInternalCssDsl.g:1453:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            {
            // PsiInternalCssDsl.g:1453:2: (this_IdSelector_0= ruleIdSelector | this_ClassSelector_1= ruleClassSelector | this_AttributeSelector_2= ruleAttributeSelector | this_PseudoClassOrFunc_3= rulePseudoClassOrFunc )
            int alt45=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt45=1;
                }
                break;
            case 35:
                {
                alt45=2;
                }
                break;
            case 29:
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
                    // PsiInternalCssDsl.g:1454:3: this_IdSelector_0= ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelector_IdSelectorParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdSelector_0=ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdSelector_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:1463:3: this_ClassSelector_1= ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelector_ClassSelectorParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassSelector_1=ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassSelector_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:1472:3: this_AttributeSelector_2= ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelector_AttributeSelectorParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeSelector_2=ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeSelector_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:1481:3: this_PseudoClassOrFunc_3= rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getSubSelector_PseudoClassOrFuncParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClassOrFunc_3=rulePseudoClassOrFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClassOrFunc_3;
                      			doneComposite();
                      		
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // PsiInternalCssDsl.g:1493:1: entryRuleAttributeSelector returns [Boolean current=false] : iv_ruleAttributeSelector= ruleAttributeSelector EOF ;
    public final Boolean entryRuleAttributeSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAttributeSelector = null;


        try {
            // PsiInternalCssDsl.g:1493:59: (iv_ruleAttributeSelector= ruleAttributeSelector EOF )
            // PsiInternalCssDsl.g:1494:2: iv_ruleAttributeSelector= ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAttributeSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // PsiInternalCssDsl.g:1500:1: ruleAttributeSelector returns [Boolean current=false] : ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' ) ;
    public final Boolean ruleAttributeSelector() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        Token lv_op_3_3=null;
        Token lv_op_3_4=null;
        Token lv_op_3_5=null;
        Token lv_op_3_6=null;
        Token lv_value_4_2=null;
        Token otherlv_5=null;
        Boolean lv_name_2_0 = null;

        Boolean lv_value_4_1 = null;


        try {
            // PsiInternalCssDsl.g:1501:1: ( ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' ) )
            // PsiInternalCssDsl.g:1502:2: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' )
            {
            // PsiInternalCssDsl.g:1502:2: ( () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']' )
            // PsiInternalCssDsl.g:1503:3: () otherlv_1= '[' ( (lv_name_2_0= ruleIdentifier ) ) ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )? otherlv_5= ']'
            {
            // PsiInternalCssDsl.g:1503:3: ()
            // PsiInternalCssDsl.g:1504:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getAttributeSelector_AttributeSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getAttributeSelector_LeftSquareBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssDsl.g:1517:3: ( (lv_name_2_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:1518:4: (lv_name_2_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:1518:4: (lv_name_2_0= ruleIdentifier )
            // PsiInternalCssDsl.g:1519:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getAttributeSelector_NameIdentifierParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:1532:3: ( ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_INCLUDES && LA48_0<=RULE_DASHMATCH)||(LA48_0>=30 && LA48_0<=33)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalCssDsl.g:1533:4: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) ) ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    {
                    // PsiInternalCssDsl.g:1533:4: ( ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) ) )
                    // PsiInternalCssDsl.g:1534:5: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    {
                    // PsiInternalCssDsl.g:1534:5: ( (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH ) )
                    // PsiInternalCssDsl.g:1535:6: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    {
                    // PsiInternalCssDsl.g:1535:6: (lv_op_3_1= '^=' | lv_op_3_2= '$=' | lv_op_3_3= '*=' | lv_op_3_4= '=' | lv_op_3_5= RULE_INCLUDES | lv_op_3_6= RULE_DASHMATCH )
                    int alt46=6;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt46=1;
                        }
                        break;
                    case 31:
                        {
                        alt46=2;
                        }
                        break;
                    case 32:
                        {
                        alt46=3;
                        }
                        break;
                    case 33:
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
                            // PsiInternalCssDsl.g:1536:7: lv_op_3_1= '^='
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpCircumflexAccentEqualsSignKeyword_3_0_0_0ElementType());
                              						
                            }
                            lv_op_3_1=(Token)match(input,30,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_1);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;
                        case 2 :
                            // PsiInternalCssDsl.g:1550:7: lv_op_3_2= '$='
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpDollarSignEqualsSignKeyword_3_0_0_1ElementType());
                              						
                            }
                            lv_op_3_2=(Token)match(input,31,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_2);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;
                        case 3 :
                            // PsiInternalCssDsl.g:1564:7: lv_op_3_3= '*='
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpAsteriskEqualsSignKeyword_3_0_0_2ElementType());
                              						
                            }
                            lv_op_3_3=(Token)match(input,32,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_3);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;
                        case 4 :
                            // PsiInternalCssDsl.g:1578:7: lv_op_3_4= '='
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpEqualsSignKeyword_3_0_0_3ElementType());
                              						
                            }
                            lv_op_3_4=(Token)match(input,33,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_4);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;
                        case 5 :
                            // PsiInternalCssDsl.g:1592:7: lv_op_3_5= RULE_INCLUDES
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpINCLUDESTerminalRuleCall_3_0_0_4ElementType());
                              						
                            }
                            lv_op_3_5=(Token)match(input,RULE_INCLUDES,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_5);
                              						
                            }

                            }
                            break;
                        case 6 :
                            // PsiInternalCssDsl.g:1606:7: lv_op_3_6= RULE_DASHMATCH
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_OpDASHMATCHTerminalRuleCall_3_0_0_5ElementType());
                              						
                            }
                            lv_op_3_6=(Token)match(input,RULE_DASHMATCH,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_op_3_6);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // PsiInternalCssDsl.g:1622:4: ( ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) ) )
                    // PsiInternalCssDsl.g:1623:5: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    {
                    // PsiInternalCssDsl.g:1623:5: ( (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING ) )
                    // PsiInternalCssDsl.g:1624:6: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    {
                    // PsiInternalCssDsl.g:1624:6: (lv_value_4_1= ruleIdentifier | lv_value_4_2= RULE_CSSSTRING )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=RULE_DASH && LA47_0<=RULE_ONE_NON_HEX_LETTER)||(LA47_0>=50 && LA47_0<=53)) ) {
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
                            // PsiInternalCssDsl.g:1625:7: lv_value_4_1= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getAttributeSelector_ValueIdentifierParserRuleCall_3_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_34);
                            lv_value_4_1=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneComposite();
                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;
                        case 2 :
                            // PsiInternalCssDsl.g:1637:7: lv_value_4_2= RULE_CSSSTRING
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getAttributeSelector_ValueCSSSTRINGTerminalRuleCall_3_1_0_1ElementType());
                              						
                            }
                            lv_value_4_2=(Token)match(input,RULE_CSSSTRING,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if(!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_value_4_2);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getAttributeSelector_RightSquareBracketKeyword_4ElementType());
              		
            }
            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // PsiInternalCssDsl.g:1665:1: entryRuleClassSelector returns [Boolean current=false] : iv_ruleClassSelector= ruleClassSelector EOF ;
    public final Boolean entryRuleClassSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleClassSelector = null;


        try {
            // PsiInternalCssDsl.g:1665:55: (iv_ruleClassSelector= ruleClassSelector EOF )
            // PsiInternalCssDsl.g:1666:2: iv_ruleClassSelector= ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getClassSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // PsiInternalCssDsl.g:1672:1: ruleClassSelector returns [Boolean current=false] : ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final Boolean ruleClassSelector() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Boolean lv_name_2_0 = null;


        try {
            // PsiInternalCssDsl.g:1673:1: ( ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // PsiInternalCssDsl.g:1674:2: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // PsiInternalCssDsl.g:1674:2: ( () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) ) )
            // PsiInternalCssDsl.g:1675:3: () otherlv_1= '.' ( (lv_name_2_0= ruleIdentifier ) )
            {
            // PsiInternalCssDsl.g:1675:3: ()
            // PsiInternalCssDsl.g:1676:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getClassSelector_ClassSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getClassSelector_FullStopKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssDsl.g:1689:3: ( (lv_name_2_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:1690:4: (lv_name_2_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:1690:4: (lv_name_2_0= ruleIdentifier )
            // PsiInternalCssDsl.g:1691:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getClassSelector_NameIdentifierParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // PsiInternalCssDsl.g:1708:1: entryRuleElementSelector returns [Boolean current=false] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final Boolean entryRuleElementSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleElementSelector = null;


        try {
            // PsiInternalCssDsl.g:1708:57: (iv_ruleElementSelector= ruleElementSelector EOF )
            // PsiInternalCssDsl.g:1709:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getElementSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // PsiInternalCssDsl.g:1715:1: ruleElementSelector returns [Boolean current=false] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final Boolean ruleElementSelector() throws RecognitionException {
        Boolean current = false;

        Boolean lv_name_1_0 = null;


        try {
            // PsiInternalCssDsl.g:1716:1: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // PsiInternalCssDsl.g:1717:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // PsiInternalCssDsl.g:1717:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) )
            // PsiInternalCssDsl.g:1718:3: () ( (lv_name_1_0= ruleIdentifier ) )
            {
            // PsiInternalCssDsl.g:1718:3: ()
            // PsiInternalCssDsl.g:1719:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getElementSelector_ElementSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:1725:3: ( (lv_name_1_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:1726:4: (lv_name_1_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:1726:4: (lv_name_1_0= ruleIdentifier )
            // PsiInternalCssDsl.g:1727:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getElementSelector_NameIdentifierParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // PsiInternalCssDsl.g:1744:1: entryRuleUniversalSelector returns [Boolean current=false] : iv_ruleUniversalSelector= ruleUniversalSelector EOF ;
    public final Boolean entryRuleUniversalSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUniversalSelector = null;


        try {
            // PsiInternalCssDsl.g:1744:59: (iv_ruleUniversalSelector= ruleUniversalSelector EOF )
            // PsiInternalCssDsl.g:1745:2: iv_ruleUniversalSelector= ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getUniversalSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // PsiInternalCssDsl.g:1751:1: ruleUniversalSelector returns [Boolean current=false] : ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= '*' ) ;
    public final Boolean ruleUniversalSelector() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean lv_namespace_1_0 = null;


        try {
            // PsiInternalCssDsl.g:1752:1: ( ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= '*' ) )
            // PsiInternalCssDsl.g:1753:2: ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= '*' )
            {
            // PsiInternalCssDsl.g:1753:2: ( () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= '*' )
            // PsiInternalCssDsl.g:1754:3: () ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )? otherlv_2= '*'
            {
            // PsiInternalCssDsl.g:1754:3: ()
            // PsiInternalCssDsl.g:1755:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getUniversalSelector_UniversalSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:1761:3: ( (lv_namespace_1_0= ruleCssNamespacePrefix ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_DASH && LA49_0<=RULE_ONE_NON_HEX_LETTER)||LA49_0==37||(LA49_0>=50 && LA49_0<=53)) ) {
                alt49=1;
            }
            else if ( (LA49_0==36) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==37) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // PsiInternalCssDsl.g:1762:4: (lv_namespace_1_0= ruleCssNamespacePrefix )
                    {
                    // PsiInternalCssDsl.g:1762:4: (lv_namespace_1_0= ruleCssNamespacePrefix )
                    // PsiInternalCssDsl.g:1763:5: lv_namespace_1_0= ruleCssNamespacePrefix
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getUniversalSelector_NamespaceCssNamespacePrefixParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_35);
                    lv_namespace_1_0=ruleCssNamespacePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getUniversalSelector_AsteriskKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // PsiInternalCssDsl.g:1787:1: entryRuleIdSelector returns [Boolean current=false] : iv_ruleIdSelector= ruleIdSelector EOF ;
    public final Boolean entryRuleIdSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIdSelector = null;


        try {
            // PsiInternalCssDsl.g:1787:52: (iv_ruleIdSelector= ruleIdSelector EOF )
            // PsiInternalCssDsl.g:1788:2: iv_ruleIdSelector= ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIdSelectorElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // PsiInternalCssDsl.g:1794:1: ruleIdSelector returns [Boolean current=false] : ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) ;
    public final Boolean ruleIdSelector() throws RecognitionException {
        Boolean current = false;

        Token this_HASHMARK_1=null;
        Boolean lv_name_2_0 = null;


        try {
            // PsiInternalCssDsl.g:1795:1: ( ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) ) )
            // PsiInternalCssDsl.g:1796:2: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            {
            // PsiInternalCssDsl.g:1796:2: ( () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) ) )
            // PsiInternalCssDsl.g:1797:3: () this_HASHMARK_1= RULE_HASHMARK ( (lv_name_2_0= ruleIdentifier ) )
            {
            // PsiInternalCssDsl.g:1797:3: ()
            // PsiInternalCssDsl.g:1798:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getIdSelector_IdSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getIdSelector_HASHMARKTerminalRuleCall_1ElementType());
              		
            }
            this_HASHMARK_1=(Token)match(input,RULE_HASHMARK,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_HASHMARK_1);
              		
            }
            // PsiInternalCssDsl.g:1811:3: ( (lv_name_2_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:1812:4: (lv_name_2_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:1812:4: (lv_name_2_0= ruleIdentifier )
            // PsiInternalCssDsl.g:1813:5: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getIdSelector_NameIdentifierParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRuleCssNamespacePrefix"
    // PsiInternalCssDsl.g:1830:1: entryRuleCssNamespacePrefix returns [Boolean current=false] : iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF ;
    public final Boolean entryRuleCssNamespacePrefix() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssNamespacePrefix = null;


        try {
            // PsiInternalCssDsl.g:1830:60: (iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF )
            // PsiInternalCssDsl.g:1831:2: iv_ruleCssNamespacePrefix= ruleCssNamespacePrefix EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCssNamespacePrefixElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssNamespacePrefix=ruleCssNamespacePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssNamespacePrefix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssNamespacePrefix"


    // $ANTLR start "ruleCssNamespacePrefix"
    // PsiInternalCssDsl.g:1837:1: ruleCssNamespacePrefix returns [Boolean current=false] : ( ( ruleIdentifier | kw= '*' )? kw= '|' ) ;
    public final Boolean ruleCssNamespacePrefix() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalCssDsl.g:1838:1: ( ( ( ruleIdentifier | kw= '*' )? kw= '|' ) )
            // PsiInternalCssDsl.g:1839:2: ( ( ruleIdentifier | kw= '*' )? kw= '|' )
            {
            // PsiInternalCssDsl.g:1839:2: ( ( ruleIdentifier | kw= '*' )? kw= '|' )
            // PsiInternalCssDsl.g:1840:3: ( ruleIdentifier | kw= '*' )? kw= '|'
            {
            // PsiInternalCssDsl.g:1840:3: ( ruleIdentifier | kw= '*' )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_DASH && LA50_0<=RULE_ONE_NON_HEX_LETTER)||(LA50_0>=50 && LA50_0<=53)) ) {
                alt50=1;
            }
            else if ( (LA50_0==36) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalCssDsl.g:1841:4: ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getCssNamespacePrefix_IdentifierParserRuleCall_0_0ElementType());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneComposite();
                      			
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:1849:4: kw= '*'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCssNamespacePrefix_AsteriskKeyword_0_1ElementType());
                      			
                    }
                    kw=(Token)match(input,36,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCssNamespacePrefix_VerticalLineKeyword_1ElementType());
              		
            }
            kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssNamespacePrefix"


    // $ANTLR start "entryRuleCssProperty"
    // PsiInternalCssDsl.g:1868:1: entryRuleCssProperty returns [Boolean current=false] : iv_ruleCssProperty= ruleCssProperty EOF ;
    public final Boolean entryRuleCssProperty() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssProperty = null;


        try {
            // PsiInternalCssDsl.g:1868:53: (iv_ruleCssProperty= ruleCssProperty EOF )
            // PsiInternalCssDsl.g:1869:2: iv_ruleCssProperty= ruleCssProperty EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCssPropertyElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssProperty"


    // $ANTLR start "ruleCssProperty"
    // PsiInternalCssDsl.g:1875:1: ruleCssProperty returns [Boolean current=false] : ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) ;
    public final Boolean ruleCssProperty() throws RecognitionException {
        Boolean current = false;

        Boolean lv_name_1_0 = null;


        try {
            // PsiInternalCssDsl.g:1876:1: ( ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) ) )
            // PsiInternalCssDsl.g:1877:2: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            {
            // PsiInternalCssDsl.g:1877:2: ( () ( (lv_name_1_0= ruleValidPropertyIdent ) ) )
            // PsiInternalCssDsl.g:1878:3: () ( (lv_name_1_0= ruleValidPropertyIdent ) )
            {
            // PsiInternalCssDsl.g:1878:3: ()
            // PsiInternalCssDsl.g:1879:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCssProperty_CssPropertyAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:1885:3: ( (lv_name_1_0= ruleValidPropertyIdent ) )
            // PsiInternalCssDsl.g:1886:4: (lv_name_1_0= ruleValidPropertyIdent )
            {
            // PsiInternalCssDsl.g:1886:4: (lv_name_1_0= ruleValidPropertyIdent )
            // PsiInternalCssDsl.g:1887:5: lv_name_1_0= ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCssProperty_NameValidPropertyIdentParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssProperty"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // PsiInternalCssDsl.g:1904:1: entryRuleValidPropertyIdent returns [Boolean current=false] : iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF ;
    public final Boolean entryRuleValidPropertyIdent() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidPropertyIdent = null;


        try {
            // PsiInternalCssDsl.g:1904:60: (iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF )
            // PsiInternalCssDsl.g:1905:2: iv_ruleValidPropertyIdent= ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getValidPropertyIdentElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidPropertyIdent=ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidPropertyIdent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // PsiInternalCssDsl.g:1911:1: ruleValidPropertyIdent returns [Boolean current=false] : ruleIdentifier ;
    public final Boolean ruleValidPropertyIdent() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalCssDsl.g:1912:1: ( ruleIdentifier )
            // PsiInternalCssDsl.g:1913:2: ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getValidPropertyIdent_IdentifierParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClassOrFunc"
    // PsiInternalCssDsl.g:1923:1: entryRulePseudoClassOrFunc returns [Boolean current=false] : iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF ;
    public final Boolean entryRulePseudoClassOrFunc() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoClassOrFunc = null;


        try {
            // PsiInternalCssDsl.g:1923:59: (iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF )
            // PsiInternalCssDsl.g:1924:2: iv_rulePseudoClassOrFunc= rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoClassOrFuncElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassOrFunc"


    // $ANTLR start "rulePseudoClassOrFunc"
    // PsiInternalCssDsl.g:1930:1: rulePseudoClassOrFunc returns [Boolean current=false] : (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) ;
    public final Boolean rulePseudoClassOrFunc() throws RecognitionException {
        Boolean current = false;

        Boolean this_PseudoClass_0 = null;

        Boolean this_PseudoClassFunction_1 = null;


        try {
            // PsiInternalCssDsl.g:1931:1: ( (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction ) )
            // PsiInternalCssDsl.g:1932:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            {
            // PsiInternalCssDsl.g:1932:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // PsiInternalCssDsl.g:1933:3: this_PseudoClass_0= rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPseudoClassOrFunc_PseudoClassParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClass_0=rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClass_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:1942:3: this_PseudoClassFunction_1= rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPseudoClassOrFunc_PseudoClassFunctionParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PseudoClassFunction_1=rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PseudoClassFunction_1;
                      			doneComposite();
                      		
                    }

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
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassOrFunc"


    // $ANTLR start "entryRulePseudoClass"
    // PsiInternalCssDsl.g:1954:1: entryRulePseudoClass returns [Boolean current=false] : iv_rulePseudoClass= rulePseudoClass EOF ;
    public final Boolean entryRulePseudoClass() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoClass = null;


        try {
            // PsiInternalCssDsl.g:1954:53: (iv_rulePseudoClass= rulePseudoClass EOF )
            // PsiInternalCssDsl.g:1955:2: iv_rulePseudoClass= rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoClassElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // PsiInternalCssDsl.g:1961:1: rulePseudoClass returns [Boolean current=false] : (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) ) ;
    public final Boolean rulePseudoClass() throws RecognitionException {
        Boolean current = false;

        Token this_COLON_0=null;
        Token this_COLON_1=null;
        Boolean lv_name_2_0 = null;


        try {
            // PsiInternalCssDsl.g:1962:1: ( (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) ) )
            // PsiInternalCssDsl.g:1963:2: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) )
            {
            // PsiInternalCssDsl.g:1963:2: (this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) ) )
            // PsiInternalCssDsl.g:1964:3: this_COLON_0= RULE_COLON (this_COLON_1= RULE_COLON )? ( (lv_name_2_0= rulePseudoClassName ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPseudoClass_COLONTerminalRuleCall_0ElementType());
              		
            }
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_COLON_0);
              		
            }
            // PsiInternalCssDsl.g:1971:3: (this_COLON_1= RULE_COLON )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_COLON) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalCssDsl.g:1972:4: this_COLON_1= RULE_COLON
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPseudoClass_COLONTerminalRuleCall_1ElementType());
                      			
                    }
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_COLON_1);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalCssDsl.g:1980:3: ( (lv_name_2_0= rulePseudoClassName ) )
            // PsiInternalCssDsl.g:1981:4: (lv_name_2_0= rulePseudoClassName )
            {
            // PsiInternalCssDsl.g:1981:4: (lv_name_2_0= rulePseudoClassName )
            // PsiInternalCssDsl.g:1982:5: lv_name_2_0= rulePseudoClassName
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getPseudoClass_NamePseudoClassNameParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_2_0=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // PsiInternalCssDsl.g:1999:1: entryRulePseudoClassName returns [Boolean current=false] : iv_rulePseudoClassName= rulePseudoClassName EOF ;
    public final Boolean entryRulePseudoClassName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoClassName = null;


        try {
            // PsiInternalCssDsl.g:1999:57: (iv_rulePseudoClassName= rulePseudoClassName EOF )
            // PsiInternalCssDsl.g:2000:2: iv_rulePseudoClassName= rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoClassNameElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClassName=rulePseudoClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // PsiInternalCssDsl.g:2006:1: rulePseudoClassName returns [Boolean current=false] : ruleIdentifier ;
    public final Boolean rulePseudoClassName() throws RecognitionException {
        Boolean current = false;

        try {
            // PsiInternalCssDsl.g:2007:1: ( ruleIdentifier )
            // PsiInternalCssDsl.g:2008:2: ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getPseudoClassName_IdentifierParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // PsiInternalCssDsl.g:2018:1: entryRulePseudoClassFunction returns [Boolean current=false] : iv_rulePseudoClassFunction= rulePseudoClassFunction EOF ;
    public final Boolean entryRulePseudoClassFunction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoClassFunction = null;


        try {
            // PsiInternalCssDsl.g:2018:61: (iv_rulePseudoClassFunction= rulePseudoClassFunction EOF )
            // PsiInternalCssDsl.g:2019:2: iv_rulePseudoClassFunction= rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoClassFunctionElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // PsiInternalCssDsl.g:2025:1: rulePseudoClassFunction returns [Boolean current=false] : ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) ;
    public final Boolean rulePseudoClassFunction() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_not_0_0 = null;

        Boolean lv_paramSelector_1_0 = null;

        Boolean lv_name_4_0 = null;

        Boolean lv_params_6_0 = null;


        try {
            // PsiInternalCssDsl.g:2026:1: ( ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) ) )
            // PsiInternalCssDsl.g:2027:2: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            {
            // PsiInternalCssDsl.g:2027:2: ( ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' ) | (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_COLON) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==40) ) {
                    alt54=1;
                }
                else if ( ((LA54_1>=RULE_DASH && LA54_1<=RULE_ONE_NON_HEX_LETTER)||(LA54_1>=50 && LA54_1<=53)) ) {
                    alt54=2;
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
                    // PsiInternalCssDsl.g:2028:3: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    {
                    // PsiInternalCssDsl.g:2028:3: ( ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')' )
                    // PsiInternalCssDsl.g:2029:4: ( (lv_not_0_0= ruleNotFunctionCall ) ) ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) ) otherlv_2= ')'
                    {
                    // PsiInternalCssDsl.g:2029:4: ( (lv_not_0_0= ruleNotFunctionCall ) )
                    // PsiInternalCssDsl.g:2030:5: (lv_not_0_0= ruleNotFunctionCall )
                    {
                    // PsiInternalCssDsl.g:2030:5: (lv_not_0_0= ruleNotFunctionCall )
                    // PsiInternalCssDsl.g:2031:6: lv_not_0_0= ruleNotFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPseudoClassFunction_NotNotFunctionCallParserRuleCall_0_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_not_0_0=ruleNotFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalCssDsl.g:2044:4: ( (lv_paramSelector_1_0= ruleSimpleSelectorForNegation ) )
                    // PsiInternalCssDsl.g:2045:5: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    {
                    // PsiInternalCssDsl.g:2045:5: (lv_paramSelector_1_0= ruleSimpleSelectorForNegation )
                    // PsiInternalCssDsl.g:2046:6: lv_paramSelector_1_0= ruleSimpleSelectorForNegation
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPseudoClassFunction_ParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_paramSelector_1_0=ruleSimpleSelectorForNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPseudoClassFunction_RightParenthesisKeyword_0_2ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2068:3: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    {
                    // PsiInternalCssDsl.g:2068:3: (this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')' )
                    // PsiInternalCssDsl.g:2069:4: this_COLON_3= RULE_COLON ( (lv_name_4_0= ruleIdentifier ) ) otherlv_5= '(' ( (lv_params_6_0= ruleCssTok ) )* otherlv_7= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPseudoClassFunction_COLONTerminalRuleCall_1_0ElementType());
                      			
                    }
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_COLON_3);
                      			
                    }
                    // PsiInternalCssDsl.g:2076:4: ( (lv_name_4_0= ruleIdentifier ) )
                    // PsiInternalCssDsl.g:2077:5: (lv_name_4_0= ruleIdentifier )
                    {
                    // PsiInternalCssDsl.g:2077:5: (lv_name_4_0= ruleIdentifier )
                    // PsiInternalCssDsl.g:2078:6: lv_name_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPseudoClassFunction_NameIdentifierParserRuleCall_1_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_name_4_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPseudoClassFunction_LeftParenthesisKeyword_1_2ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,39,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalCssDsl.g:2098:4: ( (lv_params_6_0= ruleCssTok ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_CSSSTRING||(LA53_0>=RULE_COMMA && LA53_0<=RULE_WS)||(LA53_0>=RULE_HASHMARK && LA53_0<=RULE_ONE_INT)||LA53_0==35||LA53_0==43||(LA53_0>=50 && LA53_0<=53)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:2099:5: (lv_params_6_0= ruleCssTok )
                    	    {
                    	    // PsiInternalCssDsl.g:2099:5: (lv_params_6_0= ruleCssTok )
                    	    // PsiInternalCssDsl.g:2100:6: lv_params_6_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getPseudoClassFunction_ParamsCssTokParserRuleCall_1_3_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_params_6_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      						if(!current) {
                    	      							associateWithSemanticElement();
                    	      							current = true;
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPseudoClassFunction_RightParenthesisKeyword_1_4ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }

                    }


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
        }
        return current;
    }
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRuleNotFunctionCall"
    // PsiInternalCssDsl.g:2125:1: entryRuleNotFunctionCall returns [Boolean current=false] : iv_ruleNotFunctionCall= ruleNotFunctionCall EOF ;
    public final Boolean entryRuleNotFunctionCall() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotFunctionCall = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2127:2: (iv_ruleNotFunctionCall= ruleNotFunctionCall EOF )
            // PsiInternalCssDsl.g:2128:2: iv_ruleNotFunctionCall= ruleNotFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getNotFunctionCallElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotFunctionCall=ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNotFunctionCall"


    // $ANTLR start "ruleNotFunctionCall"
    // PsiInternalCssDsl.g:2137:1: ruleNotFunctionCall returns [Boolean current=false] : (this_COLON_0= RULE_COLON kw= 'not(' ) ;
    public final Boolean ruleNotFunctionCall() throws RecognitionException {
        Boolean current = false;

        Token this_COLON_0=null;
        Token kw=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2140:2: ( (this_COLON_0= RULE_COLON kw= 'not(' ) )
            // PsiInternalCssDsl.g:2141:2: (this_COLON_0= RULE_COLON kw= 'not(' )
            {
            // PsiInternalCssDsl.g:2141:2: (this_COLON_0= RULE_COLON kw= 'not(' )
            // PsiInternalCssDsl.g:2142:3: this_COLON_0= RULE_COLON kw= 'not('
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getNotFunctionCall_COLONTerminalRuleCall_0ElementType());
              		
            }
            this_COLON_0=(Token)match(input,RULE_COLON,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_COLON_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getNotFunctionCall_NotKeyword_1ElementType());
              		
            }
            kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(kw);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNotFunctionCall"


    // $ANTLR start "entryRuleCombinator"
    // PsiInternalCssDsl.g:2163:1: entryRuleCombinator returns [Boolean current=false] : iv_ruleCombinator= ruleCombinator EOF ;
    public final Boolean entryRuleCombinator() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCombinator = null;


        try {
            // PsiInternalCssDsl.g:2163:52: (iv_ruleCombinator= ruleCombinator EOF )
            // PsiInternalCssDsl.g:2164:2: iv_ruleCombinator= ruleCombinator EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCombinatorElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinator=ruleCombinator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCombinator"


    // $ANTLR start "ruleCombinator"
    // PsiInternalCssDsl.g:2170:1: ruleCombinator returns [Boolean current=false] : (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) ;
    public final Boolean ruleCombinator() throws RecognitionException {
        Boolean current = false;

        Token this_PLUS_0=null;
        Token kw=null;

        try {
            // PsiInternalCssDsl.g:2171:1: ( (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' ) )
            // PsiInternalCssDsl.g:2172:2: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            {
            // PsiInternalCssDsl.g:2172:2: (this_PLUS_0= RULE_PLUS | kw= '>' | kw= '~' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt55=1;
                }
                break;
            case 41:
                {
                alt55=2;
                }
                break;
            case 42:
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
                    // PsiInternalCssDsl.g:2173:3: this_PLUS_0= RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getCombinator_PLUSTerminalRuleCall_0ElementType());
                      		
                    }
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_PLUS_0);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2181:3: kw= '>'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getCombinator_GreaterThanSignKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:2189:3: kw= '~'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getCombinator_TildeKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleCombinator"


    // $ANTLR start "entryRuleSymbolTok"
    // PsiInternalCssDsl.g:2200:1: entryRuleSymbolTok returns [Boolean current=false] : iv_ruleSymbolTok= ruleSymbolTok EOF ;
    public final Boolean entryRuleSymbolTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSymbolTok = null;


        try {
            // PsiInternalCssDsl.g:2200:51: (iv_ruleSymbolTok= ruleSymbolTok EOF )
            // PsiInternalCssDsl.g:2201:2: iv_ruleSymbolTok= ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSymbolTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // PsiInternalCssDsl.g:2207:1: ruleSymbolTok returns [Boolean current=false] : ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) ;
    public final Boolean ruleSymbolTok() throws RecognitionException {
        Boolean current = false;

        Token lv_symbol_1_1=null;
        Token lv_symbol_1_2=null;

        try {
            // PsiInternalCssDsl.g:2208:1: ( ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) ) )
            // PsiInternalCssDsl.g:2209:2: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            {
            // PsiInternalCssDsl.g:2209:2: ( () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) ) )
            // PsiInternalCssDsl.g:2210:3: () ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            {
            // PsiInternalCssDsl.g:2210:3: ()
            // PsiInternalCssDsl.g:2211:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getSymbolTok_SymbolTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2217:3: ( ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) ) )
            // PsiInternalCssDsl.g:2218:4: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            {
            // PsiInternalCssDsl.g:2218:4: ( (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT ) )
            // PsiInternalCssDsl.g:2219:5: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
            {
            // PsiInternalCssDsl.g:2219:5: (lv_symbol_1_1= RULE_COMMA | lv_symbol_1_2= RULE_PERCENT )
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
                    // PsiInternalCssDsl.g:2220:6: lv_symbol_1_1= RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getSymbolTok_SymbolCOMMATerminalRuleCall_1_0_0ElementType());
                      					
                    }
                    lv_symbol_1_1=(Token)match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_symbol_1_1);
                      					
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2234:6: lv_symbol_1_2= RULE_PERCENT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getSymbolTok_SymbolPERCENTTerminalRuleCall_1_0_1ElementType());
                      					
                    }
                    lv_symbol_1_2=(Token)match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_symbol_1_2);
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // PsiInternalCssDsl.g:2254:1: entryRuleWSTok returns [Boolean current=false] : iv_ruleWSTok= ruleWSTok EOF ;
    public final Boolean entryRuleWSTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleWSTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2256:2: (iv_ruleWSTok= ruleWSTok EOF )
            // PsiInternalCssDsl.g:2257:2: iv_ruleWSTok= ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getWSTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // PsiInternalCssDsl.g:2266:1: ruleWSTok returns [Boolean current=false] : ( () this_WS_1= RULE_WS ) ;
    public final Boolean ruleWSTok() throws RecognitionException {
        Boolean current = false;

        Token this_WS_1=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2269:2: ( ( () this_WS_1= RULE_WS ) )
            // PsiInternalCssDsl.g:2270:2: ( () this_WS_1= RULE_WS )
            {
            // PsiInternalCssDsl.g:2270:2: ( () this_WS_1= RULE_WS )
            // PsiInternalCssDsl.g:2271:3: () this_WS_1= RULE_WS
            {
            // PsiInternalCssDsl.g:2271:3: ()
            // PsiInternalCssDsl.g:2272:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getWSTok_WSTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getWSTok_WSTerminalRuleCall_1ElementType());
              		
            }
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_WS_1);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // PsiInternalCssDsl.g:2292:1: entryRuleStringTok returns [Boolean current=false] : iv_ruleStringTok= ruleStringTok EOF ;
    public final Boolean entryRuleStringTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStringTok = null;


        try {
            // PsiInternalCssDsl.g:2292:51: (iv_ruleStringTok= ruleStringTok EOF )
            // PsiInternalCssDsl.g:2293:2: iv_ruleStringTok= ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getStringTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // PsiInternalCssDsl.g:2299:1: ruleStringTok returns [Boolean current=false] : ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) ;
    public final Boolean ruleStringTok() throws RecognitionException {
        Boolean current = false;

        Token lv_value_1_0=null;

        try {
            // PsiInternalCssDsl.g:2300:1: ( ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) ) )
            // PsiInternalCssDsl.g:2301:2: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            {
            // PsiInternalCssDsl.g:2301:2: ( () ( (lv_value_1_0= RULE_CSSSTRING ) ) )
            // PsiInternalCssDsl.g:2302:3: () ( (lv_value_1_0= RULE_CSSSTRING ) )
            {
            // PsiInternalCssDsl.g:2302:3: ()
            // PsiInternalCssDsl.g:2303:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getStringTok_StringTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2309:3: ( (lv_value_1_0= RULE_CSSSTRING ) )
            // PsiInternalCssDsl.g:2310:4: (lv_value_1_0= RULE_CSSSTRING )
            {
            // PsiInternalCssDsl.g:2310:4: (lv_value_1_0= RULE_CSSSTRING )
            // PsiInternalCssDsl.g:2311:5: lv_value_1_0= RULE_CSSSTRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getStringTok_ValueCSSSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_value_1_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_value_1_0);
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleNumberTok"
    // PsiInternalCssDsl.g:2330:1: entryRuleNumberTok returns [Boolean current=false] : iv_ruleNumberTok= ruleNumberTok EOF ;
    public final Boolean entryRuleNumberTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNumberTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2332:2: (iv_ruleNumberTok= ruleNumberTok EOF )
            // PsiInternalCssDsl.g:2333:2: iv_ruleNumberTok= ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getNumberTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // PsiInternalCssDsl.g:2342:1: ruleNumberTok returns [Boolean current=false] : ( () ( (lv_val_1_0= ruleNum ) ) ) ;
    public final Boolean ruleNumberTok() throws RecognitionException {
        Boolean current = false;

        Boolean lv_val_1_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2345:2: ( ( () ( (lv_val_1_0= ruleNum ) ) ) )
            // PsiInternalCssDsl.g:2346:2: ( () ( (lv_val_1_0= ruleNum ) ) )
            {
            // PsiInternalCssDsl.g:2346:2: ( () ( (lv_val_1_0= ruleNum ) ) )
            // PsiInternalCssDsl.g:2347:3: () ( (lv_val_1_0= ruleNum ) )
            {
            // PsiInternalCssDsl.g:2347:3: ()
            // PsiInternalCssDsl.g:2348:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getNumberTok_NumberTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2354:3: ( (lv_val_1_0= ruleNum ) )
            // PsiInternalCssDsl.g:2355:4: (lv_val_1_0= ruleNum )
            {
            // PsiInternalCssDsl.g:2355:4: (lv_val_1_0= ruleNum )
            // PsiInternalCssDsl.g:2356:5: lv_val_1_0= ruleNum
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getNumberTok_ValNumParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleUrlTok"
    // PsiInternalCssDsl.g:2376:1: entryRuleUrlTok returns [Boolean current=false] : iv_ruleUrlTok= ruleUrlTok EOF ;
    public final Boolean entryRuleUrlTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUrlTok = null;


        try {
            // PsiInternalCssDsl.g:2376:48: (iv_ruleUrlTok= ruleUrlTok EOF )
            // PsiInternalCssDsl.g:2377:2: iv_ruleUrlTok= ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getUrlTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // PsiInternalCssDsl.g:2383:1: ruleUrlTok returns [Boolean current=false] : ( () ( (lv_url_1_0= ruleURLType ) ) ) ;
    public final Boolean ruleUrlTok() throws RecognitionException {
        Boolean current = false;

        Boolean lv_url_1_0 = null;


        try {
            // PsiInternalCssDsl.g:2384:1: ( ( () ( (lv_url_1_0= ruleURLType ) ) ) )
            // PsiInternalCssDsl.g:2385:2: ( () ( (lv_url_1_0= ruleURLType ) ) )
            {
            // PsiInternalCssDsl.g:2385:2: ( () ( (lv_url_1_0= ruleURLType ) ) )
            // PsiInternalCssDsl.g:2386:3: () ( (lv_url_1_0= ruleURLType ) )
            {
            // PsiInternalCssDsl.g:2386:3: ()
            // PsiInternalCssDsl.g:2387:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getUrlTok_UrlTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2393:3: ( (lv_url_1_0= ruleURLType ) )
            // PsiInternalCssDsl.g:2394:4: (lv_url_1_0= ruleURLType )
            {
            // PsiInternalCssDsl.g:2394:4: (lv_url_1_0= ruleURLType )
            // PsiInternalCssDsl.g:2395:5: lv_url_1_0= ruleURLType
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getUrlTok_UrlURLTypeParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_url_1_0=ruleURLType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // PsiInternalCssDsl.g:2412:1: entryRuleColorTok returns [Boolean current=false] : iv_ruleColorTok= ruleColorTok EOF ;
    public final Boolean entryRuleColorTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleColorTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2414:2: (iv_ruleColorTok= ruleColorTok EOF )
            // PsiInternalCssDsl.g:2415:2: iv_ruleColorTok= ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getColorTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // PsiInternalCssDsl.g:2424:1: ruleColorTok returns [Boolean current=false] : ( () ( (lv_value_1_0= ruleHex ) ) ) ;
    public final Boolean ruleColorTok() throws RecognitionException {
        Boolean current = false;

        Boolean lv_value_1_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2427:2: ( ( () ( (lv_value_1_0= ruleHex ) ) ) )
            // PsiInternalCssDsl.g:2428:2: ( () ( (lv_value_1_0= ruleHex ) ) )
            {
            // PsiInternalCssDsl.g:2428:2: ( () ( (lv_value_1_0= ruleHex ) ) )
            // PsiInternalCssDsl.g:2429:3: () ( (lv_value_1_0= ruleHex ) )
            {
            // PsiInternalCssDsl.g:2429:3: ()
            // PsiInternalCssDsl.g:2430:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getColorTok_ColorTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2436:3: ( (lv_value_1_0= ruleHex ) )
            // PsiInternalCssDsl.g:2437:4: (lv_value_1_0= ruleHex )
            {
            // PsiInternalCssDsl.g:2437:4: (lv_value_1_0= ruleHex )
            // PsiInternalCssDsl.g:2438:5: lv_value_1_0= ruleHex
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getColorTok_ValueHexParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleIdentifierOrFuncTok"
    // PsiInternalCssDsl.g:2458:1: entryRuleIdentifierOrFuncTok returns [Boolean current=false] : iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF ;
    public final Boolean entryRuleIdentifierOrFuncTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIdentifierOrFuncTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2460:2: (iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF )
            // PsiInternalCssDsl.g:2461:2: iv_ruleIdentifierOrFuncTok= ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIdentifierOrFuncTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierOrFuncTok"


    // $ANTLR start "ruleIdentifierOrFuncTok"
    // PsiInternalCssDsl.g:2470:1: ruleIdentifierOrFuncTok returns [Boolean current=false] : ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) ;
    public final Boolean ruleIdentifierOrFuncTok() throws RecognitionException {
        Boolean current = false;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Boolean lv_name_1_0 = null;

        Boolean lv_params_4_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2473:2: ( ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? ) )
            // PsiInternalCssDsl.g:2474:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            {
            // PsiInternalCssDsl.g:2474:2: ( () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )? )
            // PsiInternalCssDsl.g:2475:3: () ( (lv_name_1_0= ruleIdentifier ) ) ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            {
            // PsiInternalCssDsl.g:2475:3: ()
            // PsiInternalCssDsl.g:2476:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getIdentifierOrFuncTok_IdentifierTokAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssDsl.g:2482:3: ( (lv_name_1_0= ruleIdentifier ) )
            // PsiInternalCssDsl.g:2483:4: (lv_name_1_0= ruleIdentifier )
            {
            // PsiInternalCssDsl.g:2483:4: (lv_name_1_0= ruleIdentifier )
            // PsiInternalCssDsl.g:2484:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getIdentifierOrFuncTok_NameIdentifierParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_42);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalCssDsl.g:2497:3: ( () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // PsiInternalCssDsl.g:2498:4: () otherlv_3= '(' ( (lv_params_4_0= ruleCssTok ) )+ otherlv_5= ')'
                    {
                    // PsiInternalCssDsl.g:2498:4: ()
                    // PsiInternalCssDsl.g:2499:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getIdentifierOrFuncTok_FuncTokNameAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifierOrFuncTok_LeftParenthesisKeyword_2_1ElementType());
                      			
                    }
                    otherlv_3=(Token)match(input,39,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_3);
                      			
                    }
                    // PsiInternalCssDsl.g:2512:4: ( (lv_params_4_0= ruleCssTok ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_CSSSTRING||(LA57_0>=RULE_COMMA && LA57_0<=RULE_WS)||(LA57_0>=RULE_HASHMARK && LA57_0<=RULE_ONE_INT)||LA57_0==35||LA57_0==43||(LA57_0>=50 && LA57_0<=53)) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:2513:5: (lv_params_4_0= ruleCssTok )
                    	    {
                    	    // PsiInternalCssDsl.g:2513:5: (lv_params_4_0= ruleCssTok )
                    	    // PsiInternalCssDsl.g:2514:6: lv_params_4_0= ruleCssTok
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getIdentifierOrFuncTok_ParamsCssTokParserRuleCall_2_2_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_params_4_0=ruleCssTok();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      						if(!current) {
                    	      							associateWithSemanticElement();
                    	      							current = true;
                    	      						}
                    	      					
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

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifierOrFuncTok_RightParenthesisKeyword_2_3ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifierOrFuncTok"


    // $ANTLR start "entryRuleCssTok"
    // PsiInternalCssDsl.g:2542:1: entryRuleCssTok returns [Boolean current=false] : iv_ruleCssTok= ruleCssTok EOF ;
    public final Boolean entryRuleCssTok() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssTok = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2544:2: (iv_ruleCssTok= ruleCssTok EOF )
            // PsiInternalCssDsl.g:2545:2: iv_ruleCssTok= ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCssTokElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // PsiInternalCssDsl.g:2554:1: ruleCssTok returns [Boolean current=false] : (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) ;
    public final Boolean ruleCssTok() throws RecognitionException {
        Boolean current = false;

        Boolean this_IdentifierOrFuncTok_0 = null;

        Boolean this_SymbolTok_1 = null;

        Boolean this_WSTok_2 = null;

        Boolean this_StringTok_3 = null;

        Boolean this_NumberTok_4 = null;

        Boolean this_UrlTok_5 = null;

        Boolean this_ColorTok_6 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2557:2: ( (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok ) )
            // PsiInternalCssDsl.g:2558:2: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            {
            // PsiInternalCssDsl.g:2558:2: (this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok | this_SymbolTok_1= ruleSymbolTok | this_WSTok_2= ruleWSTok | this_StringTok_3= ruleStringTok | this_NumberTok_4= ruleNumberTok | this_UrlTok_5= ruleUrlTok | this_ColorTok_6= ruleColorTok )
            int alt59=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ONE_INT||LA59_1==35) ) {
                    alt59=5;
                }
                else if ( ((LA59_1>=RULE_UNDERSCORE && LA59_1<=RULE_ONE_NON_HEX_LETTER)||(LA59_1>=50 && LA59_1<=53)) ) {
                    alt59=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNDERSCORE:
            case RULE_ONE_HEX_LETTER:
            case RULE_ONE_NON_HEX_LETTER:
            case 50:
            case 51:
            case 52:
            case 53:
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
            case RULE_PLUS:
            case RULE_ONE_INT:
            case 35:
                {
                alt59=5;
                }
                break;
            case 43:
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
                    // PsiInternalCssDsl.g:2559:3: this_IdentifierOrFuncTok_0= ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_IdentifierOrFuncTokParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdentifierOrFuncTok_0=ruleIdentifierOrFuncTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdentifierOrFuncTok_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2568:3: this_SymbolTok_1= ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_SymbolTokParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SymbolTok_1=ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SymbolTok_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:2577:3: this_WSTok_2= ruleWSTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_WSTokParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WSTok_2=ruleWSTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WSTok_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:2586:3: this_StringTok_3= ruleStringTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_StringTokParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringTok_3=ruleStringTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringTok_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalCssDsl.g:2595:3: this_NumberTok_4= ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_NumberTokParserRuleCall_4ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberTok_4=ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberTok_4;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalCssDsl.g:2604:3: this_UrlTok_5= ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_UrlTokParserRuleCall_5ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UrlTok_5=ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UrlTok_5;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 7 :
                    // PsiInternalCssDsl.g:2613:3: this_ColorTok_6= ruleColorTok
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCssTok_ColorTokParserRuleCall_6ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ColorTok_6=ruleColorTok();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ColorTok_6;
                      			doneComposite();
                      		
                    }

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRuleURLType"
    // PsiInternalCssDsl.g:2628:1: entryRuleURLType returns [Boolean current=false] : iv_ruleURLType= ruleURLType EOF ;
    public final Boolean entryRuleURLType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleURLType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2630:2: (iv_ruleURLType= ruleURLType EOF )
            // PsiInternalCssDsl.g:2631:2: iv_ruleURLType= ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getURLTypeElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // PsiInternalCssDsl.g:2640:1: ruleURLType returns [Boolean current=false] : (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) ;
    public final Boolean ruleURLType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_url_1_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2643:2: ( (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' ) )
            // PsiInternalCssDsl.g:2644:2: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            {
            // PsiInternalCssDsl.g:2644:2: (otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')' )
            // PsiInternalCssDsl.g:2645:3: otherlv_0= 'url(' ( (lv_url_1_0= ruleValidURL ) ) otherlv_2= ')'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getURLType_UrlKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssDsl.g:2652:3: ( (lv_url_1_0= ruleValidURL ) )
            // PsiInternalCssDsl.g:2653:4: (lv_url_1_0= ruleValidURL )
            {
            // PsiInternalCssDsl.g:2653:4: (lv_url_1_0= ruleValidURL )
            // PsiInternalCssDsl.g:2654:5: lv_url_1_0= ruleValidURL
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getURLType_UrlValidURLParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_38);
            lv_url_1_0=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getURLType_RightParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleValidURLSymbol"
    // PsiInternalCssDsl.g:2681:1: entryRuleValidURLSymbol returns [Boolean current=false] : iv_ruleValidURLSymbol= ruleValidURLSymbol EOF ;
    public final Boolean entryRuleValidURLSymbol() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidURLSymbol = null;


        try {
            // PsiInternalCssDsl.g:2681:56: (iv_ruleValidURLSymbol= ruleValidURLSymbol EOF )
            // PsiInternalCssDsl.g:2682:2: iv_ruleValidURLSymbol= ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getValidURLSymbolElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidURLSymbol=ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURLSymbol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidURLSymbol"


    // $ANTLR start "ruleValidURLSymbol"
    // PsiInternalCssDsl.g:2688:1: ruleValidURLSymbol returns [Boolean current=false] : (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' ruleKeywordHack ) ) ;
    public final Boolean ruleValidURLSymbol() throws RecognitionException {
        Boolean current = false;

        Token this_DASH_0=null;
        Token kw=null;
        Token this_UNDERSCORE_2=null;
        Token this_COLON_4=null;
        Token this_HASHMARK_7=null;
        Token this_PLUS_15=null;
        Token this_COMMA_16=null;

        try {
            // PsiInternalCssDsl.g:2689:1: ( (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' ruleKeywordHack ) ) )
            // PsiInternalCssDsl.g:2690:2: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' ruleKeywordHack ) )
            {
            // PsiInternalCssDsl.g:2690:2: (this_DASH_0= RULE_DASH | kw= '.' | this_UNDERSCORE_2= RULE_UNDERSCORE | kw= '~' | this_COLON_4= RULE_COLON | kw= '/' | kw= '?' | this_HASHMARK_7= RULE_HASHMARK | kw= '[' | kw= ']' | kw= '@' | kw= '!' | kw= '$' | kw= '&' | kw= '*' | this_PLUS_15= RULE_PLUS | this_COMMA_16= RULE_COMMA | kw= ';' | (kw= '=' ruleKeywordHack ) )
            int alt60=19;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                alt60=1;
                }
                break;
            case 35:
                {
                alt60=2;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt60=3;
                }
                break;
            case 42:
                {
                alt60=4;
                }
                break;
            case RULE_COLON:
                {
                alt60=5;
                }
                break;
            case 44:
                {
                alt60=6;
                }
                break;
            case 45:
                {
                alt60=7;
                }
                break;
            case RULE_HASHMARK:
                {
                alt60=8;
                }
                break;
            case 29:
                {
                alt60=9;
                }
                break;
            case 34:
                {
                alt60=10;
                }
                break;
            case 46:
                {
                alt60=11;
                }
                break;
            case 47:
                {
                alt60=12;
                }
                break;
            case 48:
                {
                alt60=13;
                }
                break;
            case 49:
                {
                alt60=14;
                }
                break;
            case 36:
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
            case 21:
                {
                alt60=18;
                }
                break;
            case 33:
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
                    // PsiInternalCssDsl.g:2691:3: this_DASH_0= RULE_DASH
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_DASHTerminalRuleCall_0ElementType());
                      		
                    }
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_DASH_0);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2699:3: kw= '.'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_FullStopKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:2707:3: this_UNDERSCORE_2= RULE_UNDERSCORE
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_UNDERSCORETerminalRuleCall_2ElementType());
                      		
                    }
                    this_UNDERSCORE_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_UNDERSCORE_2);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:2715:3: kw= '~'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_TildeKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalCssDsl.g:2723:3: this_COLON_4= RULE_COLON
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_COLONTerminalRuleCall_4ElementType());
                      		
                    }
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_COLON_4);
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalCssDsl.g:2731:3: kw= '/'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_SolidusKeyword_5ElementType());
                      		
                    }
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 7 :
                    // PsiInternalCssDsl.g:2739:3: kw= '?'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_QuestionMarkKeyword_6ElementType());
                      		
                    }
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 8 :
                    // PsiInternalCssDsl.g:2747:3: this_HASHMARK_7= RULE_HASHMARK
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_HASHMARKTerminalRuleCall_7ElementType());
                      		
                    }
                    this_HASHMARK_7=(Token)match(input,RULE_HASHMARK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_HASHMARK_7);
                      		
                    }

                    }
                    break;
                case 9 :
                    // PsiInternalCssDsl.g:2755:3: kw= '['
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_LeftSquareBracketKeyword_8ElementType());
                      		
                    }
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 10 :
                    // PsiInternalCssDsl.g:2763:3: kw= ']'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_RightSquareBracketKeyword_9ElementType());
                      		
                    }
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 11 :
                    // PsiInternalCssDsl.g:2771:3: kw= '@'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_CommercialAtKeyword_10ElementType());
                      		
                    }
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 12 :
                    // PsiInternalCssDsl.g:2779:3: kw= '!'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_ExclamationMarkKeyword_11ElementType());
                      		
                    }
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 13 :
                    // PsiInternalCssDsl.g:2787:3: kw= '$'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_DollarSignKeyword_12ElementType());
                      		
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 14 :
                    // PsiInternalCssDsl.g:2795:3: kw= '&'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_AmpersandKeyword_13ElementType());
                      		
                    }
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 15 :
                    // PsiInternalCssDsl.g:2803:3: kw= '*'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_AsteriskKeyword_14ElementType());
                      		
                    }
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 16 :
                    // PsiInternalCssDsl.g:2811:3: this_PLUS_15= RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_PLUSTerminalRuleCall_15ElementType());
                      		
                    }
                    this_PLUS_15=(Token)match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_PLUS_15);
                      		
                    }

                    }
                    break;
                case 17 :
                    // PsiInternalCssDsl.g:2819:3: this_COMMA_16= RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_COMMATerminalRuleCall_16ElementType());
                      		
                    }
                    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_COMMA_16);
                      		
                    }

                    }
                    break;
                case 18 :
                    // PsiInternalCssDsl.g:2827:3: kw= ';'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURLSymbol_SemicolonKeyword_17ElementType());
                      		
                    }
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 19 :
                    // PsiInternalCssDsl.g:2835:3: (kw= '=' ruleKeywordHack )
                    {
                    // PsiInternalCssDsl.g:2835:3: (kw= '=' ruleKeywordHack )
                    // PsiInternalCssDsl.g:2836:4: kw= '=' ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getValidURLSymbol_EqualsSignKeyword_18_0ElementType());
                      			
                    }
                    kw=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getValidURLSymbol_KeywordHackParserRuleCall_18_1ElementType());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneComposite();
                      			
                    }

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleKeywordHack"
    // PsiInternalCssDsl.g:2855:1: entryRuleKeywordHack returns [Boolean current=false] : iv_ruleKeywordHack= ruleKeywordHack EOF ;
    public final Boolean entryRuleKeywordHack() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleKeywordHack = null;


        try {
            // PsiInternalCssDsl.g:2855:53: (iv_ruleKeywordHack= ruleKeywordHack EOF )
            // PsiInternalCssDsl.g:2856:2: iv_ruleKeywordHack= ruleKeywordHack EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getKeywordHackElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeywordHack=ruleKeywordHack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeywordHack; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywordHack"


    // $ANTLR start "ruleKeywordHack"
    // PsiInternalCssDsl.g:2862:1: ruleKeywordHack returns [Boolean current=false] : (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) ;
    public final Boolean ruleKeywordHack() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalCssDsl.g:2863:1: ( (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' ) )
            // PsiInternalCssDsl.g:2864:2: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            {
            // PsiInternalCssDsl.g:2864:2: (kw= 'not' | kw= 'no' | kw= 'url' | kw= 'ur' )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt61=1;
                }
                break;
            case 51:
                {
                alt61=2;
                }
                break;
            case 52:
                {
                alt61=3;
                }
                break;
            case 53:
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
                    // PsiInternalCssDsl.g:2865:3: kw= 'not'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getKeywordHack_NotKeyword_0ElementType());
                      		
                    }
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2873:3: kw= 'no'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getKeywordHack_NoKeyword_1ElementType());
                      		
                    }
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:2881:3: kw= 'url'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getKeywordHack_UrlKeyword_2ElementType());
                      		
                    }
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:2889:3: kw= 'ur'
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getKeywordHack_UrKeyword_3ElementType());
                      		
                    }
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(kw);
                      		
                    }

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
        }
        return current;
    }
    // $ANTLR end "ruleKeywordHack"


    // $ANTLR start "entryRuleValidURL"
    // PsiInternalCssDsl.g:2900:1: entryRuleValidURL returns [Boolean current=false] : iv_ruleValidURL= ruleValidURL EOF ;
    public final Boolean entryRuleValidURL() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidURL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2902:2: (iv_ruleValidURL= ruleValidURL EOF )
            // PsiInternalCssDsl.g:2903:2: iv_ruleValidURL= ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getValidURLElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidURL=ruleValidURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidURL; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleValidURL"


    // $ANTLR start "ruleValidURL"
    // PsiInternalCssDsl.g:2912:1: ruleValidURL returns [Boolean current=false] : (this_CSSSTRING_0= RULE_CSSSTRING | ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) ;
    public final Boolean ruleValidURL() throws RecognitionException {
        Boolean current = false;

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


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:2915:2: ( (this_CSSSTRING_0= RULE_CSSSTRING | ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ ) )
            // PsiInternalCssDsl.g:2916:2: (this_CSSSTRING_0= RULE_CSSSTRING | ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            {
            // PsiInternalCssDsl.g:2916:2: (this_CSSSTRING_0= RULE_CSSSTRING | ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+ )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_CSSSTRING) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=RULE_COLON && LA65_0<=RULE_PERCENT)||(LA65_0>=RULE_HASHMARK && LA65_0<=RULE_ONE_INT)||LA65_0==21||LA65_0==29||(LA65_0>=33 && LA65_0<=36)||LA65_0==42||(LA65_0>=44 && LA65_0<=58)) ) {
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
                    // PsiInternalCssDsl.g:2917:3: this_CSSSTRING_0= RULE_CSSSTRING
                    {
                    if ( state.backtracking==0 ) {

                      			markLeaf(elementTypeProvider.getValidURL_CSSSTRINGTerminalRuleCall_0ElementType());
                      		
                    }
                    this_CSSSTRING_0=(Token)match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			doneLeaf(this_CSSSTRING_0);
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:2925:3: ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    {
                    // PsiInternalCssDsl.g:2925:3: ( ruleValidURLSymbol | ruleKeywordHack | this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_5= RULE_ONE_INT | kw= '\\\\ ' | kw= '\\\\(' | kw= '\\\\)' | kw= '\\\\\\'' | kw= '\\\\\"' | (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) ) )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=12;
                        switch ( input.LA(1) ) {
                        case RULE_COLON:
                        case RULE_COMMA:
                        case RULE_HASHMARK:
                        case RULE_PLUS:
                        case RULE_DASH:
                        case RULE_UNDERSCORE:
                        case 21:
                        case 29:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 42:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            {
                            alt64=1;
                            }
                            break;
                        case 50:
                        case 51:
                        case 52:
                        case 53:
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
                        case 54:
                            {
                            alt64=6;
                            }
                            break;
                        case 55:
                            {
                            alt64=7;
                            }
                            break;
                        case 56:
                            {
                            alt64=8;
                            }
                            break;
                        case 57:
                            {
                            alt64=9;
                            }
                            break;
                        case 58:
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
                    	    // PsiInternalCssDsl.g:2926:4: ruleValidURLSymbol
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markComposite(elementTypeProvider.getValidURL_ValidURLSymbolParserRuleCall_1_0ElementType());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    ruleValidURLSymbol();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneComposite();
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // PsiInternalCssDsl.g:2934:4: ruleKeywordHack
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markComposite(elementTypeProvider.getValidURL_KeywordHackParserRuleCall_1_1ElementType());
                    	      			
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    ruleKeywordHack();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneComposite();
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // PsiInternalCssDsl.g:2942:4: this_ONE_HEX_LETTER_3= RULE_ONE_HEX_LETTER
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ONE_HEX_LETTERTerminalRuleCall_1_2ElementType());
                    	      			
                    	    }
                    	    this_ONE_HEX_LETTER_3=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(this_ONE_HEX_LETTER_3);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // PsiInternalCssDsl.g:2950:4: this_ONE_NON_HEX_LETTER_4= RULE_ONE_NON_HEX_LETTER
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ONE_NON_HEX_LETTERTerminalRuleCall_1_3ElementType());
                    	      			
                    	    }
                    	    this_ONE_NON_HEX_LETTER_4=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(this_ONE_NON_HEX_LETTER_4);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // PsiInternalCssDsl.g:2958:4: this_ONE_INT_5= RULE_ONE_INT
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ONE_INTTerminalRuleCall_1_4ElementType());
                    	      			
                    	    }
                    	    this_ONE_INT_5=(Token)match(input,RULE_ONE_INT,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(this_ONE_INT_5);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 6 :
                    	    // PsiInternalCssDsl.g:2966:4: kw= '\\\\ '
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ReverseSolidusSpaceKeyword_1_5ElementType());
                    	      			
                    	    }
                    	    kw=(Token)match(input,54,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(kw);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 7 :
                    	    // PsiInternalCssDsl.g:2974:4: kw= '\\\\('
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ReverseSolidusLeftParenthesisKeyword_1_6ElementType());
                    	      			
                    	    }
                    	    kw=(Token)match(input,55,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(kw);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 8 :
                    	    // PsiInternalCssDsl.g:2982:4: kw= '\\\\)'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ReverseSolidusRightParenthesisKeyword_1_7ElementType());
                    	      			
                    	    }
                    	    kw=(Token)match(input,56,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(kw);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 9 :
                    	    // PsiInternalCssDsl.g:2990:4: kw= '\\\\\\''
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ReverseSolidusApostropheKeyword_1_8ElementType());
                    	      			
                    	    }
                    	    kw=(Token)match(input,57,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(kw);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 10 :
                    	    // PsiInternalCssDsl.g:2998:4: kw= '\\\\\"'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      				markLeaf(elementTypeProvider.getValidURL_ReverseSolidusQuotationMarkKeyword_1_9ElementType());
                    	      			
                    	    }
                    	    kw=(Token)match(input,58,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				doneLeaf(kw);
                    	      			
                    	    }

                    	    }
                    	    break;
                    	case 11 :
                    	    // PsiInternalCssDsl.g:3006:4: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    {
                    	    // PsiInternalCssDsl.g:3006:4: (this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER ) )
                    	    // PsiInternalCssDsl.g:3007:5: this_PERCENT_11= RULE_PERCENT (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER ) (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getValidURL_PERCENTTerminalRuleCall_1_10_0ElementType());
                    	      				
                    	    }
                    	    this_PERCENT_11=(Token)match(input,RULE_PERCENT,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_PERCENT_11);
                    	      				
                    	    }
                    	    // PsiInternalCssDsl.g:3014:5: (this_ONE_INT_12= RULE_ONE_INT | this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER )
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
                    	            // PsiInternalCssDsl.g:3015:6: this_ONE_INT_12= RULE_ONE_INT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						markLeaf(elementTypeProvider.getValidURL_ONE_INTTerminalRuleCall_1_10_1_0ElementType());
                    	              					
                    	            }
                    	            this_ONE_INT_12=(Token)match(input,RULE_ONE_INT,FOLLOW_45); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						doneLeaf(this_ONE_INT_12);
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // PsiInternalCssDsl.g:3023:6: this_ONE_HEX_LETTER_13= RULE_ONE_HEX_LETTER
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						markLeaf(elementTypeProvider.getValidURL_ONE_HEX_LETTERTerminalRuleCall_1_10_1_1ElementType());
                    	              					
                    	            }
                    	            this_ONE_HEX_LETTER_13=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_45); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						doneLeaf(this_ONE_HEX_LETTER_13);
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // PsiInternalCssDsl.g:3031:5: (this_ONE_INT_14= RULE_ONE_INT | this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER )
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
                    	            // PsiInternalCssDsl.g:3032:6: this_ONE_INT_14= RULE_ONE_INT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						markLeaf(elementTypeProvider.getValidURL_ONE_INTTerminalRuleCall_1_10_2_0ElementType());
                    	              					
                    	            }
                    	            this_ONE_INT_14=(Token)match(input,RULE_ONE_INT,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						doneLeaf(this_ONE_INT_14);
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // PsiInternalCssDsl.g:3040:6: this_ONE_HEX_LETTER_15= RULE_ONE_HEX_LETTER
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              						markLeaf(elementTypeProvider.getValidURL_ONE_HEX_LETTERTerminalRuleCall_1_10_2_1ElementType());
                    	              					
                    	            }
                    	            this_ONE_HEX_LETTER_15=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_44); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						doneLeaf(this_ONE_HEX_LETTER_15);
                    	              					
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleValidURL"


    // $ANTLR start "entryRuleIdentifier"
    // PsiInternalCssDsl.g:3057:1: entryRuleIdentifier returns [Boolean current=false] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final Boolean entryRuleIdentifier() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:3059:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // PsiInternalCssDsl.g:3060:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIdentifierElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // PsiInternalCssDsl.g:3069:1: ruleIdentifier returns [Boolean current=false] : ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )* ) ;
    public final Boolean ruleIdentifier() throws RecognitionException {
        Boolean current = false;

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        Token this_ONE_HEX_LETTER_2=null;
        Token this_ONE_NON_HEX_LETTER_3=null;
        Token this_UNDERSCORE_5=null;
        Token this_DASH_6=null;
        Token this_ONE_HEX_LETTER_7=null;
        Token this_ONE_NON_HEX_LETTER_8=null;
        Token this_ONE_INT_9=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:3072:2: ( ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )* ) )
            // PsiInternalCssDsl.g:3073:2: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )* )
            {
            // PsiInternalCssDsl.g:3073:2: ( (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )* )
            // PsiInternalCssDsl.g:3074:3: (this_DASH_0= RULE_DASH )? (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack ) ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )*
            {
            // PsiInternalCssDsl.g:3074:3: (this_DASH_0= RULE_DASH )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DASH) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalCssDsl.g:3075:4: this_DASH_0= RULE_DASH
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifier_DASHTerminalRuleCall_0ElementType());
                      			
                    }
                    this_DASH_0=(Token)match(input,RULE_DASH,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_DASH_0);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalCssDsl.g:3083:3: (this_UNDERSCORE_1= RULE_UNDERSCORE | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER | ruleKeywordHack )
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
            case 50:
            case 51:
            case 52:
            case 53:
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
                    // PsiInternalCssDsl.g:3084:4: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifier_UNDERSCORETerminalRuleCall_1_0ElementType());
                      			
                    }
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_UNDERSCORE_1);
                      			
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:3092:4: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifier_ONE_HEX_LETTERTerminalRuleCall_1_1ElementType());
                      			
                    }
                    this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_ONE_HEX_LETTER_2);
                      			
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssDsl.g:3100:4: this_ONE_NON_HEX_LETTER_3= RULE_ONE_NON_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getIdentifier_ONE_NON_HEX_LETTERTerminalRuleCall_1_2ElementType());
                      			
                    }
                    this_ONE_NON_HEX_LETTER_3=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_ONE_NON_HEX_LETTER_3);
                      			
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssDsl.g:3108:4: ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getIdentifier_KeywordHackParserRuleCall_1_3ElementType());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneComposite();
                      			
                    }

                    }
                    break;

            }

            // PsiInternalCssDsl.g:3116:3: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )*
            loop69:
            do {
                int alt69=2;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // PsiInternalCssDsl.g:3117:4: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack )
            	    {
            	    // PsiInternalCssDsl.g:3131:4: (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack )
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
            	    case 50:
            	    case 51:
            	    case 52:
            	    case 53:
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
            	            // PsiInternalCssDsl.g:3132:5: this_UNDERSCORE_5= RULE_UNDERSCORE
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getIdentifier_UNDERSCORETerminalRuleCall_2_0_0ElementType());
            	              				
            	            }
            	            this_UNDERSCORE_5=(Token)match(input,RULE_UNDERSCORE,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_UNDERSCORE_5);
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCssDsl.g:3140:5: this_DASH_6= RULE_DASH
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getIdentifier_DASHTerminalRuleCall_2_0_1ElementType());
            	              				
            	            }
            	            this_DASH_6=(Token)match(input,RULE_DASH,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_DASH_6);
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // PsiInternalCssDsl.g:3148:5: this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getIdentifier_ONE_HEX_LETTERTerminalRuleCall_2_0_2ElementType());
            	              				
            	            }
            	            this_ONE_HEX_LETTER_7=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_ONE_HEX_LETTER_7);
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // PsiInternalCssDsl.g:3156:5: this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getIdentifier_ONE_NON_HEX_LETTERTerminalRuleCall_2_0_3ElementType());
            	              				
            	            }
            	            this_ONE_NON_HEX_LETTER_8=(Token)match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_ONE_NON_HEX_LETTER_8);
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // PsiInternalCssDsl.g:3164:5: this_ONE_INT_9= RULE_ONE_INT
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getIdentifier_ONE_INTTerminalRuleCall_2_0_4ElementType());
            	              				
            	            }
            	            this_ONE_INT_9=(Token)match(input,RULE_ONE_INT,FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_ONE_INT_9);
            	              				
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // PsiInternalCssDsl.g:3172:5: ruleKeywordHack
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markComposite(elementTypeProvider.getIdentifier_KeywordHackParserRuleCall_2_0_5ElementType());
            	              				
            	            }
            	            pushFollow(FOLLOW_46);
            	            ruleKeywordHack();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneComposite();
            	              				
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNum"
    // PsiInternalCssDsl.g:3188:1: entryRuleNum returns [Boolean current=false] : iv_ruleNum= ruleNum EOF ;
    public final Boolean entryRuleNum() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNum = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:3190:2: (iv_ruleNum= ruleNum EOF )
            // PsiInternalCssDsl.g:3191:2: iv_ruleNum= ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getNumElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNum=ruleNum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // PsiInternalCssDsl.g:3200:1: ruleNum returns [Boolean current=false] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) ;
    public final Boolean ruleNum() throws RecognitionException {
        Boolean current = false;

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        Token kw=null;
        Token this_ONE_INT_3=null;
        Token this_ONE_INT_4=null;
        Token this_ONE_INT_6=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssDsl.g:3203:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) ) )
            // PsiInternalCssDsl.g:3204:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            {
            // PsiInternalCssDsl.g:3204:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) ) )
            // PsiInternalCssDsl.g:3205:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            {
            // PsiInternalCssDsl.g:3205:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
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
                    // PsiInternalCssDsl.g:3206:4: this_PLUS_0= RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getNum_PLUSTerminalRuleCall_0_0ElementType());
                      			
                    }
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_PLUS_0);
                      			
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssDsl.g:3214:4: this_DASH_1= RULE_DASH
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getNum_DASHTerminalRuleCall_0_1ElementType());
                      			
                    }
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(this_DASH_1);
                      			
                    }

                    }
                    break;

            }

            // PsiInternalCssDsl.g:3222:3: ( (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ ) | ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==35) ) {
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
                    // PsiInternalCssDsl.g:3223:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    {
                    // PsiInternalCssDsl.g:3223:4: (kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+ )
                    // PsiInternalCssDsl.g:3224:5: kw= '.' ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getNum_FullStopKeyword_1_0_0ElementType());
                      				
                    }
                    kw=(Token)match(input,35,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(kw);
                      				
                    }
                    // PsiInternalCssDsl.g:3231:5: ( ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_ONE_INT) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred4_PsiInternalCssDsl()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:3232:6: ( RULE_ONE_INT )=>this_ONE_INT_3= RULE_ONE_INT
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markLeaf(elementTypeProvider.getNum_ONE_INTTerminalRuleCall_1_0_1ElementType());
                    	      					
                    	    }
                    	    this_ONE_INT_3=(Token)match(input,RULE_ONE_INT,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneLeaf(this_ONE_INT_3);
                    	      					
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
                    // PsiInternalCssDsl.g:3243:4: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    {
                    // PsiInternalCssDsl.g:3243:4: ( ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )? )
                    // PsiInternalCssDsl.g:3244:5: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+ ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    {
                    // PsiInternalCssDsl.g:3244:5: ( ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_ONE_INT) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred5_PsiInternalCssDsl()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // PsiInternalCssDsl.g:3245:6: ( RULE_ONE_INT )=>this_ONE_INT_4= RULE_ONE_INT
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markLeaf(elementTypeProvider.getNum_ONE_INTTerminalRuleCall_1_1_0ElementType());
                    	      					
                    	    }
                    	    this_ONE_INT_4=(Token)match(input,RULE_ONE_INT,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneLeaf(this_ONE_INT_4);
                    	      					
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

                    // PsiInternalCssDsl.g:3254:5: ( ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+ )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==35) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==RULE_ONE_INT) ) {
                            int LA74_3 = input.LA(3);

                            if ( (synpred6_PsiInternalCssDsl()) ) {
                                alt74=1;
                            }
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // PsiInternalCssDsl.g:3255:6: ( ( '.' )=>kw= '.' ) ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            {
                            // PsiInternalCssDsl.g:3255:6: ( ( '.' )=>kw= '.' )
                            // PsiInternalCssDsl.g:3256:7: ( '.' )=>kw= '.'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getNum_FullStopKeyword_1_1_1_0ElementType());
                              						
                            }
                            kw=(Token)match(input,35,FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(kw);
                              						
                            }

                            }

                            // PsiInternalCssDsl.g:3265:6: ( ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT )+
                            int cnt73=0;
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==RULE_ONE_INT) ) {
                                    int LA73_2 = input.LA(2);

                                    if ( (synpred7_PsiInternalCssDsl()) ) {
                                        alt73=1;
                                    }


                                }


                                switch (alt73) {
                            	case 1 :
                            	    // PsiInternalCssDsl.g:3266:7: ( RULE_ONE_INT )=>this_ONE_INT_6= RULE_ONE_INT
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getNum_ONE_INTTerminalRuleCall_1_1_1_1ElementType());
                            	      						
                            	    }
                            	    this_ONE_INT_6=(Token)match(input,RULE_ONE_INT,FOLLOW_49); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_ONE_INT_6);
                            	      						
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleHex"
    // PsiInternalCssDsl.g:3285:1: entryRuleHex returns [Boolean current=false] : iv_ruleHex= ruleHex EOF ;
    public final Boolean entryRuleHex() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleHex = null;


        try {
            // PsiInternalCssDsl.g:3285:45: (iv_ruleHex= ruleHex EOF )
            // PsiInternalCssDsl.g:3286:2: iv_ruleHex= ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getHexElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHex=ruleHex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHex"


    // $ANTLR start "ruleHex"
    // PsiInternalCssDsl.g:3292:1: ruleHex returns [Boolean current=false] : (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) ;
    public final Boolean ruleHex() throws RecognitionException {
        Boolean current = false;

        Token this_HASHMARK_0=null;
        Token this_ONE_INT_1=null;
        Token this_ONE_HEX_LETTER_2=null;

        try {
            // PsiInternalCssDsl.g:3293:1: ( (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ ) )
            // PsiInternalCssDsl.g:3294:2: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            {
            // PsiInternalCssDsl.g:3294:2: (this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+ )
            // PsiInternalCssDsl.g:3295:3: this_HASHMARK_0= RULE_HASHMARK ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getHex_HASHMARKTerminalRuleCall_0ElementType());
              		
            }
            this_HASHMARK_0=(Token)match(input,RULE_HASHMARK,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_HASHMARK_0);
              		
            }
            // PsiInternalCssDsl.g:3302:3: ( ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ONE_HEX_LETTER) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred8_PsiInternalCssDsl()) ) {
                        alt77=1;
                    }


                }
                else if ( (LA77_0==RULE_ONE_INT) ) {
                    int LA77_3 = input.LA(2);

                    if ( (synpred8_PsiInternalCssDsl()) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // PsiInternalCssDsl.g:3303:4: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )=> (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
            	    {
            	    // PsiInternalCssDsl.g:3309:4: (this_ONE_INT_1= RULE_ONE_INT | this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER )
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
            	            // PsiInternalCssDsl.g:3310:5: this_ONE_INT_1= RULE_ONE_INT
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getHex_ONE_INTTerminalRuleCall_1_0_0ElementType());
            	              				
            	            }
            	            this_ONE_INT_1=(Token)match(input,RULE_ONE_INT,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_ONE_INT_1);
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCssDsl.g:3318:5: this_ONE_HEX_LETTER_2= RULE_ONE_HEX_LETTER
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf(elementTypeProvider.getHex_ONE_HEX_LETTERTerminalRuleCall_1_0_1ElementType());
            	              				
            	            }
            	            this_ONE_HEX_LETTER_2=(Token)match(input,RULE_ONE_HEX_LETTER,FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(this_ONE_HEX_LETTER_2);
            	              				
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHex"

    // $ANTLR start synpred1_PsiInternalCssDsl
    public final void synpred1_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:1044:4: ( ( ruleCssTok ) )
        // PsiInternalCssDsl.g:1044:5: ( ruleCssTok )
        {
        // PsiInternalCssDsl.g:1044:5: ( ruleCssTok )
        // PsiInternalCssDsl.g:1045:5: ruleCssTok
        {
        pushFollow(FOLLOW_2);
        ruleCssTok();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_PsiInternalCssDsl

    // $ANTLR start synpred2_PsiInternalCssDsl
    public final void synpred2_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:1283:4: ( ( ruleSubSelectorForNegation ) )
        // PsiInternalCssDsl.g:1283:5: ( ruleSubSelectorForNegation )
        {
        // PsiInternalCssDsl.g:1283:5: ( ruleSubSelectorForNegation )
        // PsiInternalCssDsl.g:1284:5: ruleSubSelectorForNegation
        {
        pushFollow(FOLLOW_2);
        ruleSubSelectorForNegation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_PsiInternalCssDsl

    // $ANTLR start synpred3_PsiInternalCssDsl
    public final void synpred3_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3117:4: ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )
        // PsiInternalCssDsl.g:3117:5: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
        {
        // PsiInternalCssDsl.g:3117:5: ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack )
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
        case 50:
        case 51:
        case 52:
        case 53:
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
                // PsiInternalCssDsl.g:3118:5: RULE_UNDERSCORE
                {
                match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // PsiInternalCssDsl.g:3120:5: RULE_DASH
                {
                match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 3 :
                // PsiInternalCssDsl.g:3122:5: RULE_ONE_HEX_LETTER
                {
                match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 4 :
                // PsiInternalCssDsl.g:3124:5: RULE_ONE_NON_HEX_LETTER
                {
                match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 5 :
                // PsiInternalCssDsl.g:3126:5: RULE_ONE_INT
                {
                match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 6 :
                // PsiInternalCssDsl.g:3128:5: ruleKeywordHack
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
    // $ANTLR end synpred3_PsiInternalCssDsl

    // $ANTLR start synpred4_PsiInternalCssDsl
    public final void synpred4_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3232:6: ( RULE_ONE_INT )
        // PsiInternalCssDsl.g:3232:7: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_PsiInternalCssDsl

    // $ANTLR start synpred5_PsiInternalCssDsl
    public final void synpred5_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3245:6: ( RULE_ONE_INT )
        // PsiInternalCssDsl.g:3245:7: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_PsiInternalCssDsl

    // $ANTLR start synpred6_PsiInternalCssDsl
    public final void synpred6_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3256:7: ( '.' )
        // PsiInternalCssDsl.g:3256:8: '.'
        {
        match(input,35,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_PsiInternalCssDsl

    // $ANTLR start synpred7_PsiInternalCssDsl
    public final void synpred7_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3266:7: ( RULE_ONE_INT )
        // PsiInternalCssDsl.g:3266:8: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_PsiInternalCssDsl

    // $ANTLR start synpred8_PsiInternalCssDsl
    public final void synpred8_PsiInternalCssDsl_fragment() throws RecognitionException {   
        // PsiInternalCssDsl.g:3303:4: ( ( RULE_ONE_INT | RULE_ONE_HEX_LETTER ) )
        // PsiInternalCssDsl.g:3303:5: ( RULE_ONE_INT | RULE_ONE_HEX_LETTER )
        {
        if ( input.LA(1)==RULE_ONE_HEX_LETTER||input.LA(1)==RULE_ONE_INT ) {
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
    // $ANTLR end synpred8_PsiInternalCssDsl

    // Delegated rules

    public final boolean synpred2_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_PsiInternalCssDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_PsiInternalCssDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_PsiInternalCssDsl_fragment(); // can never throw exception
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
    static final String dfa_2s = "\2\6\2\uffff";
    static final String dfa_3s = "\2\30\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\1";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\1\17\uffff\1\2",
            "\1\3\1\uffff\1\1\17\uffff\1\2",
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
            return "()* loopback of 882:3: ( (this_WS_1= RULE_WS )* this_COMMA_2= RULE_COMMA ( (lv_selectors_3_0= ruleSelector ) ) )*";
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\1\22\uffff";
    static final String dfa_9s = "\1\4\22\uffff";
    static final String dfa_10s = "\1\65\22\uffff";
    static final String dfa_11s = "\1\uffff\1\2\21\1";
    static final String dfa_12s = "\1\0\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\15\1\uffff\1\12\1\13\1\14\1\1\2\uffff\1\22\1\16\1\2\1\3\1\4\1\5\1\20\2\uffff\1\1\3\uffff\1\1\11\uffff\1\17\7\uffff\1\21\6\uffff\1\6\1\7\1\10\1\11",
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
            return "()+ loopback of 1043:3: ( ( ( ruleCssTok ) )=> (lv_valueTokens_3_0= ruleCssTok ) )+";
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
                        if ( (LA29_0==EOF||LA29_0==RULE_IMPORTANT_SYM||LA29_0==21||LA29_0==25) ) {s = 1;}

                        else if ( (LA29_0==RULE_DASH) && (synpred1_PsiInternalCssDsl())) {s = 2;}

                        else if ( (LA29_0==RULE_UNDERSCORE) && (synpred1_PsiInternalCssDsl())) {s = 3;}

                        else if ( (LA29_0==RULE_ONE_HEX_LETTER) && (synpred1_PsiInternalCssDsl())) {s = 4;}

                        else if ( (LA29_0==RULE_ONE_NON_HEX_LETTER) && (synpred1_PsiInternalCssDsl())) {s = 5;}

                        else if ( (LA29_0==50) && (synpred1_PsiInternalCssDsl())) {s = 6;}

                        else if ( (LA29_0==51) && (synpred1_PsiInternalCssDsl())) {s = 7;}

                        else if ( (LA29_0==52) && (synpred1_PsiInternalCssDsl())) {s = 8;}

                        else if ( (LA29_0==53) && (synpred1_PsiInternalCssDsl())) {s = 9;}

                        else if ( (LA29_0==RULE_COMMA) && (synpred1_PsiInternalCssDsl())) {s = 10;}

                        else if ( (LA29_0==RULE_PERCENT) && (synpred1_PsiInternalCssDsl())) {s = 11;}

                        else if ( (LA29_0==RULE_WS) && (synpred1_PsiInternalCssDsl())) {s = 12;}

                        else if ( (LA29_0==RULE_CSSSTRING) && (synpred1_PsiInternalCssDsl())) {s = 13;}

                        else if ( (LA29_0==RULE_PLUS) && (synpred1_PsiInternalCssDsl())) {s = 14;}

                        else if ( (LA29_0==35) && (synpred1_PsiInternalCssDsl())) {s = 15;}

                        else if ( (LA29_0==RULE_ONE_INT) && (synpred1_PsiInternalCssDsl())) {s = 16;}

                        else if ( (LA29_0==43) && (synpred1_PsiInternalCssDsl())) {s = 17;}

                        else if ( (LA29_0==RULE_HASHMARK) && (synpred1_PsiInternalCssDsl())) {s = 18;}

                         
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
    static final String dfa_16s = "\1\6\1\uffff\1\5\2\uffff";
    static final String dfa_17s = "\1\52\1\uffff\1\65\2\uffff";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_19s = "\5\uffff}>";
    static final String[] dfa_20s = {
            "\1\3\1\uffff\1\2\4\uffff\1\1\12\uffff\1\3\20\uffff\2\1",
            "",
            "\1\4\1\3\1\uffff\1\2\3\uffff\6\4\6\uffff\1\3\4\uffff\1\4\5\uffff\3\4\3\uffff\2\4\7\uffff\4\4",
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
            return "1118:3: ( ( ( (lv_combinator_1_0= ruleCombinator ) ) (this_WS_2= RULE_WS )* ( (lv_selector_3_0= ruleSelector ) ) ) | ( (this_WS_4= RULE_WS )+ ( ( (lv_combinator_5_0= ruleCombinator ) ) (this_WS_6= RULE_WS )* )? ( (lv_selector_7_0= ruleSelector ) ) ) )?";
        }
    }
    static final String dfa_21s = "\24\uffff";
    static final String dfa_22s = "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String dfa_23s = "\1\16\1\17\7\5\1\uffff\11\5\1\uffff";
    static final String dfa_24s = "\11\65\1\uffff\11\65\1\uffff";
    static final String dfa_25s = "\11\uffff\1\2\11\uffff\1\1";
    static final String dfa_26s = "\24\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\1\2\1\3\1\4\22\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\40\uffff\1\5\1\6\1\7\1\10",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
            "\1\23\6\uffff\1\23\1\uffff\1\13\1\12\1\14\1\15\1\16\12\uffff\1\23\5\uffff\1\23\1\uffff\1\11\1\23\13\uffff\1\17\1\20\1\21\1\22",
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
            return "1232:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String[] dfa_28s = {
            "\1\1\1\2\1\3\1\4\22\uffff\2\11\14\uffff\1\5\1\6\1\7\1\10",
            "\1\2\1\3\1\4\40\uffff\1\5\1\6\1\7\1\10",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
            "\2\23\1\uffff\1\23\3\uffff\2\23\1\13\1\12\1\14\1\15\1\16\5\uffff\1\23\4\uffff\1\23\5\uffff\1\23\1\uffff\1\11\3\uffff\2\23\7\uffff\1\17\1\20\1\21\1\22",
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
            return "1372:4: ( ( (lv_element_0_0= ruleElementSelector ) ) | ( (lv_universal_1_0= ruleUniversalSelector ) ) )";
        }
    }
    static final String dfa_29s = "\25\uffff";
    static final String dfa_30s = "\4\uffff\7\2\1\uffff\11\2";
    static final String dfa_31s = "\2\5\1\uffff\1\17\7\5\1\uffff\11\5";
    static final String dfa_32s = "\1\5\1\65\1\uffff\10\65\1\uffff\11\65";
    static final String dfa_33s = "\2\uffff\1\1\10\uffff\1\2\11\uffff";
    static final String dfa_34s = "\25\uffff}>";
    static final String[] dfa_35s = {
            "\1\1",
            "\1\2\10\uffff\1\3\1\4\1\5\1\6\26\uffff\1\13\11\uffff\1\7\1\10\1\11\1\12",
            "",
            "\1\4\1\5\1\6\40\uffff\1\7\1\10\1\11\1\12",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24",
            "\2\2\1\uffff\1\2\3\uffff\2\2\1\15\1\14\1\16\1\17\1\20\5\uffff\1\2\4\uffff\1\2\5\uffff\1\2\3\uffff\1\13\1\uffff\2\2\7\uffff\1\21\1\22\1\23\1\24"
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
            return "1932:2: (this_PseudoClass_0= rulePseudoClass | this_PseudoClassFunction_1= rulePseudoClassFunction )";
        }
    }
    static final String dfa_36s = "\14\uffff";
    static final String dfa_37s = "\1\1\13\uffff";
    static final String dfa_38s = "\1\4\1\uffff\11\0\1\uffff";
    static final String dfa_39s = "\1\65\1\uffff\11\0\1\uffff";
    static final String dfa_40s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_41s = "\2\uffff\1\10\1\7\1\4\1\5\1\0\1\1\1\2\1\3\1\6\1\uffff}>";
    static final String[] dfa_42s = {
            "\12\1\1\2\1\3\1\4\1\5\1\12\2\uffff\1\1\2\uffff\2\1\3\uffff\7\1\1\uffff\3\1\1\uffff\3\1\6\uffff\1\6\1\7\1\10\1\11",
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
            return "()* loopback of 3116:3: ( ( ( RULE_UNDERSCORE | RULE_DASH | RULE_ONE_HEX_LETTER | RULE_ONE_NON_HEX_LETTER | RULE_ONE_INT | ruleKeywordHack ) )=> (this_UNDERSCORE_5= RULE_UNDERSCORE | this_DASH_6= RULE_DASH | this_ONE_HEX_LETTER_7= RULE_ONE_HEX_LETTER | this_ONE_NON_HEX_LETTER_8= RULE_ONE_NON_HEX_LETTER | this_ONE_INT_9= RULE_ONE_INT | ruleKeywordHack ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_PsiInternalCssDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_2);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x003C00383CC3D022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x003C00383C83D022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x003C00000023C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x003C00000223C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x003C00000003C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x003C00382203D020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x003C00080227E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000140L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x003C00382003D020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x003C00000203C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x003C08080007F1D0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x003C08080007F3D2L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000002102L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x003C00382003D120L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x003C06382003F120L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000820001022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x003C00382003D022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000007C0000C00L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x003C00000003C010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003C00000003C020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x003C08480007F1D0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x07FFF41E2027F0F0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x07FFF41E2027F0E2L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x003C00000007C002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000800040002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000050002L});

}