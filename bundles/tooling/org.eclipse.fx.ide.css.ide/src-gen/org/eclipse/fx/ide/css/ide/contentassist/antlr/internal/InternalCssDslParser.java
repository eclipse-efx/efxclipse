package org.eclipse.fx.ide.css.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("DollarSign", "'\\u0024'");
    		tokenNameToValue.put("Ampersand", "'&'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("QuestionMark", "'?'");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("VerticalLine", "'|'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Tilde", "'~'");
    		tokenNameToValue.put("DollarSignEqualsSign", "'\\u0024='");
    		tokenNameToValue.put("AsteriskEqualsSign", "'*='");
    		tokenNameToValue.put("ReverseSolidusSpace", "'\\ '");
    		tokenNameToValue.put("ReverseSolidusQuotationMark", "'\\\"'");
    		tokenNameToValue.put("ReverseSolidusApostrophe", "'\\\''");
    		tokenNameToValue.put("ReverseSolidusLeftParenthesis", "'\\('");
    		tokenNameToValue.put("ReverseSolidusRightParenthesis", "'\\)'");
    		tokenNameToValue.put("CircumflexAccentEqualsSign", "'^='");
    		tokenNameToValue.put("No", "'no'");
    		tokenNameToValue.put("Ur", "'ur'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Url", "'url'");
    		tokenNameToValue.put("Not_1", "'not('");
    		tokenNameToValue.put("Url_1", "'url('");
    		tokenNameToValue.put("Page", "'@page'");
    		tokenNameToValue.put("Media", "'@media'");
    		tokenNameToValue.put("Import", "'@import'");
    		tokenNameToValue.put("Charset", "'@charset'");
    		tokenNameToValue.put("FontFace", "'@font-face'");
    		tokenNameToValue.put("Keyframes", "'@keyframes'");
    	}

    	public void setGrammarAccess(CssDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleStylesheet"
    // InternalCssDslParser.g:95:1: entryRuleStylesheet : ruleStylesheet EOF ;
    public final void entryRuleStylesheet() throws RecognitionException {
        try {
            // InternalCssDslParser.g:96:1: ( ruleStylesheet EOF )
            // InternalCssDslParser.g:97:1: ruleStylesheet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStylesheet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // InternalCssDslParser.g:104:1: ruleStylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void ruleStylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:108:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // InternalCssDslParser.g:109:2: ( ( rule__Stylesheet__Group__0 ) )
            {
            // InternalCssDslParser.g:109:2: ( ( rule__Stylesheet__Group__0 ) )
            // InternalCssDslParser.g:110:3: ( rule__Stylesheet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getGroup()); 
            }
            // InternalCssDslParser.g:111:3: ( rule__Stylesheet__Group__0 )
            // InternalCssDslParser.g:111:4: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleCharsetRule"
    // InternalCssDslParser.g:120:1: entryRuleCharsetRule : ruleCharsetRule EOF ;
    public final void entryRuleCharsetRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:121:1: ( ruleCharsetRule EOF )
            // InternalCssDslParser.g:122:1: ruleCharsetRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharsetRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharsetRule"


    // $ANTLR start "ruleCharsetRule"
    // InternalCssDslParser.g:129:1: ruleCharsetRule : ( ( rule__CharsetRule__Group__0 ) ) ;
    public final void ruleCharsetRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:133:2: ( ( ( rule__CharsetRule__Group__0 ) ) )
            // InternalCssDslParser.g:134:2: ( ( rule__CharsetRule__Group__0 ) )
            {
            // InternalCssDslParser.g:134:2: ( ( rule__CharsetRule__Group__0 ) )
            // InternalCssDslParser.g:135:3: ( rule__CharsetRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:136:3: ( rule__CharsetRule__Group__0 )
            // InternalCssDslParser.g:136:4: rule__CharsetRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharsetRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharsetRule"


    // $ANTLR start "entryRuleImportRule"
    // InternalCssDslParser.g:145:1: entryRuleImportRule : ruleImportRule EOF ;
    public final void entryRuleImportRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:146:1: ( ruleImportRule EOF )
            // InternalCssDslParser.g:147:1: ruleImportRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImportRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportRule"


    // $ANTLR start "ruleImportRule"
    // InternalCssDslParser.g:154:1: ruleImportRule : ( ( rule__ImportRule__Group__0 ) ) ;
    public final void ruleImportRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:158:2: ( ( ( rule__ImportRule__Group__0 ) ) )
            // InternalCssDslParser.g:159:2: ( ( rule__ImportRule__Group__0 ) )
            {
            // InternalCssDslParser.g:159:2: ( ( rule__ImportRule__Group__0 ) )
            // InternalCssDslParser.g:160:3: ( rule__ImportRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:161:3: ( rule__ImportRule__Group__0 )
            // InternalCssDslParser.g:161:4: rule__ImportRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportRule"


    // $ANTLR start "entryRulePageRule"
    // InternalCssDslParser.g:170:1: entryRulePageRule : rulePageRule EOF ;
    public final void entryRulePageRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:171:1: ( rulePageRule EOF )
            // InternalCssDslParser.g:172:1: rulePageRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePageRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageRule"


    // $ANTLR start "rulePageRule"
    // InternalCssDslParser.g:179:1: rulePageRule : ( ( rule__PageRule__Group__0 ) ) ;
    public final void rulePageRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:183:2: ( ( ( rule__PageRule__Group__0 ) ) )
            // InternalCssDslParser.g:184:2: ( ( rule__PageRule__Group__0 ) )
            {
            // InternalCssDslParser.g:184:2: ( ( rule__PageRule__Group__0 ) )
            // InternalCssDslParser.g:185:3: ( rule__PageRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:186:3: ( rule__PageRule__Group__0 )
            // InternalCssDslParser.g:186:4: rule__PageRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageRule"


    // $ANTLR start "entryRulePseudoPage"
    // InternalCssDslParser.g:195:1: entryRulePseudoPage : rulePseudoPage EOF ;
    public final void entryRulePseudoPage() throws RecognitionException {
        try {
            // InternalCssDslParser.g:196:1: ( rulePseudoPage EOF )
            // InternalCssDslParser.g:197:1: rulePseudoPage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoPageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoPage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoPageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoPage"


    // $ANTLR start "rulePseudoPage"
    // InternalCssDslParser.g:204:1: rulePseudoPage : ( ( rule__PseudoPage__Group__0 ) ) ;
    public final void rulePseudoPage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:208:2: ( ( ( rule__PseudoPage__Group__0 ) ) )
            // InternalCssDslParser.g:209:2: ( ( rule__PseudoPage__Group__0 ) )
            {
            // InternalCssDslParser.g:209:2: ( ( rule__PseudoPage__Group__0 ) )
            // InternalCssDslParser.g:210:3: ( rule__PseudoPage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoPageAccess().getGroup()); 
            }
            // InternalCssDslParser.g:211:3: ( rule__PseudoPage__Group__0 )
            // InternalCssDslParser.g:211:4: rule__PseudoPage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoPage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoPageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoPage"


    // $ANTLR start "entryRuleMediaRule"
    // InternalCssDslParser.g:220:1: entryRuleMediaRule : ruleMediaRule EOF ;
    public final void entryRuleMediaRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:221:1: ( ruleMediaRule EOF )
            // InternalCssDslParser.g:222:1: ruleMediaRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMediaRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMediaRule"


    // $ANTLR start "ruleMediaRule"
    // InternalCssDslParser.g:229:1: ruleMediaRule : ( ( rule__MediaRule__Group__0 ) ) ;
    public final void ruleMediaRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:233:2: ( ( ( rule__MediaRule__Group__0 ) ) )
            // InternalCssDslParser.g:234:2: ( ( rule__MediaRule__Group__0 ) )
            {
            // InternalCssDslParser.g:234:2: ( ( rule__MediaRule__Group__0 ) )
            // InternalCssDslParser.g:235:3: ( rule__MediaRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:236:3: ( rule__MediaRule__Group__0 )
            // InternalCssDslParser.g:236:4: rule__MediaRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMediaRule"


    // $ANTLR start "entryRuleMediaList"
    // InternalCssDslParser.g:245:1: entryRuleMediaList : ruleMediaList EOF ;
    public final void entryRuleMediaList() throws RecognitionException {
        try {
            // InternalCssDslParser.g:246:1: ( ruleMediaList EOF )
            // InternalCssDslParser.g:247:1: ruleMediaList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMediaList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMediaList"


    // $ANTLR start "ruleMediaList"
    // InternalCssDslParser.g:254:1: ruleMediaList : ( ( rule__MediaList__Group__0 ) ) ;
    public final void ruleMediaList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:258:2: ( ( ( rule__MediaList__Group__0 ) ) )
            // InternalCssDslParser.g:259:2: ( ( rule__MediaList__Group__0 ) )
            {
            // InternalCssDslParser.g:259:2: ( ( rule__MediaList__Group__0 ) )
            // InternalCssDslParser.g:260:3: ( rule__MediaList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getGroup()); 
            }
            // InternalCssDslParser.g:261:3: ( rule__MediaList__Group__0 )
            // InternalCssDslParser.g:261:4: rule__MediaList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MediaList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMediaList"


    // $ANTLR start "entryRuleMedia"
    // InternalCssDslParser.g:270:1: entryRuleMedia : ruleMedia EOF ;
    public final void entryRuleMedia() throws RecognitionException {
        try {
            // InternalCssDslParser.g:271:1: ( ruleMedia EOF )
            // InternalCssDslParser.g:272:1: ruleMedia EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMedia();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalCssDslParser.g:279:1: ruleMedia : ( ( rule__Media__NameAssignment ) ) ;
    public final void ruleMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:283:2: ( ( ( rule__Media__NameAssignment ) ) )
            // InternalCssDslParser.g:284:2: ( ( rule__Media__NameAssignment ) )
            {
            // InternalCssDslParser.g:284:2: ( ( rule__Media__NameAssignment ) )
            // InternalCssDslParser.g:285:3: ( rule__Media__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getNameAssignment()); 
            }
            // InternalCssDslParser.g:286:3: ( rule__Media__NameAssignment )
            // InternalCssDslParser.g:286:4: rule__Media__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Media__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleFontFaceRule"
    // InternalCssDslParser.g:295:1: entryRuleFontFaceRule : ruleFontFaceRule EOF ;
    public final void entryRuleFontFaceRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:296:1: ( ruleFontFaceRule EOF )
            // InternalCssDslParser.g:297:1: ruleFontFaceRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFontFaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFontFaceRule"


    // $ANTLR start "ruleFontFaceRule"
    // InternalCssDslParser.g:304:1: ruleFontFaceRule : ( ( rule__FontFaceRule__Group__0 ) ) ;
    public final void ruleFontFaceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:308:2: ( ( ( rule__FontFaceRule__Group__0 ) ) )
            // InternalCssDslParser.g:309:2: ( ( rule__FontFaceRule__Group__0 ) )
            {
            // InternalCssDslParser.g:309:2: ( ( rule__FontFaceRule__Group__0 ) )
            // InternalCssDslParser.g:310:3: ( rule__FontFaceRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:311:3: ( rule__FontFaceRule__Group__0 )
            // InternalCssDslParser.g:311:4: rule__FontFaceRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontFaceRule"


    // $ANTLR start "entryRuleKeyframesRule"
    // InternalCssDslParser.g:320:1: entryRuleKeyframesRule : ruleKeyframesRule EOF ;
    public final void entryRuleKeyframesRule() throws RecognitionException {
        try {
            // InternalCssDslParser.g:321:1: ( ruleKeyframesRule EOF )
            // InternalCssDslParser.g:322:1: ruleKeyframesRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeyframesRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyframesRule"


    // $ANTLR start "ruleKeyframesRule"
    // InternalCssDslParser.g:329:1: ruleKeyframesRule : ( ( rule__KeyframesRule__Group__0 ) ) ;
    public final void ruleKeyframesRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:333:2: ( ( ( rule__KeyframesRule__Group__0 ) ) )
            // InternalCssDslParser.g:334:2: ( ( rule__KeyframesRule__Group__0 ) )
            {
            // InternalCssDslParser.g:334:2: ( ( rule__KeyframesRule__Group__0 ) )
            // InternalCssDslParser.g:335:3: ( rule__KeyframesRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getGroup()); 
            }
            // InternalCssDslParser.g:336:3: ( rule__KeyframesRule__Group__0 )
            // InternalCssDslParser.g:336:4: rule__KeyframesRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyframesRule"


    // $ANTLR start "entryRuleKeyframeSelector"
    // InternalCssDslParser.g:345:1: entryRuleKeyframeSelector : ruleKeyframeSelector EOF ;
    public final void entryRuleKeyframeSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:346:1: ( ruleKeyframeSelector EOF )
            // InternalCssDslParser.g:347:1: ruleKeyframeSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeyframeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyframeSelector"


    // $ANTLR start "ruleKeyframeSelector"
    // InternalCssDslParser.g:354:1: ruleKeyframeSelector : ( ( rule__KeyframeSelector__Group__0 ) ) ;
    public final void ruleKeyframeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:358:2: ( ( ( rule__KeyframeSelector__Group__0 ) ) )
            // InternalCssDslParser.g:359:2: ( ( rule__KeyframeSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:359:2: ( ( rule__KeyframeSelector__Group__0 ) )
            // InternalCssDslParser.g:360:3: ( rule__KeyframeSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:361:3: ( rule__KeyframeSelector__Group__0 )
            // InternalCssDslParser.g:361:4: rule__KeyframeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyframeSelector"


    // $ANTLR start "entryRuleRuleset"
    // InternalCssDslParser.g:370:1: entryRuleRuleset : ruleRuleset EOF ;
    public final void entryRuleRuleset() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:374:1: ( ruleRuleset EOF )
            // InternalCssDslParser.g:375:1: ruleRuleset EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleRuleset"


    // $ANTLR start "ruleRuleset"
    // InternalCssDslParser.g:385:1: ruleRuleset : ( ( rule__Ruleset__Group__0 ) ) ;
    public final void ruleRuleset() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:390:2: ( ( ( rule__Ruleset__Group__0 ) ) )
            // InternalCssDslParser.g:391:2: ( ( rule__Ruleset__Group__0 ) )
            {
            // InternalCssDslParser.g:391:2: ( ( rule__Ruleset__Group__0 ) )
            // InternalCssDslParser.g:392:3: ( rule__Ruleset__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup()); 
            }
            // InternalCssDslParser.g:393:3: ( rule__Ruleset__Group__0 )
            // InternalCssDslParser.g:393:4: rule__Ruleset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleRuleset"


    // $ANTLR start "entryRuleCssDeclaration"
    // InternalCssDslParser.g:403:1: entryRuleCssDeclaration : ruleCssDeclaration EOF ;
    public final void entryRuleCssDeclaration() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:407:1: ( ruleCssDeclaration EOF )
            // InternalCssDslParser.g:408:1: ruleCssDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCssDeclaration"


    // $ANTLR start "ruleCssDeclaration"
    // InternalCssDslParser.g:418:1: ruleCssDeclaration : ( ( rule__CssDeclaration__Group__0 ) ) ;
    public final void ruleCssDeclaration() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:423:2: ( ( ( rule__CssDeclaration__Group__0 ) ) )
            // InternalCssDslParser.g:424:2: ( ( rule__CssDeclaration__Group__0 ) )
            {
            // InternalCssDslParser.g:424:2: ( ( rule__CssDeclaration__Group__0 ) )
            // InternalCssDslParser.g:425:3: ( rule__CssDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getGroup()); 
            }
            // InternalCssDslParser.g:426:3: ( rule__CssDeclaration__Group__0 )
            // InternalCssDslParser.g:426:4: rule__CssDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCssDeclaration"


    // $ANTLR start "entryRuleSelector"
    // InternalCssDslParser.g:436:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // InternalCssDslParser.g:440:1: ( ruleSelector EOF )
            // InternalCssDslParser.g:441:1: ruleSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalCssDslParser.g:451:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:456:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalCssDslParser.g:457:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalCssDslParser.g:457:2: ( ( rule__Selector__Group__0 ) )
            // InternalCssDslParser.g:458:3: ( rule__Selector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:459:3: ( rule__Selector__Group__0 )
            // InternalCssDslParser.g:459:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSimpleSelectorForNegation"
    // InternalCssDslParser.g:469:1: entryRuleSimpleSelectorForNegation : ruleSimpleSelectorForNegation EOF ;
    public final void entryRuleSimpleSelectorForNegation() throws RecognitionException {
        try {
            // InternalCssDslParser.g:470:1: ( ruleSimpleSelectorForNegation EOF )
            // InternalCssDslParser.g:471:1: ruleSimpleSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSelectorForNegation"


    // $ANTLR start "ruleSimpleSelectorForNegation"
    // InternalCssDslParser.g:478:1: ruleSimpleSelectorForNegation : ( ( rule__SimpleSelectorForNegation__Alternatives ) ) ;
    public final void ruleSimpleSelectorForNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:482:2: ( ( ( rule__SimpleSelectorForNegation__Alternatives ) ) )
            // InternalCssDslParser.g:483:2: ( ( rule__SimpleSelectorForNegation__Alternatives ) )
            {
            // InternalCssDslParser.g:483:2: ( ( rule__SimpleSelectorForNegation__Alternatives ) )
            // InternalCssDslParser.g:484:3: ( rule__SimpleSelectorForNegation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:485:3: ( rule__SimpleSelectorForNegation__Alternatives )
            // InternalCssDslParser.g:485:4: rule__SimpleSelectorForNegation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectorForNegation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSelectorForNegation"


    // $ANTLR start "entryRuleSubSelectorForNegation"
    // InternalCssDslParser.g:494:1: entryRuleSubSelectorForNegation : ruleSubSelectorForNegation EOF ;
    public final void entryRuleSubSelectorForNegation() throws RecognitionException {
        try {
            // InternalCssDslParser.g:495:1: ( ruleSubSelectorForNegation EOF )
            // InternalCssDslParser.g:496:1: ruleSubSelectorForNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorForNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorForNegationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubSelectorForNegation"


    // $ANTLR start "ruleSubSelectorForNegation"
    // InternalCssDslParser.g:503:1: ruleSubSelectorForNegation : ( ( rule__SubSelectorForNegation__Alternatives ) ) ;
    public final void ruleSubSelectorForNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:507:2: ( ( ( rule__SubSelectorForNegation__Alternatives ) ) )
            // InternalCssDslParser.g:508:2: ( ( rule__SubSelectorForNegation__Alternatives ) )
            {
            // InternalCssDslParser.g:508:2: ( ( rule__SubSelectorForNegation__Alternatives ) )
            // InternalCssDslParser.g:509:3: ( rule__SubSelectorForNegation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorForNegationAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:510:3: ( rule__SubSelectorForNegation__Alternatives )
            // InternalCssDslParser.g:510:4: rule__SubSelectorForNegation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubSelectorForNegation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorForNegationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSelectorForNegation"


    // $ANTLR start "entryRuleSimpleSelector"
    // InternalCssDslParser.g:519:1: entryRuleSimpleSelector : ruleSimpleSelector EOF ;
    public final void entryRuleSimpleSelector() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:523:1: ( ruleSimpleSelector EOF )
            // InternalCssDslParser.g:524:1: ruleSimpleSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSelector"


    // $ANTLR start "ruleSimpleSelector"
    // InternalCssDslParser.g:534:1: ruleSimpleSelector : ( ( rule__SimpleSelector__Alternatives ) ) ;
    public final void ruleSimpleSelector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:539:2: ( ( ( rule__SimpleSelector__Alternatives ) ) )
            // InternalCssDslParser.g:540:2: ( ( rule__SimpleSelector__Alternatives ) )
            {
            // InternalCssDslParser.g:540:2: ( ( rule__SimpleSelector__Alternatives ) )
            // InternalCssDslParser.g:541:3: ( rule__SimpleSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:542:3: ( rule__SimpleSelector__Alternatives )
            // InternalCssDslParser.g:542:4: rule__SimpleSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSelector"


    // $ANTLR start "entryRuleSubSelector"
    // InternalCssDslParser.g:552:1: entryRuleSubSelector : ruleSubSelector EOF ;
    public final void entryRuleSubSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:553:1: ( ruleSubSelector EOF )
            // InternalCssDslParser.g:554:1: ruleSubSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubSelector"


    // $ANTLR start "ruleSubSelector"
    // InternalCssDslParser.g:561:1: ruleSubSelector : ( ( rule__SubSelector__Alternatives ) ) ;
    public final void ruleSubSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:565:2: ( ( ( rule__SubSelector__Alternatives ) ) )
            // InternalCssDslParser.g:566:2: ( ( rule__SubSelector__Alternatives ) )
            {
            // InternalCssDslParser.g:566:2: ( ( rule__SubSelector__Alternatives ) )
            // InternalCssDslParser.g:567:3: ( rule__SubSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSelectorAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:568:3: ( rule__SubSelector__Alternatives )
            // InternalCssDslParser.g:568:4: rule__SubSelector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubSelector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSelectorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSelector"


    // $ANTLR start "entryRuleAttributeSelector"
    // InternalCssDslParser.g:577:1: entryRuleAttributeSelector : ruleAttributeSelector EOF ;
    public final void entryRuleAttributeSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:578:1: ( ruleAttributeSelector EOF )
            // InternalCssDslParser.g:579:1: ruleAttributeSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeSelector"


    // $ANTLR start "ruleAttributeSelector"
    // InternalCssDslParser.g:586:1: ruleAttributeSelector : ( ( rule__AttributeSelector__Group__0 ) ) ;
    public final void ruleAttributeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:590:2: ( ( ( rule__AttributeSelector__Group__0 ) ) )
            // InternalCssDslParser.g:591:2: ( ( rule__AttributeSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:591:2: ( ( rule__AttributeSelector__Group__0 ) )
            // InternalCssDslParser.g:592:3: ( rule__AttributeSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:593:3: ( rule__AttributeSelector__Group__0 )
            // InternalCssDslParser.g:593:4: rule__AttributeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeSelector"


    // $ANTLR start "entryRuleClassSelector"
    // InternalCssDslParser.g:602:1: entryRuleClassSelector : ruleClassSelector EOF ;
    public final void entryRuleClassSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:603:1: ( ruleClassSelector EOF )
            // InternalCssDslParser.g:604:1: ruleClassSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassSelector"


    // $ANTLR start "ruleClassSelector"
    // InternalCssDslParser.g:611:1: ruleClassSelector : ( ( rule__ClassSelector__Group__0 ) ) ;
    public final void ruleClassSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:615:2: ( ( ( rule__ClassSelector__Group__0 ) ) )
            // InternalCssDslParser.g:616:2: ( ( rule__ClassSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:616:2: ( ( rule__ClassSelector__Group__0 ) )
            // InternalCssDslParser.g:617:3: ( rule__ClassSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:618:3: ( rule__ClassSelector__Group__0 )
            // InternalCssDslParser.g:618:4: rule__ClassSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalCssDslParser.g:627:1: entryRuleElementSelector : ruleElementSelector EOF ;
    public final void entryRuleElementSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:628:1: ( ruleElementSelector EOF )
            // InternalCssDslParser.g:629:1: ruleElementSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalCssDslParser.g:636:1: ruleElementSelector : ( ( rule__ElementSelector__Group__0 ) ) ;
    public final void ruleElementSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:640:2: ( ( ( rule__ElementSelector__Group__0 ) ) )
            // InternalCssDslParser.g:641:2: ( ( rule__ElementSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:641:2: ( ( rule__ElementSelector__Group__0 ) )
            // InternalCssDslParser.g:642:3: ( rule__ElementSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:643:3: ( rule__ElementSelector__Group__0 )
            // InternalCssDslParser.g:643:4: rule__ElementSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleUniversalSelector"
    // InternalCssDslParser.g:652:1: entryRuleUniversalSelector : ruleUniversalSelector EOF ;
    public final void entryRuleUniversalSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:653:1: ( ruleUniversalSelector EOF )
            // InternalCssDslParser.g:654:1: ruleUniversalSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUniversalSelector"


    // $ANTLR start "ruleUniversalSelector"
    // InternalCssDslParser.g:661:1: ruleUniversalSelector : ( ( rule__UniversalSelector__Group__0 ) ) ;
    public final void ruleUniversalSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:665:2: ( ( ( rule__UniversalSelector__Group__0 ) ) )
            // InternalCssDslParser.g:666:2: ( ( rule__UniversalSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:666:2: ( ( rule__UniversalSelector__Group__0 ) )
            // InternalCssDslParser.g:667:3: ( rule__UniversalSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:668:3: ( rule__UniversalSelector__Group__0 )
            // InternalCssDslParser.g:668:4: rule__UniversalSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UniversalSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUniversalSelector"


    // $ANTLR start "entryRuleIdSelector"
    // InternalCssDslParser.g:677:1: entryRuleIdSelector : ruleIdSelector EOF ;
    public final void entryRuleIdSelector() throws RecognitionException {
        try {
            // InternalCssDslParser.g:678:1: ( ruleIdSelector EOF )
            // InternalCssDslParser.g:679:1: ruleIdSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdSelector"


    // $ANTLR start "ruleIdSelector"
    // InternalCssDslParser.g:686:1: ruleIdSelector : ( ( rule__IdSelector__Group__0 ) ) ;
    public final void ruleIdSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:690:2: ( ( ( rule__IdSelector__Group__0 ) ) )
            // InternalCssDslParser.g:691:2: ( ( rule__IdSelector__Group__0 ) )
            {
            // InternalCssDslParser.g:691:2: ( ( rule__IdSelector__Group__0 ) )
            // InternalCssDslParser.g:692:3: ( rule__IdSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getGroup()); 
            }
            // InternalCssDslParser.g:693:3: ( rule__IdSelector__Group__0 )
            // InternalCssDslParser.g:693:4: rule__IdSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdSelector"


    // $ANTLR start "entryRuleCssNamespacePrefix"
    // InternalCssDslParser.g:702:1: entryRuleCssNamespacePrefix : ruleCssNamespacePrefix EOF ;
    public final void entryRuleCssNamespacePrefix() throws RecognitionException {
        try {
            // InternalCssDslParser.g:703:1: ( ruleCssNamespacePrefix EOF )
            // InternalCssDslParser.g:704:1: ruleCssNamespacePrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssNamespacePrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssNamespacePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssNamespacePrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCssNamespacePrefix"


    // $ANTLR start "ruleCssNamespacePrefix"
    // InternalCssDslParser.g:711:1: ruleCssNamespacePrefix : ( ( rule__CssNamespacePrefix__Group__0 ) ) ;
    public final void ruleCssNamespacePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:715:2: ( ( ( rule__CssNamespacePrefix__Group__0 ) ) )
            // InternalCssDslParser.g:716:2: ( ( rule__CssNamespacePrefix__Group__0 ) )
            {
            // InternalCssDslParser.g:716:2: ( ( rule__CssNamespacePrefix__Group__0 ) )
            // InternalCssDslParser.g:717:3: ( rule__CssNamespacePrefix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssNamespacePrefixAccess().getGroup()); 
            }
            // InternalCssDslParser.g:718:3: ( rule__CssNamespacePrefix__Group__0 )
            // InternalCssDslParser.g:718:4: rule__CssNamespacePrefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssNamespacePrefix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssNamespacePrefixAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssNamespacePrefix"


    // $ANTLR start "entryRuleCssProperty"
    // InternalCssDslParser.g:727:1: entryRuleCssProperty : ruleCssProperty EOF ;
    public final void entryRuleCssProperty() throws RecognitionException {
        try {
            // InternalCssDslParser.g:728:1: ( ruleCssProperty EOF )
            // InternalCssDslParser.g:729:1: ruleCssProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCssProperty"


    // $ANTLR start "ruleCssProperty"
    // InternalCssDslParser.g:736:1: ruleCssProperty : ( ( rule__CssProperty__Group__0 ) ) ;
    public final void ruleCssProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:740:2: ( ( ( rule__CssProperty__Group__0 ) ) )
            // InternalCssDslParser.g:741:2: ( ( rule__CssProperty__Group__0 ) )
            {
            // InternalCssDslParser.g:741:2: ( ( rule__CssProperty__Group__0 ) )
            // InternalCssDslParser.g:742:3: ( rule__CssProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssPropertyAccess().getGroup()); 
            }
            // InternalCssDslParser.g:743:3: ( rule__CssProperty__Group__0 )
            // InternalCssDslParser.g:743:4: rule__CssProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCssProperty"


    // $ANTLR start "entryRuleValidPropertyIdent"
    // InternalCssDslParser.g:752:1: entryRuleValidPropertyIdent : ruleValidPropertyIdent EOF ;
    public final void entryRuleValidPropertyIdent() throws RecognitionException {
        try {
            // InternalCssDslParser.g:753:1: ( ruleValidPropertyIdent EOF )
            // InternalCssDslParser.g:754:1: ruleValidPropertyIdent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidPropertyIdent"


    // $ANTLR start "ruleValidPropertyIdent"
    // InternalCssDslParser.g:761:1: ruleValidPropertyIdent : ( ruleIdentifier ) ;
    public final void ruleValidPropertyIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:765:2: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:766:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:766:2: ( ruleIdentifier )
            // InternalCssDslParser.g:767:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidPropertyIdentAccess().getIdentifierParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidPropertyIdent"


    // $ANTLR start "entryRulePseudoClassOrFunc"
    // InternalCssDslParser.g:777:1: entryRulePseudoClassOrFunc : rulePseudoClassOrFunc EOF ;
    public final void entryRulePseudoClassOrFunc() throws RecognitionException {
        try {
            // InternalCssDslParser.g:778:1: ( rulePseudoClassOrFunc EOF )
            // InternalCssDslParser.g:779:1: rulePseudoClassOrFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClassOrFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassOrFuncRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClassOrFunc"


    // $ANTLR start "rulePseudoClassOrFunc"
    // InternalCssDslParser.g:786:1: rulePseudoClassOrFunc : ( ( rule__PseudoClassOrFunc__Alternatives ) ) ;
    public final void rulePseudoClassOrFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:790:2: ( ( ( rule__PseudoClassOrFunc__Alternatives ) ) )
            // InternalCssDslParser.g:791:2: ( ( rule__PseudoClassOrFunc__Alternatives ) )
            {
            // InternalCssDslParser.g:791:2: ( ( rule__PseudoClassOrFunc__Alternatives ) )
            // InternalCssDslParser.g:792:3: ( rule__PseudoClassOrFunc__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassOrFuncAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:793:3: ( rule__PseudoClassOrFunc__Alternatives )
            // InternalCssDslParser.g:793:4: rule__PseudoClassOrFunc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassOrFunc__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassOrFuncAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClassOrFunc"


    // $ANTLR start "entryRulePseudoClass"
    // InternalCssDslParser.g:802:1: entryRulePseudoClass : rulePseudoClass EOF ;
    public final void entryRulePseudoClass() throws RecognitionException {
        try {
            // InternalCssDslParser.g:803:1: ( rulePseudoClass EOF )
            // InternalCssDslParser.g:804:1: rulePseudoClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClass"


    // $ANTLR start "rulePseudoClass"
    // InternalCssDslParser.g:811:1: rulePseudoClass : ( ( rule__PseudoClass__Group__0 ) ) ;
    public final void rulePseudoClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:815:2: ( ( ( rule__PseudoClass__Group__0 ) ) )
            // InternalCssDslParser.g:816:2: ( ( rule__PseudoClass__Group__0 ) )
            {
            // InternalCssDslParser.g:816:2: ( ( rule__PseudoClass__Group__0 ) )
            // InternalCssDslParser.g:817:3: ( rule__PseudoClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getGroup()); 
            }
            // InternalCssDslParser.g:818:3: ( rule__PseudoClass__Group__0 )
            // InternalCssDslParser.g:818:4: rule__PseudoClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClass"


    // $ANTLR start "entryRulePseudoClassName"
    // InternalCssDslParser.g:827:1: entryRulePseudoClassName : rulePseudoClassName EOF ;
    public final void entryRulePseudoClassName() throws RecognitionException {
        try {
            // InternalCssDslParser.g:828:1: ( rulePseudoClassName EOF )
            // InternalCssDslParser.g:829:1: rulePseudoClassName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassNameRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClassName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClassName"


    // $ANTLR start "rulePseudoClassName"
    // InternalCssDslParser.g:836:1: rulePseudoClassName : ( ruleIdentifier ) ;
    public final void rulePseudoClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:840:2: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:841:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:841:2: ( ruleIdentifier )
            // InternalCssDslParser.g:842:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassNameAccess().getIdentifierParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassNameAccess().getIdentifierParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClassName"


    // $ANTLR start "entryRulePseudoClassFunction"
    // InternalCssDslParser.g:852:1: entryRulePseudoClassFunction : rulePseudoClassFunction EOF ;
    public final void entryRulePseudoClassFunction() throws RecognitionException {
        try {
            // InternalCssDslParser.g:853:1: ( rulePseudoClassFunction EOF )
            // InternalCssDslParser.g:854:1: rulePseudoClassFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClassFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePseudoClassFunction"


    // $ANTLR start "rulePseudoClassFunction"
    // InternalCssDslParser.g:861:1: rulePseudoClassFunction : ( ( rule__PseudoClassFunction__Alternatives ) ) ;
    public final void rulePseudoClassFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:865:2: ( ( ( rule__PseudoClassFunction__Alternatives ) ) )
            // InternalCssDslParser.g:866:2: ( ( rule__PseudoClassFunction__Alternatives ) )
            {
            // InternalCssDslParser.g:866:2: ( ( rule__PseudoClassFunction__Alternatives ) )
            // InternalCssDslParser.g:867:3: ( rule__PseudoClassFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:868:3: ( rule__PseudoClassFunction__Alternatives )
            // InternalCssDslParser.g:868:4: rule__PseudoClassFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePseudoClassFunction"


    // $ANTLR start "entryRuleNotFunctionCall"
    // InternalCssDslParser.g:877:1: entryRuleNotFunctionCall : ruleNotFunctionCall EOF ;
    public final void entryRuleNotFunctionCall() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:881:1: ( ruleNotFunctionCall EOF )
            // InternalCssDslParser.g:882:1: ruleNotFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNotFunctionCall"


    // $ANTLR start "ruleNotFunctionCall"
    // InternalCssDslParser.g:892:1: ruleNotFunctionCall : ( ( rule__NotFunctionCall__Group__0 ) ) ;
    public final void ruleNotFunctionCall() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:897:2: ( ( ( rule__NotFunctionCall__Group__0 ) ) )
            // InternalCssDslParser.g:898:2: ( ( rule__NotFunctionCall__Group__0 ) )
            {
            // InternalCssDslParser.g:898:2: ( ( rule__NotFunctionCall__Group__0 ) )
            // InternalCssDslParser.g:899:3: ( rule__NotFunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFunctionCallAccess().getGroup()); 
            }
            // InternalCssDslParser.g:900:3: ( rule__NotFunctionCall__Group__0 )
            // InternalCssDslParser.g:900:4: rule__NotFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotFunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFunctionCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNotFunctionCall"


    // $ANTLR start "entryRuleCombinator"
    // InternalCssDslParser.g:910:1: entryRuleCombinator : ruleCombinator EOF ;
    public final void entryRuleCombinator() throws RecognitionException {
        try {
            // InternalCssDslParser.g:911:1: ( ruleCombinator EOF )
            // InternalCssDslParser.g:912:1: ruleCombinator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCombinator"


    // $ANTLR start "ruleCombinator"
    // InternalCssDslParser.g:919:1: ruleCombinator : ( ( rule__Combinator__Alternatives ) ) ;
    public final void ruleCombinator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:923:2: ( ( ( rule__Combinator__Alternatives ) ) )
            // InternalCssDslParser.g:924:2: ( ( rule__Combinator__Alternatives ) )
            {
            // InternalCssDslParser.g:924:2: ( ( rule__Combinator__Alternatives ) )
            // InternalCssDslParser.g:925:3: ( rule__Combinator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinatorAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:926:3: ( rule__Combinator__Alternatives )
            // InternalCssDslParser.g:926:4: rule__Combinator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Combinator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinator"


    // $ANTLR start "entryRuleSymbolTok"
    // InternalCssDslParser.g:935:1: entryRuleSymbolTok : ruleSymbolTok EOF ;
    public final void entryRuleSymbolTok() throws RecognitionException {
        try {
            // InternalCssDslParser.g:936:1: ( ruleSymbolTok EOF )
            // InternalCssDslParser.g:937:1: ruleSymbolTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbolTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolTok"


    // $ANTLR start "ruleSymbolTok"
    // InternalCssDslParser.g:944:1: ruleSymbolTok : ( ( rule__SymbolTok__Group__0 ) ) ;
    public final void ruleSymbolTok() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:948:2: ( ( ( rule__SymbolTok__Group__0 ) ) )
            // InternalCssDslParser.g:949:2: ( ( rule__SymbolTok__Group__0 ) )
            {
            // InternalCssDslParser.g:949:2: ( ( rule__SymbolTok__Group__0 ) )
            // InternalCssDslParser.g:950:3: ( rule__SymbolTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:951:3: ( rule__SymbolTok__Group__0 )
            // InternalCssDslParser.g:951:4: rule__SymbolTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SymbolTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolTok"


    // $ANTLR start "entryRuleWSTok"
    // InternalCssDslParser.g:960:1: entryRuleWSTok : ruleWSTok EOF ;
    public final void entryRuleWSTok() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:964:1: ( ruleWSTok EOF )
            // InternalCssDslParser.g:965:1: ruleWSTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWSTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleWSTok"


    // $ANTLR start "ruleWSTok"
    // InternalCssDslParser.g:975:1: ruleWSTok : ( ( rule__WSTok__Group__0 ) ) ;
    public final void ruleWSTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:980:2: ( ( ( rule__WSTok__Group__0 ) ) )
            // InternalCssDslParser.g:981:2: ( ( rule__WSTok__Group__0 ) )
            {
            // InternalCssDslParser.g:981:2: ( ( rule__WSTok__Group__0 ) )
            // InternalCssDslParser.g:982:3: ( rule__WSTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:983:3: ( rule__WSTok__Group__0 )
            // InternalCssDslParser.g:983:4: rule__WSTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WSTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleWSTok"


    // $ANTLR start "entryRuleStringTok"
    // InternalCssDslParser.g:993:1: entryRuleStringTok : ruleStringTok EOF ;
    public final void entryRuleStringTok() throws RecognitionException {
        try {
            // InternalCssDslParser.g:994:1: ( ruleStringTok EOF )
            // InternalCssDslParser.g:995:1: ruleStringTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringTok"


    // $ANTLR start "ruleStringTok"
    // InternalCssDslParser.g:1002:1: ruleStringTok : ( ( rule__StringTok__Group__0 ) ) ;
    public final void ruleStringTok() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1006:2: ( ( ( rule__StringTok__Group__0 ) ) )
            // InternalCssDslParser.g:1007:2: ( ( rule__StringTok__Group__0 ) )
            {
            // InternalCssDslParser.g:1007:2: ( ( rule__StringTok__Group__0 ) )
            // InternalCssDslParser.g:1008:3: ( rule__StringTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1009:3: ( rule__StringTok__Group__0 )
            // InternalCssDslParser.g:1009:4: rule__StringTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringTok"


    // $ANTLR start "entryRuleNumberTok"
    // InternalCssDslParser.g:1018:1: entryRuleNumberTok : ruleNumberTok EOF ;
    public final void entryRuleNumberTok() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1022:1: ( ruleNumberTok EOF )
            // InternalCssDslParser.g:1023:1: ruleNumberTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumberTok"


    // $ANTLR start "ruleNumberTok"
    // InternalCssDslParser.g:1033:1: ruleNumberTok : ( ( rule__NumberTok__Group__0 ) ) ;
    public final void ruleNumberTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1038:2: ( ( ( rule__NumberTok__Group__0 ) ) )
            // InternalCssDslParser.g:1039:2: ( ( rule__NumberTok__Group__0 ) )
            {
            // InternalCssDslParser.g:1039:2: ( ( rule__NumberTok__Group__0 ) )
            // InternalCssDslParser.g:1040:3: ( rule__NumberTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1041:3: ( rule__NumberTok__Group__0 )
            // InternalCssDslParser.g:1041:4: rule__NumberTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumberTok"


    // $ANTLR start "entryRuleUrlTok"
    // InternalCssDslParser.g:1051:1: entryRuleUrlTok : ruleUrlTok EOF ;
    public final void entryRuleUrlTok() throws RecognitionException {
        try {
            // InternalCssDslParser.g:1052:1: ( ruleUrlTok EOF )
            // InternalCssDslParser.g:1053:1: ruleUrlTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUrlTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlTok"


    // $ANTLR start "ruleUrlTok"
    // InternalCssDslParser.g:1060:1: ruleUrlTok : ( ( rule__UrlTok__Group__0 ) ) ;
    public final void ruleUrlTok() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1064:2: ( ( ( rule__UrlTok__Group__0 ) ) )
            // InternalCssDslParser.g:1065:2: ( ( rule__UrlTok__Group__0 ) )
            {
            // InternalCssDslParser.g:1065:2: ( ( rule__UrlTok__Group__0 ) )
            // InternalCssDslParser.g:1066:3: ( rule__UrlTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1067:3: ( rule__UrlTok__Group__0 )
            // InternalCssDslParser.g:1067:4: rule__UrlTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UrlTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlTok"


    // $ANTLR start "entryRuleColorTok"
    // InternalCssDslParser.g:1076:1: entryRuleColorTok : ruleColorTok EOF ;
    public final void entryRuleColorTok() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1080:1: ( ruleColorTok EOF )
            // InternalCssDslParser.g:1081:1: ruleColorTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColorTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleColorTok"


    // $ANTLR start "ruleColorTok"
    // InternalCssDslParser.g:1091:1: ruleColorTok : ( ( rule__ColorTok__Group__0 ) ) ;
    public final void ruleColorTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1096:2: ( ( ( rule__ColorTok__Group__0 ) ) )
            // InternalCssDslParser.g:1097:2: ( ( rule__ColorTok__Group__0 ) )
            {
            // InternalCssDslParser.g:1097:2: ( ( rule__ColorTok__Group__0 ) )
            // InternalCssDslParser.g:1098:3: ( rule__ColorTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1099:3: ( rule__ColorTok__Group__0 )
            // InternalCssDslParser.g:1099:4: rule__ColorTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleColorTok"


    // $ANTLR start "entryRuleIdentifierOrFuncTok"
    // InternalCssDslParser.g:1109:1: entryRuleIdentifierOrFuncTok : ruleIdentifierOrFuncTok EOF ;
    public final void entryRuleIdentifierOrFuncTok() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1113:1: ( ruleIdentifierOrFuncTok EOF )
            // InternalCssDslParser.g:1114:1: ruleIdentifierOrFuncTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentifierOrFuncTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifierOrFuncTok"


    // $ANTLR start "ruleIdentifierOrFuncTok"
    // InternalCssDslParser.g:1124:1: ruleIdentifierOrFuncTok : ( ( rule__IdentifierOrFuncTok__Group__0 ) ) ;
    public final void ruleIdentifierOrFuncTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1129:2: ( ( ( rule__IdentifierOrFuncTok__Group__0 ) ) )
            // InternalCssDslParser.g:1130:2: ( ( rule__IdentifierOrFuncTok__Group__0 ) )
            {
            // InternalCssDslParser.g:1130:2: ( ( rule__IdentifierOrFuncTok__Group__0 ) )
            // InternalCssDslParser.g:1131:3: ( rule__IdentifierOrFuncTok__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1132:3: ( rule__IdentifierOrFuncTok__Group__0 )
            // InternalCssDslParser.g:1132:4: rule__IdentifierOrFuncTok__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleIdentifierOrFuncTok"


    // $ANTLR start "entryRuleCssTok"
    // InternalCssDslParser.g:1142:1: entryRuleCssTok : ruleCssTok EOF ;
    public final void entryRuleCssTok() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1146:1: ( ruleCssTok EOF )
            // InternalCssDslParser.g:1147:1: ruleCssTok EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssTokRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssTokRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCssTok"


    // $ANTLR start "ruleCssTok"
    // InternalCssDslParser.g:1157:1: ruleCssTok : ( ( rule__CssTok__Alternatives ) ) ;
    public final void ruleCssTok() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1162:2: ( ( ( rule__CssTok__Alternatives ) ) )
            // InternalCssDslParser.g:1163:2: ( ( rule__CssTok__Alternatives ) )
            {
            // InternalCssDslParser.g:1163:2: ( ( rule__CssTok__Alternatives ) )
            // InternalCssDslParser.g:1164:3: ( rule__CssTok__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssTokAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:1165:3: ( rule__CssTok__Alternatives )
            // InternalCssDslParser.g:1165:4: rule__CssTok__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CssTok__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssTokAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCssTok"


    // $ANTLR start "entryRuleURLType"
    // InternalCssDslParser.g:1175:1: entryRuleURLType : ruleURLType EOF ;
    public final void entryRuleURLType() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1179:1: ( ruleURLType EOF )
            // InternalCssDslParser.g:1180:1: ruleURLType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // InternalCssDslParser.g:1190:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
    public final void ruleURLType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1195:2: ( ( ( rule__URLType__Group__0 ) ) )
            // InternalCssDslParser.g:1196:2: ( ( rule__URLType__Group__0 ) )
            {
            // InternalCssDslParser.g:1196:2: ( ( rule__URLType__Group__0 ) )
            // InternalCssDslParser.g:1197:3: ( rule__URLType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1198:3: ( rule__URLType__Group__0 )
            // InternalCssDslParser.g:1198:4: rule__URLType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URLType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleValidURLSymbol"
    // InternalCssDslParser.g:1208:1: entryRuleValidURLSymbol : ruleValidURLSymbol EOF ;
    public final void entryRuleValidURLSymbol() throws RecognitionException {
        try {
            // InternalCssDslParser.g:1209:1: ( ruleValidURLSymbol EOF )
            // InternalCssDslParser.g:1210:1: ruleValidURLSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidURLSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLSymbolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidURLSymbol"


    // $ANTLR start "ruleValidURLSymbol"
    // InternalCssDslParser.g:1217:1: ruleValidURLSymbol : ( ( rule__ValidURLSymbol__Alternatives ) ) ;
    public final void ruleValidURLSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1221:2: ( ( ( rule__ValidURLSymbol__Alternatives ) ) )
            // InternalCssDslParser.g:1222:2: ( ( rule__ValidURLSymbol__Alternatives ) )
            {
            // InternalCssDslParser.g:1222:2: ( ( rule__ValidURLSymbol__Alternatives ) )
            // InternalCssDslParser.g:1223:3: ( rule__ValidURLSymbol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLSymbolAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:1224:3: ( rule__ValidURLSymbol__Alternatives )
            // InternalCssDslParser.g:1224:4: rule__ValidURLSymbol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidURLSymbol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLSymbolAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidURLSymbol"


    // $ANTLR start "entryRuleKeywordHack"
    // InternalCssDslParser.g:1233:1: entryRuleKeywordHack : ruleKeywordHack EOF ;
    public final void entryRuleKeywordHack() throws RecognitionException {
        try {
            // InternalCssDslParser.g:1234:1: ( ruleKeywordHack EOF )
            // InternalCssDslParser.g:1235:1: ruleKeywordHack EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordHackRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeywordHack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordHackRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeywordHack"


    // $ANTLR start "ruleKeywordHack"
    // InternalCssDslParser.g:1242:1: ruleKeywordHack : ( ( rule__KeywordHack__Alternatives ) ) ;
    public final void ruleKeywordHack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1246:2: ( ( ( rule__KeywordHack__Alternatives ) ) )
            // InternalCssDslParser.g:1247:2: ( ( rule__KeywordHack__Alternatives ) )
            {
            // InternalCssDslParser.g:1247:2: ( ( rule__KeywordHack__Alternatives ) )
            // InternalCssDslParser.g:1248:3: ( rule__KeywordHack__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeywordHackAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:1249:3: ( rule__KeywordHack__Alternatives )
            // InternalCssDslParser.g:1249:4: rule__KeywordHack__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KeywordHack__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeywordHackAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeywordHack"


    // $ANTLR start "entryRuleValidURL"
    // InternalCssDslParser.g:1258:1: entryRuleValidURL : ruleValidURL EOF ;
    public final void entryRuleValidURL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1262:1: ( ruleValidURL EOF )
            // InternalCssDslParser.g:1263:1: ruleValidURL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidURL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleValidURL"


    // $ANTLR start "ruleValidURL"
    // InternalCssDslParser.g:1273:1: ruleValidURL : ( ( rule__ValidURL__Alternatives ) ) ;
    public final void ruleValidURL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1278:2: ( ( ( rule__ValidURL__Alternatives ) ) )
            // InternalCssDslParser.g:1279:2: ( ( rule__ValidURL__Alternatives ) )
            {
            // InternalCssDslParser.g:1279:2: ( ( rule__ValidURL__Alternatives ) )
            // InternalCssDslParser.g:1280:3: ( rule__ValidURL__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLAccess().getAlternatives()); 
            }
            // InternalCssDslParser.g:1281:3: ( rule__ValidURL__Alternatives )
            // InternalCssDslParser.g:1281:4: rule__ValidURL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidURL__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleValidURL"


    // $ANTLR start "entryRuleIdentifier"
    // InternalCssDslParser.g:1291:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1295:1: ( ruleIdentifier EOF )
            // InternalCssDslParser.g:1296:1: ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalCssDslParser.g:1306:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1311:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalCssDslParser.g:1312:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalCssDslParser.g:1312:2: ( ( rule__Identifier__Group__0 ) )
            // InternalCssDslParser.g:1313:3: ( rule__Identifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1314:3: ( rule__Identifier__Group__0 )
            // InternalCssDslParser.g:1314:4: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNum"
    // InternalCssDslParser.g:1324:1: entryRuleNum : ruleNum EOF ;
    public final void entryRuleNum() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssDslParser.g:1328:1: ( ruleNum EOF )
            // InternalCssDslParser.g:1329:1: ruleNum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalCssDslParser.g:1339:1: ruleNum : ( ( rule__Num__Group__0 ) ) ;
    public final void ruleNum() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1344:2: ( ( ( rule__Num__Group__0 ) ) )
            // InternalCssDslParser.g:1345:2: ( ( rule__Num__Group__0 ) )
            {
            // InternalCssDslParser.g:1345:2: ( ( rule__Num__Group__0 ) )
            // InternalCssDslParser.g:1346:3: ( rule__Num__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1347:3: ( rule__Num__Group__0 )
            // InternalCssDslParser.g:1347:4: rule__Num__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Num__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleHex"
    // InternalCssDslParser.g:1357:1: entryRuleHex : ruleHex EOF ;
    public final void entryRuleHex() throws RecognitionException {
        try {
            // InternalCssDslParser.g:1358:1: ( ruleHex EOF )
            // InternalCssDslParser.g:1359:1: ruleHex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHex"


    // $ANTLR start "ruleHex"
    // InternalCssDslParser.g:1366:1: ruleHex : ( ( rule__Hex__Group__0 ) ) ;
    public final void ruleHex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1370:2: ( ( ( rule__Hex__Group__0 ) ) )
            // InternalCssDslParser.g:1371:2: ( ( rule__Hex__Group__0 ) )
            {
            // InternalCssDslParser.g:1371:2: ( ( rule__Hex__Group__0 ) )
            // InternalCssDslParser.g:1372:3: ( rule__Hex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexAccess().getGroup()); 
            }
            // InternalCssDslParser.g:1373:3: ( rule__Hex__Group__0 )
            // InternalCssDslParser.g:1373:4: rule__Hex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHex"


    // $ANTLR start "rule__Stylesheet__Alternatives_2"
    // InternalCssDslParser.g:1381:1: rule__Stylesheet__Alternatives_2 : ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) | ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) ) | ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) ) );
    public final void rule__Stylesheet__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1385:1: ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) | ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) ) | ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) ) )
            int alt1=5;
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
                alt1=1;
                }
                break;
            case Media:
                {
                alt1=2;
                }
                break;
            case Page:
                {
                alt1=3;
                }
                break;
            case FontFace:
                {
                alt1=4;
                }
                break;
            case Keyframes:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCssDslParser.g:1386:2: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    {
                    // InternalCssDslParser.g:1386:2: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    // InternalCssDslParser.g:1387:3: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    }
                    // InternalCssDslParser.g:1388:3: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    // InternalCssDslParser.g:1388:4: rule__Stylesheet__RulesetAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__RulesetAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1392:2: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    {
                    // InternalCssDslParser.g:1392:2: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    // InternalCssDslParser.g:1393:3: ( rule__Stylesheet__MediaAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    }
                    // InternalCssDslParser.g:1394:3: ( rule__Stylesheet__MediaAssignment_2_1 )
                    // InternalCssDslParser.g:1394:4: rule__Stylesheet__MediaAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__MediaAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1398:2: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    {
                    // InternalCssDslParser.g:1398:2: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    // InternalCssDslParser.g:1399:3: ( rule__Stylesheet__PageAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
                    }
                    // InternalCssDslParser.g:1400:3: ( rule__Stylesheet__PageAssignment_2_2 )
                    // InternalCssDslParser.g:1400:4: rule__Stylesheet__PageAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__PageAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1404:2: ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) )
                    {
                    // InternalCssDslParser.g:1404:2: ( ( rule__Stylesheet__Font_faceAssignment_2_3 ) )
                    // InternalCssDslParser.g:1405:3: ( rule__Stylesheet__Font_faceAssignment_2_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getFont_faceAssignment_2_3()); 
                    }
                    // InternalCssDslParser.g:1406:3: ( rule__Stylesheet__Font_faceAssignment_2_3 )
                    // InternalCssDslParser.g:1406:4: rule__Stylesheet__Font_faceAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__Font_faceAssignment_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getFont_faceAssignment_2_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:1410:2: ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) )
                    {
                    // InternalCssDslParser.g:1410:2: ( ( rule__Stylesheet__KeyframesAssignment_2_4 ) )
                    // InternalCssDslParser.g:1411:3: ( rule__Stylesheet__KeyframesAssignment_2_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStylesheetAccess().getKeyframesAssignment_2_4()); 
                    }
                    // InternalCssDslParser.g:1412:3: ( rule__Stylesheet__KeyframesAssignment_2_4 )
                    // InternalCssDslParser.g:1412:4: rule__Stylesheet__KeyframesAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__KeyframesAssignment_2_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStylesheetAccess().getKeyframesAssignment_2_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Alternatives_2"


    // $ANTLR start "rule__ImportRule__Alternatives_1"
    // InternalCssDslParser.g:1420:1: rule__ImportRule__Alternatives_1 : ( ( ( rule__ImportRule__ValueAssignment_1_0 ) ) | ( ( rule__ImportRule__Group_1_1__0 ) ) );
    public final void rule__ImportRule__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1424:1: ( ( ( rule__ImportRule__ValueAssignment_1_0 ) ) | ( ( rule__ImportRule__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CSSSTRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==Url_1) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCssDslParser.g:1425:2: ( ( rule__ImportRule__ValueAssignment_1_0 ) )
                    {
                    // InternalCssDslParser.g:1425:2: ( ( rule__ImportRule__ValueAssignment_1_0 ) )
                    // InternalCssDslParser.g:1426:3: ( rule__ImportRule__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportRuleAccess().getValueAssignment_1_0()); 
                    }
                    // InternalCssDslParser.g:1427:3: ( rule__ImportRule__ValueAssignment_1_0 )
                    // InternalCssDslParser.g:1427:4: rule__ImportRule__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportRule__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportRuleAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1431:2: ( ( rule__ImportRule__Group_1_1__0 ) )
                    {
                    // InternalCssDslParser.g:1431:2: ( ( rule__ImportRule__Group_1_1__0 ) )
                    // InternalCssDslParser.g:1432:3: ( rule__ImportRule__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportRuleAccess().getGroup_1_1()); 
                    }
                    // InternalCssDslParser.g:1433:3: ( rule__ImportRule__Group_1_1__0 )
                    // InternalCssDslParser.g:1433:4: rule__ImportRule__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportRule__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportRuleAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Alternatives_1"


    // $ANTLR start "rule__KeyframeSelector__Alternatives_0"
    // InternalCssDslParser.g:1441:1: rule__KeyframeSelector__Alternatives_0 : ( ( ( rule__KeyframeSelector__TypeAssignment_0_0 ) ) | ( ( rule__KeyframeSelector__Group_0_1__0 ) ) );
    public final void rule__KeyframeSelector__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1445:1: ( ( ( rule__KeyframeSelector__TypeAssignment_0_0 ) ) | ( ( rule__KeyframeSelector__Group_0_1__0 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==FullStop||LA3_1==RULE_ONE_INT) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=Not && LA3_1<=Url)||(LA3_1>=No && LA3_1<=Ur)||(LA3_1>=RULE_ONE_HEX_LETTER && LA3_1<=RULE_UNDERSCORE)) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

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
                alt3=1;
                }
                break;
            case FullStop:
            case RULE_ONE_INT:
            case RULE_PLUS:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCssDslParser.g:1446:2: ( ( rule__KeyframeSelector__TypeAssignment_0_0 ) )
                    {
                    // InternalCssDslParser.g:1446:2: ( ( rule__KeyframeSelector__TypeAssignment_0_0 ) )
                    // InternalCssDslParser.g:1447:3: ( rule__KeyframeSelector__TypeAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyframeSelectorAccess().getTypeAssignment_0_0()); 
                    }
                    // InternalCssDslParser.g:1448:3: ( rule__KeyframeSelector__TypeAssignment_0_0 )
                    // InternalCssDslParser.g:1448:4: rule__KeyframeSelector__TypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframeSelector__TypeAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyframeSelectorAccess().getTypeAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1452:2: ( ( rule__KeyframeSelector__Group_0_1__0 ) )
                    {
                    // InternalCssDslParser.g:1452:2: ( ( rule__KeyframeSelector__Group_0_1__0 ) )
                    // InternalCssDslParser.g:1453:3: ( rule__KeyframeSelector__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeyframeSelectorAccess().getGroup_0_1()); 
                    }
                    // InternalCssDslParser.g:1454:3: ( rule__KeyframeSelector__Group_0_1__0 )
                    // InternalCssDslParser.g:1454:4: rule__KeyframeSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframeSelector__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeyframeSelectorAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Alternatives_0"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // InternalCssDslParser.g:1462:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1466:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==GreaterThanSign||LA4_0==Tilde||LA4_0==RULE_PLUS) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_WS) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCssDslParser.g:1467:2: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // InternalCssDslParser.g:1467:2: ( ( rule__Selector__Group_1_0__0 ) )
                    // InternalCssDslParser.g:1468:3: ( rule__Selector__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    }
                    // InternalCssDslParser.g:1469:3: ( rule__Selector__Group_1_0__0 )
                    // InternalCssDslParser.g:1469:4: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1473:2: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // InternalCssDslParser.g:1473:2: ( ( rule__Selector__Group_1_1__0 ) )
                    // InternalCssDslParser.g:1474:3: ( rule__Selector__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    }
                    // InternalCssDslParser.g:1475:3: ( rule__Selector__Group_1_1__0 )
                    // InternalCssDslParser.g:1475:4: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__SimpleSelectorForNegation__Alternatives"
    // InternalCssDslParser.g:1483:1: rule__SimpleSelectorForNegation__Alternatives : ( ( ( rule__SimpleSelectorForNegation__Group_0__0 ) ) | ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__SimpleSelectorForNegation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1487:1: ( ( ( rule__SimpleSelectorForNegation__Group_0__0 ) ) | ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=Not && LA6_0<=Url)||(LA6_0>=No && LA6_0<=Ur)||LA6_0==Asterisk||LA6_0==VerticalLine||(LA6_0>=RULE_ONE_HEX_LETTER && LA6_0<=RULE_DASH)) ) {
                alt6=1;
            }
            else if ( (LA6_0==FullStop||LA6_0==LeftSquareBracket||LA6_0==RULE_HASHMARK||LA6_0==RULE_COLON) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCssDslParser.g:1488:2: ( ( rule__SimpleSelectorForNegation__Group_0__0 ) )
                    {
                    // InternalCssDslParser.g:1488:2: ( ( rule__SimpleSelectorForNegation__Group_0__0 ) )
                    // InternalCssDslParser.g:1489:3: ( rule__SimpleSelectorForNegation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorForNegationAccess().getGroup_0()); 
                    }
                    // InternalCssDslParser.g:1490:3: ( rule__SimpleSelectorForNegation__Group_0__0 )
                    // InternalCssDslParser.g:1490:4: rule__SimpleSelectorForNegation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectorForNegation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorForNegationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1494:2: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) )
                    {
                    // InternalCssDslParser.g:1494:2: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* ) )
                    // InternalCssDslParser.g:1495:3: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* )
                    {
                    // InternalCssDslParser.g:1495:3: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 ) )
                    // InternalCssDslParser.g:1496:4: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1()); 
                    }
                    // InternalCssDslParser.g:1497:4: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )
                    // InternalCssDslParser.g:1497:5: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__SimpleSelectorForNegation__SubSelectorsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1()); 
                    }

                    }

                    // InternalCssDslParser.g:1500:3: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )* )
                    // InternalCssDslParser.g:1501:4: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1()); 
                    }
                    // InternalCssDslParser.g:1502:4: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==FullStop||LA5_0==LeftSquareBracket||LA5_0==RULE_HASHMARK||LA5_0==RULE_COLON) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1502:5: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__SimpleSelectorForNegation__SubSelectorsAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_1()); 
                    }

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Alternatives"


    // $ANTLR start "rule__SimpleSelectorForNegation__Alternatives_0_0"
    // InternalCssDslParser.g:1511:1: rule__SimpleSelectorForNegation__Alternatives_0_0 : ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) );
    public final void rule__SimpleSelectorForNegation__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1515:1: ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCssDslParser.g:1516:2: ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) )
                    {
                    // InternalCssDslParser.g:1516:2: ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) )
                    // InternalCssDslParser.g:1517:3: ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorForNegationAccess().getElementAssignment_0_0_0()); 
                    }
                    // InternalCssDslParser.g:1518:3: ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 )
                    // InternalCssDslParser.g:1518:4: rule__SimpleSelectorForNegation__ElementAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectorForNegation__ElementAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorForNegationAccess().getElementAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1522:2: ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) )
                    {
                    // InternalCssDslParser.g:1522:2: ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) )
                    // InternalCssDslParser.g:1523:3: ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalAssignment_0_0_1()); 
                    }
                    // InternalCssDslParser.g:1524:3: ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 )
                    // InternalCssDslParser.g:1524:4: rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalAssignment_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Alternatives_0_0"


    // $ANTLR start "rule__SubSelectorForNegation__Alternatives"
    // InternalCssDslParser.g:1532:1: rule__SubSelectorForNegation__Alternatives : ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) );
    public final void rule__SubSelectorForNegation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1536:1: ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClass ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt8=1;
                }
                break;
            case FullStop:
                {
                alt8=2;
                }
                break;
            case LeftSquareBracket:
                {
                alt8=3;
                }
                break;
            case RULE_COLON:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCssDslParser.g:1537:2: ( ruleIdSelector )
                    {
                    // InternalCssDslParser.g:1537:2: ( ruleIdSelector )
                    // InternalCssDslParser.g:1538:3: ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorForNegationAccess().getIdSelectorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1543:2: ( ruleClassSelector )
                    {
                    // InternalCssDslParser.g:1543:2: ( ruleClassSelector )
                    // InternalCssDslParser.g:1544:3: ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorForNegationAccess().getClassSelectorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1549:2: ( ruleAttributeSelector )
                    {
                    // InternalCssDslParser.g:1549:2: ( ruleAttributeSelector )
                    // InternalCssDslParser.g:1550:3: ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorForNegationAccess().getAttributeSelectorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1555:2: ( rulePseudoClass )
                    {
                    // InternalCssDslParser.g:1555:2: ( rulePseudoClass )
                    // InternalCssDslParser.g:1556:3: rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorForNegationAccess().getPseudoClassParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSelectorForNegation__Alternatives"


    // $ANTLR start "rule__SimpleSelector__Alternatives"
    // InternalCssDslParser.g:1565:1: rule__SimpleSelector__Alternatives : ( ( ( rule__SimpleSelector__Group_0__0 ) ) | ( ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__SimpleSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1569:1: ( ( ( rule__SimpleSelector__Group_0__0 ) ) | ( ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=Not && LA10_0<=Url)||(LA10_0>=No && LA10_0<=Ur)||LA10_0==Asterisk||LA10_0==VerticalLine||(LA10_0>=RULE_ONE_HEX_LETTER && LA10_0<=RULE_DASH)) ) {
                alt10=1;
            }
            else if ( (LA10_0==FullStop||LA10_0==LeftSquareBracket||LA10_0==RULE_HASHMARK||LA10_0==RULE_COLON) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCssDslParser.g:1570:2: ( ( rule__SimpleSelector__Group_0__0 ) )
                    {
                    // InternalCssDslParser.g:1570:2: ( ( rule__SimpleSelector__Group_0__0 ) )
                    // InternalCssDslParser.g:1571:3: ( rule__SimpleSelector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorAccess().getGroup_0()); 
                    }
                    // InternalCssDslParser.g:1572:3: ( rule__SimpleSelector__Group_0__0 )
                    // InternalCssDslParser.g:1572:4: rule__SimpleSelector__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelector__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1576:2: ( ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* ) )
                    {
                    // InternalCssDslParser.g:1576:2: ( ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* ) )
                    // InternalCssDslParser.g:1577:3: ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) ) ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* )
                    {
                    // InternalCssDslParser.g:1577:3: ( ( rule__SimpleSelector__SubSelectorsAssignment_1 ) )
                    // InternalCssDslParser.g:1578:4: ( rule__SimpleSelector__SubSelectorsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_1()); 
                    }
                    // InternalCssDslParser.g:1579:4: ( rule__SimpleSelector__SubSelectorsAssignment_1 )
                    // InternalCssDslParser.g:1579:5: rule__SimpleSelector__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__SimpleSelector__SubSelectorsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_1()); 
                    }

                    }

                    // InternalCssDslParser.g:1582:3: ( ( rule__SimpleSelector__SubSelectorsAssignment_1 )* )
                    // InternalCssDslParser.g:1583:4: ( rule__SimpleSelector__SubSelectorsAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_1()); 
                    }
                    // InternalCssDslParser.g:1584:4: ( rule__SimpleSelector__SubSelectorsAssignment_1 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==FullStop||LA9_0==LeftSquareBracket||LA9_0==RULE_HASHMARK||LA9_0==RULE_COLON) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCssDslParser.g:1584:5: rule__SimpleSelector__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__SimpleSelector__SubSelectorsAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_1()); 
                    }

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Alternatives"


    // $ANTLR start "rule__SimpleSelector__Alternatives_0_0"
    // InternalCssDslParser.g:1593:1: rule__SimpleSelector__Alternatives_0_0 : ( ( ( rule__SimpleSelector__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelector__UniversalAssignment_0_0_1 ) ) );
    public final void rule__SimpleSelector__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1597:1: ( ( ( rule__SimpleSelector__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelector__UniversalAssignment_0_0_1 ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalCssDslParser.g:1598:2: ( ( rule__SimpleSelector__ElementAssignment_0_0_0 ) )
                    {
                    // InternalCssDslParser.g:1598:2: ( ( rule__SimpleSelector__ElementAssignment_0_0_0 ) )
                    // InternalCssDslParser.g:1599:3: ( rule__SimpleSelector__ElementAssignment_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorAccess().getElementAssignment_0_0_0()); 
                    }
                    // InternalCssDslParser.g:1600:3: ( rule__SimpleSelector__ElementAssignment_0_0_0 )
                    // InternalCssDslParser.g:1600:4: rule__SimpleSelector__ElementAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelector__ElementAssignment_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorAccess().getElementAssignment_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1604:2: ( ( rule__SimpleSelector__UniversalAssignment_0_0_1 ) )
                    {
                    // InternalCssDslParser.g:1604:2: ( ( rule__SimpleSelector__UniversalAssignment_0_0_1 ) )
                    // InternalCssDslParser.g:1605:3: ( rule__SimpleSelector__UniversalAssignment_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleSelectorAccess().getUniversalAssignment_0_0_1()); 
                    }
                    // InternalCssDslParser.g:1606:3: ( rule__SimpleSelector__UniversalAssignment_0_0_1 )
                    // InternalCssDslParser.g:1606:4: rule__SimpleSelector__UniversalAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSelector__UniversalAssignment_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleSelectorAccess().getUniversalAssignment_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Alternatives_0_0"


    // $ANTLR start "rule__SubSelector__Alternatives"
    // InternalCssDslParser.g:1614:1: rule__SubSelector__Alternatives : ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClassOrFunc ) );
    public final void rule__SubSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1618:1: ( ( ruleIdSelector ) | ( ruleClassSelector ) | ( ruleAttributeSelector ) | ( rulePseudoClassOrFunc ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_HASHMARK:
                {
                alt12=1;
                }
                break;
            case FullStop:
                {
                alt12=2;
                }
                break;
            case LeftSquareBracket:
                {
                alt12=3;
                }
                break;
            case RULE_COLON:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCssDslParser.g:1619:2: ( ruleIdSelector )
                    {
                    // InternalCssDslParser.g:1619:2: ( ruleIdSelector )
                    // InternalCssDslParser.g:1620:3: ruleIdSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getIdSelectorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1625:2: ( ruleClassSelector )
                    {
                    // InternalCssDslParser.g:1625:2: ( ruleClassSelector )
                    // InternalCssDslParser.g:1626:3: ruleClassSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleClassSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getClassSelectorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1631:2: ( ruleAttributeSelector )
                    {
                    // InternalCssDslParser.g:1631:2: ( ruleAttributeSelector )
                    // InternalCssDslParser.g:1632:3: ruleAttributeSelector
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttributeSelector();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getAttributeSelectorParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1637:2: ( rulePseudoClassOrFunc )
                    {
                    // InternalCssDslParser.g:1637:2: ( rulePseudoClassOrFunc )
                    // InternalCssDslParser.g:1638:3: rulePseudoClassOrFunc
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePseudoClassOrFunc();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubSelectorAccess().getPseudoClassOrFuncParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSelector__Alternatives"


    // $ANTLR start "rule__AttributeSelector__OpAlternatives_3_0_0"
    // InternalCssDslParser.g:1647:1: rule__AttributeSelector__OpAlternatives_3_0_0 : ( ( CircumflexAccentEqualsSign ) | ( DollarSignEqualsSign ) | ( AsteriskEqualsSign ) | ( EqualsSign ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
    public final void rule__AttributeSelector__OpAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1651:1: ( ( CircumflexAccentEqualsSign ) | ( DollarSignEqualsSign ) | ( AsteriskEqualsSign ) | ( EqualsSign ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case CircumflexAccentEqualsSign:
                {
                alt13=1;
                }
                break;
            case DollarSignEqualsSign:
                {
                alt13=2;
                }
                break;
            case AsteriskEqualsSign:
                {
                alt13=3;
                }
                break;
            case EqualsSign:
                {
                alt13=4;
                }
                break;
            case RULE_INCLUDES:
                {
                alt13=5;
                }
                break;
            case RULE_DASHMATCH:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCssDslParser.g:1652:2: ( CircumflexAccentEqualsSign )
                    {
                    // InternalCssDslParser.g:1652:2: ( CircumflexAccentEqualsSign )
                    // InternalCssDslParser.g:1653:3: CircumflexAccentEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0()); 
                    }
                    match(input,CircumflexAccentEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpCircumflexAccentEqualsSignKeyword_3_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1658:2: ( DollarSignEqualsSign )
                    {
                    // InternalCssDslParser.g:1658:2: ( DollarSignEqualsSign )
                    // InternalCssDslParser.g:1659:3: DollarSignEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1()); 
                    }
                    match(input,DollarSignEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpDollarSignEqualsSignKeyword_3_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1664:2: ( AsteriskEqualsSign )
                    {
                    // InternalCssDslParser.g:1664:2: ( AsteriskEqualsSign )
                    // InternalCssDslParser.g:1665:3: AsteriskEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2()); 
                    }
                    match(input,AsteriskEqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpAsteriskEqualsSignKeyword_3_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1670:2: ( EqualsSign )
                    {
                    // InternalCssDslParser.g:1670:2: ( EqualsSign )
                    // InternalCssDslParser.g:1671:3: EqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3()); 
                    }
                    match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpEqualsSignKeyword_3_0_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:1676:2: ( RULE_INCLUDES )
                    {
                    // InternalCssDslParser.g:1676:2: ( RULE_INCLUDES )
                    // InternalCssDslParser.g:1677:3: RULE_INCLUDES
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                    }
                    match(input,RULE_INCLUDES,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpINCLUDESTerminalRuleCall_3_0_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:1682:2: ( RULE_DASHMATCH )
                    {
                    // InternalCssDslParser.g:1682:2: ( RULE_DASHMATCH )
                    // InternalCssDslParser.g:1683:3: RULE_DASHMATCH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
                    }
                    match(input,RULE_DASHMATCH,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getOpDASHMATCHTerminalRuleCall_3_0_0_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__OpAlternatives_3_0_0"


    // $ANTLR start "rule__AttributeSelector__ValueAlternatives_3_1_0"
    // InternalCssDslParser.g:1692:1: rule__AttributeSelector__ValueAlternatives_3_1_0 : ( ( ruleIdentifier ) | ( RULE_CSSSTRING ) );
    public final void rule__AttributeSelector__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1696:1: ( ( ruleIdentifier ) | ( RULE_CSSSTRING ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=Not && LA14_0<=Url)||(LA14_0>=No && LA14_0<=Ur)||(LA14_0>=RULE_ONE_HEX_LETTER && LA14_0<=RULE_DASH)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_CSSSTRING) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCssDslParser.g:1697:2: ( ruleIdentifier )
                    {
                    // InternalCssDslParser.g:1697:2: ( ruleIdentifier )
                    // InternalCssDslParser.g:1698:3: ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getValueIdentifierParserRuleCall_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1703:2: ( RULE_CSSSTRING )
                    {
                    // InternalCssDslParser.g:1703:2: ( RULE_CSSSTRING )
                    // InternalCssDslParser.g:1704:3: RULE_CSSSTRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1()); 
                    }
                    match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeSelectorAccess().getValueCSSSTRINGTerminalRuleCall_3_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__CssNamespacePrefix__Alternatives_0"
    // InternalCssDslParser.g:1713:1: rule__CssNamespacePrefix__Alternatives_0 : ( ( ruleIdentifier ) | ( Asterisk ) );
    public final void rule__CssNamespacePrefix__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1717:1: ( ( ruleIdentifier ) | ( Asterisk ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=Not && LA15_0<=Url)||(LA15_0>=No && LA15_0<=Ur)||(LA15_0>=RULE_ONE_HEX_LETTER && LA15_0<=RULE_DASH)) ) {
                alt15=1;
            }
            else if ( (LA15_0==Asterisk) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCssDslParser.g:1718:2: ( ruleIdentifier )
                    {
                    // InternalCssDslParser.g:1718:2: ( ruleIdentifier )
                    // InternalCssDslParser.g:1719:3: ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssNamespacePrefixAccess().getIdentifierParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssNamespacePrefixAccess().getIdentifierParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1724:2: ( Asterisk )
                    {
                    // InternalCssDslParser.g:1724:2: ( Asterisk )
                    // InternalCssDslParser.g:1725:3: Asterisk
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssNamespacePrefixAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssNamespacePrefixAccess().getAsteriskKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssNamespacePrefix__Alternatives_0"


    // $ANTLR start "rule__PseudoClassOrFunc__Alternatives"
    // InternalCssDslParser.g:1734:1: rule__PseudoClassOrFunc__Alternatives : ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) );
    public final void rule__PseudoClassOrFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1738:1: ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalCssDslParser.g:1739:2: ( rulePseudoClass )
                    {
                    // InternalCssDslParser.g:1739:2: ( rulePseudoClass )
                    // InternalCssDslParser.g:1740:3: rulePseudoClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePseudoClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1745:2: ( rulePseudoClassFunction )
                    {
                    // InternalCssDslParser.g:1745:2: ( rulePseudoClassFunction )
                    // InternalCssDslParser.g:1746:3: rulePseudoClassFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePseudoClassFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassOrFuncAccess().getPseudoClassFunctionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassOrFunc__Alternatives"


    // $ANTLR start "rule__PseudoClassFunction__Alternatives"
    // InternalCssDslParser.g:1755:1: rule__PseudoClassFunction__Alternatives : ( ( ( rule__PseudoClassFunction__Group_0__0 ) ) | ( ( rule__PseudoClassFunction__Group_1__0 ) ) );
    public final void rule__PseudoClassFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1759:1: ( ( ( rule__PseudoClassFunction__Group_0__0 ) ) | ( ( rule__PseudoClassFunction__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COLON) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==Not_1) ) {
                    alt17=1;
                }
                else if ( ((LA17_1>=Not && LA17_1<=Url)||(LA17_1>=No && LA17_1<=Ur)||(LA17_1>=RULE_ONE_HEX_LETTER && LA17_1<=RULE_DASH)) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCssDslParser.g:1760:2: ( ( rule__PseudoClassFunction__Group_0__0 ) )
                    {
                    // InternalCssDslParser.g:1760:2: ( ( rule__PseudoClassFunction__Group_0__0 ) )
                    // InternalCssDslParser.g:1761:3: ( rule__PseudoClassFunction__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassFunctionAccess().getGroup_0()); 
                    }
                    // InternalCssDslParser.g:1762:3: ( rule__PseudoClassFunction__Group_0__0 )
                    // InternalCssDslParser.g:1762:4: rule__PseudoClassFunction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PseudoClassFunction__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassFunctionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1766:2: ( ( rule__PseudoClassFunction__Group_1__0 ) )
                    {
                    // InternalCssDslParser.g:1766:2: ( ( rule__PseudoClassFunction__Group_1__0 ) )
                    // InternalCssDslParser.g:1767:3: ( rule__PseudoClassFunction__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPseudoClassFunctionAccess().getGroup_1()); 
                    }
                    // InternalCssDslParser.g:1768:3: ( rule__PseudoClassFunction__Group_1__0 )
                    // InternalCssDslParser.g:1768:4: rule__PseudoClassFunction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PseudoClassFunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPseudoClassFunctionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Alternatives"


    // $ANTLR start "rule__Combinator__Alternatives"
    // InternalCssDslParser.g:1776:1: rule__Combinator__Alternatives : ( ( RULE_PLUS ) | ( GreaterThanSign ) | ( Tilde ) );
    public final void rule__Combinator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1780:1: ( ( RULE_PLUS ) | ( GreaterThanSign ) | ( Tilde ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt18=1;
                }
                break;
            case GreaterThanSign:
                {
                alt18=2;
                }
                break;
            case Tilde:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCssDslParser.g:1781:2: ( RULE_PLUS )
                    {
                    // InternalCssDslParser.g:1781:2: ( RULE_PLUS )
                    // InternalCssDslParser.g:1782:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0()); 
                    }
                    match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getPLUSTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1787:2: ( GreaterThanSign )
                    {
                    // InternalCssDslParser.g:1787:2: ( GreaterThanSign )
                    // InternalCssDslParser.g:1788:3: GreaterThanSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                    }
                    match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1793:2: ( Tilde )
                    {
                    // InternalCssDslParser.g:1793:2: ( Tilde )
                    // InternalCssDslParser.g:1794:3: Tilde
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinatorAccess().getTildeKeyword_2()); 
                    }
                    match(input,Tilde,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinatorAccess().getTildeKeyword_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Alternatives"


    // $ANTLR start "rule__SymbolTok__SymbolAlternatives_1_0"
    // InternalCssDslParser.g:1803:1: rule__SymbolTok__SymbolAlternatives_1_0 : ( ( RULE_COMMA ) | ( RULE_PERCENT ) );
    public final void rule__SymbolTok__SymbolAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1807:1: ( ( RULE_COMMA ) | ( RULE_PERCENT ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMA) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_PERCENT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCssDslParser.g:1808:2: ( RULE_COMMA )
                    {
                    // InternalCssDslParser.g:1808:2: ( RULE_COMMA )
                    // InternalCssDslParser.g:1809:3: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolTokAccess().getSymbolCOMMATerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1814:2: ( RULE_PERCENT )
                    {
                    // InternalCssDslParser.g:1814:2: ( RULE_PERCENT )
                    // InternalCssDslParser.g:1815:3: RULE_PERCENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSymbolTokAccess().getSymbolPERCENTTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__SymbolAlternatives_1_0"


    // $ANTLR start "rule__CssTok__Alternatives"
    // InternalCssDslParser.g:1824:1: rule__CssTok__Alternatives : ( ( ruleIdentifierOrFuncTok ) | ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleNumberTok ) | ( ruleUrlTok ) | ( ruleColorTok ) );
    public final void rule__CssTok__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1828:1: ( ( ruleIdentifierOrFuncTok ) | ( ruleSymbolTok ) | ( ruleWSTok ) | ( ruleStringTok ) | ( ruleNumberTok ) | ( ruleUrlTok ) | ( ruleColorTok ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==FullStop||LA20_1==RULE_ONE_INT) ) {
                    alt20=5;
                }
                else if ( ((LA20_1>=Not && LA20_1<=Url)||(LA20_1>=No && LA20_1<=Ur)||(LA20_1>=RULE_ONE_HEX_LETTER && LA20_1<=RULE_UNDERSCORE)) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

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
                alt20=1;
                }
                break;
            case RULE_COMMA:
            case RULE_PERCENT:
                {
                alt20=2;
                }
                break;
            case RULE_WS:
                {
                alt20=3;
                }
                break;
            case RULE_CSSSTRING:
                {
                alt20=4;
                }
                break;
            case FullStop:
            case RULE_ONE_INT:
            case RULE_PLUS:
                {
                alt20=5;
                }
                break;
            case Url_1:
                {
                alt20=6;
                }
                break;
            case RULE_HASHMARK:
                {
                alt20=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalCssDslParser.g:1829:2: ( ruleIdentifierOrFuncTok )
                    {
                    // InternalCssDslParser.g:1829:2: ( ruleIdentifierOrFuncTok )
                    // InternalCssDslParser.g:1830:3: ruleIdentifierOrFuncTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdentifierOrFuncTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getIdentifierOrFuncTokParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1835:2: ( ruleSymbolTok )
                    {
                    // InternalCssDslParser.g:1835:2: ( ruleSymbolTok )
                    // InternalCssDslParser.g:1836:3: ruleSymbolTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSymbolTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getSymbolTokParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1841:2: ( ruleWSTok )
                    {
                    // InternalCssDslParser.g:1841:2: ( ruleWSTok )
                    // InternalCssDslParser.g:1842:3: ruleWSTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWSTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getWSTokParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1847:2: ( ruleStringTok )
                    {
                    // InternalCssDslParser.g:1847:2: ( ruleStringTok )
                    // InternalCssDslParser.g:1848:3: ruleStringTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getStringTokParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:1853:2: ( ruleNumberTok )
                    {
                    // InternalCssDslParser.g:1853:2: ( ruleNumberTok )
                    // InternalCssDslParser.g:1854:3: ruleNumberTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getNumberTokParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:1859:2: ( ruleUrlTok )
                    {
                    // InternalCssDslParser.g:1859:2: ( ruleUrlTok )
                    // InternalCssDslParser.g:1860:3: ruleUrlTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUrlTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getUrlTokParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCssDslParser.g:1865:2: ( ruleColorTok )
                    {
                    // InternalCssDslParser.g:1865:2: ( ruleColorTok )
                    // InternalCssDslParser.g:1866:3: ruleColorTok
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleColorTok();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCssTokAccess().getColorTokParserRuleCall_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssTok__Alternatives"


    // $ANTLR start "rule__ValidURLSymbol__Alternatives"
    // InternalCssDslParser.g:1875:1: rule__ValidURLSymbol__Alternatives : ( ( RULE_DASH ) | ( FullStop ) | ( RULE_UNDERSCORE ) | ( Tilde ) | ( RULE_COLON ) | ( Solidus ) | ( QuestionMark ) | ( RULE_HASHMARK ) | ( LeftSquareBracket ) | ( RightSquareBracket ) | ( CommercialAt ) | ( ExclamationMark ) | ( DollarSign ) | ( Ampersand ) | ( Asterisk ) | ( RULE_PLUS ) | ( RULE_COMMA ) | ( Semicolon ) | ( ( rule__ValidURLSymbol__Group_18__0 ) ) );
    public final void rule__ValidURLSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:1879:1: ( ( RULE_DASH ) | ( FullStop ) | ( RULE_UNDERSCORE ) | ( Tilde ) | ( RULE_COLON ) | ( Solidus ) | ( QuestionMark ) | ( RULE_HASHMARK ) | ( LeftSquareBracket ) | ( RightSquareBracket ) | ( CommercialAt ) | ( ExclamationMark ) | ( DollarSign ) | ( Ampersand ) | ( Asterisk ) | ( RULE_PLUS ) | ( RULE_COMMA ) | ( Semicolon ) | ( ( rule__ValidURLSymbol__Group_18__0 ) ) )
            int alt21=19;
            switch ( input.LA(1) ) {
            case RULE_DASH:
                {
                alt21=1;
                }
                break;
            case FullStop:
                {
                alt21=2;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt21=3;
                }
                break;
            case Tilde:
                {
                alt21=4;
                }
                break;
            case RULE_COLON:
                {
                alt21=5;
                }
                break;
            case Solidus:
                {
                alt21=6;
                }
                break;
            case QuestionMark:
                {
                alt21=7;
                }
                break;
            case RULE_HASHMARK:
                {
                alt21=8;
                }
                break;
            case LeftSquareBracket:
                {
                alt21=9;
                }
                break;
            case RightSquareBracket:
                {
                alt21=10;
                }
                break;
            case CommercialAt:
                {
                alt21=11;
                }
                break;
            case ExclamationMark:
                {
                alt21=12;
                }
                break;
            case DollarSign:
                {
                alt21=13;
                }
                break;
            case Ampersand:
                {
                alt21=14;
                }
                break;
            case Asterisk:
                {
                alt21=15;
                }
                break;
            case RULE_PLUS:
                {
                alt21=16;
                }
                break;
            case RULE_COMMA:
                {
                alt21=17;
                }
                break;
            case Semicolon:
                {
                alt21=18;
                }
                break;
            case EqualsSign:
                {
                alt21=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCssDslParser.g:1880:2: ( RULE_DASH )
                    {
                    // InternalCssDslParser.g:1880:2: ( RULE_DASH )
                    // InternalCssDslParser.g:1881:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0()); 
                    }
                    match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getDASHTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:1886:2: ( FullStop )
                    {
                    // InternalCssDslParser.g:1886:2: ( FullStop )
                    // InternalCssDslParser.g:1887:3: FullStop
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1()); 
                    }
                    match(input,FullStop,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getFullStopKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:1892:2: ( RULE_UNDERSCORE )
                    {
                    // InternalCssDslParser.g:1892:2: ( RULE_UNDERSCORE )
                    // InternalCssDslParser.g:1893:3: RULE_UNDERSCORE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2()); 
                    }
                    match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getUNDERSCORETerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:1898:2: ( Tilde )
                    {
                    // InternalCssDslParser.g:1898:2: ( Tilde )
                    // InternalCssDslParser.g:1899:3: Tilde
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3()); 
                    }
                    match(input,Tilde,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getTildeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:1904:2: ( RULE_COLON )
                    {
                    // InternalCssDslParser.g:1904:2: ( RULE_COLON )
                    // InternalCssDslParser.g:1905:3: RULE_COLON
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4()); 
                    }
                    match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getCOLONTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:1910:2: ( Solidus )
                    {
                    // InternalCssDslParser.g:1910:2: ( Solidus )
                    // InternalCssDslParser.g:1911:3: Solidus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5()); 
                    }
                    match(input,Solidus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getSolidusKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCssDslParser.g:1916:2: ( QuestionMark )
                    {
                    // InternalCssDslParser.g:1916:2: ( QuestionMark )
                    // InternalCssDslParser.g:1917:3: QuestionMark
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6()); 
                    }
                    match(input,QuestionMark,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getQuestionMarkKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalCssDslParser.g:1922:2: ( RULE_HASHMARK )
                    {
                    // InternalCssDslParser.g:1922:2: ( RULE_HASHMARK )
                    // InternalCssDslParser.g:1923:3: RULE_HASHMARK
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7()); 
                    }
                    match(input,RULE_HASHMARK,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getHASHMARKTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalCssDslParser.g:1928:2: ( LeftSquareBracket )
                    {
                    // InternalCssDslParser.g:1928:2: ( LeftSquareBracket )
                    // InternalCssDslParser.g:1929:3: LeftSquareBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8()); 
                    }
                    match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getLeftSquareBracketKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalCssDslParser.g:1934:2: ( RightSquareBracket )
                    {
                    // InternalCssDslParser.g:1934:2: ( RightSquareBracket )
                    // InternalCssDslParser.g:1935:3: RightSquareBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9()); 
                    }
                    match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getRightSquareBracketKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalCssDslParser.g:1940:2: ( CommercialAt )
                    {
                    // InternalCssDslParser.g:1940:2: ( CommercialAt )
                    // InternalCssDslParser.g:1941:3: CommercialAt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10()); 
                    }
                    match(input,CommercialAt,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getCommercialAtKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalCssDslParser.g:1946:2: ( ExclamationMark )
                    {
                    // InternalCssDslParser.g:1946:2: ( ExclamationMark )
                    // InternalCssDslParser.g:1947:3: ExclamationMark
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11()); 
                    }
                    match(input,ExclamationMark,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getExclamationMarkKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalCssDslParser.g:1952:2: ( DollarSign )
                    {
                    // InternalCssDslParser.g:1952:2: ( DollarSign )
                    // InternalCssDslParser.g:1953:3: DollarSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12()); 
                    }
                    match(input,DollarSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getDollarSignKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalCssDslParser.g:1958:2: ( Ampersand )
                    {
                    // InternalCssDslParser.g:1958:2: ( Ampersand )
                    // InternalCssDslParser.g:1959:3: Ampersand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13()); 
                    }
                    match(input,Ampersand,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getAmpersandKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalCssDslParser.g:1964:2: ( Asterisk )
                    {
                    // InternalCssDslParser.g:1964:2: ( Asterisk )
                    // InternalCssDslParser.g:1965:3: Asterisk
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14()); 
                    }
                    match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getAsteriskKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalCssDslParser.g:1970:2: ( RULE_PLUS )
                    {
                    // InternalCssDslParser.g:1970:2: ( RULE_PLUS )
                    // InternalCssDslParser.g:1971:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15()); 
                    }
                    match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getPLUSTerminalRuleCall_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalCssDslParser.g:1976:2: ( RULE_COMMA )
                    {
                    // InternalCssDslParser.g:1976:2: ( RULE_COMMA )
                    // InternalCssDslParser.g:1977:3: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16()); 
                    }
                    match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getCOMMATerminalRuleCall_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalCssDslParser.g:1982:2: ( Semicolon )
                    {
                    // InternalCssDslParser.g:1982:2: ( Semicolon )
                    // InternalCssDslParser.g:1983:3: Semicolon
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17()); 
                    }
                    match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getSemicolonKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalCssDslParser.g:1988:2: ( ( rule__ValidURLSymbol__Group_18__0 ) )
                    {
                    // InternalCssDslParser.g:1988:2: ( ( rule__ValidURLSymbol__Group_18__0 ) )
                    // InternalCssDslParser.g:1989:3: ( rule__ValidURLSymbol__Group_18__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLSymbolAccess().getGroup_18()); 
                    }
                    // InternalCssDslParser.g:1990:3: ( rule__ValidURLSymbol__Group_18__0 )
                    // InternalCssDslParser.g:1990:4: rule__ValidURLSymbol__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidURLSymbol__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLSymbolAccess().getGroup_18()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURLSymbol__Alternatives"


    // $ANTLR start "rule__KeywordHack__Alternatives"
    // InternalCssDslParser.g:1998:1: rule__KeywordHack__Alternatives : ( ( Not ) | ( No ) | ( Url ) | ( Ur ) );
    public final void rule__KeywordHack__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2002:1: ( ( Not ) | ( No ) | ( Url ) | ( Ur ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt22=1;
                }
                break;
            case No:
                {
                alt22=2;
                }
                break;
            case Url:
                {
                alt22=3;
                }
                break;
            case Ur:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalCssDslParser.g:2003:2: ( Not )
                    {
                    // InternalCssDslParser.g:2003:2: ( Not )
                    // InternalCssDslParser.g:2004:3: Not
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordHackAccess().getNotKeyword_0()); 
                    }
                    match(input,Not,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordHackAccess().getNotKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2009:2: ( No )
                    {
                    // InternalCssDslParser.g:2009:2: ( No )
                    // InternalCssDslParser.g:2010:3: No
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordHackAccess().getNoKeyword_1()); 
                    }
                    match(input,No,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordHackAccess().getNoKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2015:2: ( Url )
                    {
                    // InternalCssDslParser.g:2015:2: ( Url )
                    // InternalCssDslParser.g:2016:3: Url
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordHackAccess().getUrlKeyword_2()); 
                    }
                    match(input,Url,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordHackAccess().getUrlKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:2021:2: ( Ur )
                    {
                    // InternalCssDslParser.g:2021:2: ( Ur )
                    // InternalCssDslParser.g:2022:3: Ur
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKeywordHackAccess().getUrKeyword_3()); 
                    }
                    match(input,Ur,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKeywordHackAccess().getUrKeyword_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeywordHack__Alternatives"


    // $ANTLR start "rule__ValidURL__Alternatives"
    // InternalCssDslParser.g:2031:1: rule__ValidURL__Alternatives : ( ( RULE_CSSSTRING ) | ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) ) );
    public final void rule__ValidURL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2035:1: ( ( RULE_CSSSTRING ) | ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_CSSSTRING) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=Not && LA24_0<=Url)||(LA24_0>=ReverseSolidusSpace && LA24_0<=ReverseSolidusRightParenthesis)||(LA24_0>=No && LA24_0<=Ampersand)||(LA24_0>=Asterisk && LA24_0<=EqualsSign)||(LA24_0>=QuestionMark && LA24_0<=RightSquareBracket)||LA24_0==Tilde||(LA24_0>=RULE_ONE_INT && LA24_0<=RULE_PERCENT)||LA24_0==RULE_COLON) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCssDslParser.g:2036:2: ( RULE_CSSSTRING )
                    {
                    // InternalCssDslParser.g:2036:2: ( RULE_CSSSTRING )
                    // InternalCssDslParser.g:2037:3: RULE_CSSSTRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getCSSSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2042:2: ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) )
                    {
                    // InternalCssDslParser.g:2042:2: ( ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* ) )
                    // InternalCssDslParser.g:2043:3: ( ( rule__ValidURL__Alternatives_1 ) ) ( ( rule__ValidURL__Alternatives_1 )* )
                    {
                    // InternalCssDslParser.g:2043:3: ( ( rule__ValidURL__Alternatives_1 ) )
                    // InternalCssDslParser.g:2044:4: ( rule__ValidURL__Alternatives_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getAlternatives_1()); 
                    }
                    // InternalCssDslParser.g:2045:4: ( rule__ValidURL__Alternatives_1 )
                    // InternalCssDslParser.g:2045:5: rule__ValidURL__Alternatives_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__ValidURL__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getAlternatives_1()); 
                    }

                    }

                    // InternalCssDslParser.g:2048:3: ( ( rule__ValidURL__Alternatives_1 )* )
                    // InternalCssDslParser.g:2049:4: ( rule__ValidURL__Alternatives_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getAlternatives_1()); 
                    }
                    // InternalCssDslParser.g:2050:4: ( rule__ValidURL__Alternatives_1 )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=Not && LA23_0<=Url)||(LA23_0>=ReverseSolidusSpace && LA23_0<=ReverseSolidusRightParenthesis)||(LA23_0>=No && LA23_0<=Ampersand)||(LA23_0>=Asterisk && LA23_0<=EqualsSign)||(LA23_0>=QuestionMark && LA23_0<=RightSquareBracket)||LA23_0==Tilde||(LA23_0>=RULE_ONE_INT && LA23_0<=RULE_PERCENT)||LA23_0==RULE_COLON) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalCssDslParser.g:2050:5: rule__ValidURL__Alternatives_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__ValidURL__Alternatives_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getAlternatives_1()); 
                    }

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Alternatives"


    // $ANTLR start "rule__ValidURL__Alternatives_1"
    // InternalCssDslParser.g:2059:1: rule__ValidURL__Alternatives_1 : ( ( ruleValidURLSymbol ) | ( ruleKeywordHack ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ReverseSolidusSpace ) | ( ReverseSolidusLeftParenthesis ) | ( ReverseSolidusRightParenthesis ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ( rule__ValidURL__Group_1_10__0 ) ) );
    public final void rule__ValidURL__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2063:1: ( ( ruleValidURLSymbol ) | ( ruleKeywordHack ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ReverseSolidusSpace ) | ( ReverseSolidusLeftParenthesis ) | ( ReverseSolidusRightParenthesis ) | ( ReverseSolidusApostrophe ) | ( ReverseSolidusQuotationMark ) | ( ( rule__ValidURL__Group_1_10__0 ) ) )
            int alt25=11;
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
                alt25=1;
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
                {
                alt25=2;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt25=3;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt25=4;
                }
                break;
            case RULE_ONE_INT:
                {
                alt25=5;
                }
                break;
            case ReverseSolidusSpace:
                {
                alt25=6;
                }
                break;
            case ReverseSolidusLeftParenthesis:
                {
                alt25=7;
                }
                break;
            case ReverseSolidusRightParenthesis:
                {
                alt25=8;
                }
                break;
            case ReverseSolidusApostrophe:
                {
                alt25=9;
                }
                break;
            case ReverseSolidusQuotationMark:
                {
                alt25=10;
                }
                break;
            case RULE_PERCENT:
                {
                alt25=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalCssDslParser.g:2064:2: ( ruleValidURLSymbol )
                    {
                    // InternalCssDslParser.g:2064:2: ( ruleValidURLSymbol )
                    // InternalCssDslParser.g:2065:3: ruleValidURLSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleValidURLSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getValidURLSymbolParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2070:2: ( ruleKeywordHack )
                    {
                    // InternalCssDslParser.g:2070:2: ( ruleKeywordHack )
                    // InternalCssDslParser.g:2071:3: ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getKeywordHackParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2076:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2076:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2077:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:2082:2: ( RULE_ONE_NON_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2082:2: ( RULE_ONE_NON_HEX_LETTER )
                    // InternalCssDslParser.g:2083:3: RULE_ONE_NON_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3()); 
                    }
                    match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:2088:2: ( RULE_ONE_INT )
                    {
                    // InternalCssDslParser.g:2088:2: ( RULE_ONE_INT )
                    // InternalCssDslParser.g:2089:3: RULE_ONE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4()); 
                    }
                    match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:2094:2: ( ReverseSolidusSpace )
                    {
                    // InternalCssDslParser.g:2094:2: ( ReverseSolidusSpace )
                    // InternalCssDslParser.g:2095:3: ReverseSolidusSpace
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5()); 
                    }
                    match(input,ReverseSolidusSpace,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getReverseSolidusSpaceKeyword_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCssDslParser.g:2100:2: ( ReverseSolidusLeftParenthesis )
                    {
                    // InternalCssDslParser.g:2100:2: ( ReverseSolidusLeftParenthesis )
                    // InternalCssDslParser.g:2101:3: ReverseSolidusLeftParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6()); 
                    }
                    match(input,ReverseSolidusLeftParenthesis,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getReverseSolidusLeftParenthesisKeyword_1_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalCssDslParser.g:2106:2: ( ReverseSolidusRightParenthesis )
                    {
                    // InternalCssDslParser.g:2106:2: ( ReverseSolidusRightParenthesis )
                    // InternalCssDslParser.g:2107:3: ReverseSolidusRightParenthesis
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7()); 
                    }
                    match(input,ReverseSolidusRightParenthesis,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getReverseSolidusRightParenthesisKeyword_1_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalCssDslParser.g:2112:2: ( ReverseSolidusApostrophe )
                    {
                    // InternalCssDslParser.g:2112:2: ( ReverseSolidusApostrophe )
                    // InternalCssDslParser.g:2113:3: ReverseSolidusApostrophe
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8()); 
                    }
                    match(input,ReverseSolidusApostrophe,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getReverseSolidusApostropheKeyword_1_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalCssDslParser.g:2118:2: ( ReverseSolidusQuotationMark )
                    {
                    // InternalCssDslParser.g:2118:2: ( ReverseSolidusQuotationMark )
                    // InternalCssDslParser.g:2119:3: ReverseSolidusQuotationMark
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9()); 
                    }
                    match(input,ReverseSolidusQuotationMark,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getReverseSolidusQuotationMarkKeyword_1_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalCssDslParser.g:2124:2: ( ( rule__ValidURL__Group_1_10__0 ) )
                    {
                    // InternalCssDslParser.g:2124:2: ( ( rule__ValidURL__Group_1_10__0 ) )
                    // InternalCssDslParser.g:2125:3: ( rule__ValidURL__Group_1_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getGroup_1_10()); 
                    }
                    // InternalCssDslParser.g:2126:3: ( rule__ValidURL__Group_1_10__0 )
                    // InternalCssDslParser.g:2126:4: rule__ValidURL__Group_1_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidURL__Group_1_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getGroup_1_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Alternatives_1"


    // $ANTLR start "rule__ValidURL__Alternatives_1_10_1"
    // InternalCssDslParser.g:2134:1: rule__ValidURL__Alternatives_1_10_1 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
    public final void rule__ValidURL__Alternatives_1_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2138:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ONE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ONE_HEX_LETTER) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCssDslParser.g:2139:2: ( RULE_ONE_INT )
                    {
                    // InternalCssDslParser.g:2139:2: ( RULE_ONE_INT )
                    // InternalCssDslParser.g:2140:3: RULE_ONE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0()); 
                    }
                    match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2145:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2145:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2146:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Alternatives_1_10_1"


    // $ANTLR start "rule__ValidURL__Alternatives_1_10_2"
    // InternalCssDslParser.g:2155:1: rule__ValidURL__Alternatives_1_10_2 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
    public final void rule__ValidURL__Alternatives_1_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2159:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ONE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ONE_HEX_LETTER) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCssDslParser.g:2160:2: ( RULE_ONE_INT )
                    {
                    // InternalCssDslParser.g:2160:2: ( RULE_ONE_INT )
                    // InternalCssDslParser.g:2161:3: RULE_ONE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0()); 
                    }
                    match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_INTTerminalRuleCall_1_10_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2166:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2166:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2167:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValidURLAccess().getONE_HEX_LETTERTerminalRuleCall_1_10_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Alternatives_1_10_2"


    // $ANTLR start "rule__Identifier__Alternatives_1"
    // InternalCssDslParser.g:2176:1: rule__Identifier__Alternatives_1 : ( ( RULE_UNDERSCORE ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( ruleKeywordHack ) );
    public final void rule__Identifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2180:1: ( ( RULE_UNDERSCORE ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( ruleKeywordHack ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt28=1;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt28=2;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt28=3;
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalCssDslParser.g:2181:2: ( RULE_UNDERSCORE )
                    {
                    // InternalCssDslParser.g:2181:2: ( RULE_UNDERSCORE )
                    // InternalCssDslParser.g:2182:3: RULE_UNDERSCORE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2187:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2187:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2188:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2193:2: ( RULE_ONE_NON_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2193:2: ( RULE_ONE_NON_HEX_LETTER )
                    // InternalCssDslParser.g:2194:3: RULE_ONE_NON_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:2199:2: ( ruleKeywordHack )
                    {
                    // InternalCssDslParser.g:2199:2: ( ruleKeywordHack )
                    // InternalCssDslParser.g:2200:3: ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_1_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Alternatives_1"


    // $ANTLR start "rule__Identifier__Alternatives_2_0"
    // InternalCssDslParser.g:2209:1: rule__Identifier__Alternatives_2_0 : ( ( RULE_UNDERSCORE ) | ( RULE_DASH ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ruleKeywordHack ) );
    public final void rule__Identifier__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2213:1: ( ( RULE_UNDERSCORE ) | ( RULE_DASH ) | ( RULE_ONE_HEX_LETTER ) | ( RULE_ONE_NON_HEX_LETTER ) | ( RULE_ONE_INT ) | ( ruleKeywordHack ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case RULE_UNDERSCORE:
                {
                alt29=1;
                }
                break;
            case RULE_DASH:
                {
                alt29=2;
                }
                break;
            case RULE_ONE_HEX_LETTER:
                {
                alt29=3;
                }
                break;
            case RULE_ONE_NON_HEX_LETTER:
                {
                alt29=4;
                }
                break;
            case RULE_ONE_INT:
                {
                alt29=5;
                }
                break;
            case Not:
            case Url:
            case No:
            case Ur:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalCssDslParser.g:2214:2: ( RULE_UNDERSCORE )
                    {
                    // InternalCssDslParser.g:2214:2: ( RULE_UNDERSCORE )
                    // InternalCssDslParser.g:2215:3: RULE_UNDERSCORE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_UNDERSCORE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2220:2: ( RULE_DASH )
                    {
                    // InternalCssDslParser.g:2220:2: ( RULE_DASH )
                    // InternalCssDslParser.g:2221:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssDslParser.g:2226:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2226:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2227:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getONE_HEX_LETTERTerminalRuleCall_2_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssDslParser.g:2232:2: ( RULE_ONE_NON_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2232:2: ( RULE_ONE_NON_HEX_LETTER )
                    // InternalCssDslParser.g:2233:3: RULE_ONE_NON_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3()); 
                    }
                    match(input,RULE_ONE_NON_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getONE_NON_HEX_LETTERTerminalRuleCall_2_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssDslParser.g:2238:2: ( RULE_ONE_INT )
                    {
                    // InternalCssDslParser.g:2238:2: ( RULE_ONE_INT )
                    // InternalCssDslParser.g:2239:3: RULE_ONE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4()); 
                    }
                    match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getONE_INTTerminalRuleCall_2_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssDslParser.g:2244:2: ( ruleKeywordHack )
                    {
                    // InternalCssDslParser.g:2244:2: ( ruleKeywordHack )
                    // InternalCssDslParser.g:2245:3: ruleKeywordHack
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKeywordHack();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getKeywordHackParserRuleCall_2_0_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Alternatives_2_0"


    // $ANTLR start "rule__Num__Alternatives_0"
    // InternalCssDslParser.g:2254:1: rule__Num__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Num__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2258:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_PLUS) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_DASH) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCssDslParser.g:2259:2: ( RULE_PLUS )
                    {
                    // InternalCssDslParser.g:2259:2: ( RULE_PLUS )
                    // InternalCssDslParser.g:2260:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_PLUS,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumAccess().getPLUSTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2265:2: ( RULE_DASH )
                    {
                    // InternalCssDslParser.g:2265:2: ( RULE_DASH )
                    // InternalCssDslParser.g:2266:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumAccess().getDASHTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Alternatives_0"


    // $ANTLR start "rule__Num__Alternatives_1"
    // InternalCssDslParser.g:2275:1: rule__Num__Alternatives_1 : ( ( ( rule__Num__Group_1_0__0 ) ) | ( ( rule__Num__Group_1_1__0 ) ) );
    public final void rule__Num__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2279:1: ( ( ( rule__Num__Group_1_0__0 ) ) | ( ( rule__Num__Group_1_1__0 ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FullStop) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ONE_INT) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCssDslParser.g:2280:2: ( ( rule__Num__Group_1_0__0 ) )
                    {
                    // InternalCssDslParser.g:2280:2: ( ( rule__Num__Group_1_0__0 ) )
                    // InternalCssDslParser.g:2281:3: ( rule__Num__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumAccess().getGroup_1_0()); 
                    }
                    // InternalCssDslParser.g:2282:3: ( rule__Num__Group_1_0__0 )
                    // InternalCssDslParser.g:2282:4: rule__Num__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2286:2: ( ( rule__Num__Group_1_1__0 ) )
                    {
                    // InternalCssDslParser.g:2286:2: ( ( rule__Num__Group_1_1__0 ) )
                    // InternalCssDslParser.g:2287:3: ( rule__Num__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumAccess().getGroup_1_1()); 
                    }
                    // InternalCssDslParser.g:2288:3: ( rule__Num__Group_1_1__0 )
                    // InternalCssDslParser.g:2288:4: rule__Num__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Alternatives_1"


    // $ANTLR start "rule__Hex__Alternatives_1_0"
    // InternalCssDslParser.g:2296:1: rule__Hex__Alternatives_1_0 : ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) );
    public final void rule__Hex__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2300:1: ( ( RULE_ONE_INT ) | ( RULE_ONE_HEX_LETTER ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ONE_INT) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ONE_HEX_LETTER) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCssDslParser.g:2301:2: ( RULE_ONE_INT )
                    {
                    // InternalCssDslParser.g:2301:2: ( RULE_ONE_INT )
                    // InternalCssDslParser.g:2302:3: RULE_ONE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHexAccess().getONE_INTTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssDslParser.g:2307:2: ( RULE_ONE_HEX_LETTER )
                    {
                    // InternalCssDslParser.g:2307:2: ( RULE_ONE_HEX_LETTER )
                    // InternalCssDslParser.g:2308:3: RULE_ONE_HEX_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_ONE_HEX_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHexAccess().getONE_HEX_LETTERTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Alternatives_1_0"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // InternalCssDslParser.g:2317:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2321:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // InternalCssDslParser.g:2322:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0"


    // $ANTLR start "rule__Stylesheet__Group__0__Impl"
    // InternalCssDslParser.g:2329:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__CharsetAssignment_0 )? ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2333:1: ( ( ( rule__Stylesheet__CharsetAssignment_0 )? ) )
            // InternalCssDslParser.g:2334:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            {
            // InternalCssDslParser.g:2334:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            // InternalCssDslParser.g:2335:2: ( rule__Stylesheet__CharsetAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
            }
            // InternalCssDslParser.g:2336:2: ( rule__Stylesheet__CharsetAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Charset) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCssDslParser.g:2336:3: rule__Stylesheet__CharsetAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stylesheet__CharsetAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // InternalCssDslParser.g:2344:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2348:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
            // InternalCssDslParser.g:2349:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Stylesheet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1"


    // $ANTLR start "rule__Stylesheet__Group__1__Impl"
    // InternalCssDslParser.g:2356:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportsAssignment_1 )* ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2360:1: ( ( ( rule__Stylesheet__ImportsAssignment_1 )* ) )
            // InternalCssDslParser.g:2361:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            {
            // InternalCssDslParser.g:2361:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            // InternalCssDslParser.g:2362:2: ( rule__Stylesheet__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
            }
            // InternalCssDslParser.g:2363:2: ( rule__Stylesheet__ImportsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Import) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCssDslParser.g:2363:3: rule__Stylesheet__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Stylesheet__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__Group__2"
    // InternalCssDslParser.g:2371:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
    public final void rule__Stylesheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2375:1: ( rule__Stylesheet__Group__2__Impl )
            // InternalCssDslParser.g:2376:2: rule__Stylesheet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2"


    // $ANTLR start "rule__Stylesheet__Group__2__Impl"
    // InternalCssDslParser.g:2382:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Alternatives_2 )* ) ;
    public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2386:1: ( ( ( rule__Stylesheet__Alternatives_2 )* ) )
            // InternalCssDslParser.g:2387:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            {
            // InternalCssDslParser.g:2387:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            // InternalCssDslParser.g:2388:2: ( rule__Stylesheet__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
            }
            // InternalCssDslParser.g:2389:2: ( rule__Stylesheet__Alternatives_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=FontFace && LA35_0<=Keyframes)||(LA35_0>=Media && LA35_0<=Page)||(LA35_0>=Not && LA35_0<=Url)||(LA35_0>=No && LA35_0<=Ur)||(LA35_0>=Asterisk && LA35_0<=FullStop)||LA35_0==LeftSquareBracket||LA35_0==VerticalLine||(LA35_0>=RULE_ONE_HEX_LETTER && LA35_0<=RULE_DASH)||LA35_0==RULE_HASHMARK||LA35_0==RULE_COLON) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCssDslParser.g:2389:3: rule__Stylesheet__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Stylesheet__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Group__2__Impl"


    // $ANTLR start "rule__CharsetRule__Group__0"
    // InternalCssDslParser.g:2398:1: rule__CharsetRule__Group__0 : rule__CharsetRule__Group__0__Impl rule__CharsetRule__Group__1 ;
    public final void rule__CharsetRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2402:1: ( rule__CharsetRule__Group__0__Impl rule__CharsetRule__Group__1 )
            // InternalCssDslParser.g:2403:2: rule__CharsetRule__Group__0__Impl rule__CharsetRule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CharsetRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CharsetRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__0"


    // $ANTLR start "rule__CharsetRule__Group__0__Impl"
    // InternalCssDslParser.g:2410:1: rule__CharsetRule__Group__0__Impl : ( Charset ) ;
    public final void rule__CharsetRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2414:1: ( ( Charset ) )
            // InternalCssDslParser.g:2415:1: ( Charset )
            {
            // InternalCssDslParser.g:2415:1: ( Charset )
            // InternalCssDslParser.g:2416:2: Charset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleAccess().getCharsetKeyword_0()); 
            }
            match(input,Charset,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleAccess().getCharsetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__0__Impl"


    // $ANTLR start "rule__CharsetRule__Group__1"
    // InternalCssDslParser.g:2425:1: rule__CharsetRule__Group__1 : rule__CharsetRule__Group__1__Impl rule__CharsetRule__Group__2 ;
    public final void rule__CharsetRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2429:1: ( rule__CharsetRule__Group__1__Impl rule__CharsetRule__Group__2 )
            // InternalCssDslParser.g:2430:2: rule__CharsetRule__Group__1__Impl rule__CharsetRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CharsetRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CharsetRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__1"


    // $ANTLR start "rule__CharsetRule__Group__1__Impl"
    // InternalCssDslParser.g:2437:1: rule__CharsetRule__Group__1__Impl : ( ( rule__CharsetRule__CharsetAssignment_1 ) ) ;
    public final void rule__CharsetRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2441:1: ( ( ( rule__CharsetRule__CharsetAssignment_1 ) ) )
            // InternalCssDslParser.g:2442:1: ( ( rule__CharsetRule__CharsetAssignment_1 ) )
            {
            // InternalCssDslParser.g:2442:1: ( ( rule__CharsetRule__CharsetAssignment_1 ) )
            // InternalCssDslParser.g:2443:2: ( rule__CharsetRule__CharsetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleAccess().getCharsetAssignment_1()); 
            }
            // InternalCssDslParser.g:2444:2: ( rule__CharsetRule__CharsetAssignment_1 )
            // InternalCssDslParser.g:2444:3: rule__CharsetRule__CharsetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharsetRule__CharsetAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleAccess().getCharsetAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__1__Impl"


    // $ANTLR start "rule__CharsetRule__Group__2"
    // InternalCssDslParser.g:2452:1: rule__CharsetRule__Group__2 : rule__CharsetRule__Group__2__Impl ;
    public final void rule__CharsetRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2456:1: ( rule__CharsetRule__Group__2__Impl )
            // InternalCssDslParser.g:2457:2: rule__CharsetRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharsetRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__2"


    // $ANTLR start "rule__CharsetRule__Group__2__Impl"
    // InternalCssDslParser.g:2463:1: rule__CharsetRule__Group__2__Impl : ( Semicolon ) ;
    public final void rule__CharsetRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2467:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:2468:1: ( Semicolon )
            {
            // InternalCssDslParser.g:2468:1: ( Semicolon )
            // InternalCssDslParser.g:2469:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__Group__2__Impl"


    // $ANTLR start "rule__ImportRule__Group__0"
    // InternalCssDslParser.g:2479:1: rule__ImportRule__Group__0 : rule__ImportRule__Group__0__Impl rule__ImportRule__Group__1 ;
    public final void rule__ImportRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2483:1: ( rule__ImportRule__Group__0__Impl rule__ImportRule__Group__1 )
            // InternalCssDslParser.g:2484:2: rule__ImportRule__Group__0__Impl rule__ImportRule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ImportRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__0"


    // $ANTLR start "rule__ImportRule__Group__0__Impl"
    // InternalCssDslParser.g:2491:1: rule__ImportRule__Group__0__Impl : ( Import ) ;
    public final void rule__ImportRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2495:1: ( ( Import ) )
            // InternalCssDslParser.g:2496:1: ( Import )
            {
            // InternalCssDslParser.g:2496:1: ( Import )
            // InternalCssDslParser.g:2497:2: Import
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getImportKeyword_0()); 
            }
            match(input,Import,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__0__Impl"


    // $ANTLR start "rule__ImportRule__Group__1"
    // InternalCssDslParser.g:2506:1: rule__ImportRule__Group__1 : rule__ImportRule__Group__1__Impl rule__ImportRule__Group__2 ;
    public final void rule__ImportRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2510:1: ( rule__ImportRule__Group__1__Impl rule__ImportRule__Group__2 )
            // InternalCssDslParser.g:2511:2: rule__ImportRule__Group__1__Impl rule__ImportRule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ImportRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__1"


    // $ANTLR start "rule__ImportRule__Group__1__Impl"
    // InternalCssDslParser.g:2518:1: rule__ImportRule__Group__1__Impl : ( ( rule__ImportRule__Alternatives_1 ) ) ;
    public final void rule__ImportRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2522:1: ( ( ( rule__ImportRule__Alternatives_1 ) ) )
            // InternalCssDslParser.g:2523:1: ( ( rule__ImportRule__Alternatives_1 ) )
            {
            // InternalCssDslParser.g:2523:1: ( ( rule__ImportRule__Alternatives_1 ) )
            // InternalCssDslParser.g:2524:2: ( rule__ImportRule__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getAlternatives_1()); 
            }
            // InternalCssDslParser.g:2525:2: ( rule__ImportRule__Alternatives_1 )
            // InternalCssDslParser.g:2525:3: rule__ImportRule__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportRule__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__1__Impl"


    // $ANTLR start "rule__ImportRule__Group__2"
    // InternalCssDslParser.g:2533:1: rule__ImportRule__Group__2 : rule__ImportRule__Group__2__Impl ;
    public final void rule__ImportRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2537:1: ( rule__ImportRule__Group__2__Impl )
            // InternalCssDslParser.g:2538:2: rule__ImportRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__2"


    // $ANTLR start "rule__ImportRule__Group__2__Impl"
    // InternalCssDslParser.g:2544:1: rule__ImportRule__Group__2__Impl : ( Semicolon ) ;
    public final void rule__ImportRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2548:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:2549:1: ( Semicolon )
            {
            // InternalCssDslParser.g:2549:1: ( Semicolon )
            // InternalCssDslParser.g:2550:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getSemicolonKeyword_2()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group__2__Impl"


    // $ANTLR start "rule__ImportRule__Group_1_1__0"
    // InternalCssDslParser.g:2560:1: rule__ImportRule__Group_1_1__0 : rule__ImportRule__Group_1_1__0__Impl rule__ImportRule__Group_1_1__1 ;
    public final void rule__ImportRule__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2564:1: ( rule__ImportRule__Group_1_1__0__Impl rule__ImportRule__Group_1_1__1 )
            // InternalCssDslParser.g:2565:2: rule__ImportRule__Group_1_1__0__Impl rule__ImportRule__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ImportRule__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group_1_1__0"


    // $ANTLR start "rule__ImportRule__Group_1_1__0__Impl"
    // InternalCssDslParser.g:2572:1: rule__ImportRule__Group_1_1__0__Impl : ( ruleURLType ) ;
    public final void rule__ImportRule__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2576:1: ( ( ruleURLType ) )
            // InternalCssDslParser.g:2577:1: ( ruleURLType )
            {
            // InternalCssDslParser.g:2577:1: ( ruleURLType )
            // InternalCssDslParser.g:2578:2: ruleURLType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getURLTypeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getURLTypeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group_1_1__0__Impl"


    // $ANTLR start "rule__ImportRule__Group_1_1__1"
    // InternalCssDslParser.g:2587:1: rule__ImportRule__Group_1_1__1 : rule__ImportRule__Group_1_1__1__Impl ;
    public final void rule__ImportRule__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2591:1: ( rule__ImportRule__Group_1_1__1__Impl )
            // InternalCssDslParser.g:2592:2: rule__ImportRule__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportRule__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group_1_1__1"


    // $ANTLR start "rule__ImportRule__Group_1_1__1__Impl"
    // InternalCssDslParser.g:2598:1: rule__ImportRule__Group_1_1__1__Impl : ( ( rule__ImportRule__MediaListAssignment_1_1_1 )? ) ;
    public final void rule__ImportRule__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2602:1: ( ( ( rule__ImportRule__MediaListAssignment_1_1_1 )? ) )
            // InternalCssDslParser.g:2603:1: ( ( rule__ImportRule__MediaListAssignment_1_1_1 )? )
            {
            // InternalCssDslParser.g:2603:1: ( ( rule__ImportRule__MediaListAssignment_1_1_1 )? )
            // InternalCssDslParser.g:2604:2: ( rule__ImportRule__MediaListAssignment_1_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getMediaListAssignment_1_1_1()); 
            }
            // InternalCssDslParser.g:2605:2: ( rule__ImportRule__MediaListAssignment_1_1_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=Not && LA36_0<=Url)||(LA36_0>=No && LA36_0<=Ur)||(LA36_0>=RULE_ONE_HEX_LETTER && LA36_0<=RULE_DASH)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCssDslParser.g:2605:3: rule__ImportRule__MediaListAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportRule__MediaListAssignment_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getMediaListAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__Group_1_1__1__Impl"


    // $ANTLR start "rule__PageRule__Group__0"
    // InternalCssDslParser.g:2614:1: rule__PageRule__Group__0 : rule__PageRule__Group__0__Impl rule__PageRule__Group__1 ;
    public final void rule__PageRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2618:1: ( rule__PageRule__Group__0__Impl rule__PageRule__Group__1 )
            // InternalCssDslParser.g:2619:2: rule__PageRule__Group__0__Impl rule__PageRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PageRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__0"


    // $ANTLR start "rule__PageRule__Group__0__Impl"
    // InternalCssDslParser.g:2626:1: rule__PageRule__Group__0__Impl : ( () ) ;
    public final void rule__PageRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2630:1: ( ( () ) )
            // InternalCssDslParser.g:2631:1: ( () )
            {
            // InternalCssDslParser.g:2631:1: ( () )
            // InternalCssDslParser.g:2632:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getPageRuleAction_0()); 
            }
            // InternalCssDslParser.g:2633:2: ()
            // InternalCssDslParser.g:2633:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getPageRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__0__Impl"


    // $ANTLR start "rule__PageRule__Group__1"
    // InternalCssDslParser.g:2641:1: rule__PageRule__Group__1 : rule__PageRule__Group__1__Impl rule__PageRule__Group__2 ;
    public final void rule__PageRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2645:1: ( rule__PageRule__Group__1__Impl rule__PageRule__Group__2 )
            // InternalCssDslParser.g:2646:2: rule__PageRule__Group__1__Impl rule__PageRule__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PageRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__1"


    // $ANTLR start "rule__PageRule__Group__1__Impl"
    // InternalCssDslParser.g:2653:1: rule__PageRule__Group__1__Impl : ( Page ) ;
    public final void rule__PageRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2657:1: ( ( Page ) )
            // InternalCssDslParser.g:2658:1: ( Page )
            {
            // InternalCssDslParser.g:2658:1: ( Page )
            // InternalCssDslParser.g:2659:2: Page
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getPageKeyword_1()); 
            }
            match(input,Page,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getPageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__1__Impl"


    // $ANTLR start "rule__PageRule__Group__2"
    // InternalCssDslParser.g:2668:1: rule__PageRule__Group__2 : rule__PageRule__Group__2__Impl rule__PageRule__Group__3 ;
    public final void rule__PageRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2672:1: ( rule__PageRule__Group__2__Impl rule__PageRule__Group__3 )
            // InternalCssDslParser.g:2673:2: rule__PageRule__Group__2__Impl rule__PageRule__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PageRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__2"


    // $ANTLR start "rule__PageRule__Group__2__Impl"
    // InternalCssDslParser.g:2680:1: rule__PageRule__Group__2__Impl : ( ( rule__PageRule__PseudoPageAssignment_2 )? ) ;
    public final void rule__PageRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2684:1: ( ( ( rule__PageRule__PseudoPageAssignment_2 )? ) )
            // InternalCssDslParser.g:2685:1: ( ( rule__PageRule__PseudoPageAssignment_2 )? )
            {
            // InternalCssDslParser.g:2685:1: ( ( rule__PageRule__PseudoPageAssignment_2 )? )
            // InternalCssDslParser.g:2686:2: ( rule__PageRule__PseudoPageAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getPseudoPageAssignment_2()); 
            }
            // InternalCssDslParser.g:2687:2: ( rule__PageRule__PseudoPageAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_COLON) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCssDslParser.g:2687:3: rule__PageRule__PseudoPageAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageRule__PseudoPageAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getPseudoPageAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__2__Impl"


    // $ANTLR start "rule__PageRule__Group__3"
    // InternalCssDslParser.g:2695:1: rule__PageRule__Group__3 : rule__PageRule__Group__3__Impl rule__PageRule__Group__4 ;
    public final void rule__PageRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2699:1: ( rule__PageRule__Group__3__Impl rule__PageRule__Group__4 )
            // InternalCssDslParser.g:2700:2: rule__PageRule__Group__3__Impl rule__PageRule__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PageRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__3"


    // $ANTLR start "rule__PageRule__Group__3__Impl"
    // InternalCssDslParser.g:2707:1: rule__PageRule__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__PageRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2711:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:2712:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:2712:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:2713:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__3__Impl"


    // $ANTLR start "rule__PageRule__Group__4"
    // InternalCssDslParser.g:2722:1: rule__PageRule__Group__4 : rule__PageRule__Group__4__Impl rule__PageRule__Group__5 ;
    public final void rule__PageRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2726:1: ( rule__PageRule__Group__4__Impl rule__PageRule__Group__5 )
            // InternalCssDslParser.g:2727:2: rule__PageRule__Group__4__Impl rule__PageRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__PageRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__4"


    // $ANTLR start "rule__PageRule__Group__4__Impl"
    // InternalCssDslParser.g:2734:1: rule__PageRule__Group__4__Impl : ( ( rule__PageRule__DeclarationsAssignment_4 )? ) ;
    public final void rule__PageRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2738:1: ( ( ( rule__PageRule__DeclarationsAssignment_4 )? ) )
            // InternalCssDslParser.g:2739:1: ( ( rule__PageRule__DeclarationsAssignment_4 )? )
            {
            // InternalCssDslParser.g:2739:1: ( ( rule__PageRule__DeclarationsAssignment_4 )? )
            // InternalCssDslParser.g:2740:2: ( rule__PageRule__DeclarationsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getDeclarationsAssignment_4()); 
            }
            // InternalCssDslParser.g:2741:2: ( rule__PageRule__DeclarationsAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=Not && LA38_0<=Url)||(LA38_0>=No && LA38_0<=Ur)||(LA38_0>=RULE_ONE_HEX_LETTER && LA38_0<=RULE_DASH)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCssDslParser.g:2741:3: rule__PageRule__DeclarationsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageRule__DeclarationsAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getDeclarationsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__4__Impl"


    // $ANTLR start "rule__PageRule__Group__5"
    // InternalCssDslParser.g:2749:1: rule__PageRule__Group__5 : rule__PageRule__Group__5__Impl rule__PageRule__Group__6 ;
    public final void rule__PageRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2753:1: ( rule__PageRule__Group__5__Impl rule__PageRule__Group__6 )
            // InternalCssDslParser.g:2754:2: rule__PageRule__Group__5__Impl rule__PageRule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PageRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__5"


    // $ANTLR start "rule__PageRule__Group__5__Impl"
    // InternalCssDslParser.g:2761:1: rule__PageRule__Group__5__Impl : ( ( rule__PageRule__Group_5__0 )* ) ;
    public final void rule__PageRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2765:1: ( ( ( rule__PageRule__Group_5__0 )* ) )
            // InternalCssDslParser.g:2766:1: ( ( rule__PageRule__Group_5__0 )* )
            {
            // InternalCssDslParser.g:2766:1: ( ( rule__PageRule__Group_5__0 )* )
            // InternalCssDslParser.g:2767:2: ( rule__PageRule__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getGroup_5()); 
            }
            // InternalCssDslParser.g:2768:2: ( rule__PageRule__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Semicolon) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalCssDslParser.g:2768:3: rule__PageRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PageRule__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__5__Impl"


    // $ANTLR start "rule__PageRule__Group__6"
    // InternalCssDslParser.g:2776:1: rule__PageRule__Group__6 : rule__PageRule__Group__6__Impl ;
    public final void rule__PageRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2780:1: ( rule__PageRule__Group__6__Impl )
            // InternalCssDslParser.g:2781:2: rule__PageRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__6"


    // $ANTLR start "rule__PageRule__Group__6__Impl"
    // InternalCssDslParser.g:2787:1: rule__PageRule__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__PageRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2791:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:2792:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:2792:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:2793:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group__6__Impl"


    // $ANTLR start "rule__PageRule__Group_5__0"
    // InternalCssDslParser.g:2803:1: rule__PageRule__Group_5__0 : rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1 ;
    public final void rule__PageRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2807:1: ( rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1 )
            // InternalCssDslParser.g:2808:2: rule__PageRule__Group_5__0__Impl rule__PageRule__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__PageRule__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PageRule__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__0"


    // $ANTLR start "rule__PageRule__Group_5__0__Impl"
    // InternalCssDslParser.g:2815:1: rule__PageRule__Group_5__0__Impl : ( Semicolon ) ;
    public final void rule__PageRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2819:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:2820:1: ( Semicolon )
            {
            // InternalCssDslParser.g:2820:1: ( Semicolon )
            // InternalCssDslParser.g:2821:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getSemicolonKeyword_5_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getSemicolonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__0__Impl"


    // $ANTLR start "rule__PageRule__Group_5__1"
    // InternalCssDslParser.g:2830:1: rule__PageRule__Group_5__1 : rule__PageRule__Group_5__1__Impl ;
    public final void rule__PageRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2834:1: ( rule__PageRule__Group_5__1__Impl )
            // InternalCssDslParser.g:2835:2: rule__PageRule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageRule__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__1"


    // $ANTLR start "rule__PageRule__Group_5__1__Impl"
    // InternalCssDslParser.g:2841:1: rule__PageRule__Group_5__1__Impl : ( ( rule__PageRule__DeclarationsAssignment_5_1 )? ) ;
    public final void rule__PageRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2845:1: ( ( ( rule__PageRule__DeclarationsAssignment_5_1 )? ) )
            // InternalCssDslParser.g:2846:1: ( ( rule__PageRule__DeclarationsAssignment_5_1 )? )
            {
            // InternalCssDslParser.g:2846:1: ( ( rule__PageRule__DeclarationsAssignment_5_1 )? )
            // InternalCssDslParser.g:2847:2: ( rule__PageRule__DeclarationsAssignment_5_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getDeclarationsAssignment_5_1()); 
            }
            // InternalCssDslParser.g:2848:2: ( rule__PageRule__DeclarationsAssignment_5_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=Not && LA40_0<=Url)||(LA40_0>=No && LA40_0<=Ur)||(LA40_0>=RULE_ONE_HEX_LETTER && LA40_0<=RULE_DASH)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCssDslParser.g:2848:3: rule__PageRule__DeclarationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageRule__DeclarationsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getDeclarationsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__Group_5__1__Impl"


    // $ANTLR start "rule__PseudoPage__Group__0"
    // InternalCssDslParser.g:2857:1: rule__PseudoPage__Group__0 : rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1 ;
    public final void rule__PseudoPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2861:1: ( rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1 )
            // InternalCssDslParser.g:2862:2: rule__PseudoPage__Group__0__Impl rule__PseudoPage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PseudoPage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoPage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoPage__Group__0"


    // $ANTLR start "rule__PseudoPage__Group__0__Impl"
    // InternalCssDslParser.g:2869:1: rule__PseudoPage__Group__0__Impl : ( RULE_COLON ) ;
    public final void rule__PseudoPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2873:1: ( ( RULE_COLON ) )
            // InternalCssDslParser.g:2874:1: ( RULE_COLON )
            {
            // InternalCssDslParser.g:2874:1: ( RULE_COLON )
            // InternalCssDslParser.g:2875:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoPageAccess().getCOLONTerminalRuleCall_0()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoPageAccess().getCOLONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoPage__Group__0__Impl"


    // $ANTLR start "rule__PseudoPage__Group__1"
    // InternalCssDslParser.g:2884:1: rule__PseudoPage__Group__1 : rule__PseudoPage__Group__1__Impl ;
    public final void rule__PseudoPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2888:1: ( rule__PseudoPage__Group__1__Impl )
            // InternalCssDslParser.g:2889:2: rule__PseudoPage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoPage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoPage__Group__1"


    // $ANTLR start "rule__PseudoPage__Group__1__Impl"
    // InternalCssDslParser.g:2895:1: rule__PseudoPage__Group__1__Impl : ( ruleIdentifier ) ;
    public final void rule__PseudoPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2899:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:2900:1: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:2900:1: ( ruleIdentifier )
            // InternalCssDslParser.g:2901:2: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoPageAccess().getIdentifierParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoPageAccess().getIdentifierParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoPage__Group__1__Impl"


    // $ANTLR start "rule__MediaRule__Group__0"
    // InternalCssDslParser.g:2911:1: rule__MediaRule__Group__0 : rule__MediaRule__Group__0__Impl rule__MediaRule__Group__1 ;
    public final void rule__MediaRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2915:1: ( rule__MediaRule__Group__0__Impl rule__MediaRule__Group__1 )
            // InternalCssDslParser.g:2916:2: rule__MediaRule__Group__0__Impl rule__MediaRule__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MediaRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__0"


    // $ANTLR start "rule__MediaRule__Group__0__Impl"
    // InternalCssDslParser.g:2923:1: rule__MediaRule__Group__0__Impl : ( Media ) ;
    public final void rule__MediaRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2927:1: ( ( Media ) )
            // InternalCssDslParser.g:2928:1: ( Media )
            {
            // InternalCssDslParser.g:2928:1: ( Media )
            // InternalCssDslParser.g:2929:2: Media
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getMediaKeyword_0()); 
            }
            match(input,Media,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getMediaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__0__Impl"


    // $ANTLR start "rule__MediaRule__Group__1"
    // InternalCssDslParser.g:2938:1: rule__MediaRule__Group__1 : rule__MediaRule__Group__1__Impl rule__MediaRule__Group__2 ;
    public final void rule__MediaRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2942:1: ( rule__MediaRule__Group__1__Impl rule__MediaRule__Group__2 )
            // InternalCssDslParser.g:2943:2: rule__MediaRule__Group__1__Impl rule__MediaRule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MediaRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__1"


    // $ANTLR start "rule__MediaRule__Group__1__Impl"
    // InternalCssDslParser.g:2950:1: rule__MediaRule__Group__1__Impl : ( ( rule__MediaRule__MedialistAssignment_1 ) ) ;
    public final void rule__MediaRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2954:1: ( ( ( rule__MediaRule__MedialistAssignment_1 ) ) )
            // InternalCssDslParser.g:2955:1: ( ( rule__MediaRule__MedialistAssignment_1 ) )
            {
            // InternalCssDslParser.g:2955:1: ( ( rule__MediaRule__MedialistAssignment_1 ) )
            // InternalCssDslParser.g:2956:2: ( rule__MediaRule__MedialistAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getMedialistAssignment_1()); 
            }
            // InternalCssDslParser.g:2957:2: ( rule__MediaRule__MedialistAssignment_1 )
            // InternalCssDslParser.g:2957:3: rule__MediaRule__MedialistAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MediaRule__MedialistAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getMedialistAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__1__Impl"


    // $ANTLR start "rule__MediaRule__Group__2"
    // InternalCssDslParser.g:2965:1: rule__MediaRule__Group__2 : rule__MediaRule__Group__2__Impl rule__MediaRule__Group__3 ;
    public final void rule__MediaRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2969:1: ( rule__MediaRule__Group__2__Impl rule__MediaRule__Group__3 )
            // InternalCssDslParser.g:2970:2: rule__MediaRule__Group__2__Impl rule__MediaRule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MediaRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__2"


    // $ANTLR start "rule__MediaRule__Group__2__Impl"
    // InternalCssDslParser.g:2977:1: rule__MediaRule__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__MediaRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2981:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:2982:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:2982:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:2983:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__2__Impl"


    // $ANTLR start "rule__MediaRule__Group__3"
    // InternalCssDslParser.g:2992:1: rule__MediaRule__Group__3 : rule__MediaRule__Group__3__Impl rule__MediaRule__Group__4 ;
    public final void rule__MediaRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:2996:1: ( rule__MediaRule__Group__3__Impl rule__MediaRule__Group__4 )
            // InternalCssDslParser.g:2997:2: rule__MediaRule__Group__3__Impl rule__MediaRule__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__MediaRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__3"


    // $ANTLR start "rule__MediaRule__Group__3__Impl"
    // InternalCssDslParser.g:3004:1: rule__MediaRule__Group__3__Impl : ( ( rule__MediaRule__RulesetsAssignment_3 )* ) ;
    public final void rule__MediaRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3008:1: ( ( ( rule__MediaRule__RulesetsAssignment_3 )* ) )
            // InternalCssDslParser.g:3009:1: ( ( rule__MediaRule__RulesetsAssignment_3 )* )
            {
            // InternalCssDslParser.g:3009:1: ( ( rule__MediaRule__RulesetsAssignment_3 )* )
            // InternalCssDslParser.g:3010:2: ( rule__MediaRule__RulesetsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getRulesetsAssignment_3()); 
            }
            // InternalCssDslParser.g:3011:2: ( rule__MediaRule__RulesetsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=Not && LA41_0<=Url)||(LA41_0>=No && LA41_0<=Ur)||(LA41_0>=Asterisk && LA41_0<=FullStop)||LA41_0==LeftSquareBracket||LA41_0==VerticalLine||(LA41_0>=RULE_ONE_HEX_LETTER && LA41_0<=RULE_DASH)||LA41_0==RULE_HASHMARK||LA41_0==RULE_COLON) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCssDslParser.g:3011:3: rule__MediaRule__RulesetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MediaRule__RulesetsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getRulesetsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__3__Impl"


    // $ANTLR start "rule__MediaRule__Group__4"
    // InternalCssDslParser.g:3019:1: rule__MediaRule__Group__4 : rule__MediaRule__Group__4__Impl ;
    public final void rule__MediaRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3023:1: ( rule__MediaRule__Group__4__Impl )
            // InternalCssDslParser.g:3024:2: rule__MediaRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MediaRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__4"


    // $ANTLR start "rule__MediaRule__Group__4__Impl"
    // InternalCssDslParser.g:3030:1: rule__MediaRule__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__MediaRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3034:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:3035:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:3035:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:3036:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__Group__4__Impl"


    // $ANTLR start "rule__MediaList__Group__0"
    // InternalCssDslParser.g:3046:1: rule__MediaList__Group__0 : rule__MediaList__Group__0__Impl rule__MediaList__Group__1 ;
    public final void rule__MediaList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3050:1: ( rule__MediaList__Group__0__Impl rule__MediaList__Group__1 )
            // InternalCssDslParser.g:3051:2: rule__MediaList__Group__0__Impl rule__MediaList__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MediaList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group__0"


    // $ANTLR start "rule__MediaList__Group__0__Impl"
    // InternalCssDslParser.g:3058:1: rule__MediaList__Group__0__Impl : ( ( rule__MediaList__EntryAssignment_0 ) ) ;
    public final void rule__MediaList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3062:1: ( ( ( rule__MediaList__EntryAssignment_0 ) ) )
            // InternalCssDslParser.g:3063:1: ( ( rule__MediaList__EntryAssignment_0 ) )
            {
            // InternalCssDslParser.g:3063:1: ( ( rule__MediaList__EntryAssignment_0 ) )
            // InternalCssDslParser.g:3064:2: ( rule__MediaList__EntryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getEntryAssignment_0()); 
            }
            // InternalCssDslParser.g:3065:2: ( rule__MediaList__EntryAssignment_0 )
            // InternalCssDslParser.g:3065:3: rule__MediaList__EntryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MediaList__EntryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getEntryAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group__0__Impl"


    // $ANTLR start "rule__MediaList__Group__1"
    // InternalCssDslParser.g:3073:1: rule__MediaList__Group__1 : rule__MediaList__Group__1__Impl ;
    public final void rule__MediaList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3077:1: ( rule__MediaList__Group__1__Impl )
            // InternalCssDslParser.g:3078:2: rule__MediaList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MediaList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group__1"


    // $ANTLR start "rule__MediaList__Group__1__Impl"
    // InternalCssDslParser.g:3084:1: rule__MediaList__Group__1__Impl : ( ( rule__MediaList__Group_1__0 )* ) ;
    public final void rule__MediaList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3088:1: ( ( ( rule__MediaList__Group_1__0 )* ) )
            // InternalCssDslParser.g:3089:1: ( ( rule__MediaList__Group_1__0 )* )
            {
            // InternalCssDslParser.g:3089:1: ( ( rule__MediaList__Group_1__0 )* )
            // InternalCssDslParser.g:3090:2: ( rule__MediaList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getGroup_1()); 
            }
            // InternalCssDslParser.g:3091:2: ( rule__MediaList__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCssDslParser.g:3091:3: rule__MediaList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MediaList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group__1__Impl"


    // $ANTLR start "rule__MediaList__Group_1__0"
    // InternalCssDslParser.g:3100:1: rule__MediaList__Group_1__0 : rule__MediaList__Group_1__0__Impl rule__MediaList__Group_1__1 ;
    public final void rule__MediaList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3104:1: ( rule__MediaList__Group_1__0__Impl rule__MediaList__Group_1__1 )
            // InternalCssDslParser.g:3105:2: rule__MediaList__Group_1__0__Impl rule__MediaList__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MediaList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediaList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group_1__0"


    // $ANTLR start "rule__MediaList__Group_1__0__Impl"
    // InternalCssDslParser.g:3112:1: rule__MediaList__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__MediaList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3116:1: ( ( RULE_COMMA ) )
            // InternalCssDslParser.g:3117:1: ( RULE_COMMA )
            {
            // InternalCssDslParser.g:3117:1: ( RULE_COMMA )
            // InternalCssDslParser.g:3118:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getCOMMATerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group_1__0__Impl"


    // $ANTLR start "rule__MediaList__Group_1__1"
    // InternalCssDslParser.g:3127:1: rule__MediaList__Group_1__1 : rule__MediaList__Group_1__1__Impl ;
    public final void rule__MediaList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3131:1: ( rule__MediaList__Group_1__1__Impl )
            // InternalCssDslParser.g:3132:2: rule__MediaList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MediaList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group_1__1"


    // $ANTLR start "rule__MediaList__Group_1__1__Impl"
    // InternalCssDslParser.g:3138:1: rule__MediaList__Group_1__1__Impl : ( ( rule__MediaList__EntryAssignment_1_1 ) ) ;
    public final void rule__MediaList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3142:1: ( ( ( rule__MediaList__EntryAssignment_1_1 ) ) )
            // InternalCssDslParser.g:3143:1: ( ( rule__MediaList__EntryAssignment_1_1 ) )
            {
            // InternalCssDslParser.g:3143:1: ( ( rule__MediaList__EntryAssignment_1_1 ) )
            // InternalCssDslParser.g:3144:2: ( rule__MediaList__EntryAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getEntryAssignment_1_1()); 
            }
            // InternalCssDslParser.g:3145:2: ( rule__MediaList__EntryAssignment_1_1 )
            // InternalCssDslParser.g:3145:3: rule__MediaList__EntryAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MediaList__EntryAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getEntryAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__Group_1__1__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__0"
    // InternalCssDslParser.g:3154:1: rule__FontFaceRule__Group__0 : rule__FontFaceRule__Group__0__Impl rule__FontFaceRule__Group__1 ;
    public final void rule__FontFaceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3158:1: ( rule__FontFaceRule__Group__0__Impl rule__FontFaceRule__Group__1 )
            // InternalCssDslParser.g:3159:2: rule__FontFaceRule__Group__0__Impl rule__FontFaceRule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FontFaceRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__0"


    // $ANTLR start "rule__FontFaceRule__Group__0__Impl"
    // InternalCssDslParser.g:3166:1: rule__FontFaceRule__Group__0__Impl : ( () ) ;
    public final void rule__FontFaceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3170:1: ( ( () ) )
            // InternalCssDslParser.g:3171:1: ( () )
            {
            // InternalCssDslParser.g:3171:1: ( () )
            // InternalCssDslParser.g:3172:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getFontFaceRuleAction_0()); 
            }
            // InternalCssDslParser.g:3173:2: ()
            // InternalCssDslParser.g:3173:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getFontFaceRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__0__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__1"
    // InternalCssDslParser.g:3181:1: rule__FontFaceRule__Group__1 : rule__FontFaceRule__Group__1__Impl rule__FontFaceRule__Group__2 ;
    public final void rule__FontFaceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3185:1: ( rule__FontFaceRule__Group__1__Impl rule__FontFaceRule__Group__2 )
            // InternalCssDslParser.g:3186:2: rule__FontFaceRule__Group__1__Impl rule__FontFaceRule__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FontFaceRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__1"


    // $ANTLR start "rule__FontFaceRule__Group__1__Impl"
    // InternalCssDslParser.g:3193:1: rule__FontFaceRule__Group__1__Impl : ( FontFace ) ;
    public final void rule__FontFaceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3197:1: ( ( FontFace ) )
            // InternalCssDslParser.g:3198:1: ( FontFace )
            {
            // InternalCssDslParser.g:3198:1: ( FontFace )
            // InternalCssDslParser.g:3199:2: FontFace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getFontFaceKeyword_1()); 
            }
            match(input,FontFace,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getFontFaceKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__1__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__2"
    // InternalCssDslParser.g:3208:1: rule__FontFaceRule__Group__2 : rule__FontFaceRule__Group__2__Impl rule__FontFaceRule__Group__3 ;
    public final void rule__FontFaceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3212:1: ( rule__FontFaceRule__Group__2__Impl rule__FontFaceRule__Group__3 )
            // InternalCssDslParser.g:3213:2: rule__FontFaceRule__Group__2__Impl rule__FontFaceRule__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FontFaceRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__2"


    // $ANTLR start "rule__FontFaceRule__Group__2__Impl"
    // InternalCssDslParser.g:3220:1: rule__FontFaceRule__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__FontFaceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3224:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:3225:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:3225:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:3226:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__2__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__3"
    // InternalCssDslParser.g:3235:1: rule__FontFaceRule__Group__3 : rule__FontFaceRule__Group__3__Impl rule__FontFaceRule__Group__4 ;
    public final void rule__FontFaceRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3239:1: ( rule__FontFaceRule__Group__3__Impl rule__FontFaceRule__Group__4 )
            // InternalCssDslParser.g:3240:2: rule__FontFaceRule__Group__3__Impl rule__FontFaceRule__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__FontFaceRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__3"


    // $ANTLR start "rule__FontFaceRule__Group__3__Impl"
    // InternalCssDslParser.g:3247:1: rule__FontFaceRule__Group__3__Impl : ( ( rule__FontFaceRule__DeclarationsAssignment_3 )? ) ;
    public final void rule__FontFaceRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3251:1: ( ( ( rule__FontFaceRule__DeclarationsAssignment_3 )? ) )
            // InternalCssDslParser.g:3252:1: ( ( rule__FontFaceRule__DeclarationsAssignment_3 )? )
            {
            // InternalCssDslParser.g:3252:1: ( ( rule__FontFaceRule__DeclarationsAssignment_3 )? )
            // InternalCssDslParser.g:3253:2: ( rule__FontFaceRule__DeclarationsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getDeclarationsAssignment_3()); 
            }
            // InternalCssDslParser.g:3254:2: ( rule__FontFaceRule__DeclarationsAssignment_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=Not && LA43_0<=Url)||(LA43_0>=No && LA43_0<=Ur)||(LA43_0>=RULE_ONE_HEX_LETTER && LA43_0<=RULE_DASH)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCssDslParser.g:3254:3: rule__FontFaceRule__DeclarationsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FontFaceRule__DeclarationsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getDeclarationsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__3__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__4"
    // InternalCssDslParser.g:3262:1: rule__FontFaceRule__Group__4 : rule__FontFaceRule__Group__4__Impl rule__FontFaceRule__Group__5 ;
    public final void rule__FontFaceRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3266:1: ( rule__FontFaceRule__Group__4__Impl rule__FontFaceRule__Group__5 )
            // InternalCssDslParser.g:3267:2: rule__FontFaceRule__Group__4__Impl rule__FontFaceRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__FontFaceRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__4"


    // $ANTLR start "rule__FontFaceRule__Group__4__Impl"
    // InternalCssDslParser.g:3274:1: rule__FontFaceRule__Group__4__Impl : ( ( rule__FontFaceRule__Group_4__0 )* ) ;
    public final void rule__FontFaceRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3278:1: ( ( ( rule__FontFaceRule__Group_4__0 )* ) )
            // InternalCssDslParser.g:3279:1: ( ( rule__FontFaceRule__Group_4__0 )* )
            {
            // InternalCssDslParser.g:3279:1: ( ( rule__FontFaceRule__Group_4__0 )* )
            // InternalCssDslParser.g:3280:2: ( rule__FontFaceRule__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getGroup_4()); 
            }
            // InternalCssDslParser.g:3281:2: ( rule__FontFaceRule__Group_4__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Semicolon) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalCssDslParser.g:3281:3: rule__FontFaceRule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FontFaceRule__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__4__Impl"


    // $ANTLR start "rule__FontFaceRule__Group__5"
    // InternalCssDslParser.g:3289:1: rule__FontFaceRule__Group__5 : rule__FontFaceRule__Group__5__Impl ;
    public final void rule__FontFaceRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3293:1: ( rule__FontFaceRule__Group__5__Impl )
            // InternalCssDslParser.g:3294:2: rule__FontFaceRule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__5"


    // $ANTLR start "rule__FontFaceRule__Group__5__Impl"
    // InternalCssDslParser.g:3300:1: rule__FontFaceRule__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__FontFaceRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3304:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:3305:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:3305:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:3306:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group__5__Impl"


    // $ANTLR start "rule__FontFaceRule__Group_4__0"
    // InternalCssDslParser.g:3316:1: rule__FontFaceRule__Group_4__0 : rule__FontFaceRule__Group_4__0__Impl rule__FontFaceRule__Group_4__1 ;
    public final void rule__FontFaceRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3320:1: ( rule__FontFaceRule__Group_4__0__Impl rule__FontFaceRule__Group_4__1 )
            // InternalCssDslParser.g:3321:2: rule__FontFaceRule__Group_4__0__Impl rule__FontFaceRule__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__FontFaceRule__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group_4__0"


    // $ANTLR start "rule__FontFaceRule__Group_4__0__Impl"
    // InternalCssDslParser.g:3328:1: rule__FontFaceRule__Group_4__0__Impl : ( Semicolon ) ;
    public final void rule__FontFaceRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3332:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:3333:1: ( Semicolon )
            {
            // InternalCssDslParser.g:3333:1: ( Semicolon )
            // InternalCssDslParser.g:3334:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getSemicolonKeyword_4_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getSemicolonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group_4__0__Impl"


    // $ANTLR start "rule__FontFaceRule__Group_4__1"
    // InternalCssDslParser.g:3343:1: rule__FontFaceRule__Group_4__1 : rule__FontFaceRule__Group_4__1__Impl ;
    public final void rule__FontFaceRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3347:1: ( rule__FontFaceRule__Group_4__1__Impl )
            // InternalCssDslParser.g:3348:2: rule__FontFaceRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FontFaceRule__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group_4__1"


    // $ANTLR start "rule__FontFaceRule__Group_4__1__Impl"
    // InternalCssDslParser.g:3354:1: rule__FontFaceRule__Group_4__1__Impl : ( ( rule__FontFaceRule__DeclarationsAssignment_4_1 )? ) ;
    public final void rule__FontFaceRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3358:1: ( ( ( rule__FontFaceRule__DeclarationsAssignment_4_1 )? ) )
            // InternalCssDslParser.g:3359:1: ( ( rule__FontFaceRule__DeclarationsAssignment_4_1 )? )
            {
            // InternalCssDslParser.g:3359:1: ( ( rule__FontFaceRule__DeclarationsAssignment_4_1 )? )
            // InternalCssDslParser.g:3360:2: ( rule__FontFaceRule__DeclarationsAssignment_4_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getDeclarationsAssignment_4_1()); 
            }
            // InternalCssDslParser.g:3361:2: ( rule__FontFaceRule__DeclarationsAssignment_4_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=Not && LA45_0<=Url)||(LA45_0>=No && LA45_0<=Ur)||(LA45_0>=RULE_ONE_HEX_LETTER && LA45_0<=RULE_DASH)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCssDslParser.g:3361:3: rule__FontFaceRule__DeclarationsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FontFaceRule__DeclarationsAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getDeclarationsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__Group_4__1__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__0"
    // InternalCssDslParser.g:3370:1: rule__KeyframesRule__Group__0 : rule__KeyframesRule__Group__0__Impl rule__KeyframesRule__Group__1 ;
    public final void rule__KeyframesRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3374:1: ( rule__KeyframesRule__Group__0__Impl rule__KeyframesRule__Group__1 )
            // InternalCssDslParser.g:3375:2: rule__KeyframesRule__Group__0__Impl rule__KeyframesRule__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__KeyframesRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__0"


    // $ANTLR start "rule__KeyframesRule__Group__0__Impl"
    // InternalCssDslParser.g:3382:1: rule__KeyframesRule__Group__0__Impl : ( () ) ;
    public final void rule__KeyframesRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3386:1: ( ( () ) )
            // InternalCssDslParser.g:3387:1: ( () )
            {
            // InternalCssDslParser.g:3387:1: ( () )
            // InternalCssDslParser.g:3388:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframesRuleAction_0()); 
            }
            // InternalCssDslParser.g:3389:2: ()
            // InternalCssDslParser.g:3389:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframesRuleAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__0__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__1"
    // InternalCssDslParser.g:3397:1: rule__KeyframesRule__Group__1 : rule__KeyframesRule__Group__1__Impl rule__KeyframesRule__Group__2 ;
    public final void rule__KeyframesRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3401:1: ( rule__KeyframesRule__Group__1__Impl rule__KeyframesRule__Group__2 )
            // InternalCssDslParser.g:3402:2: rule__KeyframesRule__Group__1__Impl rule__KeyframesRule__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__KeyframesRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__1"


    // $ANTLR start "rule__KeyframesRule__Group__1__Impl"
    // InternalCssDslParser.g:3409:1: rule__KeyframesRule__Group__1__Impl : ( Keyframes ) ;
    public final void rule__KeyframesRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3413:1: ( ( Keyframes ) )
            // InternalCssDslParser.g:3414:1: ( Keyframes )
            {
            // InternalCssDslParser.g:3414:1: ( Keyframes )
            // InternalCssDslParser.g:3415:2: Keyframes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframesKeyword_1()); 
            }
            match(input,Keyframes,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__1__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__2"
    // InternalCssDslParser.g:3424:1: rule__KeyframesRule__Group__2 : rule__KeyframesRule__Group__2__Impl rule__KeyframesRule__Group__3 ;
    public final void rule__KeyframesRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3428:1: ( rule__KeyframesRule__Group__2__Impl rule__KeyframesRule__Group__3 )
            // InternalCssDslParser.g:3429:2: rule__KeyframesRule__Group__2__Impl rule__KeyframesRule__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__KeyframesRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__2"


    // $ANTLR start "rule__KeyframesRule__Group__2__Impl"
    // InternalCssDslParser.g:3436:1: rule__KeyframesRule__Group__2__Impl : ( ( rule__KeyframesRule__NameAssignment_2 ) ) ;
    public final void rule__KeyframesRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3440:1: ( ( ( rule__KeyframesRule__NameAssignment_2 ) ) )
            // InternalCssDslParser.g:3441:1: ( ( rule__KeyframesRule__NameAssignment_2 ) )
            {
            // InternalCssDslParser.g:3441:1: ( ( rule__KeyframesRule__NameAssignment_2 ) )
            // InternalCssDslParser.g:3442:2: ( rule__KeyframesRule__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getNameAssignment_2()); 
            }
            // InternalCssDslParser.g:3443:2: ( rule__KeyframesRule__NameAssignment_2 )
            // InternalCssDslParser.g:3443:3: rule__KeyframesRule__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__2__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__3"
    // InternalCssDslParser.g:3451:1: rule__KeyframesRule__Group__3 : rule__KeyframesRule__Group__3__Impl rule__KeyframesRule__Group__4 ;
    public final void rule__KeyframesRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3455:1: ( rule__KeyframesRule__Group__3__Impl rule__KeyframesRule__Group__4 )
            // InternalCssDslParser.g:3456:2: rule__KeyframesRule__Group__3__Impl rule__KeyframesRule__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__KeyframesRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__3"


    // $ANTLR start "rule__KeyframesRule__Group__3__Impl"
    // InternalCssDslParser.g:3463:1: rule__KeyframesRule__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__KeyframesRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3467:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:3468:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:3468:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:3469:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__3__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__4"
    // InternalCssDslParser.g:3478:1: rule__KeyframesRule__Group__4 : rule__KeyframesRule__Group__4__Impl rule__KeyframesRule__Group__5 ;
    public final void rule__KeyframesRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3482:1: ( rule__KeyframesRule__Group__4__Impl rule__KeyframesRule__Group__5 )
            // InternalCssDslParser.g:3483:2: rule__KeyframesRule__Group__4__Impl rule__KeyframesRule__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__KeyframesRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__4"


    // $ANTLR start "rule__KeyframesRule__Group__4__Impl"
    // InternalCssDslParser.g:3490:1: rule__KeyframesRule__Group__4__Impl : ( ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )? ) ;
    public final void rule__KeyframesRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3494:1: ( ( ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )? ) )
            // InternalCssDslParser.g:3495:1: ( ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )? )
            {
            // InternalCssDslParser.g:3495:1: ( ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )? )
            // InternalCssDslParser.g:3496:2: ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsAssignment_4()); 
            }
            // InternalCssDslParser.g:3497:2: ( rule__KeyframesRule__KeyframeselectorsAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=Not && LA46_0<=Url)||(LA46_0>=No && LA46_0<=Ur)||LA46_0==FullStop||(LA46_0>=RULE_ONE_INT && LA46_0<=RULE_PLUS)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCssDslParser.g:3497:3: rule__KeyframesRule__KeyframeselectorsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframesRule__KeyframeselectorsAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__4__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__5"
    // InternalCssDslParser.g:3505:1: rule__KeyframesRule__Group__5 : rule__KeyframesRule__Group__5__Impl rule__KeyframesRule__Group__6 ;
    public final void rule__KeyframesRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3509:1: ( rule__KeyframesRule__Group__5__Impl rule__KeyframesRule__Group__6 )
            // InternalCssDslParser.g:3510:2: rule__KeyframesRule__Group__5__Impl rule__KeyframesRule__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__KeyframesRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__5"


    // $ANTLR start "rule__KeyframesRule__Group__5__Impl"
    // InternalCssDslParser.g:3517:1: rule__KeyframesRule__Group__5__Impl : ( ( rule__KeyframesRule__Group_5__0 )* ) ;
    public final void rule__KeyframesRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3521:1: ( ( ( rule__KeyframesRule__Group_5__0 )* ) )
            // InternalCssDslParser.g:3522:1: ( ( rule__KeyframesRule__Group_5__0 )* )
            {
            // InternalCssDslParser.g:3522:1: ( ( rule__KeyframesRule__Group_5__0 )* )
            // InternalCssDslParser.g:3523:2: ( rule__KeyframesRule__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getGroup_5()); 
            }
            // InternalCssDslParser.g:3524:2: ( rule__KeyframesRule__Group_5__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Semicolon) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCssDslParser.g:3524:3: rule__KeyframesRule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__KeyframesRule__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__5__Impl"


    // $ANTLR start "rule__KeyframesRule__Group__6"
    // InternalCssDslParser.g:3532:1: rule__KeyframesRule__Group__6 : rule__KeyframesRule__Group__6__Impl ;
    public final void rule__KeyframesRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3536:1: ( rule__KeyframesRule__Group__6__Impl )
            // InternalCssDslParser.g:3537:2: rule__KeyframesRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__6"


    // $ANTLR start "rule__KeyframesRule__Group__6__Impl"
    // InternalCssDslParser.g:3543:1: rule__KeyframesRule__Group__6__Impl : ( RightCurlyBracket ) ;
    public final void rule__KeyframesRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3547:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:3548:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:3548:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:3549:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group__6__Impl"


    // $ANTLR start "rule__KeyframesRule__Group_5__0"
    // InternalCssDslParser.g:3559:1: rule__KeyframesRule__Group_5__0 : rule__KeyframesRule__Group_5__0__Impl rule__KeyframesRule__Group_5__1 ;
    public final void rule__KeyframesRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3563:1: ( rule__KeyframesRule__Group_5__0__Impl rule__KeyframesRule__Group_5__1 )
            // InternalCssDslParser.g:3564:2: rule__KeyframesRule__Group_5__0__Impl rule__KeyframesRule__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__KeyframesRule__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group_5__0"


    // $ANTLR start "rule__KeyframesRule__Group_5__0__Impl"
    // InternalCssDslParser.g:3571:1: rule__KeyframesRule__Group_5__0__Impl : ( Semicolon ) ;
    public final void rule__KeyframesRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3575:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:3576:1: ( Semicolon )
            {
            // InternalCssDslParser.g:3576:1: ( Semicolon )
            // InternalCssDslParser.g:3577:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getSemicolonKeyword_5_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getSemicolonKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group_5__0__Impl"


    // $ANTLR start "rule__KeyframesRule__Group_5__1"
    // InternalCssDslParser.g:3586:1: rule__KeyframesRule__Group_5__1 : rule__KeyframesRule__Group_5__1__Impl ;
    public final void rule__KeyframesRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3590:1: ( rule__KeyframesRule__Group_5__1__Impl )
            // InternalCssDslParser.g:3591:2: rule__KeyframesRule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyframesRule__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group_5__1"


    // $ANTLR start "rule__KeyframesRule__Group_5__1__Impl"
    // InternalCssDslParser.g:3597:1: rule__KeyframesRule__Group_5__1__Impl : ( ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )? ) ;
    public final void rule__KeyframesRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3601:1: ( ( ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )? ) )
            // InternalCssDslParser.g:3602:1: ( ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )? )
            {
            // InternalCssDslParser.g:3602:1: ( ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )? )
            // InternalCssDslParser.g:3603:2: ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsAssignment_5_1()); 
            }
            // InternalCssDslParser.g:3604:2: ( rule__KeyframesRule__KeyframeselectorsAssignment_5_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=Not && LA48_0<=Url)||(LA48_0>=No && LA48_0<=Ur)||LA48_0==FullStop||(LA48_0>=RULE_ONE_INT && LA48_0<=RULE_PLUS)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCssDslParser.g:3604:3: rule__KeyframesRule__KeyframeselectorsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframesRule__KeyframeselectorsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__Group_5__1__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group__0"
    // InternalCssDslParser.g:3613:1: rule__KeyframeSelector__Group__0 : rule__KeyframeSelector__Group__0__Impl rule__KeyframeSelector__Group__1 ;
    public final void rule__KeyframeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3617:1: ( rule__KeyframeSelector__Group__0__Impl rule__KeyframeSelector__Group__1 )
            // InternalCssDslParser.g:3618:2: rule__KeyframeSelector__Group__0__Impl rule__KeyframeSelector__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__KeyframeSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__0"


    // $ANTLR start "rule__KeyframeSelector__Group__0__Impl"
    // InternalCssDslParser.g:3625:1: rule__KeyframeSelector__Group__0__Impl : ( ( rule__KeyframeSelector__Alternatives_0 ) ) ;
    public final void rule__KeyframeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3629:1: ( ( ( rule__KeyframeSelector__Alternatives_0 ) ) )
            // InternalCssDslParser.g:3630:1: ( ( rule__KeyframeSelector__Alternatives_0 ) )
            {
            // InternalCssDslParser.g:3630:1: ( ( rule__KeyframeSelector__Alternatives_0 ) )
            // InternalCssDslParser.g:3631:2: ( rule__KeyframeSelector__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getAlternatives_0()); 
            }
            // InternalCssDslParser.g:3632:2: ( rule__KeyframeSelector__Alternatives_0 )
            // InternalCssDslParser.g:3632:3: rule__KeyframeSelector__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__0__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group__1"
    // InternalCssDslParser.g:3640:1: rule__KeyframeSelector__Group__1 : rule__KeyframeSelector__Group__1__Impl rule__KeyframeSelector__Group__2 ;
    public final void rule__KeyframeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3644:1: ( rule__KeyframeSelector__Group__1__Impl rule__KeyframeSelector__Group__2 )
            // InternalCssDslParser.g:3645:2: rule__KeyframeSelector__Group__1__Impl rule__KeyframeSelector__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__KeyframeSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__1"


    // $ANTLR start "rule__KeyframeSelector__Group__1__Impl"
    // InternalCssDslParser.g:3652:1: rule__KeyframeSelector__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__KeyframeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3656:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:3657:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:3657:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:3658:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__1__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group__2"
    // InternalCssDslParser.g:3667:1: rule__KeyframeSelector__Group__2 : rule__KeyframeSelector__Group__2__Impl rule__KeyframeSelector__Group__3 ;
    public final void rule__KeyframeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3671:1: ( rule__KeyframeSelector__Group__2__Impl rule__KeyframeSelector__Group__3 )
            // InternalCssDslParser.g:3672:2: rule__KeyframeSelector__Group__2__Impl rule__KeyframeSelector__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__KeyframeSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__2"


    // $ANTLR start "rule__KeyframeSelector__Group__2__Impl"
    // InternalCssDslParser.g:3679:1: rule__KeyframeSelector__Group__2__Impl : ( ( rule__KeyframeSelector__DeclarationsAssignment_2 )? ) ;
    public final void rule__KeyframeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3683:1: ( ( ( rule__KeyframeSelector__DeclarationsAssignment_2 )? ) )
            // InternalCssDslParser.g:3684:1: ( ( rule__KeyframeSelector__DeclarationsAssignment_2 )? )
            {
            // InternalCssDslParser.g:3684:1: ( ( rule__KeyframeSelector__DeclarationsAssignment_2 )? )
            // InternalCssDslParser.g:3685:2: ( rule__KeyframeSelector__DeclarationsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getDeclarationsAssignment_2()); 
            }
            // InternalCssDslParser.g:3686:2: ( rule__KeyframeSelector__DeclarationsAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=Not && LA49_0<=Url)||(LA49_0>=No && LA49_0<=Ur)||(LA49_0>=RULE_ONE_HEX_LETTER && LA49_0<=RULE_DASH)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCssDslParser.g:3686:3: rule__KeyframeSelector__DeclarationsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframeSelector__DeclarationsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getDeclarationsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__2__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group__3"
    // InternalCssDslParser.g:3694:1: rule__KeyframeSelector__Group__3 : rule__KeyframeSelector__Group__3__Impl rule__KeyframeSelector__Group__4 ;
    public final void rule__KeyframeSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3698:1: ( rule__KeyframeSelector__Group__3__Impl rule__KeyframeSelector__Group__4 )
            // InternalCssDslParser.g:3699:2: rule__KeyframeSelector__Group__3__Impl rule__KeyframeSelector__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__KeyframeSelector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__3"


    // $ANTLR start "rule__KeyframeSelector__Group__3__Impl"
    // InternalCssDslParser.g:3706:1: rule__KeyframeSelector__Group__3__Impl : ( ( rule__KeyframeSelector__Group_3__0 )* ) ;
    public final void rule__KeyframeSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3710:1: ( ( ( rule__KeyframeSelector__Group_3__0 )* ) )
            // InternalCssDslParser.g:3711:1: ( ( rule__KeyframeSelector__Group_3__0 )* )
            {
            // InternalCssDslParser.g:3711:1: ( ( rule__KeyframeSelector__Group_3__0 )* )
            // InternalCssDslParser.g:3712:2: ( rule__KeyframeSelector__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getGroup_3()); 
            }
            // InternalCssDslParser.g:3713:2: ( rule__KeyframeSelector__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Semicolon) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCssDslParser.g:3713:3: rule__KeyframeSelector__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__KeyframeSelector__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__3__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group__4"
    // InternalCssDslParser.g:3721:1: rule__KeyframeSelector__Group__4 : rule__KeyframeSelector__Group__4__Impl ;
    public final void rule__KeyframeSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3725:1: ( rule__KeyframeSelector__Group__4__Impl )
            // InternalCssDslParser.g:3726:2: rule__KeyframeSelector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__4"


    // $ANTLR start "rule__KeyframeSelector__Group__4__Impl"
    // InternalCssDslParser.g:3732:1: rule__KeyframeSelector__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__KeyframeSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3736:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:3737:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:3737:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:3738:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group__4__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group_0_1__0"
    // InternalCssDslParser.g:3748:1: rule__KeyframeSelector__Group_0_1__0 : rule__KeyframeSelector__Group_0_1__0__Impl rule__KeyframeSelector__Group_0_1__1 ;
    public final void rule__KeyframeSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3752:1: ( rule__KeyframeSelector__Group_0_1__0__Impl rule__KeyframeSelector__Group_0_1__1 )
            // InternalCssDslParser.g:3753:2: rule__KeyframeSelector__Group_0_1__0__Impl rule__KeyframeSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_25);
            rule__KeyframeSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_0_1__0"


    // $ANTLR start "rule__KeyframeSelector__Group_0_1__0__Impl"
    // InternalCssDslParser.g:3760:1: rule__KeyframeSelector__Group_0_1__0__Impl : ( ( rule__KeyframeSelector__PercentageAssignment_0_1_0 ) ) ;
    public final void rule__KeyframeSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3764:1: ( ( ( rule__KeyframeSelector__PercentageAssignment_0_1_0 ) ) )
            // InternalCssDslParser.g:3765:1: ( ( rule__KeyframeSelector__PercentageAssignment_0_1_0 ) )
            {
            // InternalCssDslParser.g:3765:1: ( ( rule__KeyframeSelector__PercentageAssignment_0_1_0 ) )
            // InternalCssDslParser.g:3766:2: ( rule__KeyframeSelector__PercentageAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getPercentageAssignment_0_1_0()); 
            }
            // InternalCssDslParser.g:3767:2: ( rule__KeyframeSelector__PercentageAssignment_0_1_0 )
            // InternalCssDslParser.g:3767:3: rule__KeyframeSelector__PercentageAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__PercentageAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getPercentageAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_0_1__0__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group_0_1__1"
    // InternalCssDslParser.g:3775:1: rule__KeyframeSelector__Group_0_1__1 : rule__KeyframeSelector__Group_0_1__1__Impl ;
    public final void rule__KeyframeSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3779:1: ( rule__KeyframeSelector__Group_0_1__1__Impl )
            // InternalCssDslParser.g:3780:2: rule__KeyframeSelector__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_0_1__1"


    // $ANTLR start "rule__KeyframeSelector__Group_0_1__1__Impl"
    // InternalCssDslParser.g:3786:1: rule__KeyframeSelector__Group_0_1__1__Impl : ( RULE_PERCENT ) ;
    public final void rule__KeyframeSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3790:1: ( ( RULE_PERCENT ) )
            // InternalCssDslParser.g:3791:1: ( RULE_PERCENT )
            {
            // InternalCssDslParser.g:3791:1: ( RULE_PERCENT )
            // InternalCssDslParser.g:3792:2: RULE_PERCENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getPERCENTTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getPERCENTTerminalRuleCall_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_0_1__1__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group_3__0"
    // InternalCssDslParser.g:3802:1: rule__KeyframeSelector__Group_3__0 : rule__KeyframeSelector__Group_3__0__Impl rule__KeyframeSelector__Group_3__1 ;
    public final void rule__KeyframeSelector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3806:1: ( rule__KeyframeSelector__Group_3__0__Impl rule__KeyframeSelector__Group_3__1 )
            // InternalCssDslParser.g:3807:2: rule__KeyframeSelector__Group_3__0__Impl rule__KeyframeSelector__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__KeyframeSelector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_3__0"


    // $ANTLR start "rule__KeyframeSelector__Group_3__0__Impl"
    // InternalCssDslParser.g:3814:1: rule__KeyframeSelector__Group_3__0__Impl : ( Semicolon ) ;
    public final void rule__KeyframeSelector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3818:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:3819:1: ( Semicolon )
            {
            // InternalCssDslParser.g:3819:1: ( Semicolon )
            // InternalCssDslParser.g:3820:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getSemicolonKeyword_3_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getSemicolonKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_3__0__Impl"


    // $ANTLR start "rule__KeyframeSelector__Group_3__1"
    // InternalCssDslParser.g:3829:1: rule__KeyframeSelector__Group_3__1 : rule__KeyframeSelector__Group_3__1__Impl ;
    public final void rule__KeyframeSelector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3833:1: ( rule__KeyframeSelector__Group_3__1__Impl )
            // InternalCssDslParser.g:3834:2: rule__KeyframeSelector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyframeSelector__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_3__1"


    // $ANTLR start "rule__KeyframeSelector__Group_3__1__Impl"
    // InternalCssDslParser.g:3840:1: rule__KeyframeSelector__Group_3__1__Impl : ( ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )? ) ;
    public final void rule__KeyframeSelector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3844:1: ( ( ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )? ) )
            // InternalCssDslParser.g:3845:1: ( ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )? )
            {
            // InternalCssDslParser.g:3845:1: ( ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )? )
            // InternalCssDslParser.g:3846:2: ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getDeclarationsAssignment_3_1()); 
            }
            // InternalCssDslParser.g:3847:2: ( rule__KeyframeSelector__DeclarationsAssignment_3_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=Not && LA51_0<=Url)||(LA51_0>=No && LA51_0<=Ur)||(LA51_0>=RULE_ONE_HEX_LETTER && LA51_0<=RULE_DASH)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCssDslParser.g:3847:3: rule__KeyframeSelector__DeclarationsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KeyframeSelector__DeclarationsAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getDeclarationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__Group_3__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__0"
    // InternalCssDslParser.g:3856:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
    public final void rule__Ruleset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3860:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
            // InternalCssDslParser.g:3861:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Ruleset__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0"


    // $ANTLR start "rule__Ruleset__Group__0__Impl"
    // InternalCssDslParser.g:3868:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
    public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3872:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
            // InternalCssDslParser.g:3873:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            {
            // InternalCssDslParser.g:3873:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            // InternalCssDslParser.g:3874:2: ( rule__Ruleset__SelectorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            }
            // InternalCssDslParser.g:3875:2: ( rule__Ruleset__SelectorsAssignment_0 )
            // InternalCssDslParser.g:3875:3: rule__Ruleset__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__SelectorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0__Impl"


    // $ANTLR start "rule__Ruleset__Group__1"
    // InternalCssDslParser.g:3883:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
    public final void rule__Ruleset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3887:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
            // InternalCssDslParser.g:3888:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Ruleset__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1"


    // $ANTLR start "rule__Ruleset__Group__1__Impl"
    // InternalCssDslParser.g:3895:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
    public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3899:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
            // InternalCssDslParser.g:3900:1: ( ( rule__Ruleset__Group_1__0 )* )
            {
            // InternalCssDslParser.g:3900:1: ( ( rule__Ruleset__Group_1__0 )* )
            // InternalCssDslParser.g:3901:2: ( rule__Ruleset__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup_1()); 
            }
            // InternalCssDslParser.g:3902:2: ( rule__Ruleset__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // InternalCssDslParser.g:3902:3: rule__Ruleset__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Ruleset__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__2"
    // InternalCssDslParser.g:3910:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
    public final void rule__Ruleset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3914:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
            // InternalCssDslParser.g:3915:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Ruleset__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2"


    // $ANTLR start "rule__Ruleset__Group__2__Impl"
    // InternalCssDslParser.g:3922:1: rule__Ruleset__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3926:1: ( ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:3927:1: ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:3927:1: ( ( RULE_WS )* )
            // InternalCssDslParser.g:3928:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            }
            // InternalCssDslParser.g:3929:2: ( RULE_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_WS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalCssDslParser.g:3929:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2__Impl"


    // $ANTLR start "rule__Ruleset__Group__3"
    // InternalCssDslParser.g:3937:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
    public final void rule__Ruleset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3941:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
            // InternalCssDslParser.g:3942:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Ruleset__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3"


    // $ANTLR start "rule__Ruleset__Group__3__Impl"
    // InternalCssDslParser.g:3949:1: rule__Ruleset__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3953:1: ( ( LeftCurlyBracket ) )
            // InternalCssDslParser.g:3954:1: ( LeftCurlyBracket )
            {
            // InternalCssDslParser.g:3954:1: ( LeftCurlyBracket )
            // InternalCssDslParser.g:3955:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3__Impl"


    // $ANTLR start "rule__Ruleset__Group__4"
    // InternalCssDslParser.g:3964:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 ;
    public final void rule__Ruleset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3968:1: ( rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5 )
            // InternalCssDslParser.g:3969:2: rule__Ruleset__Group__4__Impl rule__Ruleset__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Ruleset__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4"


    // $ANTLR start "rule__Ruleset__Group__4__Impl"
    // InternalCssDslParser.g:3976:1: rule__Ruleset__Group__4__Impl : ( ( rule__Ruleset__Group_4__0 )? ) ;
    public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3980:1: ( ( ( rule__Ruleset__Group_4__0 )? ) )
            // InternalCssDslParser.g:3981:1: ( ( rule__Ruleset__Group_4__0 )? )
            {
            // InternalCssDslParser.g:3981:1: ( ( rule__Ruleset__Group_4__0 )? )
            // InternalCssDslParser.g:3982:2: ( rule__Ruleset__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup_4()); 
            }
            // InternalCssDslParser.g:3983:2: ( rule__Ruleset__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=Not && LA54_0<=Url)||(LA54_0>=No && LA54_0<=Ur)||(LA54_0>=RULE_ONE_HEX_LETTER && LA54_0<=RULE_DASH)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCssDslParser.g:3983:3: rule__Ruleset__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ruleset__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4__Impl"


    // $ANTLR start "rule__Ruleset__Group__5"
    // InternalCssDslParser.g:3991:1: rule__Ruleset__Group__5 : rule__Ruleset__Group__5__Impl ;
    public final void rule__Ruleset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:3995:1: ( rule__Ruleset__Group__5__Impl )
            // InternalCssDslParser.g:3996:2: rule__Ruleset__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__5"


    // $ANTLR start "rule__Ruleset__Group__5__Impl"
    // InternalCssDslParser.g:4002:1: rule__Ruleset__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Ruleset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4006:1: ( ( RightCurlyBracket ) )
            // InternalCssDslParser.g:4007:1: ( RightCurlyBracket )
            {
            // InternalCssDslParser.g:4007:1: ( RightCurlyBracket )
            // InternalCssDslParser.g:4008:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__5__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__0"
    // InternalCssDslParser.g:4018:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
    public final void rule__Ruleset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4022:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
            // InternalCssDslParser.g:4023:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Ruleset__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0"


    // $ANTLR start "rule__Ruleset__Group_1__0__Impl"
    // InternalCssDslParser.g:4030:1: rule__Ruleset__Group_1__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4034:1: ( ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:4035:1: ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:4035:1: ( ( RULE_WS )* )
            // InternalCssDslParser.g:4036:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0()); 
            }
            // InternalCssDslParser.g:4037:2: ( RULE_WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_WS) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalCssDslParser.g:4037:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getWSTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__1"
    // InternalCssDslParser.g:4045:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 ;
    public final void rule__Ruleset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4049:1: ( rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2 )
            // InternalCssDslParser.g:4050:2: rule__Ruleset__Group_1__1__Impl rule__Ruleset__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Ruleset__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1"


    // $ANTLR start "rule__Ruleset__Group_1__1__Impl"
    // InternalCssDslParser.g:4057:1: rule__Ruleset__Group_1__1__Impl : ( RULE_COMMA ) ;
    public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4061:1: ( ( RULE_COMMA ) )
            // InternalCssDslParser.g:4062:1: ( RULE_COMMA )
            {
            // InternalCssDslParser.g:4062:1: ( RULE_COMMA )
            // InternalCssDslParser.g:4063:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__2"
    // InternalCssDslParser.g:4072:1: rule__Ruleset__Group_1__2 : rule__Ruleset__Group_1__2__Impl ;
    public final void rule__Ruleset__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4076:1: ( rule__Ruleset__Group_1__2__Impl )
            // InternalCssDslParser.g:4077:2: rule__Ruleset__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__2"


    // $ANTLR start "rule__Ruleset__Group_1__2__Impl"
    // InternalCssDslParser.g:4083:1: rule__Ruleset__Group_1__2__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) ;
    public final void rule__Ruleset__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4087:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_2 ) ) )
            // InternalCssDslParser.g:4088:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
            {
            // InternalCssDslParser.g:4088:1: ( ( rule__Ruleset__SelectorsAssignment_1_2 ) )
            // InternalCssDslParser.g:4089:2: ( rule__Ruleset__SelectorsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2()); 
            }
            // InternalCssDslParser.g:4090:2: ( rule__Ruleset__SelectorsAssignment_1_2 )
            // InternalCssDslParser.g:4090:3: rule__Ruleset__SelectorsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__SelectorsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__2__Impl"


    // $ANTLR start "rule__Ruleset__Group_4__0"
    // InternalCssDslParser.g:4099:1: rule__Ruleset__Group_4__0 : rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 ;
    public final void rule__Ruleset__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4103:1: ( rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1 )
            // InternalCssDslParser.g:4104:2: rule__Ruleset__Group_4__0__Impl rule__Ruleset__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Ruleset__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__0"


    // $ANTLR start "rule__Ruleset__Group_4__0__Impl"
    // InternalCssDslParser.g:4111:1: rule__Ruleset__Group_4__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) ;
    public final void rule__Ruleset__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4115:1: ( ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) ) )
            // InternalCssDslParser.g:4116:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
            {
            // InternalCssDslParser.g:4116:1: ( ( rule__Ruleset__DeclarationsAssignment_4_0 ) )
            // InternalCssDslParser.g:4117:2: ( rule__Ruleset__DeclarationsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0()); 
            }
            // InternalCssDslParser.g:4118:2: ( rule__Ruleset__DeclarationsAssignment_4_0 )
            // InternalCssDslParser.g:4118:3: rule__Ruleset__DeclarationsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__DeclarationsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_4__1"
    // InternalCssDslParser.g:4126:1: rule__Ruleset__Group_4__1 : rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2 ;
    public final void rule__Ruleset__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4130:1: ( rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2 )
            // InternalCssDslParser.g:4131:2: rule__Ruleset__Group_4__1__Impl rule__Ruleset__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Ruleset__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__1"


    // $ANTLR start "rule__Ruleset__Group_4__1__Impl"
    // InternalCssDslParser.g:4138:1: rule__Ruleset__Group_4__1__Impl : ( ( rule__Ruleset__Group_4_1__0 )* ) ;
    public final void rule__Ruleset__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4142:1: ( ( ( rule__Ruleset__Group_4_1__0 )* ) )
            // InternalCssDslParser.g:4143:1: ( ( rule__Ruleset__Group_4_1__0 )* )
            {
            // InternalCssDslParser.g:4143:1: ( ( rule__Ruleset__Group_4_1__0 )* )
            // InternalCssDslParser.g:4144:2: ( rule__Ruleset__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getGroup_4_1()); 
            }
            // InternalCssDslParser.g:4145:2: ( rule__Ruleset__Group_4_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==Semicolon) ) {
                    int LA56_1 = input.LA(2);

                    if ( ((LA56_1>=Not && LA56_1<=Url)||(LA56_1>=No && LA56_1<=Ur)||(LA56_1>=RULE_ONE_HEX_LETTER && LA56_1<=RULE_DASH)) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalCssDslParser.g:4145:3: rule__Ruleset__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Ruleset__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__1__Impl"


    // $ANTLR start "rule__Ruleset__Group_4__2"
    // InternalCssDslParser.g:4153:1: rule__Ruleset__Group_4__2 : rule__Ruleset__Group_4__2__Impl ;
    public final void rule__Ruleset__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4157:1: ( rule__Ruleset__Group_4__2__Impl )
            // InternalCssDslParser.g:4158:2: rule__Ruleset__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__2"


    // $ANTLR start "rule__Ruleset__Group_4__2__Impl"
    // InternalCssDslParser.g:4164:1: rule__Ruleset__Group_4__2__Impl : ( ( Semicolon )? ) ;
    public final void rule__Ruleset__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4168:1: ( ( ( Semicolon )? ) )
            // InternalCssDslParser.g:4169:1: ( ( Semicolon )? )
            {
            // InternalCssDslParser.g:4169:1: ( ( Semicolon )? )
            // InternalCssDslParser.g:4170:2: ( Semicolon )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2()); 
            }
            // InternalCssDslParser.g:4171:2: ( Semicolon )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Semicolon) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCssDslParser.g:4171:3: Semicolon
                    {
                    match(input,Semicolon,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4__2__Impl"


    // $ANTLR start "rule__Ruleset__Group_4_1__0"
    // InternalCssDslParser.g:4180:1: rule__Ruleset__Group_4_1__0 : rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1 ;
    public final void rule__Ruleset__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4184:1: ( rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1 )
            // InternalCssDslParser.g:4185:2: rule__Ruleset__Group_4_1__0__Impl rule__Ruleset__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Ruleset__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4_1__0"


    // $ANTLR start "rule__Ruleset__Group_4_1__0__Impl"
    // InternalCssDslParser.g:4192:1: rule__Ruleset__Group_4_1__0__Impl : ( Semicolon ) ;
    public final void rule__Ruleset__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4196:1: ( ( Semicolon ) )
            // InternalCssDslParser.g:4197:1: ( Semicolon )
            {
            // InternalCssDslParser.g:4197:1: ( Semicolon )
            // InternalCssDslParser.g:4198:2: Semicolon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0()); 
            }
            match(input,Semicolon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSemicolonKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4_1__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_4_1__1"
    // InternalCssDslParser.g:4207:1: rule__Ruleset__Group_4_1__1 : rule__Ruleset__Group_4_1__1__Impl ;
    public final void rule__Ruleset__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4211:1: ( rule__Ruleset__Group_4_1__1__Impl )
            // InternalCssDslParser.g:4212:2: rule__Ruleset__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4_1__1"


    // $ANTLR start "rule__Ruleset__Group_4_1__1__Impl"
    // InternalCssDslParser.g:4218:1: rule__Ruleset__Group_4_1__1__Impl : ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) ) ;
    public final void rule__Ruleset__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4222:1: ( ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) ) )
            // InternalCssDslParser.g:4223:1: ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) )
            {
            // InternalCssDslParser.g:4223:1: ( ( rule__Ruleset__DeclarationsAssignment_4_1_1 ) )
            // InternalCssDslParser.g:4224:2: ( rule__Ruleset__DeclarationsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_1_1()); 
            }
            // InternalCssDslParser.g:4225:2: ( rule__Ruleset__DeclarationsAssignment_4_1_1 )
            // InternalCssDslParser.g:4225:3: rule__Ruleset__DeclarationsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Ruleset__DeclarationsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_4_1__1__Impl"


    // $ANTLR start "rule__CssDeclaration__Group__0"
    // InternalCssDslParser.g:4234:1: rule__CssDeclaration__Group__0 : rule__CssDeclaration__Group__0__Impl rule__CssDeclaration__Group__1 ;
    public final void rule__CssDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4238:1: ( rule__CssDeclaration__Group__0__Impl rule__CssDeclaration__Group__1 )
            // InternalCssDslParser.g:4239:2: rule__CssDeclaration__Group__0__Impl rule__CssDeclaration__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CssDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__0"


    // $ANTLR start "rule__CssDeclaration__Group__0__Impl"
    // InternalCssDslParser.g:4246:1: rule__CssDeclaration__Group__0__Impl : ( ( rule__CssDeclaration__PropertyAssignment_0 ) ) ;
    public final void rule__CssDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4250:1: ( ( ( rule__CssDeclaration__PropertyAssignment_0 ) ) )
            // InternalCssDslParser.g:4251:1: ( ( rule__CssDeclaration__PropertyAssignment_0 ) )
            {
            // InternalCssDslParser.g:4251:1: ( ( rule__CssDeclaration__PropertyAssignment_0 ) )
            // InternalCssDslParser.g:4252:2: ( rule__CssDeclaration__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getPropertyAssignment_0()); 
            }
            // InternalCssDslParser.g:4253:2: ( rule__CssDeclaration__PropertyAssignment_0 )
            // InternalCssDslParser.g:4253:3: rule__CssDeclaration__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__PropertyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getPropertyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__0__Impl"


    // $ANTLR start "rule__CssDeclaration__Group__1"
    // InternalCssDslParser.g:4261:1: rule__CssDeclaration__Group__1 : rule__CssDeclaration__Group__1__Impl rule__CssDeclaration__Group__2 ;
    public final void rule__CssDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4265:1: ( rule__CssDeclaration__Group__1__Impl rule__CssDeclaration__Group__2 )
            // InternalCssDslParser.g:4266:2: rule__CssDeclaration__Group__1__Impl rule__CssDeclaration__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__CssDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__1"


    // $ANTLR start "rule__CssDeclaration__Group__1__Impl"
    // InternalCssDslParser.g:4273:1: rule__CssDeclaration__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CssDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4277:1: ( ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:4278:1: ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:4278:1: ( ( RULE_WS )* )
            // InternalCssDslParser.g:4279:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getWSTerminalRuleCall_1()); 
            }
            // InternalCssDslParser.g:4280:2: ( RULE_WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_WS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCssDslParser.g:4280:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getWSTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__1__Impl"


    // $ANTLR start "rule__CssDeclaration__Group__2"
    // InternalCssDslParser.g:4288:1: rule__CssDeclaration__Group__2 : rule__CssDeclaration__Group__2__Impl rule__CssDeclaration__Group__3 ;
    public final void rule__CssDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4292:1: ( rule__CssDeclaration__Group__2__Impl rule__CssDeclaration__Group__3 )
            // InternalCssDslParser.g:4293:2: rule__CssDeclaration__Group__2__Impl rule__CssDeclaration__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__CssDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__2"


    // $ANTLR start "rule__CssDeclaration__Group__2__Impl"
    // InternalCssDslParser.g:4300:1: rule__CssDeclaration__Group__2__Impl : ( RULE_COLON ) ;
    public final void rule__CssDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4304:1: ( ( RULE_COLON ) )
            // InternalCssDslParser.g:4305:1: ( RULE_COLON )
            {
            // InternalCssDslParser.g:4305:1: ( RULE_COLON )
            // InternalCssDslParser.g:4306:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getCOLONTerminalRuleCall_2()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getCOLONTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__2__Impl"


    // $ANTLR start "rule__CssDeclaration__Group__3"
    // InternalCssDslParser.g:4315:1: rule__CssDeclaration__Group__3 : rule__CssDeclaration__Group__3__Impl rule__CssDeclaration__Group__4 ;
    public final void rule__CssDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4319:1: ( rule__CssDeclaration__Group__3__Impl rule__CssDeclaration__Group__4 )
            // InternalCssDslParser.g:4320:2: rule__CssDeclaration__Group__3__Impl rule__CssDeclaration__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__CssDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__3"


    // $ANTLR start "rule__CssDeclaration__Group__3__Impl"
    // InternalCssDslParser.g:4327:1: rule__CssDeclaration__Group__3__Impl : ( ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) ) ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* ) ) ;
    public final void rule__CssDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4331:1: ( ( ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) ) ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* ) ) )
            // InternalCssDslParser.g:4332:1: ( ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) ) ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* ) )
            {
            // InternalCssDslParser.g:4332:1: ( ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) ) ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* ) )
            // InternalCssDslParser.g:4333:2: ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) ) ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* )
            {
            // InternalCssDslParser.g:4333:2: ( ( rule__CssDeclaration__ValueTokensAssignment_3 ) )
            // InternalCssDslParser.g:4334:3: ( rule__CssDeclaration__ValueTokensAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getValueTokensAssignment_3()); 
            }
            // InternalCssDslParser.g:4335:3: ( rule__CssDeclaration__ValueTokensAssignment_3 )
            // InternalCssDslParser.g:4335:4: rule__CssDeclaration__ValueTokensAssignment_3
            {
            pushFollow(FOLLOW_35);
            rule__CssDeclaration__ValueTokensAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getValueTokensAssignment_3()); 
            }

            }

            // InternalCssDslParser.g:4338:2: ( ( rule__CssDeclaration__ValueTokensAssignment_3 )* )
            // InternalCssDslParser.g:4339:3: ( rule__CssDeclaration__ValueTokensAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getValueTokensAssignment_3()); 
            }
            // InternalCssDslParser.g:4340:3: ( rule__CssDeclaration__ValueTokensAssignment_3 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=Url_1 && LA59_0<=Url)||(LA59_0>=No && LA59_0<=Ur)||LA59_0==FullStop||(LA59_0>=RULE_ONE_INT && LA59_0<=RULE_PERCENT)||(LA59_0>=RULE_WS && LA59_0<=RULE_CSSSTRING)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCssDslParser.g:4340:4: rule__CssDeclaration__ValueTokensAssignment_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__CssDeclaration__ValueTokensAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getValueTokensAssignment_3()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__3__Impl"


    // $ANTLR start "rule__CssDeclaration__Group__4"
    // InternalCssDslParser.g:4349:1: rule__CssDeclaration__Group__4 : rule__CssDeclaration__Group__4__Impl ;
    public final void rule__CssDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4353:1: ( rule__CssDeclaration__Group__4__Impl )
            // InternalCssDslParser.g:4354:2: rule__CssDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__4"


    // $ANTLR start "rule__CssDeclaration__Group__4__Impl"
    // InternalCssDslParser.g:4360:1: rule__CssDeclaration__Group__4__Impl : ( ( rule__CssDeclaration__ImportantAssignment_4 )? ) ;
    public final void rule__CssDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4364:1: ( ( ( rule__CssDeclaration__ImportantAssignment_4 )? ) )
            // InternalCssDslParser.g:4365:1: ( ( rule__CssDeclaration__ImportantAssignment_4 )? )
            {
            // InternalCssDslParser.g:4365:1: ( ( rule__CssDeclaration__ImportantAssignment_4 )? )
            // InternalCssDslParser.g:4366:2: ( rule__CssDeclaration__ImportantAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getImportantAssignment_4()); 
            }
            // InternalCssDslParser.g:4367:2: ( rule__CssDeclaration__ImportantAssignment_4 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_IMPORTANT_SYM) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCssDslParser.g:4367:3: rule__CssDeclaration__ImportantAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CssDeclaration__ImportantAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getImportantAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalCssDslParser.g:4376:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4380:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalCssDslParser.g:4381:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Selector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalCssDslParser.g:4388:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4392:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // InternalCssDslParser.g:4393:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // InternalCssDslParser.g:4393:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // InternalCssDslParser.g:4394:2: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            }
            // InternalCssDslParser.g:4395:2: ( rule__Selector__SimpleselectorsAssignment_0 )
            // InternalCssDslParser.g:4395:3: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__SimpleselectorsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalCssDslParser.g:4403:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4407:1: ( rule__Selector__Group__1__Impl )
            // InternalCssDslParser.g:4408:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalCssDslParser.g:4414:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4418:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // InternalCssDslParser.g:4419:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // InternalCssDslParser.g:4419:1: ( ( rule__Selector__Alternatives_1 )? )
            // InternalCssDslParser.g:4420:2: ( rule__Selector__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            }
            // InternalCssDslParser.g:4421:2: ( rule__Selector__Alternatives_1 )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalCssDslParser.g:4421:3: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__0"
    // InternalCssDslParser.g:4430:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4434:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // InternalCssDslParser.g:4435:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0"


    // $ANTLR start "rule__Selector__Group_1_0__0__Impl"
    // InternalCssDslParser.g:4442:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4446:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // InternalCssDslParser.g:4447:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // InternalCssDslParser.g:4447:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // InternalCssDslParser.g:4448:2: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            }
            // InternalCssDslParser.g:4449:2: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // InternalCssDslParser.g:4449:3: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__CombinatorAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__1"
    // InternalCssDslParser.g:4457:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2 ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4461:1: ( rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2 )
            // InternalCssDslParser.g:4462:2: rule__Selector__Group_1_0__1__Impl rule__Selector__Group_1_0__2
            {
            pushFollow(FOLLOW_37);
            rule__Selector__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1"


    // $ANTLR start "rule__Selector__Group_1_0__1__Impl"
    // InternalCssDslParser.g:4469:1: rule__Selector__Group_1_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4473:1: ( ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:4474:1: ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:4474:1: ( ( RULE_WS )* )
            // InternalCssDslParser.g:4475:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1()); 
            }
            // InternalCssDslParser.g:4476:2: ( RULE_WS )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_WS) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCssDslParser.g:4476:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__2"
    // InternalCssDslParser.g:4484:1: rule__Selector__Group_1_0__2 : rule__Selector__Group_1_0__2__Impl ;
    public final void rule__Selector__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4488:1: ( rule__Selector__Group_1_0__2__Impl )
            // InternalCssDslParser.g:4489:2: rule__Selector__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__2"


    // $ANTLR start "rule__Selector__Group_1_0__2__Impl"
    // InternalCssDslParser.g:4495:1: rule__Selector__Group_1_0__2__Impl : ( ( rule__Selector__SelectorAssignment_1_0_2 ) ) ;
    public final void rule__Selector__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4499:1: ( ( ( rule__Selector__SelectorAssignment_1_0_2 ) ) )
            // InternalCssDslParser.g:4500:1: ( ( rule__Selector__SelectorAssignment_1_0_2 ) )
            {
            // InternalCssDslParser.g:4500:1: ( ( rule__Selector__SelectorAssignment_1_0_2 ) )
            // InternalCssDslParser.g:4501:2: ( rule__Selector__SelectorAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_2()); 
            }
            // InternalCssDslParser.g:4502:2: ( rule__Selector__SelectorAssignment_1_0_2 )
            // InternalCssDslParser.g:4502:3: rule__Selector__SelectorAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Selector__SelectorAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__2__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // InternalCssDslParser.g:4511:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4515:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // InternalCssDslParser.g:4516:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1__0__Impl"
    // InternalCssDslParser.g:4523:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4527:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalCssDslParser.g:4528:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalCssDslParser.g:4528:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:4529:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:4529:2: ( ( RULE_WS ) )
            // InternalCssDslParser.g:4530:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }
            // InternalCssDslParser.g:4531:3: ( RULE_WS )
            // InternalCssDslParser.g:4531:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }

            }

            // InternalCssDslParser.g:4534:2: ( ( RULE_WS )* )
            // InternalCssDslParser.g:4535:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            }
            // InternalCssDslParser.g:4536:3: ( RULE_WS )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_WS) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalCssDslParser.g:4536:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__1"
    // InternalCssDslParser.g:4545:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4549:1: ( rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2 )
            // InternalCssDslParser.g:4550:2: rule__Selector__Group_1_1__1__Impl rule__Selector__Group_1_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1__1__Impl"
    // InternalCssDslParser.g:4557:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4561:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
            // InternalCssDslParser.g:4562:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            {
            // InternalCssDslParser.g:4562:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            // InternalCssDslParser.g:4563:2: ( rule__Selector__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            }
            // InternalCssDslParser.g:4564:2: ( rule__Selector__Group_1_1_1__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==GreaterThanSign||LA64_0==Tilde||LA64_0==RULE_PLUS) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCssDslParser.g:4564:3: rule__Selector__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selector__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__2"
    // InternalCssDslParser.g:4572:1: rule__Selector__Group_1_1__2 : rule__Selector__Group_1_1__2__Impl ;
    public final void rule__Selector__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4576:1: ( rule__Selector__Group_1_1__2__Impl )
            // InternalCssDslParser.g:4577:2: rule__Selector__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__2"


    // $ANTLR start "rule__Selector__Group_1_1__2__Impl"
    // InternalCssDslParser.g:4583:1: rule__Selector__Group_1_1__2__Impl : ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) ;
    public final void rule__Selector__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4587:1: ( ( ( rule__Selector__SelectorAssignment_1_1_2 ) ) )
            // InternalCssDslParser.g:4588:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
            {
            // InternalCssDslParser.g:4588:1: ( ( rule__Selector__SelectorAssignment_1_1_2 ) )
            // InternalCssDslParser.g:4589:2: ( rule__Selector__SelectorAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2()); 
            }
            // InternalCssDslParser.g:4590:2: ( rule__Selector__SelectorAssignment_1_1_2 )
            // InternalCssDslParser.g:4590:3: rule__Selector__SelectorAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Selector__SelectorAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__2__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__0"
    // InternalCssDslParser.g:4599:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4603:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // InternalCssDslParser.g:4604:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_39);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
    // InternalCssDslParser.g:4611:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4615:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) ) )
            // InternalCssDslParser.g:4616:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) )
            {
            // InternalCssDslParser.g:4616:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 ) )
            // InternalCssDslParser.g:4617:2: ( rule__Selector__CombinatorAssignment_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            }
            // InternalCssDslParser.g:4618:2: ( rule__Selector__CombinatorAssignment_1_1_1_0 )
            // InternalCssDslParser.g:4618:3: rule__Selector__CombinatorAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__CombinatorAssignment_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__1"
    // InternalCssDslParser.g:4626:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4630:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // InternalCssDslParser.g:4631:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
    // InternalCssDslParser.g:4637:1: rule__Selector__Group_1_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4641:1: ( ( ( RULE_WS )* ) )
            // InternalCssDslParser.g:4642:1: ( ( RULE_WS )* )
            {
            // InternalCssDslParser.g:4642:1: ( ( RULE_WS )* )
            // InternalCssDslParser.g:4643:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1()); 
            }
            // InternalCssDslParser.g:4644:2: ( RULE_WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_WS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalCssDslParser.g:4644:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_28); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__SimpleSelectorForNegation__Group_0__0"
    // InternalCssDslParser.g:4653:1: rule__SimpleSelectorForNegation__Group_0__0 : rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1 ;
    public final void rule__SimpleSelectorForNegation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4657:1: ( rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1 )
            // InternalCssDslParser.g:4658:2: rule__SimpleSelectorForNegation__Group_0__0__Impl rule__SimpleSelectorForNegation__Group_0__1
            {
            pushFollow(FOLLOW_40);
            rule__SimpleSelectorForNegation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelectorForNegation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Group_0__0"


    // $ANTLR start "rule__SimpleSelectorForNegation__Group_0__0__Impl"
    // InternalCssDslParser.g:4665:1: rule__SimpleSelectorForNegation__Group_0__0__Impl : ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) ) ;
    public final void rule__SimpleSelectorForNegation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4669:1: ( ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) ) )
            // InternalCssDslParser.g:4670:1: ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) )
            {
            // InternalCssDslParser.g:4670:1: ( ( rule__SimpleSelectorForNegation__Alternatives_0_0 ) )
            // InternalCssDslParser.g:4671:2: ( rule__SimpleSelectorForNegation__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives_0_0()); 
            }
            // InternalCssDslParser.g:4672:2: ( rule__SimpleSelectorForNegation__Alternatives_0_0 )
            // InternalCssDslParser.g:4672:3: rule__SimpleSelectorForNegation__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectorForNegation__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Group_0__0__Impl"


    // $ANTLR start "rule__SimpleSelectorForNegation__Group_0__1"
    // InternalCssDslParser.g:4680:1: rule__SimpleSelectorForNegation__Group_0__1 : rule__SimpleSelectorForNegation__Group_0__1__Impl ;
    public final void rule__SimpleSelectorForNegation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4684:1: ( rule__SimpleSelectorForNegation__Group_0__1__Impl )
            // InternalCssDslParser.g:4685:2: rule__SimpleSelectorForNegation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelectorForNegation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Group_0__1"


    // $ANTLR start "rule__SimpleSelectorForNegation__Group_0__1__Impl"
    // InternalCssDslParser.g:4691:1: rule__SimpleSelectorForNegation__Group_0__1__Impl : ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__SimpleSelectorForNegation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4695:1: ( ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* ) )
            // InternalCssDslParser.g:4696:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* )
            {
            // InternalCssDslParser.g:4696:1: ( ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )* )
            // InternalCssDslParser.g:4697:2: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_0_1()); 
            }
            // InternalCssDslParser.g:4698:2: ( rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==FullStop||LA66_0==LeftSquareBracket||LA66_0==RULE_HASHMARK||LA66_0==RULE_COLON) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalCssDslParser.g:4698:3: rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__Group_0__1__Impl"


    // $ANTLR start "rule__SimpleSelector__Group_0__0"
    // InternalCssDslParser.g:4707:1: rule__SimpleSelector__Group_0__0 : rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1 ;
    public final void rule__SimpleSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4711:1: ( rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1 )
            // InternalCssDslParser.g:4712:2: rule__SimpleSelector__Group_0__0__Impl rule__SimpleSelector__Group_0__1
            {
            pushFollow(FOLLOW_40);
            rule__SimpleSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SimpleSelector__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Group_0__0"


    // $ANTLR start "rule__SimpleSelector__Group_0__0__Impl"
    // InternalCssDslParser.g:4719:1: rule__SimpleSelector__Group_0__0__Impl : ( ( rule__SimpleSelector__Alternatives_0_0 ) ) ;
    public final void rule__SimpleSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4723:1: ( ( ( rule__SimpleSelector__Alternatives_0_0 ) ) )
            // InternalCssDslParser.g:4724:1: ( ( rule__SimpleSelector__Alternatives_0_0 ) )
            {
            // InternalCssDslParser.g:4724:1: ( ( rule__SimpleSelector__Alternatives_0_0 ) )
            // InternalCssDslParser.g:4725:2: ( rule__SimpleSelector__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getAlternatives_0_0()); 
            }
            // InternalCssDslParser.g:4726:2: ( rule__SimpleSelector__Alternatives_0_0 )
            // InternalCssDslParser.g:4726:3: rule__SimpleSelector__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelector__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Group_0__0__Impl"


    // $ANTLR start "rule__SimpleSelector__Group_0__1"
    // InternalCssDslParser.g:4734:1: rule__SimpleSelector__Group_0__1 : rule__SimpleSelector__Group_0__1__Impl ;
    public final void rule__SimpleSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4738:1: ( rule__SimpleSelector__Group_0__1__Impl )
            // InternalCssDslParser.g:4739:2: rule__SimpleSelector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Group_0__1"


    // $ANTLR start "rule__SimpleSelector__Group_0__1__Impl"
    // InternalCssDslParser.g:4745:1: rule__SimpleSelector__Group_0__1__Impl : ( ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__SimpleSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4749:1: ( ( ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )* ) )
            // InternalCssDslParser.g:4750:1: ( ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )* )
            {
            // InternalCssDslParser.g:4750:1: ( ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )* )
            // InternalCssDslParser.g:4751:2: ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_0_1()); 
            }
            // InternalCssDslParser.g:4752:2: ( rule__SimpleSelector__SubSelectorsAssignment_0_1 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==FullStop||LA67_0==LeftSquareBracket||LA67_0==RULE_HASHMARK||LA67_0==RULE_COLON) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalCssDslParser.g:4752:3: rule__SimpleSelector__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SimpleSelector__SubSelectorsAssignment_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getSubSelectorsAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__0"
    // InternalCssDslParser.g:4761:1: rule__AttributeSelector__Group__0 : rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 ;
    public final void rule__AttributeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4765:1: ( rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1 )
            // InternalCssDslParser.g:4766:2: rule__AttributeSelector__Group__0__Impl rule__AttributeSelector__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__AttributeSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0"


    // $ANTLR start "rule__AttributeSelector__Group__0__Impl"
    // InternalCssDslParser.g:4773:1: rule__AttributeSelector__Group__0__Impl : ( () ) ;
    public final void rule__AttributeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4777:1: ( ( () ) )
            // InternalCssDslParser.g:4778:1: ( () )
            {
            // InternalCssDslParser.g:4778:1: ( () )
            // InternalCssDslParser.g:4779:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0()); 
            }
            // InternalCssDslParser.g:4780:2: ()
            // InternalCssDslParser.g:4780:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getAttributeSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__1"
    // InternalCssDslParser.g:4788:1: rule__AttributeSelector__Group__1 : rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 ;
    public final void rule__AttributeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4792:1: ( rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2 )
            // InternalCssDslParser.g:4793:2: rule__AttributeSelector__Group__1__Impl rule__AttributeSelector__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AttributeSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__1"


    // $ANTLR start "rule__AttributeSelector__Group__1__Impl"
    // InternalCssDslParser.g:4800:1: rule__AttributeSelector__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__AttributeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4804:1: ( ( LeftSquareBracket ) )
            // InternalCssDslParser.g:4805:1: ( LeftSquareBracket )
            {
            // InternalCssDslParser.g:4805:1: ( LeftSquareBracket )
            // InternalCssDslParser.g:4806:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__1__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__2"
    // InternalCssDslParser.g:4815:1: rule__AttributeSelector__Group__2 : rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 ;
    public final void rule__AttributeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4819:1: ( rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3 )
            // InternalCssDslParser.g:4820:2: rule__AttributeSelector__Group__2__Impl rule__AttributeSelector__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__AttributeSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__2"


    // $ANTLR start "rule__AttributeSelector__Group__2__Impl"
    // InternalCssDslParser.g:4827:1: rule__AttributeSelector__Group__2__Impl : ( ( rule__AttributeSelector__NameAssignment_2 ) ) ;
    public final void rule__AttributeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4831:1: ( ( ( rule__AttributeSelector__NameAssignment_2 ) ) )
            // InternalCssDslParser.g:4832:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
            {
            // InternalCssDslParser.g:4832:1: ( ( rule__AttributeSelector__NameAssignment_2 ) )
            // InternalCssDslParser.g:4833:2: ( rule__AttributeSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2()); 
            }
            // InternalCssDslParser.g:4834:2: ( rule__AttributeSelector__NameAssignment_2 )
            // InternalCssDslParser.g:4834:3: rule__AttributeSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__2__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__3"
    // InternalCssDslParser.g:4842:1: rule__AttributeSelector__Group__3 : rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 ;
    public final void rule__AttributeSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4846:1: ( rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4 )
            // InternalCssDslParser.g:4847:2: rule__AttributeSelector__Group__3__Impl rule__AttributeSelector__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__AttributeSelector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__3"


    // $ANTLR start "rule__AttributeSelector__Group__3__Impl"
    // InternalCssDslParser.g:4854:1: rule__AttributeSelector__Group__3__Impl : ( ( rule__AttributeSelector__Group_3__0 )? ) ;
    public final void rule__AttributeSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4858:1: ( ( ( rule__AttributeSelector__Group_3__0 )? ) )
            // InternalCssDslParser.g:4859:1: ( ( rule__AttributeSelector__Group_3__0 )? )
            {
            // InternalCssDslParser.g:4859:1: ( ( rule__AttributeSelector__Group_3__0 )? )
            // InternalCssDslParser.g:4860:2: ( rule__AttributeSelector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getGroup_3()); 
            }
            // InternalCssDslParser.g:4861:2: ( rule__AttributeSelector__Group_3__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=DollarSignEqualsSign && LA68_0<=AsteriskEqualsSign)||LA68_0==CircumflexAccentEqualsSign||LA68_0==EqualsSign||(LA68_0>=RULE_INCLUDES && LA68_0<=RULE_DASHMATCH)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCssDslParser.g:4861:3: rule__AttributeSelector__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeSelector__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__3__Impl"


    // $ANTLR start "rule__AttributeSelector__Group__4"
    // InternalCssDslParser.g:4869:1: rule__AttributeSelector__Group__4 : rule__AttributeSelector__Group__4__Impl ;
    public final void rule__AttributeSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4873:1: ( rule__AttributeSelector__Group__4__Impl )
            // InternalCssDslParser.g:4874:2: rule__AttributeSelector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__4"


    // $ANTLR start "rule__AttributeSelector__Group__4__Impl"
    // InternalCssDslParser.g:4880:1: rule__AttributeSelector__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__AttributeSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4884:1: ( ( RightSquareBracket ) )
            // InternalCssDslParser.g:4885:1: ( RightSquareBracket )
            {
            // InternalCssDslParser.g:4885:1: ( RightSquareBracket )
            // InternalCssDslParser.g:4886:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group__4__Impl"


    // $ANTLR start "rule__AttributeSelector__Group_3__0"
    // InternalCssDslParser.g:4896:1: rule__AttributeSelector__Group_3__0 : rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 ;
    public final void rule__AttributeSelector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4900:1: ( rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1 )
            // InternalCssDslParser.g:4901:2: rule__AttributeSelector__Group_3__0__Impl rule__AttributeSelector__Group_3__1
            {
            pushFollow(FOLLOW_43);
            rule__AttributeSelector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__0"


    // $ANTLR start "rule__AttributeSelector__Group_3__0__Impl"
    // InternalCssDslParser.g:4908:1: rule__AttributeSelector__Group_3__0__Impl : ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) ;
    public final void rule__AttributeSelector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4912:1: ( ( ( rule__AttributeSelector__OpAssignment_3_0 ) ) )
            // InternalCssDslParser.g:4913:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
            {
            // InternalCssDslParser.g:4913:1: ( ( rule__AttributeSelector__OpAssignment_3_0 ) )
            // InternalCssDslParser.g:4914:2: ( rule__AttributeSelector__OpAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0()); 
            }
            // InternalCssDslParser.g:4915:2: ( rule__AttributeSelector__OpAssignment_3_0 )
            // InternalCssDslParser.g:4915:3: rule__AttributeSelector__OpAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__OpAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getOpAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeSelector__Group_3__1"
    // InternalCssDslParser.g:4923:1: rule__AttributeSelector__Group_3__1 : rule__AttributeSelector__Group_3__1__Impl ;
    public final void rule__AttributeSelector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4927:1: ( rule__AttributeSelector__Group_3__1__Impl )
            // InternalCssDslParser.g:4928:2: rule__AttributeSelector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__1"


    // $ANTLR start "rule__AttributeSelector__Group_3__1__Impl"
    // InternalCssDslParser.g:4934:1: rule__AttributeSelector__Group_3__1__Impl : ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) ;
    public final void rule__AttributeSelector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4938:1: ( ( ( rule__AttributeSelector__ValueAssignment_3_1 ) ) )
            // InternalCssDslParser.g:4939:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
            {
            // InternalCssDslParser.g:4939:1: ( ( rule__AttributeSelector__ValueAssignment_3_1 ) )
            // InternalCssDslParser.g:4940:2: ( rule__AttributeSelector__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1()); 
            }
            // InternalCssDslParser.g:4941:2: ( rule__AttributeSelector__ValueAssignment_3_1 )
            // InternalCssDslParser.g:4941:3: rule__AttributeSelector__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__Group_3__1__Impl"


    // $ANTLR start "rule__ClassSelector__Group__0"
    // InternalCssDslParser.g:4950:1: rule__ClassSelector__Group__0 : rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 ;
    public final void rule__ClassSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4954:1: ( rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1 )
            // InternalCssDslParser.g:4955:2: rule__ClassSelector__Group__0__Impl rule__ClassSelector__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__ClassSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__0"


    // $ANTLR start "rule__ClassSelector__Group__0__Impl"
    // InternalCssDslParser.g:4962:1: rule__ClassSelector__Group__0__Impl : ( () ) ;
    public final void rule__ClassSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4966:1: ( ( () ) )
            // InternalCssDslParser.g:4967:1: ( () )
            {
            // InternalCssDslParser.g:4967:1: ( () )
            // InternalCssDslParser.g:4968:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0()); 
            }
            // InternalCssDslParser.g:4969:2: ()
            // InternalCssDslParser.g:4969:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getClassSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__0__Impl"


    // $ANTLR start "rule__ClassSelector__Group__1"
    // InternalCssDslParser.g:4977:1: rule__ClassSelector__Group__1 : rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 ;
    public final void rule__ClassSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4981:1: ( rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2 )
            // InternalCssDslParser.g:4982:2: rule__ClassSelector__Group__1__Impl rule__ClassSelector__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ClassSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ClassSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__1"


    // $ANTLR start "rule__ClassSelector__Group__1__Impl"
    // InternalCssDslParser.g:4989:1: rule__ClassSelector__Group__1__Impl : ( FullStop ) ;
    public final void rule__ClassSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:4993:1: ( ( FullStop ) )
            // InternalCssDslParser.g:4994:1: ( FullStop )
            {
            // InternalCssDslParser.g:4994:1: ( FullStop )
            // InternalCssDslParser.g:4995:2: FullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1()); 
            }
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__1__Impl"


    // $ANTLR start "rule__ClassSelector__Group__2"
    // InternalCssDslParser.g:5004:1: rule__ClassSelector__Group__2 : rule__ClassSelector__Group__2__Impl ;
    public final void rule__ClassSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5008:1: ( rule__ClassSelector__Group__2__Impl )
            // InternalCssDslParser.g:5009:2: rule__ClassSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__2"


    // $ANTLR start "rule__ClassSelector__Group__2__Impl"
    // InternalCssDslParser.g:5015:1: rule__ClassSelector__Group__2__Impl : ( ( rule__ClassSelector__NameAssignment_2 ) ) ;
    public final void rule__ClassSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5019:1: ( ( ( rule__ClassSelector__NameAssignment_2 ) ) )
            // InternalCssDslParser.g:5020:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
            {
            // InternalCssDslParser.g:5020:1: ( ( rule__ClassSelector__NameAssignment_2 ) )
            // InternalCssDslParser.g:5021:2: ( rule__ClassSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getNameAssignment_2()); 
            }
            // InternalCssDslParser.g:5022:2: ( rule__ClassSelector__NameAssignment_2 )
            // InternalCssDslParser.g:5022:3: rule__ClassSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__Group__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group__0"
    // InternalCssDslParser.g:5031:1: rule__ElementSelector__Group__0 : rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 ;
    public final void rule__ElementSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5035:1: ( rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 )
            // InternalCssDslParser.g:5036:2: rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ElementSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0"


    // $ANTLR start "rule__ElementSelector__Group__0__Impl"
    // InternalCssDslParser.g:5043:1: rule__ElementSelector__Group__0__Impl : ( () ) ;
    public final void rule__ElementSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5047:1: ( ( () ) )
            // InternalCssDslParser.g:5048:1: ( () )
            {
            // InternalCssDslParser.g:5048:1: ( () )
            // InternalCssDslParser.g:5049:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            }
            // InternalCssDslParser.g:5050:2: ()
            // InternalCssDslParser.g:5050:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group__1"
    // InternalCssDslParser.g:5058:1: rule__ElementSelector__Group__1 : rule__ElementSelector__Group__1__Impl ;
    public final void rule__ElementSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5062:1: ( rule__ElementSelector__Group__1__Impl )
            // InternalCssDslParser.g:5063:2: rule__ElementSelector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__1"


    // $ANTLR start "rule__ElementSelector__Group__1__Impl"
    // InternalCssDslParser.g:5069:1: rule__ElementSelector__Group__1__Impl : ( ( rule__ElementSelector__NameAssignment_1 ) ) ;
    public final void rule__ElementSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5073:1: ( ( ( rule__ElementSelector__NameAssignment_1 ) ) )
            // InternalCssDslParser.g:5074:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
            {
            // InternalCssDslParser.g:5074:1: ( ( rule__ElementSelector__NameAssignment_1 ) )
            // InternalCssDslParser.g:5075:2: ( rule__ElementSelector__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getNameAssignment_1()); 
            }
            // InternalCssDslParser.g:5076:2: ( rule__ElementSelector__NameAssignment_1 )
            // InternalCssDslParser.g:5076:3: rule__ElementSelector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__1__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__0"
    // InternalCssDslParser.g:5085:1: rule__UniversalSelector__Group__0 : rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 ;
    public final void rule__UniversalSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5089:1: ( rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1 )
            // InternalCssDslParser.g:5090:2: rule__UniversalSelector__Group__0__Impl rule__UniversalSelector__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__UniversalSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UniversalSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__0"


    // $ANTLR start "rule__UniversalSelector__Group__0__Impl"
    // InternalCssDslParser.g:5097:1: rule__UniversalSelector__Group__0__Impl : ( () ) ;
    public final void rule__UniversalSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5101:1: ( ( () ) )
            // InternalCssDslParser.g:5102:1: ( () )
            {
            // InternalCssDslParser.g:5102:1: ( () )
            // InternalCssDslParser.g:5103:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0()); 
            }
            // InternalCssDslParser.g:5104:2: ()
            // InternalCssDslParser.g:5104:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getUniversalSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__0__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__1"
    // InternalCssDslParser.g:5112:1: rule__UniversalSelector__Group__1 : rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 ;
    public final void rule__UniversalSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5116:1: ( rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2 )
            // InternalCssDslParser.g:5117:2: rule__UniversalSelector__Group__1__Impl rule__UniversalSelector__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__UniversalSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UniversalSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__1"


    // $ANTLR start "rule__UniversalSelector__Group__1__Impl"
    // InternalCssDslParser.g:5124:1: rule__UniversalSelector__Group__1__Impl : ( ( rule__UniversalSelector__NamespaceAssignment_1 )? ) ;
    public final void rule__UniversalSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5128:1: ( ( ( rule__UniversalSelector__NamespaceAssignment_1 )? ) )
            // InternalCssDslParser.g:5129:1: ( ( rule__UniversalSelector__NamespaceAssignment_1 )? )
            {
            // InternalCssDslParser.g:5129:1: ( ( rule__UniversalSelector__NamespaceAssignment_1 )? )
            // InternalCssDslParser.g:5130:2: ( rule__UniversalSelector__NamespaceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getNamespaceAssignment_1()); 
            }
            // InternalCssDslParser.g:5131:2: ( rule__UniversalSelector__NamespaceAssignment_1 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=Not && LA69_0<=Url)||(LA69_0>=No && LA69_0<=Ur)||LA69_0==VerticalLine||(LA69_0>=RULE_ONE_HEX_LETTER && LA69_0<=RULE_DASH)) ) {
                alt69=1;
            }
            else if ( (LA69_0==Asterisk) ) {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==VerticalLine) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // InternalCssDslParser.g:5131:3: rule__UniversalSelector__NamespaceAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UniversalSelector__NamespaceAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__1__Impl"


    // $ANTLR start "rule__UniversalSelector__Group__2"
    // InternalCssDslParser.g:5139:1: rule__UniversalSelector__Group__2 : rule__UniversalSelector__Group__2__Impl ;
    public final void rule__UniversalSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5143:1: ( rule__UniversalSelector__Group__2__Impl )
            // InternalCssDslParser.g:5144:2: rule__UniversalSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UniversalSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__2"


    // $ANTLR start "rule__UniversalSelector__Group__2__Impl"
    // InternalCssDslParser.g:5150:1: rule__UniversalSelector__Group__2__Impl : ( Asterisk ) ;
    public final void rule__UniversalSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5154:1: ( ( Asterisk ) )
            // InternalCssDslParser.g:5155:1: ( Asterisk )
            {
            // InternalCssDslParser.g:5155:1: ( Asterisk )
            // InternalCssDslParser.g:5156:2: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2()); 
            }
            match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getAsteriskKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__Group__2__Impl"


    // $ANTLR start "rule__IdSelector__Group__0"
    // InternalCssDslParser.g:5166:1: rule__IdSelector__Group__0 : rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 ;
    public final void rule__IdSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5170:1: ( rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1 )
            // InternalCssDslParser.g:5171:2: rule__IdSelector__Group__0__Impl rule__IdSelector__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__IdSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdSelector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__0"


    // $ANTLR start "rule__IdSelector__Group__0__Impl"
    // InternalCssDslParser.g:5178:1: rule__IdSelector__Group__0__Impl : ( () ) ;
    public final void rule__IdSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5182:1: ( ( () ) )
            // InternalCssDslParser.g:5183:1: ( () )
            {
            // InternalCssDslParser.g:5183:1: ( () )
            // InternalCssDslParser.g:5184:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0()); 
            }
            // InternalCssDslParser.g:5185:2: ()
            // InternalCssDslParser.g:5185:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getIdSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__0__Impl"


    // $ANTLR start "rule__IdSelector__Group__1"
    // InternalCssDslParser.g:5193:1: rule__IdSelector__Group__1 : rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 ;
    public final void rule__IdSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5197:1: ( rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2 )
            // InternalCssDslParser.g:5198:2: rule__IdSelector__Group__1__Impl rule__IdSelector__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IdSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdSelector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__1"


    // $ANTLR start "rule__IdSelector__Group__1__Impl"
    // InternalCssDslParser.g:5205:1: rule__IdSelector__Group__1__Impl : ( RULE_HASHMARK ) ;
    public final void rule__IdSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5209:1: ( ( RULE_HASHMARK ) )
            // InternalCssDslParser.g:5210:1: ( RULE_HASHMARK )
            {
            // InternalCssDslParser.g:5210:1: ( RULE_HASHMARK )
            // InternalCssDslParser.g:5211:2: RULE_HASHMARK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
            }
            match(input,RULE_HASHMARK,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getHASHMARKTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__1__Impl"


    // $ANTLR start "rule__IdSelector__Group__2"
    // InternalCssDslParser.g:5220:1: rule__IdSelector__Group__2 : rule__IdSelector__Group__2__Impl ;
    public final void rule__IdSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5224:1: ( rule__IdSelector__Group__2__Impl )
            // InternalCssDslParser.g:5225:2: rule__IdSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdSelector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__2"


    // $ANTLR start "rule__IdSelector__Group__2__Impl"
    // InternalCssDslParser.g:5231:1: rule__IdSelector__Group__2__Impl : ( ( rule__IdSelector__NameAssignment_2 ) ) ;
    public final void rule__IdSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5235:1: ( ( ( rule__IdSelector__NameAssignment_2 ) ) )
            // InternalCssDslParser.g:5236:1: ( ( rule__IdSelector__NameAssignment_2 ) )
            {
            // InternalCssDslParser.g:5236:1: ( ( rule__IdSelector__NameAssignment_2 ) )
            // InternalCssDslParser.g:5237:2: ( rule__IdSelector__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getNameAssignment_2()); 
            }
            // InternalCssDslParser.g:5238:2: ( rule__IdSelector__NameAssignment_2 )
            // InternalCssDslParser.g:5238:3: rule__IdSelector__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IdSelector__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__Group__2__Impl"


    // $ANTLR start "rule__CssNamespacePrefix__Group__0"
    // InternalCssDslParser.g:5247:1: rule__CssNamespacePrefix__Group__0 : rule__CssNamespacePrefix__Group__0__Impl rule__CssNamespacePrefix__Group__1 ;
    public final void rule__CssNamespacePrefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5251:1: ( rule__CssNamespacePrefix__Group__0__Impl rule__CssNamespacePrefix__Group__1 )
            // InternalCssDslParser.g:5252:2: rule__CssNamespacePrefix__Group__0__Impl rule__CssNamespacePrefix__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__CssNamespacePrefix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssNamespacePrefix__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssNamespacePrefix__Group__0"


    // $ANTLR start "rule__CssNamespacePrefix__Group__0__Impl"
    // InternalCssDslParser.g:5259:1: rule__CssNamespacePrefix__Group__0__Impl : ( ( rule__CssNamespacePrefix__Alternatives_0 )? ) ;
    public final void rule__CssNamespacePrefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5263:1: ( ( ( rule__CssNamespacePrefix__Alternatives_0 )? ) )
            // InternalCssDslParser.g:5264:1: ( ( rule__CssNamespacePrefix__Alternatives_0 )? )
            {
            // InternalCssDslParser.g:5264:1: ( ( rule__CssNamespacePrefix__Alternatives_0 )? )
            // InternalCssDslParser.g:5265:2: ( rule__CssNamespacePrefix__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssNamespacePrefixAccess().getAlternatives_0()); 
            }
            // InternalCssDslParser.g:5266:2: ( rule__CssNamespacePrefix__Alternatives_0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=Not && LA70_0<=Url)||(LA70_0>=No && LA70_0<=Ur)||LA70_0==Asterisk||(LA70_0>=RULE_ONE_HEX_LETTER && LA70_0<=RULE_DASH)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCssDslParser.g:5266:3: rule__CssNamespacePrefix__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CssNamespacePrefix__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssNamespacePrefixAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssNamespacePrefix__Group__0__Impl"


    // $ANTLR start "rule__CssNamespacePrefix__Group__1"
    // InternalCssDslParser.g:5274:1: rule__CssNamespacePrefix__Group__1 : rule__CssNamespacePrefix__Group__1__Impl ;
    public final void rule__CssNamespacePrefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5278:1: ( rule__CssNamespacePrefix__Group__1__Impl )
            // InternalCssDslParser.g:5279:2: rule__CssNamespacePrefix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssNamespacePrefix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssNamespacePrefix__Group__1"


    // $ANTLR start "rule__CssNamespacePrefix__Group__1__Impl"
    // InternalCssDslParser.g:5285:1: rule__CssNamespacePrefix__Group__1__Impl : ( VerticalLine ) ;
    public final void rule__CssNamespacePrefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5289:1: ( ( VerticalLine ) )
            // InternalCssDslParser.g:5290:1: ( VerticalLine )
            {
            // InternalCssDslParser.g:5290:1: ( VerticalLine )
            // InternalCssDslParser.g:5291:2: VerticalLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssNamespacePrefixAccess().getVerticalLineKeyword_1()); 
            }
            match(input,VerticalLine,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssNamespacePrefixAccess().getVerticalLineKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssNamespacePrefix__Group__1__Impl"


    // $ANTLR start "rule__CssProperty__Group__0"
    // InternalCssDslParser.g:5301:1: rule__CssProperty__Group__0 : rule__CssProperty__Group__0__Impl rule__CssProperty__Group__1 ;
    public final void rule__CssProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5305:1: ( rule__CssProperty__Group__0__Impl rule__CssProperty__Group__1 )
            // InternalCssDslParser.g:5306:2: rule__CssProperty__Group__0__Impl rule__CssProperty__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CssProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssProperty__Group__0"


    // $ANTLR start "rule__CssProperty__Group__0__Impl"
    // InternalCssDslParser.g:5313:1: rule__CssProperty__Group__0__Impl : ( () ) ;
    public final void rule__CssProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5317:1: ( ( () ) )
            // InternalCssDslParser.g:5318:1: ( () )
            {
            // InternalCssDslParser.g:5318:1: ( () )
            // InternalCssDslParser.g:5319:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssPropertyAccess().getCssPropertyAction_0()); 
            }
            // InternalCssDslParser.g:5320:2: ()
            // InternalCssDslParser.g:5320:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssPropertyAccess().getCssPropertyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssProperty__Group__0__Impl"


    // $ANTLR start "rule__CssProperty__Group__1"
    // InternalCssDslParser.g:5328:1: rule__CssProperty__Group__1 : rule__CssProperty__Group__1__Impl ;
    public final void rule__CssProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5332:1: ( rule__CssProperty__Group__1__Impl )
            // InternalCssDslParser.g:5333:2: rule__CssProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssProperty__Group__1"


    // $ANTLR start "rule__CssProperty__Group__1__Impl"
    // InternalCssDslParser.g:5339:1: rule__CssProperty__Group__1__Impl : ( ( rule__CssProperty__NameAssignment_1 ) ) ;
    public final void rule__CssProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5343:1: ( ( ( rule__CssProperty__NameAssignment_1 ) ) )
            // InternalCssDslParser.g:5344:1: ( ( rule__CssProperty__NameAssignment_1 ) )
            {
            // InternalCssDslParser.g:5344:1: ( ( rule__CssProperty__NameAssignment_1 ) )
            // InternalCssDslParser.g:5345:2: ( rule__CssProperty__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssPropertyAccess().getNameAssignment_1()); 
            }
            // InternalCssDslParser.g:5346:2: ( rule__CssProperty__NameAssignment_1 )
            // InternalCssDslParser.g:5346:3: rule__CssProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CssProperty__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssPropertyAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssProperty__Group__1__Impl"


    // $ANTLR start "rule__PseudoClass__Group__0"
    // InternalCssDslParser.g:5355:1: rule__PseudoClass__Group__0 : rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 ;
    public final void rule__PseudoClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5359:1: ( rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1 )
            // InternalCssDslParser.g:5360:2: rule__PseudoClass__Group__0__Impl rule__PseudoClass__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PseudoClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__0"


    // $ANTLR start "rule__PseudoClass__Group__0__Impl"
    // InternalCssDslParser.g:5367:1: rule__PseudoClass__Group__0__Impl : ( RULE_COLON ) ;
    public final void rule__PseudoClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5371:1: ( ( RULE_COLON ) )
            // InternalCssDslParser.g:5372:1: ( RULE_COLON )
            {
            // InternalCssDslParser.g:5372:1: ( RULE_COLON )
            // InternalCssDslParser.g:5373:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__0__Impl"


    // $ANTLR start "rule__PseudoClass__Group__1"
    // InternalCssDslParser.g:5382:1: rule__PseudoClass__Group__1 : rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2 ;
    public final void rule__PseudoClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5386:1: ( rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2 )
            // InternalCssDslParser.g:5387:2: rule__PseudoClass__Group__1__Impl rule__PseudoClass__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__PseudoClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__1"


    // $ANTLR start "rule__PseudoClass__Group__1__Impl"
    // InternalCssDslParser.g:5394:1: rule__PseudoClass__Group__1__Impl : ( ( RULE_COLON )? ) ;
    public final void rule__PseudoClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5398:1: ( ( ( RULE_COLON )? ) )
            // InternalCssDslParser.g:5399:1: ( ( RULE_COLON )? )
            {
            // InternalCssDslParser.g:5399:1: ( ( RULE_COLON )? )
            // InternalCssDslParser.g:5400:2: ( RULE_COLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1()); 
            }
            // InternalCssDslParser.g:5401:2: ( RULE_COLON )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_COLON) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalCssDslParser.g:5401:3: RULE_COLON
                    {
                    match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getCOLONTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__1__Impl"


    // $ANTLR start "rule__PseudoClass__Group__2"
    // InternalCssDslParser.g:5409:1: rule__PseudoClass__Group__2 : rule__PseudoClass__Group__2__Impl ;
    public final void rule__PseudoClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5413:1: ( rule__PseudoClass__Group__2__Impl )
            // InternalCssDslParser.g:5414:2: rule__PseudoClass__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__2"


    // $ANTLR start "rule__PseudoClass__Group__2__Impl"
    // InternalCssDslParser.g:5420:1: rule__PseudoClass__Group__2__Impl : ( ( rule__PseudoClass__NameAssignment_2 ) ) ;
    public final void rule__PseudoClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5424:1: ( ( ( rule__PseudoClass__NameAssignment_2 ) ) )
            // InternalCssDslParser.g:5425:1: ( ( rule__PseudoClass__NameAssignment_2 ) )
            {
            // InternalCssDslParser.g:5425:1: ( ( rule__PseudoClass__NameAssignment_2 ) )
            // InternalCssDslParser.g:5426:2: ( rule__PseudoClass__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getNameAssignment_2()); 
            }
            // InternalCssDslParser.g:5427:2: ( rule__PseudoClass__NameAssignment_2 )
            // InternalCssDslParser.g:5427:3: rule__PseudoClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClass__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__Group__2__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__0"
    // InternalCssDslParser.g:5436:1: rule__PseudoClassFunction__Group_0__0 : rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1 ;
    public final void rule__PseudoClassFunction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5440:1: ( rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1 )
            // InternalCssDslParser.g:5441:2: rule__PseudoClassFunction__Group_0__0__Impl rule__PseudoClassFunction__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__PseudoClassFunction__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__0"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__0__Impl"
    // InternalCssDslParser.g:5448:1: rule__PseudoClassFunction__Group_0__0__Impl : ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) ) ;
    public final void rule__PseudoClassFunction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5452:1: ( ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) ) )
            // InternalCssDslParser.g:5453:1: ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) )
            {
            // InternalCssDslParser.g:5453:1: ( ( rule__PseudoClassFunction__NotAssignment_0_0 ) )
            // InternalCssDslParser.g:5454:2: ( rule__PseudoClassFunction__NotAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNotAssignment_0_0()); 
            }
            // InternalCssDslParser.g:5455:2: ( rule__PseudoClassFunction__NotAssignment_0_0 )
            // InternalCssDslParser.g:5455:3: rule__PseudoClassFunction__NotAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__NotAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNotAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__0__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__1"
    // InternalCssDslParser.g:5463:1: rule__PseudoClassFunction__Group_0__1 : rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2 ;
    public final void rule__PseudoClassFunction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5467:1: ( rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2 )
            // InternalCssDslParser.g:5468:2: rule__PseudoClassFunction__Group_0__1__Impl rule__PseudoClassFunction__Group_0__2
            {
            pushFollow(FOLLOW_48);
            rule__PseudoClassFunction__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__1"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__1__Impl"
    // InternalCssDslParser.g:5475:1: rule__PseudoClassFunction__Group_0__1__Impl : ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) ) ;
    public final void rule__PseudoClassFunction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5479:1: ( ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) ) )
            // InternalCssDslParser.g:5480:1: ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) )
            {
            // InternalCssDslParser.g:5480:1: ( ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 ) )
            // InternalCssDslParser.g:5481:2: ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorAssignment_0_1()); 
            }
            // InternalCssDslParser.g:5482:2: ( rule__PseudoClassFunction__ParamSelectorAssignment_0_1 )
            // InternalCssDslParser.g:5482:3: rule__PseudoClassFunction__ParamSelectorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__ParamSelectorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__1__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__2"
    // InternalCssDslParser.g:5490:1: rule__PseudoClassFunction__Group_0__2 : rule__PseudoClassFunction__Group_0__2__Impl ;
    public final void rule__PseudoClassFunction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5494:1: ( rule__PseudoClassFunction__Group_0__2__Impl )
            // InternalCssDslParser.g:5495:2: rule__PseudoClassFunction__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__2"


    // $ANTLR start "rule__PseudoClassFunction__Group_0__2__Impl"
    // InternalCssDslParser.g:5501:1: rule__PseudoClassFunction__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PseudoClassFunction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5505:1: ( ( RightParenthesis ) )
            // InternalCssDslParser.g:5506:1: ( RightParenthesis )
            {
            // InternalCssDslParser.g:5506:1: ( RightParenthesis )
            // InternalCssDslParser.g:5507:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_0__2__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__0"
    // InternalCssDslParser.g:5517:1: rule__PseudoClassFunction__Group_1__0 : rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1 ;
    public final void rule__PseudoClassFunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5521:1: ( rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1 )
            // InternalCssDslParser.g:5522:2: rule__PseudoClassFunction__Group_1__0__Impl rule__PseudoClassFunction__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__PseudoClassFunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__0"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__0__Impl"
    // InternalCssDslParser.g:5529:1: rule__PseudoClassFunction__Group_1__0__Impl : ( RULE_COLON ) ;
    public final void rule__PseudoClassFunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5533:1: ( ( RULE_COLON ) )
            // InternalCssDslParser.g:5534:1: ( RULE_COLON )
            {
            // InternalCssDslParser.g:5534:1: ( RULE_COLON )
            // InternalCssDslParser.g:5535:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getCOLONTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__0__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__1"
    // InternalCssDslParser.g:5544:1: rule__PseudoClassFunction__Group_1__1 : rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2 ;
    public final void rule__PseudoClassFunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5548:1: ( rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2 )
            // InternalCssDslParser.g:5549:2: rule__PseudoClassFunction__Group_1__1__Impl rule__PseudoClassFunction__Group_1__2
            {
            pushFollow(FOLLOW_49);
            rule__PseudoClassFunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__1"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__1__Impl"
    // InternalCssDslParser.g:5556:1: rule__PseudoClassFunction__Group_1__1__Impl : ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) ) ;
    public final void rule__PseudoClassFunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5560:1: ( ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) ) )
            // InternalCssDslParser.g:5561:1: ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) )
            {
            // InternalCssDslParser.g:5561:1: ( ( rule__PseudoClassFunction__NameAssignment_1_1 ) )
            // InternalCssDslParser.g:5562:2: ( rule__PseudoClassFunction__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_1_1()); 
            }
            // InternalCssDslParser.g:5563:2: ( rule__PseudoClassFunction__NameAssignment_1_1 )
            // InternalCssDslParser.g:5563:3: rule__PseudoClassFunction__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__1__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__2"
    // InternalCssDslParser.g:5571:1: rule__PseudoClassFunction__Group_1__2 : rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3 ;
    public final void rule__PseudoClassFunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5575:1: ( rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3 )
            // InternalCssDslParser.g:5576:2: rule__PseudoClassFunction__Group_1__2__Impl rule__PseudoClassFunction__Group_1__3
            {
            pushFollow(FOLLOW_50);
            rule__PseudoClassFunction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__2"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__2__Impl"
    // InternalCssDslParser.g:5583:1: rule__PseudoClassFunction__Group_1__2__Impl : ( LeftParenthesis ) ;
    public final void rule__PseudoClassFunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5587:1: ( ( LeftParenthesis ) )
            // InternalCssDslParser.g:5588:1: ( LeftParenthesis )
            {
            // InternalCssDslParser.g:5588:1: ( LeftParenthesis )
            // InternalCssDslParser.g:5589:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getLeftParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__2__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__3"
    // InternalCssDslParser.g:5598:1: rule__PseudoClassFunction__Group_1__3 : rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4 ;
    public final void rule__PseudoClassFunction__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5602:1: ( rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4 )
            // InternalCssDslParser.g:5603:2: rule__PseudoClassFunction__Group_1__3__Impl rule__PseudoClassFunction__Group_1__4
            {
            pushFollow(FOLLOW_50);
            rule__PseudoClassFunction__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__3"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__3__Impl"
    // InternalCssDslParser.g:5610:1: rule__PseudoClassFunction__Group_1__3__Impl : ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* ) ;
    public final void rule__PseudoClassFunction__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5614:1: ( ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* ) )
            // InternalCssDslParser.g:5615:1: ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* )
            {
            // InternalCssDslParser.g:5615:1: ( ( rule__PseudoClassFunction__ParamsAssignment_1_3 )* )
            // InternalCssDslParser.g:5616:2: ( rule__PseudoClassFunction__ParamsAssignment_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_1_3()); 
            }
            // InternalCssDslParser.g:5617:2: ( rule__PseudoClassFunction__ParamsAssignment_1_3 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=Url_1 && LA72_0<=Url)||(LA72_0>=No && LA72_0<=Ur)||LA72_0==FullStop||(LA72_0>=RULE_ONE_INT && LA72_0<=RULE_PERCENT)||(LA72_0>=RULE_WS && LA72_0<=RULE_CSSSTRING)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalCssDslParser.g:5617:3: rule__PseudoClassFunction__ParamsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__PseudoClassFunction__ParamsAssignment_1_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamsAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__3__Impl"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__4"
    // InternalCssDslParser.g:5625:1: rule__PseudoClassFunction__Group_1__4 : rule__PseudoClassFunction__Group_1__4__Impl ;
    public final void rule__PseudoClassFunction__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5629:1: ( rule__PseudoClassFunction__Group_1__4__Impl )
            // InternalCssDslParser.g:5630:2: rule__PseudoClassFunction__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassFunction__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__4"


    // $ANTLR start "rule__PseudoClassFunction__Group_1__4__Impl"
    // InternalCssDslParser.g:5636:1: rule__PseudoClassFunction__Group_1__4__Impl : ( RightParenthesis ) ;
    public final void rule__PseudoClassFunction__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5640:1: ( ( RightParenthesis ) )
            // InternalCssDslParser.g:5641:1: ( RightParenthesis )
            {
            // InternalCssDslParser.g:5641:1: ( RightParenthesis )
            // InternalCssDslParser.g:5642:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getRightParenthesisKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__Group_1__4__Impl"


    // $ANTLR start "rule__NotFunctionCall__Group__0"
    // InternalCssDslParser.g:5652:1: rule__NotFunctionCall__Group__0 : rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1 ;
    public final void rule__NotFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5656:1: ( rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1 )
            // InternalCssDslParser.g:5657:2: rule__NotFunctionCall__Group__0__Impl rule__NotFunctionCall__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__NotFunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotFunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFunctionCall__Group__0"


    // $ANTLR start "rule__NotFunctionCall__Group__0__Impl"
    // InternalCssDslParser.g:5664:1: rule__NotFunctionCall__Group__0__Impl : ( RULE_COLON ) ;
    public final void rule__NotFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5668:1: ( ( RULE_COLON ) )
            // InternalCssDslParser.g:5669:1: ( RULE_COLON )
            {
            // InternalCssDslParser.g:5669:1: ( RULE_COLON )
            // InternalCssDslParser.g:5670:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0()); 
            }
            match(input,RULE_COLON,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFunctionCallAccess().getCOLONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__NotFunctionCall__Group__1"
    // InternalCssDslParser.g:5679:1: rule__NotFunctionCall__Group__1 : rule__NotFunctionCall__Group__1__Impl ;
    public final void rule__NotFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5683:1: ( rule__NotFunctionCall__Group__1__Impl )
            // InternalCssDslParser.g:5684:2: rule__NotFunctionCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotFunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFunctionCall__Group__1"


    // $ANTLR start "rule__NotFunctionCall__Group__1__Impl"
    // InternalCssDslParser.g:5690:1: rule__NotFunctionCall__Group__1__Impl : ( Not_1 ) ;
    public final void rule__NotFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5694:1: ( ( Not_1 ) )
            // InternalCssDslParser.g:5695:1: ( Not_1 )
            {
            // InternalCssDslParser.g:5695:1: ( Not_1 )
            // InternalCssDslParser.g:5696:2: Not_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFunctionCallAccess().getNotKeyword_1()); 
            }
            match(input,Not_1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFunctionCallAccess().getNotKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__SymbolTok__Group__0"
    // InternalCssDslParser.g:5706:1: rule__SymbolTok__Group__0 : rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 ;
    public final void rule__SymbolTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5710:1: ( rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1 )
            // InternalCssDslParser.g:5711:2: rule__SymbolTok__Group__0__Impl rule__SymbolTok__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__SymbolTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SymbolTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__0"


    // $ANTLR start "rule__SymbolTok__Group__0__Impl"
    // InternalCssDslParser.g:5718:1: rule__SymbolTok__Group__0__Impl : ( () ) ;
    public final void rule__SymbolTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5722:1: ( ( () ) )
            // InternalCssDslParser.g:5723:1: ( () )
            {
            // InternalCssDslParser.g:5723:1: ( () )
            // InternalCssDslParser.g:5724:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0()); 
            }
            // InternalCssDslParser.g:5725:2: ()
            // InternalCssDslParser.g:5725:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__0__Impl"


    // $ANTLR start "rule__SymbolTok__Group__1"
    // InternalCssDslParser.g:5733:1: rule__SymbolTok__Group__1 : rule__SymbolTok__Group__1__Impl ;
    public final void rule__SymbolTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5737:1: ( rule__SymbolTok__Group__1__Impl )
            // InternalCssDslParser.g:5738:2: rule__SymbolTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SymbolTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__1"


    // $ANTLR start "rule__SymbolTok__Group__1__Impl"
    // InternalCssDslParser.g:5744:1: rule__SymbolTok__Group__1__Impl : ( ( rule__SymbolTok__SymbolAssignment_1 ) ) ;
    public final void rule__SymbolTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5748:1: ( ( ( rule__SymbolTok__SymbolAssignment_1 ) ) )
            // InternalCssDslParser.g:5749:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
            {
            // InternalCssDslParser.g:5749:1: ( ( rule__SymbolTok__SymbolAssignment_1 ) )
            // InternalCssDslParser.g:5750:2: ( rule__SymbolTok__SymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1()); 
            }
            // InternalCssDslParser.g:5751:2: ( rule__SymbolTok__SymbolAssignment_1 )
            // InternalCssDslParser.g:5751:3: rule__SymbolTok__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SymbolTok__SymbolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__Group__1__Impl"


    // $ANTLR start "rule__WSTok__Group__0"
    // InternalCssDslParser.g:5760:1: rule__WSTok__Group__0 : rule__WSTok__Group__0__Impl rule__WSTok__Group__1 ;
    public final void rule__WSTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5764:1: ( rule__WSTok__Group__0__Impl rule__WSTok__Group__1 )
            // InternalCssDslParser.g:5765:2: rule__WSTok__Group__0__Impl rule__WSTok__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__WSTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WSTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__0"


    // $ANTLR start "rule__WSTok__Group__0__Impl"
    // InternalCssDslParser.g:5772:1: rule__WSTok__Group__0__Impl : ( () ) ;
    public final void rule__WSTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5776:1: ( ( () ) )
            // InternalCssDslParser.g:5777:1: ( () )
            {
            // InternalCssDslParser.g:5777:1: ( () )
            // InternalCssDslParser.g:5778:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getWSTokAction_0()); 
            }
            // InternalCssDslParser.g:5779:2: ()
            // InternalCssDslParser.g:5779:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getWSTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__0__Impl"


    // $ANTLR start "rule__WSTok__Group__1"
    // InternalCssDslParser.g:5787:1: rule__WSTok__Group__1 : rule__WSTok__Group__1__Impl ;
    public final void rule__WSTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5791:1: ( rule__WSTok__Group__1__Impl )
            // InternalCssDslParser.g:5792:2: rule__WSTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WSTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__1"


    // $ANTLR start "rule__WSTok__Group__1__Impl"
    // InternalCssDslParser.g:5798:1: rule__WSTok__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__WSTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5802:1: ( ( RULE_WS ) )
            // InternalCssDslParser.g:5803:1: ( RULE_WS )
            {
            // InternalCssDslParser.g:5803:1: ( RULE_WS )
            // InternalCssDslParser.g:5804:2: RULE_WS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
            }
            match(input,RULE_WS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWSTokAccess().getWSTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSTok__Group__1__Impl"


    // $ANTLR start "rule__StringTok__Group__0"
    // InternalCssDslParser.g:5814:1: rule__StringTok__Group__0 : rule__StringTok__Group__0__Impl rule__StringTok__Group__1 ;
    public final void rule__StringTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5818:1: ( rule__StringTok__Group__0__Impl rule__StringTok__Group__1 )
            // InternalCssDslParser.g:5819:2: rule__StringTok__Group__0__Impl rule__StringTok__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__StringTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StringTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__0"


    // $ANTLR start "rule__StringTok__Group__0__Impl"
    // InternalCssDslParser.g:5826:1: rule__StringTok__Group__0__Impl : ( () ) ;
    public final void rule__StringTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5830:1: ( ( () ) )
            // InternalCssDslParser.g:5831:1: ( () )
            {
            // InternalCssDslParser.g:5831:1: ( () )
            // InternalCssDslParser.g:5832:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getStringTokAction_0()); 
            }
            // InternalCssDslParser.g:5833:2: ()
            // InternalCssDslParser.g:5833:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getStringTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__0__Impl"


    // $ANTLR start "rule__StringTok__Group__1"
    // InternalCssDslParser.g:5841:1: rule__StringTok__Group__1 : rule__StringTok__Group__1__Impl ;
    public final void rule__StringTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5845:1: ( rule__StringTok__Group__1__Impl )
            // InternalCssDslParser.g:5846:2: rule__StringTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__1"


    // $ANTLR start "rule__StringTok__Group__1__Impl"
    // InternalCssDslParser.g:5852:1: rule__StringTok__Group__1__Impl : ( ( rule__StringTok__ValueAssignment_1 ) ) ;
    public final void rule__StringTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5856:1: ( ( ( rule__StringTok__ValueAssignment_1 ) ) )
            // InternalCssDslParser.g:5857:1: ( ( rule__StringTok__ValueAssignment_1 ) )
            {
            // InternalCssDslParser.g:5857:1: ( ( rule__StringTok__ValueAssignment_1 ) )
            // InternalCssDslParser.g:5858:2: ( rule__StringTok__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getValueAssignment_1()); 
            }
            // InternalCssDslParser.g:5859:2: ( rule__StringTok__ValueAssignment_1 )
            // InternalCssDslParser.g:5859:3: rule__StringTok__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringTok__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__Group__1__Impl"


    // $ANTLR start "rule__NumberTok__Group__0"
    // InternalCssDslParser.g:5868:1: rule__NumberTok__Group__0 : rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 ;
    public final void rule__NumberTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5872:1: ( rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1 )
            // InternalCssDslParser.g:5873:2: rule__NumberTok__Group__0__Impl rule__NumberTok__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NumberTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NumberTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__0"


    // $ANTLR start "rule__NumberTok__Group__0__Impl"
    // InternalCssDslParser.g:5880:1: rule__NumberTok__Group__0__Impl : ( () ) ;
    public final void rule__NumberTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5884:1: ( ( () ) )
            // InternalCssDslParser.g:5885:1: ( () )
            {
            // InternalCssDslParser.g:5885:1: ( () )
            // InternalCssDslParser.g:5886:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getNumberTokAction_0()); 
            }
            // InternalCssDslParser.g:5887:2: ()
            // InternalCssDslParser.g:5887:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getNumberTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__0__Impl"


    // $ANTLR start "rule__NumberTok__Group__1"
    // InternalCssDslParser.g:5895:1: rule__NumberTok__Group__1 : rule__NumberTok__Group__1__Impl ;
    public final void rule__NumberTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5899:1: ( rule__NumberTok__Group__1__Impl )
            // InternalCssDslParser.g:5900:2: rule__NumberTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__1"


    // $ANTLR start "rule__NumberTok__Group__1__Impl"
    // InternalCssDslParser.g:5906:1: rule__NumberTok__Group__1__Impl : ( ( rule__NumberTok__ValAssignment_1 ) ) ;
    public final void rule__NumberTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5910:1: ( ( ( rule__NumberTok__ValAssignment_1 ) ) )
            // InternalCssDslParser.g:5911:1: ( ( rule__NumberTok__ValAssignment_1 ) )
            {
            // InternalCssDslParser.g:5911:1: ( ( rule__NumberTok__ValAssignment_1 ) )
            // InternalCssDslParser.g:5912:2: ( rule__NumberTok__ValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getValAssignment_1()); 
            }
            // InternalCssDslParser.g:5913:2: ( rule__NumberTok__ValAssignment_1 )
            // InternalCssDslParser.g:5913:3: rule__NumberTok__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberTok__ValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getValAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__Group__1__Impl"


    // $ANTLR start "rule__UrlTok__Group__0"
    // InternalCssDslParser.g:5922:1: rule__UrlTok__Group__0 : rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 ;
    public final void rule__UrlTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5926:1: ( rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1 )
            // InternalCssDslParser.g:5927:2: rule__UrlTok__Group__0__Impl rule__UrlTok__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UrlTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UrlTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__0"


    // $ANTLR start "rule__UrlTok__Group__0__Impl"
    // InternalCssDslParser.g:5934:1: rule__UrlTok__Group__0__Impl : ( () ) ;
    public final void rule__UrlTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5938:1: ( ( () ) )
            // InternalCssDslParser.g:5939:1: ( () )
            {
            // InternalCssDslParser.g:5939:1: ( () )
            // InternalCssDslParser.g:5940:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlTokAction_0()); 
            }
            // InternalCssDslParser.g:5941:2: ()
            // InternalCssDslParser.g:5941:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__0__Impl"


    // $ANTLR start "rule__UrlTok__Group__1"
    // InternalCssDslParser.g:5949:1: rule__UrlTok__Group__1 : rule__UrlTok__Group__1__Impl ;
    public final void rule__UrlTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5953:1: ( rule__UrlTok__Group__1__Impl )
            // InternalCssDslParser.g:5954:2: rule__UrlTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UrlTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__1"


    // $ANTLR start "rule__UrlTok__Group__1__Impl"
    // InternalCssDslParser.g:5960:1: rule__UrlTok__Group__1__Impl : ( ( rule__UrlTok__UrlAssignment_1 ) ) ;
    public final void rule__UrlTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5964:1: ( ( ( rule__UrlTok__UrlAssignment_1 ) ) )
            // InternalCssDslParser.g:5965:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
            {
            // InternalCssDslParser.g:5965:1: ( ( rule__UrlTok__UrlAssignment_1 ) )
            // InternalCssDslParser.g:5966:2: ( rule__UrlTok__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlAssignment_1()); 
            }
            // InternalCssDslParser.g:5967:2: ( rule__UrlTok__UrlAssignment_1 )
            // InternalCssDslParser.g:5967:3: rule__UrlTok__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UrlTok__UrlAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__Group__1__Impl"


    // $ANTLR start "rule__ColorTok__Group__0"
    // InternalCssDslParser.g:5976:1: rule__ColorTok__Group__0 : rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 ;
    public final void rule__ColorTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5980:1: ( rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1 )
            // InternalCssDslParser.g:5981:2: rule__ColorTok__Group__0__Impl rule__ColorTok__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ColorTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ColorTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__0"


    // $ANTLR start "rule__ColorTok__Group__0__Impl"
    // InternalCssDslParser.g:5988:1: rule__ColorTok__Group__0__Impl : ( () ) ;
    public final void rule__ColorTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:5992:1: ( ( () ) )
            // InternalCssDslParser.g:5993:1: ( () )
            {
            // InternalCssDslParser.g:5993:1: ( () )
            // InternalCssDslParser.g:5994:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getColorTokAction_0()); 
            }
            // InternalCssDslParser.g:5995:2: ()
            // InternalCssDslParser.g:5995:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getColorTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__0__Impl"


    // $ANTLR start "rule__ColorTok__Group__1"
    // InternalCssDslParser.g:6003:1: rule__ColorTok__Group__1 : rule__ColorTok__Group__1__Impl ;
    public final void rule__ColorTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6007:1: ( rule__ColorTok__Group__1__Impl )
            // InternalCssDslParser.g:6008:2: rule__ColorTok__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__1"


    // $ANTLR start "rule__ColorTok__Group__1__Impl"
    // InternalCssDslParser.g:6014:1: rule__ColorTok__Group__1__Impl : ( ( rule__ColorTok__ValueAssignment_1 ) ) ;
    public final void rule__ColorTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6018:1: ( ( ( rule__ColorTok__ValueAssignment_1 ) ) )
            // InternalCssDslParser.g:6019:1: ( ( rule__ColorTok__ValueAssignment_1 ) )
            {
            // InternalCssDslParser.g:6019:1: ( ( rule__ColorTok__ValueAssignment_1 ) )
            // InternalCssDslParser.g:6020:2: ( rule__ColorTok__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getValueAssignment_1()); 
            }
            // InternalCssDslParser.g:6021:2: ( rule__ColorTok__ValueAssignment_1 )
            // InternalCssDslParser.g:6021:3: rule__ColorTok__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColorTok__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__Group__1__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__0"
    // InternalCssDslParser.g:6030:1: rule__IdentifierOrFuncTok__Group__0 : rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1 ;
    public final void rule__IdentifierOrFuncTok__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6034:1: ( rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1 )
            // InternalCssDslParser.g:6035:2: rule__IdentifierOrFuncTok__Group__0__Impl rule__IdentifierOrFuncTok__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__IdentifierOrFuncTok__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__0"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__0__Impl"
    // InternalCssDslParser.g:6042:1: rule__IdentifierOrFuncTok__Group__0__Impl : ( () ) ;
    public final void rule__IdentifierOrFuncTok__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6046:1: ( ( () ) )
            // InternalCssDslParser.g:6047:1: ( () )
            {
            // InternalCssDslParser.g:6047:1: ( () )
            // InternalCssDslParser.g:6048:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0()); 
            }
            // InternalCssDslParser.g:6049:2: ()
            // InternalCssDslParser.g:6049:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getIdentifierTokAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__0__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__1"
    // InternalCssDslParser.g:6057:1: rule__IdentifierOrFuncTok__Group__1 : rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2 ;
    public final void rule__IdentifierOrFuncTok__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6061:1: ( rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2 )
            // InternalCssDslParser.g:6062:2: rule__IdentifierOrFuncTok__Group__1__Impl rule__IdentifierOrFuncTok__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__IdentifierOrFuncTok__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__1"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__1__Impl"
    // InternalCssDslParser.g:6069:1: rule__IdentifierOrFuncTok__Group__1__Impl : ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) ) ;
    public final void rule__IdentifierOrFuncTok__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6073:1: ( ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) ) )
            // InternalCssDslParser.g:6074:1: ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) )
            {
            // InternalCssDslParser.g:6074:1: ( ( rule__IdentifierOrFuncTok__NameAssignment_1 ) )
            // InternalCssDslParser.g:6075:2: ( rule__IdentifierOrFuncTok__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getNameAssignment_1()); 
            }
            // InternalCssDslParser.g:6076:2: ( rule__IdentifierOrFuncTok__NameAssignment_1 )
            // InternalCssDslParser.g:6076:3: rule__IdentifierOrFuncTok__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__1__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__2"
    // InternalCssDslParser.g:6084:1: rule__IdentifierOrFuncTok__Group__2 : rule__IdentifierOrFuncTok__Group__2__Impl ;
    public final void rule__IdentifierOrFuncTok__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6088:1: ( rule__IdentifierOrFuncTok__Group__2__Impl )
            // InternalCssDslParser.g:6089:2: rule__IdentifierOrFuncTok__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__2"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group__2__Impl"
    // InternalCssDslParser.g:6095:1: rule__IdentifierOrFuncTok__Group__2__Impl : ( ( rule__IdentifierOrFuncTok__Group_2__0 )? ) ;
    public final void rule__IdentifierOrFuncTok__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6099:1: ( ( ( rule__IdentifierOrFuncTok__Group_2__0 )? ) )
            // InternalCssDslParser.g:6100:1: ( ( rule__IdentifierOrFuncTok__Group_2__0 )? )
            {
            // InternalCssDslParser.g:6100:1: ( ( rule__IdentifierOrFuncTok__Group_2__0 )? )
            // InternalCssDslParser.g:6101:2: ( rule__IdentifierOrFuncTok__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getGroup_2()); 
            }
            // InternalCssDslParser.g:6102:2: ( rule__IdentifierOrFuncTok__Group_2__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==LeftParenthesis) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalCssDslParser.g:6102:3: rule__IdentifierOrFuncTok__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IdentifierOrFuncTok__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group__2__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__0"
    // InternalCssDslParser.g:6111:1: rule__IdentifierOrFuncTok__Group_2__0 : rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1 ;
    public final void rule__IdentifierOrFuncTok__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6115:1: ( rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1 )
            // InternalCssDslParser.g:6116:2: rule__IdentifierOrFuncTok__Group_2__0__Impl rule__IdentifierOrFuncTok__Group_2__1
            {
            pushFollow(FOLLOW_49);
            rule__IdentifierOrFuncTok__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__0"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__0__Impl"
    // InternalCssDslParser.g:6123:1: rule__IdentifierOrFuncTok__Group_2__0__Impl : ( () ) ;
    public final void rule__IdentifierOrFuncTok__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6127:1: ( ( () ) )
            // InternalCssDslParser.g:6128:1: ( () )
            {
            // InternalCssDslParser.g:6128:1: ( () )
            // InternalCssDslParser.g:6129:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0()); 
            }
            // InternalCssDslParser.g:6130:2: ()
            // InternalCssDslParser.g:6130:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getFuncTokNameAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__0__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__1"
    // InternalCssDslParser.g:6138:1: rule__IdentifierOrFuncTok__Group_2__1 : rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2 ;
    public final void rule__IdentifierOrFuncTok__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6142:1: ( rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2 )
            // InternalCssDslParser.g:6143:2: rule__IdentifierOrFuncTok__Group_2__1__Impl rule__IdentifierOrFuncTok__Group_2__2
            {
            pushFollow(FOLLOW_33);
            rule__IdentifierOrFuncTok__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__1"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__1__Impl"
    // InternalCssDslParser.g:6150:1: rule__IdentifierOrFuncTok__Group_2__1__Impl : ( LeftParenthesis ) ;
    public final void rule__IdentifierOrFuncTok__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6154:1: ( ( LeftParenthesis ) )
            // InternalCssDslParser.g:6155:1: ( LeftParenthesis )
            {
            // InternalCssDslParser.g:6155:1: ( LeftParenthesis )
            // InternalCssDslParser.g:6156:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getLeftParenthesisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__1__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__2"
    // InternalCssDslParser.g:6165:1: rule__IdentifierOrFuncTok__Group_2__2 : rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3 ;
    public final void rule__IdentifierOrFuncTok__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6169:1: ( rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3 )
            // InternalCssDslParser.g:6170:2: rule__IdentifierOrFuncTok__Group_2__2__Impl rule__IdentifierOrFuncTok__Group_2__3
            {
            pushFollow(FOLLOW_48);
            rule__IdentifierOrFuncTok__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__2"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__2__Impl"
    // InternalCssDslParser.g:6177:1: rule__IdentifierOrFuncTok__Group_2__2__Impl : ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) ) ;
    public final void rule__IdentifierOrFuncTok__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6181:1: ( ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) ) )
            // InternalCssDslParser.g:6182:1: ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) )
            {
            // InternalCssDslParser.g:6182:1: ( ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* ) )
            // InternalCssDslParser.g:6183:2: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) ) ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* )
            {
            // InternalCssDslParser.g:6183:2: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 ) )
            // InternalCssDslParser.g:6184:3: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2()); 
            }
            // InternalCssDslParser.g:6185:3: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )
            // InternalCssDslParser.g:6185:4: rule__IdentifierOrFuncTok__ParamsAssignment_2_2
            {
            pushFollow(FOLLOW_35);
            rule__IdentifierOrFuncTok__ParamsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2()); 
            }

            }

            // InternalCssDslParser.g:6188:2: ( ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )* )
            // InternalCssDslParser.g:6189:3: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2()); 
            }
            // InternalCssDslParser.g:6190:3: ( rule__IdentifierOrFuncTok__ParamsAssignment_2_2 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=Url_1 && LA74_0<=Url)||(LA74_0>=No && LA74_0<=Ur)||LA74_0==FullStop||(LA74_0>=RULE_ONE_INT && LA74_0<=RULE_PERCENT)||(LA74_0>=RULE_WS && LA74_0<=RULE_CSSSTRING)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalCssDslParser.g:6190:4: rule__IdentifierOrFuncTok__ParamsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__IdentifierOrFuncTok__ParamsAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsAssignment_2_2()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__2__Impl"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__3"
    // InternalCssDslParser.g:6199:1: rule__IdentifierOrFuncTok__Group_2__3 : rule__IdentifierOrFuncTok__Group_2__3__Impl ;
    public final void rule__IdentifierOrFuncTok__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6203:1: ( rule__IdentifierOrFuncTok__Group_2__3__Impl )
            // InternalCssDslParser.g:6204:2: rule__IdentifierOrFuncTok__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierOrFuncTok__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__3"


    // $ANTLR start "rule__IdentifierOrFuncTok__Group_2__3__Impl"
    // InternalCssDslParser.g:6210:1: rule__IdentifierOrFuncTok__Group_2__3__Impl : ( RightParenthesis ) ;
    public final void rule__IdentifierOrFuncTok__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6214:1: ( ( RightParenthesis ) )
            // InternalCssDslParser.g:6215:1: ( RightParenthesis )
            {
            // InternalCssDslParser.g:6215:1: ( RightParenthesis )
            // InternalCssDslParser.g:6216:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__Group_2__3__Impl"


    // $ANTLR start "rule__URLType__Group__0"
    // InternalCssDslParser.g:6226:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
    public final void rule__URLType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6230:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
            // InternalCssDslParser.g:6231:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__URLType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__URLType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0"


    // $ANTLR start "rule__URLType__Group__0__Impl"
    // InternalCssDslParser.g:6238:1: rule__URLType__Group__0__Impl : ( Url_1 ) ;
    public final void rule__URLType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6242:1: ( ( Url_1 ) )
            // InternalCssDslParser.g:6243:1: ( Url_1 )
            {
            // InternalCssDslParser.g:6243:1: ( Url_1 )
            // InternalCssDslParser.g:6244:2: Url_1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            }
            match(input,Url_1,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0__Impl"


    // $ANTLR start "rule__URLType__Group__1"
    // InternalCssDslParser.g:6253:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
    public final void rule__URLType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6257:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
            // InternalCssDslParser.g:6258:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__URLType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__URLType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1"


    // $ANTLR start "rule__URLType__Group__1__Impl"
    // InternalCssDslParser.g:6265:1: rule__URLType__Group__1__Impl : ( ( rule__URLType__UrlAssignment_1 ) ) ;
    public final void rule__URLType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6269:1: ( ( ( rule__URLType__UrlAssignment_1 ) ) )
            // InternalCssDslParser.g:6270:1: ( ( rule__URLType__UrlAssignment_1 ) )
            {
            // InternalCssDslParser.g:6270:1: ( ( rule__URLType__UrlAssignment_1 ) )
            // InternalCssDslParser.g:6271:2: ( rule__URLType__UrlAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlAssignment_1()); 
            }
            // InternalCssDslParser.g:6272:2: ( rule__URLType__UrlAssignment_1 )
            // InternalCssDslParser.g:6272:3: rule__URLType__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__URLType__UrlAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1__Impl"


    // $ANTLR start "rule__URLType__Group__2"
    // InternalCssDslParser.g:6280:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl ;
    public final void rule__URLType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6284:1: ( rule__URLType__Group__2__Impl )
            // InternalCssDslParser.g:6285:2: rule__URLType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URLType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2"


    // $ANTLR start "rule__URLType__Group__2__Impl"
    // InternalCssDslParser.g:6291:1: rule__URLType__Group__2__Impl : ( RightParenthesis ) ;
    public final void rule__URLType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6295:1: ( ( RightParenthesis ) )
            // InternalCssDslParser.g:6296:1: ( RightParenthesis )
            {
            // InternalCssDslParser.g:6296:1: ( RightParenthesis )
            // InternalCssDslParser.g:6297:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2__Impl"


    // $ANTLR start "rule__ValidURLSymbol__Group_18__0"
    // InternalCssDslParser.g:6307:1: rule__ValidURLSymbol__Group_18__0 : rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1 ;
    public final void rule__ValidURLSymbol__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6311:1: ( rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1 )
            // InternalCssDslParser.g:6312:2: rule__ValidURLSymbol__Group_18__0__Impl rule__ValidURLSymbol__Group_18__1
            {
            pushFollow(FOLLOW_54);
            rule__ValidURLSymbol__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ValidURLSymbol__Group_18__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURLSymbol__Group_18__0"


    // $ANTLR start "rule__ValidURLSymbol__Group_18__0__Impl"
    // InternalCssDslParser.g:6319:1: rule__ValidURLSymbol__Group_18__0__Impl : ( EqualsSign ) ;
    public final void rule__ValidURLSymbol__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6323:1: ( ( EqualsSign ) )
            // InternalCssDslParser.g:6324:1: ( EqualsSign )
            {
            // InternalCssDslParser.g:6324:1: ( EqualsSign )
            // InternalCssDslParser.g:6325:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLSymbolAccess().getEqualsSignKeyword_18_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURLSymbol__Group_18__0__Impl"


    // $ANTLR start "rule__ValidURLSymbol__Group_18__1"
    // InternalCssDslParser.g:6334:1: rule__ValidURLSymbol__Group_18__1 : rule__ValidURLSymbol__Group_18__1__Impl ;
    public final void rule__ValidURLSymbol__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6338:1: ( rule__ValidURLSymbol__Group_18__1__Impl )
            // InternalCssDslParser.g:6339:2: rule__ValidURLSymbol__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidURLSymbol__Group_18__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURLSymbol__Group_18__1"


    // $ANTLR start "rule__ValidURLSymbol__Group_18__1__Impl"
    // InternalCssDslParser.g:6345:1: rule__ValidURLSymbol__Group_18__1__Impl : ( ruleKeywordHack ) ;
    public final void rule__ValidURLSymbol__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6349:1: ( ( ruleKeywordHack ) )
            // InternalCssDslParser.g:6350:1: ( ruleKeywordHack )
            {
            // InternalCssDslParser.g:6350:1: ( ruleKeywordHack )
            // InternalCssDslParser.g:6351:2: ruleKeywordHack
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeywordHack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLSymbolAccess().getKeywordHackParserRuleCall_18_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURLSymbol__Group_18__1__Impl"


    // $ANTLR start "rule__ValidURL__Group_1_10__0"
    // InternalCssDslParser.g:6361:1: rule__ValidURL__Group_1_10__0 : rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1 ;
    public final void rule__ValidURL__Group_1_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6365:1: ( rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1 )
            // InternalCssDslParser.g:6366:2: rule__ValidURL__Group_1_10__0__Impl rule__ValidURL__Group_1_10__1
            {
            pushFollow(FOLLOW_55);
            rule__ValidURL__Group_1_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ValidURL__Group_1_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__0"


    // $ANTLR start "rule__ValidURL__Group_1_10__0__Impl"
    // InternalCssDslParser.g:6373:1: rule__ValidURL__Group_1_10__0__Impl : ( RULE_PERCENT ) ;
    public final void rule__ValidURL__Group_1_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6377:1: ( ( RULE_PERCENT ) )
            // InternalCssDslParser.g:6378:1: ( RULE_PERCENT )
            {
            // InternalCssDslParser.g:6378:1: ( RULE_PERCENT )
            // InternalCssDslParser.g:6379:2: RULE_PERCENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0()); 
            }
            match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLAccess().getPERCENTTerminalRuleCall_1_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__0__Impl"


    // $ANTLR start "rule__ValidURL__Group_1_10__1"
    // InternalCssDslParser.g:6388:1: rule__ValidURL__Group_1_10__1 : rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2 ;
    public final void rule__ValidURL__Group_1_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6392:1: ( rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2 )
            // InternalCssDslParser.g:6393:2: rule__ValidURL__Group_1_10__1__Impl rule__ValidURL__Group_1_10__2
            {
            pushFollow(FOLLOW_55);
            rule__ValidURL__Group_1_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ValidURL__Group_1_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__1"


    // $ANTLR start "rule__ValidURL__Group_1_10__1__Impl"
    // InternalCssDslParser.g:6400:1: rule__ValidURL__Group_1_10__1__Impl : ( ( rule__ValidURL__Alternatives_1_10_1 ) ) ;
    public final void rule__ValidURL__Group_1_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6404:1: ( ( ( rule__ValidURL__Alternatives_1_10_1 ) ) )
            // InternalCssDslParser.g:6405:1: ( ( rule__ValidURL__Alternatives_1_10_1 ) )
            {
            // InternalCssDslParser.g:6405:1: ( ( rule__ValidURL__Alternatives_1_10_1 ) )
            // InternalCssDslParser.g:6406:2: ( rule__ValidURL__Alternatives_1_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLAccess().getAlternatives_1_10_1()); 
            }
            // InternalCssDslParser.g:6407:2: ( rule__ValidURL__Alternatives_1_10_1 )
            // InternalCssDslParser.g:6407:3: rule__ValidURL__Alternatives_1_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidURL__Alternatives_1_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLAccess().getAlternatives_1_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__1__Impl"


    // $ANTLR start "rule__ValidURL__Group_1_10__2"
    // InternalCssDslParser.g:6415:1: rule__ValidURL__Group_1_10__2 : rule__ValidURL__Group_1_10__2__Impl ;
    public final void rule__ValidURL__Group_1_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6419:1: ( rule__ValidURL__Group_1_10__2__Impl )
            // InternalCssDslParser.g:6420:2: rule__ValidURL__Group_1_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidURL__Group_1_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__2"


    // $ANTLR start "rule__ValidURL__Group_1_10__2__Impl"
    // InternalCssDslParser.g:6426:1: rule__ValidURL__Group_1_10__2__Impl : ( ( rule__ValidURL__Alternatives_1_10_2 ) ) ;
    public final void rule__ValidURL__Group_1_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6430:1: ( ( ( rule__ValidURL__Alternatives_1_10_2 ) ) )
            // InternalCssDslParser.g:6431:1: ( ( rule__ValidURL__Alternatives_1_10_2 ) )
            {
            // InternalCssDslParser.g:6431:1: ( ( rule__ValidURL__Alternatives_1_10_2 ) )
            // InternalCssDslParser.g:6432:2: ( rule__ValidURL__Alternatives_1_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidURLAccess().getAlternatives_1_10_2()); 
            }
            // InternalCssDslParser.g:6433:2: ( rule__ValidURL__Alternatives_1_10_2 )
            // InternalCssDslParser.g:6433:3: rule__ValidURL__Alternatives_1_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ValidURL__Alternatives_1_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidURLAccess().getAlternatives_1_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidURL__Group_1_10__2__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalCssDslParser.g:6442:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6446:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalCssDslParser.g:6447:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Identifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // InternalCssDslParser.g:6454:1: rule__Identifier__Group__0__Impl : ( ( RULE_DASH )? ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6458:1: ( ( ( RULE_DASH )? ) )
            // InternalCssDslParser.g:6459:1: ( ( RULE_DASH )? )
            {
            // InternalCssDslParser.g:6459:1: ( ( RULE_DASH )? )
            // InternalCssDslParser.g:6460:2: ( RULE_DASH )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0()); 
            }
            // InternalCssDslParser.g:6461:2: ( RULE_DASH )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_DASH) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCssDslParser.g:6461:3: RULE_DASH
                    {
                    match(input,RULE_DASH,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // InternalCssDslParser.g:6469:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6473:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalCssDslParser.g:6474:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__Identifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // InternalCssDslParser.g:6481:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Alternatives_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6485:1: ( ( ( rule__Identifier__Alternatives_1 ) ) )
            // InternalCssDslParser.g:6486:1: ( ( rule__Identifier__Alternatives_1 ) )
            {
            // InternalCssDslParser.g:6486:1: ( ( rule__Identifier__Alternatives_1 ) )
            // InternalCssDslParser.g:6487:2: ( rule__Identifier__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getAlternatives_1()); 
            }
            // InternalCssDslParser.g:6488:2: ( rule__Identifier__Alternatives_1 )
            // InternalCssDslParser.g:6488:3: rule__Identifier__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__2"
    // InternalCssDslParser.g:6496:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6500:1: ( rule__Identifier__Group__2__Impl )
            // InternalCssDslParser.g:6501:2: rule__Identifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2"


    // $ANTLR start "rule__Identifier__Group__2__Impl"
    // InternalCssDslParser.g:6507:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__Group_2__0 )* ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6511:1: ( ( ( rule__Identifier__Group_2__0 )* ) )
            // InternalCssDslParser.g:6512:1: ( ( rule__Identifier__Group_2__0 )* )
            {
            // InternalCssDslParser.g:6512:1: ( ( rule__Identifier__Group_2__0 )* )
            // InternalCssDslParser.g:6513:2: ( rule__Identifier__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getGroup_2()); 
            }
            // InternalCssDslParser.g:6514:2: ( rule__Identifier__Group_2__0 )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // InternalCssDslParser.g:6514:3: rule__Identifier__Group_2__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__Identifier__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2__Impl"


    // $ANTLR start "rule__Identifier__Group_2__0"
    // InternalCssDslParser.g:6523:1: rule__Identifier__Group_2__0 : rule__Identifier__Group_2__0__Impl ;
    public final void rule__Identifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6527:1: ( rule__Identifier__Group_2__0__Impl )
            // InternalCssDslParser.g:6528:2: rule__Identifier__Group_2__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__0"


    // $ANTLR start "rule__Identifier__Group_2__0__Impl"
    // InternalCssDslParser.g:6534:1: rule__Identifier__Group_2__0__Impl : ( ( rule__Identifier__Alternatives_2_0 ) ) ;
    public final void rule__Identifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6538:1: ( ( ( rule__Identifier__Alternatives_2_0 ) ) )
            // InternalCssDslParser.g:6539:1: ( ( rule__Identifier__Alternatives_2_0 ) )
            {
            // InternalCssDslParser.g:6539:1: ( ( rule__Identifier__Alternatives_2_0 ) )
            // InternalCssDslParser.g:6540:2: ( rule__Identifier__Alternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getAlternatives_2_0()); 
            }
            // InternalCssDslParser.g:6541:2: ( rule__Identifier__Alternatives_2_0 )
            // InternalCssDslParser.g:6541:3: rule__Identifier__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Alternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_2__0__Impl"


    // $ANTLR start "rule__Num__Group__0"
    // InternalCssDslParser.g:6550:1: rule__Num__Group__0 : rule__Num__Group__0__Impl rule__Num__Group__1 ;
    public final void rule__Num__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6554:1: ( rule__Num__Group__0__Impl rule__Num__Group__1 )
            // InternalCssDslParser.g:6555:2: rule__Num__Group__0__Impl rule__Num__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Num__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Num__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group__0"


    // $ANTLR start "rule__Num__Group__0__Impl"
    // InternalCssDslParser.g:6562:1: rule__Num__Group__0__Impl : ( ( rule__Num__Alternatives_0 )? ) ;
    public final void rule__Num__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6566:1: ( ( ( rule__Num__Alternatives_0 )? ) )
            // InternalCssDslParser.g:6567:1: ( ( rule__Num__Alternatives_0 )? )
            {
            // InternalCssDslParser.g:6567:1: ( ( rule__Num__Alternatives_0 )? )
            // InternalCssDslParser.g:6568:2: ( rule__Num__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getAlternatives_0()); 
            }
            // InternalCssDslParser.g:6569:2: ( rule__Num__Alternatives_0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_DASH && LA77_0<=RULE_PLUS)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCssDslParser.g:6569:3: rule__Num__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group__0__Impl"


    // $ANTLR start "rule__Num__Group__1"
    // InternalCssDslParser.g:6577:1: rule__Num__Group__1 : rule__Num__Group__1__Impl ;
    public final void rule__Num__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6581:1: ( rule__Num__Group__1__Impl )
            // InternalCssDslParser.g:6582:2: rule__Num__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Num__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group__1"


    // $ANTLR start "rule__Num__Group__1__Impl"
    // InternalCssDslParser.g:6588:1: rule__Num__Group__1__Impl : ( ( rule__Num__Alternatives_1 ) ) ;
    public final void rule__Num__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6592:1: ( ( ( rule__Num__Alternatives_1 ) ) )
            // InternalCssDslParser.g:6593:1: ( ( rule__Num__Alternatives_1 ) )
            {
            // InternalCssDslParser.g:6593:1: ( ( rule__Num__Alternatives_1 ) )
            // InternalCssDslParser.g:6594:2: ( rule__Num__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getAlternatives_1()); 
            }
            // InternalCssDslParser.g:6595:2: ( rule__Num__Alternatives_1 )
            // InternalCssDslParser.g:6595:3: rule__Num__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Num__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group__1__Impl"


    // $ANTLR start "rule__Num__Group_1_0__0"
    // InternalCssDslParser.g:6604:1: rule__Num__Group_1_0__0 : rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1 ;
    public final void rule__Num__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6608:1: ( rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1 )
            // InternalCssDslParser.g:6609:2: rule__Num__Group_1_0__0__Impl rule__Num__Group_1_0__1
            {
            pushFollow(FOLLOW_58);
            rule__Num__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_0__0"


    // $ANTLR start "rule__Num__Group_1_0__0__Impl"
    // InternalCssDslParser.g:6616:1: rule__Num__Group_1_0__0__Impl : ( FullStop ) ;
    public final void rule__Num__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6620:1: ( ( FullStop ) )
            // InternalCssDslParser.g:6621:1: ( FullStop )
            {
            // InternalCssDslParser.g:6621:1: ( FullStop )
            // InternalCssDslParser.g:6622:2: FullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getFullStopKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_0__0__Impl"


    // $ANTLR start "rule__Num__Group_1_0__1"
    // InternalCssDslParser.g:6631:1: rule__Num__Group_1_0__1 : rule__Num__Group_1_0__1__Impl ;
    public final void rule__Num__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6635:1: ( rule__Num__Group_1_0__1__Impl )
            // InternalCssDslParser.g:6636:2: rule__Num__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_0__1"


    // $ANTLR start "rule__Num__Group_1_0__1__Impl"
    // InternalCssDslParser.g:6642:1: rule__Num__Group_1_0__1__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
    public final void rule__Num__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6646:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
            // InternalCssDslParser.g:6647:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            {
            // InternalCssDslParser.g:6647:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            // InternalCssDslParser.g:6648:2: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
            {
            // InternalCssDslParser.g:6648:2: ( ( RULE_ONE_INT ) )
            // InternalCssDslParser.g:6649:3: ( RULE_ONE_INT )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
            }
            // InternalCssDslParser.g:6650:3: ( RULE_ONE_INT )
            // InternalCssDslParser.g:6650:4: RULE_ONE_INT
            {
            match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
            }

            }

            // InternalCssDslParser.g:6653:2: ( ( RULE_ONE_INT )* )
            // InternalCssDslParser.g:6654:3: ( RULE_ONE_INT )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
            }
            // InternalCssDslParser.g:6655:3: ( RULE_ONE_INT )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ONE_INT) ) {
                    int LA78_2 = input.LA(2);

                    if ( (synpred129_InternalCssDslParser()) ) {
                        alt78=1;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // InternalCssDslParser.g:6655:4: RULE_ONE_INT
            	    {
            	    match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_0_1()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_0__1__Impl"


    // $ANTLR start "rule__Num__Group_1_1__0"
    // InternalCssDslParser.g:6665:1: rule__Num__Group_1_1__0 : rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1 ;
    public final void rule__Num__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6669:1: ( rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1 )
            // InternalCssDslParser.g:6670:2: rule__Num__Group_1_1__0__Impl rule__Num__Group_1_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Num__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1__0"


    // $ANTLR start "rule__Num__Group_1_1__0__Impl"
    // InternalCssDslParser.g:6677:1: rule__Num__Group_1_1__0__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
    public final void rule__Num__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6681:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
            // InternalCssDslParser.g:6682:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            {
            // InternalCssDslParser.g:6682:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            // InternalCssDslParser.g:6683:2: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
            {
            // InternalCssDslParser.g:6683:2: ( ( RULE_ONE_INT ) )
            // InternalCssDslParser.g:6684:3: ( RULE_ONE_INT )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
            }
            // InternalCssDslParser.g:6685:3: ( RULE_ONE_INT )
            // InternalCssDslParser.g:6685:4: RULE_ONE_INT
            {
            match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
            }

            }

            // InternalCssDslParser.g:6688:2: ( ( RULE_ONE_INT )* )
            // InternalCssDslParser.g:6689:3: ( RULE_ONE_INT )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
            }
            // InternalCssDslParser.g:6690:3: ( RULE_ONE_INT )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ONE_INT) ) {
                    int LA79_2 = input.LA(2);

                    if ( (synpred130_InternalCssDslParser()) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // InternalCssDslParser.g:6690:4: RULE_ONE_INT
            	    {
            	    match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_0()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1__0__Impl"


    // $ANTLR start "rule__Num__Group_1_1__1"
    // InternalCssDslParser.g:6699:1: rule__Num__Group_1_1__1 : rule__Num__Group_1_1__1__Impl ;
    public final void rule__Num__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6703:1: ( rule__Num__Group_1_1__1__Impl )
            // InternalCssDslParser.g:6704:2: rule__Num__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1__1"


    // $ANTLR start "rule__Num__Group_1_1__1__Impl"
    // InternalCssDslParser.g:6710:1: rule__Num__Group_1_1__1__Impl : ( ( rule__Num__Group_1_1_1__0 )? ) ;
    public final void rule__Num__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6714:1: ( ( ( rule__Num__Group_1_1_1__0 )? ) )
            // InternalCssDslParser.g:6715:1: ( ( rule__Num__Group_1_1_1__0 )? )
            {
            // InternalCssDslParser.g:6715:1: ( ( rule__Num__Group_1_1_1__0 )? )
            // InternalCssDslParser.g:6716:2: ( rule__Num__Group_1_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getGroup_1_1_1()); 
            }
            // InternalCssDslParser.g:6717:2: ( rule__Num__Group_1_1_1__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==FullStop) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==RULE_ONE_INT) ) {
                    int LA80_3 = input.LA(3);

                    if ( (synpred131_InternalCssDslParser()) ) {
                        alt80=1;
                    }
                }
            }
            switch (alt80) {
                case 1 :
                    // InternalCssDslParser.g:6717:3: rule__Num__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Num__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1__1__Impl"


    // $ANTLR start "rule__Num__Group_1_1_1__0"
    // InternalCssDslParser.g:6726:1: rule__Num__Group_1_1_1__0 : rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1 ;
    public final void rule__Num__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6730:1: ( rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1 )
            // InternalCssDslParser.g:6731:2: rule__Num__Group_1_1_1__0__Impl rule__Num__Group_1_1_1__1
            {
            pushFollow(FOLLOW_58);
            rule__Num__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1_1__0"


    // $ANTLR start "rule__Num__Group_1_1_1__0__Impl"
    // InternalCssDslParser.g:6738:1: rule__Num__Group_1_1_1__0__Impl : ( ( FullStop ) ) ;
    public final void rule__Num__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6742:1: ( ( ( FullStop ) ) )
            // InternalCssDslParser.g:6743:1: ( ( FullStop ) )
            {
            // InternalCssDslParser.g:6743:1: ( ( FullStop ) )
            // InternalCssDslParser.g:6744:2: ( FullStop )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0()); 
            }
            // InternalCssDslParser.g:6745:2: ( FullStop )
            // InternalCssDslParser.g:6745:3: FullStop
            {
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getFullStopKeyword_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Num__Group_1_1_1__1"
    // InternalCssDslParser.g:6753:1: rule__Num__Group_1_1_1__1 : rule__Num__Group_1_1_1__1__Impl ;
    public final void rule__Num__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6757:1: ( rule__Num__Group_1_1_1__1__Impl )
            // InternalCssDslParser.g:6758:2: rule__Num__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Num__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1_1__1"


    // $ANTLR start "rule__Num__Group_1_1_1__1__Impl"
    // InternalCssDslParser.g:6764:1: rule__Num__Group_1_1_1__1__Impl : ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) ;
    public final void rule__Num__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6768:1: ( ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) ) )
            // InternalCssDslParser.g:6769:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            {
            // InternalCssDslParser.g:6769:1: ( ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* ) )
            // InternalCssDslParser.g:6770:2: ( ( RULE_ONE_INT ) ) ( ( RULE_ONE_INT )* )
            {
            // InternalCssDslParser.g:6770:2: ( ( RULE_ONE_INT ) )
            // InternalCssDslParser.g:6771:3: ( RULE_ONE_INT )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
            }
            // InternalCssDslParser.g:6772:3: ( RULE_ONE_INT )
            // InternalCssDslParser.g:6772:4: RULE_ONE_INT
            {
            match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
            }

            }

            // InternalCssDslParser.g:6775:2: ( ( RULE_ONE_INT )* )
            // InternalCssDslParser.g:6776:3: ( RULE_ONE_INT )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
            }
            // InternalCssDslParser.g:6777:3: ( RULE_ONE_INT )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_ONE_INT) ) {
                    int LA81_2 = input.LA(2);

                    if ( (synpred132_InternalCssDslParser()) ) {
                        alt81=1;
                    }


                }


                switch (alt81) {
            	case 1 :
            	    // InternalCssDslParser.g:6777:4: RULE_ONE_INT
            	    {
            	    match(input,RULE_ONE_INT,FOLLOW_59); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumAccess().getONE_INTTerminalRuleCall_1_1_1_1()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Hex__Group__0"
    // InternalCssDslParser.g:6787:1: rule__Hex__Group__0 : rule__Hex__Group__0__Impl rule__Hex__Group__1 ;
    public final void rule__Hex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6791:1: ( rule__Hex__Group__0__Impl rule__Hex__Group__1 )
            // InternalCssDslParser.g:6792:2: rule__Hex__Group__0__Impl rule__Hex__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Hex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Hex__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group__0"


    // $ANTLR start "rule__Hex__Group__0__Impl"
    // InternalCssDslParser.g:6799:1: rule__Hex__Group__0__Impl : ( RULE_HASHMARK ) ;
    public final void rule__Hex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6803:1: ( ( RULE_HASHMARK ) )
            // InternalCssDslParser.g:6804:1: ( RULE_HASHMARK )
            {
            // InternalCssDslParser.g:6804:1: ( RULE_HASHMARK )
            // InternalCssDslParser.g:6805:2: RULE_HASHMARK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0()); 
            }
            match(input,RULE_HASHMARK,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexAccess().getHASHMARKTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group__0__Impl"


    // $ANTLR start "rule__Hex__Group__1"
    // InternalCssDslParser.g:6814:1: rule__Hex__Group__1 : rule__Hex__Group__1__Impl ;
    public final void rule__Hex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6818:1: ( rule__Hex__Group__1__Impl )
            // InternalCssDslParser.g:6819:2: rule__Hex__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hex__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group__1"


    // $ANTLR start "rule__Hex__Group__1__Impl"
    // InternalCssDslParser.g:6825:1: rule__Hex__Group__1__Impl : ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) ) ;
    public final void rule__Hex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6829:1: ( ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) ) )
            // InternalCssDslParser.g:6830:1: ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) )
            {
            // InternalCssDslParser.g:6830:1: ( ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* ) )
            // InternalCssDslParser.g:6831:2: ( ( rule__Hex__Group_1__0 ) ) ( ( rule__Hex__Group_1__0 )* )
            {
            // InternalCssDslParser.g:6831:2: ( ( rule__Hex__Group_1__0 ) )
            // InternalCssDslParser.g:6832:3: ( rule__Hex__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexAccess().getGroup_1()); 
            }
            // InternalCssDslParser.g:6833:3: ( rule__Hex__Group_1__0 )
            // InternalCssDslParser.g:6833:4: rule__Hex__Group_1__0
            {
            pushFollow(FOLLOW_60);
            rule__Hex__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexAccess().getGroup_1()); 
            }

            }

            // InternalCssDslParser.g:6836:2: ( ( rule__Hex__Group_1__0 )* )
            // InternalCssDslParser.g:6837:3: ( rule__Hex__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexAccess().getGroup_1()); 
            }
            // InternalCssDslParser.g:6838:3: ( rule__Hex__Group_1__0 )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ONE_HEX_LETTER) ) {
                    int LA82_2 = input.LA(2);

                    if ( (synpred133_InternalCssDslParser()) ) {
                        alt82=1;
                    }


                }
                else if ( (LA82_0==RULE_ONE_INT) ) {
                    int LA82_3 = input.LA(2);

                    if ( (synpred133_InternalCssDslParser()) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // InternalCssDslParser.g:6838:4: rule__Hex__Group_1__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__Hex__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexAccess().getGroup_1()); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group__1__Impl"


    // $ANTLR start "rule__Hex__Group_1__0"
    // InternalCssDslParser.g:6848:1: rule__Hex__Group_1__0 : rule__Hex__Group_1__0__Impl ;
    public final void rule__Hex__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6852:1: ( rule__Hex__Group_1__0__Impl )
            // InternalCssDslParser.g:6853:2: rule__Hex__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hex__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group_1__0"


    // $ANTLR start "rule__Hex__Group_1__0__Impl"
    // InternalCssDslParser.g:6859:1: rule__Hex__Group_1__0__Impl : ( ( rule__Hex__Alternatives_1_0 ) ) ;
    public final void rule__Hex__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6863:1: ( ( ( rule__Hex__Alternatives_1_0 ) ) )
            // InternalCssDslParser.g:6864:1: ( ( rule__Hex__Alternatives_1_0 ) )
            {
            // InternalCssDslParser.g:6864:1: ( ( rule__Hex__Alternatives_1_0 ) )
            // InternalCssDslParser.g:6865:2: ( rule__Hex__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexAccess().getAlternatives_1_0()); 
            }
            // InternalCssDslParser.g:6866:2: ( rule__Hex__Alternatives_1_0 )
            // InternalCssDslParser.g:6866:3: rule__Hex__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Hex__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hex__Group_1__0__Impl"


    // $ANTLR start "rule__Stylesheet__CharsetAssignment_0"
    // InternalCssDslParser.g:6875:1: rule__Stylesheet__CharsetAssignment_0 : ( ruleCharsetRule ) ;
    public final void rule__Stylesheet__CharsetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6879:1: ( ( ruleCharsetRule ) )
            // InternalCssDslParser.g:6880:2: ( ruleCharsetRule )
            {
            // InternalCssDslParser.g:6880:2: ( ruleCharsetRule )
            // InternalCssDslParser.g:6881:3: ruleCharsetRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getCharsetCharsetRuleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharsetRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getCharsetCharsetRuleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__CharsetAssignment_0"


    // $ANTLR start "rule__Stylesheet__ImportsAssignment_1"
    // InternalCssDslParser.g:6890:1: rule__Stylesheet__ImportsAssignment_1 : ( ruleImportRule ) ;
    public final void rule__Stylesheet__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6894:1: ( ( ruleImportRule ) )
            // InternalCssDslParser.g:6895:2: ( ruleImportRule )
            {
            // InternalCssDslParser.g:6895:2: ( ruleImportRule )
            // InternalCssDslParser.g:6896:3: ruleImportRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getImportsImportRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImportRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getImportsImportRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__ImportsAssignment_1"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_2_0"
    // InternalCssDslParser.g:6905:1: rule__Stylesheet__RulesetAssignment_2_0 : ( ruleRuleset ) ;
    public final void rule__Stylesheet__RulesetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6909:1: ( ( ruleRuleset ) )
            // InternalCssDslParser.g:6910:2: ( ruleRuleset )
            {
            // InternalCssDslParser.g:6910:2: ( ruleRuleset )
            // InternalCssDslParser.g:6911:3: ruleRuleset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_2_0"


    // $ANTLR start "rule__Stylesheet__MediaAssignment_2_1"
    // InternalCssDslParser.g:6920:1: rule__Stylesheet__MediaAssignment_2_1 : ( ruleMediaRule ) ;
    public final void rule__Stylesheet__MediaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6924:1: ( ( ruleMediaRule ) )
            // InternalCssDslParser.g:6925:2: ( ruleMediaRule )
            {
            // InternalCssDslParser.g:6925:2: ( ruleMediaRule )
            // InternalCssDslParser.g:6926:3: ruleMediaRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getMediaMediaRuleParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMediaRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getMediaMediaRuleParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__MediaAssignment_2_1"


    // $ANTLR start "rule__Stylesheet__PageAssignment_2_2"
    // InternalCssDslParser.g:6935:1: rule__Stylesheet__PageAssignment_2_2 : ( rulePageRule ) ;
    public final void rule__Stylesheet__PageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6939:1: ( ( rulePageRule ) )
            // InternalCssDslParser.g:6940:2: ( rulePageRule )
            {
            // InternalCssDslParser.g:6940:2: ( rulePageRule )
            // InternalCssDslParser.g:6941:3: rulePageRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getPagePageRuleParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePageRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getPagePageRuleParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__PageAssignment_2_2"


    // $ANTLR start "rule__Stylesheet__Font_faceAssignment_2_3"
    // InternalCssDslParser.g:6950:1: rule__Stylesheet__Font_faceAssignment_2_3 : ( ruleFontFaceRule ) ;
    public final void rule__Stylesheet__Font_faceAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6954:1: ( ( ruleFontFaceRule ) )
            // InternalCssDslParser.g:6955:2: ( ruleFontFaceRule )
            {
            // InternalCssDslParser.g:6955:2: ( ruleFontFaceRule )
            // InternalCssDslParser.g:6956:3: ruleFontFaceRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getFont_faceFontFaceRuleParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFontFaceRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getFont_faceFontFaceRuleParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Font_faceAssignment_2_3"


    // $ANTLR start "rule__Stylesheet__KeyframesAssignment_2_4"
    // InternalCssDslParser.g:6965:1: rule__Stylesheet__KeyframesAssignment_2_4 : ( ruleKeyframesRule ) ;
    public final void rule__Stylesheet__KeyframesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6969:1: ( ( ruleKeyframesRule ) )
            // InternalCssDslParser.g:6970:2: ( ruleKeyframesRule )
            {
            // InternalCssDslParser.g:6970:2: ( ruleKeyframesRule )
            // InternalCssDslParser.g:6971:3: ruleKeyframesRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStylesheetAccess().getKeyframesKeyframesRuleParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyframesRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStylesheetAccess().getKeyframesKeyframesRuleParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__KeyframesAssignment_2_4"


    // $ANTLR start "rule__CharsetRule__CharsetAssignment_1"
    // InternalCssDslParser.g:6980:1: rule__CharsetRule__CharsetAssignment_1 : ( RULE_CSSSTRING ) ;
    public final void rule__CharsetRule__CharsetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6984:1: ( ( RULE_CSSSTRING ) )
            // InternalCssDslParser.g:6985:2: ( RULE_CSSSTRING )
            {
            // InternalCssDslParser.g:6985:2: ( RULE_CSSSTRING )
            // InternalCssDslParser.g:6986:3: RULE_CSSSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharsetRuleAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharsetRuleAccess().getCharsetCSSSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharsetRule__CharsetAssignment_1"


    // $ANTLR start "rule__ImportRule__ValueAssignment_1_0"
    // InternalCssDslParser.g:6995:1: rule__ImportRule__ValueAssignment_1_0 : ( RULE_CSSSTRING ) ;
    public final void rule__ImportRule__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:6999:1: ( ( RULE_CSSSTRING ) )
            // InternalCssDslParser.g:7000:2: ( RULE_CSSSTRING )
            {
            // InternalCssDslParser.g:7000:2: ( RULE_CSSSTRING )
            // InternalCssDslParser.g:7001:3: RULE_CSSSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getValueCSSSTRINGTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__ValueAssignment_1_0"


    // $ANTLR start "rule__ImportRule__MediaListAssignment_1_1_1"
    // InternalCssDslParser.g:7010:1: rule__ImportRule__MediaListAssignment_1_1_1 : ( ruleMediaList ) ;
    public final void rule__ImportRule__MediaListAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7014:1: ( ( ruleMediaList ) )
            // InternalCssDslParser.g:7015:2: ( ruleMediaList )
            {
            // InternalCssDslParser.g:7015:2: ( ruleMediaList )
            // InternalCssDslParser.g:7016:3: ruleMediaList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRuleAccess().getMediaListMediaListParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMediaList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRuleAccess().getMediaListMediaListParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportRule__MediaListAssignment_1_1_1"


    // $ANTLR start "rule__PageRule__PseudoPageAssignment_2"
    // InternalCssDslParser.g:7025:1: rule__PageRule__PseudoPageAssignment_2 : ( rulePseudoPage ) ;
    public final void rule__PageRule__PseudoPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7029:1: ( ( rulePseudoPage ) )
            // InternalCssDslParser.g:7030:2: ( rulePseudoPage )
            {
            // InternalCssDslParser.g:7030:2: ( rulePseudoPage )
            // InternalCssDslParser.g:7031:3: rulePseudoPage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getPseudoPagePseudoPageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePseudoPage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getPseudoPagePseudoPageParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__PseudoPageAssignment_2"


    // $ANTLR start "rule__PageRule__DeclarationsAssignment_4"
    // InternalCssDslParser.g:7040:1: rule__PageRule__DeclarationsAssignment_4 : ( ruleCssDeclaration ) ;
    public final void rule__PageRule__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7044:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7045:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7045:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7046:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__DeclarationsAssignment_4"


    // $ANTLR start "rule__PageRule__DeclarationsAssignment_5_1"
    // InternalCssDslParser.g:7055:1: rule__PageRule__DeclarationsAssignment_5_1 : ( ruleCssDeclaration ) ;
    public final void rule__PageRule__DeclarationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7059:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7060:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7060:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7061:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRuleAccess().getDeclarationsCssDeclarationParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageRule__DeclarationsAssignment_5_1"


    // $ANTLR start "rule__MediaRule__MedialistAssignment_1"
    // InternalCssDslParser.g:7070:1: rule__MediaRule__MedialistAssignment_1 : ( ruleMediaList ) ;
    public final void rule__MediaRule__MedialistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7074:1: ( ( ruleMediaList ) )
            // InternalCssDslParser.g:7075:2: ( ruleMediaList )
            {
            // InternalCssDslParser.g:7075:2: ( ruleMediaList )
            // InternalCssDslParser.g:7076:3: ruleMediaList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getMedialistMediaListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMediaList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getMedialistMediaListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__MedialistAssignment_1"


    // $ANTLR start "rule__MediaRule__RulesetsAssignment_3"
    // InternalCssDslParser.g:7085:1: rule__MediaRule__RulesetsAssignment_3 : ( ruleRuleset ) ;
    public final void rule__MediaRule__RulesetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7089:1: ( ( ruleRuleset ) )
            // InternalCssDslParser.g:7090:2: ( ruleRuleset )
            {
            // InternalCssDslParser.g:7090:2: ( ruleRuleset )
            // InternalCssDslParser.g:7091:3: ruleRuleset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaRuleAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaRuleAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaRule__RulesetsAssignment_3"


    // $ANTLR start "rule__MediaList__EntryAssignment_0"
    // InternalCssDslParser.g:7100:1: rule__MediaList__EntryAssignment_0 : ( ruleMedia ) ;
    public final void rule__MediaList__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7104:1: ( ( ruleMedia ) )
            // InternalCssDslParser.g:7105:2: ( ruleMedia )
            {
            // InternalCssDslParser.g:7105:2: ( ruleMedia )
            // InternalCssDslParser.g:7106:3: ruleMedia
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMedia();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__EntryAssignment_0"


    // $ANTLR start "rule__MediaList__EntryAssignment_1_1"
    // InternalCssDslParser.g:7115:1: rule__MediaList__EntryAssignment_1_1 : ( ruleMedia ) ;
    public final void rule__MediaList__EntryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7119:1: ( ( ruleMedia ) )
            // InternalCssDslParser.g:7120:2: ( ruleMedia )
            {
            // InternalCssDslParser.g:7120:2: ( ruleMedia )
            // InternalCssDslParser.g:7121:3: ruleMedia
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMedia();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaListAccess().getEntryMediaParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MediaList__EntryAssignment_1_1"


    // $ANTLR start "rule__Media__NameAssignment"
    // InternalCssDslParser.g:7130:1: rule__Media__NameAssignment : ( ruleIdentifier ) ;
    public final void rule__Media__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7134:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7135:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7135:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7136:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediaAccess().getNameIdentifierParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediaAccess().getNameIdentifierParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__NameAssignment"


    // $ANTLR start "rule__FontFaceRule__DeclarationsAssignment_3"
    // InternalCssDslParser.g:7145:1: rule__FontFaceRule__DeclarationsAssignment_3 : ( ruleCssDeclaration ) ;
    public final void rule__FontFaceRule__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7149:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7150:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7150:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7151:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__DeclarationsAssignment_3"


    // $ANTLR start "rule__FontFaceRule__DeclarationsAssignment_4_1"
    // InternalCssDslParser.g:7160:1: rule__FontFaceRule__DeclarationsAssignment_4_1 : ( ruleCssDeclaration ) ;
    public final void rule__FontFaceRule__DeclarationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7164:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7165:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7165:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7166:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFontFaceRuleAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontFaceRule__DeclarationsAssignment_4_1"


    // $ANTLR start "rule__KeyframesRule__NameAssignment_2"
    // InternalCssDslParser.g:7175:1: rule__KeyframesRule__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__KeyframesRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7179:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7180:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7180:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7181:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getNameIdentifierParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getNameIdentifierParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__NameAssignment_2"


    // $ANTLR start "rule__KeyframesRule__KeyframeselectorsAssignment_4"
    // InternalCssDslParser.g:7190:1: rule__KeyframesRule__KeyframeselectorsAssignment_4 : ( ruleKeyframeSelector ) ;
    public final void rule__KeyframesRule__KeyframeselectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7194:1: ( ( ruleKeyframeSelector ) )
            // InternalCssDslParser.g:7195:2: ( ruleKeyframeSelector )
            {
            // InternalCssDslParser.g:7195:2: ( ruleKeyframeSelector )
            // InternalCssDslParser.g:7196:3: ruleKeyframeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyframeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__KeyframeselectorsAssignment_4"


    // $ANTLR start "rule__KeyframesRule__KeyframeselectorsAssignment_5_1"
    // InternalCssDslParser.g:7205:1: rule__KeyframesRule__KeyframeselectorsAssignment_5_1 : ( ruleKeyframeSelector ) ;
    public final void rule__KeyframesRule__KeyframeselectorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7209:1: ( ( ruleKeyframeSelector ) )
            // InternalCssDslParser.g:7210:2: ( ruleKeyframeSelector )
            {
            // InternalCssDslParser.g:7210:2: ( ruleKeyframeSelector )
            // InternalCssDslParser.g:7211:3: ruleKeyframeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyframeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframesRuleAccess().getKeyframeselectorsKeyframeSelectorParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframesRule__KeyframeselectorsAssignment_5_1"


    // $ANTLR start "rule__KeyframeSelector__TypeAssignment_0_0"
    // InternalCssDslParser.g:7220:1: rule__KeyframeSelector__TypeAssignment_0_0 : ( ruleIdentifier ) ;
    public final void rule__KeyframeSelector__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7224:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7225:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7225:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7226:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getTypeIdentifierParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getTypeIdentifierParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__TypeAssignment_0_0"


    // $ANTLR start "rule__KeyframeSelector__PercentageAssignment_0_1_0"
    // InternalCssDslParser.g:7235:1: rule__KeyframeSelector__PercentageAssignment_0_1_0 : ( ruleNum ) ;
    public final void rule__KeyframeSelector__PercentageAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7239:1: ( ( ruleNum ) )
            // InternalCssDslParser.g:7240:2: ( ruleNum )
            {
            // InternalCssDslParser.g:7240:2: ( ruleNum )
            // InternalCssDslParser.g:7241:3: ruleNum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getPercentageNumParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getPercentageNumParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__PercentageAssignment_0_1_0"


    // $ANTLR start "rule__KeyframeSelector__DeclarationsAssignment_2"
    // InternalCssDslParser.g:7250:1: rule__KeyframeSelector__DeclarationsAssignment_2 : ( ruleCssDeclaration ) ;
    public final void rule__KeyframeSelector__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7254:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7255:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7255:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7256:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__DeclarationsAssignment_2"


    // $ANTLR start "rule__KeyframeSelector__DeclarationsAssignment_3_1"
    // InternalCssDslParser.g:7265:1: rule__KeyframeSelector__DeclarationsAssignment_3_1 : ( ruleCssDeclaration ) ;
    public final void rule__KeyframeSelector__DeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7269:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7270:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7270:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7271:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyframeSelectorAccess().getDeclarationsCssDeclarationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyframeSelector__DeclarationsAssignment_3_1"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
    // InternalCssDslParser.g:7280:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleSelector ) ;
    public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7284:1: ( ( ruleSelector ) )
            // InternalCssDslParser.g:7285:2: ( ruleSelector )
            {
            // InternalCssDslParser.g:7285:2: ( ruleSelector )
            // InternalCssDslParser.g:7286:3: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_1_2"
    // InternalCssDslParser.g:7295:1: rule__Ruleset__SelectorsAssignment_1_2 : ( ruleSelector ) ;
    public final void rule__Ruleset__SelectorsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7299:1: ( ( ruleSelector ) )
            // InternalCssDslParser.g:7300:2: ( ruleSelector )
            {
            // InternalCssDslParser.g:7300:2: ( ruleSelector )
            // InternalCssDslParser.g:7301:3: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_1_2"


    // $ANTLR start "rule__Ruleset__DeclarationsAssignment_4_0"
    // InternalCssDslParser.g:7310:1: rule__Ruleset__DeclarationsAssignment_4_0 : ( ruleCssDeclaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7314:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7315:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7315:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7316:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__DeclarationsAssignment_4_0"


    // $ANTLR start "rule__Ruleset__DeclarationsAssignment_4_1_1"
    // InternalCssDslParser.g:7325:1: rule__Ruleset__DeclarationsAssignment_4_1_1 : ( ruleCssDeclaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7329:1: ( ( ruleCssDeclaration ) )
            // InternalCssDslParser.g:7330:2: ( ruleCssDeclaration )
            {
            // InternalCssDslParser.g:7330:2: ( ruleCssDeclaration )
            // InternalCssDslParser.g:7331:3: ruleCssDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesetAccess().getDeclarationsCssDeclarationParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__DeclarationsAssignment_4_1_1"


    // $ANTLR start "rule__CssDeclaration__PropertyAssignment_0"
    // InternalCssDslParser.g:7340:1: rule__CssDeclaration__PropertyAssignment_0 : ( ruleCssProperty ) ;
    public final void rule__CssDeclaration__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7344:1: ( ( ruleCssProperty ) )
            // InternalCssDslParser.g:7345:2: ( ruleCssProperty )
            {
            // InternalCssDslParser.g:7345:2: ( ruleCssProperty )
            // InternalCssDslParser.g:7346:3: ruleCssProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getPropertyCssPropertyParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getPropertyCssPropertyParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__PropertyAssignment_0"


    // $ANTLR start "rule__CssDeclaration__ValueTokensAssignment_3"
    // InternalCssDslParser.g:7355:1: rule__CssDeclaration__ValueTokensAssignment_3 : ( ruleCssTok ) ;
    public final void rule__CssDeclaration__ValueTokensAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7359:1: ( ( ruleCssTok ) )
            // InternalCssDslParser.g:7360:2: ( ruleCssTok )
            {
            // InternalCssDslParser.g:7360:2: ( ruleCssTok )
            // InternalCssDslParser.g:7361:3: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getValueTokensCssTokParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getValueTokensCssTokParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__ValueTokensAssignment_3"


    // $ANTLR start "rule__CssDeclaration__ImportantAssignment_4"
    // InternalCssDslParser.g:7370:1: rule__CssDeclaration__ImportantAssignment_4 : ( RULE_IMPORTANT_SYM ) ;
    public final void rule__CssDeclaration__ImportantAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7374:1: ( ( RULE_IMPORTANT_SYM ) )
            // InternalCssDslParser.g:7375:2: ( RULE_IMPORTANT_SYM )
            {
            // InternalCssDslParser.g:7375:2: ( RULE_IMPORTANT_SYM )
            // InternalCssDslParser.g:7376:3: RULE_IMPORTANT_SYM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssDeclarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_4_0()); 
            }
            match(input,RULE_IMPORTANT_SYM,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssDeclarationAccess().getImportantIMPORTANT_SYMTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssDeclaration__ImportantAssignment_4"


    // $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
    // InternalCssDslParser.g:7385:1: rule__Selector__SimpleselectorsAssignment_0 : ( ruleSimpleSelector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7389:1: ( ( ruleSimpleSelector ) )
            // InternalCssDslParser.g:7390:2: ( ruleSimpleSelector )
            {
            // InternalCssDslParser.g:7390:2: ( ruleSimpleSelector )
            // InternalCssDslParser.g:7391:3: ruleSimpleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSimpleselectorsSimpleSelectorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSimpleselectorsSimpleSelectorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
    // InternalCssDslParser.g:7400:1: rule__Selector__CombinatorAssignment_1_0_0 : ( ruleCombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7404:1: ( ( ruleCombinator ) )
            // InternalCssDslParser.g:7405:2: ( ruleCombinator )
            {
            // InternalCssDslParser.g:7405:2: ( ruleCombinator )
            // InternalCssDslParser.g:7406:3: ruleCombinator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_0_2"
    // InternalCssDslParser.g:7415:1: rule__Selector__SelectorAssignment_1_0_2 : ( ruleSelector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7419:1: ( ( ruleSelector ) )
            // InternalCssDslParser.g:7420:2: ( ruleSelector )
            {
            // InternalCssDslParser.g:7420:2: ( ruleSelector )
            // InternalCssDslParser.g:7421:3: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_0_2"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1_0"
    // InternalCssDslParser.g:7430:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( ruleCombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7434:1: ( ( ruleCombinator ) )
            // InternalCssDslParser.g:7435:2: ( ruleCombinator )
            {
            // InternalCssDslParser.g:7435:2: ( ruleCombinator )
            // InternalCssDslParser.g:7436:3: ruleCombinator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCombinator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_1_2"
    // InternalCssDslParser.g:7445:1: rule__Selector__SelectorAssignment_1_1_2 : ( ruleSelector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7449:1: ( ( ruleSelector ) )
            // InternalCssDslParser.g:7450:2: ( ruleSelector )
            {
            // InternalCssDslParser.g:7450:2: ( ruleSelector )
            // InternalCssDslParser.g:7451:3: ruleSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_1_2"


    // $ANTLR start "rule__SimpleSelectorForNegation__ElementAssignment_0_0_0"
    // InternalCssDslParser.g:7460:1: rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 : ( ruleElementSelector ) ;
    public final void rule__SimpleSelectorForNegation__ElementAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7464:1: ( ( ruleElementSelector ) )
            // InternalCssDslParser.g:7465:2: ( ruleElementSelector )
            {
            // InternalCssDslParser.g:7465:2: ( ruleElementSelector )
            // InternalCssDslParser.g:7466:3: ruleElementSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__ElementAssignment_0_0_0"


    // $ANTLR start "rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1"
    // InternalCssDslParser.g:7475:1: rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 : ( ruleUniversalSelector ) ;
    public final void rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7479:1: ( ( ruleUniversalSelector ) )
            // InternalCssDslParser.g:7480:2: ( ruleUniversalSelector )
            {
            // InternalCssDslParser.g:7480:2: ( ruleUniversalSelector )
            // InternalCssDslParser.g:7481:3: ruleUniversalSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1"


    // $ANTLR start "rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1"
    // InternalCssDslParser.g:7490:1: rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1 : ( ruleSubSelectorForNegation ) ;
    public final void rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7494:1: ( ( ruleSubSelectorForNegation ) )
            // InternalCssDslParser.g:7495:2: ( ruleSubSelectorForNegation )
            {
            // InternalCssDslParser.g:7495:2: ( ruleSubSelectorForNegation )
            // InternalCssDslParser.g:7496:3: ruleSubSelectorForNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__SubSelectorsAssignment_0_1"


    // $ANTLR start "rule__SimpleSelectorForNegation__SubSelectorsAssignment_1"
    // InternalCssDslParser.g:7505:1: rule__SimpleSelectorForNegation__SubSelectorsAssignment_1 : ( ruleSubSelectorForNegation ) ;
    public final void rule__SimpleSelectorForNegation__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7509:1: ( ( ruleSubSelectorForNegation ) )
            // InternalCssDslParser.g:7510:2: ( ruleSubSelectorForNegation )
            {
            // InternalCssDslParser.g:7510:2: ( ruleSubSelectorForNegation )
            // InternalCssDslParser.g:7511:3: ruleSubSelectorForNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubSelectorForNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorForNegationAccess().getSubSelectorsSubSelectorForNegationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelectorForNegation__SubSelectorsAssignment_1"


    // $ANTLR start "rule__SimpleSelector__ElementAssignment_0_0_0"
    // InternalCssDslParser.g:7520:1: rule__SimpleSelector__ElementAssignment_0_0_0 : ( ruleElementSelector ) ;
    public final void rule__SimpleSelector__ElementAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7524:1: ( ( ruleElementSelector ) )
            // InternalCssDslParser.g:7525:2: ( ruleElementSelector )
            {
            // InternalCssDslParser.g:7525:2: ( ruleElementSelector )
            // InternalCssDslParser.g:7526:3: ruleElementSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getElementElementSelectorParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__ElementAssignment_0_0_0"


    // $ANTLR start "rule__SimpleSelector__UniversalAssignment_0_0_1"
    // InternalCssDslParser.g:7535:1: rule__SimpleSelector__UniversalAssignment_0_0_1 : ( ruleUniversalSelector ) ;
    public final void rule__SimpleSelector__UniversalAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7539:1: ( ( ruleUniversalSelector ) )
            // InternalCssDslParser.g:7540:2: ( ruleUniversalSelector )
            {
            // InternalCssDslParser.g:7540:2: ( ruleUniversalSelector )
            // InternalCssDslParser.g:7541:3: ruleUniversalSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUniversalSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getUniversalUniversalSelectorParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__UniversalAssignment_0_0_1"


    // $ANTLR start "rule__SimpleSelector__SubSelectorsAssignment_0_1"
    // InternalCssDslParser.g:7550:1: rule__SimpleSelector__SubSelectorsAssignment_0_1 : ( ruleSubSelector ) ;
    public final void rule__SimpleSelector__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7554:1: ( ( ruleSubSelector ) )
            // InternalCssDslParser.g:7555:2: ( ruleSubSelector )
            {
            // InternalCssDslParser.g:7555:2: ( ruleSubSelector )
            // InternalCssDslParser.g:7556:3: ruleSubSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__SubSelectorsAssignment_0_1"


    // $ANTLR start "rule__SimpleSelector__SubSelectorsAssignment_1"
    // InternalCssDslParser.g:7565:1: rule__SimpleSelector__SubSelectorsAssignment_1 : ( ruleSubSelector ) ;
    public final void rule__SimpleSelector__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7569:1: ( ( ruleSubSelector ) )
            // InternalCssDslParser.g:7570:2: ( ruleSubSelector )
            {
            // InternalCssDslParser.g:7570:2: ( ruleSubSelector )
            // InternalCssDslParser.g:7571:3: ruleSubSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleSelectorAccess().getSubSelectorsSubSelectorParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSelector__SubSelectorsAssignment_1"


    // $ANTLR start "rule__AttributeSelector__NameAssignment_2"
    // InternalCssDslParser.g:7580:1: rule__AttributeSelector__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__AttributeSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7584:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7585:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7585:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7586:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__NameAssignment_2"


    // $ANTLR start "rule__AttributeSelector__OpAssignment_3_0"
    // InternalCssDslParser.g:7595:1: rule__AttributeSelector__OpAssignment_3_0 : ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) ;
    public final void rule__AttributeSelector__OpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7599:1: ( ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) ) )
            // InternalCssDslParser.g:7600:2: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
            {
            // InternalCssDslParser.g:7600:2: ( ( rule__AttributeSelector__OpAlternatives_3_0_0 ) )
            // InternalCssDslParser.g:7601:3: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0()); 
            }
            // InternalCssDslParser.g:7602:3: ( rule__AttributeSelector__OpAlternatives_3_0_0 )
            // InternalCssDslParser.g:7602:4: rule__AttributeSelector__OpAlternatives_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__OpAlternatives_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getOpAlternatives_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__OpAssignment_3_0"


    // $ANTLR start "rule__AttributeSelector__ValueAssignment_3_1"
    // InternalCssDslParser.g:7610:1: rule__AttributeSelector__ValueAssignment_3_1 : ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__AttributeSelector__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7614:1: ( ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) ) )
            // InternalCssDslParser.g:7615:2: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
            {
            // InternalCssDslParser.g:7615:2: ( ( rule__AttributeSelector__ValueAlternatives_3_1_0 ) )
            // InternalCssDslParser.g:7616:3: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0()); 
            }
            // InternalCssDslParser.g:7617:3: ( rule__AttributeSelector__ValueAlternatives_3_1_0 )
            // InternalCssDslParser.g:7617:4: rule__AttributeSelector__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSelector__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSelectorAccess().getValueAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSelector__ValueAssignment_3_1"


    // $ANTLR start "rule__ClassSelector__NameAssignment_2"
    // InternalCssDslParser.g:7625:1: rule__ClassSelector__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__ClassSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7629:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7630:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7630:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7631:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassSelector__NameAssignment_2"


    // $ANTLR start "rule__ElementSelector__NameAssignment_1"
    // InternalCssDslParser.g:7640:1: rule__ElementSelector__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__ElementSelector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7644:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7645:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7645:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7646:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementSelectorAccess().getNameIdentifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__NameAssignment_1"


    // $ANTLR start "rule__UniversalSelector__NamespaceAssignment_1"
    // InternalCssDslParser.g:7655:1: rule__UniversalSelector__NamespaceAssignment_1 : ( ruleCssNamespacePrefix ) ;
    public final void rule__UniversalSelector__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7659:1: ( ( ruleCssNamespacePrefix ) )
            // InternalCssDslParser.g:7660:2: ( ruleCssNamespacePrefix )
            {
            // InternalCssDslParser.g:7660:2: ( ruleCssNamespacePrefix )
            // InternalCssDslParser.g:7661:3: ruleCssNamespacePrefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUniversalSelectorAccess().getNamespaceCssNamespacePrefixParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssNamespacePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUniversalSelectorAccess().getNamespaceCssNamespacePrefixParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniversalSelector__NamespaceAssignment_1"


    // $ANTLR start "rule__IdSelector__NameAssignment_2"
    // InternalCssDslParser.g:7670:1: rule__IdSelector__NameAssignment_2 : ( ruleIdentifier ) ;
    public final void rule__IdSelector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7674:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7675:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7675:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7676:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdSelectorAccess().getNameIdentifierParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdSelector__NameAssignment_2"


    // $ANTLR start "rule__CssProperty__NameAssignment_1"
    // InternalCssDslParser.g:7685:1: rule__CssProperty__NameAssignment_1 : ( ruleValidPropertyIdent ) ;
    public final void rule__CssProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7689:1: ( ( ruleValidPropertyIdent ) )
            // InternalCssDslParser.g:7690:2: ( ruleValidPropertyIdent )
            {
            // InternalCssDslParser.g:7690:2: ( ruleValidPropertyIdent )
            // InternalCssDslParser.g:7691:3: ruleValidPropertyIdent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssPropertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidPropertyIdent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssPropertyAccess().getNameValidPropertyIdentParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CssProperty__NameAssignment_1"


    // $ANTLR start "rule__PseudoClass__NameAssignment_2"
    // InternalCssDslParser.g:7700:1: rule__PseudoClass__NameAssignment_2 : ( rulePseudoClassName ) ;
    public final void rule__PseudoClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7704:1: ( ( rulePseudoClassName ) )
            // InternalCssDslParser.g:7705:2: ( rulePseudoClassName )
            {
            // InternalCssDslParser.g:7705:2: ( rulePseudoClassName )
            // InternalCssDslParser.g:7706:3: rulePseudoClassName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassAccess().getNamePseudoClassNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePseudoClassName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassAccess().getNamePseudoClassNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClass__NameAssignment_2"


    // $ANTLR start "rule__PseudoClassFunction__NotAssignment_0_0"
    // InternalCssDslParser.g:7715:1: rule__PseudoClassFunction__NotAssignment_0_0 : ( ruleNotFunctionCall ) ;
    public final void rule__PseudoClassFunction__NotAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7719:1: ( ( ruleNotFunctionCall ) )
            // InternalCssDslParser.g:7720:2: ( ruleNotFunctionCall )
            {
            // InternalCssDslParser.g:7720:2: ( ruleNotFunctionCall )
            // InternalCssDslParser.g:7721:3: ruleNotFunctionCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNotFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNotNotFunctionCallParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__NotAssignment_0_0"


    // $ANTLR start "rule__PseudoClassFunction__ParamSelectorAssignment_0_1"
    // InternalCssDslParser.g:7730:1: rule__PseudoClassFunction__ParamSelectorAssignment_0_1 : ( ruleSimpleSelectorForNegation ) ;
    public final void rule__PseudoClassFunction__ParamSelectorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7734:1: ( ( ruleSimpleSelectorForNegation ) )
            // InternalCssDslParser.g:7735:2: ( ruleSimpleSelectorForNegation )
            {
            // InternalCssDslParser.g:7735:2: ( ruleSimpleSelectorForNegation )
            // InternalCssDslParser.g:7736:3: ruleSimpleSelectorForNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleSelectorForNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamSelectorSimpleSelectorForNegationParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__ParamSelectorAssignment_0_1"


    // $ANTLR start "rule__PseudoClassFunction__NameAssignment_1_1"
    // InternalCssDslParser.g:7745:1: rule__PseudoClassFunction__NameAssignment_1_1 : ( ruleIdentifier ) ;
    public final void rule__PseudoClassFunction__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7749:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7750:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7750:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7751:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getNameIdentifierParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__NameAssignment_1_1"


    // $ANTLR start "rule__PseudoClassFunction__ParamsAssignment_1_3"
    // InternalCssDslParser.g:7760:1: rule__PseudoClassFunction__ParamsAssignment_1_3 : ( ruleCssTok ) ;
    public final void rule__PseudoClassFunction__ParamsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7764:1: ( ( ruleCssTok ) )
            // InternalCssDslParser.g:7765:2: ( ruleCssTok )
            {
            // InternalCssDslParser.g:7765:2: ( ruleCssTok )
            // InternalCssDslParser.g:7766:3: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassFunctionAccess().getParamsCssTokParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassFunction__ParamsAssignment_1_3"


    // $ANTLR start "rule__SymbolTok__SymbolAssignment_1"
    // InternalCssDslParser.g:7775:1: rule__SymbolTok__SymbolAssignment_1 : ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) ;
    public final void rule__SymbolTok__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7779:1: ( ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) ) )
            // InternalCssDslParser.g:7780:2: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
            {
            // InternalCssDslParser.g:7780:2: ( ( rule__SymbolTok__SymbolAlternatives_1_0 ) )
            // InternalCssDslParser.g:7781:3: ( rule__SymbolTok__SymbolAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0()); 
            }
            // InternalCssDslParser.g:7782:3: ( rule__SymbolTok__SymbolAlternatives_1_0 )
            // InternalCssDslParser.g:7782:4: rule__SymbolTok__SymbolAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SymbolTok__SymbolAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolTokAccess().getSymbolAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolTok__SymbolAssignment_1"


    // $ANTLR start "rule__StringTok__ValueAssignment_1"
    // InternalCssDslParser.g:7790:1: rule__StringTok__ValueAssignment_1 : ( RULE_CSSSTRING ) ;
    public final void rule__StringTok__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7794:1: ( ( RULE_CSSSTRING ) )
            // InternalCssDslParser.g:7795:2: ( RULE_CSSSTRING )
            {
            // InternalCssDslParser.g:7795:2: ( RULE_CSSSTRING )
            // InternalCssDslParser.g:7796:3: RULE_CSSSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CSSSTRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTokAccess().getValueCSSSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringTok__ValueAssignment_1"


    // $ANTLR start "rule__NumberTok__ValAssignment_1"
    // InternalCssDslParser.g:7805:1: rule__NumberTok__ValAssignment_1 : ( ruleNum ) ;
    public final void rule__NumberTok__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7809:1: ( ( ruleNum ) )
            // InternalCssDslParser.g:7810:2: ( ruleNum )
            {
            // InternalCssDslParser.g:7810:2: ( ruleNum )
            // InternalCssDslParser.g:7811:3: ruleNum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberTokAccess().getValNumParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTok__ValAssignment_1"


    // $ANTLR start "rule__UrlTok__UrlAssignment_1"
    // InternalCssDslParser.g:7820:1: rule__UrlTok__UrlAssignment_1 : ( ruleURLType ) ;
    public final void rule__UrlTok__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7824:1: ( ( ruleURLType ) )
            // InternalCssDslParser.g:7825:2: ( ruleURLType )
            {
            // InternalCssDslParser.g:7825:2: ( ruleURLType )
            // InternalCssDslParser.g:7826:3: ruleURLType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleURLType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUrlTokAccess().getUrlURLTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTok__UrlAssignment_1"


    // $ANTLR start "rule__ColorTok__ValueAssignment_1"
    // InternalCssDslParser.g:7835:1: rule__ColorTok__ValueAssignment_1 : ( ruleHex ) ;
    public final void rule__ColorTok__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7839:1: ( ( ruleHex ) )
            // InternalCssDslParser.g:7840:2: ( ruleHex )
            {
            // InternalCssDslParser.g:7840:2: ( ruleHex )
            // InternalCssDslParser.g:7841:3: ruleHex
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorTokAccess().getValueHexParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorTok__ValueAssignment_1"


    // $ANTLR start "rule__IdentifierOrFuncTok__NameAssignment_1"
    // InternalCssDslParser.g:7850:1: rule__IdentifierOrFuncTok__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__IdentifierOrFuncTok__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7854:1: ( ( ruleIdentifier ) )
            // InternalCssDslParser.g:7855:2: ( ruleIdentifier )
            {
            // InternalCssDslParser.g:7855:2: ( ruleIdentifier )
            // InternalCssDslParser.g:7856:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getNameIdentifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__NameAssignment_1"


    // $ANTLR start "rule__IdentifierOrFuncTok__ParamsAssignment_2_2"
    // InternalCssDslParser.g:7865:1: rule__IdentifierOrFuncTok__ParamsAssignment_2_2 : ( ruleCssTok ) ;
    public final void rule__IdentifierOrFuncTok__ParamsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7869:1: ( ( ruleCssTok ) )
            // InternalCssDslParser.g:7870:2: ( ruleCssTok )
            {
            // InternalCssDslParser.g:7870:2: ( ruleCssTok )
            // InternalCssDslParser.g:7871:3: ruleCssTok
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCssTok();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierOrFuncTokAccess().getParamsCssTokParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierOrFuncTok__ParamsAssignment_2_2"


    // $ANTLR start "rule__URLType__UrlAssignment_1"
    // InternalCssDslParser.g:7880:1: rule__URLType__UrlAssignment_1 : ( ruleValidURL ) ;
    public final void rule__URLType__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssDslParser.g:7884:1: ( ( ruleValidURL ) )
            // InternalCssDslParser.g:7885:2: ( ruleValidURL )
            {
            // InternalCssDslParser.g:7885:2: ( ruleValidURL )
            // InternalCssDslParser.g:7886:3: ruleValidURL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidURL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getURLTypeAccess().getUrlValidURLParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__UrlAssignment_1"

    // $ANTLR start synpred127_InternalCssDslParser
    public final void synpred127_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6514:3: ( rule__Identifier__Group_2__0 )
        // InternalCssDslParser.g:6514:3: rule__Identifier__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__Identifier__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_InternalCssDslParser

    // $ANTLR start synpred129_InternalCssDslParser
    public final void synpred129_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6655:4: ( RULE_ONE_INT )
        // InternalCssDslParser.g:6655:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_InternalCssDslParser

    // $ANTLR start synpred130_InternalCssDslParser
    public final void synpred130_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6690:4: ( RULE_ONE_INT )
        // InternalCssDslParser.g:6690:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_InternalCssDslParser

    // $ANTLR start synpred131_InternalCssDslParser
    public final void synpred131_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6717:3: ( rule__Num__Group_1_1_1__0 )
        // InternalCssDslParser.g:6717:3: rule__Num__Group_1_1_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Num__Group_1_1_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_InternalCssDslParser

    // $ANTLR start synpred132_InternalCssDslParser
    public final void synpred132_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6777:4: ( RULE_ONE_INT )
        // InternalCssDslParser.g:6777:4: RULE_ONE_INT
        {
        match(input,RULE_ONE_INT,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_InternalCssDslParser

    // $ANTLR start synpred133_InternalCssDslParser
    public final void synpred133_InternalCssDslParser_fragment() throws RecognitionException {   
        // InternalCssDslParser.g:6838:4: ( rule__Hex__Group_1__0 )
        // InternalCssDslParser.g:6838:4: rule__Hex__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Hex__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_InternalCssDslParser

    // Delegated rules

    public final boolean synpred129_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_InternalCssDslParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalCssDslParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\2\uffff\7\23\1\uffff\11\23\1\uffff";
    static final String dfa_3s = "\11\14\1\uffff\11\14\1\uffff";
    static final String dfa_4s = "\1\60\1\57\7\72\1\uffff\11\72\1\uffff";
    static final String dfa_5s = "\11\uffff\1\2\11\uffff\1\1";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1511:1: rule__SimpleSelectorForNegation__Alternatives_0_0 : ( ( ( rule__SimpleSelectorForNegation__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelectorForNegation__UniversalAssignment_0_0_1 ) ) );";
        }
    }
    static final String[] dfa_8s = {
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
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "1593:1: rule__SimpleSelector__Alternatives_0_0 : ( ( ( rule__SimpleSelector__ElementAssignment_0_0_0 ) ) | ( ( rule__SimpleSelector__UniversalAssignment_0_0_1 ) ) );";
        }
    }
    static final String dfa_9s = "\25\uffff";
    static final String dfa_10s = "\4\uffff\7\13\1\uffff\11\13";
    static final String dfa_11s = "\1\72\1\12\1\uffff\10\14\1\uffff\11\14";
    static final String dfa_12s = "\2\72\1\uffff\1\57\7\72\1\uffff\11\72";
    static final String dfa_13s = "\2\uffff\1\2\10\uffff\1\1\11\uffff";
    static final String dfa_14s = "\25\uffff}>";
    static final String[] dfa_15s = {
            "\1\1",
            "\1\2\1\uffff\1\7\1\11\10\uffff\1\10\1\12\25\uffff\1\5\1\6\1\4\1\3\11\uffff\1\13",
            "",
            "\1\7\1\11\10\uffff\1\10\1\12\25\uffff\1\5\1\6\1\4",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13",
            "\1\21\1\23\10\uffff\1\22\1\24\3\uffff\1\2\2\uffff\1\13\3\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1\uffff\1\20\1\16\1\17\1\14\1\15\3\13\2\uffff\1\13\3\uffff\1\13"
    };

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_9;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "1734:1: rule__PseudoClassOrFunc__Alternatives : ( ( rulePseudoClass ) | ( rulePseudoClassFunction ) );";
        }
    }
    static final String dfa_16s = "\4\uffff";
    static final String dfa_17s = "\2\47\2\uffff";
    static final String dfa_18s = "\2\66\2\uffff";
    static final String dfa_19s = "\2\uffff\1\2\1\1";
    static final String dfa_20s = "\4\uffff}>";
    static final String[] dfa_21s = {
            "\1\2\13\uffff\1\3\2\uffff\1\1",
            "\1\2\13\uffff\1\3\2\uffff\1\1",
            "",
            ""
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 3902:2: ( rule__Ruleset__Group_1__0 )*";
        }
    }
    static final String dfa_22s = "\5\uffff";
    static final String dfa_23s = "\1\3\4\uffff";
    static final String dfa_24s = "\1\42\1\uffff\1\14\1\uffff\1\14";
    static final String dfa_25s = "\1\66\1\uffff\1\72\1\uffff\1\72";
    static final String dfa_26s = "\1\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String dfa_27s = "\5\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\4\uffff\1\3\2\uffff\1\1\6\uffff\1\1\1\uffff\1\3\2\uffff\1\2",
            "",
            "\2\1\10\uffff\2\1\5\uffff\2\1\3\uffff\1\1\2\uffff\1\1\1\uffff\1\3\1\1\1\uffff\1\1\2\uffff\6\1\1\3\2\uffff\1\4\3\uffff\1\1",
            "",
            "\2\1\10\uffff\2\1\5\uffff\2\1\3\uffff\1\1\2\uffff\1\1\1\uffff\1\3\1\1\1\uffff\1\1\2\uffff\6\1\1\3\2\uffff\1\4\3\uffff\1\1"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "4421:2: ( rule__Selector__Alternatives_1 )?";
        }
    }
    static final String dfa_29s = "\14\uffff";
    static final String dfa_30s = "\1\1\13\uffff";
    static final String dfa_31s = "\1\13\1\uffff\11\0\1\uffff";
    static final String dfa_32s = "\1\72\1\uffff\11\0\1\uffff";
    static final String dfa_33s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_34s = "\2\uffff\1\7\1\3\1\2\1\10\1\5\1\0\1\6\1\1\1\4\1\uffff}>";
    static final String[] dfa_35s = {
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

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 6514:2: ( rule__Identifier__Group_2__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_InternalCssDslParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0404002040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x041FF47BE7DF3002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0405E12060C033B0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0405E12060C03332L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0080000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001E00000C03000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001E20100C03000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0405E32060C03000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0405E12060C03002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0405E12060C03330L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0003F20140C03000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003F00040C03000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0048008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0048000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001E20000C03000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0405E12060C03000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00DFF00040C03800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00DFF00040C03802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0042040400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0445E12060C03000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0407E52460C03000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0404002040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x030000420020C000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0081E00000C03000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001E10020C03000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0401E00000C03000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00DFF00050C03800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x049FF47BE7DF3000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000C03000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001F00000C03000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001F00000C03002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000300000000002L});

}