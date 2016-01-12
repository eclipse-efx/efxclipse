package org.eclipse.fx.ide.css.cssext.ide.contentassist.antlr.internal;

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
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_STRING", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'*'", "'+'", "'?'", "','", "'%'", "'namespace'", "'import'", "'.'", "'package'", "'{'", "'}'", "'('", "'->'", "')'", "'extends'", "'styleclass'", "';'", "'default:'", "'<'", "'>'", "'='", "'|'", "'||'", "'~'", "'['", "']'", "'substructure'", "'@INT'", "'@NUM'", "'@PROPERTY_REF'", "'@STRING'", "'@URL'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_PSEUDO=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGEX=11;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=9;
    public static final int T__38=38;
    public static final int RULE_JDOC=7;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCssExtDsl.g"; }


    	private CssExtDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(CssExtDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCssExtension"
    // InternalCssExtDsl.g:54:1: entryRuleCssExtension : ruleCssExtension EOF ;
    public final void entryRuleCssExtension() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:55:1: ( ruleCssExtension EOF )
            // InternalCssExtDsl.g:56:1: ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCssExtension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionRule()); 
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
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // InternalCssExtDsl.g:63:1: ruleCssExtension : ( ( rule__CssExtension__Group__0 ) ) ;
    public final void ruleCssExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:67:2: ( ( ( rule__CssExtension__Group__0 ) ) )
            // InternalCssExtDsl.g:68:2: ( ( rule__CssExtension__Group__0 ) )
            {
            // InternalCssExtDsl.g:68:2: ( ( rule__CssExtension__Group__0 ) )
            // InternalCssExtDsl.g:69:3: ( rule__CssExtension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:70:3: ( rule__CssExtension__Group__0 )
            // InternalCssExtDsl.g:70:4: rule__CssExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // InternalCssExtDsl.g:79:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:80:1: ( ruleImport EOF )
            // InternalCssExtDsl.g:81:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCssExtDsl.g:88:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:92:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalCssExtDsl.g:93:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalCssExtDsl.g:93:2: ( ( rule__Import__Group__0 ) )
            // InternalCssExtDsl.g:94:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:95:3: ( rule__Import__Group__0 )
            // InternalCssExtDsl.g:95:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // InternalCssExtDsl.g:104:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:105:1: ( ruleValidID EOF )
            // InternalCssExtDsl.g:106:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCssExtDsl.g:113:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:117:2: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:118:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:118:2: ( RULE_ID )
            // InternalCssExtDsl.g:119:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCssExtDsl.g:129:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:130:1: ( ruleQualifiedName EOF )
            // InternalCssExtDsl.g:131:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCssExtDsl.g:138:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:142:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCssExtDsl.g:143:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCssExtDsl.g:143:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCssExtDsl.g:144:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:145:3: ( rule__QualifiedName__Group__0 )
            // InternalCssExtDsl.g:145:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:154:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:155:1: ( ruleQualifiedNameWithWildCard EOF )
            // InternalCssExtDsl.g:156:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:163:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:167:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // InternalCssExtDsl.g:168:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // InternalCssExtDsl.g:168:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // InternalCssExtDsl.g:169:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:170:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            // InternalCssExtDsl.g:170:4: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalCssExtDsl.g:179:1: entryRulePackageDefinition : rulePackageDefinition EOF ;
    public final void entryRulePackageDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:180:1: ( rulePackageDefinition EOF )
            // InternalCssExtDsl.g:181:1: rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionRule()); 
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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalCssExtDsl.g:188:1: rulePackageDefinition : ( ( rule__PackageDefinition__Group__0 ) ) ;
    public final void rulePackageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:192:2: ( ( ( rule__PackageDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:193:2: ( ( rule__PackageDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:193:2: ( ( rule__PackageDefinition__Group__0 ) )
            // InternalCssExtDsl.g:194:3: ( rule__PackageDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:195:3: ( rule__PackageDefinition__Group__0 )
            // InternalCssExtDsl.g:195:4: rule__PackageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // InternalCssExtDsl.g:204:1: entryRuleDoku : ruleDoku EOF ;
    public final void entryRuleDoku() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:205:1: ( ruleDoku EOF )
            // InternalCssExtDsl.g:206:1: ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuRule()); 
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
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // InternalCssExtDsl.g:213:1: ruleDoku : ( ( rule__Doku__ContentAssignment ) ) ;
    public final void ruleDoku() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:217:2: ( ( ( rule__Doku__ContentAssignment ) ) )
            // InternalCssExtDsl.g:218:2: ( ( rule__Doku__ContentAssignment ) )
            {
            // InternalCssExtDsl.g:218:2: ( ( rule__Doku__ContentAssignment ) )
            // InternalCssExtDsl.g:219:3: ( rule__Doku__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentAssignment()); 
            }
            // InternalCssExtDsl.g:220:3: ( rule__Doku__ContentAssignment )
            // InternalCssExtDsl.g:220:4: rule__Doku__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Doku__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentAssignment()); 
            }

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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // InternalCssExtDsl.g:229:1: entryRuleCSSBaseType : ruleCSSBaseType EOF ;
    public final void entryRuleCSSBaseType() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:233:1: ( ruleCSSBaseType EOF )
            // InternalCssExtDsl.g:234:1: ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeRule()); 
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
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // InternalCssExtDsl.g:244:1: ruleCSSBaseType : ( ruleCSSType ) ;
    public final void ruleCSSBaseType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:249:2: ( ( ruleCSSType ) )
            // InternalCssExtDsl.g:250:2: ( ruleCSSType )
            {
            // InternalCssExtDsl.g:250:2: ( ruleCSSType )
            // InternalCssExtDsl.g:251:3: ruleCSSType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall()); 
            }

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
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // InternalCssExtDsl.g:262:1: entryRuleCSSType : ruleCSSType EOF ;
    public final void entryRuleCSSType() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:266:1: ( ruleCSSType EOF )
            // InternalCssExtDsl.g:267:1: ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeRule()); 
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
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // InternalCssExtDsl.g:277:1: ruleCSSType : ( ( rule__CSSType__Alternatives ) ) ;
    public final void ruleCSSType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:282:2: ( ( ( rule__CSSType__Alternatives ) ) )
            // InternalCssExtDsl.g:283:2: ( ( rule__CSSType__Alternatives ) )
            {
            // InternalCssExtDsl.g:283:2: ( ( rule__CSSType__Alternatives ) )
            // InternalCssExtDsl.g:284:3: ( rule__CSSType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:285:3: ( rule__CSSType__Alternatives )
            // InternalCssExtDsl.g:285:4: rule__CSSType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // InternalCssExtDsl.g:295:1: entryRuleElementDefinition : ruleElementDefinition EOF ;
    public final void entryRuleElementDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:296:1: ( ruleElementDefinition EOF )
            // InternalCssExtDsl.g:297:1: ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionRule()); 
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
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // InternalCssExtDsl.g:304:1: ruleElementDefinition : ( ( rule__ElementDefinition__Group__0 ) ) ;
    public final void ruleElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:308:2: ( ( ( rule__ElementDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:309:2: ( ( rule__ElementDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:309:2: ( ( rule__ElementDefinition__Group__0 ) )
            // InternalCssExtDsl.g:310:3: ( rule__ElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:311:3: ( rule__ElementDefinition__Group__0 )
            // InternalCssExtDsl.g:311:4: rule__ElementDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalCssExtDsl.g:320:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:321:1: ( rulePropertyDefinition EOF )
            // InternalCssExtDsl.g:322:1: rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionRule()); 
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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalCssExtDsl.g:329:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:333:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:334:2: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:334:2: ( ( rule__PropertyDefinition__Group__0 ) )
            // InternalCssExtDsl.g:335:3: ( rule__PropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:336:3: ( rule__PropertyDefinition__Group__0 )
            // InternalCssExtDsl.g:336:4: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // InternalCssExtDsl.g:345:1: entryRulePseudoClassDefinition : rulePseudoClassDefinition EOF ;
    public final void entryRulePseudoClassDefinition() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:346:1: ( rulePseudoClassDefinition EOF )
            // InternalCssExtDsl.g:347:1: rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionRule()); 
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
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // InternalCssExtDsl.g:354:1: rulePseudoClassDefinition : ( ( rule__PseudoClassDefinition__Group__0 ) ) ;
    public final void rulePseudoClassDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:358:2: ( ( ( rule__PseudoClassDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:359:2: ( ( rule__PseudoClassDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:359:2: ( ( rule__PseudoClassDefinition__Group__0 ) )
            // InternalCssExtDsl.g:360:3: ( rule__PseudoClassDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:361:3: ( rule__PseudoClassDefinition__Group__0 )
            // InternalCssExtDsl.g:361:4: rule__PseudoClassDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // InternalCssExtDsl.g:370:1: entryRuleCSSRuleRef : ruleCSSRuleRef EOF ;
    public final void entryRuleCSSRuleRef() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:374:1: ( ruleCSSRuleRef EOF )
            // InternalCssExtDsl.g:375:1: ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefRule()); 
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
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // InternalCssExtDsl.g:385:1: ruleCSSRuleRef : ( ( rule__CSSRuleRef__Group__0 ) ) ;
    public final void ruleCSSRuleRef() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:390:2: ( ( ( rule__CSSRuleRef__Group__0 ) ) )
            // InternalCssExtDsl.g:391:2: ( ( rule__CSSRuleRef__Group__0 ) )
            {
            // InternalCssExtDsl.g:391:2: ( ( rule__CSSRuleRef__Group__0 ) )
            // InternalCssExtDsl.g:392:3: ( rule__CSSRuleRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:393:3: ( rule__CSSRuleRef__Group__0 )
            // InternalCssExtDsl.g:393:4: rule__CSSRuleRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // InternalCssExtDsl.g:403:1: entryRuleCSSRuleDefinition : ruleCSSRuleDefinition EOF ;
    public final void entryRuleCSSRuleDefinition() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:407:1: ( ruleCSSRuleDefinition EOF )
            // InternalCssExtDsl.g:408:1: ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionRule()); 
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
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // InternalCssExtDsl.g:418:1: ruleCSSRuleDefinition : ( ( rule__CSSRuleDefinition__Group__0 ) ) ;
    public final void ruleCSSRuleDefinition() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:423:2: ( ( ( rule__CSSRuleDefinition__Group__0 ) ) )
            // InternalCssExtDsl.g:424:2: ( ( rule__CSSRuleDefinition__Group__0 ) )
            {
            // InternalCssExtDsl.g:424:2: ( ( rule__CSSRuleDefinition__Group__0 ) )
            // InternalCssExtDsl.g:425:3: ( rule__CSSRuleDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:426:3: ( rule__CSSRuleDefinition__Group__0 )
            // InternalCssExtDsl.g:426:4: rule__CSSRuleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // InternalCssExtDsl.g:436:1: entryRuleCSSRuleFunc : ruleCSSRuleFunc EOF ;
    public final void entryRuleCSSRuleFunc() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:440:1: ( ruleCSSRuleFunc EOF )
            // InternalCssExtDsl.g:441:1: ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncRule()); 
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
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // InternalCssExtDsl.g:451:1: ruleCSSRuleFunc : ( ( rule__CSSRuleFunc__Group__0 ) ) ;
    public final void ruleCSSRuleFunc() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:456:2: ( ( ( rule__CSSRuleFunc__Group__0 ) ) )
            // InternalCssExtDsl.g:457:2: ( ( rule__CSSRuleFunc__Group__0 ) )
            {
            // InternalCssExtDsl.g:457:2: ( ( rule__CSSRuleFunc__Group__0 ) )
            // InternalCssExtDsl.g:458:3: ( rule__CSSRuleFunc__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:459:3: ( rule__CSSRuleFunc__Group__0 )
            // InternalCssExtDsl.g:459:4: rule__CSSRuleFunc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // InternalCssExtDsl.g:469:1: entryRuleCSSRuleOr : ruleCSSRuleOr EOF ;
    public final void entryRuleCSSRuleOr() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:473:1: ( ruleCSSRuleOr EOF )
            // InternalCssExtDsl.g:474:1: ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrRule()); 
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
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // InternalCssExtDsl.g:484:1: ruleCSSRuleOr : ( ( rule__CSSRuleOr__Group__0 ) ) ;
    public final void ruleCSSRuleOr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:489:2: ( ( ( rule__CSSRuleOr__Group__0 ) ) )
            // InternalCssExtDsl.g:490:2: ( ( rule__CSSRuleOr__Group__0 ) )
            {
            // InternalCssExtDsl.g:490:2: ( ( rule__CSSRuleOr__Group__0 ) )
            // InternalCssExtDsl.g:491:3: ( rule__CSSRuleOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:492:3: ( rule__CSSRuleOr__Group__0 )
            // InternalCssExtDsl.g:492:4: rule__CSSRuleOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // InternalCssExtDsl.g:502:1: entryRuleCSSRuleXor : ruleCSSRuleXor EOF ;
    public final void entryRuleCSSRuleXor() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:506:1: ( ruleCSSRuleXor EOF )
            // InternalCssExtDsl.g:507:1: ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorRule()); 
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
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // InternalCssExtDsl.g:517:1: ruleCSSRuleXor : ( ( rule__CSSRuleXor__Group__0 ) ) ;
    public final void ruleCSSRuleXor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:522:2: ( ( ( rule__CSSRuleXor__Group__0 ) ) )
            // InternalCssExtDsl.g:523:2: ( ( rule__CSSRuleXor__Group__0 ) )
            {
            // InternalCssExtDsl.g:523:2: ( ( rule__CSSRuleXor__Group__0 ) )
            // InternalCssExtDsl.g:524:3: ( rule__CSSRuleXor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:525:3: ( rule__CSSRuleXor__Group__0 )
            // InternalCssExtDsl.g:525:4: rule__CSSRuleXor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // InternalCssExtDsl.g:535:1: entryRuleCSSRuleConcat : ruleCSSRuleConcat EOF ;
    public final void entryRuleCSSRuleConcat() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:539:1: ( ruleCSSRuleConcat EOF )
            // InternalCssExtDsl.g:540:1: ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatRule()); 
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
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // InternalCssExtDsl.g:550:1: ruleCSSRuleConcat : ( ( rule__CSSRuleConcat__Group__0 ) ) ;
    public final void ruleCSSRuleConcat() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:555:2: ( ( ( rule__CSSRuleConcat__Group__0 ) ) )
            // InternalCssExtDsl.g:556:2: ( ( rule__CSSRuleConcat__Group__0 ) )
            {
            // InternalCssExtDsl.g:556:2: ( ( rule__CSSRuleConcat__Group__0 ) )
            // InternalCssExtDsl.g:557:3: ( rule__CSSRuleConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:558:3: ( rule__CSSRuleConcat__Group__0 )
            // InternalCssExtDsl.g:558:4: rule__CSSRuleConcat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:568:1: entryRuleCSSRuleConcatWithoutSpace : ruleCSSRuleConcatWithoutSpace EOF ;
    public final void entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:572:1: ( ruleCSSRuleConcatWithoutSpace EOF )
            // InternalCssExtDsl.g:573:1: ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
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
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:583:1: ruleCSSRuleConcatWithoutSpace : ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) ) ;
    public final void ruleCSSRuleConcatWithoutSpace() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:588:2: ( ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) ) )
            // InternalCssExtDsl.g:589:2: ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) )
            {
            // InternalCssExtDsl.g:589:2: ( ( rule__CSSRuleConcatWithoutSpace__Group__0 ) )
            // InternalCssExtDsl.g:590:3: ( rule__CSSRuleConcatWithoutSpace__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:591:3: ( rule__CSSRuleConcatWithoutSpace__Group__0 )
            // InternalCssExtDsl.g:591:4: rule__CSSRuleConcatWithoutSpace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // InternalCssExtDsl.g:601:1: entryRuleCSSRulePostfix : ruleCSSRulePostfix EOF ;
    public final void entryRuleCSSRulePostfix() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:605:1: ( ruleCSSRulePostfix EOF )
            // InternalCssExtDsl.g:606:1: ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixRule()); 
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
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // InternalCssExtDsl.g:616:1: ruleCSSRulePostfix : ( ( rule__CSSRulePostfix__Group__0 ) ) ;
    public final void ruleCSSRulePostfix() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:621:2: ( ( ( rule__CSSRulePostfix__Group__0 ) ) )
            // InternalCssExtDsl.g:622:2: ( ( rule__CSSRulePostfix__Group__0 ) )
            {
            // InternalCssExtDsl.g:622:2: ( ( rule__CSSRulePostfix__Group__0 ) )
            // InternalCssExtDsl.g:623:3: ( rule__CSSRulePostfix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:624:3: ( rule__CSSRulePostfix__Group__0 )
            // InternalCssExtDsl.g:624:4: rule__CSSRulePostfix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // InternalCssExtDsl.g:634:1: entryRuleCSSRuleBracket : ruleCSSRuleBracket EOF ;
    public final void entryRuleCSSRuleBracket() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:638:1: ( ruleCSSRuleBracket EOF )
            // InternalCssExtDsl.g:639:1: ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketRule()); 
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
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // InternalCssExtDsl.g:649:1: ruleCSSRuleBracket : ( ( rule__CSSRuleBracket__Group__0 ) ) ;
    public final void ruleCSSRuleBracket() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:654:2: ( ( ( rule__CSSRuleBracket__Group__0 ) ) )
            // InternalCssExtDsl.g:655:2: ( ( rule__CSSRuleBracket__Group__0 ) )
            {
            // InternalCssExtDsl.g:655:2: ( ( rule__CSSRuleBracket__Group__0 ) )
            // InternalCssExtDsl.g:656:3: ( rule__CSSRuleBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:657:3: ( rule__CSSRuleBracket__Group__0 )
            // InternalCssExtDsl.g:657:4: rule__CSSRuleBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // InternalCssExtDsl.g:667:1: entryRuleCSSRulePrimary : ruleCSSRulePrimary EOF ;
    public final void entryRuleCSSRulePrimary() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:671:1: ( ruleCSSRulePrimary EOF )
            // InternalCssExtDsl.g:672:1: ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryRule()); 
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
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // InternalCssExtDsl.g:682:1: ruleCSSRulePrimary : ( ( rule__CSSRulePrimary__Alternatives ) ) ;
    public final void ruleCSSRulePrimary() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:687:2: ( ( ( rule__CSSRulePrimary__Alternatives ) ) )
            // InternalCssExtDsl.g:688:2: ( ( rule__CSSRulePrimary__Alternatives ) )
            {
            // InternalCssExtDsl.g:688:2: ( ( rule__CSSRulePrimary__Alternatives ) )
            // InternalCssExtDsl.g:689:3: ( rule__CSSRulePrimary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:690:3: ( rule__CSSRulePrimary__Alternatives )
            // InternalCssExtDsl.g:690:4: rule__CSSRulePrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // InternalCssExtDsl.g:700:1: entryRuleCSSRuleRegex : ruleCSSRuleRegex EOF ;
    public final void entryRuleCSSRuleRegex() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:704:1: ( ruleCSSRuleRegex EOF )
            // InternalCssExtDsl.g:705:1: ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexRule()); 
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
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // InternalCssExtDsl.g:715:1: ruleCSSRuleRegex : ( ( rule__CSSRuleRegex__Group__0 ) ) ;
    public final void ruleCSSRuleRegex() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:720:2: ( ( ( rule__CSSRuleRegex__Group__0 ) ) )
            // InternalCssExtDsl.g:721:2: ( ( rule__CSSRuleRegex__Group__0 ) )
            {
            // InternalCssExtDsl.g:721:2: ( ( rule__CSSRuleRegex__Group__0 ) )
            // InternalCssExtDsl.g:722:3: ( rule__CSSRuleRegex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:723:3: ( rule__CSSRuleRegex__Group__0 )
            // InternalCssExtDsl.g:723:4: rule__CSSRuleRegex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // InternalCssExtDsl.g:733:1: entryRuleCSSRuleLiteral : ruleCSSRuleLiteral EOF ;
    public final void entryRuleCSSRuleLiteral() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:734:1: ( ruleCSSRuleLiteral EOF )
            // InternalCssExtDsl.g:735:1: ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralRule()); 
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
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // InternalCssExtDsl.g:742:1: ruleCSSRuleLiteral : ( ( rule__CSSRuleLiteral__Group__0 ) ) ;
    public final void ruleCSSRuleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:746:2: ( ( ( rule__CSSRuleLiteral__Group__0 ) ) )
            // InternalCssExtDsl.g:747:2: ( ( rule__CSSRuleLiteral__Group__0 ) )
            {
            // InternalCssExtDsl.g:747:2: ( ( rule__CSSRuleLiteral__Group__0 ) )
            // InternalCssExtDsl.g:748:3: ( rule__CSSRuleLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:749:3: ( rule__CSSRuleLiteral__Group__0 )
            // InternalCssExtDsl.g:749:4: rule__CSSRuleLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // InternalCssExtDsl.g:758:1: entryRuleCSSRuleSymbol : ruleCSSRuleSymbol EOF ;
    public final void entryRuleCSSRuleSymbol() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:759:1: ( ruleCSSRuleSymbol EOF )
            // InternalCssExtDsl.g:760:1: ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolRule()); 
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
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // InternalCssExtDsl.g:767:1: ruleCSSRuleSymbol : ( ( rule__CSSRuleSymbol__Group__0 ) ) ;
    public final void ruleCSSRuleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:771:2: ( ( ( rule__CSSRuleSymbol__Group__0 ) ) )
            // InternalCssExtDsl.g:772:2: ( ( rule__CSSRuleSymbol__Group__0 ) )
            {
            // InternalCssExtDsl.g:772:2: ( ( rule__CSSRuleSymbol__Group__0 ) )
            // InternalCssExtDsl.g:773:3: ( rule__CSSRuleSymbol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:774:3: ( rule__CSSRuleSymbol__Group__0 )
            // InternalCssExtDsl.g:774:4: rule__CSSRuleSymbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // InternalCssExtDsl.g:783:1: entryRuleCSSDefaultValue : ruleCSSDefaultValue EOF ;
    public final void entryRuleCSSDefaultValue() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:784:1: ( ruleCSSDefaultValue EOF )
            // InternalCssExtDsl.g:785:1: ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueRule()); 
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
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // InternalCssExtDsl.g:792:1: ruleCSSDefaultValue : ( ( rule__CSSDefaultValue__Alternatives ) ) ;
    public final void ruleCSSDefaultValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:796:2: ( ( ( rule__CSSDefaultValue__Alternatives ) ) )
            // InternalCssExtDsl.g:797:2: ( ( rule__CSSDefaultValue__Alternatives ) )
            {
            // InternalCssExtDsl.g:797:2: ( ( rule__CSSDefaultValue__Alternatives ) )
            // InternalCssExtDsl.g:798:3: ( rule__CSSDefaultValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }
            // InternalCssExtDsl.g:799:3: ( rule__CSSDefaultValue__Alternatives )
            // InternalCssExtDsl.g:799:4: rule__CSSDefaultValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // InternalCssExtDsl.g:808:1: entryRuleSubstructureSelector : ruleSubstructureSelector EOF ;
    public final void entryRuleSubstructureSelector() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:812:1: ( ruleSubstructureSelector EOF )
            // InternalCssExtDsl.g:813:1: ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorRule()); 
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
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // InternalCssExtDsl.g:823:1: ruleSubstructureSelector : ( ( rule__SubstructureSelector__Group__0 ) ) ;
    public final void ruleSubstructureSelector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:828:2: ( ( ( rule__SubstructureSelector__Group__0 ) ) )
            // InternalCssExtDsl.g:829:2: ( ( rule__SubstructureSelector__Group__0 ) )
            {
            // InternalCssExtDsl.g:829:2: ( ( rule__SubstructureSelector__Group__0 ) )
            // InternalCssExtDsl.g:830:3: ( rule__SubstructureSelector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:831:3: ( rule__SubstructureSelector__Group__0 )
            // InternalCssExtDsl.g:831:4: rule__SubstructureSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // InternalCssExtDsl.g:841:1: entryRuleSubstructure : ruleSubstructure EOF ;
    public final void entryRuleSubstructure() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:842:1: ( ruleSubstructure EOF )
            // InternalCssExtDsl.g:843:1: ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureRule()); 
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
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // InternalCssExtDsl.g:850:1: ruleSubstructure : ( ( rule__Substructure__Group__0 ) ) ;
    public final void ruleSubstructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:854:2: ( ( ( rule__Substructure__Group__0 ) ) )
            // InternalCssExtDsl.g:855:2: ( ( rule__Substructure__Group__0 ) )
            {
            // InternalCssExtDsl.g:855:2: ( ( rule__Substructure__Group__0 ) )
            // InternalCssExtDsl.g:856:3: ( rule__Substructure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:857:3: ( rule__Substructure__Group__0 )
            // InternalCssExtDsl.g:857:4: rule__Substructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // InternalCssExtDsl.g:866:1: entryRuleSubstructureStyleclass : ruleSubstructureStyleclass EOF ;
    public final void entryRuleSubstructureStyleclass() throws RecognitionException {
        try {
            // InternalCssExtDsl.g:867:1: ( ruleSubstructureStyleclass EOF )
            // InternalCssExtDsl.g:868:1: ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassRule()); 
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
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // InternalCssExtDsl.g:875:1: ruleSubstructureStyleclass : ( ( rule__SubstructureStyleclass__Group__0 ) ) ;
    public final void ruleSubstructureStyleclass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:879:2: ( ( ( rule__SubstructureStyleclass__Group__0 ) ) )
            // InternalCssExtDsl.g:880:2: ( ( rule__SubstructureStyleclass__Group__0 ) )
            {
            // InternalCssExtDsl.g:880:2: ( ( rule__SubstructureStyleclass__Group__0 ) )
            // InternalCssExtDsl.g:881:3: ( rule__SubstructureStyleclass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getGroup()); 
            }
            // InternalCssExtDsl.g:882:3: ( rule__SubstructureStyleclass__Group__0 )
            // InternalCssExtDsl.g:882:4: rule__SubstructureStyleclass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSubstructureStyleclass"


    // $ANTLR start "rule__PackageDefinition__Alternatives_4"
    // InternalCssExtDsl.g:890:1: rule__PackageDefinition__Alternatives_4 : ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) );
    public final void rule__PackageDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:894:1: ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCssExtDsl.g:895:2: ( ( rule__PackageDefinition__RulesAssignment_4_0 ) )
                    {
                    // InternalCssExtDsl.g:895:2: ( ( rule__PackageDefinition__RulesAssignment_4_0 ) )
                    // InternalCssExtDsl.g:896:3: ( rule__PackageDefinition__RulesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_4_0()); 
                    }
                    // InternalCssExtDsl.g:897:3: ( rule__PackageDefinition__RulesAssignment_4_0 )
                    // InternalCssExtDsl.g:897:4: rule__PackageDefinition__RulesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__RulesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getRulesAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:901:2: ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) )
                    {
                    // InternalCssExtDsl.g:901:2: ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) )
                    // InternalCssExtDsl.g:902:3: ( rule__PackageDefinition__SubpackagesAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_4_1()); 
                    }
                    // InternalCssExtDsl.g:903:3: ( rule__PackageDefinition__SubpackagesAssignment_4_1 )
                    // InternalCssExtDsl.g:903:4: rule__PackageDefinition__SubpackagesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__SubpackagesAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getSubpackagesAssignment_4_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:907:2: ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) )
                    {
                    // InternalCssExtDsl.g:907:2: ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) )
                    // InternalCssExtDsl.g:908:3: ( rule__PackageDefinition__ElementsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_4_2()); 
                    }
                    // InternalCssExtDsl.g:909:3: ( rule__PackageDefinition__ElementsAssignment_4_2 )
                    // InternalCssExtDsl.g:909:4: rule__PackageDefinition__ElementsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__ElementsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_4_2()); 
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
    // $ANTLR end "rule__PackageDefinition__Alternatives_4"


    // $ANTLR start "rule__CSSType__Alternatives"
    // InternalCssExtDsl.g:917:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) | ( ( rule__CSSType__Group_3__0 ) ) );
    public final void rule__CSSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:921:1: ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) | ( ( rule__CSSType__Group_3__0 ) ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCssExtDsl.g:922:2: ( ( rule__CSSType__Group_0__0 ) )
                    {
                    // InternalCssExtDsl.g:922:2: ( ( rule__CSSType__Group_0__0 ) )
                    // InternalCssExtDsl.g:923:3: ( rule__CSSType__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }
                    // InternalCssExtDsl.g:924:3: ( rule__CSSType__Group_0__0 )
                    // InternalCssExtDsl.g:924:4: rule__CSSType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:928:2: ( ( rule__CSSType__Group_1__0 ) )
                    {
                    // InternalCssExtDsl.g:928:2: ( ( rule__CSSType__Group_1__0 ) )
                    // InternalCssExtDsl.g:929:3: ( rule__CSSType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }
                    // InternalCssExtDsl.g:930:3: ( rule__CSSType__Group_1__0 )
                    // InternalCssExtDsl.g:930:4: rule__CSSType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:934:2: ( ( rule__CSSType__Group_2__0 ) )
                    {
                    // InternalCssExtDsl.g:934:2: ( ( rule__CSSType__Group_2__0 ) )
                    // InternalCssExtDsl.g:935:3: ( rule__CSSType__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }
                    // InternalCssExtDsl.g:936:3: ( rule__CSSType__Group_2__0 )
                    // InternalCssExtDsl.g:936:4: rule__CSSType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:940:2: ( ( rule__CSSType__Group_3__0 ) )
                    {
                    // InternalCssExtDsl.g:940:2: ( ( rule__CSSType__Group_3__0 ) )
                    // InternalCssExtDsl.g:941:3: ( rule__CSSType__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3()); 
                    }
                    // InternalCssExtDsl.g:942:3: ( rule__CSSType__Group_3__0 )
                    // InternalCssExtDsl.g:942:4: rule__CSSType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3()); 
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
    // $ANTLR end "rule__CSSType__Alternatives"


    // $ANTLR start "rule__CSSType__Alternatives_3_1"
    // InternalCssExtDsl.g:950:1: rule__CSSType__Alternatives_3_1 : ( ( ( rule__CSSType__Group_3_1_0__0 ) ) | ( ( rule__CSSType__Group_3_1_1__0 ) ) | ( ( rule__CSSType__Group_3_1_2__0 ) ) | ( ( rule__CSSType__Group_3_1_3__0 ) ) );
    public final void rule__CSSType__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:954:1: ( ( ( rule__CSSType__Group_3_1_0__0 ) ) | ( ( rule__CSSType__Group_3_1_1__0 ) ) | ( ( rule__CSSType__Group_3_1_2__0 ) ) | ( ( rule__CSSType__Group_3_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case 45:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
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
                    // InternalCssExtDsl.g:955:2: ( ( rule__CSSType__Group_3_1_0__0 ) )
                    {
                    // InternalCssExtDsl.g:955:2: ( ( rule__CSSType__Group_3_1_0__0 ) )
                    // InternalCssExtDsl.g:956:3: ( rule__CSSType__Group_3_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3_1_0()); 
                    }
                    // InternalCssExtDsl.g:957:3: ( rule__CSSType__Group_3_1_0__0 )
                    // InternalCssExtDsl.g:957:4: rule__CSSType__Group_3_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:961:2: ( ( rule__CSSType__Group_3_1_1__0 ) )
                    {
                    // InternalCssExtDsl.g:961:2: ( ( rule__CSSType__Group_3_1_1__0 ) )
                    // InternalCssExtDsl.g:962:3: ( rule__CSSType__Group_3_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3_1_1()); 
                    }
                    // InternalCssExtDsl.g:963:3: ( rule__CSSType__Group_3_1_1__0 )
                    // InternalCssExtDsl.g:963:4: rule__CSSType__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:967:2: ( ( rule__CSSType__Group_3_1_2__0 ) )
                    {
                    // InternalCssExtDsl.g:967:2: ( ( rule__CSSType__Group_3_1_2__0 ) )
                    // InternalCssExtDsl.g:968:3: ( rule__CSSType__Group_3_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3_1_2()); 
                    }
                    // InternalCssExtDsl.g:969:3: ( rule__CSSType__Group_3_1_2__0 )
                    // InternalCssExtDsl.g:969:4: rule__CSSType__Group_3_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:973:2: ( ( rule__CSSType__Group_3_1_3__0 ) )
                    {
                    // InternalCssExtDsl.g:973:2: ( ( rule__CSSType__Group_3_1_3__0 ) )
                    // InternalCssExtDsl.g:974:3: ( rule__CSSType__Group_3_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSTypeAccess().getGroup_3_1_3()); 
                    }
                    // InternalCssExtDsl.g:975:3: ( rule__CSSType__Group_3_1_3__0 )
                    // InternalCssExtDsl.g:975:4: rule__CSSType__Group_3_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSTypeAccess().getGroup_3_1_3()); 
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
    // $ANTLR end "rule__CSSType__Alternatives_3_1"


    // $ANTLR start "rule__ElementDefinition__Alternatives_6"
    // InternalCssExtDsl.g:983:1: rule__ElementDefinition__Alternatives_6 : ( ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) ) | ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) ) );
    public final void rule__ElementDefinition__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:987:1: ( ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) ) | ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) ) | ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_JDOC:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_PSEUDO:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCssExtDsl.g:988:2: ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) )
                    {
                    // InternalCssExtDsl.g:988:2: ( ( rule__ElementDefinition__PropertiesAssignment_6_0 ) )
                    // InternalCssExtDsl.g:989:3: ( rule__ElementDefinition__PropertiesAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_6_0()); 
                    }
                    // InternalCssExtDsl.g:990:3: ( rule__ElementDefinition__PropertiesAssignment_6_0 )
                    // InternalCssExtDsl.g:990:4: rule__ElementDefinition__PropertiesAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__PropertiesAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPropertiesAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:994:2: ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) )
                    {
                    // InternalCssExtDsl.g:994:2: ( ( rule__ElementDefinition__PseudoClassesAssignment_6_1 ) )
                    // InternalCssExtDsl.g:995:3: ( rule__ElementDefinition__PseudoClassesAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_6_1()); 
                    }
                    // InternalCssExtDsl.g:996:3: ( rule__ElementDefinition__PseudoClassesAssignment_6_1 )
                    // InternalCssExtDsl.g:996:4: rule__ElementDefinition__PseudoClassesAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__PseudoClassesAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getPseudoClassesAssignment_6_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1000:2: ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) )
                    {
                    // InternalCssExtDsl.g:1000:2: ( ( rule__ElementDefinition__SubstructuresAssignment_6_2 ) )
                    // InternalCssExtDsl.g:1001:3: ( rule__ElementDefinition__SubstructuresAssignment_6_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getSubstructuresAssignment_6_2()); 
                    }
                    // InternalCssExtDsl.g:1002:3: ( rule__ElementDefinition__SubstructuresAssignment_6_2 )
                    // InternalCssExtDsl.g:1002:4: rule__ElementDefinition__SubstructuresAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__SubstructuresAssignment_6_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getSubstructuresAssignment_6_2()); 
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
    // $ANTLR end "rule__ElementDefinition__Alternatives_6"


    // $ANTLR start "rule__CSSRuleDefinition__Alternatives_4"
    // InternalCssExtDsl.g:1010:1: rule__CSSRuleDefinition__Alternatives_4 : ( ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) ) );
    public final void rule__CSSRuleDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1014:1: ( ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) ) | ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_JDOC && LA5_0<=RULE_INT)||LA5_0==RULE_REGEX||(LA5_0>=18 && LA5_0<=19)||LA5_0==33||LA5_0==39||(LA5_0>=42 && LA5_0<=46)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==26) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_ID||(LA5_2>=RULE_JDOC && LA5_2<=RULE_INT)||LA5_2==RULE_REGEX||(LA5_2>=15 && LA5_2<=19)||LA5_2==31||LA5_2==33||(LA5_2>=36 && LA5_2<=39)||(LA5_2>=42 && LA5_2<=46)) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCssExtDsl.g:1015:2: ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) )
                    {
                    // InternalCssExtDsl.g:1015:2: ( ( rule__CSSRuleDefinition__RuleAssignment_4_0 ) )
                    // InternalCssExtDsl.g:1016:3: ( rule__CSSRuleDefinition__RuleAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4_0()); 
                    }
                    // InternalCssExtDsl.g:1017:3: ( rule__CSSRuleDefinition__RuleAssignment_4_0 )
                    // InternalCssExtDsl.g:1017:4: rule__CSSRuleDefinition__RuleAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__RuleAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getRuleAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1021:2: ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) )
                    {
                    // InternalCssExtDsl.g:1021:2: ( ( rule__CSSRuleDefinition__FuncAssignment_4_1 ) )
                    // InternalCssExtDsl.g:1022:3: ( rule__CSSRuleDefinition__FuncAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_4_1()); 
                    }
                    // InternalCssExtDsl.g:1023:3: ( rule__CSSRuleDefinition__FuncAssignment_4_1 )
                    // InternalCssExtDsl.g:1023:4: rule__CSSRuleDefinition__FuncAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__FuncAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleDefinitionAccess().getFuncAssignment_4_1()); 
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
    // $ANTLR end "rule__CSSRuleDefinition__Alternatives_4"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"
    // InternalCssExtDsl.g:1031:1: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 : ( ( '*' ) | ( '+' ) | ( '?' ) );
    public final void rule__CSSRulePostfix__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1035:1: ( ( '*' ) | ( '+' ) | ( '?' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCssExtDsl.g:1036:2: ( '*' )
                    {
                    // InternalCssExtDsl.g:1036:2: ( '*' )
                    // InternalCssExtDsl.g:1037:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1042:2: ( '+' )
                    {
                    // InternalCssExtDsl.g:1042:2: ( '+' )
                    // InternalCssExtDsl.g:1043:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1048:2: ( '?' )
                    {
                    // InternalCssExtDsl.g:1048:2: ( '?' )
                    // InternalCssExtDsl.g:1049:3: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2()); 
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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAlternatives_1_1_0"


    // $ANTLR start "rule__CSSRulePrimary__Alternatives"
    // InternalCssExtDsl.g:1058:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );
    public final void rule__CSSRulePrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1062:1: ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCssExtDsl.g:1063:2: ( ruleCSSRuleRef )
                    {
                    // InternalCssExtDsl.g:1063:2: ( ruleCSSRuleRef )
                    // InternalCssExtDsl.g:1064:3: ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1069:2: ( ruleCSSRuleBracket )
                    {
                    // InternalCssExtDsl.g:1069:2: ( ruleCSSRuleBracket )
                    // InternalCssExtDsl.g:1070:3: ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1075:2: ( ruleCSSRuleLiteral )
                    {
                    // InternalCssExtDsl.g:1075:2: ( ruleCSSRuleLiteral )
                    // InternalCssExtDsl.g:1076:3: ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:1081:2: ( ruleCSSRuleSymbol )
                    {
                    // InternalCssExtDsl.g:1081:2: ( ruleCSSRuleSymbol )
                    // InternalCssExtDsl.g:1082:3: ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCssExtDsl.g:1087:2: ( ruleCSSBaseType )
                    {
                    // InternalCssExtDsl.g:1087:2: ( ruleCSSBaseType )
                    // InternalCssExtDsl.g:1088:3: ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCssExtDsl.g:1093:2: ( ruleCSSRuleRegex )
                    {
                    // InternalCssExtDsl.g:1093:2: ( ruleCSSRuleRegex )
                    // InternalCssExtDsl.g:1094:3: ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalCssExtDsl.g:1099:2: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    {
                    // InternalCssExtDsl.g:1099:2: ( ( rule__CSSRulePrimary__Group_6__0 ) )
                    // InternalCssExtDsl.g:1100:3: ( rule__CSSRulePrimary__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
                    }
                    // InternalCssExtDsl.g:1101:3: ( rule__CSSRulePrimary__Group_6__0 )
                    // InternalCssExtDsl.g:1101:4: rule__CSSRulePrimary__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRulePrimary__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRulePrimaryAccess().getGroup_6()); 
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
    // $ANTLR end "rule__CSSRulePrimary__Alternatives"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAlternatives_2_0"
    // InternalCssExtDsl.g:1109:1: rule__CSSRuleSymbol__SymbolAlternatives_2_0 : ( ( ',' ) | ( '%' ) );
    public final void rule__CSSRuleSymbol__SymbolAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1113:1: ( ( ',' ) | ( '%' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCssExtDsl.g:1114:2: ( ',' )
                    {
                    // InternalCssExtDsl.g:1114:2: ( ',' )
                    // InternalCssExtDsl.g:1115:3: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1120:2: ( '%' )
                    {
                    // InternalCssExtDsl.g:1120:2: ( '%' )
                    // InternalCssExtDsl.g:1121:3: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1()); 
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
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAlternatives_2_0"


    // $ANTLR start "rule__CSSDefaultValue__Alternatives"
    // InternalCssExtDsl.g:1130:1: rule__CSSDefaultValue__Alternatives : ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) );
    public final void rule__CSSDefaultValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1134:1: ( ( ( rule__CSSDefaultValue__Group_0__0 ) ) | ( ( rule__CSSDefaultValue__IvalAssignment_1 ) ) | ( ( rule__CSSDefaultValue__DvalAssignment_2 ) ) | ( ( rule__CSSDefaultValue__SvalAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_JDOC:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt9=3;
                }
                break;
            case RULE_STRING:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCssExtDsl.g:1135:2: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    {
                    // InternalCssExtDsl.g:1135:2: ( ( rule__CSSDefaultValue__Group_0__0 ) )
                    // InternalCssExtDsl.g:1136:3: ( rule__CSSDefaultValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }
                    // InternalCssExtDsl.g:1137:3: ( rule__CSSDefaultValue__Group_0__0 )
                    // InternalCssExtDsl.g:1137:4: rule__CSSDefaultValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1141:2: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    {
                    // InternalCssExtDsl.g:1141:2: ( ( rule__CSSDefaultValue__IvalAssignment_1 ) )
                    // InternalCssExtDsl.g:1142:3: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }
                    // InternalCssExtDsl.g:1143:3: ( rule__CSSDefaultValue__IvalAssignment_1 )
                    // InternalCssExtDsl.g:1143:4: rule__CSSDefaultValue__IvalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__IvalAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getIvalAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:1147:2: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    {
                    // InternalCssExtDsl.g:1147:2: ( ( rule__CSSDefaultValue__DvalAssignment_2 ) )
                    // InternalCssExtDsl.g:1148:3: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }
                    // InternalCssExtDsl.g:1149:3: ( rule__CSSDefaultValue__DvalAssignment_2 )
                    // InternalCssExtDsl.g:1149:4: rule__CSSDefaultValue__DvalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__DvalAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getDvalAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:1153:2: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    {
                    // InternalCssExtDsl.g:1153:2: ( ( rule__CSSDefaultValue__SvalAssignment_3 ) )
                    // InternalCssExtDsl.g:1154:3: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
                    }
                    // InternalCssExtDsl.g:1155:3: ( rule__CSSDefaultValue__SvalAssignment_3 )
                    // InternalCssExtDsl.g:1155:4: rule__CSSDefaultValue__SvalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSDefaultValue__SvalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCSSDefaultValueAccess().getSvalAssignment_3()); 
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
    // $ANTLR end "rule__CSSDefaultValue__Alternatives"


    // $ANTLR start "rule__CssExtension__Group__0"
    // InternalCssExtDsl.g:1163:1: rule__CssExtension__Group__0 : rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 ;
    public final void rule__CssExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1167:1: ( rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1 )
            // InternalCssExtDsl.g:1168:2: rule__CssExtension__Group__0__Impl rule__CssExtension__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CssExtension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__1();

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
    // $ANTLR end "rule__CssExtension__Group__0"


    // $ANTLR start "rule__CssExtension__Group__0__Impl"
    // InternalCssExtDsl.g:1175:1: rule__CssExtension__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__CssExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1179:1: ( ( 'namespace' ) )
            // InternalCssExtDsl.g:1180:1: ( 'namespace' )
            {
            // InternalCssExtDsl.g:1180:1: ( 'namespace' )
            // InternalCssExtDsl.g:1181:2: 'namespace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getNamespaceKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getNamespaceKeyword_0()); 
            }

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
    // $ANTLR end "rule__CssExtension__Group__0__Impl"


    // $ANTLR start "rule__CssExtension__Group__1"
    // InternalCssExtDsl.g:1190:1: rule__CssExtension__Group__1 : rule__CssExtension__Group__1__Impl rule__CssExtension__Group__2 ;
    public final void rule__CssExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1194:1: ( rule__CssExtension__Group__1__Impl rule__CssExtension__Group__2 )
            // InternalCssExtDsl.g:1195:2: rule__CssExtension__Group__1__Impl rule__CssExtension__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CssExtension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__2();

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
    // $ANTLR end "rule__CssExtension__Group__1"


    // $ANTLR start "rule__CssExtension__Group__1__Impl"
    // InternalCssExtDsl.g:1202:1: rule__CssExtension__Group__1__Impl : ( ( rule__CssExtension__NamespaceAssignment_1 ) ) ;
    public final void rule__CssExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1206:1: ( ( ( rule__CssExtension__NamespaceAssignment_1 ) ) )
            // InternalCssExtDsl.g:1207:1: ( ( rule__CssExtension__NamespaceAssignment_1 ) )
            {
            // InternalCssExtDsl.g:1207:1: ( ( rule__CssExtension__NamespaceAssignment_1 ) )
            // InternalCssExtDsl.g:1208:2: ( rule__CssExtension__NamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getNamespaceAssignment_1()); 
            }
            // InternalCssExtDsl.g:1209:2: ( rule__CssExtension__NamespaceAssignment_1 )
            // InternalCssExtDsl.g:1209:3: rule__CssExtension__NamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CssExtension__NamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getNamespaceAssignment_1()); 
            }

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
    // $ANTLR end "rule__CssExtension__Group__1__Impl"


    // $ANTLR start "rule__CssExtension__Group__2"
    // InternalCssExtDsl.g:1217:1: rule__CssExtension__Group__2 : rule__CssExtension__Group__2__Impl rule__CssExtension__Group__3 ;
    public final void rule__CssExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1221:1: ( rule__CssExtension__Group__2__Impl rule__CssExtension__Group__3 )
            // InternalCssExtDsl.g:1222:2: rule__CssExtension__Group__2__Impl rule__CssExtension__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CssExtension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__3();

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
    // $ANTLR end "rule__CssExtension__Group__2"


    // $ANTLR start "rule__CssExtension__Group__2__Impl"
    // InternalCssExtDsl.g:1229:1: rule__CssExtension__Group__2__Impl : ( ( rule__CssExtension__ImportsAssignment_2 )* ) ;
    public final void rule__CssExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1233:1: ( ( ( rule__CssExtension__ImportsAssignment_2 )* ) )
            // InternalCssExtDsl.g:1234:1: ( ( rule__CssExtension__ImportsAssignment_2 )* )
            {
            // InternalCssExtDsl.g:1234:1: ( ( rule__CssExtension__ImportsAssignment_2 )* )
            // InternalCssExtDsl.g:1235:2: ( rule__CssExtension__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsAssignment_2()); 
            }
            // InternalCssExtDsl.g:1236:2: ( rule__CssExtension__ImportsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCssExtDsl.g:1236:3: rule__CssExtension__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CssExtension__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsAssignment_2()); 
            }

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
    // $ANTLR end "rule__CssExtension__Group__2__Impl"


    // $ANTLR start "rule__CssExtension__Group__3"
    // InternalCssExtDsl.g:1244:1: rule__CssExtension__Group__3 : rule__CssExtension__Group__3__Impl ;
    public final void rule__CssExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1248:1: ( rule__CssExtension__Group__3__Impl )
            // InternalCssExtDsl.g:1249:2: rule__CssExtension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CssExtension__Group__3__Impl();

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
    // $ANTLR end "rule__CssExtension__Group__3"


    // $ANTLR start "rule__CssExtension__Group__3__Impl"
    // InternalCssExtDsl.g:1255:1: rule__CssExtension__Group__3__Impl : ( ( rule__CssExtension__PackageDefAssignment_3 )? ) ;
    public final void rule__CssExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1259:1: ( ( ( rule__CssExtension__PackageDefAssignment_3 )? ) )
            // InternalCssExtDsl.g:1260:1: ( ( rule__CssExtension__PackageDefAssignment_3 )? )
            {
            // InternalCssExtDsl.g:1260:1: ( ( rule__CssExtension__PackageDefAssignment_3 )? )
            // InternalCssExtDsl.g:1261:2: ( rule__CssExtension__PackageDefAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_3()); 
            }
            // InternalCssExtDsl.g:1262:2: ( rule__CssExtension__PackageDefAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_JDOC||LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCssExtDsl.g:1262:3: rule__CssExtension__PackageDefAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CssExtension__PackageDefAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefAssignment_3()); 
            }

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
    // $ANTLR end "rule__CssExtension__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalCssExtDsl.g:1271:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1275:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalCssExtDsl.g:1276:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalCssExtDsl.g:1283:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1287:1: ( ( 'import' ) )
            // InternalCssExtDsl.g:1288:1: ( 'import' )
            {
            // InternalCssExtDsl.g:1288:1: ( 'import' )
            // InternalCssExtDsl.g:1289:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalCssExtDsl.g:1298:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1302:1: ( rule__Import__Group__1__Impl )
            // InternalCssExtDsl.g:1303:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalCssExtDsl.g:1309:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1313:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalCssExtDsl.g:1314:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalCssExtDsl.g:1314:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalCssExtDsl.g:1315:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalCssExtDsl.g:1316:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalCssExtDsl.g:1316:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCssExtDsl.g:1325:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1329:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCssExtDsl.g:1330:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCssExtDsl.g:1337:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1341:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:1342:1: ( ruleValidID )
            {
            // InternalCssExtDsl.g:1342:1: ( ruleValidID )
            // InternalCssExtDsl.g:1343:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCssExtDsl.g:1352:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1356:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCssExtDsl.g:1357:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCssExtDsl.g:1363:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1367:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCssExtDsl.g:1368:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCssExtDsl.g:1368:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCssExtDsl.g:1369:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:1370:2: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCssExtDsl.g:1370:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCssExtDsl.g:1379:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1383:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCssExtDsl.g:1384:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCssExtDsl.g:1391:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1395:1: ( ( ( '.' ) ) )
            // InternalCssExtDsl.g:1396:1: ( ( '.' ) )
            {
            // InternalCssExtDsl.g:1396:1: ( ( '.' ) )
            // InternalCssExtDsl.g:1397:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalCssExtDsl.g:1398:2: ( '.' )
            // InternalCssExtDsl.g:1398:3: '.'
            {
            match(input,22,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCssExtDsl.g:1406:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1410:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCssExtDsl.g:1411:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCssExtDsl.g:1417:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1421:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:1422:1: ( ruleValidID )
            {
            // InternalCssExtDsl.g:1422:1: ( ruleValidID )
            // InternalCssExtDsl.g:1423:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // InternalCssExtDsl.g:1433:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1437:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // InternalCssExtDsl.g:1438:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // InternalCssExtDsl.g:1445:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1449:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:1450:1: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1450:1: ( ruleQualifiedName )
            // InternalCssExtDsl.g:1451:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // InternalCssExtDsl.g:1460:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1464:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // InternalCssExtDsl.g:1465:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // InternalCssExtDsl.g:1471:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1475:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // InternalCssExtDsl.g:1476:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:1476:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // InternalCssExtDsl.g:1477:2: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:1478:2: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCssExtDsl.g:1478:3: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedNameWithWildCard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0"
    // InternalCssExtDsl.g:1487:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1491:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // InternalCssExtDsl.g:1492:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group_1__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0__Impl"
    // InternalCssExtDsl.g:1499:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1503:1: ( ( '.' ) )
            // InternalCssExtDsl.g:1504:1: ( '.' )
            {
            // InternalCssExtDsl.g:1504:1: ( '.' )
            // InternalCssExtDsl.g:1505:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1"
    // InternalCssExtDsl.g:1514:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1518:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // InternalCssExtDsl.g:1519:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1__Impl"
    // InternalCssExtDsl.g:1525:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1529:1: ( ( '*' ) )
            // InternalCssExtDsl.g:1530:1: ( '*' )
            {
            // InternalCssExtDsl.g:1530:1: ( '*' )
            // InternalCssExtDsl.g:1531:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__0"
    // InternalCssExtDsl.g:1541:1: rule__PackageDefinition__Group__0 : rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 ;
    public final void rule__PackageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1545:1: ( rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1 )
            // InternalCssExtDsl.g:1546:2: rule__PackageDefinition__Group__0__Impl rule__PackageDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PackageDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__1();

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
    // $ANTLR end "rule__PackageDefinition__Group__0"


    // $ANTLR start "rule__PackageDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:1553:1: rule__PackageDefinition__Group__0__Impl : ( ( rule__PackageDefinition__Group_0__0 )? ) ;
    public final void rule__PackageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1557:1: ( ( ( rule__PackageDefinition__Group_0__0 )? ) )
            // InternalCssExtDsl.g:1558:1: ( ( rule__PackageDefinition__Group_0__0 )? )
            {
            // InternalCssExtDsl.g:1558:1: ( ( rule__PackageDefinition__Group_0__0 )? )
            // InternalCssExtDsl.g:1559:2: ( rule__PackageDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getGroup_0()); 
            }
            // InternalCssExtDsl.g:1560:2: ( rule__PackageDefinition__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_JDOC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCssExtDsl.g:1560:3: rule__PackageDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PackageDefinition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__1"
    // InternalCssExtDsl.g:1568:1: rule__PackageDefinition__Group__1 : rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 ;
    public final void rule__PackageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1572:1: ( rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2 )
            // InternalCssExtDsl.g:1573:2: rule__PackageDefinition__Group__1__Impl rule__PackageDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PackageDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__2();

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
    // $ANTLR end "rule__PackageDefinition__Group__1"


    // $ANTLR start "rule__PackageDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:1580:1: rule__PackageDefinition__Group__1__Impl : ( 'package' ) ;
    public final void rule__PackageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1584:1: ( ( 'package' ) )
            // InternalCssExtDsl.g:1585:1: ( 'package' )
            {
            // InternalCssExtDsl.g:1585:1: ( 'package' )
            // InternalCssExtDsl.g:1586:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__1__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__2"
    // InternalCssExtDsl.g:1595:1: rule__PackageDefinition__Group__2 : rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 ;
    public final void rule__PackageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1599:1: ( rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3 )
            // InternalCssExtDsl.g:1600:2: rule__PackageDefinition__Group__2__Impl rule__PackageDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PackageDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__3();

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
    // $ANTLR end "rule__PackageDefinition__Group__2"


    // $ANTLR start "rule__PackageDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:1607:1: rule__PackageDefinition__Group__2__Impl : ( ( rule__PackageDefinition__NameAssignment_2 ) ) ;
    public final void rule__PackageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1611:1: ( ( ( rule__PackageDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:1612:1: ( ( rule__PackageDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:1612:1: ( ( rule__PackageDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:1613:2: ( rule__PackageDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:1614:2: ( rule__PackageDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:1614:3: rule__PackageDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__2__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__3"
    // InternalCssExtDsl.g:1622:1: rule__PackageDefinition__Group__3 : rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 ;
    public final void rule__PackageDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1626:1: ( rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4 )
            // InternalCssExtDsl.g:1627:2: rule__PackageDefinition__Group__3__Impl rule__PackageDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PackageDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__4();

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
    // $ANTLR end "rule__PackageDefinition__Group__3"


    // $ANTLR start "rule__PackageDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:1634:1: rule__PackageDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__PackageDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1638:1: ( ( '{' ) )
            // InternalCssExtDsl.g:1639:1: ( '{' )
            {
            // InternalCssExtDsl.g:1639:1: ( '{' )
            // InternalCssExtDsl.g:1640:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__3__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__4"
    // InternalCssExtDsl.g:1649:1: rule__PackageDefinition__Group__4 : rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5 ;
    public final void rule__PackageDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1653:1: ( rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5 )
            // InternalCssExtDsl.g:1654:2: rule__PackageDefinition__Group__4__Impl rule__PackageDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__PackageDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__5();

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
    // $ANTLR end "rule__PackageDefinition__Group__4"


    // $ANTLR start "rule__PackageDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:1661:1: rule__PackageDefinition__Group__4__Impl : ( ( rule__PackageDefinition__Alternatives_4 )* ) ;
    public final void rule__PackageDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1665:1: ( ( ( rule__PackageDefinition__Alternatives_4 )* ) )
            // InternalCssExtDsl.g:1666:1: ( ( rule__PackageDefinition__Alternatives_4 )* )
            {
            // InternalCssExtDsl.g:1666:1: ( ( rule__PackageDefinition__Alternatives_4 )* )
            // InternalCssExtDsl.g:1667:2: ( rule__PackageDefinition__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getAlternatives_4()); 
            }
            // InternalCssExtDsl.g:1668:2: ( rule__PackageDefinition__Alternatives_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_JDOC||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCssExtDsl.g:1668:3: rule__PackageDefinition__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__PackageDefinition__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getAlternatives_4()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__4__Impl"


    // $ANTLR start "rule__PackageDefinition__Group__5"
    // InternalCssExtDsl.g:1676:1: rule__PackageDefinition__Group__5 : rule__PackageDefinition__Group__5__Impl ;
    public final void rule__PackageDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1680:1: ( rule__PackageDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:1681:2: rule__PackageDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__PackageDefinition__Group__5"


    // $ANTLR start "rule__PackageDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:1687:1: rule__PackageDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1691:1: ( ( '}' ) )
            // InternalCssExtDsl.g:1692:1: ( '}' )
            {
            // InternalCssExtDsl.g:1692:1: ( '}' )
            // InternalCssExtDsl.g:1693:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group__5__Impl"


    // $ANTLR start "rule__PackageDefinition__Group_0__0"
    // InternalCssExtDsl.g:1703:1: rule__PackageDefinition__Group_0__0 : rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1 ;
    public final void rule__PackageDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1707:1: ( rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1 )
            // InternalCssExtDsl.g:1708:2: rule__PackageDefinition__Group_0__0__Impl rule__PackageDefinition__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__PackageDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group_0__1();

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
    // $ANTLR end "rule__PackageDefinition__Group_0__0"


    // $ANTLR start "rule__PackageDefinition__Group_0__0__Impl"
    // InternalCssExtDsl.g:1715:1: rule__PackageDefinition__Group_0__0__Impl : ( ( rule__PackageDefinition__DokuAssignment_0_0 ) ) ;
    public final void rule__PackageDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1719:1: ( ( ( rule__PackageDefinition__DokuAssignment_0_0 ) ) )
            // InternalCssExtDsl.g:1720:1: ( ( rule__PackageDefinition__DokuAssignment_0_0 ) )
            {
            // InternalCssExtDsl.g:1720:1: ( ( rule__PackageDefinition__DokuAssignment_0_0 ) )
            // InternalCssExtDsl.g:1721:2: ( rule__PackageDefinition__DokuAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getDokuAssignment_0_0()); 
            }
            // InternalCssExtDsl.g:1722:2: ( rule__PackageDefinition__DokuAssignment_0_0 )
            // InternalCssExtDsl.g:1722:3: rule__PackageDefinition__DokuAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__DokuAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getDokuAssignment_0_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__PackageDefinition__Group_0__1"
    // InternalCssExtDsl.g:1730:1: rule__PackageDefinition__Group_0__1 : rule__PackageDefinition__Group_0__1__Impl ;
    public final void rule__PackageDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1734:1: ( rule__PackageDefinition__Group_0__1__Impl )
            // InternalCssExtDsl.g:1735:2: rule__PackageDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDefinition__Group_0__1__Impl();

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
    // $ANTLR end "rule__PackageDefinition__Group_0__1"


    // $ANTLR start "rule__PackageDefinition__Group_0__1__Impl"
    // InternalCssExtDsl.g:1741:1: rule__PackageDefinition__Group_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__PackageDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1745:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:1746:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:1746:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:1747:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1()); 
            }
            // InternalCssExtDsl.g:1748:2: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCssExtDsl.g:1748:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__0"
    // InternalCssExtDsl.g:1757:1: rule__CSSType__Group_0__0 : rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 ;
    public final void rule__CSSType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1761:1: ( rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1 )
            // InternalCssExtDsl.g:1762:2: rule__CSSType__Group_0__0__Impl rule__CSSType__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__1();

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
    // $ANTLR end "rule__CSSType__Group_0__0"


    // $ANTLR start "rule__CSSType__Group_0__0__Impl"
    // InternalCssExtDsl.g:1769:1: rule__CSSType__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1773:1: ( ( () ) )
            // InternalCssExtDsl.g:1774:1: ( () )
            {
            // InternalCssExtDsl.g:1774:1: ( () )
            // InternalCssExtDsl.g:1775:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }
            // InternalCssExtDsl.g:1776:2: ()
            // InternalCssExtDsl.g:1776:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0__1"
    // InternalCssExtDsl.g:1784:1: rule__CSSType__Group_0__1 : rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 ;
    public final void rule__CSSType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1788:1: ( rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2 )
            // InternalCssExtDsl.g:1789:2: rule__CSSType__Group_0__1__Impl rule__CSSType__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__CSSType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__2();

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
    // $ANTLR end "rule__CSSType__Group_0__1"


    // $ANTLR start "rule__CSSType__Group_0__1__Impl"
    // InternalCssExtDsl.g:1796:1: rule__CSSType__Group_0__1__Impl : ( ( rule__CSSType__Group_0_1__0 )? ) ;
    public final void rule__CSSType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1800:1: ( ( ( rule__CSSType__Group_0_1__0 )? ) )
            // InternalCssExtDsl.g:1801:1: ( ( rule__CSSType__Group_0_1__0 )? )
            {
            // InternalCssExtDsl.g:1801:1: ( ( rule__CSSType__Group_0_1__0 )? )
            // InternalCssExtDsl.g:1802:2: ( rule__CSSType__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_0_1()); 
            }
            // InternalCssExtDsl.g:1803:2: ( rule__CSSType__Group_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_JDOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCssExtDsl.g:1803:3: rule__CSSType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_0_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_0__2"
    // InternalCssExtDsl.g:1811:1: rule__CSSType__Group_0__2 : rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 ;
    public final void rule__CSSType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1815:1: ( rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3 )
            // InternalCssExtDsl.g:1816:2: rule__CSSType__Group_0__2__Impl rule__CSSType__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__3();

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
    // $ANTLR end "rule__CSSType__Group_0__2"


    // $ANTLR start "rule__CSSType__Group_0__2__Impl"
    // InternalCssExtDsl.g:1823:1: rule__CSSType__Group_0__2__Impl : ( ( rule__CSSType__TypeAssignment_0_2 ) ) ;
    public final void rule__CSSType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1827:1: ( ( ( rule__CSSType__TypeAssignment_0_2 ) ) )
            // InternalCssExtDsl.g:1828:1: ( ( rule__CSSType__TypeAssignment_0_2 ) )
            {
            // InternalCssExtDsl.g:1828:1: ( ( rule__CSSType__TypeAssignment_0_2 ) )
            // InternalCssExtDsl.g:1829:2: ( rule__CSSType__TypeAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_2()); 
            }
            // InternalCssExtDsl.g:1830:2: ( rule__CSSType__TypeAssignment_0_2 )
            // InternalCssExtDsl.g:1830:3: rule__CSSType__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__2__Impl"


    // $ANTLR start "rule__CSSType__Group_0__3"
    // InternalCssExtDsl.g:1838:1: rule__CSSType__Group_0__3 : rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 ;
    public final void rule__CSSType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1842:1: ( rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4 )
            // InternalCssExtDsl.g:1843:2: rule__CSSType__Group_0__3__Impl rule__CSSType__Group_0__4
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__4();

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
    // $ANTLR end "rule__CSSType__Group_0__3"


    // $ANTLR start "rule__CSSType__Group_0__3__Impl"
    // InternalCssExtDsl.g:1850:1: rule__CSSType__Group_0__3__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1854:1: ( ( '(' ) )
            // InternalCssExtDsl.g:1855:1: ( '(' )
            {
            // InternalCssExtDsl.g:1855:1: ( '(' )
            // InternalCssExtDsl.g:1856:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__3__Impl"


    // $ANTLR start "rule__CSSType__Group_0__4"
    // InternalCssExtDsl.g:1865:1: rule__CSSType__Group_0__4 : rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 ;
    public final void rule__CSSType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1869:1: ( rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5 )
            // InternalCssExtDsl.g:1870:2: rule__CSSType__Group_0__4__Impl rule__CSSType__Group_0__5
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__5();

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
    // $ANTLR end "rule__CSSType__Group_0__4"


    // $ANTLR start "rule__CSSType__Group_0__4__Impl"
    // InternalCssExtDsl.g:1877:1: rule__CSSType__Group_0__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1881:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:1882:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:1882:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:1883:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
            }
            // InternalCssExtDsl.g:1884:2: ( RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCssExtDsl.g:1884:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__4__Impl"


    // $ANTLR start "rule__CSSType__Group_0__5"
    // InternalCssExtDsl.g:1892:1: rule__CSSType__Group_0__5 : rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 ;
    public final void rule__CSSType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1896:1: ( rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6 )
            // InternalCssExtDsl.g:1897:2: rule__CSSType__Group_0__5__Impl rule__CSSType__Group_0__6
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__6();

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
    // $ANTLR end "rule__CSSType__Group_0__5"


    // $ANTLR start "rule__CSSType__Group_0__5__Impl"
    // InternalCssExtDsl.g:1904:1: rule__CSSType__Group_0__5__Impl : ( ( rule__CSSType__FromAssignment_0_5 ) ) ;
    public final void rule__CSSType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1908:1: ( ( ( rule__CSSType__FromAssignment_0_5 ) ) )
            // InternalCssExtDsl.g:1909:1: ( ( rule__CSSType__FromAssignment_0_5 ) )
            {
            // InternalCssExtDsl.g:1909:1: ( ( rule__CSSType__FromAssignment_0_5 ) )
            // InternalCssExtDsl.g:1910:2: ( rule__CSSType__FromAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_0_5()); 
            }
            // InternalCssExtDsl.g:1911:2: ( rule__CSSType__FromAssignment_0_5 )
            // InternalCssExtDsl.g:1911:3: rule__CSSType__FromAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__FromAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_0_5()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__5__Impl"


    // $ANTLR start "rule__CSSType__Group_0__6"
    // InternalCssExtDsl.g:1919:1: rule__CSSType__Group_0__6 : rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 ;
    public final void rule__CSSType__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1923:1: ( rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7 )
            // InternalCssExtDsl.g:1924:2: rule__CSSType__Group_0__6__Impl rule__CSSType__Group_0__7
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__7();

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
    // $ANTLR end "rule__CSSType__Group_0__6"


    // $ANTLR start "rule__CSSType__Group_0__6__Impl"
    // InternalCssExtDsl.g:1931:1: rule__CSSType__Group_0__6__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1935:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:1936:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:1936:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:1937:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
            }
            // InternalCssExtDsl.g:1938:2: ( RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCssExtDsl.g:1938:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__6__Impl"


    // $ANTLR start "rule__CSSType__Group_0__7"
    // InternalCssExtDsl.g:1946:1: rule__CSSType__Group_0__7 : rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 ;
    public final void rule__CSSType__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1950:1: ( rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8 )
            // InternalCssExtDsl.g:1951:2: rule__CSSType__Group_0__7__Impl rule__CSSType__Group_0__8
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__8();

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
    // $ANTLR end "rule__CSSType__Group_0__7"


    // $ANTLR start "rule__CSSType__Group_0__7__Impl"
    // InternalCssExtDsl.g:1958:1: rule__CSSType__Group_0__7__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1962:1: ( ( '->' ) )
            // InternalCssExtDsl.g:1963:1: ( '->' )
            {
            // InternalCssExtDsl.g:1963:1: ( '->' )
            // InternalCssExtDsl.g:1964:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__7__Impl"


    // $ANTLR start "rule__CSSType__Group_0__8"
    // InternalCssExtDsl.g:1973:1: rule__CSSType__Group_0__8 : rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 ;
    public final void rule__CSSType__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1977:1: ( rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9 )
            // InternalCssExtDsl.g:1978:2: rule__CSSType__Group_0__8__Impl rule__CSSType__Group_0__9
            {
            pushFollow(FOLLOW_18);
            rule__CSSType__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__9();

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
    // $ANTLR end "rule__CSSType__Group_0__8"


    // $ANTLR start "rule__CSSType__Group_0__8__Impl"
    // InternalCssExtDsl.g:1985:1: rule__CSSType__Group_0__8__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:1989:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:1990:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:1990:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:1991:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
            }
            // InternalCssExtDsl.g:1992:2: ( RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCssExtDsl.g:1992:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__8__Impl"


    // $ANTLR start "rule__CSSType__Group_0__9"
    // InternalCssExtDsl.g:2000:1: rule__CSSType__Group_0__9 : rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 ;
    public final void rule__CSSType__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2004:1: ( rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10 )
            // InternalCssExtDsl.g:2005:2: rule__CSSType__Group_0__9__Impl rule__CSSType__Group_0__10
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_0__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__10();

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
    // $ANTLR end "rule__CSSType__Group_0__9"


    // $ANTLR start "rule__CSSType__Group_0__9__Impl"
    // InternalCssExtDsl.g:2012:1: rule__CSSType__Group_0__9__Impl : ( ( rule__CSSType__ToAssignment_0_9 ) ) ;
    public final void rule__CSSType__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2016:1: ( ( ( rule__CSSType__ToAssignment_0_9 ) ) )
            // InternalCssExtDsl.g:2017:1: ( ( rule__CSSType__ToAssignment_0_9 ) )
            {
            // InternalCssExtDsl.g:2017:1: ( ( rule__CSSType__ToAssignment_0_9 ) )
            // InternalCssExtDsl.g:2018:2: ( rule__CSSType__ToAssignment_0_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_0_9()); 
            }
            // InternalCssExtDsl.g:2019:2: ( rule__CSSType__ToAssignment_0_9 )
            // InternalCssExtDsl.g:2019:3: rule__CSSType__ToAssignment_0_9
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__ToAssignment_0_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_0_9()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__9__Impl"


    // $ANTLR start "rule__CSSType__Group_0__10"
    // InternalCssExtDsl.g:2027:1: rule__CSSType__Group_0__10 : rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11 ;
    public final void rule__CSSType__Group_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2031:1: ( rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11 )
            // InternalCssExtDsl.g:2032:2: rule__CSSType__Group_0__10__Impl rule__CSSType__Group_0__11
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_0__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__11();

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
    // $ANTLR end "rule__CSSType__Group_0__10"


    // $ANTLR start "rule__CSSType__Group_0__10__Impl"
    // InternalCssExtDsl.g:2039:1: rule__CSSType__Group_0__10__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2043:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2044:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2044:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2045:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
            }
            // InternalCssExtDsl.g:2046:2: ( RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCssExtDsl.g:2046:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__10__Impl"


    // $ANTLR start "rule__CSSType__Group_0__11"
    // InternalCssExtDsl.g:2054:1: rule__CSSType__Group_0__11 : rule__CSSType__Group_0__11__Impl ;
    public final void rule__CSSType__Group_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2058:1: ( rule__CSSType__Group_0__11__Impl )
            // InternalCssExtDsl.g:2059:2: rule__CSSType__Group_0__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0__11__Impl();

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
    // $ANTLR end "rule__CSSType__Group_0__11"


    // $ANTLR start "rule__CSSType__Group_0__11__Impl"
    // InternalCssExtDsl.g:2065:1: rule__CSSType__Group_0__11__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_0__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2069:1: ( ( ')' ) )
            // InternalCssExtDsl.g:2070:1: ( ')' )
            {
            // InternalCssExtDsl.g:2070:1: ( ')' )
            // InternalCssExtDsl.g:2071:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0__11__Impl"


    // $ANTLR start "rule__CSSType__Group_0_1__0"
    // InternalCssExtDsl.g:2081:1: rule__CSSType__Group_0_1__0 : rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1 ;
    public final void rule__CSSType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2085:1: ( rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1 )
            // InternalCssExtDsl.g:2086:2: rule__CSSType__Group_0_1__0__Impl rule__CSSType__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0_1__1();

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
    // $ANTLR end "rule__CSSType__Group_0_1__0"


    // $ANTLR start "rule__CSSType__Group_0_1__0__Impl"
    // InternalCssExtDsl.g:2093:1: rule__CSSType__Group_0_1__0__Impl : ( ( rule__CSSType__DokuAssignment_0_1_0 ) ) ;
    public final void rule__CSSType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2097:1: ( ( ( rule__CSSType__DokuAssignment_0_1_0 ) ) )
            // InternalCssExtDsl.g:2098:1: ( ( rule__CSSType__DokuAssignment_0_1_0 ) )
            {
            // InternalCssExtDsl.g:2098:1: ( ( rule__CSSType__DokuAssignment_0_1_0 ) )
            // InternalCssExtDsl.g:2099:2: ( rule__CSSType__DokuAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_0_1_0()); 
            }
            // InternalCssExtDsl.g:2100:2: ( rule__CSSType__DokuAssignment_0_1_0 )
            // InternalCssExtDsl.g:2100:3: rule__CSSType__DokuAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_0_1_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_0_1__1"
    // InternalCssExtDsl.g:2108:1: rule__CSSType__Group_0_1__1 : rule__CSSType__Group_0_1__1__Impl ;
    public final void rule__CSSType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2112:1: ( rule__CSSType__Group_0_1__1__Impl )
            // InternalCssExtDsl.g:2113:2: rule__CSSType__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_0_1__1"


    // $ANTLR start "rule__CSSType__Group_0_1__1__Impl"
    // InternalCssExtDsl.g:2119:1: rule__CSSType__Group_0_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2123:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2124:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2124:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2125:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
            }
            // InternalCssExtDsl.g:2126:2: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCssExtDsl.g:2126:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_0_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__0"
    // InternalCssExtDsl.g:2135:1: rule__CSSType__Group_1__0 : rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 ;
    public final void rule__CSSType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2139:1: ( rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1 )
            // InternalCssExtDsl.g:2140:2: rule__CSSType__Group_1__0__Impl rule__CSSType__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__CSSType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__1();

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
    // $ANTLR end "rule__CSSType__Group_1__0"


    // $ANTLR start "rule__CSSType__Group_1__0__Impl"
    // InternalCssExtDsl.g:2147:1: rule__CSSType__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2151:1: ( ( () ) )
            // InternalCssExtDsl.g:2152:1: ( () )
            {
            // InternalCssExtDsl.g:2152:1: ( () )
            // InternalCssExtDsl.g:2153:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }
            // InternalCssExtDsl.g:2154:2: ()
            // InternalCssExtDsl.g:2154:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1__1"
    // InternalCssExtDsl.g:2162:1: rule__CSSType__Group_1__1 : rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 ;
    public final void rule__CSSType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2166:1: ( rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2 )
            // InternalCssExtDsl.g:2167:2: rule__CSSType__Group_1__1__Impl rule__CSSType__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__CSSType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__2();

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
    // $ANTLR end "rule__CSSType__Group_1__1"


    // $ANTLR start "rule__CSSType__Group_1__1__Impl"
    // InternalCssExtDsl.g:2174:1: rule__CSSType__Group_1__1__Impl : ( ( rule__CSSType__Group_1_1__0 )? ) ;
    public final void rule__CSSType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2178:1: ( ( ( rule__CSSType__Group_1_1__0 )? ) )
            // InternalCssExtDsl.g:2179:1: ( ( rule__CSSType__Group_1_1__0 )? )
            {
            // InternalCssExtDsl.g:2179:1: ( ( rule__CSSType__Group_1_1__0 )? )
            // InternalCssExtDsl.g:2180:2: ( rule__CSSType__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:2181:2: ( rule__CSSType__Group_1_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_JDOC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCssExtDsl.g:2181:3: rule__CSSType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_1_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_1__2"
    // InternalCssExtDsl.g:2189:1: rule__CSSType__Group_1__2 : rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 ;
    public final void rule__CSSType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2193:1: ( rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3 )
            // InternalCssExtDsl.g:2194:2: rule__CSSType__Group_1__2__Impl rule__CSSType__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__3();

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
    // $ANTLR end "rule__CSSType__Group_1__2"


    // $ANTLR start "rule__CSSType__Group_1__2__Impl"
    // InternalCssExtDsl.g:2201:1: rule__CSSType__Group_1__2__Impl : ( ( rule__CSSType__TypeAssignment_1_2 ) ) ;
    public final void rule__CSSType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2205:1: ( ( ( rule__CSSType__TypeAssignment_1_2 ) ) )
            // InternalCssExtDsl.g:2206:1: ( ( rule__CSSType__TypeAssignment_1_2 ) )
            {
            // InternalCssExtDsl.g:2206:1: ( ( rule__CSSType__TypeAssignment_1_2 ) )
            // InternalCssExtDsl.g:2207:2: ( rule__CSSType__TypeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_2()); 
            }
            // InternalCssExtDsl.g:2208:2: ( rule__CSSType__TypeAssignment_1_2 )
            // InternalCssExtDsl.g:2208:3: rule__CSSType__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__2__Impl"


    // $ANTLR start "rule__CSSType__Group_1__3"
    // InternalCssExtDsl.g:2216:1: rule__CSSType__Group_1__3 : rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 ;
    public final void rule__CSSType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2220:1: ( rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4 )
            // InternalCssExtDsl.g:2221:2: rule__CSSType__Group_1__3__Impl rule__CSSType__Group_1__4
            {
            pushFollow(FOLLOW_22);
            rule__CSSType__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__4();

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
    // $ANTLR end "rule__CSSType__Group_1__3"


    // $ANTLR start "rule__CSSType__Group_1__3__Impl"
    // InternalCssExtDsl.g:2228:1: rule__CSSType__Group_1__3__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2232:1: ( ( '(' ) )
            // InternalCssExtDsl.g:2233:1: ( '(' )
            {
            // InternalCssExtDsl.g:2233:1: ( '(' )
            // InternalCssExtDsl.g:2234:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__3__Impl"


    // $ANTLR start "rule__CSSType__Group_1__4"
    // InternalCssExtDsl.g:2243:1: rule__CSSType__Group_1__4 : rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 ;
    public final void rule__CSSType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2247:1: ( rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5 )
            // InternalCssExtDsl.g:2248:2: rule__CSSType__Group_1__4__Impl rule__CSSType__Group_1__5
            {
            pushFollow(FOLLOW_22);
            rule__CSSType__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__5();

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
    // $ANTLR end "rule__CSSType__Group_1__4"


    // $ANTLR start "rule__CSSType__Group_1__4__Impl"
    // InternalCssExtDsl.g:2255:1: rule__CSSType__Group_1__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2259:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2260:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2260:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2261:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
            }
            // InternalCssExtDsl.g:2262:2: ( RULE_WS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCssExtDsl.g:2262:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__4__Impl"


    // $ANTLR start "rule__CSSType__Group_1__5"
    // InternalCssExtDsl.g:2270:1: rule__CSSType__Group_1__5 : rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 ;
    public final void rule__CSSType__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2274:1: ( rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6 )
            // InternalCssExtDsl.g:2275:2: rule__CSSType__Group_1__5__Impl rule__CSSType__Group_1__6
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__6();

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
    // $ANTLR end "rule__CSSType__Group_1__5"


    // $ANTLR start "rule__CSSType__Group_1__5__Impl"
    // InternalCssExtDsl.g:2282:1: rule__CSSType__Group_1__5__Impl : ( ( rule__CSSType__FromAssignment_1_5 ) ) ;
    public final void rule__CSSType__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2286:1: ( ( ( rule__CSSType__FromAssignment_1_5 ) ) )
            // InternalCssExtDsl.g:2287:1: ( ( rule__CSSType__FromAssignment_1_5 ) )
            {
            // InternalCssExtDsl.g:2287:1: ( ( rule__CSSType__FromAssignment_1_5 ) )
            // InternalCssExtDsl.g:2288:2: ( rule__CSSType__FromAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromAssignment_1_5()); 
            }
            // InternalCssExtDsl.g:2289:2: ( rule__CSSType__FromAssignment_1_5 )
            // InternalCssExtDsl.g:2289:3: rule__CSSType__FromAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__FromAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromAssignment_1_5()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__5__Impl"


    // $ANTLR start "rule__CSSType__Group_1__6"
    // InternalCssExtDsl.g:2297:1: rule__CSSType__Group_1__6 : rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 ;
    public final void rule__CSSType__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2301:1: ( rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7 )
            // InternalCssExtDsl.g:2302:2: rule__CSSType__Group_1__6__Impl rule__CSSType__Group_1__7
            {
            pushFollow(FOLLOW_19);
            rule__CSSType__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__7();

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
    // $ANTLR end "rule__CSSType__Group_1__6"


    // $ANTLR start "rule__CSSType__Group_1__6__Impl"
    // InternalCssExtDsl.g:2309:1: rule__CSSType__Group_1__6__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2313:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2314:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2314:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2315:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
            }
            // InternalCssExtDsl.g:2316:2: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCssExtDsl.g:2316:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__6__Impl"


    // $ANTLR start "rule__CSSType__Group_1__7"
    // InternalCssExtDsl.g:2324:1: rule__CSSType__Group_1__7 : rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 ;
    public final void rule__CSSType__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2328:1: ( rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8 )
            // InternalCssExtDsl.g:2329:2: rule__CSSType__Group_1__7__Impl rule__CSSType__Group_1__8
            {
            pushFollow(FOLLOW_22);
            rule__CSSType__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__8();

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
    // $ANTLR end "rule__CSSType__Group_1__7"


    // $ANTLR start "rule__CSSType__Group_1__7__Impl"
    // InternalCssExtDsl.g:2336:1: rule__CSSType__Group_1__7__Impl : ( '->' ) ;
    public final void rule__CSSType__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2340:1: ( ( '->' ) )
            // InternalCssExtDsl.g:2341:1: ( '->' )
            {
            // InternalCssExtDsl.g:2341:1: ( '->' )
            // InternalCssExtDsl.g:2342:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__7__Impl"


    // $ANTLR start "rule__CSSType__Group_1__8"
    // InternalCssExtDsl.g:2351:1: rule__CSSType__Group_1__8 : rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 ;
    public final void rule__CSSType__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2355:1: ( rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9 )
            // InternalCssExtDsl.g:2356:2: rule__CSSType__Group_1__8__Impl rule__CSSType__Group_1__9
            {
            pushFollow(FOLLOW_22);
            rule__CSSType__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__9();

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
    // $ANTLR end "rule__CSSType__Group_1__8"


    // $ANTLR start "rule__CSSType__Group_1__8__Impl"
    // InternalCssExtDsl.g:2363:1: rule__CSSType__Group_1__8__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2367:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2368:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2368:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2369:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
            }
            // InternalCssExtDsl.g:2370:2: ( RULE_WS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_WS) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCssExtDsl.g:2370:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__8__Impl"


    // $ANTLR start "rule__CSSType__Group_1__9"
    // InternalCssExtDsl.g:2378:1: rule__CSSType__Group_1__9 : rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 ;
    public final void rule__CSSType__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2382:1: ( rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10 )
            // InternalCssExtDsl.g:2383:2: rule__CSSType__Group_1__9__Impl rule__CSSType__Group_1__10
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__10();

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
    // $ANTLR end "rule__CSSType__Group_1__9"


    // $ANTLR start "rule__CSSType__Group_1__9__Impl"
    // InternalCssExtDsl.g:2390:1: rule__CSSType__Group_1__9__Impl : ( ( rule__CSSType__ToAssignment_1_9 ) ) ;
    public final void rule__CSSType__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2394:1: ( ( ( rule__CSSType__ToAssignment_1_9 ) ) )
            // InternalCssExtDsl.g:2395:1: ( ( rule__CSSType__ToAssignment_1_9 ) )
            {
            // InternalCssExtDsl.g:2395:1: ( ( rule__CSSType__ToAssignment_1_9 ) )
            // InternalCssExtDsl.g:2396:2: ( rule__CSSType__ToAssignment_1_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToAssignment_1_9()); 
            }
            // InternalCssExtDsl.g:2397:2: ( rule__CSSType__ToAssignment_1_9 )
            // InternalCssExtDsl.g:2397:3: rule__CSSType__ToAssignment_1_9
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__ToAssignment_1_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToAssignment_1_9()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__9__Impl"


    // $ANTLR start "rule__CSSType__Group_1__10"
    // InternalCssExtDsl.g:2405:1: rule__CSSType__Group_1__10 : rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11 ;
    public final void rule__CSSType__Group_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2409:1: ( rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11 )
            // InternalCssExtDsl.g:2410:2: rule__CSSType__Group_1__10__Impl rule__CSSType__Group_1__11
            {
            pushFollow(FOLLOW_20);
            rule__CSSType__Group_1__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__11();

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
    // $ANTLR end "rule__CSSType__Group_1__10"


    // $ANTLR start "rule__CSSType__Group_1__10__Impl"
    // InternalCssExtDsl.g:2417:1: rule__CSSType__Group_1__10__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2421:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2422:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2422:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2423:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
            }
            // InternalCssExtDsl.g:2424:2: ( RULE_WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCssExtDsl.g:2424:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__10__Impl"


    // $ANTLR start "rule__CSSType__Group_1__11"
    // InternalCssExtDsl.g:2432:1: rule__CSSType__Group_1__11 : rule__CSSType__Group_1__11__Impl ;
    public final void rule__CSSType__Group_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2436:1: ( rule__CSSType__Group_1__11__Impl )
            // InternalCssExtDsl.g:2437:2: rule__CSSType__Group_1__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1__11__Impl();

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
    // $ANTLR end "rule__CSSType__Group_1__11"


    // $ANTLR start "rule__CSSType__Group_1__11__Impl"
    // InternalCssExtDsl.g:2443:1: rule__CSSType__Group_1__11__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_1__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2447:1: ( ( ')' ) )
            // InternalCssExtDsl.g:2448:1: ( ')' )
            {
            // InternalCssExtDsl.g:2448:1: ( ')' )
            // InternalCssExtDsl.g:2449:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1__11__Impl"


    // $ANTLR start "rule__CSSType__Group_1_1__0"
    // InternalCssExtDsl.g:2459:1: rule__CSSType__Group_1_1__0 : rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1 ;
    public final void rule__CSSType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2463:1: ( rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1 )
            // InternalCssExtDsl.g:2464:2: rule__CSSType__Group_1_1__0__Impl rule__CSSType__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1_1__1();

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
    // $ANTLR end "rule__CSSType__Group_1_1__0"


    // $ANTLR start "rule__CSSType__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:2471:1: rule__CSSType__Group_1_1__0__Impl : ( ( rule__CSSType__DokuAssignment_1_1_0 ) ) ;
    public final void rule__CSSType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2475:1: ( ( ( rule__CSSType__DokuAssignment_1_1_0 ) ) )
            // InternalCssExtDsl.g:2476:1: ( ( rule__CSSType__DokuAssignment_1_1_0 ) )
            {
            // InternalCssExtDsl.g:2476:1: ( ( rule__CSSType__DokuAssignment_1_1_0 ) )
            // InternalCssExtDsl.g:2477:2: ( rule__CSSType__DokuAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_1_1_0()); 
            }
            // InternalCssExtDsl.g:2478:2: ( rule__CSSType__DokuAssignment_1_1_0 )
            // InternalCssExtDsl.g:2478:3: rule__CSSType__DokuAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_1_1__1"
    // InternalCssExtDsl.g:2486:1: rule__CSSType__Group_1_1__1 : rule__CSSType__Group_1_1__1__Impl ;
    public final void rule__CSSType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2490:1: ( rule__CSSType__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:2491:2: rule__CSSType__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_1_1__1"


    // $ANTLR start "rule__CSSType__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:2497:1: rule__CSSType__Group_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2501:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2502:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2502:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2503:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
            }
            // InternalCssExtDsl.g:2504:2: ( RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCssExtDsl.g:2504:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2__0"
    // InternalCssExtDsl.g:2513:1: rule__CSSType__Group_2__0 : rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 ;
    public final void rule__CSSType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2517:1: ( rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1 )
            // InternalCssExtDsl.g:2518:2: rule__CSSType__Group_2__0__Impl rule__CSSType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__CSSType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__1();

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
    // $ANTLR end "rule__CSSType__Group_2__0"


    // $ANTLR start "rule__CSSType__Group_2__0__Impl"
    // InternalCssExtDsl.g:2525:1: rule__CSSType__Group_2__0__Impl : ( () ) ;
    public final void rule__CSSType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2529:1: ( ( () ) )
            // InternalCssExtDsl.g:2530:1: ( () )
            {
            // InternalCssExtDsl.g:2530:1: ( () )
            // InternalCssExtDsl.g:2531:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getCSSPropertyRefAction_2_0()); 
            }
            // InternalCssExtDsl.g:2532:2: ()
            // InternalCssExtDsl.g:2532:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getCSSPropertyRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSType__Group_2__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2__1"
    // InternalCssExtDsl.g:2540:1: rule__CSSType__Group_2__1 : rule__CSSType__Group_2__1__Impl rule__CSSType__Group_2__2 ;
    public final void rule__CSSType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2544:1: ( rule__CSSType__Group_2__1__Impl rule__CSSType__Group_2__2 )
            // InternalCssExtDsl.g:2545:2: rule__CSSType__Group_2__1__Impl rule__CSSType__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__CSSType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__2();

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
    // $ANTLR end "rule__CSSType__Group_2__1"


    // $ANTLR start "rule__CSSType__Group_2__1__Impl"
    // InternalCssExtDsl.g:2552:1: rule__CSSType__Group_2__1__Impl : ( ( rule__CSSType__Group_2_1__0 )? ) ;
    public final void rule__CSSType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2556:1: ( ( ( rule__CSSType__Group_2_1__0 )? ) )
            // InternalCssExtDsl.g:2557:1: ( ( rule__CSSType__Group_2_1__0 )? )
            {
            // InternalCssExtDsl.g:2557:1: ( ( rule__CSSType__Group_2_1__0 )? )
            // InternalCssExtDsl.g:2558:2: ( rule__CSSType__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_2_1()); 
            }
            // InternalCssExtDsl.g:2559:2: ( rule__CSSType__Group_2_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_JDOC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCssExtDsl.g:2559:3: rule__CSSType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_2_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2__1__Impl"


    // $ANTLR start "rule__CSSType__Group_2__2"
    // InternalCssExtDsl.g:2567:1: rule__CSSType__Group_2__2 : rule__CSSType__Group_2__2__Impl rule__CSSType__Group_2__3 ;
    public final void rule__CSSType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2571:1: ( rule__CSSType__Group_2__2__Impl rule__CSSType__Group_2__3 )
            // InternalCssExtDsl.g:2572:2: rule__CSSType__Group_2__2__Impl rule__CSSType__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__CSSType__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__3();

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
    // $ANTLR end "rule__CSSType__Group_2__2"


    // $ANTLR start "rule__CSSType__Group_2__2__Impl"
    // InternalCssExtDsl.g:2579:1: rule__CSSType__Group_2__2__Impl : ( ( rule__CSSType__TypeAssignment_2_2 ) ) ;
    public final void rule__CSSType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2583:1: ( ( ( rule__CSSType__TypeAssignment_2_2 ) ) )
            // InternalCssExtDsl.g:2584:1: ( ( rule__CSSType__TypeAssignment_2_2 ) )
            {
            // InternalCssExtDsl.g:2584:1: ( ( rule__CSSType__TypeAssignment_2_2 ) )
            // InternalCssExtDsl.g:2585:2: ( rule__CSSType__TypeAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_2()); 
            }
            // InternalCssExtDsl.g:2586:2: ( rule__CSSType__TypeAssignment_2_2 )
            // InternalCssExtDsl.g:2586:3: rule__CSSType__TypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_2_2()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2__2__Impl"


    // $ANTLR start "rule__CSSType__Group_2__3"
    // InternalCssExtDsl.g:2594:1: rule__CSSType__Group_2__3 : rule__CSSType__Group_2__3__Impl rule__CSSType__Group_2__4 ;
    public final void rule__CSSType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2598:1: ( rule__CSSType__Group_2__3__Impl rule__CSSType__Group_2__4 )
            // InternalCssExtDsl.g:2599:2: rule__CSSType__Group_2__3__Impl rule__CSSType__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__CSSType__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__4();

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
    // $ANTLR end "rule__CSSType__Group_2__3"


    // $ANTLR start "rule__CSSType__Group_2__3__Impl"
    // InternalCssExtDsl.g:2606:1: rule__CSSType__Group_2__3__Impl : ( '(' ) ;
    public final void rule__CSSType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2610:1: ( ( '(' ) )
            // InternalCssExtDsl.g:2611:1: ( '(' )
            {
            // InternalCssExtDsl.g:2611:1: ( '(' )
            // InternalCssExtDsl.g:2612:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_2_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_2_3()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2__3__Impl"


    // $ANTLR start "rule__CSSType__Group_2__4"
    // InternalCssExtDsl.g:2621:1: rule__CSSType__Group_2__4 : rule__CSSType__Group_2__4__Impl rule__CSSType__Group_2__5 ;
    public final void rule__CSSType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2625:1: ( rule__CSSType__Group_2__4__Impl rule__CSSType__Group_2__5 )
            // InternalCssExtDsl.g:2626:2: rule__CSSType__Group_2__4__Impl rule__CSSType__Group_2__5
            {
            pushFollow(FOLLOW_25);
            rule__CSSType__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__5();

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
    // $ANTLR end "rule__CSSType__Group_2__4"


    // $ANTLR start "rule__CSSType__Group_2__4__Impl"
    // InternalCssExtDsl.g:2633:1: rule__CSSType__Group_2__4__Impl : ( ( rule__CSSType__RuleAssignment_2_4 ) ) ;
    public final void rule__CSSType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2637:1: ( ( ( rule__CSSType__RuleAssignment_2_4 ) ) )
            // InternalCssExtDsl.g:2638:1: ( ( rule__CSSType__RuleAssignment_2_4 ) )
            {
            // InternalCssExtDsl.g:2638:1: ( ( rule__CSSType__RuleAssignment_2_4 ) )
            // InternalCssExtDsl.g:2639:2: ( rule__CSSType__RuleAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRuleAssignment_2_4()); 
            }
            // InternalCssExtDsl.g:2640:2: ( rule__CSSType__RuleAssignment_2_4 )
            // InternalCssExtDsl.g:2640:3: rule__CSSType__RuleAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__RuleAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRuleAssignment_2_4()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2__4__Impl"


    // $ANTLR start "rule__CSSType__Group_2__5"
    // InternalCssExtDsl.g:2648:1: rule__CSSType__Group_2__5 : rule__CSSType__Group_2__5__Impl ;
    public final void rule__CSSType__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2652:1: ( rule__CSSType__Group_2__5__Impl )
            // InternalCssExtDsl.g:2653:2: rule__CSSType__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2__5__Impl();

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
    // $ANTLR end "rule__CSSType__Group_2__5"


    // $ANTLR start "rule__CSSType__Group_2__5__Impl"
    // InternalCssExtDsl.g:2659:1: rule__CSSType__Group_2__5__Impl : ( ')' ) ;
    public final void rule__CSSType__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2663:1: ( ( ')' ) )
            // InternalCssExtDsl.g:2664:1: ( ')' )
            {
            // InternalCssExtDsl.g:2664:1: ( ')' )
            // InternalCssExtDsl.g:2665:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_2_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_2_5()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2__5__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1__0"
    // InternalCssExtDsl.g:2675:1: rule__CSSType__Group_2_1__0 : rule__CSSType__Group_2_1__0__Impl rule__CSSType__Group_2_1__1 ;
    public final void rule__CSSType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2679:1: ( rule__CSSType__Group_2_1__0__Impl rule__CSSType__Group_2_1__1 )
            // InternalCssExtDsl.g:2680:2: rule__CSSType__Group_2_1__0__Impl rule__CSSType__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1__1();

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
    // $ANTLR end "rule__CSSType__Group_2_1__0"


    // $ANTLR start "rule__CSSType__Group_2_1__0__Impl"
    // InternalCssExtDsl.g:2687:1: rule__CSSType__Group_2_1__0__Impl : ( ( rule__CSSType__DokuAssignment_2_1_0 ) ) ;
    public final void rule__CSSType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2691:1: ( ( ( rule__CSSType__DokuAssignment_2_1_0 ) ) )
            // InternalCssExtDsl.g:2692:1: ( ( rule__CSSType__DokuAssignment_2_1_0 ) )
            {
            // InternalCssExtDsl.g:2692:1: ( ( rule__CSSType__DokuAssignment_2_1_0 ) )
            // InternalCssExtDsl.g:2693:2: ( rule__CSSType__DokuAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_2_1_0()); 
            }
            // InternalCssExtDsl.g:2694:2: ( rule__CSSType__DokuAssignment_2_1_0 )
            // InternalCssExtDsl.g:2694:3: rule__CSSType__DokuAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_2_1_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_2_1__1"
    // InternalCssExtDsl.g:2702:1: rule__CSSType__Group_2_1__1 : rule__CSSType__Group_2_1__1__Impl ;
    public final void rule__CSSType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2706:1: ( rule__CSSType__Group_2_1__1__Impl )
            // InternalCssExtDsl.g:2707:2: rule__CSSType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_2_1__1"


    // $ANTLR start "rule__CSSType__Group_2_1__1__Impl"
    // InternalCssExtDsl.g:2713:1: rule__CSSType__Group_2_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2717:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2718:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2718:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2719:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1()); 
            }
            // InternalCssExtDsl.g:2720:2: ( RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCssExtDsl.g:2720:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_2_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3__0"
    // InternalCssExtDsl.g:2729:1: rule__CSSType__Group_3__0 : rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1 ;
    public final void rule__CSSType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2733:1: ( rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1 )
            // InternalCssExtDsl.g:2734:2: rule__CSSType__Group_3__0__Impl rule__CSSType__Group_3__1
            {
            pushFollow(FOLLOW_26);
            rule__CSSType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3__1();

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
    // $ANTLR end "rule__CSSType__Group_3__0"


    // $ANTLR start "rule__CSSType__Group_3__0__Impl"
    // InternalCssExtDsl.g:2741:1: rule__CSSType__Group_3__0__Impl : ( ( rule__CSSType__Group_3_0__0 )? ) ;
    public final void rule__CSSType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2745:1: ( ( ( rule__CSSType__Group_3_0__0 )? ) )
            // InternalCssExtDsl.g:2746:1: ( ( rule__CSSType__Group_3_0__0 )? )
            {
            // InternalCssExtDsl.g:2746:1: ( ( rule__CSSType__Group_3_0__0 )? )
            // InternalCssExtDsl.g:2747:2: ( rule__CSSType__Group_3_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getGroup_3_0()); 
            }
            // InternalCssExtDsl.g:2748:2: ( rule__CSSType__Group_3_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_JDOC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCssExtDsl.g:2748:3: rule__CSSType__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSType__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getGroup_3_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3__1"
    // InternalCssExtDsl.g:2756:1: rule__CSSType__Group_3__1 : rule__CSSType__Group_3__1__Impl ;
    public final void rule__CSSType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2760:1: ( rule__CSSType__Group_3__1__Impl )
            // InternalCssExtDsl.g:2761:2: rule__CSSType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3__1"


    // $ANTLR start "rule__CSSType__Group_3__1__Impl"
    // InternalCssExtDsl.g:2767:1: rule__CSSType__Group_3__1__Impl : ( ( rule__CSSType__Alternatives_3_1 ) ) ;
    public final void rule__CSSType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2771:1: ( ( ( rule__CSSType__Alternatives_3_1 ) ) )
            // InternalCssExtDsl.g:2772:1: ( ( rule__CSSType__Alternatives_3_1 ) )
            {
            // InternalCssExtDsl.g:2772:1: ( ( rule__CSSType__Alternatives_3_1 ) )
            // InternalCssExtDsl.g:2773:2: ( rule__CSSType__Alternatives_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getAlternatives_3_1()); 
            }
            // InternalCssExtDsl.g:2774:2: ( rule__CSSType__Alternatives_3_1 )
            // InternalCssExtDsl.g:2774:3: rule__CSSType__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Alternatives_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getAlternatives_3_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3_0__0"
    // InternalCssExtDsl.g:2783:1: rule__CSSType__Group_3_0__0 : rule__CSSType__Group_3_0__0__Impl rule__CSSType__Group_3_0__1 ;
    public final void rule__CSSType__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2787:1: ( rule__CSSType__Group_3_0__0__Impl rule__CSSType__Group_3_0__1 )
            // InternalCssExtDsl.g:2788:2: rule__CSSType__Group_3_0__0__Impl rule__CSSType__Group_3_0__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_0__1();

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
    // $ANTLR end "rule__CSSType__Group_3_0__0"


    // $ANTLR start "rule__CSSType__Group_3_0__0__Impl"
    // InternalCssExtDsl.g:2795:1: rule__CSSType__Group_3_0__0__Impl : ( ( rule__CSSType__DokuAssignment_3_0_0 ) ) ;
    public final void rule__CSSType__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2799:1: ( ( ( rule__CSSType__DokuAssignment_3_0_0 ) ) )
            // InternalCssExtDsl.g:2800:1: ( ( rule__CSSType__DokuAssignment_3_0_0 ) )
            {
            // InternalCssExtDsl.g:2800:1: ( ( rule__CSSType__DokuAssignment_3_0_0 ) )
            // InternalCssExtDsl.g:2801:2: ( rule__CSSType__DokuAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuAssignment_3_0_0()); 
            }
            // InternalCssExtDsl.g:2802:2: ( rule__CSSType__DokuAssignment_3_0_0 )
            // InternalCssExtDsl.g:2802:3: rule__CSSType__DokuAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__DokuAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuAssignment_3_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3_0__1"
    // InternalCssExtDsl.g:2810:1: rule__CSSType__Group_3_0__1 : rule__CSSType__Group_3_0__1__Impl ;
    public final void rule__CSSType__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2814:1: ( rule__CSSType__Group_3_0__1__Impl )
            // InternalCssExtDsl.g:2815:2: rule__CSSType__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3_0__1"


    // $ANTLR start "rule__CSSType__Group_3_0__1__Impl"
    // InternalCssExtDsl.g:2821:1: rule__CSSType__Group_3_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2825:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2826:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2826:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2827:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_0_1()); 
            }
            // InternalCssExtDsl.g:2828:2: ( RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCssExtDsl.g:2828:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_0_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_0__0"
    // InternalCssExtDsl.g:2837:1: rule__CSSType__Group_3_1_0__0 : rule__CSSType__Group_3_1_0__0__Impl rule__CSSType__Group_3_1_0__1 ;
    public final void rule__CSSType__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2841:1: ( rule__CSSType__Group_3_1_0__0__Impl rule__CSSType__Group_3_1_0__1 )
            // InternalCssExtDsl.g:2842:2: rule__CSSType__Group_3_1_0__0__Impl rule__CSSType__Group_3_1_0__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_3_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_0__1();

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
    // $ANTLR end "rule__CSSType__Group_3_1_0__0"


    // $ANTLR start "rule__CSSType__Group_3_1_0__0__Impl"
    // InternalCssExtDsl.g:2849:1: rule__CSSType__Group_3_1_0__0__Impl : ( ( rule__CSSType__TypeAssignment_3_1_0_0 ) ) ;
    public final void rule__CSSType__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2853:1: ( ( ( rule__CSSType__TypeAssignment_3_1_0_0 ) ) )
            // InternalCssExtDsl.g:2854:1: ( ( rule__CSSType__TypeAssignment_3_1_0_0 ) )
            {
            // InternalCssExtDsl.g:2854:1: ( ( rule__CSSType__TypeAssignment_3_1_0_0 ) )
            // InternalCssExtDsl.g:2855:2: ( rule__CSSType__TypeAssignment_3_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_0_0()); 
            }
            // InternalCssExtDsl.g:2856:2: ( rule__CSSType__TypeAssignment_3_1_0_0 )
            // InternalCssExtDsl.g:2856:3: rule__CSSType__TypeAssignment_3_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_3_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_0__1"
    // InternalCssExtDsl.g:2864:1: rule__CSSType__Group_3_1_0__1 : rule__CSSType__Group_3_1_0__1__Impl ;
    public final void rule__CSSType__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2868:1: ( rule__CSSType__Group_3_1_0__1__Impl )
            // InternalCssExtDsl.g:2869:2: rule__CSSType__Group_3_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_0__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3_1_0__1"


    // $ANTLR start "rule__CSSType__Group_3_1_0__1__Impl"
    // InternalCssExtDsl.g:2875:1: rule__CSSType__Group_3_1_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2879:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2880:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2880:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2881:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_0_1()); 
            }
            // InternalCssExtDsl.g:2882:2: ( RULE_WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCssExtDsl.g:2882:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_0_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_1__0"
    // InternalCssExtDsl.g:2891:1: rule__CSSType__Group_3_1_1__0 : rule__CSSType__Group_3_1_1__0__Impl rule__CSSType__Group_3_1_1__1 ;
    public final void rule__CSSType__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2895:1: ( rule__CSSType__Group_3_1_1__0__Impl rule__CSSType__Group_3_1_1__1 )
            // InternalCssExtDsl.g:2896:2: rule__CSSType__Group_3_1_1__0__Impl rule__CSSType__Group_3_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_1__1();

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
    // $ANTLR end "rule__CSSType__Group_3_1_1__0"


    // $ANTLR start "rule__CSSType__Group_3_1_1__0__Impl"
    // InternalCssExtDsl.g:2903:1: rule__CSSType__Group_3_1_1__0__Impl : ( ( rule__CSSType__TypeAssignment_3_1_1_0 ) ) ;
    public final void rule__CSSType__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2907:1: ( ( ( rule__CSSType__TypeAssignment_3_1_1_0 ) ) )
            // InternalCssExtDsl.g:2908:1: ( ( rule__CSSType__TypeAssignment_3_1_1_0 ) )
            {
            // InternalCssExtDsl.g:2908:1: ( ( rule__CSSType__TypeAssignment_3_1_1_0 ) )
            // InternalCssExtDsl.g:2909:2: ( rule__CSSType__TypeAssignment_3_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_1_0()); 
            }
            // InternalCssExtDsl.g:2910:2: ( rule__CSSType__TypeAssignment_3_1_1_0 )
            // InternalCssExtDsl.g:2910:3: rule__CSSType__TypeAssignment_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_3_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_1__1"
    // InternalCssExtDsl.g:2918:1: rule__CSSType__Group_3_1_1__1 : rule__CSSType__Group_3_1_1__1__Impl ;
    public final void rule__CSSType__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2922:1: ( rule__CSSType__Group_3_1_1__1__Impl )
            // InternalCssExtDsl.g:2923:2: rule__CSSType__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3_1_1__1"


    // $ANTLR start "rule__CSSType__Group_3_1_1__1__Impl"
    // InternalCssExtDsl.g:2929:1: rule__CSSType__Group_3_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2933:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2934:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2934:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2935:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_1_1()); 
            }
            // InternalCssExtDsl.g:2936:2: ( RULE_WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCssExtDsl.g:2936:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_1_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_2__0"
    // InternalCssExtDsl.g:2945:1: rule__CSSType__Group_3_1_2__0 : rule__CSSType__Group_3_1_2__0__Impl rule__CSSType__Group_3_1_2__1 ;
    public final void rule__CSSType__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2949:1: ( rule__CSSType__Group_3_1_2__0__Impl rule__CSSType__Group_3_1_2__1 )
            // InternalCssExtDsl.g:2950:2: rule__CSSType__Group_3_1_2__0__Impl rule__CSSType__Group_3_1_2__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_3_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_2__1();

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
    // $ANTLR end "rule__CSSType__Group_3_1_2__0"


    // $ANTLR start "rule__CSSType__Group_3_1_2__0__Impl"
    // InternalCssExtDsl.g:2957:1: rule__CSSType__Group_3_1_2__0__Impl : ( ( rule__CSSType__TypeAssignment_3_1_2_0 ) ) ;
    public final void rule__CSSType__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2961:1: ( ( ( rule__CSSType__TypeAssignment_3_1_2_0 ) ) )
            // InternalCssExtDsl.g:2962:1: ( ( rule__CSSType__TypeAssignment_3_1_2_0 ) )
            {
            // InternalCssExtDsl.g:2962:1: ( ( rule__CSSType__TypeAssignment_3_1_2_0 ) )
            // InternalCssExtDsl.g:2963:2: ( rule__CSSType__TypeAssignment_3_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_2_0()); 
            }
            // InternalCssExtDsl.g:2964:2: ( rule__CSSType__TypeAssignment_3_1_2_0 )
            // InternalCssExtDsl.g:2964:3: rule__CSSType__TypeAssignment_3_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_3_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_2_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_2__1"
    // InternalCssExtDsl.g:2972:1: rule__CSSType__Group_3_1_2__1 : rule__CSSType__Group_3_1_2__1__Impl ;
    public final void rule__CSSType__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2976:1: ( rule__CSSType__Group_3_1_2__1__Impl )
            // InternalCssExtDsl.g:2977:2: rule__CSSType__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_2__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3_1_2__1"


    // $ANTLR start "rule__CSSType__Group_3_1_2__1__Impl"
    // InternalCssExtDsl.g:2983:1: rule__CSSType__Group_3_1_2__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:2987:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:2988:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:2988:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:2989:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_2_1()); 
            }
            // InternalCssExtDsl.g:2990:2: ( RULE_WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCssExtDsl.g:2990:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_2_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_3__0"
    // InternalCssExtDsl.g:2999:1: rule__CSSType__Group_3_1_3__0 : rule__CSSType__Group_3_1_3__0__Impl rule__CSSType__Group_3_1_3__1 ;
    public final void rule__CSSType__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3003:1: ( rule__CSSType__Group_3_1_3__0__Impl rule__CSSType__Group_3_1_3__1 )
            // InternalCssExtDsl.g:3004:2: rule__CSSType__Group_3_1_3__0__Impl rule__CSSType__Group_3_1_3__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSType__Group_3_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_3__1();

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
    // $ANTLR end "rule__CSSType__Group_3_1_3__0"


    // $ANTLR start "rule__CSSType__Group_3_1_3__0__Impl"
    // InternalCssExtDsl.g:3011:1: rule__CSSType__Group_3_1_3__0__Impl : ( ( rule__CSSType__TypeAssignment_3_1_3_0 ) ) ;
    public final void rule__CSSType__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3015:1: ( ( ( rule__CSSType__TypeAssignment_3_1_3_0 ) ) )
            // InternalCssExtDsl.g:3016:1: ( ( rule__CSSType__TypeAssignment_3_1_3_0 ) )
            {
            // InternalCssExtDsl.g:3016:1: ( ( rule__CSSType__TypeAssignment_3_1_3_0 ) )
            // InternalCssExtDsl.g:3017:2: ( rule__CSSType__TypeAssignment_3_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_3_0()); 
            }
            // InternalCssExtDsl.g:3018:2: ( rule__CSSType__TypeAssignment_3_1_3_0 )
            // InternalCssExtDsl.g:3018:3: rule__CSSType__TypeAssignment_3_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__TypeAssignment_3_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeAssignment_3_1_3_0()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_3__0__Impl"


    // $ANTLR start "rule__CSSType__Group_3_1_3__1"
    // InternalCssExtDsl.g:3026:1: rule__CSSType__Group_3_1_3__1 : rule__CSSType__Group_3_1_3__1__Impl ;
    public final void rule__CSSType__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3030:1: ( rule__CSSType__Group_3_1_3__1__Impl )
            // InternalCssExtDsl.g:3031:2: rule__CSSType__Group_3_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSType__Group_3_1_3__1__Impl();

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
    // $ANTLR end "rule__CSSType__Group_3_1_3__1"


    // $ANTLR start "rule__CSSType__Group_3_1_3__1__Impl"
    // InternalCssExtDsl.g:3037:1: rule__CSSType__Group_3_1_3__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSType__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3041:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:3042:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:3042:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:3043:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_3_1()); 
            }
            // InternalCssExtDsl.g:3044:2: ( RULE_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCssExtDsl.g:3044:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_3_1()); 
            }

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
    // $ANTLR end "rule__CSSType__Group_3_1_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__0"
    // InternalCssExtDsl.g:3053:1: rule__ElementDefinition__Group__0 : rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 ;
    public final void rule__ElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3057:1: ( rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1 )
            // InternalCssExtDsl.g:3058:2: rule__ElementDefinition__Group__0__Impl rule__ElementDefinition__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__1();

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
    // $ANTLR end "rule__ElementDefinition__Group__0"


    // $ANTLR start "rule__ElementDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3065:1: rule__ElementDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3069:1: ( ( () ) )
            // InternalCssExtDsl.g:3070:1: ( () )
            {
            // InternalCssExtDsl.g:3070:1: ( () )
            // InternalCssExtDsl.g:3071:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3072:2: ()
            // InternalCssExtDsl.g:3072:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__1"
    // InternalCssExtDsl.g:3080:1: rule__ElementDefinition__Group__1 : rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 ;
    public final void rule__ElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3084:1: ( rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2 )
            // InternalCssExtDsl.g:3085:2: rule__ElementDefinition__Group__1__Impl rule__ElementDefinition__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__2();

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
    // $ANTLR end "rule__ElementDefinition__Group__1"


    // $ANTLR start "rule__ElementDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3092:1: rule__ElementDefinition__Group__1__Impl : ( ( rule__ElementDefinition__DokuAssignment_1 )? ) ;
    public final void rule__ElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3096:1: ( ( ( rule__ElementDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3097:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3097:1: ( ( rule__ElementDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3098:2: ( rule__ElementDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3099:2: ( rule__ElementDefinition__DokuAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_JDOC) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCssExtDsl.g:3099:3: rule__ElementDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuAssignment_1()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__2"
    // InternalCssExtDsl.g:3107:1: rule__ElementDefinition__Group__2 : rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 ;
    public final void rule__ElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3111:1: ( rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3 )
            // InternalCssExtDsl.g:3112:2: rule__ElementDefinition__Group__2__Impl rule__ElementDefinition__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__3();

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
    // $ANTLR end "rule__ElementDefinition__Group__2"


    // $ANTLR start "rule__ElementDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3119:1: rule__ElementDefinition__Group__2__Impl : ( ( rule__ElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3123:1: ( ( ( rule__ElementDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3124:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3124:1: ( ( rule__ElementDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3125:2: ( rule__ElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3126:2: ( rule__ElementDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3126:3: rule__ElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__3"
    // InternalCssExtDsl.g:3134:1: rule__ElementDefinition__Group__3 : rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 ;
    public final void rule__ElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3138:1: ( rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4 )
            // InternalCssExtDsl.g:3139:2: rule__ElementDefinition__Group__3__Impl rule__ElementDefinition__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__4();

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
    // $ANTLR end "rule__ElementDefinition__Group__3"


    // $ANTLR start "rule__ElementDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:3146:1: rule__ElementDefinition__Group__3__Impl : ( ( rule__ElementDefinition__Group_3__0 )? ) ;
    public final void rule__ElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3150:1: ( ( ( rule__ElementDefinition__Group_3__0 )? ) )
            // InternalCssExtDsl.g:3151:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            {
            // InternalCssExtDsl.g:3151:1: ( ( rule__ElementDefinition__Group_3__0 )? )
            // InternalCssExtDsl.g:3152:2: ( rule__ElementDefinition__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }
            // InternalCssExtDsl.g:3153:2: ( rule__ElementDefinition__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCssExtDsl.g:3153:3: rule__ElementDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__4"
    // InternalCssExtDsl.g:3161:1: rule__ElementDefinition__Group__4 : rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 ;
    public final void rule__ElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3165:1: ( rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5 )
            // InternalCssExtDsl.g:3166:2: rule__ElementDefinition__Group__4__Impl rule__ElementDefinition__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__5();

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
    // $ANTLR end "rule__ElementDefinition__Group__4"


    // $ANTLR start "rule__ElementDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:3173:1: rule__ElementDefinition__Group__4__Impl : ( ( rule__ElementDefinition__Group_4__0 )? ) ;
    public final void rule__ElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3177:1: ( ( ( rule__ElementDefinition__Group_4__0 )? ) )
            // InternalCssExtDsl.g:3178:1: ( ( rule__ElementDefinition__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:3178:1: ( ( rule__ElementDefinition__Group_4__0 )? )
            // InternalCssExtDsl.g:3179:2: ( rule__ElementDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:3180:2: ( rule__ElementDefinition__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCssExtDsl.g:3180:3: rule__ElementDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__5"
    // InternalCssExtDsl.g:3188:1: rule__ElementDefinition__Group__5 : rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 ;
    public final void rule__ElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3192:1: ( rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6 )
            // InternalCssExtDsl.g:3193:2: rule__ElementDefinition__Group__5__Impl rule__ElementDefinition__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__6();

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
    // $ANTLR end "rule__ElementDefinition__Group__5"


    // $ANTLR start "rule__ElementDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:3200:1: rule__ElementDefinition__Group__5__Impl : ( '{' ) ;
    public final void rule__ElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3204:1: ( ( '{' ) )
            // InternalCssExtDsl.g:3205:1: ( '{' )
            {
            // InternalCssExtDsl.g:3205:1: ( '{' )
            // InternalCssExtDsl.g:3206:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__5__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__6"
    // InternalCssExtDsl.g:3215:1: rule__ElementDefinition__Group__6 : rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7 ;
    public final void rule__ElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3219:1: ( rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7 )
            // InternalCssExtDsl.g:3220:2: rule__ElementDefinition__Group__6__Impl rule__ElementDefinition__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__ElementDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__7();

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
    // $ANTLR end "rule__ElementDefinition__Group__6"


    // $ANTLR start "rule__ElementDefinition__Group__6__Impl"
    // InternalCssExtDsl.g:3227:1: rule__ElementDefinition__Group__6__Impl : ( ( rule__ElementDefinition__Alternatives_6 )* ) ;
    public final void rule__ElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3231:1: ( ( ( rule__ElementDefinition__Alternatives_6 )* ) )
            // InternalCssExtDsl.g:3232:1: ( ( rule__ElementDefinition__Alternatives_6 )* )
            {
            // InternalCssExtDsl.g:3232:1: ( ( rule__ElementDefinition__Alternatives_6 )* )
            // InternalCssExtDsl.g:3233:2: ( rule__ElementDefinition__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getAlternatives_6()); 
            }
            // InternalCssExtDsl.g:3234:2: ( rule__ElementDefinition__Alternatives_6 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==RULE_JDOC||LA40_0==RULE_PSEUDO||LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCssExtDsl.g:3234:3: rule__ElementDefinition__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ElementDefinition__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getAlternatives_6()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__6__Impl"


    // $ANTLR start "rule__ElementDefinition__Group__7"
    // InternalCssExtDsl.g:3242:1: rule__ElementDefinition__Group__7 : rule__ElementDefinition__Group__7__Impl ;
    public final void rule__ElementDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3246:1: ( rule__ElementDefinition__Group__7__Impl )
            // InternalCssExtDsl.g:3247:2: rule__ElementDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group__7__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group__7"


    // $ANTLR start "rule__ElementDefinition__Group__7__Impl"
    // InternalCssExtDsl.g:3253:1: rule__ElementDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__ElementDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3257:1: ( ( '}' ) )
            // InternalCssExtDsl.g:3258:1: ( '}' )
            {
            // InternalCssExtDsl.g:3258:1: ( '}' )
            // InternalCssExtDsl.g:3259:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group__7__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__0"
    // InternalCssExtDsl.g:3269:1: rule__ElementDefinition__Group_3__0 : rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 ;
    public final void rule__ElementDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3273:1: ( rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1 )
            // InternalCssExtDsl.g:3274:2: rule__ElementDefinition__Group_3__0__Impl rule__ElementDefinition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ElementDefinition__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__0"


    // $ANTLR start "rule__ElementDefinition__Group_3__0__Impl"
    // InternalCssExtDsl.g:3281:1: rule__ElementDefinition__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ElementDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3285:1: ( ( 'extends' ) )
            // InternalCssExtDsl.g:3286:1: ( 'extends' )
            {
            // InternalCssExtDsl.g:3286:1: ( 'extends' )
            // InternalCssExtDsl.g:3287:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__1"
    // InternalCssExtDsl.g:3296:1: rule__ElementDefinition__Group_3__1 : rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 ;
    public final void rule__ElementDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3300:1: ( rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2 )
            // InternalCssExtDsl.g:3301:2: rule__ElementDefinition__Group_3__1__Impl rule__ElementDefinition__Group_3__2
            {
            pushFollow(FOLLOW_31);
            rule__ElementDefinition__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__2();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__1"


    // $ANTLR start "rule__ElementDefinition__Group_3__1__Impl"
    // InternalCssExtDsl.g:3308:1: rule__ElementDefinition__Group_3__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) ;
    public final void rule__ElementDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3312:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_1 ) ) )
            // InternalCssExtDsl.g:3313:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            {
            // InternalCssExtDsl.g:3313:1: ( ( rule__ElementDefinition__SuperAssignment_3_1 ) )
            // InternalCssExtDsl.g:3314:2: ( rule__ElementDefinition__SuperAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }
            // InternalCssExtDsl.g:3315:2: ( rule__ElementDefinition__SuperAssignment_3_1 )
            // InternalCssExtDsl.g:3315:3: rule__ElementDefinition__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__SuperAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3__2"
    // InternalCssExtDsl.g:3323:1: rule__ElementDefinition__Group_3__2 : rule__ElementDefinition__Group_3__2__Impl ;
    public final void rule__ElementDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3327:1: ( rule__ElementDefinition__Group_3__2__Impl )
            // InternalCssExtDsl.g:3328:2: rule__ElementDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3__2"


    // $ANTLR start "rule__ElementDefinition__Group_3__2__Impl"
    // InternalCssExtDsl.g:3334:1: rule__ElementDefinition__Group_3__2__Impl : ( ( rule__ElementDefinition__Group_3_2__0 )* ) ;
    public final void rule__ElementDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3338:1: ( ( ( rule__ElementDefinition__Group_3_2__0 )* ) )
            // InternalCssExtDsl.g:3339:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            {
            // InternalCssExtDsl.g:3339:1: ( ( rule__ElementDefinition__Group_3_2__0 )* )
            // InternalCssExtDsl.g:3340:2: ( rule__ElementDefinition__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }
            // InternalCssExtDsl.g:3341:2: ( rule__ElementDefinition__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==18) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCssExtDsl.g:3341:3: rule__ElementDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ElementDefinition__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getGroup_3_2()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0"
    // InternalCssExtDsl.g:3350:1: rule__ElementDefinition__Group_3_2__0 : rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 ;
    public final void rule__ElementDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3354:1: ( rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1 )
            // InternalCssExtDsl.g:3355:2: rule__ElementDefinition__Group_3_2__0__Impl rule__ElementDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ElementDefinition__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__0__Impl"
    // InternalCssExtDsl.g:3362:1: rule__ElementDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ElementDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3366:1: ( ( ',' ) )
            // InternalCssExtDsl.g:3367:1: ( ',' )
            {
            // InternalCssExtDsl.g:3367:1: ( ',' )
            // InternalCssExtDsl.g:3368:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1"
    // InternalCssExtDsl.g:3377:1: rule__ElementDefinition__Group_3_2__1 : rule__ElementDefinition__Group_3_2__1__Impl ;
    public final void rule__ElementDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3381:1: ( rule__ElementDefinition__Group_3_2__1__Impl )
            // InternalCssExtDsl.g:3382:2: rule__ElementDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1"


    // $ANTLR start "rule__ElementDefinition__Group_3_2__1__Impl"
    // InternalCssExtDsl.g:3388:1: rule__ElementDefinition__Group_3_2__1__Impl : ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) ;
    public final void rule__ElementDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3392:1: ( ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) ) )
            // InternalCssExtDsl.g:3393:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            {
            // InternalCssExtDsl.g:3393:1: ( ( rule__ElementDefinition__SuperAssignment_3_2_1 ) )
            // InternalCssExtDsl.g:3394:2: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }
            // InternalCssExtDsl.g:3395:2: ( rule__ElementDefinition__SuperAssignment_3_2_1 )
            // InternalCssExtDsl.g:3395:3: rule__ElementDefinition__SuperAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__SuperAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperAssignment_3_2_1()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_4__0"
    // InternalCssExtDsl.g:3404:1: rule__ElementDefinition__Group_4__0 : rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1 ;
    public final void rule__ElementDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3408:1: ( rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1 )
            // InternalCssExtDsl.g:3409:2: rule__ElementDefinition__Group_4__0__Impl rule__ElementDefinition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ElementDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_4__1();

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
    // $ANTLR end "rule__ElementDefinition__Group_4__0"


    // $ANTLR start "rule__ElementDefinition__Group_4__0__Impl"
    // InternalCssExtDsl.g:3416:1: rule__ElementDefinition__Group_4__0__Impl : ( 'styleclass' ) ;
    public final void rule__ElementDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3420:1: ( ( 'styleclass' ) )
            // InternalCssExtDsl.g:3421:1: ( 'styleclass' )
            {
            // InternalCssExtDsl.g:3421:1: ( 'styleclass' )
            // InternalCssExtDsl.g:3422:2: 'styleclass'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ElementDefinition__Group_4__1"
    // InternalCssExtDsl.g:3431:1: rule__ElementDefinition__Group_4__1 : rule__ElementDefinition__Group_4__1__Impl ;
    public final void rule__ElementDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3435:1: ( rule__ElementDefinition__Group_4__1__Impl )
            // InternalCssExtDsl.g:3436:2: rule__ElementDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__ElementDefinition__Group_4__1"


    // $ANTLR start "rule__ElementDefinition__Group_4__1__Impl"
    // InternalCssExtDsl.g:3442:1: rule__ElementDefinition__Group_4__1__Impl : ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) ) ;
    public final void rule__ElementDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3446:1: ( ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) ) )
            // InternalCssExtDsl.g:3447:1: ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) )
            {
            // InternalCssExtDsl.g:3447:1: ( ( rule__ElementDefinition__StyleclassAssignment_4_1 ) )
            // InternalCssExtDsl.g:3448:2: ( rule__ElementDefinition__StyleclassAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:3449:2: ( rule__ElementDefinition__StyleclassAssignment_4_1 )
            // InternalCssExtDsl.g:3449:3: rule__ElementDefinition__StyleclassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementDefinition__StyleclassAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassAssignment_4_1()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // InternalCssExtDsl.g:3458:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3462:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // InternalCssExtDsl.g:3463:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3470:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3474:1: ( ( () ) )
            // InternalCssExtDsl.g:3475:1: ( () )
            {
            // InternalCssExtDsl.g:3475:1: ( () )
            // InternalCssExtDsl.g:3476:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3477:2: ()
            // InternalCssExtDsl.g:3477:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // InternalCssExtDsl.g:3485:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3489:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // InternalCssExtDsl.g:3490:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__2();

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
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3497:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3501:1: ( ( ( rule__PropertyDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3502:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3502:1: ( ( rule__PropertyDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3503:2: ( rule__PropertyDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3504:2: ( rule__PropertyDefinition__DokuAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_JDOC) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCssExtDsl.g:3504:3: rule__PropertyDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuAssignment_1()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // InternalCssExtDsl.g:3512:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3516:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // InternalCssExtDsl.g:3517:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__3();

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
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3524:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3528:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3529:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3529:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3530:2: ( rule__PropertyDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3531:2: ( rule__PropertyDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3531:3: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // InternalCssExtDsl.g:3539:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3543:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // InternalCssExtDsl.g:3544:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__4();

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
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:3551:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3555:1: ( ( ( rule__PropertyDefinition__RuleAssignment_3 ) ) )
            // InternalCssExtDsl.g:3556:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            {
            // InternalCssExtDsl.g:3556:1: ( ( rule__PropertyDefinition__RuleAssignment_3 ) )
            // InternalCssExtDsl.g:3557:2: ( rule__PropertyDefinition__RuleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }
            // InternalCssExtDsl.g:3558:2: ( rule__PropertyDefinition__RuleAssignment_3 )
            // InternalCssExtDsl.g:3558:3: rule__PropertyDefinition__RuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__RuleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleAssignment_3()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // InternalCssExtDsl.g:3566:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3570:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // InternalCssExtDsl.g:3571:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__5();

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
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:3578:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3582:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // InternalCssExtDsl.g:3583:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:3583:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // InternalCssExtDsl.g:3584:2: ( rule__PropertyDefinition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:3585:2: ( rule__PropertyDefinition__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCssExtDsl.g:3585:3: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // InternalCssExtDsl.g:3593:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3597:1: ( rule__PropertyDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:3598:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:3604:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3608:1: ( ( ';' ) )
            // InternalCssExtDsl.g:3609:1: ( ';' )
            {
            // InternalCssExtDsl.g:3609:1: ( ';' )
            // InternalCssExtDsl.g:3610:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // InternalCssExtDsl.g:3620:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3624:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // InternalCssExtDsl.g:3625:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group_4__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // InternalCssExtDsl.g:3632:1: rule__PropertyDefinition__Group_4__0__Impl : ( 'default:' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3636:1: ( ( 'default:' ) )
            // InternalCssExtDsl.g:3637:1: ( 'default:' )
            {
            // InternalCssExtDsl.g:3637:1: ( 'default:' )
            // InternalCssExtDsl.g:3638:2: 'default:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // InternalCssExtDsl.g:3647:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3651:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // InternalCssExtDsl.g:3652:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // InternalCssExtDsl.g:3658:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3662:1: ( ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) ) )
            // InternalCssExtDsl.g:3663:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            {
            // InternalCssExtDsl.g:3663:1: ( ( rule__PropertyDefinition__DefaultAssignment_4_1 ) )
            // InternalCssExtDsl.g:3664:2: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:3665:2: ( rule__PropertyDefinition__DefaultAssignment_4_1 )
            // InternalCssExtDsl.g:3665:3: rule__PropertyDefinition__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyDefinition__DefaultAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultAssignment_4_1()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0"
    // InternalCssExtDsl.g:3674:1: rule__PseudoClassDefinition__Group__0 : rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 ;
    public final void rule__PseudoClassDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3678:1: ( rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1 )
            // InternalCssExtDsl.g:3679:2: rule__PseudoClassDefinition__Group__0__Impl rule__PseudoClassDefinition__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__PseudoClassDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__1();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__0"


    // $ANTLR start "rule__PseudoClassDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3686:1: rule__PseudoClassDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PseudoClassDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3690:1: ( ( () ) )
            // InternalCssExtDsl.g:3691:1: ( () )
            {
            // InternalCssExtDsl.g:3691:1: ( () )
            // InternalCssExtDsl.g:3692:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3693:2: ()
            // InternalCssExtDsl.g:3693:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PseudoClassDefinition__Group__0__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1"
    // InternalCssExtDsl.g:3701:1: rule__PseudoClassDefinition__Group__1 : rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 ;
    public final void rule__PseudoClassDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3705:1: ( rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2 )
            // InternalCssExtDsl.g:3706:2: rule__PseudoClassDefinition__Group__1__Impl rule__PseudoClassDefinition__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__PseudoClassDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__2();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1"


    // $ANTLR start "rule__PseudoClassDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3713:1: rule__PseudoClassDefinition__Group__1__Impl : ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) ;
    public final void rule__PseudoClassDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3717:1: ( ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3718:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3718:1: ( ( rule__PseudoClassDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3719:2: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3720:2: ( rule__PseudoClassDefinition__DokuAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_JDOC) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCssExtDsl.g:3720:3: rule__PseudoClassDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PseudoClassDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuAssignment_1()); 
            }

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__1__Impl"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2"
    // InternalCssExtDsl.g:3728:1: rule__PseudoClassDefinition__Group__2 : rule__PseudoClassDefinition__Group__2__Impl ;
    public final void rule__PseudoClassDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3732:1: ( rule__PseudoClassDefinition__Group__2__Impl )
            // InternalCssExtDsl.g:3733:2: rule__PseudoClassDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__2"


    // $ANTLR start "rule__PseudoClassDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3739:1: rule__PseudoClassDefinition__Group__2__Impl : ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) ;
    public final void rule__PseudoClassDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3743:1: ( ( ( rule__PseudoClassDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3744:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3744:1: ( ( rule__PseudoClassDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3745:2: ( rule__PseudoClassDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3746:2: ( rule__PseudoClassDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3746:3: rule__PseudoClassDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PseudoClassDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__PseudoClassDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__0"
    // InternalCssExtDsl.g:3755:1: rule__CSSRuleRef__Group__0 : rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 ;
    public final void rule__CSSRuleRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3759:1: ( rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1 )
            // InternalCssExtDsl.g:3760:2: rule__CSSRuleRef__Group__0__Impl rule__CSSRuleRef__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CSSRuleRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__1();

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
    // $ANTLR end "rule__CSSRuleRef__Group__0"


    // $ANTLR start "rule__CSSRuleRef__Group__0__Impl"
    // InternalCssExtDsl.g:3767:1: rule__CSSRuleRef__Group__0__Impl : ( ( rule__CSSRuleRef__Group_0__0 )? ) ;
    public final void rule__CSSRuleRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3771:1: ( ( ( rule__CSSRuleRef__Group_0__0 )? ) )
            // InternalCssExtDsl.g:3772:1: ( ( rule__CSSRuleRef__Group_0__0 )? )
            {
            // InternalCssExtDsl.g:3772:1: ( ( rule__CSSRuleRef__Group_0__0 )? )
            // InternalCssExtDsl.g:3773:2: ( rule__CSSRuleRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGroup_0()); 
            }
            // InternalCssExtDsl.g:3774:2: ( rule__CSSRuleRef__Group_0__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_JDOC) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCssExtDsl.g:3774:3: rule__CSSRuleRef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleRef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__1"
    // InternalCssExtDsl.g:3782:1: rule__CSSRuleRef__Group__1 : rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 ;
    public final void rule__CSSRuleRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3786:1: ( rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2 )
            // InternalCssExtDsl.g:3787:2: rule__CSSRuleRef__Group__1__Impl rule__CSSRuleRef__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CSSRuleRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__2();

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
    // $ANTLR end "rule__CSSRuleRef__Group__1"


    // $ANTLR start "rule__CSSRuleRef__Group__1__Impl"
    // InternalCssExtDsl.g:3794:1: rule__CSSRuleRef__Group__1__Impl : ( '<' ) ;
    public final void rule__CSSRuleRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3798:1: ( ( '<' ) )
            // InternalCssExtDsl.g:3799:1: ( '<' )
            {
            // InternalCssExtDsl.g:3799:1: ( '<' )
            // InternalCssExtDsl.g:3800:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__2"
    // InternalCssExtDsl.g:3809:1: rule__CSSRuleRef__Group__2 : rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3 ;
    public final void rule__CSSRuleRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3813:1: ( rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3 )
            // InternalCssExtDsl.g:3814:2: rule__CSSRuleRef__Group__2__Impl rule__CSSRuleRef__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__CSSRuleRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__3();

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
    // $ANTLR end "rule__CSSRuleRef__Group__2"


    // $ANTLR start "rule__CSSRuleRef__Group__2__Impl"
    // InternalCssExtDsl.g:3821:1: rule__CSSRuleRef__Group__2__Impl : ( ( rule__CSSRuleRef__RefAssignment_2 ) ) ;
    public final void rule__CSSRuleRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3825:1: ( ( ( rule__CSSRuleRef__RefAssignment_2 ) ) )
            // InternalCssExtDsl.g:3826:1: ( ( rule__CSSRuleRef__RefAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3826:1: ( ( rule__CSSRuleRef__RefAssignment_2 ) )
            // InternalCssExtDsl.g:3827:2: ( rule__CSSRuleRef__RefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefAssignment_2()); 
            }
            // InternalCssExtDsl.g:3828:2: ( rule__CSSRuleRef__RefAssignment_2 )
            // InternalCssExtDsl.g:3828:3: rule__CSSRuleRef__RefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__RefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefAssignment_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group__3"
    // InternalCssExtDsl.g:3836:1: rule__CSSRuleRef__Group__3 : rule__CSSRuleRef__Group__3__Impl ;
    public final void rule__CSSRuleRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3840:1: ( rule__CSSRuleRef__Group__3__Impl )
            // InternalCssExtDsl.g:3841:2: rule__CSSRuleRef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group__3__Impl();

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
    // $ANTLR end "rule__CSSRuleRef__Group__3"


    // $ANTLR start "rule__CSSRuleRef__Group__3__Impl"
    // InternalCssExtDsl.g:3847:1: rule__CSSRuleRef__Group__3__Impl : ( '>' ) ;
    public final void rule__CSSRuleRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3851:1: ( ( '>' ) )
            // InternalCssExtDsl.g:3852:1: ( '>' )
            {
            // InternalCssExtDsl.g:3852:1: ( '>' )
            // InternalCssExtDsl.g:3853:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group_0__0"
    // InternalCssExtDsl.g:3863:1: rule__CSSRuleRef__Group_0__0 : rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1 ;
    public final void rule__CSSRuleRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3867:1: ( rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1 )
            // InternalCssExtDsl.g:3868:2: rule__CSSRuleRef__Group_0__0__Impl rule__CSSRuleRef__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSRuleRef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group_0__1();

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
    // $ANTLR end "rule__CSSRuleRef__Group_0__0"


    // $ANTLR start "rule__CSSRuleRef__Group_0__0__Impl"
    // InternalCssExtDsl.g:3875:1: rule__CSSRuleRef__Group_0__0__Impl : ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) ) ;
    public final void rule__CSSRuleRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3879:1: ( ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) ) )
            // InternalCssExtDsl.g:3880:1: ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) )
            {
            // InternalCssExtDsl.g:3880:1: ( ( rule__CSSRuleRef__DokuAssignment_0_0 ) )
            // InternalCssExtDsl.g:3881:2: ( rule__CSSRuleRef__DokuAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getDokuAssignment_0_0()); 
            }
            // InternalCssExtDsl.g:3882:2: ( rule__CSSRuleRef__DokuAssignment_0_0 )
            // InternalCssExtDsl.g:3882:3: rule__CSSRuleRef__DokuAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__DokuAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getDokuAssignment_0_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group_0__0__Impl"


    // $ANTLR start "rule__CSSRuleRef__Group_0__1"
    // InternalCssExtDsl.g:3890:1: rule__CSSRuleRef__Group_0__1 : rule__CSSRuleRef__Group_0__1__Impl ;
    public final void rule__CSSRuleRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3894:1: ( rule__CSSRuleRef__Group_0__1__Impl )
            // InternalCssExtDsl.g:3895:2: rule__CSSRuleRef__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRef__Group_0__1__Impl();

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
    // $ANTLR end "rule__CSSRuleRef__Group_0__1"


    // $ANTLR start "rule__CSSRuleRef__Group_0__1__Impl"
    // InternalCssExtDsl.g:3901:1: rule__CSSRuleRef__Group_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3905:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:3906:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:3906:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:3907:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
            }
            // InternalCssExtDsl.g:3908:2: ( RULE_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_WS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCssExtDsl.g:3908:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__Group_0__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0"
    // InternalCssExtDsl.g:3917:1: rule__CSSRuleDefinition__Group__0 : rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 ;
    public final void rule__CSSRuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3921:1: ( rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1 )
            // InternalCssExtDsl.g:3922:2: rule__CSSRuleDefinition__Group__0__Impl rule__CSSRuleDefinition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__CSSRuleDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__1();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__0"


    // $ANTLR start "rule__CSSRuleDefinition__Group__0__Impl"
    // InternalCssExtDsl.g:3929:1: rule__CSSRuleDefinition__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3933:1: ( ( () ) )
            // InternalCssExtDsl.g:3934:1: ( () )
            {
            // InternalCssExtDsl.g:3934:1: ( () )
            // InternalCssExtDsl.g:3935:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }
            // InternalCssExtDsl.g:3936:2: ()
            // InternalCssExtDsl.g:3936:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1"
    // InternalCssExtDsl.g:3944:1: rule__CSSRuleDefinition__Group__1 : rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 ;
    public final void rule__CSSRuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3948:1: ( rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2 )
            // InternalCssExtDsl.g:3949:2: rule__CSSRuleDefinition__Group__1__Impl rule__CSSRuleDefinition__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__CSSRuleDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__2();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1"


    // $ANTLR start "rule__CSSRuleDefinition__Group__1__Impl"
    // InternalCssExtDsl.g:3956:1: rule__CSSRuleDefinition__Group__1__Impl : ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) ;
    public final void rule__CSSRuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3960:1: ( ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? ) )
            // InternalCssExtDsl.g:3961:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            {
            // InternalCssExtDsl.g:3961:1: ( ( rule__CSSRuleDefinition__DokuAssignment_1 )? )
            // InternalCssExtDsl.g:3962:2: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }
            // InternalCssExtDsl.g:3963:2: ( rule__CSSRuleDefinition__DokuAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_JDOC) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCssExtDsl.g:3963:3: rule__CSSRuleDefinition__DokuAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleDefinition__DokuAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuAssignment_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2"
    // InternalCssExtDsl.g:3971:1: rule__CSSRuleDefinition__Group__2 : rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 ;
    public final void rule__CSSRuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3975:1: ( rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3 )
            // InternalCssExtDsl.g:3976:2: rule__CSSRuleDefinition__Group__2__Impl rule__CSSRuleDefinition__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__CSSRuleDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__3();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2"


    // $ANTLR start "rule__CSSRuleDefinition__Group__2__Impl"
    // InternalCssExtDsl.g:3983:1: rule__CSSRuleDefinition__Group__2__Impl : ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) ;
    public final void rule__CSSRuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:3987:1: ( ( ( rule__CSSRuleDefinition__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:3988:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:3988:1: ( ( rule__CSSRuleDefinition__NameAssignment_2 ) )
            // InternalCssExtDsl.g:3989:2: ( rule__CSSRuleDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:3990:2: ( rule__CSSRuleDefinition__NameAssignment_2 )
            // InternalCssExtDsl.g:3990:3: rule__CSSRuleDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3"
    // InternalCssExtDsl.g:3998:1: rule__CSSRuleDefinition__Group__3 : rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 ;
    public final void rule__CSSRuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4002:1: ( rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4 )
            // InternalCssExtDsl.g:4003:2: rule__CSSRuleDefinition__Group__3__Impl rule__CSSRuleDefinition__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__4();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3"


    // $ANTLR start "rule__CSSRuleDefinition__Group__3__Impl"
    // InternalCssExtDsl.g:4010:1: rule__CSSRuleDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__CSSRuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4014:1: ( ( '=' ) )
            // InternalCssExtDsl.g:4015:1: ( '=' )
            {
            // InternalCssExtDsl.g:4015:1: ( '=' )
            // InternalCssExtDsl.g:4016:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4"
    // InternalCssExtDsl.g:4025:1: rule__CSSRuleDefinition__Group__4 : rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 ;
    public final void rule__CSSRuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4029:1: ( rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5 )
            // InternalCssExtDsl.g:4030:2: rule__CSSRuleDefinition__Group__4__Impl rule__CSSRuleDefinition__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__CSSRuleDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__5();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4"


    // $ANTLR start "rule__CSSRuleDefinition__Group__4__Impl"
    // InternalCssExtDsl.g:4037:1: rule__CSSRuleDefinition__Group__4__Impl : ( ( rule__CSSRuleDefinition__Alternatives_4 ) ) ;
    public final void rule__CSSRuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4041:1: ( ( ( rule__CSSRuleDefinition__Alternatives_4 ) ) )
            // InternalCssExtDsl.g:4042:1: ( ( rule__CSSRuleDefinition__Alternatives_4 ) )
            {
            // InternalCssExtDsl.g:4042:1: ( ( rule__CSSRuleDefinition__Alternatives_4 ) )
            // InternalCssExtDsl.g:4043:2: ( rule__CSSRuleDefinition__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_4()); 
            }
            // InternalCssExtDsl.g:4044:2: ( rule__CSSRuleDefinition__Alternatives_4 )
            // InternalCssExtDsl.g:4044:3: rule__CSSRuleDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getAlternatives_4()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5"
    // InternalCssExtDsl.g:4052:1: rule__CSSRuleDefinition__Group__5 : rule__CSSRuleDefinition__Group__5__Impl ;
    public final void rule__CSSRuleDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4056:1: ( rule__CSSRuleDefinition__Group__5__Impl )
            // InternalCssExtDsl.g:4057:2: rule__CSSRuleDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__5"


    // $ANTLR start "rule__CSSRuleDefinition__Group__5__Impl"
    // InternalCssExtDsl.g:4063:1: rule__CSSRuleDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__CSSRuleDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4067:1: ( ( ';' ) )
            // InternalCssExtDsl.g:4068:1: ( ';' )
            {
            // InternalCssExtDsl.g:4068:1: ( ';' )
            // InternalCssExtDsl.g:4069:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__0"
    // InternalCssExtDsl.g:4079:1: rule__CSSRuleFunc__Group__0 : rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 ;
    public final void rule__CSSRuleFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4083:1: ( rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1 )
            // InternalCssExtDsl.g:4084:2: rule__CSSRuleFunc__Group__0__Impl rule__CSSRuleFunc__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleFunc__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__1();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__0"


    // $ANTLR start "rule__CSSRuleFunc__Group__0__Impl"
    // InternalCssExtDsl.g:4091:1: rule__CSSRuleFunc__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4095:1: ( ( () ) )
            // InternalCssExtDsl.g:4096:1: ( () )
            {
            // InternalCssExtDsl.g:4096:1: ( () )
            // InternalCssExtDsl.g:4097:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }
            // InternalCssExtDsl.g:4098:2: ()
            // InternalCssExtDsl.g:4098:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleFunc__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__1"
    // InternalCssExtDsl.g:4106:1: rule__CSSRuleFunc__Group__1 : rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 ;
    public final void rule__CSSRuleFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4110:1: ( rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2 )
            // InternalCssExtDsl.g:4111:2: rule__CSSRuleFunc__Group__1__Impl rule__CSSRuleFunc__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CSSRuleFunc__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__2();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__1"


    // $ANTLR start "rule__CSSRuleFunc__Group__1__Impl"
    // InternalCssExtDsl.g:4118:1: rule__CSSRuleFunc__Group__1__Impl : ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) ;
    public final void rule__CSSRuleFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4122:1: ( ( ( rule__CSSRuleFunc__NameAssignment_1 ) ) )
            // InternalCssExtDsl.g:4123:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            {
            // InternalCssExtDsl.g:4123:1: ( ( rule__CSSRuleFunc__NameAssignment_1 ) )
            // InternalCssExtDsl.g:4124:2: ( rule__CSSRuleFunc__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }
            // InternalCssExtDsl.g:4125:2: ( rule__CSSRuleFunc__NameAssignment_1 )
            // InternalCssExtDsl.g:4125:3: rule__CSSRuleFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__2"
    // InternalCssExtDsl.g:4133:1: rule__CSSRuleFunc__Group__2 : rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 ;
    public final void rule__CSSRuleFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4137:1: ( rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3 )
            // InternalCssExtDsl.g:4138:2: rule__CSSRuleFunc__Group__2__Impl rule__CSSRuleFunc__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__CSSRuleFunc__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__3();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__2"


    // $ANTLR start "rule__CSSRuleFunc__Group__2__Impl"
    // InternalCssExtDsl.g:4145:1: rule__CSSRuleFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__CSSRuleFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4149:1: ( ( '(' ) )
            // InternalCssExtDsl.g:4150:1: ( '(' )
            {
            // InternalCssExtDsl.g:4150:1: ( '(' )
            // InternalCssExtDsl.g:4151:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__3"
    // InternalCssExtDsl.g:4160:1: rule__CSSRuleFunc__Group__3 : rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 ;
    public final void rule__CSSRuleFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4164:1: ( rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4 )
            // InternalCssExtDsl.g:4165:2: rule__CSSRuleFunc__Group__3__Impl rule__CSSRuleFunc__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__CSSRuleFunc__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__4();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__3"


    // $ANTLR start "rule__CSSRuleFunc__Group__3__Impl"
    // InternalCssExtDsl.g:4172:1: rule__CSSRuleFunc__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4176:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:4177:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:4177:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:4178:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }
            // InternalCssExtDsl.g:4179:2: ( RULE_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCssExtDsl.g:4179:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__Group__3__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__4"
    // InternalCssExtDsl.g:4187:1: rule__CSSRuleFunc__Group__4 : rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 ;
    public final void rule__CSSRuleFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4191:1: ( rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5 )
            // InternalCssExtDsl.g:4192:2: rule__CSSRuleFunc__Group__4__Impl rule__CSSRuleFunc__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__CSSRuleFunc__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__5();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__4"


    // $ANTLR start "rule__CSSRuleFunc__Group__4__Impl"
    // InternalCssExtDsl.g:4199:1: rule__CSSRuleFunc__Group__4__Impl : ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) ;
    public final void rule__CSSRuleFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4203:1: ( ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) ) )
            // InternalCssExtDsl.g:4204:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            {
            // InternalCssExtDsl.g:4204:1: ( ( rule__CSSRuleFunc__ParamsAssignment_4 ) )
            // InternalCssExtDsl.g:4205:2: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }
            // InternalCssExtDsl.g:4206:2: ( rule__CSSRuleFunc__ParamsAssignment_4 )
            // InternalCssExtDsl.g:4206:3: rule__CSSRuleFunc__ParamsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__ParamsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsAssignment_4()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__Group__4__Impl"


    // $ANTLR start "rule__CSSRuleFunc__Group__5"
    // InternalCssExtDsl.g:4214:1: rule__CSSRuleFunc__Group__5 : rule__CSSRuleFunc__Group__5__Impl ;
    public final void rule__CSSRuleFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4218:1: ( rule__CSSRuleFunc__Group__5__Impl )
            // InternalCssExtDsl.g:4219:2: rule__CSSRuleFunc__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleFunc__Group__5__Impl();

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
    // $ANTLR end "rule__CSSRuleFunc__Group__5"


    // $ANTLR start "rule__CSSRuleFunc__Group__5__Impl"
    // InternalCssExtDsl.g:4225:1: rule__CSSRuleFunc__Group__5__Impl : ( ')' ) ;
    public final void rule__CSSRuleFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4229:1: ( ( ')' ) )
            // InternalCssExtDsl.g:4230:1: ( ')' )
            {
            // InternalCssExtDsl.g:4230:1: ( ')' )
            // InternalCssExtDsl.g:4231:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__Group__5__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__0"
    // InternalCssExtDsl.g:4241:1: rule__CSSRuleOr__Group__0 : rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 ;
    public final void rule__CSSRuleOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4245:1: ( rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1 )
            // InternalCssExtDsl.g:4246:2: rule__CSSRuleOr__Group__0__Impl rule__CSSRuleOr__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__CSSRuleOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group__0"


    // $ANTLR start "rule__CSSRuleOr__Group__0__Impl"
    // InternalCssExtDsl.g:4253:1: rule__CSSRuleOr__Group__0__Impl : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4257:1: ( ( ruleCSSRuleXor ) )
            // InternalCssExtDsl.g:4258:1: ( ruleCSSRuleXor )
            {
            // InternalCssExtDsl.g:4258:1: ( ruleCSSRuleXor )
            // InternalCssExtDsl.g:4259:2: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group__1"
    // InternalCssExtDsl.g:4268:1: rule__CSSRuleOr__Group__1 : rule__CSSRuleOr__Group__1__Impl ;
    public final void rule__CSSRuleOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4272:1: ( rule__CSSRuleOr__Group__1__Impl )
            // InternalCssExtDsl.g:4273:2: rule__CSSRuleOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group__1"


    // $ANTLR start "rule__CSSRuleOr__Group__1__Impl"
    // InternalCssExtDsl.g:4279:1: rule__CSSRuleOr__Group__1__Impl : ( ( rule__CSSRuleOr__Group_1__0 )? ) ;
    public final void rule__CSSRuleOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4283:1: ( ( ( rule__CSSRuleOr__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4284:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4284:1: ( ( rule__CSSRuleOr__Group_1__0 )? )
            // InternalCssExtDsl.g:4285:2: ( rule__CSSRuleOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4286:2: ( rule__CSSRuleOr__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCssExtDsl.g:4286:3: rule__CSSRuleOr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0"
    // InternalCssExtDsl.g:4295:1: rule__CSSRuleOr__Group_1__0 : rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 ;
    public final void rule__CSSRuleOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4299:1: ( rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1 )
            // InternalCssExtDsl.g:4300:2: rule__CSSRuleOr__Group_1__0__Impl rule__CSSRuleOr__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__CSSRuleOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1__0__Impl"
    // InternalCssExtDsl.g:4307:1: rule__CSSRuleOr__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4311:1: ( ( () ) )
            // InternalCssExtDsl.g:4312:1: ( () )
            {
            // InternalCssExtDsl.g:4312:1: ( () )
            // InternalCssExtDsl.g:4313:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }
            // InternalCssExtDsl.g:4314:2: ()
            // InternalCssExtDsl.g:4314:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleOr__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1"
    // InternalCssExtDsl.g:4322:1: rule__CSSRuleOr__Group_1__1 : rule__CSSRuleOr__Group_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4326:1: ( rule__CSSRuleOr__Group_1__1__Impl )
            // InternalCssExtDsl.g:4327:2: rule__CSSRuleOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1__1__Impl"
    // InternalCssExtDsl.g:4333:1: rule__CSSRuleOr__Group_1__1__Impl : ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4337:1: ( ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:4338:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:4338:1: ( ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:4339:2: ( ( rule__CSSRuleOr__Group_1_1__0 ) ) ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:4339:2: ( ( rule__CSSRuleOr__Group_1_1__0 ) )
            // InternalCssExtDsl.g:4340:3: ( rule__CSSRuleOr__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4341:3: ( rule__CSSRuleOr__Group_1_1__0 )
            // InternalCssExtDsl.g:4341:4: rule__CSSRuleOr__Group_1_1__0
            {
            pushFollow(FOLLOW_43);
            rule__CSSRuleOr__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4344:2: ( ( rule__CSSRuleOr__Group_1_1__0 )* )
            // InternalCssExtDsl.g:4345:3: ( rule__CSSRuleOr__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4346:3: ( rule__CSSRuleOr__Group_1_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==36) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCssExtDsl.g:4346:4: rule__CSSRuleOr__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__CSSRuleOr__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CSSRuleOr__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0"
    // InternalCssExtDsl.g:4356:1: rule__CSSRuleOr__Group_1_1__0 : rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 ;
    public final void rule__CSSRuleOr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4360:1: ( rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1 )
            // InternalCssExtDsl.g:4361:2: rule__CSSRuleOr__Group_1_1__0__Impl rule__CSSRuleOr__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleOr__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1_1__1();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:4368:1: rule__CSSRuleOr__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__CSSRuleOr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4372:1: ( ( '|' ) )
            // InternalCssExtDsl.g:4373:1: ( '|' )
            {
            // InternalCssExtDsl.g:4373:1: ( '|' )
            // InternalCssExtDsl.g:4374:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1"
    // InternalCssExtDsl.g:4383:1: rule__CSSRuleOr__Group_1_1__1 : rule__CSSRuleOr__Group_1_1__1__Impl ;
    public final void rule__CSSRuleOr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4387:1: ( rule__CSSRuleOr__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:4388:2: rule__CSSRuleOr__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleOr__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:4394:1: rule__CSSRuleOr__Group_1_1__1__Impl : ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleOr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4398:1: ( ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:4399:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:4399:1: ( ( rule__CSSRuleOr__OrsAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:4400:2: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:4401:2: ( rule__CSSRuleOr__OrsAssignment_1_1_1 )
            // InternalCssExtDsl.g:4401:3: rule__CSSRuleOr__OrsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleOr__OrsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsAssignment_1_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__0"
    // InternalCssExtDsl.g:4410:1: rule__CSSRuleXor__Group__0 : rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 ;
    public final void rule__CSSRuleXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4414:1: ( rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1 )
            // InternalCssExtDsl.g:4415:2: rule__CSSRuleXor__Group__0__Impl rule__CSSRuleXor__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__CSSRuleXor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group__0"


    // $ANTLR start "rule__CSSRuleXor__Group__0__Impl"
    // InternalCssExtDsl.g:4422:1: rule__CSSRuleXor__Group__0__Impl : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4426:1: ( ( ruleCSSRuleConcat ) )
            // InternalCssExtDsl.g:4427:1: ( ruleCSSRuleConcat )
            {
            // InternalCssExtDsl.g:4427:1: ( ruleCSSRuleConcat )
            // InternalCssExtDsl.g:4428:2: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group__1"
    // InternalCssExtDsl.g:4437:1: rule__CSSRuleXor__Group__1 : rule__CSSRuleXor__Group__1__Impl ;
    public final void rule__CSSRuleXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4441:1: ( rule__CSSRuleXor__Group__1__Impl )
            // InternalCssExtDsl.g:4442:2: rule__CSSRuleXor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group__1"


    // $ANTLR start "rule__CSSRuleXor__Group__1__Impl"
    // InternalCssExtDsl.g:4448:1: rule__CSSRuleXor__Group__1__Impl : ( ( rule__CSSRuleXor__Group_1__0 )? ) ;
    public final void rule__CSSRuleXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4452:1: ( ( ( rule__CSSRuleXor__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4453:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4453:1: ( ( rule__CSSRuleXor__Group_1__0 )? )
            // InternalCssExtDsl.g:4454:2: ( rule__CSSRuleXor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4455:2: ( rule__CSSRuleXor__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCssExtDsl.g:4455:3: rule__CSSRuleXor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleXor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0"
    // InternalCssExtDsl.g:4464:1: rule__CSSRuleXor__Group_1__0 : rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 ;
    public final void rule__CSSRuleXor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4468:1: ( rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1 )
            // InternalCssExtDsl.g:4469:2: rule__CSSRuleXor__Group_1__0__Impl rule__CSSRuleXor__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__CSSRuleXor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1__0__Impl"
    // InternalCssExtDsl.g:4476:1: rule__CSSRuleXor__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleXor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4480:1: ( ( () ) )
            // InternalCssExtDsl.g:4481:1: ( () )
            {
            // InternalCssExtDsl.g:4481:1: ( () )
            // InternalCssExtDsl.g:4482:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }
            // InternalCssExtDsl.g:4483:2: ()
            // InternalCssExtDsl.g:4483:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleXor__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1"
    // InternalCssExtDsl.g:4491:1: rule__CSSRuleXor__Group_1__1 : rule__CSSRuleXor__Group_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4495:1: ( rule__CSSRuleXor__Group_1__1__Impl )
            // InternalCssExtDsl.g:4496:2: rule__CSSRuleXor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1__1__Impl"
    // InternalCssExtDsl.g:4502:1: rule__CSSRuleXor__Group_1__1__Impl : ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleXor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4506:1: ( ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:4507:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:4507:1: ( ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:4508:2: ( ( rule__CSSRuleXor__Group_1_1__0 ) ) ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:4508:2: ( ( rule__CSSRuleXor__Group_1_1__0 ) )
            // InternalCssExtDsl.g:4509:3: ( rule__CSSRuleXor__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4510:3: ( rule__CSSRuleXor__Group_1_1__0 )
            // InternalCssExtDsl.g:4510:4: rule__CSSRuleXor__Group_1_1__0
            {
            pushFollow(FOLLOW_45);
            rule__CSSRuleXor__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4513:2: ( ( rule__CSSRuleXor__Group_1_1__0 )* )
            // InternalCssExtDsl.g:4514:3: ( rule__CSSRuleXor__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4515:3: ( rule__CSSRuleXor__Group_1_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==37) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCssExtDsl.g:4515:4: rule__CSSRuleXor__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__CSSRuleXor__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CSSRuleXor__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0"
    // InternalCssExtDsl.g:4525:1: rule__CSSRuleXor__Group_1_1__0 : rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 ;
    public final void rule__CSSRuleXor__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4529:1: ( rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1 )
            // InternalCssExtDsl.g:4530:2: rule__CSSRuleXor__Group_1_1__0__Impl rule__CSSRuleXor__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleXor__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1_1__1();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:4537:1: rule__CSSRuleXor__Group_1_1__0__Impl : ( '||' ) ;
    public final void rule__CSSRuleXor__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4541:1: ( ( '||' ) )
            // InternalCssExtDsl.g:4542:1: ( '||' )
            {
            // InternalCssExtDsl.g:4542:1: ( '||' )
            // InternalCssExtDsl.g:4543:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1"
    // InternalCssExtDsl.g:4552:1: rule__CSSRuleXor__Group_1_1__1 : rule__CSSRuleXor__Group_1_1__1__Impl ;
    public final void rule__CSSRuleXor__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4556:1: ( rule__CSSRuleXor__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:4557:2: rule__CSSRuleXor__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleXor__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:4563:1: rule__CSSRuleXor__Group_1_1__1__Impl : ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleXor__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4567:1: ( ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:4568:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:4568:1: ( ( rule__CSSRuleXor__XorsAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:4569:2: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:4570:2: ( rule__CSSRuleXor__XorsAssignment_1_1_1 )
            // InternalCssExtDsl.g:4570:3: rule__CSSRuleXor__XorsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleXor__XorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsAssignment_1_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__0"
    // InternalCssExtDsl.g:4579:1: rule__CSSRuleConcat__Group__0 : rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 ;
    public final void rule__CSSRuleConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4583:1: ( rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1 )
            // InternalCssExtDsl.g:4584:2: rule__CSSRuleConcat__Group__0__Impl rule__CSSRuleConcat__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__1();

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
    // $ANTLR end "rule__CSSRuleConcat__Group__0"


    // $ANTLR start "rule__CSSRuleConcat__Group__0__Impl"
    // InternalCssExtDsl.g:4591:1: rule__CSSRuleConcat__Group__0__Impl : ( ruleCSSRuleConcatWithoutSpace ) ;
    public final void rule__CSSRuleConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4595:1: ( ( ruleCSSRuleConcatWithoutSpace ) )
            // InternalCssExtDsl.g:4596:1: ( ruleCSSRuleConcatWithoutSpace )
            {
            // InternalCssExtDsl.g:4596:1: ( ruleCSSRuleConcatWithoutSpace )
            // InternalCssExtDsl.g:4597:2: ruleCSSRuleConcatWithoutSpace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcat__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group__1"
    // InternalCssExtDsl.g:4606:1: rule__CSSRuleConcat__Group__1 : rule__CSSRuleConcat__Group__1__Impl ;
    public final void rule__CSSRuleConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4610:1: ( rule__CSSRuleConcat__Group__1__Impl )
            // InternalCssExtDsl.g:4611:2: rule__CSSRuleConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcat__Group__1"


    // $ANTLR start "rule__CSSRuleConcat__Group__1__Impl"
    // InternalCssExtDsl.g:4617:1: rule__CSSRuleConcat__Group__1__Impl : ( ( rule__CSSRuleConcat__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4621:1: ( ( ( rule__CSSRuleConcat__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4622:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4622:1: ( ( rule__CSSRuleConcat__Group_1__0 )? )
            // InternalCssExtDsl.g:4623:2: ( rule__CSSRuleConcat__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4624:2: ( rule__CSSRuleConcat__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||(LA53_0>=RULE_JDOC && LA53_0<=RULE_INT)||LA53_0==RULE_REGEX||(LA53_0>=18 && LA53_0<=19)||LA53_0==33||LA53_0==39||(LA53_0>=42 && LA53_0<=46)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCssExtDsl.g:4624:3: rule__CSSRuleConcat__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleConcat__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcat__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0"
    // InternalCssExtDsl.g:4633:1: rule__CSSRuleConcat__Group_1__0 : rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 ;
    public final void rule__CSSRuleConcat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4637:1: ( rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1 )
            // InternalCssExtDsl.g:4638:2: rule__CSSRuleConcat__Group_1__0__Impl rule__CSSRuleConcat__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleConcat__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__0__Impl"
    // InternalCssExtDsl.g:4645:1: rule__CSSRuleConcat__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4649:1: ( ( () ) )
            // InternalCssExtDsl.g:4650:1: ( () )
            {
            // InternalCssExtDsl.g:4650:1: ( () )
            // InternalCssExtDsl.g:4651:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }
            // InternalCssExtDsl.g:4652:2: ()
            // InternalCssExtDsl.g:4652:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcat__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1"
    // InternalCssExtDsl.g:4660:1: rule__CSSRuleConcat__Group_1__1 : rule__CSSRuleConcat__Group_1__1__Impl ;
    public final void rule__CSSRuleConcat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4664:1: ( rule__CSSRuleConcat__Group_1__1__Impl )
            // InternalCssExtDsl.g:4665:2: rule__CSSRuleConcat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcat__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcat__Group_1__1__Impl"
    // InternalCssExtDsl.g:4671:1: rule__CSSRuleConcat__Group_1__1__Impl : ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) ;
    public final void rule__CSSRuleConcat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4675:1: ( ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) ) )
            // InternalCssExtDsl.g:4676:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            {
            // InternalCssExtDsl.g:4676:1: ( ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* ) )
            // InternalCssExtDsl.g:4677:2: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) ) ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            {
            // InternalCssExtDsl.g:4677:2: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 ) )
            // InternalCssExtDsl.g:4678:3: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:4679:3: ( rule__CSSRuleConcat__ConcAssignment_1_1 )
            // InternalCssExtDsl.g:4679:4: rule__CSSRuleConcat__ConcAssignment_1_1
            {
            pushFollow(FOLLOW_46);
            rule__CSSRuleConcat__ConcAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4682:2: ( ( rule__CSSRuleConcat__ConcAssignment_1_1 )* )
            // InternalCssExtDsl.g:4683:3: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:4684:3: ( rule__CSSRuleConcat__ConcAssignment_1_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||(LA54_0>=RULE_JDOC && LA54_0<=RULE_INT)||LA54_0==RULE_REGEX||(LA54_0>=18 && LA54_0<=19)||LA54_0==33||LA54_0==39||(LA54_0>=42 && LA54_0<=46)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCssExtDsl.g:4684:4: rule__CSSRuleConcat__ConcAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__CSSRuleConcat__ConcAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcAssignment_1_1()); 
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
    // $ANTLR end "rule__CSSRuleConcat__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__0"
    // InternalCssExtDsl.g:4694:1: rule__CSSRuleConcatWithoutSpace__Group__0 : rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4698:1: ( rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1 )
            // InternalCssExtDsl.g:4699:2: rule__CSSRuleConcatWithoutSpace__Group__0__Impl rule__CSSRuleConcatWithoutSpace__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__CSSRuleConcatWithoutSpace__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__1();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__0__Impl"
    // InternalCssExtDsl.g:4706:1: rule__CSSRuleConcatWithoutSpace__Group__0__Impl : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4710:1: ( ( ruleCSSRulePostfix ) )
            // InternalCssExtDsl.g:4711:1: ( ruleCSSRulePostfix )
            {
            // InternalCssExtDsl.g:4711:1: ( ruleCSSRulePostfix )
            // InternalCssExtDsl.g:4712:2: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__1"
    // InternalCssExtDsl.g:4721:1: rule__CSSRuleConcatWithoutSpace__Group__1 : rule__CSSRuleConcatWithoutSpace__Group__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4725:1: ( rule__CSSRuleConcatWithoutSpace__Group__1__Impl )
            // InternalCssExtDsl.g:4726:2: rule__CSSRuleConcatWithoutSpace__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group__1__Impl"
    // InternalCssExtDsl.g:4732:1: rule__CSSRuleConcatWithoutSpace__Group__1__Impl : ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4736:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4737:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4737:1: ( ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )? )
            // InternalCssExtDsl.g:4738:2: ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4739:2: ( rule__CSSRuleConcatWithoutSpace__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCssExtDsl.g:4739:3: rule__CSSRuleConcatWithoutSpace__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleConcatWithoutSpace__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__0"
    // InternalCssExtDsl.g:4748:1: rule__CSSRuleConcatWithoutSpace__Group_1__0 : rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4752:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1 )
            // InternalCssExtDsl.g:4753:2: rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl"
    // InternalCssExtDsl.g:4760:1: rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4764:1: ( ( () ) )
            // InternalCssExtDsl.g:4765:1: ( () )
            {
            // InternalCssExtDsl.g:4765:1: ( () )
            // InternalCssExtDsl.g:4766:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0()); 
            }
            // InternalCssExtDsl.g:4767:2: ()
            // InternalCssExtDsl.g:4767:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__1"
    // InternalCssExtDsl.g:4775:1: rule__CSSRuleConcatWithoutSpace__Group_1__1 : rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4779:1: ( rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl )
            // InternalCssExtDsl.g:4780:2: rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl"
    // InternalCssExtDsl.g:4786:1: rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl : ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4790:1: ( ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) ) )
            // InternalCssExtDsl.g:4791:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) )
            {
            // InternalCssExtDsl.g:4791:1: ( ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* ) )
            // InternalCssExtDsl.g:4792:2: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) ) ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* )
            {
            // InternalCssExtDsl.g:4792:2: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 ) )
            // InternalCssExtDsl.g:4793:3: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4794:3: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )
            // InternalCssExtDsl.g:4794:4: rule__CSSRuleConcatWithoutSpace__Group_1_1__0
            {
            pushFollow(FOLLOW_48);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }

            }

            // InternalCssExtDsl.g:4797:2: ( ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )* )
            // InternalCssExtDsl.g:4798:3: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
            }
            // InternalCssExtDsl.g:4799:3: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==38) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCssExtDsl.g:4799:4: rule__CSSRuleConcatWithoutSpace__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__CSSRuleConcatWithoutSpace__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__0"
    // InternalCssExtDsl.g:4809:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__0 : rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1 ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4813:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1 )
            // InternalCssExtDsl.g:4814:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl rule__CSSRuleConcatWithoutSpace__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__1();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__0"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl"
    // InternalCssExtDsl.g:4821:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl : ( '~' ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4825:1: ( ( '~' ) )
            // InternalCssExtDsl.g:4826:1: ( '~' )
            {
            // InternalCssExtDsl.g:4826:1: ( '~' )
            // InternalCssExtDsl.g:4827:2: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__0__Impl"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__1"
    // InternalCssExtDsl.g:4836:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__1 : rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4840:1: ( rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl )
            // InternalCssExtDsl.g:4841:2: rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl"
    // InternalCssExtDsl.g:4847:1: rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl : ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) ) ;
    public final void rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4851:1: ( ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) ) )
            // InternalCssExtDsl.g:4852:1: ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) )
            {
            // InternalCssExtDsl.g:4852:1: ( ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 ) )
            // InternalCssExtDsl.g:4853:2: ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcAssignment_1_1_1()); 
            }
            // InternalCssExtDsl.g:4854:2: ( rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 )
            // InternalCssExtDsl.g:4854:3: rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcAssignment_1_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__Group_1_1__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__0"
    // InternalCssExtDsl.g:4863:1: rule__CSSRulePostfix__Group__0 : rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 ;
    public final void rule__CSSRulePostfix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4867:1: ( rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1 )
            // InternalCssExtDsl.g:4868:2: rule__CSSRulePostfix__Group__0__Impl rule__CSSRulePostfix__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__CSSRulePostfix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__1();

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
    // $ANTLR end "rule__CSSRulePostfix__Group__0"


    // $ANTLR start "rule__CSSRulePostfix__Group__0__Impl"
    // InternalCssExtDsl.g:4875:1: rule__CSSRulePostfix__Group__0__Impl : ( ruleCSSRulePrimary ) ;
    public final void rule__CSSRulePostfix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4879:1: ( ( ruleCSSRulePrimary ) )
            // InternalCssExtDsl.g:4880:1: ( ruleCSSRulePrimary )
            {
            // InternalCssExtDsl.g:4880:1: ( ruleCSSRulePrimary )
            // InternalCssExtDsl.g:4881:2: ruleCSSRulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CSSRulePostfix__Group__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group__1"
    // InternalCssExtDsl.g:4890:1: rule__CSSRulePostfix__Group__1 : rule__CSSRulePostfix__Group__1__Impl ;
    public final void rule__CSSRulePostfix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4894:1: ( rule__CSSRulePostfix__Group__1__Impl )
            // InternalCssExtDsl.g:4895:2: rule__CSSRulePostfix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRulePostfix__Group__1"


    // $ANTLR start "rule__CSSRulePostfix__Group__1__Impl"
    // InternalCssExtDsl.g:4901:1: rule__CSSRulePostfix__Group__1__Impl : ( ( rule__CSSRulePostfix__Group_1__0 )? ) ;
    public final void rule__CSSRulePostfix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4905:1: ( ( ( rule__CSSRulePostfix__Group_1__0 )? ) )
            // InternalCssExtDsl.g:4906:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:4906:1: ( ( rule__CSSRulePostfix__Group_1__0 )? )
            // InternalCssExtDsl.g:4907:2: ( rule__CSSRulePostfix__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:4908:2: ( rule__CSSRulePostfix__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=15 && LA57_0<=17)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCssExtDsl.g:4908:3: rule__CSSRulePostfix__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRulePostfix__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRulePostfix__Group__1__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0"
    // InternalCssExtDsl.g:4917:1: rule__CSSRulePostfix__Group_1__0 : rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 ;
    public final void rule__CSSRulePostfix__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4921:1: ( rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1 )
            // InternalCssExtDsl.g:4922:2: rule__CSSRulePostfix__Group_1__0__Impl rule__CSSRulePostfix__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__CSSRulePostfix__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group_1__1();

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__0__Impl"
    // InternalCssExtDsl.g:4929:1: rule__CSSRulePostfix__Group_1__0__Impl : ( () ) ;
    public final void rule__CSSRulePostfix__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4933:1: ( ( () ) )
            // InternalCssExtDsl.g:4934:1: ( () )
            {
            // InternalCssExtDsl.g:4934:1: ( () )
            // InternalCssExtDsl.g:4935:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }
            // InternalCssExtDsl.g:4936:2: ()
            // InternalCssExtDsl.g:4936:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePostfix__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1"
    // InternalCssExtDsl.g:4944:1: rule__CSSRulePostfix__Group_1__1 : rule__CSSRulePostfix__Group_1__1__Impl ;
    public final void rule__CSSRulePostfix__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4948:1: ( rule__CSSRulePostfix__Group_1__1__Impl )
            // InternalCssExtDsl.g:4949:2: rule__CSSRulePostfix__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1"


    // $ANTLR start "rule__CSSRulePostfix__Group_1__1__Impl"
    // InternalCssExtDsl.g:4955:1: rule__CSSRulePostfix__Group_1__1__Impl : ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) ;
    public final void rule__CSSRulePostfix__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4959:1: ( ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) ) )
            // InternalCssExtDsl.g:4960:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            {
            // InternalCssExtDsl.g:4960:1: ( ( rule__CSSRulePostfix__CardinalityAssignment_1_1 ) )
            // InternalCssExtDsl.g:4961:2: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }
            // InternalCssExtDsl.g:4962:2: ( rule__CSSRulePostfix__CardinalityAssignment_1_1 )
            // InternalCssExtDsl.g:4962:3: rule__CSSRulePostfix__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__CardinalityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRulePostfix__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__0"
    // InternalCssExtDsl.g:4971:1: rule__CSSRuleBracket__Group__0 : rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 ;
    public final void rule__CSSRuleBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4975:1: ( rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1 )
            // InternalCssExtDsl.g:4976:2: rule__CSSRuleBracket__Group__0__Impl rule__CSSRuleBracket__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__CSSRuleBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__1();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__0"


    // $ANTLR start "rule__CSSRuleBracket__Group__0__Impl"
    // InternalCssExtDsl.g:4983:1: rule__CSSRuleBracket__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:4987:1: ( ( () ) )
            // InternalCssExtDsl.g:4988:1: ( () )
            {
            // InternalCssExtDsl.g:4988:1: ( () )
            // InternalCssExtDsl.g:4989:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }
            // InternalCssExtDsl.g:4990:2: ()
            // InternalCssExtDsl.g:4990:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleBracket__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__1"
    // InternalCssExtDsl.g:4998:1: rule__CSSRuleBracket__Group__1 : rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 ;
    public final void rule__CSSRuleBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5002:1: ( rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2 )
            // InternalCssExtDsl.g:5003:2: rule__CSSRuleBracket__Group__1__Impl rule__CSSRuleBracket__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__CSSRuleBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__2();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__1"


    // $ANTLR start "rule__CSSRuleBracket__Group__1__Impl"
    // InternalCssExtDsl.g:5010:1: rule__CSSRuleBracket__Group__1__Impl : ( '[' ) ;
    public final void rule__CSSRuleBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5014:1: ( ( '[' ) )
            // InternalCssExtDsl.g:5015:1: ( '[' )
            {
            // InternalCssExtDsl.g:5015:1: ( '[' )
            // InternalCssExtDsl.g:5016:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleBracket__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__2"
    // InternalCssExtDsl.g:5025:1: rule__CSSRuleBracket__Group__2 : rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 ;
    public final void rule__CSSRuleBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5029:1: ( rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3 )
            // InternalCssExtDsl.g:5030:2: rule__CSSRuleBracket__Group__2__Impl rule__CSSRuleBracket__Group__3
            {
            pushFollow(FOLLOW_51);
            rule__CSSRuleBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__3();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__2"


    // $ANTLR start "rule__CSSRuleBracket__Group__2__Impl"
    // InternalCssExtDsl.g:5037:1: rule__CSSRuleBracket__Group__2__Impl : ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) ;
    public final void rule__CSSRuleBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5041:1: ( ( ( rule__CSSRuleBracket__InnerAssignment_2 ) ) )
            // InternalCssExtDsl.g:5042:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5042:1: ( ( rule__CSSRuleBracket__InnerAssignment_2 ) )
            // InternalCssExtDsl.g:5043:2: ( rule__CSSRuleBracket__InnerAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }
            // InternalCssExtDsl.g:5044:2: ( rule__CSSRuleBracket__InnerAssignment_2 )
            // InternalCssExtDsl.g:5044:3: rule__CSSRuleBracket__InnerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__InnerAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerAssignment_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleBracket__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleBracket__Group__3"
    // InternalCssExtDsl.g:5052:1: rule__CSSRuleBracket__Group__3 : rule__CSSRuleBracket__Group__3__Impl ;
    public final void rule__CSSRuleBracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5056:1: ( rule__CSSRuleBracket__Group__3__Impl )
            // InternalCssExtDsl.g:5057:2: rule__CSSRuleBracket__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleBracket__Group__3__Impl();

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
    // $ANTLR end "rule__CSSRuleBracket__Group__3"


    // $ANTLR start "rule__CSSRuleBracket__Group__3__Impl"
    // InternalCssExtDsl.g:5063:1: rule__CSSRuleBracket__Group__3__Impl : ( ']' ) ;
    public final void rule__CSSRuleBracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5067:1: ( ( ']' ) )
            // InternalCssExtDsl.g:5068:1: ( ']' )
            {
            // InternalCssExtDsl.g:5068:1: ( ']' )
            // InternalCssExtDsl.g:5069:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__CSSRuleBracket__Group__3__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0"
    // InternalCssExtDsl.g:5079:1: rule__CSSRulePrimary__Group_6__0 : rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 ;
    public final void rule__CSSRulePrimary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5083:1: ( rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1 )
            // InternalCssExtDsl.g:5084:2: rule__CSSRulePrimary__Group_6__0__Impl rule__CSSRulePrimary__Group_6__1
            {
            pushFollow(FOLLOW_34);
            rule__CSSRulePrimary__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Group_6__1();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__0__Impl"
    // InternalCssExtDsl.g:5091:1: rule__CSSRulePrimary__Group_6__0__Impl : ( () ) ;
    public final void rule__CSSRulePrimary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5095:1: ( ( () ) )
            // InternalCssExtDsl.g:5096:1: ( () )
            {
            // InternalCssExtDsl.g:5096:1: ( () )
            // InternalCssExtDsl.g:5097:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }
            // InternalCssExtDsl.g:5098:2: ()
            // InternalCssExtDsl.g:5098:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRulePrimary__Group_6__0__Impl"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1"
    // InternalCssExtDsl.g:5106:1: rule__CSSRulePrimary__Group_6__1 : rule__CSSRulePrimary__Group_6__1__Impl ;
    public final void rule__CSSRulePrimary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5110:1: ( rule__CSSRulePrimary__Group_6__1__Impl )
            // InternalCssExtDsl.g:5111:2: rule__CSSRulePrimary__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__Group_6__1__Impl();

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1"


    // $ANTLR start "rule__CSSRulePrimary__Group_6__1__Impl"
    // InternalCssExtDsl.g:5117:1: rule__CSSRulePrimary__Group_6__1__Impl : ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) ;
    public final void rule__CSSRulePrimary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5121:1: ( ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) ) )
            // InternalCssExtDsl.g:5122:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            {
            // InternalCssExtDsl.g:5122:1: ( ( rule__CSSRulePrimary__ValueAssignment_6_1 ) )
            // InternalCssExtDsl.g:5123:2: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }
            // InternalCssExtDsl.g:5124:2: ( rule__CSSRulePrimary__ValueAssignment_6_1 )
            // InternalCssExtDsl.g:5124:3: rule__CSSRulePrimary__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePrimary__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueAssignment_6_1()); 
            }

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
    // $ANTLR end "rule__CSSRulePrimary__Group_6__1__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__0"
    // InternalCssExtDsl.g:5133:1: rule__CSSRuleRegex__Group__0 : rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 ;
    public final void rule__CSSRuleRegex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5137:1: ( rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1 )
            // InternalCssExtDsl.g:5138:2: rule__CSSRuleRegex__Group__0__Impl rule__CSSRuleRegex__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__CSSRuleRegex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__1();

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
    // $ANTLR end "rule__CSSRuleRegex__Group__0"


    // $ANTLR start "rule__CSSRuleRegex__Group__0__Impl"
    // InternalCssExtDsl.g:5145:1: rule__CSSRuleRegex__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleRegex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5149:1: ( ( () ) )
            // InternalCssExtDsl.g:5150:1: ( () )
            {
            // InternalCssExtDsl.g:5150:1: ( () )
            // InternalCssExtDsl.g:5151:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }
            // InternalCssExtDsl.g:5152:2: ()
            // InternalCssExtDsl.g:5152:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleRegex__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleRegex__Group__1"
    // InternalCssExtDsl.g:5160:1: rule__CSSRuleRegex__Group__1 : rule__CSSRuleRegex__Group__1__Impl ;
    public final void rule__CSSRuleRegex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5164:1: ( rule__CSSRuleRegex__Group__1__Impl )
            // InternalCssExtDsl.g:5165:2: rule__CSSRuleRegex__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__Group__1__Impl();

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
    // $ANTLR end "rule__CSSRuleRegex__Group__1"


    // $ANTLR start "rule__CSSRuleRegex__Group__1__Impl"
    // InternalCssExtDsl.g:5171:1: rule__CSSRuleRegex__Group__1__Impl : ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) ;
    public final void rule__CSSRuleRegex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5175:1: ( ( ( rule__CSSRuleRegex__RegexAssignment_1 ) ) )
            // InternalCssExtDsl.g:5176:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            {
            // InternalCssExtDsl.g:5176:1: ( ( rule__CSSRuleRegex__RegexAssignment_1 ) )
            // InternalCssExtDsl.g:5177:2: ( rule__CSSRuleRegex__RegexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }
            // InternalCssExtDsl.g:5178:2: ( rule__CSSRuleRegex__RegexAssignment_1 )
            // InternalCssExtDsl.g:5178:3: rule__CSSRuleRegex__RegexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleRegex__RegexAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexAssignment_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleRegex__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0"
    // InternalCssExtDsl.g:5187:1: rule__CSSRuleLiteral__Group__0 : rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 ;
    public final void rule__CSSRuleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5191:1: ( rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1 )
            // InternalCssExtDsl.g:5192:2: rule__CSSRuleLiteral__Group__0__Impl rule__CSSRuleLiteral__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__CSSRuleLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__1();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group__0__Impl"
    // InternalCssExtDsl.g:5199:1: rule__CSSRuleLiteral__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5203:1: ( ( () ) )
            // InternalCssExtDsl.g:5204:1: ( () )
            {
            // InternalCssExtDsl.g:5204:1: ( () )
            // InternalCssExtDsl.g:5205:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }
            // InternalCssExtDsl.g:5206:2: ()
            // InternalCssExtDsl.g:5206:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleLiteral__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1"
    // InternalCssExtDsl.g:5214:1: rule__CSSRuleLiteral__Group__1 : rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2 ;
    public final void rule__CSSRuleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5218:1: ( rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2 )
            // InternalCssExtDsl.g:5219:2: rule__CSSRuleLiteral__Group__1__Impl rule__CSSRuleLiteral__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__CSSRuleLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__2();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group__1__Impl"
    // InternalCssExtDsl.g:5226:1: rule__CSSRuleLiteral__Group__1__Impl : ( ( rule__CSSRuleLiteral__Group_1__0 )? ) ;
    public final void rule__CSSRuleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5230:1: ( ( ( rule__CSSRuleLiteral__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5231:1: ( ( rule__CSSRuleLiteral__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5231:1: ( ( rule__CSSRuleLiteral__Group_1__0 )? )
            // InternalCssExtDsl.g:5232:2: ( rule__CSSRuleLiteral__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5233:2: ( rule__CSSRuleLiteral__Group_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_JDOC) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCssExtDsl.g:5233:3: rule__CSSRuleLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group__2"
    // InternalCssExtDsl.g:5241:1: rule__CSSRuleLiteral__Group__2 : rule__CSSRuleLiteral__Group__2__Impl ;
    public final void rule__CSSRuleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5245:1: ( rule__CSSRuleLiteral__Group__2__Impl )
            // InternalCssExtDsl.g:5246:2: rule__CSSRuleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__2"


    // $ANTLR start "rule__CSSRuleLiteral__Group__2__Impl"
    // InternalCssExtDsl.g:5252:1: rule__CSSRuleLiteral__Group__2__Impl : ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) ) ;
    public final void rule__CSSRuleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5256:1: ( ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) ) )
            // InternalCssExtDsl.g:5257:1: ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5257:1: ( ( rule__CSSRuleLiteral__ValueAssignment_2 ) )
            // InternalCssExtDsl.g:5258:2: ( rule__CSSRuleLiteral__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_2()); 
            }
            // InternalCssExtDsl.g:5259:2: ( rule__CSSRuleLiteral__ValueAssignment_2 )
            // InternalCssExtDsl.g:5259:3: rule__CSSRuleLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueAssignment_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__0"
    // InternalCssExtDsl.g:5268:1: rule__CSSRuleLiteral__Group_1__0 : rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1 ;
    public final void rule__CSSRuleLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5272:1: ( rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1 )
            // InternalCssExtDsl.g:5273:2: rule__CSSRuleLiteral__Group_1__0__Impl rule__CSSRuleLiteral__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSRuleLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__0"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__0__Impl"
    // InternalCssExtDsl.g:5280:1: rule__CSSRuleLiteral__Group_1__0__Impl : ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) ) ;
    public final void rule__CSSRuleLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5284:1: ( ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) ) )
            // InternalCssExtDsl.g:5285:1: ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) )
            {
            // InternalCssExtDsl.g:5285:1: ( ( rule__CSSRuleLiteral__DokuAssignment_1_0 ) )
            // InternalCssExtDsl.g:5286:2: ( rule__CSSRuleLiteral__DokuAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getDokuAssignment_1_0()); 
            }
            // InternalCssExtDsl.g:5287:2: ( rule__CSSRuleLiteral__DokuAssignment_1_0 )
            // InternalCssExtDsl.g:5287:3: rule__CSSRuleLiteral__DokuAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__DokuAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getDokuAssignment_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__1"
    // InternalCssExtDsl.g:5295:1: rule__CSSRuleLiteral__Group_1__1 : rule__CSSRuleLiteral__Group_1__1__Impl ;
    public final void rule__CSSRuleLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5299:1: ( rule__CSSRuleLiteral__Group_1__1__Impl )
            // InternalCssExtDsl.g:5300:2: rule__CSSRuleLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleLiteral__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__1"


    // $ANTLR start "rule__CSSRuleLiteral__Group_1__1__Impl"
    // InternalCssExtDsl.g:5306:1: rule__CSSRuleLiteral__Group_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5310:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:5311:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:5311:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:5312:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
            }
            // InternalCssExtDsl.g:5313:2: ( RULE_WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_WS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCssExtDsl.g:5313:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0"
    // InternalCssExtDsl.g:5322:1: rule__CSSRuleSymbol__Group__0 : rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 ;
    public final void rule__CSSRuleSymbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5326:1: ( rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1 )
            // InternalCssExtDsl.g:5327:2: rule__CSSRuleSymbol__Group__0__Impl rule__CSSRuleSymbol__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__CSSRuleSymbol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__1();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group__0__Impl"
    // InternalCssExtDsl.g:5334:1: rule__CSSRuleSymbol__Group__0__Impl : ( () ) ;
    public final void rule__CSSRuleSymbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5338:1: ( ( () ) )
            // InternalCssExtDsl.g:5339:1: ( () )
            {
            // InternalCssExtDsl.g:5339:1: ( () )
            // InternalCssExtDsl.g:5340:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }
            // InternalCssExtDsl.g:5341:2: ()
            // InternalCssExtDsl.g:5341:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSRuleSymbol__Group__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1"
    // InternalCssExtDsl.g:5349:1: rule__CSSRuleSymbol__Group__1 : rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2 ;
    public final void rule__CSSRuleSymbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5353:1: ( rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2 )
            // InternalCssExtDsl.g:5354:2: rule__CSSRuleSymbol__Group__1__Impl rule__CSSRuleSymbol__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__CSSRuleSymbol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__2();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group__1__Impl"
    // InternalCssExtDsl.g:5361:1: rule__CSSRuleSymbol__Group__1__Impl : ( ( rule__CSSRuleSymbol__Group_1__0 )? ) ;
    public final void rule__CSSRuleSymbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5365:1: ( ( ( rule__CSSRuleSymbol__Group_1__0 )? ) )
            // InternalCssExtDsl.g:5366:1: ( ( rule__CSSRuleSymbol__Group_1__0 )? )
            {
            // InternalCssExtDsl.g:5366:1: ( ( rule__CSSRuleSymbol__Group_1__0 )? )
            // InternalCssExtDsl.g:5367:2: ( rule__CSSRuleSymbol__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getGroup_1()); 
            }
            // InternalCssExtDsl.g:5368:2: ( rule__CSSRuleSymbol__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_JDOC) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCssExtDsl.g:5368:3: rule__CSSRuleSymbol__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CSSRuleSymbol__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__1__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group__2"
    // InternalCssExtDsl.g:5376:1: rule__CSSRuleSymbol__Group__2 : rule__CSSRuleSymbol__Group__2__Impl ;
    public final void rule__CSSRuleSymbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5380:1: ( rule__CSSRuleSymbol__Group__2__Impl )
            // InternalCssExtDsl.g:5381:2: rule__CSSRuleSymbol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group__2__Impl();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__2"


    // $ANTLR start "rule__CSSRuleSymbol__Group__2__Impl"
    // InternalCssExtDsl.g:5387:1: rule__CSSRuleSymbol__Group__2__Impl : ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) ) ;
    public final void rule__CSSRuleSymbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5391:1: ( ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) ) )
            // InternalCssExtDsl.g:5392:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5392:1: ( ( rule__CSSRuleSymbol__SymbolAssignment_2 ) )
            // InternalCssExtDsl.g:5393:2: ( rule__CSSRuleSymbol__SymbolAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_2()); 
            }
            // InternalCssExtDsl.g:5394:2: ( rule__CSSRuleSymbol__SymbolAssignment_2 )
            // InternalCssExtDsl.g:5394:3: rule__CSSRuleSymbol__SymbolAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__SymbolAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAssignment_2()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__Group__2__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__0"
    // InternalCssExtDsl.g:5403:1: rule__CSSRuleSymbol__Group_1__0 : rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1 ;
    public final void rule__CSSRuleSymbol__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5407:1: ( rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1 )
            // InternalCssExtDsl.g:5408:2: rule__CSSRuleSymbol__Group_1__0__Impl rule__CSSRuleSymbol__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CSSRuleSymbol__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group_1__1();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__0"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__0__Impl"
    // InternalCssExtDsl.g:5415:1: rule__CSSRuleSymbol__Group_1__0__Impl : ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) ) ;
    public final void rule__CSSRuleSymbol__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5419:1: ( ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) ) )
            // InternalCssExtDsl.g:5420:1: ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) )
            {
            // InternalCssExtDsl.g:5420:1: ( ( rule__CSSRuleSymbol__DokuAssignment_1_0 ) )
            // InternalCssExtDsl.g:5421:2: ( rule__CSSRuleSymbol__DokuAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getDokuAssignment_1_0()); 
            }
            // InternalCssExtDsl.g:5422:2: ( rule__CSSRuleSymbol__DokuAssignment_1_0 )
            // InternalCssExtDsl.g:5422:3: rule__CSSRuleSymbol__DokuAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__DokuAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getDokuAssignment_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__0__Impl"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__1"
    // InternalCssExtDsl.g:5430:1: rule__CSSRuleSymbol__Group_1__1 : rule__CSSRuleSymbol__Group_1__1__Impl ;
    public final void rule__CSSRuleSymbol__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5434:1: ( rule__CSSRuleSymbol__Group_1__1__Impl )
            // InternalCssExtDsl.g:5435:2: rule__CSSRuleSymbol__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__Group_1__1__Impl();

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
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__1"


    // $ANTLR start "rule__CSSRuleSymbol__Group_1__1__Impl"
    // InternalCssExtDsl.g:5441:1: rule__CSSRuleSymbol__Group_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__CSSRuleSymbol__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5445:1: ( ( ( RULE_WS )* ) )
            // InternalCssExtDsl.g:5446:1: ( ( RULE_WS )* )
            {
            // InternalCssExtDsl.g:5446:1: ( ( RULE_WS )* )
            // InternalCssExtDsl.g:5447:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1()); 
            }
            // InternalCssExtDsl.g:5448:2: ( RULE_WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_WS) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalCssExtDsl.g:5448:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_15); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__Group_1__1__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0"
    // InternalCssExtDsl.g:5457:1: rule__CSSDefaultValue__Group_0__0 : rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 ;
    public final void rule__CSSDefaultValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5461:1: ( rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1 )
            // InternalCssExtDsl.g:5462:2: rule__CSSDefaultValue__Group_0__0__Impl rule__CSSDefaultValue__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__CSSDefaultValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Group_0__1();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__0__Impl"
    // InternalCssExtDsl.g:5469:1: rule__CSSDefaultValue__Group_0__0__Impl : ( () ) ;
    public final void rule__CSSDefaultValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5473:1: ( ( () ) )
            // InternalCssExtDsl.g:5474:1: ( () )
            {
            // InternalCssExtDsl.g:5474:1: ( () )
            // InternalCssExtDsl.g:5475:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }
            // InternalCssExtDsl.g:5476:2: ()
            // InternalCssExtDsl.g:5476:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSDefaultValue__Group_0__0__Impl"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1"
    // InternalCssExtDsl.g:5484:1: rule__CSSDefaultValue__Group_0__1 : rule__CSSDefaultValue__Group_0__1__Impl ;
    public final void rule__CSSDefaultValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5488:1: ( rule__CSSDefaultValue__Group_0__1__Impl )
            // InternalCssExtDsl.g:5489:2: rule__CSSDefaultValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1"


    // $ANTLR start "rule__CSSDefaultValue__Group_0__1__Impl"
    // InternalCssExtDsl.g:5495:1: rule__CSSDefaultValue__Group_0__1__Impl : ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) ;
    public final void rule__CSSDefaultValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5499:1: ( ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) ) )
            // InternalCssExtDsl.g:5500:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            {
            // InternalCssExtDsl.g:5500:1: ( ( rule__CSSDefaultValue__ValAssignment_0_1 ) )
            // InternalCssExtDsl.g:5501:2: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }
            // InternalCssExtDsl.g:5502:2: ( rule__CSSDefaultValue__ValAssignment_0_1 )
            // InternalCssExtDsl.g:5502:3: rule__CSSDefaultValue__ValAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CSSDefaultValue__ValAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__CSSDefaultValue__Group_0__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__0"
    // InternalCssExtDsl.g:5511:1: rule__SubstructureSelector__Group__0 : rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1 ;
    public final void rule__SubstructureSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5515:1: ( rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1 )
            // InternalCssExtDsl.g:5516:2: rule__SubstructureSelector__Group__0__Impl rule__SubstructureSelector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SubstructureSelector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__1();

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
    // $ANTLR end "rule__SubstructureSelector__Group__0"


    // $ANTLR start "rule__SubstructureSelector__Group__0__Impl"
    // InternalCssExtDsl.g:5523:1: rule__SubstructureSelector__Group__0__Impl : ( () ) ;
    public final void rule__SubstructureSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5527:1: ( ( () ) )
            // InternalCssExtDsl.g:5528:1: ( () )
            {
            // InternalCssExtDsl.g:5528:1: ( () )
            // InternalCssExtDsl.g:5529:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0()); 
            }
            // InternalCssExtDsl.g:5530:2: ()
            // InternalCssExtDsl.g:5530:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstructureSelector__Group__0__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__1"
    // InternalCssExtDsl.g:5538:1: rule__SubstructureSelector__Group__1 : rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2 ;
    public final void rule__SubstructureSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5542:1: ( rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2 )
            // InternalCssExtDsl.g:5543:2: rule__SubstructureSelector__Group__1__Impl rule__SubstructureSelector__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__SubstructureSelector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__2();

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
    // $ANTLR end "rule__SubstructureSelector__Group__1"


    // $ANTLR start "rule__SubstructureSelector__Group__1__Impl"
    // InternalCssExtDsl.g:5550:1: rule__SubstructureSelector__Group__1__Impl : ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) ) ;
    public final void rule__SubstructureSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5554:1: ( ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) ) )
            // InternalCssExtDsl.g:5555:1: ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) )
            {
            // InternalCssExtDsl.g:5555:1: ( ( rule__SubstructureSelector__SelectorNameAssignment_1 ) )
            // InternalCssExtDsl.g:5556:2: ( rule__SubstructureSelector__SelectorNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSelectorNameAssignment_1()); 
            }
            // InternalCssExtDsl.g:5557:2: ( rule__SubstructureSelector__SelectorNameAssignment_1 )
            // InternalCssExtDsl.g:5557:3: rule__SubstructureSelector__SelectorNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__SelectorNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSelectorNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__Group__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group__2"
    // InternalCssExtDsl.g:5565:1: rule__SubstructureSelector__Group__2 : rule__SubstructureSelector__Group__2__Impl ;
    public final void rule__SubstructureSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5569:1: ( rule__SubstructureSelector__Group__2__Impl )
            // InternalCssExtDsl.g:5570:2: rule__SubstructureSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group__2__Impl();

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
    // $ANTLR end "rule__SubstructureSelector__Group__2"


    // $ANTLR start "rule__SubstructureSelector__Group__2__Impl"
    // InternalCssExtDsl.g:5576:1: rule__SubstructureSelector__Group__2__Impl : ( ( rule__SubstructureSelector__Group_2__0 )? ) ;
    public final void rule__SubstructureSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5580:1: ( ( ( rule__SubstructureSelector__Group_2__0 )? ) )
            // InternalCssExtDsl.g:5581:1: ( ( rule__SubstructureSelector__Group_2__0 )? )
            {
            // InternalCssExtDsl.g:5581:1: ( ( rule__SubstructureSelector__Group_2__0 )? )
            // InternalCssExtDsl.g:5582:2: ( rule__SubstructureSelector__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getGroup_2()); 
            }
            // InternalCssExtDsl.g:5583:2: ( rule__SubstructureSelector__Group_2__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==39) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCssExtDsl.g:5583:3: rule__SubstructureSelector__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureSelector__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__Group__2__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__0"
    // InternalCssExtDsl.g:5592:1: rule__SubstructureSelector__Group_2__0 : rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1 ;
    public final void rule__SubstructureSelector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5596:1: ( rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1 )
            // InternalCssExtDsl.g:5597:2: rule__SubstructureSelector__Group_2__0__Impl rule__SubstructureSelector__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SubstructureSelector__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__1();

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__0"


    // $ANTLR start "rule__SubstructureSelector__Group_2__0__Impl"
    // InternalCssExtDsl.g:5604:1: rule__SubstructureSelector__Group_2__0__Impl : ( '[' ) ;
    public final void rule__SubstructureSelector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5608:1: ( ( '[' ) )
            // InternalCssExtDsl.g:5609:1: ( '[' )
            {
            // InternalCssExtDsl.g:5609:1: ( '[' )
            // InternalCssExtDsl.g:5610:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__0__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__1"
    // InternalCssExtDsl.g:5619:1: rule__SubstructureSelector__Group_2__1 : rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2 ;
    public final void rule__SubstructureSelector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5623:1: ( rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2 )
            // InternalCssExtDsl.g:5624:2: rule__SubstructureSelector__Group_2__1__Impl rule__SubstructureSelector__Group_2__2
            {
            pushFollow(FOLLOW_51);
            rule__SubstructureSelector__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__2();

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__1"


    // $ANTLR start "rule__SubstructureSelector__Group_2__1__Impl"
    // InternalCssExtDsl.g:5631:1: rule__SubstructureSelector__Group_2__1__Impl : ( ( rule__SubstructureSelector__VarAssignment_2_1 ) ) ;
    public final void rule__SubstructureSelector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5635:1: ( ( ( rule__SubstructureSelector__VarAssignment_2_1 ) ) )
            // InternalCssExtDsl.g:5636:1: ( ( rule__SubstructureSelector__VarAssignment_2_1 ) )
            {
            // InternalCssExtDsl.g:5636:1: ( ( rule__SubstructureSelector__VarAssignment_2_1 ) )
            // InternalCssExtDsl.g:5637:2: ( rule__SubstructureSelector__VarAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getVarAssignment_2_1()); 
            }
            // InternalCssExtDsl.g:5638:2: ( rule__SubstructureSelector__VarAssignment_2_1 )
            // InternalCssExtDsl.g:5638:3: rule__SubstructureSelector__VarAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__VarAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getVarAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__1__Impl"


    // $ANTLR start "rule__SubstructureSelector__Group_2__2"
    // InternalCssExtDsl.g:5646:1: rule__SubstructureSelector__Group_2__2 : rule__SubstructureSelector__Group_2__2__Impl ;
    public final void rule__SubstructureSelector__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5650:1: ( rule__SubstructureSelector__Group_2__2__Impl )
            // InternalCssExtDsl.g:5651:2: rule__SubstructureSelector__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureSelector__Group_2__2__Impl();

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__2"


    // $ANTLR start "rule__SubstructureSelector__Group_2__2__Impl"
    // InternalCssExtDsl.g:5657:1: rule__SubstructureSelector__Group_2__2__Impl : ( ']' ) ;
    public final void rule__SubstructureSelector__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5661:1: ( ( ']' ) )
            // InternalCssExtDsl.g:5662:1: ( ']' )
            {
            // InternalCssExtDsl.g:5662:1: ( ']' )
            // InternalCssExtDsl.g:5663:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__Group_2__2__Impl"


    // $ANTLR start "rule__Substructure__Group__0"
    // InternalCssExtDsl.g:5673:1: rule__Substructure__Group__0 : rule__Substructure__Group__0__Impl rule__Substructure__Group__1 ;
    public final void rule__Substructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5677:1: ( rule__Substructure__Group__0__Impl rule__Substructure__Group__1 )
            // InternalCssExtDsl.g:5678:2: rule__Substructure__Group__0__Impl rule__Substructure__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__Substructure__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__1();

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
    // $ANTLR end "rule__Substructure__Group__0"


    // $ANTLR start "rule__Substructure__Group__0__Impl"
    // InternalCssExtDsl.g:5685:1: rule__Substructure__Group__0__Impl : ( ( rule__Substructure__DokuAssignment_0 )? ) ;
    public final void rule__Substructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5689:1: ( ( ( rule__Substructure__DokuAssignment_0 )? ) )
            // InternalCssExtDsl.g:5690:1: ( ( rule__Substructure__DokuAssignment_0 )? )
            {
            // InternalCssExtDsl.g:5690:1: ( ( rule__Substructure__DokuAssignment_0 )? )
            // InternalCssExtDsl.g:5691:2: ( rule__Substructure__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getDokuAssignment_0()); 
            }
            // InternalCssExtDsl.g:5692:2: ( rule__Substructure__DokuAssignment_0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_JDOC) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCssExtDsl.g:5692:3: rule__Substructure__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Substructure__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getDokuAssignment_0()); 
            }

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
    // $ANTLR end "rule__Substructure__Group__0__Impl"


    // $ANTLR start "rule__Substructure__Group__1"
    // InternalCssExtDsl.g:5700:1: rule__Substructure__Group__1 : rule__Substructure__Group__1__Impl rule__Substructure__Group__2 ;
    public final void rule__Substructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5704:1: ( rule__Substructure__Group__1__Impl rule__Substructure__Group__2 )
            // InternalCssExtDsl.g:5705:2: rule__Substructure__Group__1__Impl rule__Substructure__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Substructure__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__2();

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
    // $ANTLR end "rule__Substructure__Group__1"


    // $ANTLR start "rule__Substructure__Group__1__Impl"
    // InternalCssExtDsl.g:5712:1: rule__Substructure__Group__1__Impl : ( 'substructure' ) ;
    public final void rule__Substructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5716:1: ( ( 'substructure' ) )
            // InternalCssExtDsl.g:5717:1: ( 'substructure' )
            {
            // InternalCssExtDsl.g:5717:1: ( 'substructure' )
            // InternalCssExtDsl.g:5718:2: 'substructure'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getSubstructureKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getSubstructureKeyword_1()); 
            }

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
    // $ANTLR end "rule__Substructure__Group__1__Impl"


    // $ANTLR start "rule__Substructure__Group__2"
    // InternalCssExtDsl.g:5727:1: rule__Substructure__Group__2 : rule__Substructure__Group__2__Impl rule__Substructure__Group__3 ;
    public final void rule__Substructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5731:1: ( rule__Substructure__Group__2__Impl rule__Substructure__Group__3 )
            // InternalCssExtDsl.g:5732:2: rule__Substructure__Group__2__Impl rule__Substructure__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Substructure__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__3();

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
    // $ANTLR end "rule__Substructure__Group__2"


    // $ANTLR start "rule__Substructure__Group__2__Impl"
    // InternalCssExtDsl.g:5739:1: rule__Substructure__Group__2__Impl : ( ( rule__Substructure__NameAssignment_2 ) ) ;
    public final void rule__Substructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5743:1: ( ( ( rule__Substructure__NameAssignment_2 ) ) )
            // InternalCssExtDsl.g:5744:1: ( ( rule__Substructure__NameAssignment_2 ) )
            {
            // InternalCssExtDsl.g:5744:1: ( ( rule__Substructure__NameAssignment_2 ) )
            // InternalCssExtDsl.g:5745:2: ( rule__Substructure__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getNameAssignment_2()); 
            }
            // InternalCssExtDsl.g:5746:2: ( rule__Substructure__NameAssignment_2 )
            // InternalCssExtDsl.g:5746:3: rule__Substructure__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Substructure__Group__2__Impl"


    // $ANTLR start "rule__Substructure__Group__3"
    // InternalCssExtDsl.g:5754:1: rule__Substructure__Group__3 : rule__Substructure__Group__3__Impl rule__Substructure__Group__4 ;
    public final void rule__Substructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5758:1: ( rule__Substructure__Group__3__Impl rule__Substructure__Group__4 )
            // InternalCssExtDsl.g:5759:2: rule__Substructure__Group__3__Impl rule__Substructure__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Substructure__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__4();

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
    // $ANTLR end "rule__Substructure__Group__3"


    // $ANTLR start "rule__Substructure__Group__3__Impl"
    // InternalCssExtDsl.g:5766:1: rule__Substructure__Group__3__Impl : ( '{' ) ;
    public final void rule__Substructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5770:1: ( ( '{' ) )
            // InternalCssExtDsl.g:5771:1: ( '{' )
            {
            // InternalCssExtDsl.g:5771:1: ( '{' )
            // InternalCssExtDsl.g:5772:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__Substructure__Group__3__Impl"


    // $ANTLR start "rule__Substructure__Group__4"
    // InternalCssExtDsl.g:5781:1: rule__Substructure__Group__4 : rule__Substructure__Group__4__Impl rule__Substructure__Group__5 ;
    public final void rule__Substructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5785:1: ( rule__Substructure__Group__4__Impl rule__Substructure__Group__5 )
            // InternalCssExtDsl.g:5786:2: rule__Substructure__Group__4__Impl rule__Substructure__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__Substructure__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__5();

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
    // $ANTLR end "rule__Substructure__Group__4"


    // $ANTLR start "rule__Substructure__Group__4__Impl"
    // InternalCssExtDsl.g:5793:1: rule__Substructure__Group__4__Impl : ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) ) ;
    public final void rule__Substructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5797:1: ( ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) ) )
            // InternalCssExtDsl.g:5798:1: ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) )
            {
            // InternalCssExtDsl.g:5798:1: ( ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* ) )
            // InternalCssExtDsl.g:5799:2: ( ( rule__Substructure__ChildsAssignment_4 ) ) ( ( rule__Substructure__ChildsAssignment_4 )* )
            {
            // InternalCssExtDsl.g:5799:2: ( ( rule__Substructure__ChildsAssignment_4 ) )
            // InternalCssExtDsl.g:5800:3: ( rule__Substructure__ChildsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }
            // InternalCssExtDsl.g:5801:3: ( rule__Substructure__ChildsAssignment_4 )
            // InternalCssExtDsl.g:5801:4: rule__Substructure__ChildsAssignment_4
            {
            pushFollow(FOLLOW_56);
            rule__Substructure__ChildsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }

            }

            // InternalCssExtDsl.g:5804:2: ( ( rule__Substructure__ChildsAssignment_4 )* )
            // InternalCssExtDsl.g:5805:3: ( rule__Substructure__ChildsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
            }
            // InternalCssExtDsl.g:5806:3: ( rule__Substructure__ChildsAssignment_4 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID||LA64_0==RULE_JDOC) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalCssExtDsl.g:5806:4: rule__Substructure__ChildsAssignment_4
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__Substructure__ChildsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsAssignment_4()); 
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
    // $ANTLR end "rule__Substructure__Group__4__Impl"


    // $ANTLR start "rule__Substructure__Group__5"
    // InternalCssExtDsl.g:5815:1: rule__Substructure__Group__5 : rule__Substructure__Group__5__Impl ;
    public final void rule__Substructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5819:1: ( rule__Substructure__Group__5__Impl )
            // InternalCssExtDsl.g:5820:2: rule__Substructure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substructure__Group__5__Impl();

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
    // $ANTLR end "rule__Substructure__Group__5"


    // $ANTLR start "rule__Substructure__Group__5__Impl"
    // InternalCssExtDsl.g:5826:1: rule__Substructure__Group__5__Impl : ( '}' ) ;
    public final void rule__Substructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5830:1: ( ( '}' ) )
            // InternalCssExtDsl.g:5831:1: ( '}' )
            {
            // InternalCssExtDsl.g:5831:1: ( '}' )
            // InternalCssExtDsl.g:5832:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5()); 
            }

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
    // $ANTLR end "rule__Substructure__Group__5__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__0"
    // InternalCssExtDsl.g:5842:1: rule__SubstructureStyleclass__Group__0 : rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1 ;
    public final void rule__SubstructureStyleclass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5846:1: ( rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1 )
            // InternalCssExtDsl.g:5847:2: rule__SubstructureStyleclass__Group__0__Impl rule__SubstructureStyleclass__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__SubstructureStyleclass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__1();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__0"


    // $ANTLR start "rule__SubstructureStyleclass__Group__0__Impl"
    // InternalCssExtDsl.g:5854:1: rule__SubstructureStyleclass__Group__0__Impl : ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? ) ;
    public final void rule__SubstructureStyleclass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5858:1: ( ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? ) )
            // InternalCssExtDsl.g:5859:1: ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? )
            {
            // InternalCssExtDsl.g:5859:1: ( ( rule__SubstructureStyleclass__DokuAssignment_0 )? )
            // InternalCssExtDsl.g:5860:2: ( rule__SubstructureStyleclass__DokuAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getDokuAssignment_0()); 
            }
            // InternalCssExtDsl.g:5861:2: ( rule__SubstructureStyleclass__DokuAssignment_0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_JDOC) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCssExtDsl.g:5861:3: rule__SubstructureStyleclass__DokuAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureStyleclass__DokuAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getDokuAssignment_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__0__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__1"
    // InternalCssExtDsl.g:5869:1: rule__SubstructureStyleclass__Group__1 : rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2 ;
    public final void rule__SubstructureStyleclass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5873:1: ( rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2 )
            // InternalCssExtDsl.g:5874:2: rule__SubstructureStyleclass__Group__1__Impl rule__SubstructureStyleclass__Group__2
            {
            pushFollow(FOLLOW_57);
            rule__SubstructureStyleclass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__2();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__1"


    // $ANTLR start "rule__SubstructureStyleclass__Group__1__Impl"
    // InternalCssExtDsl.g:5881:1: rule__SubstructureStyleclass__Group__1__Impl : ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) ) ;
    public final void rule__SubstructureStyleclass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5885:1: ( ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) ) )
            // InternalCssExtDsl.g:5886:1: ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) )
            {
            // InternalCssExtDsl.g:5886:1: ( ( rule__SubstructureStyleclass__ElementAssignment_1 ) )
            // InternalCssExtDsl.g:5887:2: ( rule__SubstructureStyleclass__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementAssignment_1()); 
            }
            // InternalCssExtDsl.g:5888:2: ( rule__SubstructureStyleclass__ElementAssignment_1 )
            // InternalCssExtDsl.g:5888:3: rule__SubstructureStyleclass__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__ElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementAssignment_1()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__1__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__2"
    // InternalCssExtDsl.g:5896:1: rule__SubstructureStyleclass__Group__2 : rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3 ;
    public final void rule__SubstructureStyleclass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5900:1: ( rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3 )
            // InternalCssExtDsl.g:5901:2: rule__SubstructureStyleclass__Group__2__Impl rule__SubstructureStyleclass__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SubstructureStyleclass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__3();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__2"


    // $ANTLR start "rule__SubstructureStyleclass__Group__2__Impl"
    // InternalCssExtDsl.g:5908:1: rule__SubstructureStyleclass__Group__2__Impl : ( 'styleclass' ) ;
    public final void rule__SubstructureStyleclass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5912:1: ( ( 'styleclass' ) )
            // InternalCssExtDsl.g:5913:1: ( 'styleclass' )
            {
            // InternalCssExtDsl.g:5913:1: ( 'styleclass' )
            // InternalCssExtDsl.g:5914:2: 'styleclass'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__2__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__3"
    // InternalCssExtDsl.g:5923:1: rule__SubstructureStyleclass__Group__3 : rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4 ;
    public final void rule__SubstructureStyleclass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5927:1: ( rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4 )
            // InternalCssExtDsl.g:5928:2: rule__SubstructureStyleclass__Group__3__Impl rule__SubstructureStyleclass__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__SubstructureStyleclass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__4();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__3"


    // $ANTLR start "rule__SubstructureStyleclass__Group__3__Impl"
    // InternalCssExtDsl.g:5935:1: rule__SubstructureStyleclass__Group__3__Impl : ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) ) ;
    public final void rule__SubstructureStyleclass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5939:1: ( ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) ) )
            // InternalCssExtDsl.g:5940:1: ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) )
            {
            // InternalCssExtDsl.g:5940:1: ( ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* ) )
            // InternalCssExtDsl.g:5941:2: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) ) ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* )
            {
            // InternalCssExtDsl.g:5941:2: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 ) )
            // InternalCssExtDsl.g:5942:3: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }
            // InternalCssExtDsl.g:5943:3: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )
            // InternalCssExtDsl.g:5943:4: rule__SubstructureStyleclass__SelectorsAssignment_3
            {
            pushFollow(FOLLOW_58);
            rule__SubstructureStyleclass__SelectorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }

            }

            // InternalCssExtDsl.g:5946:2: ( ( rule__SubstructureStyleclass__SelectorsAssignment_3 )* )
            // InternalCssExtDsl.g:5947:3: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
            }
            // InternalCssExtDsl.g:5948:3: ( rule__SubstructureStyleclass__SelectorsAssignment_3 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    int LA66_2 = input.LA(2);

                    if ( (LA66_2==EOF||LA66_2==RULE_ID||LA66_2==RULE_JDOC||(LA66_2>=24 && LA66_2<=25)||LA66_2==39) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // InternalCssExtDsl.g:5948:4: rule__SubstructureStyleclass__SelectorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__SubstructureStyleclass__SelectorsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsAssignment_3()); 
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
    // $ANTLR end "rule__SubstructureStyleclass__Group__3__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group__4"
    // InternalCssExtDsl.g:5957:1: rule__SubstructureStyleclass__Group__4 : rule__SubstructureStyleclass__Group__4__Impl ;
    public final void rule__SubstructureStyleclass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5961:1: ( rule__SubstructureStyleclass__Group__4__Impl )
            // InternalCssExtDsl.g:5962:2: rule__SubstructureStyleclass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group__4__Impl();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__4"


    // $ANTLR start "rule__SubstructureStyleclass__Group__4__Impl"
    // InternalCssExtDsl.g:5968:1: rule__SubstructureStyleclass__Group__4__Impl : ( ( rule__SubstructureStyleclass__Group_4__0 )? ) ;
    public final void rule__SubstructureStyleclass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5972:1: ( ( ( rule__SubstructureStyleclass__Group_4__0 )? ) )
            // InternalCssExtDsl.g:5973:1: ( ( rule__SubstructureStyleclass__Group_4__0 )? )
            {
            // InternalCssExtDsl.g:5973:1: ( ( rule__SubstructureStyleclass__Group_4__0 )? )
            // InternalCssExtDsl.g:5974:2: ( rule__SubstructureStyleclass__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getGroup_4()); 
            }
            // InternalCssExtDsl.g:5975:2: ( rule__SubstructureStyleclass__Group_4__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCssExtDsl.g:5975:3: rule__SubstructureStyleclass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstructureStyleclass__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group__4__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__0"
    // InternalCssExtDsl.g:5984:1: rule__SubstructureStyleclass__Group_4__0 : rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1 ;
    public final void rule__SubstructureStyleclass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:5988:1: ( rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1 )
            // InternalCssExtDsl.g:5989:2: rule__SubstructureStyleclass__Group_4__0__Impl rule__SubstructureStyleclass__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__SubstructureStyleclass__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__1();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__0"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__0__Impl"
    // InternalCssExtDsl.g:5996:1: rule__SubstructureStyleclass__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SubstructureStyleclass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6000:1: ( ( '{' ) )
            // InternalCssExtDsl.g:6001:1: ( '{' )
            {
            // InternalCssExtDsl.g:6001:1: ( '{' )
            // InternalCssExtDsl.g:6002:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__0__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__1"
    // InternalCssExtDsl.g:6011:1: rule__SubstructureStyleclass__Group_4__1 : rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2 ;
    public final void rule__SubstructureStyleclass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6015:1: ( rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2 )
            // InternalCssExtDsl.g:6016:2: rule__SubstructureStyleclass__Group_4__1__Impl rule__SubstructureStyleclass__Group_4__2
            {
            pushFollow(FOLLOW_55);
            rule__SubstructureStyleclass__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__2();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__1"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__1__Impl"
    // InternalCssExtDsl.g:6023:1: rule__SubstructureStyleclass__Group_4__1__Impl : ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) ) ;
    public final void rule__SubstructureStyleclass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6027:1: ( ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) ) )
            // InternalCssExtDsl.g:6028:1: ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) )
            {
            // InternalCssExtDsl.g:6028:1: ( ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* ) )
            // InternalCssExtDsl.g:6029:2: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) ) ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* )
            {
            // InternalCssExtDsl.g:6029:2: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 ) )
            // InternalCssExtDsl.g:6030:3: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:6031:3: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )
            // InternalCssExtDsl.g:6031:4: rule__SubstructureStyleclass__ChildsAssignment_4_1
            {
            pushFollow(FOLLOW_56);
            rule__SubstructureStyleclass__ChildsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }

            }

            // InternalCssExtDsl.g:6034:2: ( ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )* )
            // InternalCssExtDsl.g:6035:3: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
            }
            // InternalCssExtDsl.g:6036:3: ( rule__SubstructureStyleclass__ChildsAssignment_4_1 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID||LA68_0==RULE_JDOC) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalCssExtDsl.g:6036:4: rule__SubstructureStyleclass__ChildsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__SubstructureStyleclass__ChildsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsAssignment_4_1()); 
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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__1__Impl"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__2"
    // InternalCssExtDsl.g:6045:1: rule__SubstructureStyleclass__Group_4__2 : rule__SubstructureStyleclass__Group_4__2__Impl ;
    public final void rule__SubstructureStyleclass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6049:1: ( rule__SubstructureStyleclass__Group_4__2__Impl )
            // InternalCssExtDsl.g:6050:2: rule__SubstructureStyleclass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstructureStyleclass__Group_4__2__Impl();

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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__2"


    // $ANTLR start "rule__SubstructureStyleclass__Group_4__2__Impl"
    // InternalCssExtDsl.g:6056:1: rule__SubstructureStyleclass__Group_4__2__Impl : ( '}' ) ;
    public final void rule__SubstructureStyleclass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6060:1: ( ( '}' ) )
            // InternalCssExtDsl.g:6061:1: ( '}' )
            {
            // InternalCssExtDsl.g:6061:1: ( '}' )
            // InternalCssExtDsl.g:6062:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__Group_4__2__Impl"


    // $ANTLR start "rule__CssExtension__NamespaceAssignment_1"
    // InternalCssExtDsl.g:6072:1: rule__CssExtension__NamespaceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CssExtension__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6076:1: ( ( RULE_STRING ) )
            // InternalCssExtDsl.g:6077:2: ( RULE_STRING )
            {
            // InternalCssExtDsl.g:6077:2: ( RULE_STRING )
            // InternalCssExtDsl.g:6078:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getNamespaceSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getNamespaceSTRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CssExtension__NamespaceAssignment_1"


    // $ANTLR start "rule__CssExtension__ImportsAssignment_2"
    // InternalCssExtDsl.g:6087:1: rule__CssExtension__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__CssExtension__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6091:1: ( ( ruleImport ) )
            // InternalCssExtDsl.g:6092:2: ( ruleImport )
            {
            // InternalCssExtDsl.g:6092:2: ( ruleImport )
            // InternalCssExtDsl.g:6093:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CssExtension__ImportsAssignment_2"


    // $ANTLR start "rule__CssExtension__PackageDefAssignment_3"
    // InternalCssExtDsl.g:6102:1: rule__CssExtension__PackageDefAssignment_3 : ( rulePackageDefinition ) ;
    public final void rule__CssExtension__PackageDefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6106:1: ( ( rulePackageDefinition ) )
            // InternalCssExtDsl.g:6107:2: ( rulePackageDefinition )
            {
            // InternalCssExtDsl.g:6107:2: ( rulePackageDefinition )
            // InternalCssExtDsl.g:6108:3: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__CssExtension__PackageDefAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalCssExtDsl.g:6117:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6121:1: ( ( ruleQualifiedNameWithWildCard ) )
            // InternalCssExtDsl.g:6122:2: ( ruleQualifiedNameWithWildCard )
            {
            // InternalCssExtDsl.g:6122:2: ( ruleQualifiedNameWithWildCard )
            // InternalCssExtDsl.g:6123:3: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDefinition__DokuAssignment_0_0"
    // InternalCssExtDsl.g:6132:1: rule__PackageDefinition__DokuAssignment_0_0 : ( ruleDoku ) ;
    public final void rule__PackageDefinition__DokuAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6136:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6137:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6137:2: ( ruleDoku )
            // InternalCssExtDsl.g:6138:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__DokuAssignment_0_0"


    // $ANTLR start "rule__PackageDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6147:1: rule__PackageDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PackageDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6151:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6152:2: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:6152:2: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6153:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__NameAssignment_2"


    // $ANTLR start "rule__PackageDefinition__RulesAssignment_4_0"
    // InternalCssExtDsl.g:6162:1: rule__PackageDefinition__RulesAssignment_4_0 : ( ruleCSSRuleDefinition ) ;
    public final void rule__PackageDefinition__RulesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6166:1: ( ( ruleCSSRuleDefinition ) )
            // InternalCssExtDsl.g:6167:2: ( ruleCSSRuleDefinition )
            {
            // InternalCssExtDsl.g:6167:2: ( ruleCSSRuleDefinition )
            // InternalCssExtDsl.g:6168:3: ruleCSSRuleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__RulesAssignment_4_0"


    // $ANTLR start "rule__PackageDefinition__SubpackagesAssignment_4_1"
    // InternalCssExtDsl.g:6177:1: rule__PackageDefinition__SubpackagesAssignment_4_1 : ( rulePackageDefinition ) ;
    public final void rule__PackageDefinition__SubpackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6181:1: ( ( rulePackageDefinition ) )
            // InternalCssExtDsl.g:6182:2: ( rulePackageDefinition )
            {
            // InternalCssExtDsl.g:6182:2: ( rulePackageDefinition )
            // InternalCssExtDsl.g:6183:3: rulePackageDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__SubpackagesAssignment_4_1"


    // $ANTLR start "rule__PackageDefinition__ElementsAssignment_4_2"
    // InternalCssExtDsl.g:6192:1: rule__PackageDefinition__ElementsAssignment_4_2 : ( ruleElementDefinition ) ;
    public final void rule__PackageDefinition__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6196:1: ( ( ruleElementDefinition ) )
            // InternalCssExtDsl.g:6197:2: ( ruleElementDefinition )
            {
            // InternalCssExtDsl.g:6197:2: ( ruleElementDefinition )
            // InternalCssExtDsl.g:6198:3: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0()); 
            }

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
    // $ANTLR end "rule__PackageDefinition__ElementsAssignment_4_2"


    // $ANTLR start "rule__Doku__ContentAssignment"
    // InternalCssExtDsl.g:6207:1: rule__Doku__ContentAssignment : ( RULE_JDOC ) ;
    public final void rule__Doku__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6211:1: ( ( RULE_JDOC ) )
            // InternalCssExtDsl.g:6212:2: ( RULE_JDOC )
            {
            // InternalCssExtDsl.g:6212:2: ( RULE_JDOC )
            // InternalCssExtDsl.g:6213:3: RULE_JDOC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }
            match(input,RULE_JDOC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Doku__ContentAssignment"


    // $ANTLR start "rule__CSSType__DokuAssignment_0_1_0"
    // InternalCssExtDsl.g:6222:1: rule__CSSType__DokuAssignment_0_1_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6226:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6227:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6227:2: ( ruleDoku )
            // InternalCssExtDsl.g:6228:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__DokuAssignment_0_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_0_2"
    // InternalCssExtDsl.g:6237:1: rule__CSSType__TypeAssignment_0_2 : ( ( '@INT' ) ) ;
    public final void rule__CSSType__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6241:1: ( ( ( '@INT' ) ) )
            // InternalCssExtDsl.g:6242:2: ( ( '@INT' ) )
            {
            // InternalCssExtDsl.g:6242:2: ( ( '@INT' ) )
            // InternalCssExtDsl.g:6243:3: ( '@INT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }
            // InternalCssExtDsl.g:6244:3: ( '@INT' )
            // InternalCssExtDsl.g:6245:4: '@INT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_0_2"


    // $ANTLR start "rule__CSSType__FromAssignment_0_5"
    // InternalCssExtDsl.g:6256:1: rule__CSSType__FromAssignment_0_5 : ( RULE_INT ) ;
    public final void rule__CSSType__FromAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6260:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:6261:2: ( RULE_INT )
            {
            // InternalCssExtDsl.g:6261:2: ( RULE_INT )
            // InternalCssExtDsl.g:6262:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0()); 
            }

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
    // $ANTLR end "rule__CSSType__FromAssignment_0_5"


    // $ANTLR start "rule__CSSType__ToAssignment_0_9"
    // InternalCssExtDsl.g:6271:1: rule__CSSType__ToAssignment_0_9 : ( RULE_INT ) ;
    public final void rule__CSSType__ToAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6275:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:6276:2: ( RULE_INT )
            {
            // InternalCssExtDsl.g:6276:2: ( RULE_INT )
            // InternalCssExtDsl.g:6277:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0()); 
            }

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
    // $ANTLR end "rule__CSSType__ToAssignment_0_9"


    // $ANTLR start "rule__CSSType__DokuAssignment_1_1_0"
    // InternalCssExtDsl.g:6286:1: rule__CSSType__DokuAssignment_1_1_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6290:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6291:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6291:2: ( ruleDoku )
            // InternalCssExtDsl.g:6292:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__DokuAssignment_1_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_1_2"
    // InternalCssExtDsl.g:6301:1: rule__CSSType__TypeAssignment_1_2 : ( ( '@NUM' ) ) ;
    public final void rule__CSSType__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6305:1: ( ( ( '@NUM' ) ) )
            // InternalCssExtDsl.g:6306:2: ( ( '@NUM' ) )
            {
            // InternalCssExtDsl.g:6306:2: ( ( '@NUM' ) )
            // InternalCssExtDsl.g:6307:3: ( '@NUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }
            // InternalCssExtDsl.g:6308:3: ( '@NUM' )
            // InternalCssExtDsl.g:6309:4: '@NUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_1_2"


    // $ANTLR start "rule__CSSType__FromAssignment_1_5"
    // InternalCssExtDsl.g:6320:1: rule__CSSType__FromAssignment_1_5 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__FromAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6324:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:6325:2: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:6325:2: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:6326:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0()); 
            }

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
    // $ANTLR end "rule__CSSType__FromAssignment_1_5"


    // $ANTLR start "rule__CSSType__ToAssignment_1_9"
    // InternalCssExtDsl.g:6335:1: rule__CSSType__ToAssignment_1_9 : ( RULE_DOUBLE ) ;
    public final void rule__CSSType__ToAssignment_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6339:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:6340:2: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:6340:2: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:6341:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0()); 
            }

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
    // $ANTLR end "rule__CSSType__ToAssignment_1_9"


    // $ANTLR start "rule__CSSType__DokuAssignment_2_1_0"
    // InternalCssExtDsl.g:6350:1: rule__CSSType__DokuAssignment_2_1_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6354:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6355:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6355:2: ( ruleDoku )
            // InternalCssExtDsl.g:6356:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__DokuAssignment_2_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_2_2"
    // InternalCssExtDsl.g:6365:1: rule__CSSType__TypeAssignment_2_2 : ( ( '@PROPERTY_REF' ) ) ;
    public final void rule__CSSType__TypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6369:1: ( ( ( '@PROPERTY_REF' ) ) )
            // InternalCssExtDsl.g:6370:2: ( ( '@PROPERTY_REF' ) )
            {
            // InternalCssExtDsl.g:6370:2: ( ( '@PROPERTY_REF' ) )
            // InternalCssExtDsl.g:6371:3: ( '@PROPERTY_REF' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypePROPERTY_REFKeyword_2_2_0()); 
            }
            // InternalCssExtDsl.g:6372:3: ( '@PROPERTY_REF' )
            // InternalCssExtDsl.g:6373:4: '@PROPERTY_REF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypePROPERTY_REFKeyword_2_2_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypePROPERTY_REFKeyword_2_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypePROPERTY_REFKeyword_2_2_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_2_2"


    // $ANTLR start "rule__CSSType__RuleAssignment_2_4"
    // InternalCssExtDsl.g:6384:1: rule__CSSType__RuleAssignment_2_4 : ( ruleCSSRuleRef ) ;
    public final void rule__CSSType__RuleAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6388:1: ( ( ruleCSSRuleRef ) )
            // InternalCssExtDsl.g:6389:2: ( ruleCSSRuleRef )
            {
            // InternalCssExtDsl.g:6389:2: ( ruleCSSRuleRef )
            // InternalCssExtDsl.g:6390:3: ruleCSSRuleRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getRuleCSSRuleRefParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getRuleCSSRuleRefParserRuleCall_2_4_0()); 
            }

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
    // $ANTLR end "rule__CSSType__RuleAssignment_2_4"


    // $ANTLR start "rule__CSSType__DokuAssignment_3_0_0"
    // InternalCssExtDsl.g:6399:1: rule__CSSType__DokuAssignment_3_0_0 : ( ruleDoku ) ;
    public final void rule__CSSType__DokuAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6403:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6404:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6404:2: ( ruleDoku )
            // InternalCssExtDsl.g:6405:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_3_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_3_0_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__DokuAssignment_3_0_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_3_1_0_0"
    // InternalCssExtDsl.g:6414:1: rule__CSSType__TypeAssignment_3_1_0_0 : ( ( '@INT' ) ) ;
    public final void rule__CSSType__TypeAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6418:1: ( ( ( '@INT' ) ) )
            // InternalCssExtDsl.g:6419:2: ( ( '@INT' ) )
            {
            // InternalCssExtDsl.g:6419:2: ( ( '@INT' ) )
            // InternalCssExtDsl.g:6420:3: ( '@INT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_3_1_0_0_0()); 
            }
            // InternalCssExtDsl.g:6421:3: ( '@INT' )
            // InternalCssExtDsl.g:6422:4: '@INT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_3_1_0_0_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_3_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeINTKeyword_3_1_0_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_3_1_0_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_3_1_1_0"
    // InternalCssExtDsl.g:6433:1: rule__CSSType__TypeAssignment_3_1_1_0 : ( ( '@NUM' ) ) ;
    public final void rule__CSSType__TypeAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6437:1: ( ( ( '@NUM' ) ) )
            // InternalCssExtDsl.g:6438:2: ( ( '@NUM' ) )
            {
            // InternalCssExtDsl.g:6438:2: ( ( '@NUM' ) )
            // InternalCssExtDsl.g:6439:3: ( '@NUM' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_3_1_1_0_0()); 
            }
            // InternalCssExtDsl.g:6440:3: ( '@NUM' )
            // InternalCssExtDsl.g:6441:4: '@NUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_3_1_1_0_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_3_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_3_1_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_3_1_1_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_3_1_2_0"
    // InternalCssExtDsl.g:6452:1: rule__CSSType__TypeAssignment_3_1_2_0 : ( ( '@STRING' ) ) ;
    public final void rule__CSSType__TypeAssignment_3_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6456:1: ( ( ( '@STRING' ) ) )
            // InternalCssExtDsl.g:6457:2: ( ( '@STRING' ) )
            {
            // InternalCssExtDsl.g:6457:2: ( ( '@STRING' ) )
            // InternalCssExtDsl.g:6458:3: ( '@STRING' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_3_1_2_0_0()); 
            }
            // InternalCssExtDsl.g:6459:3: ( '@STRING' )
            // InternalCssExtDsl.g:6460:4: '@STRING'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_3_1_2_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_3_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_3_1_2_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_3_1_2_0"


    // $ANTLR start "rule__CSSType__TypeAssignment_3_1_3_0"
    // InternalCssExtDsl.g:6471:1: rule__CSSType__TypeAssignment_3_1_3_0 : ( ( '@URL' ) ) ;
    public final void rule__CSSType__TypeAssignment_3_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6475:1: ( ( ( '@URL' ) ) )
            // InternalCssExtDsl.g:6476:2: ( ( '@URL' ) )
            {
            // InternalCssExtDsl.g:6476:2: ( ( '@URL' ) )
            // InternalCssExtDsl.g:6477:3: ( '@URL' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_3_1_3_0_0()); 
            }
            // InternalCssExtDsl.g:6478:3: ( '@URL' )
            // InternalCssExtDsl.g:6479:4: '@URL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_3_1_3_0_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_3_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSTypeAccess().getTypeURLKeyword_3_1_3_0_0()); 
            }

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
    // $ANTLR end "rule__CSSType__TypeAssignment_3_1_3_0"


    // $ANTLR start "rule__ElementDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:6490:1: rule__ElementDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__ElementDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6494:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6495:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6495:2: ( ruleDoku )
            // InternalCssExtDsl.g:6496:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__DokuAssignment_1"


    // $ANTLR start "rule__ElementDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6505:1: rule__ElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6509:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6510:2: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:6510:2: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6511:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_1"
    // InternalCssExtDsl.g:6520:1: rule__ElementDefinition__SuperAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6524:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:6525:2: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:6525:2: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6526:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }
            // InternalCssExtDsl.g:6527:3: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6528:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_1"


    // $ANTLR start "rule__ElementDefinition__SuperAssignment_3_2_1"
    // InternalCssExtDsl.g:6539:1: rule__ElementDefinition__SuperAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementDefinition__SuperAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6543:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:6544:2: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:6544:2: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6545:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }
            // InternalCssExtDsl.g:6546:3: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6547:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionQualifiedNameParserRuleCall_3_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__SuperAssignment_3_2_1"


    // $ANTLR start "rule__ElementDefinition__StyleclassAssignment_4_1"
    // InternalCssExtDsl.g:6558:1: rule__ElementDefinition__StyleclassAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__ElementDefinition__StyleclassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6562:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:6563:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:6563:2: ( RULE_ID )
            // InternalCssExtDsl.g:6564:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__StyleclassAssignment_4_1"


    // $ANTLR start "rule__ElementDefinition__PropertiesAssignment_6_0"
    // InternalCssExtDsl.g:6573:1: rule__ElementDefinition__PropertiesAssignment_6_0 : ( rulePropertyDefinition ) ;
    public final void rule__ElementDefinition__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6577:1: ( ( rulePropertyDefinition ) )
            // InternalCssExtDsl.g:6578:2: ( rulePropertyDefinition )
            {
            // InternalCssExtDsl.g:6578:2: ( rulePropertyDefinition )
            // InternalCssExtDsl.g:6579:3: rulePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__PropertiesAssignment_6_0"


    // $ANTLR start "rule__ElementDefinition__PseudoClassesAssignment_6_1"
    // InternalCssExtDsl.g:6588:1: rule__ElementDefinition__PseudoClassesAssignment_6_1 : ( rulePseudoClassDefinition ) ;
    public final void rule__ElementDefinition__PseudoClassesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6592:1: ( ( rulePseudoClassDefinition ) )
            // InternalCssExtDsl.g:6593:2: ( rulePseudoClassDefinition )
            {
            // InternalCssExtDsl.g:6593:2: ( rulePseudoClassDefinition )
            // InternalCssExtDsl.g:6594:3: rulePseudoClassDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__PseudoClassesAssignment_6_1"


    // $ANTLR start "rule__ElementDefinition__SubstructuresAssignment_6_2"
    // InternalCssExtDsl.g:6603:1: rule__ElementDefinition__SubstructuresAssignment_6_2 : ( ruleSubstructure ) ;
    public final void rule__ElementDefinition__SubstructuresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6607:1: ( ( ruleSubstructure ) )
            // InternalCssExtDsl.g:6608:2: ( ruleSubstructure )
            {
            // InternalCssExtDsl.g:6608:2: ( ruleSubstructure )
            // InternalCssExtDsl.g:6609:3: ruleSubstructure
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0()); 
            }

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
    // $ANTLR end "rule__ElementDefinition__SubstructuresAssignment_6_2"


    // $ANTLR start "rule__PropertyDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:6618:1: rule__PropertyDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PropertyDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6622:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6623:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6623:2: ( ruleDoku )
            // InternalCssExtDsl.g:6624:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6633:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6637:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6638:2: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:6638:2: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6639:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__RuleAssignment_3"
    // InternalCssExtDsl.g:6648:1: rule__PropertyDefinition__RuleAssignment_3 : ( ruleCSSRuleOr ) ;
    public final void rule__PropertyDefinition__RuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6652:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:6653:2: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:6653:2: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:6654:3: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__RuleAssignment_3"


    // $ANTLR start "rule__PropertyDefinition__DefaultAssignment_4_1"
    // InternalCssExtDsl.g:6663:1: rule__PropertyDefinition__DefaultAssignment_4_1 : ( ruleCSSDefaultValue ) ;
    public final void rule__PropertyDefinition__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6667:1: ( ( ruleCSSDefaultValue ) )
            // InternalCssExtDsl.g:6668:2: ( ruleCSSDefaultValue )
            {
            // InternalCssExtDsl.g:6668:2: ( ruleCSSDefaultValue )
            // InternalCssExtDsl.g:6669:3: ruleCSSDefaultValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__PropertyDefinition__DefaultAssignment_4_1"


    // $ANTLR start "rule__PseudoClassDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:6678:1: rule__PseudoClassDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__PseudoClassDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6682:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6683:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6683:2: ( ruleDoku )
            // InternalCssExtDsl.g:6684:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__PseudoClassDefinition__DokuAssignment_1"


    // $ANTLR start "rule__PseudoClassDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6693:1: rule__PseudoClassDefinition__NameAssignment_2 : ( RULE_PSEUDO ) ;
    public final void rule__PseudoClassDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6697:1: ( ( RULE_PSEUDO ) )
            // InternalCssExtDsl.g:6698:2: ( RULE_PSEUDO )
            {
            // InternalCssExtDsl.g:6698:2: ( RULE_PSEUDO )
            // InternalCssExtDsl.g:6699:3: RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_PSEUDO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__PseudoClassDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleRef__DokuAssignment_0_0"
    // InternalCssExtDsl.g:6708:1: rule__CSSRuleRef__DokuAssignment_0_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleRef__DokuAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6712:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6713:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6713:2: ( ruleDoku )
            // InternalCssExtDsl.g:6714:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__DokuAssignment_0_0"


    // $ANTLR start "rule__CSSRuleRef__RefAssignment_2"
    // InternalCssExtDsl.g:6723:1: rule__CSSRuleRef__RefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CSSRuleRef__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6727:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:6728:2: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:6728:2: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6729:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
            }
            // InternalCssExtDsl.g:6730:3: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6731:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRefAccess().getRefDefinitionQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefDefinitionQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleRef__RefAssignment_2"


    // $ANTLR start "rule__CSSRuleDefinition__DokuAssignment_1"
    // InternalCssExtDsl.g:6742:1: rule__CSSRuleDefinition__DokuAssignment_1 : ( ruleDoku ) ;
    public final void rule__CSSRuleDefinition__DokuAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6746:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6747:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6747:2: ( ruleDoku )
            // InternalCssExtDsl.g:6748:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__DokuAssignment_1"


    // $ANTLR start "rule__CSSRuleDefinition__NameAssignment_2"
    // InternalCssExtDsl.g:6757:1: rule__CSSRuleDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__CSSRuleDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6761:1: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:6762:2: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:6762:2: ( ruleQualifiedName )
            // InternalCssExtDsl.g:6763:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__NameAssignment_2"


    // $ANTLR start "rule__CSSRuleDefinition__RuleAssignment_4_0"
    // InternalCssExtDsl.g:6772:1: rule__CSSRuleDefinition__RuleAssignment_4_0 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleDefinition__RuleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6776:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:6777:2: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:6777:2: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:6778:3: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__RuleAssignment_4_0"


    // $ANTLR start "rule__CSSRuleDefinition__FuncAssignment_4_1"
    // InternalCssExtDsl.g:6787:1: rule__CSSRuleDefinition__FuncAssignment_4_1 : ( ruleCSSRuleFunc ) ;
    public final void rule__CSSRuleDefinition__FuncAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6791:1: ( ( ruleCSSRuleFunc ) )
            // InternalCssExtDsl.g:6792:2: ( ruleCSSRuleFunc )
            {
            // InternalCssExtDsl.g:6792:2: ( ruleCSSRuleFunc )
            // InternalCssExtDsl.g:6793:3: ruleCSSRuleFunc
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleDefinition__FuncAssignment_4_1"


    // $ANTLR start "rule__CSSRuleFunc__NameAssignment_1"
    // InternalCssExtDsl.g:6802:1: rule__CSSRuleFunc__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__CSSRuleFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6806:1: ( ( ruleValidID ) )
            // InternalCssExtDsl.g:6807:2: ( ruleValidID )
            {
            // InternalCssExtDsl.g:6807:2: ( ruleValidID )
            // InternalCssExtDsl.g:6808:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__NameAssignment_1"


    // $ANTLR start "rule__CSSRuleFunc__ParamsAssignment_4"
    // InternalCssExtDsl.g:6817:1: rule__CSSRuleFunc__ParamsAssignment_4 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleFunc__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6821:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:6822:2: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:6822:2: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:6823:3: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleFunc__ParamsAssignment_4"


    // $ANTLR start "rule__CSSRuleOr__OrsAssignment_1_1_1"
    // InternalCssExtDsl.g:6832:1: rule__CSSRuleOr__OrsAssignment_1_1_1 : ( ruleCSSRuleXor ) ;
    public final void rule__CSSRuleOr__OrsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6836:1: ( ( ruleCSSRuleXor ) )
            // InternalCssExtDsl.g:6837:2: ( ruleCSSRuleXor )
            {
            // InternalCssExtDsl.g:6837:2: ( ruleCSSRuleXor )
            // InternalCssExtDsl.g:6838:3: ruleCSSRuleXor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleOr__OrsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleXor__XorsAssignment_1_1_1"
    // InternalCssExtDsl.g:6847:1: rule__CSSRuleXor__XorsAssignment_1_1_1 : ( ruleCSSRuleConcat ) ;
    public final void rule__CSSRuleXor__XorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6851:1: ( ( ruleCSSRuleConcat ) )
            // InternalCssExtDsl.g:6852:2: ( ruleCSSRuleConcat )
            {
            // InternalCssExtDsl.g:6852:2: ( ruleCSSRuleConcat )
            // InternalCssExtDsl.g:6853:3: ruleCSSRuleConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleXor__XorsAssignment_1_1_1"


    // $ANTLR start "rule__CSSRuleConcat__ConcAssignment_1_1"
    // InternalCssExtDsl.g:6862:1: rule__CSSRuleConcat__ConcAssignment_1_1 : ( ruleCSSRuleConcatWithoutSpace ) ;
    public final void rule__CSSRuleConcat__ConcAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6866:1: ( ( ruleCSSRuleConcatWithoutSpace ) )
            // InternalCssExtDsl.g:6867:2: ( ruleCSSRuleConcatWithoutSpace )
            {
            // InternalCssExtDsl.g:6867:2: ( ruleCSSRuleConcatWithoutSpace )
            // InternalCssExtDsl.g:6868:3: ruleCSSRuleConcatWithoutSpace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcat__ConcAssignment_1_1"


    // $ANTLR start "rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1"
    // InternalCssExtDsl.g:6877:1: rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1 : ( ruleCSSRulePostfix ) ;
    public final void rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6881:1: ( ( ruleCSSRulePostfix ) )
            // InternalCssExtDsl.g:6882:2: ( ruleCSSRulePostfix )
            {
            // InternalCssExtDsl.g:6882:2: ( ruleCSSRulePostfix )
            // InternalCssExtDsl.g:6883:3: ruleCSSRulePostfix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleConcatWithoutSpace__ConcAssignment_1_1_1"


    // $ANTLR start "rule__CSSRulePostfix__CardinalityAssignment_1_1"
    // InternalCssExtDsl.g:6892:1: rule__CSSRulePostfix__CardinalityAssignment_1_1 : ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__CSSRulePostfix__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6896:1: ( ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) ) )
            // InternalCssExtDsl.g:6897:2: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalCssExtDsl.g:6897:2: ( ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 ) )
            // InternalCssExtDsl.g:6898:3: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }
            // InternalCssExtDsl.g:6899:3: ( rule__CSSRulePostfix__CardinalityAlternatives_1_1_0 )
            // InternalCssExtDsl.g:6899:4: rule__CSSRulePostfix__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRulePostfix__CardinalityAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePostfixAccess().getCardinalityAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRulePostfix__CardinalityAssignment_1_1"


    // $ANTLR start "rule__CSSRuleBracket__InnerAssignment_2"
    // InternalCssExtDsl.g:6907:1: rule__CSSRuleBracket__InnerAssignment_2 : ( ruleCSSRuleOr ) ;
    public final void rule__CSSRuleBracket__InnerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6911:1: ( ( ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:6912:2: ( ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:6912:2: ( ruleCSSRuleOr )
            // InternalCssExtDsl.g:6913:3: ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleBracket__InnerAssignment_2"


    // $ANTLR start "rule__CSSRulePrimary__ValueAssignment_6_1"
    // InternalCssExtDsl.g:6922:1: rule__CSSRulePrimary__ValueAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__CSSRulePrimary__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6926:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:6927:2: ( RULE_INT )
            {
            // InternalCssExtDsl.g:6927:2: ( RULE_INT )
            // InternalCssExtDsl.g:6928:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRulePrimary__ValueAssignment_6_1"


    // $ANTLR start "rule__CSSRuleRegex__RegexAssignment_1"
    // InternalCssExtDsl.g:6937:1: rule__CSSRuleRegex__RegexAssignment_1 : ( RULE_REGEX ) ;
    public final void rule__CSSRuleRegex__RegexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6941:1: ( ( RULE_REGEX ) )
            // InternalCssExtDsl.g:6942:2: ( RULE_REGEX )
            {
            // InternalCssExtDsl.g:6942:2: ( RULE_REGEX )
            // InternalCssExtDsl.g:6943:3: RULE_REGEX
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REGEX,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleRegex__RegexAssignment_1"


    // $ANTLR start "rule__CSSRuleLiteral__DokuAssignment_1_0"
    // InternalCssExtDsl.g:6952:1: rule__CSSRuleLiteral__DokuAssignment_1_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleLiteral__DokuAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6956:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6957:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6957:2: ( ruleDoku )
            // InternalCssExtDsl.g:6958:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__DokuAssignment_1_0"


    // $ANTLR start "rule__CSSRuleLiteral__ValueAssignment_2"
    // InternalCssExtDsl.g:6967:1: rule__CSSRuleLiteral__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__CSSRuleLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6971:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:6972:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:6972:2: ( RULE_ID )
            // InternalCssExtDsl.g:6973:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleLiteral__ValueAssignment_2"


    // $ANTLR start "rule__CSSRuleSymbol__DokuAssignment_1_0"
    // InternalCssExtDsl.g:6982:1: rule__CSSRuleSymbol__DokuAssignment_1_0 : ( ruleDoku ) ;
    public final void rule__CSSRuleSymbol__DokuAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:6986:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:6987:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:6987:2: ( ruleDoku )
            // InternalCssExtDsl.g:6988:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__DokuAssignment_1_0"


    // $ANTLR start "rule__CSSRuleSymbol__SymbolAssignment_2"
    // InternalCssExtDsl.g:6997:1: rule__CSSRuleSymbol__SymbolAssignment_2 : ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) ) ;
    public final void rule__CSSRuleSymbol__SymbolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7001:1: ( ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) ) )
            // InternalCssExtDsl.g:7002:2: ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) )
            {
            // InternalCssExtDsl.g:7002:2: ( ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 ) )
            // InternalCssExtDsl.g:7003:3: ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_2_0()); 
            }
            // InternalCssExtDsl.g:7004:3: ( rule__CSSRuleSymbol__SymbolAlternatives_2_0 )
            // InternalCssExtDsl.g:7004:4: rule__CSSRuleSymbol__SymbolAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CSSRuleSymbol__SymbolAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSRuleSymbolAccess().getSymbolAlternatives_2_0()); 
            }

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
    // $ANTLR end "rule__CSSRuleSymbol__SymbolAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__ValAssignment_0_1"
    // InternalCssExtDsl.g:7012:1: rule__CSSDefaultValue__ValAssignment_0_1 : ( ruleCSSRuleLiteral ) ;
    public final void rule__CSSDefaultValue__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7016:1: ( ( ruleCSSRuleLiteral ) )
            // InternalCssExtDsl.g:7017:2: ( ruleCSSRuleLiteral )
            {
            // InternalCssExtDsl.g:7017:2: ( ruleCSSRuleLiteral )
            // InternalCssExtDsl.g:7018:3: ruleCSSRuleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__CSSDefaultValue__ValAssignment_0_1"


    // $ANTLR start "rule__CSSDefaultValue__IvalAssignment_1"
    // InternalCssExtDsl.g:7027:1: rule__CSSDefaultValue__IvalAssignment_1 : ( RULE_INT ) ;
    public final void rule__CSSDefaultValue__IvalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7031:1: ( ( RULE_INT ) )
            // InternalCssExtDsl.g:7032:2: ( RULE_INT )
            {
            // InternalCssExtDsl.g:7032:2: ( RULE_INT )
            // InternalCssExtDsl.g:7033:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__CSSDefaultValue__IvalAssignment_1"


    // $ANTLR start "rule__CSSDefaultValue__DvalAssignment_2"
    // InternalCssExtDsl.g:7042:1: rule__CSSDefaultValue__DvalAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__CSSDefaultValue__DvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7046:1: ( ( RULE_DOUBLE ) )
            // InternalCssExtDsl.g:7047:2: ( RULE_DOUBLE )
            {
            // InternalCssExtDsl.g:7047:2: ( RULE_DOUBLE )
            // InternalCssExtDsl.g:7048:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CSSDefaultValue__DvalAssignment_2"


    // $ANTLR start "rule__CSSDefaultValue__SvalAssignment_3"
    // InternalCssExtDsl.g:7057:1: rule__CSSDefaultValue__SvalAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CSSDefaultValue__SvalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7061:1: ( ( RULE_STRING ) )
            // InternalCssExtDsl.g:7062:2: ( RULE_STRING )
            {
            // InternalCssExtDsl.g:7062:2: ( RULE_STRING )
            // InternalCssExtDsl.g:7063:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__CSSDefaultValue__SvalAssignment_3"


    // $ANTLR start "rule__SubstructureSelector__SelectorNameAssignment_1"
    // InternalCssExtDsl.g:7072:1: rule__SubstructureSelector__SelectorNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubstructureSelector__SelectorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7076:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7077:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7077:2: ( RULE_ID )
            // InternalCssExtDsl.g:7078:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__SelectorNameAssignment_1"


    // $ANTLR start "rule__SubstructureSelector__VarAssignment_2_1"
    // InternalCssExtDsl.g:7087:1: rule__SubstructureSelector__VarAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__SubstructureSelector__VarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7091:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7092:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7092:2: ( RULE_ID )
            // InternalCssExtDsl.g:7093:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__SubstructureSelector__VarAssignment_2_1"


    // $ANTLR start "rule__Substructure__DokuAssignment_0"
    // InternalCssExtDsl.g:7102:1: rule__Substructure__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__Substructure__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7106:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7107:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7107:2: ( ruleDoku )
            // InternalCssExtDsl.g:7108:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Substructure__DokuAssignment_0"


    // $ANTLR start "rule__Substructure__NameAssignment_2"
    // InternalCssExtDsl.g:7117:1: rule__Substructure__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Substructure__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7121:1: ( ( RULE_ID ) )
            // InternalCssExtDsl.g:7122:2: ( RULE_ID )
            {
            // InternalCssExtDsl.g:7122:2: ( RULE_ID )
            // InternalCssExtDsl.g:7123:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Substructure__NameAssignment_2"


    // $ANTLR start "rule__Substructure__ChildsAssignment_4"
    // InternalCssExtDsl.g:7132:1: rule__Substructure__ChildsAssignment_4 : ( ruleSubstructureStyleclass ) ;
    public final void rule__Substructure__ChildsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7136:1: ( ( ruleSubstructureStyleclass ) )
            // InternalCssExtDsl.g:7137:2: ( ruleSubstructureStyleclass )
            {
            // InternalCssExtDsl.g:7137:2: ( ruleSubstructureStyleclass )
            // InternalCssExtDsl.g:7138:3: ruleSubstructureStyleclass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__Substructure__ChildsAssignment_4"


    // $ANTLR start "rule__SubstructureStyleclass__DokuAssignment_0"
    // InternalCssExtDsl.g:7147:1: rule__SubstructureStyleclass__DokuAssignment_0 : ( ruleDoku ) ;
    public final void rule__SubstructureStyleclass__DokuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7151:1: ( ( ruleDoku ) )
            // InternalCssExtDsl.g:7152:2: ( ruleDoku )
            {
            // InternalCssExtDsl.g:7152:2: ( ruleDoku )
            // InternalCssExtDsl.g:7153:3: ruleDoku
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDoku();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__DokuAssignment_0"


    // $ANTLR start "rule__SubstructureStyleclass__ElementAssignment_1"
    // InternalCssExtDsl.g:7162:1: rule__SubstructureStyleclass__ElementAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SubstructureStyleclass__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7166:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCssExtDsl.g:7167:2: ( ( ruleQualifiedName ) )
            {
            // InternalCssExtDsl.g:7167:2: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:7168:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
            }
            // InternalCssExtDsl.g:7169:3: ( ruleQualifiedName )
            // InternalCssExtDsl.g:7170:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__ElementAssignment_1"


    // $ANTLR start "rule__SubstructureStyleclass__SelectorsAssignment_3"
    // InternalCssExtDsl.g:7181:1: rule__SubstructureStyleclass__SelectorsAssignment_3 : ( ruleSubstructureSelector ) ;
    public final void rule__SubstructureStyleclass__SelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7185:1: ( ( ruleSubstructureSelector ) )
            // InternalCssExtDsl.g:7186:2: ( ruleSubstructureSelector )
            {
            // InternalCssExtDsl.g:7186:2: ( ruleSubstructureSelector )
            // InternalCssExtDsl.g:7187:3: ruleSubstructureSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__SelectorsAssignment_3"


    // $ANTLR start "rule__SubstructureStyleclass__ChildsAssignment_4_1"
    // InternalCssExtDsl.g:7196:1: rule__SubstructureStyleclass__ChildsAssignment_4_1 : ( ruleSubstructureStyleclass ) ;
    public final void rule__SubstructureStyleclass__ChildsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCssExtDsl.g:7200:1: ( ( ruleSubstructureStyleclass ) )
            // InternalCssExtDsl.g:7201:2: ( ruleSubstructureStyleclass )
            {
            // InternalCssExtDsl.g:7201:2: ( ruleSubstructureStyleclass )
            // InternalCssExtDsl.g:7202:3: ruleSubstructureStyleclass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end "rule__SubstructureStyleclass__ChildsAssignment_4_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\2\4\1\26\1\uffff\1\4\2\uffff\1\26";
    static final String dfa_3s = "\2\27\1\43\1\uffff\1\4\2\uffff\1\43";
    static final String dfa_4s = "\3\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\1\1\17\uffff\1\3",
            "\1\2\1\3\21\uffff\1\3",
            "\1\4\1\uffff\1\6\4\uffff\2\6\4\uffff\1\5",
            "",
            "\1\7",
            "",
            "",
            "\1\4\1\uffff\1\6\4\uffff\2\6\4\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "890:1: rule__PackageDefinition__Alternatives_4 : ( ( ( rule__PackageDefinition__RulesAssignment_4_0 ) ) | ( ( rule__PackageDefinition__SubpackagesAssignment_4_1 ) ) | ( ( rule__PackageDefinition__ElementsAssignment_4_2 ) ) );";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\2\uffff\2\5\5\uffff";
    static final String dfa_9s = "\1\7\1\5\2\4\2\uffff\1\5\2\uffff";
    static final String dfa_10s = "\4\56\2\uffff\1\56\2\uffff";
    static final String dfa_11s = "\4\uffff\1\3\1\4\1\uffff\1\1\1\2";
    static final String dfa_12s = "\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\42\uffff\1\2\1\3\1\4\2\5",
            "\1\6\44\uffff\1\2\1\3\1\4\2\5",
            "\2\5\1\uffff\2\5\2\uffff\1\5\3\uffff\5\5\6\uffff\1\7\1\uffff\1\5\2\uffff\3\5\2\uffff\5\5\1\uffff\5\5",
            "\2\5\1\uffff\2\5\2\uffff\1\5\3\uffff\5\5\6\uffff\1\10\1\uffff\1\5\2\uffff\3\5\2\uffff\5\5\1\uffff\5\5",
            "",
            "",
            "\1\6\44\uffff\1\2\1\3\1\4\2\5",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "917:1: rule__CSSType__Alternatives : ( ( ( rule__CSSType__Group_0__0 ) ) | ( ( rule__CSSType__Group_1__0 ) ) | ( ( rule__CSSType__Group_2__0 ) ) | ( ( rule__CSSType__Group_3__0 ) ) );";
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\2\4\7\uffff\1\4";
    static final String dfa_16s = "\2\56\7\uffff\1\56";
    static final String dfa_17s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String dfa_18s = "\12\uffff}>";
    static final String[] dfa_19s = {
            "\1\4\2\uffff\1\1\1\10\2\uffff\1\7\6\uffff\2\5\15\uffff\1\2\5\uffff\1\3\2\uffff\5\6",
            "\1\4\1\11\14\uffff\2\5\15\uffff\1\2\10\uffff\5\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\11\14\uffff\2\5\15\uffff\1\2\10\uffff\5\6"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1058:1: rule__CSSRulePrimary__Alternatives : ( ( ruleCSSRuleRef ) | ( ruleCSSRuleBracket ) | ( ruleCSSRuleLiteral ) | ( ruleCSSRuleSymbol ) | ( ruleCSSBaseType ) | ( ruleCSSRuleRegex ) | ( ( rule__CSSRulePrimary__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000A00080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002800090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800092L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00006C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800090L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020002000490L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000492L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00007C82000C0990L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00007C82000C09B0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00007C82000C0992L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000020000000490L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000012L});

}