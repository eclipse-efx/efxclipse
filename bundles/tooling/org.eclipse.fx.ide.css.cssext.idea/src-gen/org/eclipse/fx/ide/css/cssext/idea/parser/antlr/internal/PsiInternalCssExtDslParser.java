package org.eclipse.fx.ide.css.cssext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.fx.ide.css.cssext.idea.lang.CssExtDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalCssExtDslParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_JDOC", "RULE_INT", "RULE_DOUBLE", "RULE_PSEUDO", "RULE_REGEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'*'", "'package'", "'{'", "'}'", "'@INT'", "'('", "'->'", "')'", "'@NUM'", "'@PROPERTY_REF'", "'@STRING'", "'@URL'", "'extends'", "','", "'styleclass'", "'default:'", "';'", "'<'", "'>'", "'='", "'|'", "'||'", "'~'", "'+'", "'?'", "'['", "']'", "'%'", "'substructure'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_WS=6;
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


        public PsiInternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalCssExtDsl.g"; }



    	protected CssExtDslGrammarAccess grammarAccess;

    	protected CssExtDslElementTypeProvider elementTypeProvider;

    	public PsiInternalCssExtDslParser(PsiBuilder builder, TokenStream input, CssExtDslElementTypeProvider elementTypeProvider, CssExtDslGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "CssExtension";
    	}




    // $ANTLR start "entryRuleCssExtension"
    // PsiInternalCssExtDsl.g:52:1: entryRuleCssExtension returns [Boolean current=false] : iv_ruleCssExtension= ruleCssExtension EOF ;
    public final Boolean entryRuleCssExtension() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCssExtension = null;


        try {
            // PsiInternalCssExtDsl.g:52:54: (iv_ruleCssExtension= ruleCssExtension EOF )
            // PsiInternalCssExtDsl.g:53:2: iv_ruleCssExtension= ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCssExtensionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCssExtension=ruleCssExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCssExtension; 
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
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // PsiInternalCssExtDsl.g:59:1: ruleCssExtension returns [Boolean current=false] : (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? ) ;
    public final Boolean ruleCssExtension() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        Boolean lv_imports_2_0 = null;

        Boolean lv_packageDef_3_0 = null;


        try {
            // PsiInternalCssExtDsl.g:60:1: ( (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? ) )
            // PsiInternalCssExtDsl.g:61:2: (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? )
            {
            // PsiInternalCssExtDsl.g:61:2: (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? )
            // PsiInternalCssExtDsl.g:62:3: otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCssExtension_NamespaceKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssExtDsl.g:69:3: ( (lv_namespace_1_0= RULE_STRING ) )
            // PsiInternalCssExtDsl.g:70:4: (lv_namespace_1_0= RULE_STRING )
            {
            // PsiInternalCssExtDsl.g:70:4: (lv_namespace_1_0= RULE_STRING )
            // PsiInternalCssExtDsl.g:71:5: lv_namespace_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getCssExtension_NamespaceSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_namespace_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_namespace_1_0);
              				
            }

            }


            }

            // PsiInternalCssExtDsl.g:86:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:87:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // PsiInternalCssExtDsl.g:87:4: (lv_imports_2_0= ruleImport )
            	    // PsiInternalCssExtDsl.g:88:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getCssExtension_ImportsImportParserRuleCall_2_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

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
            	    break loop1;
                }
            } while (true);

            // PsiInternalCssExtDsl.g:101:3: ( (lv_packageDef_3_0= rulePackageDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_JDOC||LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalCssExtDsl.g:102:4: (lv_packageDef_3_0= rulePackageDefinition )
                    {
                    // PsiInternalCssExtDsl.g:102:4: (lv_packageDef_3_0= rulePackageDefinition )
                    // PsiInternalCssExtDsl.g:103:5: lv_packageDef_3_0= rulePackageDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getCssExtension_PackageDefPackageDefinitionParserRuleCall_3_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_packageDef_3_0=rulePackageDefinition();

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // PsiInternalCssExtDsl.g:120:1: entryRuleImport returns [Boolean current=false] : iv_ruleImport= ruleImport EOF ;
    public final Boolean entryRuleImport() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleImport = null;


        try {
            // PsiInternalCssExtDsl.g:120:48: (iv_ruleImport= ruleImport EOF )
            // PsiInternalCssExtDsl.g:121:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getImportElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // PsiInternalCssExtDsl.g:127:1: ruleImport returns [Boolean current=false] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final Boolean ruleImport() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_importedNamespace_1_0 = null;


        try {
            // PsiInternalCssExtDsl.g:128:1: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // PsiInternalCssExtDsl.g:129:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // PsiInternalCssExtDsl.g:129:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // PsiInternalCssExtDsl.g:130:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getImport_ImportKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCssExtDsl.g:137:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // PsiInternalCssExtDsl.g:138:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // PsiInternalCssExtDsl.g:138:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // PsiInternalCssExtDsl.g:139:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getImport_ImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // PsiInternalCssExtDsl.g:156:1: entryRuleValidID returns [Boolean current=false] : iv_ruleValidID= ruleValidID EOF ;
    public final Boolean entryRuleValidID() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleValidID = null;


        try {
            // PsiInternalCssExtDsl.g:156:49: (iv_ruleValidID= ruleValidID EOF )
            // PsiInternalCssExtDsl.g:157:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getValidIDElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID; 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // PsiInternalCssExtDsl.g:163:1: ruleValidID returns [Boolean current=false] : this_ID_0= RULE_ID ;
    public final Boolean ruleValidID() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;

        try {
            // PsiInternalCssExtDsl.g:164:1: (this_ID_0= RULE_ID )
            // PsiInternalCssExtDsl.g:165:2: this_ID_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              		markLeaf(elementTypeProvider.getValidID_IDTerminalRuleCallElementType());
              	
            }
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		doneLeaf(this_ID_0);
              	
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalCssExtDsl.g:175:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalCssExtDsl.g:175:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalCssExtDsl.g:176:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalCssExtDsl.g:182:1: ruleQualifiedName returns [Boolean current=false] : ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalCssExtDsl.g:183:1: ( ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* ) )
            // PsiInternalCssExtDsl.g:184:2: ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* )
            {
            // PsiInternalCssExtDsl.g:184:2: ( ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )* )
            // PsiInternalCssExtDsl.g:185:3: ruleValidID ( ( ( '.' )=>kw= '.' ) ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getQualifiedName_ValidIDParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_6);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:192:3: ( ( ( '.' )=>kw= '.' ) ruleValidID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) && (synpred1_PsiInternalCssExtDsl())) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:193:4: ( ( '.' )=>kw= '.' ) ruleValidID
            	    {
            	    // PsiInternalCssExtDsl.g:193:4: ( ( '.' )=>kw= '.' )
            	    // PsiInternalCssExtDsl.g:194:5: ( '.' )=>kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	      				
            	    }
            	    kw=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(kw);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				markComposite(elementTypeProvider.getQualifiedName_ValidIDParserRuleCall_1_1ElementType());
            	      			
            	    }
            	    pushFollow(FOLLOW_6);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneComposite();
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // PsiInternalCssExtDsl.g:215:1: entryRuleQualifiedNameWithWildCard returns [Boolean current=false] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final Boolean entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNameWithWildCard = null;


        try {
            // PsiInternalCssExtDsl.g:215:67: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // PsiInternalCssExtDsl.g:216:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameWithWildCardElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard; 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // PsiInternalCssExtDsl.g:222:1: ruleQualifiedNameWithWildCard returns [Boolean current=false] : ( ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final Boolean ruleQualifiedNameWithWildCard() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalCssExtDsl.g:223:1: ( ( ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // PsiInternalCssExtDsl.g:224:2: ( ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // PsiInternalCssExtDsl.g:224:2: ( ruleQualifiedName (kw= '.' kw= '*' )? )
            // PsiInternalCssExtDsl.g:225:3: ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getQualifiedNameWithWildCard_QualifiedNameParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:232:3: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalCssExtDsl.g:233:4: kw= '.' kw= '*'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getQualifiedNameWithWildCard_FullStopKeyword_1_0ElementType());
                      			
                    }
                    kw=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getQualifiedNameWithWildCard_AsteriskKeyword_1_1ElementType());
                      			
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // PsiInternalCssExtDsl.g:252:1: entryRulePackageDefinition returns [Boolean current=false] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final Boolean entryRulePackageDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePackageDefinition = null;


        try {
            // PsiInternalCssExtDsl.g:252:59: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // PsiInternalCssExtDsl.g:253:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPackageDefinitionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDefinition; 
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
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // PsiInternalCssExtDsl.g:259:1: rulePackageDefinition returns [Boolean current=false] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) ;
    public final Boolean rulePackageDefinition() throws RecognitionException {
        Boolean current = false;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Boolean lv_doku_0_0 = null;

        Boolean lv_name_3_0 = null;

        Boolean lv_rules_5_0 = null;

        Boolean lv_subpackages_6_0 = null;

        Boolean lv_elements_7_0 = null;


        try {
            // PsiInternalCssExtDsl.g:260:1: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) )
            // PsiInternalCssExtDsl.g:261:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            {
            // PsiInternalCssExtDsl.g:261:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            // PsiInternalCssExtDsl.g:262:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}'
            {
            // PsiInternalCssExtDsl.g:262:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_JDOC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalCssExtDsl.g:263:4: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // PsiInternalCssExtDsl.g:263:4: ( (lv_doku_0_0= ruleDoku ) )
                    // PsiInternalCssExtDsl.g:264:5: (lv_doku_0_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:264:5: (lv_doku_0_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:265:6: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPackageDefinition_DokuDokuParserRuleCall_0_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_doku_0_0=ruleDoku();

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

                    // PsiInternalCssExtDsl.g:278:4: (this_WS_1= RULE_WS )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_WS) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:279:5: this_WS_1= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getPackageDefinition_WSTerminalRuleCall_0_1ElementType());
                    	      				
                    	    }
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_1);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPackageDefinition_PackageKeyword_1ElementType());
              		
            }
            otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssExtDsl.g:295:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:296:4: (lv_name_3_0= ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:296:4: (lv_name_3_0= ruleQualifiedName )
            // PsiInternalCssExtDsl.g:297:5: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getPackageDefinition_NameQualifiedNameParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleQualifiedName();

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

              			markLeaf(elementTypeProvider.getPackageDefinition_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalCssExtDsl.g:317:3: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*
            loop7:
            do {
                int alt7=4;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:318:4: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    {
            	    // PsiInternalCssExtDsl.g:318:4: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    // PsiInternalCssExtDsl.g:319:5: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    {
            	    // PsiInternalCssExtDsl.g:319:5: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    // PsiInternalCssExtDsl.g:320:6: lv_rules_5_0= ruleCSSRuleDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getPackageDefinition_RulesCSSRuleDefinitionParserRuleCall_4_0_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_rules_5_0=ruleCSSRuleDefinition();

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
            	    // PsiInternalCssExtDsl.g:334:4: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    {
            	    // PsiInternalCssExtDsl.g:334:4: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    // PsiInternalCssExtDsl.g:335:5: (lv_subpackages_6_0= rulePackageDefinition )
            	    {
            	    // PsiInternalCssExtDsl.g:335:5: (lv_subpackages_6_0= rulePackageDefinition )
            	    // PsiInternalCssExtDsl.g:336:6: lv_subpackages_6_0= rulePackageDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getPackageDefinition_SubpackagesPackageDefinitionParserRuleCall_4_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_subpackages_6_0=rulePackageDefinition();

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
            	    // PsiInternalCssExtDsl.g:350:4: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    {
            	    // PsiInternalCssExtDsl.g:350:4: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    // PsiInternalCssExtDsl.g:351:5: (lv_elements_7_0= ruleElementDefinition )
            	    {
            	    // PsiInternalCssExtDsl.g:351:5: (lv_elements_7_0= ruleElementDefinition )
            	    // PsiInternalCssExtDsl.g:352:6: lv_elements_7_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getPackageDefinition_ElementsElementDefinitionParserRuleCall_4_2_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_elements_7_0=ruleElementDefinition();

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
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPackageDefinition_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_8);
              		
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // PsiInternalCssExtDsl.g:377:1: entryRuleDoku returns [Boolean current=false] : iv_ruleDoku= ruleDoku EOF ;
    public final Boolean entryRuleDoku() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDoku = null;


        try {
            // PsiInternalCssExtDsl.g:377:46: (iv_ruleDoku= ruleDoku EOF )
            // PsiInternalCssExtDsl.g:378:2: iv_ruleDoku= ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getDokuElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoku=ruleDoku();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoku; 
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
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // PsiInternalCssExtDsl.g:384:1: ruleDoku returns [Boolean current=false] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final Boolean ruleDoku() throws RecognitionException {
        Boolean current = false;

        Token lv_content_0_0=null;

        try {
            // PsiInternalCssExtDsl.g:385:1: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // PsiInternalCssExtDsl.g:386:2: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // PsiInternalCssExtDsl.g:386:2: ( (lv_content_0_0= RULE_JDOC ) )
            // PsiInternalCssExtDsl.g:387:3: (lv_content_0_0= RULE_JDOC )
            {
            // PsiInternalCssExtDsl.g:387:3: (lv_content_0_0= RULE_JDOC )
            // PsiInternalCssExtDsl.g:388:4: lv_content_0_0= RULE_JDOC
            {
            if ( state.backtracking==0 ) {

              				markLeaf(elementTypeProvider.getDoku_ContentJDOCTerminalRuleCall_0ElementType());
              			
            }
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if(!current) {
              					associateWithSemanticElement();
              					current = true;
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				doneLeaf(lv_content_0_0);
              			
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // PsiInternalCssExtDsl.g:406:1: entryRuleCSSBaseType returns [Boolean current=false] : iv_ruleCSSBaseType= ruleCSSBaseType EOF ;
    public final Boolean entryRuleCSSBaseType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSBaseType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:408:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // PsiInternalCssExtDsl.g:409:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSBaseTypeElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSBaseType=ruleCSSBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSBaseType; 
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
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // PsiInternalCssExtDsl.g:418:1: ruleCSSBaseType returns [Boolean current=false] : this_CSSType_0= ruleCSSType ;
    public final Boolean ruleCSSBaseType() throws RecognitionException {
        Boolean current = false;

        Boolean this_CSSType_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:421:2: (this_CSSType_0= ruleCSSType )
            // PsiInternalCssExtDsl.g:422:2: this_CSSType_0= ruleCSSType
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getCSSBaseType_CSSTypeParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            this_CSSType_0=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_CSSType_0;
              		doneComposite();
              	
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
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // PsiInternalCssExtDsl.g:436:1: entryRuleCSSType returns [Boolean current=false] : iv_ruleCSSType= ruleCSSType EOF ;
    public final Boolean entryRuleCSSType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:438:2: (iv_ruleCSSType= ruleCSSType EOF )
            // PsiInternalCssExtDsl.g:439:2: iv_ruleCSSType= ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSTypeElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSType=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSType; 
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
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // PsiInternalCssExtDsl.g:448:1: ruleCSSType returns [Boolean current=false] : ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) ) ;
    public final Boolean ruleCSSType() throws RecognitionException {
        Boolean current = false;

        Token this_WS_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_from_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token lv_to_10_0=null;
        Token this_WS_11=null;
        Token otherlv_12=null;
        Token this_WS_15=null;
        Token lv_type_16_0=null;
        Token otherlv_17=null;
        Token this_WS_18=null;
        Token lv_from_19_0=null;
        Token this_WS_20=null;
        Token otherlv_21=null;
        Token this_WS_22=null;
        Token lv_to_23_0=null;
        Token this_WS_24=null;
        Token otherlv_25=null;
        Token this_WS_28=null;
        Token lv_type_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token this_WS_34=null;
        Token lv_type_35_0=null;
        Token this_WS_36=null;
        Token lv_type_37_0=null;
        Token this_WS_38=null;
        Token lv_type_39_0=null;
        Token this_WS_40=null;
        Token lv_type_41_0=null;
        Token this_WS_42=null;
        Boolean lv_doku_1_0 = null;

        Boolean lv_doku_14_0 = null;

        Boolean lv_doku_27_0 = null;

        Boolean lv_rule_31_0 = null;

        Boolean lv_doku_33_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:451:2: ( ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) ) )
            // PsiInternalCssExtDsl.g:452:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )
            {
            // PsiInternalCssExtDsl.g:452:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // PsiInternalCssExtDsl.g:453:3: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    {
                    // PsiInternalCssExtDsl.g:453:3: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    // PsiInternalCssExtDsl.g:454:4: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')'
                    {
                    // PsiInternalCssExtDsl.g:454:4: ()
                    // PsiInternalCssExtDsl.g:455:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSType_CSSRangedIntTypeAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:461:4: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_JDOC) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:462:5: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:462:5: ( (lv_doku_1_0= ruleDoku ) )
                            // PsiInternalCssExtDsl.g:463:6: (lv_doku_1_0= ruleDoku )
                            {
                            // PsiInternalCssExtDsl.g:463:6: (lv_doku_1_0= ruleDoku )
                            // PsiInternalCssExtDsl.g:464:7: lv_doku_1_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getCSSType_DokuDokuParserRuleCall_0_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_doku_1_0=ruleDoku();

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

                            // PsiInternalCssExtDsl.g:477:5: (this_WS_2= RULE_WS )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_WS) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:478:6: this_WS_2= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_0_1_1ElementType());
                            	      					
                            	    }
                            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						doneLeaf(this_WS_2);
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // PsiInternalCssExtDsl.g:487:4: ( (lv_type_3_0= '@INT' ) )
                    // PsiInternalCssExtDsl.g:488:5: (lv_type_3_0= '@INT' )
                    {
                    // PsiInternalCssExtDsl.g:488:5: (lv_type_3_0= '@INT' )
                    // PsiInternalCssExtDsl.g:489:6: lv_type_3_0= '@INT'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_TypeINTKeyword_0_2_0ElementType());
                      					
                    }
                    lv_type_3_0=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_type_3_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_LeftParenthesisKeyword_0_3ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCssExtDsl.g:511:4: (this_WS_5= RULE_WS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:512:5: this_WS_5= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_0_4ElementType());
                    	      				
                    	    }
                    	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_5);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // PsiInternalCssExtDsl.g:520:4: ( (lv_from_6_0= RULE_INT ) )
                    // PsiInternalCssExtDsl.g:521:5: (lv_from_6_0= RULE_INT )
                    {
                    // PsiInternalCssExtDsl.g:521:5: (lv_from_6_0= RULE_INT )
                    // PsiInternalCssExtDsl.g:522:6: lv_from_6_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_FromINTTerminalRuleCall_0_5_0ElementType());
                      					
                    }
                    lv_from_6_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_from_6_0);
                      					
                    }

                    }


                    }

                    // PsiInternalCssExtDsl.g:537:4: (this_WS_7= RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:538:5: this_WS_7= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_0_6ElementType());
                    	      				
                    	    }
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_7);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_HyphenMinusGreaterThanSignKeyword_0_7ElementType());
                      			
                    }
                    otherlv_8=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_8);
                      			
                    }
                    // PsiInternalCssExtDsl.g:553:4: (this_WS_9= RULE_WS )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:554:5: this_WS_9= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_0_8ElementType());
                    	      				
                    	    }
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_9);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // PsiInternalCssExtDsl.g:562:4: ( (lv_to_10_0= RULE_INT ) )
                    // PsiInternalCssExtDsl.g:563:5: (lv_to_10_0= RULE_INT )
                    {
                    // PsiInternalCssExtDsl.g:563:5: (lv_to_10_0= RULE_INT )
                    // PsiInternalCssExtDsl.g:564:6: lv_to_10_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_ToINTTerminalRuleCall_0_9_0ElementType());
                      					
                    }
                    lv_to_10_0=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_to_10_0);
                      					
                    }

                    }


                    }

                    // PsiInternalCssExtDsl.g:579:4: (this_WS_11= RULE_WS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_WS) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:580:5: this_WS_11= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_0_10ElementType());
                    	      				
                    	    }
                    	    this_WS_11=(Token)match(input,RULE_WS,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_11);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_RightParenthesisKeyword_0_11ElementType());
                      			
                    }
                    otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_12);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCssExtDsl.g:597:3: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    {
                    // PsiInternalCssExtDsl.g:597:3: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    // PsiInternalCssExtDsl.g:598:4: () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')'
                    {
                    // PsiInternalCssExtDsl.g:598:4: ()
                    // PsiInternalCssExtDsl.g:599:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSType_CSSRangedDoubleTypeAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:605:4: ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_JDOC) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:606:5: ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:606:5: ( (lv_doku_14_0= ruleDoku ) )
                            // PsiInternalCssExtDsl.g:607:6: (lv_doku_14_0= ruleDoku )
                            {
                            // PsiInternalCssExtDsl.g:607:6: (lv_doku_14_0= ruleDoku )
                            // PsiInternalCssExtDsl.g:608:7: lv_doku_14_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getCSSType_DokuDokuParserRuleCall_1_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_doku_14_0=ruleDoku();

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

                            // PsiInternalCssExtDsl.g:621:5: (this_WS_15= RULE_WS )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_WS) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:622:6: this_WS_15= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_1_1_1ElementType());
                            	      					
                            	    }
                            	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						doneLeaf(this_WS_15);
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // PsiInternalCssExtDsl.g:631:4: ( (lv_type_16_0= '@NUM' ) )
                    // PsiInternalCssExtDsl.g:632:5: (lv_type_16_0= '@NUM' )
                    {
                    // PsiInternalCssExtDsl.g:632:5: (lv_type_16_0= '@NUM' )
                    // PsiInternalCssExtDsl.g:633:6: lv_type_16_0= '@NUM'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_TypeNUMKeyword_1_2_0ElementType());
                      					
                    }
                    lv_type_16_0=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_type_16_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_LeftParenthesisKeyword_1_3ElementType());
                      			
                    }
                    otherlv_17=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_17);
                      			
                    }
                    // PsiInternalCssExtDsl.g:655:4: (this_WS_18= RULE_WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:656:5: this_WS_18= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_1_4ElementType());
                    	      				
                    	    }
                    	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_18);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // PsiInternalCssExtDsl.g:664:4: ( (lv_from_19_0= RULE_DOUBLE ) )
                    // PsiInternalCssExtDsl.g:665:5: (lv_from_19_0= RULE_DOUBLE )
                    {
                    // PsiInternalCssExtDsl.g:665:5: (lv_from_19_0= RULE_DOUBLE )
                    // PsiInternalCssExtDsl.g:666:6: lv_from_19_0= RULE_DOUBLE
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_FromDOUBLETerminalRuleCall_1_5_0ElementType());
                      					
                    }
                    lv_from_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_from_19_0);
                      					
                    }

                    }


                    }

                    // PsiInternalCssExtDsl.g:681:4: (this_WS_20= RULE_WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:682:5: this_WS_20= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_1_6ElementType());
                    	      				
                    	    }
                    	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_20);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_HyphenMinusGreaterThanSignKeyword_1_7ElementType());
                      			
                    }
                    otherlv_21=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_21);
                      			
                    }
                    // PsiInternalCssExtDsl.g:697:4: (this_WS_22= RULE_WS )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:698:5: this_WS_22= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_1_8ElementType());
                    	      				
                    	    }
                    	    this_WS_22=(Token)match(input,RULE_WS,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_22);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // PsiInternalCssExtDsl.g:706:4: ( (lv_to_23_0= RULE_DOUBLE ) )
                    // PsiInternalCssExtDsl.g:707:5: (lv_to_23_0= RULE_DOUBLE )
                    {
                    // PsiInternalCssExtDsl.g:707:5: (lv_to_23_0= RULE_DOUBLE )
                    // PsiInternalCssExtDsl.g:708:6: lv_to_23_0= RULE_DOUBLE
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_ToDOUBLETerminalRuleCall_1_9_0ElementType());
                      					
                    }
                    lv_to_23_0=(Token)match(input,RULE_DOUBLE,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_to_23_0);
                      					
                    }

                    }


                    }

                    // PsiInternalCssExtDsl.g:723:4: (this_WS_24= RULE_WS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:724:5: this_WS_24= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_1_10ElementType());
                    	      				
                    	    }
                    	    this_WS_24=(Token)match(input,RULE_WS,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_24);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_RightParenthesisKeyword_1_11ElementType());
                      			
                    }
                    otherlv_25=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_25);
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalCssExtDsl.g:741:3: ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' )
                    {
                    // PsiInternalCssExtDsl.g:741:3: ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' )
                    // PsiInternalCssExtDsl.g:742:4: () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')'
                    {
                    // PsiInternalCssExtDsl.g:742:4: ()
                    // PsiInternalCssExtDsl.g:743:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSType_CSSPropertyRefAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:749:4: ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_JDOC) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:750:5: ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:750:5: ( (lv_doku_27_0= ruleDoku ) )
                            // PsiInternalCssExtDsl.g:751:6: (lv_doku_27_0= ruleDoku )
                            {
                            // PsiInternalCssExtDsl.g:751:6: (lv_doku_27_0= ruleDoku )
                            // PsiInternalCssExtDsl.g:752:7: lv_doku_27_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getCSSType_DokuDokuParserRuleCall_2_1_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_18);
                            lv_doku_27_0=ruleDoku();

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

                            // PsiInternalCssExtDsl.g:765:5: (this_WS_28= RULE_WS )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_WS) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:766:6: this_WS_28= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_2_1_1ElementType());
                            	      					
                            	    }
                            	    this_WS_28=(Token)match(input,RULE_WS,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						doneLeaf(this_WS_28);
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // PsiInternalCssExtDsl.g:775:4: ( (lv_type_29_0= '@PROPERTY_REF' ) )
                    // PsiInternalCssExtDsl.g:776:5: (lv_type_29_0= '@PROPERTY_REF' )
                    {
                    // PsiInternalCssExtDsl.g:776:5: (lv_type_29_0= '@PROPERTY_REF' )
                    // PsiInternalCssExtDsl.g:777:6: lv_type_29_0= '@PROPERTY_REF'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSType_TypePROPERTY_REFKeyword_2_2_0ElementType());
                      					
                    }
                    lv_type_29_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_type_29_0);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getCSSType_LeftParenthesisKeyword_2_3ElementType());
                      			
                    }
                    otherlv_30=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_30);
                      			
                    }
                    // PsiInternalCssExtDsl.g:799:4: ( (lv_rule_31_0= ruleCSSRuleRef ) )
                    // PsiInternalCssExtDsl.g:800:5: (lv_rule_31_0= ruleCSSRuleRef )
                    {
                    // PsiInternalCssExtDsl.g:800:5: (lv_rule_31_0= ruleCSSRuleRef )
                    // PsiInternalCssExtDsl.g:801:6: lv_rule_31_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSType_RuleCSSRuleRefParserRuleCall_2_4_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_rule_31_0=ruleCSSRuleRef();

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

                      				markLeaf(elementTypeProvider.getCSSType_RightParenthesisKeyword_2_5ElementType());
                      			
                    }
                    otherlv_32=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_32);
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalCssExtDsl.g:823:3: ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) )
                    {
                    // PsiInternalCssExtDsl.g:823:3: ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) )
                    // PsiInternalCssExtDsl.g:824:4: ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) )
                    {
                    // PsiInternalCssExtDsl.g:824:4: ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_JDOC) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:825:5: ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:825:5: ( (lv_doku_33_0= ruleDoku ) )
                            // PsiInternalCssExtDsl.g:826:6: (lv_doku_33_0= ruleDoku )
                            {
                            // PsiInternalCssExtDsl.g:826:6: (lv_doku_33_0= ruleDoku )
                            // PsiInternalCssExtDsl.g:827:7: lv_doku_33_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							markComposite(elementTypeProvider.getCSSType_DokuDokuParserRuleCall_3_0_0_0ElementType());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_doku_33_0=ruleDoku();

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

                            // PsiInternalCssExtDsl.g:840:5: (this_WS_34= RULE_WS )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_WS) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:841:6: this_WS_34= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      						markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_3_0_1ElementType());
                            	      					
                            	    }
                            	    this_WS_34=(Token)match(input,RULE_WS,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						doneLeaf(this_WS_34);
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // PsiInternalCssExtDsl.g:850:4: ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) )
                    int alt28=4;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt28=1;
                        }
                        break;
                    case 26:
                        {
                        alt28=2;
                        }
                        break;
                    case 28:
                        {
                        alt28=3;
                        }
                        break;
                    case 29:
                        {
                        alt28=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:851:5: ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* )
                            {
                            // PsiInternalCssExtDsl.g:851:5: ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* )
                            // PsiInternalCssExtDsl.g:852:6: ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:852:6: ( (lv_type_35_0= '@INT' ) )
                            // PsiInternalCssExtDsl.g:853:7: (lv_type_35_0= '@INT' )
                            {
                            // PsiInternalCssExtDsl.g:853:7: (lv_type_35_0= '@INT' )
                            // PsiInternalCssExtDsl.g:854:8: lv_type_35_0= '@INT'
                            {
                            if ( state.backtracking==0 ) {

                              								markLeaf(elementTypeProvider.getCSSType_TypeINTKeyword_3_1_0_0_0ElementType());
                              							
                            }
                            lv_type_35_0=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneLeaf(lv_type_35_0);
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalCssExtDsl.g:869:6: (this_WS_36= RULE_WS )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_WS) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:870:7: this_WS_36= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_3_1_0_1ElementType());
                            	      						
                            	    }
                            	    this_WS_36=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_WS_36);
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalCssExtDsl.g:880:5: ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* )
                            {
                            // PsiInternalCssExtDsl.g:880:5: ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* )
                            // PsiInternalCssExtDsl.g:881:6: ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:881:6: ( (lv_type_37_0= '@NUM' ) )
                            // PsiInternalCssExtDsl.g:882:7: (lv_type_37_0= '@NUM' )
                            {
                            // PsiInternalCssExtDsl.g:882:7: (lv_type_37_0= '@NUM' )
                            // PsiInternalCssExtDsl.g:883:8: lv_type_37_0= '@NUM'
                            {
                            if ( state.backtracking==0 ) {

                              								markLeaf(elementTypeProvider.getCSSType_TypeNUMKeyword_3_1_1_0_0ElementType());
                              							
                            }
                            lv_type_37_0=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneLeaf(lv_type_37_0);
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalCssExtDsl.g:898:6: (this_WS_38= RULE_WS )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_WS) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:899:7: this_WS_38= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_3_1_1_1ElementType());
                            	      						
                            	    }
                            	    this_WS_38=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_WS_38);
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 3 :
                            // PsiInternalCssExtDsl.g:909:5: ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* )
                            {
                            // PsiInternalCssExtDsl.g:909:5: ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* )
                            // PsiInternalCssExtDsl.g:910:6: ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:910:6: ( (lv_type_39_0= '@STRING' ) )
                            // PsiInternalCssExtDsl.g:911:7: (lv_type_39_0= '@STRING' )
                            {
                            // PsiInternalCssExtDsl.g:911:7: (lv_type_39_0= '@STRING' )
                            // PsiInternalCssExtDsl.g:912:8: lv_type_39_0= '@STRING'
                            {
                            if ( state.backtracking==0 ) {

                              								markLeaf(elementTypeProvider.getCSSType_TypeSTRINGKeyword_3_1_2_0_0ElementType());
                              							
                            }
                            lv_type_39_0=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneLeaf(lv_type_39_0);
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalCssExtDsl.g:927:6: (this_WS_40= RULE_WS )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_WS) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:928:7: this_WS_40= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_3_1_2_1ElementType());
                            	      						
                            	    }
                            	    this_WS_40=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_WS_40);
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 4 :
                            // PsiInternalCssExtDsl.g:938:5: ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* )
                            {
                            // PsiInternalCssExtDsl.g:938:5: ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* )
                            // PsiInternalCssExtDsl.g:939:6: ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )*
                            {
                            // PsiInternalCssExtDsl.g:939:6: ( (lv_type_41_0= '@URL' ) )
                            // PsiInternalCssExtDsl.g:940:7: (lv_type_41_0= '@URL' )
                            {
                            // PsiInternalCssExtDsl.g:940:7: (lv_type_41_0= '@URL' )
                            // PsiInternalCssExtDsl.g:941:8: lv_type_41_0= '@URL'
                            {
                            if ( state.backtracking==0 ) {

                              								markLeaf(elementTypeProvider.getCSSType_TypeURLKeyword_3_1_3_0_0ElementType());
                              							
                            }
                            lv_type_41_0=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								doneLeaf(lv_type_41_0);
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (!current) {
                              									associateWithSemanticElement();
                              									current = true;
                              								}
                              							
                            }

                            }


                            }

                            // PsiInternalCssExtDsl.g:956:6: (this_WS_42= RULE_WS )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_WS) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // PsiInternalCssExtDsl.g:957:7: this_WS_42= RULE_WS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							markLeaf(elementTypeProvider.getCSSType_WSTerminalRuleCall_3_1_3_1ElementType());
                            	      						
                            	    }
                            	    this_WS_42=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							doneLeaf(this_WS_42);
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }


                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // PsiInternalCssExtDsl.g:975:1: entryRuleElementDefinition returns [Boolean current=false] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final Boolean entryRuleElementDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleElementDefinition = null;


        try {
            // PsiInternalCssExtDsl.g:975:59: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // PsiInternalCssExtDsl.g:976:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getElementDefinitionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementDefinition=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDefinition; 
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
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // PsiInternalCssExtDsl.g:982:1: ruleElementDefinition returns [Boolean current=false] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) ;
    public final Boolean ruleElementDefinition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_styleclass_8_0=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Boolean lv_doku_1_0 = null;

        Boolean lv_name_2_0 = null;

        Boolean lv_properties_10_0 = null;

        Boolean lv_pseudoClasses_11_0 = null;

        Boolean lv_substructures_12_0 = null;


        try {
            // PsiInternalCssExtDsl.g:983:1: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) )
            // PsiInternalCssExtDsl.g:984:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            {
            // PsiInternalCssExtDsl.g:984:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            // PsiInternalCssExtDsl.g:985:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}'
            {
            // PsiInternalCssExtDsl.g:985:3: ()
            // PsiInternalCssExtDsl.g:986:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getElementDefinition_ElementDefinitionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:992:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_JDOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalCssExtDsl.g:993:4: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:993:4: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:994:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getElementDefinition_DokuDokuParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

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

            // PsiInternalCssExtDsl.g:1007:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:1008:4: (lv_name_2_0= ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:1008:4: (lv_name_2_0= ruleQualifiedName )
            // PsiInternalCssExtDsl.g:1009:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getElementDefinition_NameQualifiedNameParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleQualifiedName();

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

            // PsiInternalCssExtDsl.g:1022:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1023:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getElementDefinition_ExtendsKeyword_3_0ElementType());
                      			
                    }
                    otherlv_3=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_3);
                      			
                    }
                    // PsiInternalCssExtDsl.g:1030:4: ( ( ruleQualifiedName ) )
                    // PsiInternalCssExtDsl.g:1031:5: ( ruleQualifiedName )
                    {
                    // PsiInternalCssExtDsl.g:1031:5: ( ruleQualifiedName )
                    // PsiInternalCssExtDsl.g:1032:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getElementDefinition_SuperElementDefinitionCrossReference_3_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }

                    // PsiInternalCssExtDsl.g:1047:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1048:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getElementDefinition_CommaKeyword_3_2_0ElementType());
                    	      				
                    	    }
                    	    otherlv_5=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_5);
                    	      				
                    	    }
                    	    // PsiInternalCssExtDsl.g:1055:5: ( ( ruleQualifiedName ) )
                    	    // PsiInternalCssExtDsl.g:1056:6: ( ruleQualifiedName )
                    	    {
                    	    // PsiInternalCssExtDsl.g:1056:6: ( ruleQualifiedName )
                    	    // PsiInternalCssExtDsl.g:1057:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getElementDefinition_SuperElementDefinitionCrossReference_3_2_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalCssExtDsl.g:1074:3: (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1075:4: otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getElementDefinition_StyleclassKeyword_4_0ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }
                    // PsiInternalCssExtDsl.g:1082:4: ( (lv_styleclass_8_0= RULE_ID ) )
                    // PsiInternalCssExtDsl.g:1083:5: (lv_styleclass_8_0= RULE_ID )
                    {
                    // PsiInternalCssExtDsl.g:1083:5: (lv_styleclass_8_0= RULE_ID )
                    // PsiInternalCssExtDsl.g:1084:6: lv_styleclass_8_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getElementDefinition_StyleclassIDTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_styleclass_8_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_styleclass_8_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getElementDefinition_LeftCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_9=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_9);
              		
            }
            // PsiInternalCssExtDsl.g:1107:3: ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )*
            loop34:
            do {
                int alt34=4;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    switch ( input.LA(2) ) {
                    case 46:
                        {
                        alt34=3;
                        }
                        break;
                    case RULE_PSEUDO:
                        {
                        alt34=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt34=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_PSEUDO:
                    {
                    alt34=2;
                    }
                    break;
                case 46:
                    {
                    alt34=3;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:1108:4: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    {
            	    // PsiInternalCssExtDsl.g:1108:4: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    // PsiInternalCssExtDsl.g:1109:5: (lv_properties_10_0= rulePropertyDefinition )
            	    {
            	    // PsiInternalCssExtDsl.g:1109:5: (lv_properties_10_0= rulePropertyDefinition )
            	    // PsiInternalCssExtDsl.g:1110:6: lv_properties_10_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getElementDefinition_PropertiesPropertyDefinitionParserRuleCall_6_0_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_properties_10_0=rulePropertyDefinition();

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
            	    // PsiInternalCssExtDsl.g:1124:4: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    {
            	    // PsiInternalCssExtDsl.g:1124:4: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    // PsiInternalCssExtDsl.g:1125:5: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    {
            	    // PsiInternalCssExtDsl.g:1125:5: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    // PsiInternalCssExtDsl.g:1126:6: lv_pseudoClasses_11_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getElementDefinition_PseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_pseudoClasses_11_0=rulePseudoClassDefinition();

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
            	    // PsiInternalCssExtDsl.g:1140:4: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    {
            	    // PsiInternalCssExtDsl.g:1140:4: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    // PsiInternalCssExtDsl.g:1141:5: (lv_substructures_12_0= ruleSubstructure )
            	    {
            	    // PsiInternalCssExtDsl.g:1141:5: (lv_substructures_12_0= ruleSubstructure )
            	    // PsiInternalCssExtDsl.g:1142:6: lv_substructures_12_0= ruleSubstructure
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getElementDefinition_SubstructuresSubstructureParserRuleCall_6_2_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_substructures_12_0=ruleSubstructure();

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
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getElementDefinition_RightCurlyBracketKeyword_7ElementType());
              		
            }
            otherlv_13=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_13);
              		
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // PsiInternalCssExtDsl.g:1167:1: entryRulePropertyDefinition returns [Boolean current=false] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final Boolean entryRulePropertyDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePropertyDefinition = null;


        try {
            // PsiInternalCssExtDsl.g:1167:60: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // PsiInternalCssExtDsl.g:1168:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPropertyDefinitionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // PsiInternalCssExtDsl.g:1174:1: rulePropertyDefinition returns [Boolean current=false] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) ;
    public final Boolean rulePropertyDefinition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_doku_1_0 = null;

        Boolean lv_name_2_0 = null;

        Boolean lv_rule_3_0 = null;

        Boolean lv_default_5_0 = null;


        try {
            // PsiInternalCssExtDsl.g:1175:1: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) )
            // PsiInternalCssExtDsl.g:1176:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            {
            // PsiInternalCssExtDsl.g:1176:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            // PsiInternalCssExtDsl.g:1177:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';'
            {
            // PsiInternalCssExtDsl.g:1177:3: ()
            // PsiInternalCssExtDsl.g:1178:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getPropertyDefinition_PropertyDefinitionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:1184:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1185:4: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:1185:4: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:1186:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getPropertyDefinition_DokuDokuParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

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

            // PsiInternalCssExtDsl.g:1199:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:1200:4: (lv_name_2_0= ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:1200:4: (lv_name_2_0= ruleQualifiedName )
            // PsiInternalCssExtDsl.g:1201:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getPropertyDefinition_NameQualifiedNameParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_2_0=ruleQualifiedName();

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

            // PsiInternalCssExtDsl.g:1214:3: ( (lv_rule_3_0= ruleCSSRuleOr ) )
            // PsiInternalCssExtDsl.g:1215:4: (lv_rule_3_0= ruleCSSRuleOr )
            {
            // PsiInternalCssExtDsl.g:1215:4: (lv_rule_3_0= ruleCSSRuleOr )
            // PsiInternalCssExtDsl.g:1216:5: lv_rule_3_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getPropertyDefinition_RuleCSSRuleOrParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_27);
            lv_rule_3_0=ruleCSSRuleOr();

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

            // PsiInternalCssExtDsl.g:1229:3: (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1230:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPropertyDefinition_DefaultKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCssExtDsl.g:1237:4: ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    // PsiInternalCssExtDsl.g:1238:5: (lv_default_5_0= ruleCSSDefaultValue )
                    {
                    // PsiInternalCssExtDsl.g:1238:5: (lv_default_5_0= ruleCSSDefaultValue )
                    // PsiInternalCssExtDsl.g:1239:6: lv_default_5_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPropertyDefinition_DefaultCSSDefaultValueParserRuleCall_4_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_default_5_0=ruleCSSDefaultValue();

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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPropertyDefinition_SemicolonKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // PsiInternalCssExtDsl.g:1264:1: entryRulePseudoClassDefinition returns [Boolean current=false] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final Boolean entryRulePseudoClassDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePseudoClassDefinition = null;


        try {
            // PsiInternalCssExtDsl.g:1264:63: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // PsiInternalCssExtDsl.g:1265:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPseudoClassDefinitionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePseudoClassDefinition=rulePseudoClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePseudoClassDefinition; 
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
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // PsiInternalCssExtDsl.g:1271:1: rulePseudoClassDefinition returns [Boolean current=false] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) ;
    public final Boolean rulePseudoClassDefinition() throws RecognitionException {
        Boolean current = false;

        Token lv_name_2_0=null;
        Boolean lv_doku_1_0 = null;


        try {
            // PsiInternalCssExtDsl.g:1272:1: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) )
            // PsiInternalCssExtDsl.g:1273:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            {
            // PsiInternalCssExtDsl.g:1273:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            // PsiInternalCssExtDsl.g:1274:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) )
            {
            // PsiInternalCssExtDsl.g:1274:3: ()
            // PsiInternalCssExtDsl.g:1275:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getPseudoClassDefinition_PseudoClassDefinitionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:1281:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_JDOC) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1282:4: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:1282:4: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:1283:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getPseudoClassDefinition_DokuDokuParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_30);
                    lv_doku_1_0=ruleDoku();

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

            // PsiInternalCssExtDsl.g:1296:3: ( (lv_name_2_0= RULE_PSEUDO ) )
            // PsiInternalCssExtDsl.g:1297:4: (lv_name_2_0= RULE_PSEUDO )
            {
            // PsiInternalCssExtDsl.g:1297:4: (lv_name_2_0= RULE_PSEUDO )
            // PsiInternalCssExtDsl.g:1298:5: lv_name_2_0= RULE_PSEUDO
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getPseudoClassDefinition_NamePSEUDOTerminalRuleCall_2_0ElementType());
              				
            }
            lv_name_2_0=(Token)match(input,RULE_PSEUDO,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_2_0);
              				
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // PsiInternalCssExtDsl.g:1317:1: entryRuleCSSRuleRef returns [Boolean current=false] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final Boolean entryRuleCSSRuleRef() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleRef = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssExtDsl.g:1319:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // PsiInternalCssExtDsl.g:1320:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleRefElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleRef=ruleCSSRuleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRef; 
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
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // PsiInternalCssExtDsl.g:1329:1: ruleCSSRuleRef returns [Boolean current=false] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) ;
    public final Boolean ruleCSSRuleRef() throws RecognitionException {
        Boolean current = false;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_doku_0_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssExtDsl.g:1332:2: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )
            // PsiInternalCssExtDsl.g:1333:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            {
            // PsiInternalCssExtDsl.g:1333:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            // PsiInternalCssExtDsl.g:1334:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>'
            {
            // PsiInternalCssExtDsl.g:1334:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_JDOC) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1335:4: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // PsiInternalCssExtDsl.g:1335:4: ( (lv_doku_0_0= ruleDoku ) )
                    // PsiInternalCssExtDsl.g:1336:5: (lv_doku_0_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:1336:5: (lv_doku_0_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:1337:6: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSRuleRef_DokuDokuParserRuleCall_0_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_doku_0_0=ruleDoku();

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

                    // PsiInternalCssExtDsl.g:1350:4: (this_WS_1= RULE_WS )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_WS) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1351:5: this_WS_1= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleRef_WSTerminalRuleCall_0_1ElementType());
                    	      				
                    	    }
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_1);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCSSRuleRef_LessThanSignKeyword_1ElementType());
              		
            }
            otherlv_2=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssExtDsl.g:1367:3: ( ( ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:1368:4: ( ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:1368:4: ( ruleQualifiedName )
            // PsiInternalCssExtDsl.g:1369:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCSSRuleRef_RefDefinitionCrossReference_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCSSRuleRef_GreaterThanSignKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // PsiInternalCssExtDsl.g:1398:1: entryRuleCSSRuleDefinition returns [Boolean current=false] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final Boolean entryRuleCSSRuleDefinition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleDefinition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1400:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // PsiInternalCssExtDsl.g:1401:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleDefinitionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleDefinition=ruleCSSRuleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleDefinition; 
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
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // PsiInternalCssExtDsl.g:1410:1: ruleCSSRuleDefinition returns [Boolean current=false] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) ;
    public final Boolean ruleCSSRuleDefinition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_3=null;
        Token otherlv_6=null;
        Boolean lv_doku_1_0 = null;

        Boolean lv_name_2_0 = null;

        Boolean lv_rule_4_0 = null;

        Boolean lv_func_5_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1413:2: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) )
            // PsiInternalCssExtDsl.g:1414:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            {
            // PsiInternalCssExtDsl.g:1414:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            // PsiInternalCssExtDsl.g:1415:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';'
            {
            // PsiInternalCssExtDsl.g:1415:3: ()
            // PsiInternalCssExtDsl.g:1416:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleDefinition_CSSRuleDefinitionAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:1422:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_JDOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1423:4: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:1423:4: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:1424:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getCSSRuleDefinition_DokuDokuParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

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

            // PsiInternalCssExtDsl.g:1437:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:1438:4: (lv_name_2_0= ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:1438:4: (lv_name_2_0= ruleQualifiedName )
            // PsiInternalCssExtDsl.g:1439:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCSSRuleDefinition_NameQualifiedNameParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_33);
            lv_name_2_0=ruleQualifiedName();

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

              			markLeaf(elementTypeProvider.getCSSRuleDefinition_EqualsSignKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,37,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalCssExtDsl.g:1459:3: ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_JDOC && LA41_0<=RULE_INT)||LA41_0==RULE_REGEX||LA41_0==22||(LA41_0>=26 && LA41_0<=29)||LA41_0==31||LA41_0==35||LA41_0==43||LA41_0==45) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID||(LA41_2>=RULE_JDOC && LA41_2<=RULE_INT)||LA41_2==RULE_REGEX||LA41_2==18||LA41_2==22||(LA41_2>=26 && LA41_2<=29)||LA41_2==31||(LA41_2>=34 && LA41_2<=35)||(LA41_2>=38 && LA41_2<=43)||LA41_2==45) ) {
                    alt41=1;
                }
                else if ( (LA41_2==23) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1460:4: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    {
                    // PsiInternalCssExtDsl.g:1460:4: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    // PsiInternalCssExtDsl.g:1461:5: (lv_rule_4_0= ruleCSSRuleOr )
                    {
                    // PsiInternalCssExtDsl.g:1461:5: (lv_rule_4_0= ruleCSSRuleOr )
                    // PsiInternalCssExtDsl.g:1462:6: lv_rule_4_0= ruleCSSRuleOr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSRuleDefinition_RuleCSSRuleOrParserRuleCall_4_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_rule_4_0=ruleCSSRuleOr();

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
                    // PsiInternalCssExtDsl.g:1476:4: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    {
                    // PsiInternalCssExtDsl.g:1476:4: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    // PsiInternalCssExtDsl.g:1477:5: (lv_func_5_0= ruleCSSRuleFunc )
                    {
                    // PsiInternalCssExtDsl.g:1477:5: (lv_func_5_0= ruleCSSRuleFunc )
                    // PsiInternalCssExtDsl.g:1478:6: lv_func_5_0= ruleCSSRuleFunc
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSRuleDefinition_FuncCSSRuleFuncParserRuleCall_4_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_func_5_0=ruleCSSRuleFunc();

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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCSSRuleDefinition_SemicolonKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // PsiInternalCssExtDsl.g:1506:1: entryRuleCSSRuleFunc returns [Boolean current=false] : iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF ;
    public final Boolean entryRuleCSSRuleFunc() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleFunc = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1508:2: (iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF )
            // PsiInternalCssExtDsl.g:1509:2: iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleFuncElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleFunc=ruleCSSRuleFunc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleFunc; 
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
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // PsiInternalCssExtDsl.g:1518:1: ruleCSSRuleFunc returns [Boolean current=false] : ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) ;
    public final Boolean ruleCSSRuleFunc() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        Boolean lv_name_1_0 = null;

        Boolean lv_params_4_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1521:2: ( ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) )
            // PsiInternalCssExtDsl.g:1522:2: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            {
            // PsiInternalCssExtDsl.g:1522:2: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            // PsiInternalCssExtDsl.g:1523:3: () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')'
            {
            // PsiInternalCssExtDsl.g:1523:3: ()
            // PsiInternalCssExtDsl.g:1524:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleFunc_CSSRuleFuncAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:1530:3: ( (lv_name_1_0= ruleValidID ) )
            // PsiInternalCssExtDsl.g:1531:4: (lv_name_1_0= ruleValidID )
            {
            // PsiInternalCssExtDsl.g:1531:4: (lv_name_1_0= ruleValidID )
            // PsiInternalCssExtDsl.g:1532:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCSSRuleFunc_NameValidIDParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleValidID();

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

              			markLeaf(elementTypeProvider.getCSSRuleFunc_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssExtDsl.g:1552:3: (this_WS_3= RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:1553:4: this_WS_3= RULE_WS
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getCSSRuleFunc_WSTerminalRuleCall_3ElementType());
            	      			
            	    }
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_WS_3);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // PsiInternalCssExtDsl.g:1561:3: ( (lv_params_4_0= ruleCSSRuleOr ) )
            // PsiInternalCssExtDsl.g:1562:4: (lv_params_4_0= ruleCSSRuleOr )
            {
            // PsiInternalCssExtDsl.g:1562:4: (lv_params_4_0= ruleCSSRuleOr )
            // PsiInternalCssExtDsl.g:1563:5: lv_params_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCSSRuleFunc_ParamsCSSRuleOrParserRuleCall_4_0ElementType());
              				
            }
            pushFollow(FOLLOW_20);
            lv_params_4_0=ruleCSSRuleOr();

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

              			markLeaf(elementTypeProvider.getCSSRuleFunc_RightParenthesisKeyword_5ElementType());
              		
            }
            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // PsiInternalCssExtDsl.g:1590:1: entryRuleCSSRuleOr returns [Boolean current=false] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final Boolean entryRuleCSSRuleOr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleOr = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1592:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // PsiInternalCssExtDsl.g:1593:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleOrElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleOr=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleOr; 
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
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // PsiInternalCssExtDsl.g:1602:1: ruleCSSRuleOr returns [Boolean current=false] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final Boolean ruleCSSRuleOr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_CSSRuleXor_0 = null;

        Boolean lv_ors_3_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1605:2: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // PsiInternalCssExtDsl.g:1606:2: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // PsiInternalCssExtDsl.g:1606:2: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // PsiInternalCssExtDsl.g:1607:3: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getCSSRuleOr_CSSRuleXorParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_35);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleXor_0;
              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:1615:3: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1616:4: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // PsiInternalCssExtDsl.g:1616:4: ()
                    // PsiInternalCssExtDsl.g:1617:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRuleOr_CSSRuleOrOrsAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:1623:4: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==38) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1624:5: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleOr_VerticalLineKeyword_1_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_2=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_2);
                    	      				
                    	    }
                    	    // PsiInternalCssExtDsl.g:1631:5: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // PsiInternalCssExtDsl.g:1632:6: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // PsiInternalCssExtDsl.g:1632:6: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // PsiInternalCssExtDsl.g:1633:7: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getCSSRuleOr_OrsCSSRuleXorParserRuleCall_1_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_ors_3_0=ruleCSSRuleXor();

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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // PsiInternalCssExtDsl.g:1655:1: entryRuleCSSRuleXor returns [Boolean current=false] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final Boolean entryRuleCSSRuleXor() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleXor = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1657:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // PsiInternalCssExtDsl.g:1658:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleXorElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleXor=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleXor; 
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
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // PsiInternalCssExtDsl.g:1667:1: ruleCSSRuleXor returns [Boolean current=false] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final Boolean ruleCSSRuleXor() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_CSSRuleConcat_0 = null;

        Boolean lv_xors_3_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1670:2: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // PsiInternalCssExtDsl.g:1671:2: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // PsiInternalCssExtDsl.g:1671:2: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // PsiInternalCssExtDsl.g:1672:3: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getCSSRuleXor_CSSRuleConcatParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_36);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleConcat_0;
              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:1680:3: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1681:4: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // PsiInternalCssExtDsl.g:1681:4: ()
                    // PsiInternalCssExtDsl.g:1682:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRuleXor_CSSRuleXorXorsAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:1688:4: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==39) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1689:5: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleXor_VerticalLineVerticalLineKeyword_1_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_2=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_2);
                    	      				
                    	    }
                    	    // PsiInternalCssExtDsl.g:1696:5: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // PsiInternalCssExtDsl.g:1697:6: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // PsiInternalCssExtDsl.g:1697:6: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // PsiInternalCssExtDsl.g:1698:7: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getCSSRuleXor_XorsCSSRuleConcatParserRuleCall_1_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_xors_3_0=ruleCSSRuleConcat();

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
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // PsiInternalCssExtDsl.g:1720:1: entryRuleCSSRuleConcat returns [Boolean current=false] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final Boolean entryRuleCSSRuleConcat() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleConcat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1722:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // PsiInternalCssExtDsl.g:1723:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleConcatElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleConcat=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcat; 
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
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // PsiInternalCssExtDsl.g:1732:1: ruleCSSRuleConcat returns [Boolean current=false] : (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) ;
    public final Boolean ruleCSSRuleConcat() throws RecognitionException {
        Boolean current = false;

        Boolean this_CSSRuleConcatWithoutSpace_0 = null;

        Boolean lv_conc_2_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1735:2: ( (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) )
            // PsiInternalCssExtDsl.g:1736:2: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            {
            // PsiInternalCssExtDsl.g:1736:2: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            // PsiInternalCssExtDsl.g:1737:3: this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getCSSRuleConcat_CSSRuleConcatWithoutSpaceParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_37);
            this_CSSRuleConcatWithoutSpace_0=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleConcatWithoutSpace_0;
              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:1745:3: ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||(LA48_0>=RULE_JDOC && LA48_0<=RULE_INT)||LA48_0==RULE_REGEX||LA48_0==22||(LA48_0>=26 && LA48_0<=29)||LA48_0==31||LA48_0==35||LA48_0==43||LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1746:4: () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    {
                    // PsiInternalCssExtDsl.g:1746:4: ()
                    // PsiInternalCssExtDsl.g:1747:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRuleConcat_CSSRuleConcatConcAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:1753:4: ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==RULE_ID||(LA47_0>=RULE_JDOC && LA47_0<=RULE_INT)||LA47_0==RULE_REGEX||LA47_0==22||(LA47_0>=26 && LA47_0<=29)||LA47_0==31||LA47_0==35||LA47_0==43||LA47_0==45) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1754:5: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    {
                    	    // PsiInternalCssExtDsl.g:1754:5: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    // PsiInternalCssExtDsl.g:1755:6: lv_conc_2_0= ruleCSSRuleConcatWithoutSpace
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getCSSRuleConcat_ConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_conc_2_0=ruleCSSRuleConcatWithoutSpace();

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
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // PsiInternalCssExtDsl.g:1776:1: entryRuleCSSRuleConcatWithoutSpace returns [Boolean current=false] : iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF ;
    public final Boolean entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleConcatWithoutSpace = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1778:2: (iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF )
            // PsiInternalCssExtDsl.g:1779:2: iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleConcatWithoutSpaceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleConcatWithoutSpace=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleConcatWithoutSpace; 
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
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // PsiInternalCssExtDsl.g:1788:1: ruleCSSRuleConcatWithoutSpace returns [Boolean current=false] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) ;
    public final Boolean ruleCSSRuleConcatWithoutSpace() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_CSSRulePostfix_0 = null;

        Boolean lv_conc_3_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1791:2: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) )
            // PsiInternalCssExtDsl.g:1792:2: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            {
            // PsiInternalCssExtDsl.g:1792:2: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            // PsiInternalCssExtDsl.g:1793:3: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getCSSRuleConcatWithoutSpace_CSSRulePostfixParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_38);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRulePostfix_0;
              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:1801:3: ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1802:4: () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    {
                    // PsiInternalCssExtDsl.g:1802:4: ()
                    // PsiInternalCssExtDsl.g:1803:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRuleConcatWithoutSpace_CSSRuleConcatWithoutSpaceConcAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:1809:4: (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==40) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:1810:5: otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleConcatWithoutSpace_TildeKeyword_1_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_2=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_2);
                    	      				
                    	    }
                    	    // PsiInternalCssExtDsl.g:1817:5: ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    // PsiInternalCssExtDsl.g:1818:6: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    {
                    	    // PsiInternalCssExtDsl.g:1818:6: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    // PsiInternalCssExtDsl.g:1819:7: lv_conc_3_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getCSSRuleConcatWithoutSpace_ConcCSSRulePostfixParserRuleCall_1_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_conc_3_0=ruleCSSRulePostfix();

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
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


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
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // PsiInternalCssExtDsl.g:1841:1: entryRuleCSSRulePostfix returns [Boolean current=false] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final Boolean entryRuleCSSRulePostfix() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRulePostfix = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1843:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // PsiInternalCssExtDsl.g:1844:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRulePostfixElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRulePostfix=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePostfix; 
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
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // PsiInternalCssExtDsl.g:1853:1: ruleCSSRulePostfix returns [Boolean current=false] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final Boolean ruleCSSRulePostfix() throws RecognitionException {
        Boolean current = false;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        Boolean this_CSSRulePrimary_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1856:2: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // PsiInternalCssExtDsl.g:1857:2: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // PsiInternalCssExtDsl.g:1857:2: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // PsiInternalCssExtDsl.g:1858:3: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getCSSRulePostfix_CSSRulePrimaryParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_39);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRulePrimary_0;
              			doneComposite();
              		
            }
            // PsiInternalCssExtDsl.g:1866:3: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18||(LA52_0>=41 && LA52_0<=42)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalCssExtDsl.g:1867:4: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // PsiInternalCssExtDsl.g:1867:4: ()
                    // PsiInternalCssExtDsl.g:1868:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRulePostfix_CSSRulePostfixRuleAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:1874:4: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // PsiInternalCssExtDsl.g:1875:5: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // PsiInternalCssExtDsl.g:1875:5: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // PsiInternalCssExtDsl.g:1876:6: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // PsiInternalCssExtDsl.g:1876:6: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    int alt51=3;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt51=1;
                        }
                        break;
                    case 41:
                        {
                        alt51=2;
                        }
                        break;
                    case 42:
                        {
                        alt51=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // PsiInternalCssExtDsl.g:1877:7: lv_cardinality_2_1= '*'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getCSSRulePostfix_CardinalityAsteriskKeyword_1_1_0_0ElementType());
                              						
                            }
                            lv_cardinality_2_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_cardinality_2_1);
                              						
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
                            // PsiInternalCssExtDsl.g:1891:7: lv_cardinality_2_2= '+'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getCSSRulePostfix_CardinalityPlusSignKeyword_1_1_0_1ElementType());
                              						
                            }
                            lv_cardinality_2_2=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_cardinality_2_2);
                              						
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
                            // PsiInternalCssExtDsl.g:1905:7: lv_cardinality_2_3= '?'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getCSSRulePostfix_CardinalityQuestionMarkKeyword_1_1_0_2ElementType());
                              						
                            }
                            lv_cardinality_2_3=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_cardinality_2_3);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }
                            break;

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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // PsiInternalCssExtDsl.g:1929:1: entryRuleCSSRuleBracket returns [Boolean current=false] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final Boolean entryRuleCSSRuleBracket() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleBracket = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1931:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // PsiInternalCssExtDsl.g:1932:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleBracketElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleBracket=ruleCSSRuleBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleBracket; 
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
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // PsiInternalCssExtDsl.g:1941:1: ruleCSSRuleBracket returns [Boolean current=false] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final Boolean ruleCSSRuleBracket() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_inner_2_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1944:2: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // PsiInternalCssExtDsl.g:1945:2: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // PsiInternalCssExtDsl.g:1945:2: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // PsiInternalCssExtDsl.g:1946:3: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // PsiInternalCssExtDsl.g:1946:3: ()
            // PsiInternalCssExtDsl.g:1947:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleBracket_CSSRuleBracketAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCSSRuleBracket_LeftSquareBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,43,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssExtDsl.g:1960:3: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // PsiInternalCssExtDsl.g:1961:4: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // PsiInternalCssExtDsl.g:1961:4: (lv_inner_2_0= ruleCSSRuleOr )
            // PsiInternalCssExtDsl.g:1962:5: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCSSRuleBracket_InnerCSSRuleOrParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_40);
            lv_inner_2_0=ruleCSSRuleOr();

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

              			markLeaf(elementTypeProvider.getCSSRuleBracket_RightSquareBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // PsiInternalCssExtDsl.g:1989:1: entryRuleCSSRulePrimary returns [Boolean current=false] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final Boolean entryRuleCSSRulePrimary() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRulePrimary = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:1991:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // PsiInternalCssExtDsl.g:1992:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRulePrimaryElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRulePrimary=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRulePrimary; 
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
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // PsiInternalCssExtDsl.g:2001:1: ruleCSSRulePrimary returns [Boolean current=false] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final Boolean ruleCSSRulePrimary() throws RecognitionException {
        Boolean current = false;

        Token lv_value_7_0=null;
        Boolean this_CSSRuleRef_0 = null;

        Boolean this_CSSRuleBracket_1 = null;

        Boolean this_CSSRuleLiteral_2 = null;

        Boolean this_CSSRuleSymbol_3 = null;

        Boolean this_CSSBaseType_4 = null;

        Boolean this_CSSRuleRegex_5 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:2004:2: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // PsiInternalCssExtDsl.g:2005:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // PsiInternalCssExtDsl.g:2005:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt53=7;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2006:3: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSRuleRefParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleRef_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleRef_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCssExtDsl.g:2015:3: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSRuleBracketParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleBracket_1=ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleBracket_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCssExtDsl.g:2024:3: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSRuleLiteralParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleLiteral_2=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleLiteral_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCssExtDsl.g:2033:3: this_CSSRuleSymbol_3= ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSRuleSymbolParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleSymbol_3=ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleSymbol_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 5 :
                    // PsiInternalCssExtDsl.g:2042:3: this_CSSBaseType_4= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSBaseTypeParserRuleCall_4ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSBaseType_4=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSBaseType_4;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 6 :
                    // PsiInternalCssExtDsl.g:2051:3: this_CSSRuleRegex_5= ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getCSSRulePrimary_CSSRuleRegexParserRuleCall_5ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleRegex_5=ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleRegex_5;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 7 :
                    // PsiInternalCssExtDsl.g:2060:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // PsiInternalCssExtDsl.g:2060:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // PsiInternalCssExtDsl.g:2061:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // PsiInternalCssExtDsl.g:2061:4: ()
                    // PsiInternalCssExtDsl.g:2062:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSRulePrimary_CSSNumLiteralAction_6_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:2068:4: ( (lv_value_7_0= RULE_INT ) )
                    // PsiInternalCssExtDsl.g:2069:5: (lv_value_7_0= RULE_INT )
                    {
                    // PsiInternalCssExtDsl.g:2069:5: (lv_value_7_0= RULE_INT )
                    // PsiInternalCssExtDsl.g:2070:6: lv_value_7_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSRulePrimary_ValueINTTerminalRuleCall_6_1_0ElementType());
                      					
                    }
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_7_0);
                      					
                    }

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // PsiInternalCssExtDsl.g:2093:1: entryRuleCSSRuleRegex returns [Boolean current=false] : iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF ;
    public final Boolean entryRuleCSSRuleRegex() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleRegex = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:2095:2: (iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF )
            // PsiInternalCssExtDsl.g:2096:2: iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleRegexElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleRegex=ruleCSSRuleRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleRegex; 
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
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // PsiInternalCssExtDsl.g:2105:1: ruleCSSRuleRegex returns [Boolean current=false] : ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) ;
    public final Boolean ruleCSSRuleRegex() throws RecognitionException {
        Boolean current = false;

        Token lv_regex_1_0=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // PsiInternalCssExtDsl.g:2108:2: ( ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) )
            // PsiInternalCssExtDsl.g:2109:2: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            {
            // PsiInternalCssExtDsl.g:2109:2: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            // PsiInternalCssExtDsl.g:2110:3: () ( (lv_regex_1_0= RULE_REGEX ) )
            {
            // PsiInternalCssExtDsl.g:2110:3: ()
            // PsiInternalCssExtDsl.g:2111:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleRegex_CSSRuleRegexAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:2117:3: ( (lv_regex_1_0= RULE_REGEX ) )
            // PsiInternalCssExtDsl.g:2118:4: (lv_regex_1_0= RULE_REGEX )
            {
            // PsiInternalCssExtDsl.g:2118:4: (lv_regex_1_0= RULE_REGEX )
            // PsiInternalCssExtDsl.g:2119:5: lv_regex_1_0= RULE_REGEX
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getCSSRuleRegex_RegexREGEXTerminalRuleCall_1_0ElementType());
              				
            }
            lv_regex_1_0=(Token)match(input,RULE_REGEX,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_regex_1_0);
              				
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
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // PsiInternalCssExtDsl.g:2141:1: entryRuleCSSRuleLiteral returns [Boolean current=false] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final Boolean entryRuleCSSRuleLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleLiteral = null;


        try {
            // PsiInternalCssExtDsl.g:2141:56: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // PsiInternalCssExtDsl.g:2142:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleLiteralElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleLiteral=ruleCSSRuleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleLiteral; 
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
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // PsiInternalCssExtDsl.g:2148:1: ruleCSSRuleLiteral returns [Boolean current=false] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final Boolean ruleCSSRuleLiteral() throws RecognitionException {
        Boolean current = false;

        Token this_WS_2=null;
        Token lv_value_3_0=null;
        Boolean lv_doku_1_0 = null;


        try {
            // PsiInternalCssExtDsl.g:2149:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) )
            // PsiInternalCssExtDsl.g:2150:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            {
            // PsiInternalCssExtDsl.g:2150:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            // PsiInternalCssExtDsl.g:2151:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) )
            {
            // PsiInternalCssExtDsl.g:2151:3: ()
            // PsiInternalCssExtDsl.g:2152:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleLiteral_CSSRuleLiteralAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:2158:3: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_JDOC) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2159:4: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // PsiInternalCssExtDsl.g:2159:4: ( (lv_doku_1_0= ruleDoku ) )
                    // PsiInternalCssExtDsl.g:2160:5: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:2160:5: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:2161:6: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSRuleLiteral_DokuDokuParserRuleCall_1_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_doku_1_0=ruleDoku();

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

                    // PsiInternalCssExtDsl.g:2174:4: (this_WS_2= RULE_WS )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_WS) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:2175:5: this_WS_2= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleLiteral_WSTerminalRuleCall_1_1ElementType());
                    	      				
                    	    }
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_2);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalCssExtDsl.g:2184:3: ( (lv_value_3_0= RULE_ID ) )
            // PsiInternalCssExtDsl.g:2185:4: (lv_value_3_0= RULE_ID )
            {
            // PsiInternalCssExtDsl.g:2185:4: (lv_value_3_0= RULE_ID )
            // PsiInternalCssExtDsl.g:2186:5: lv_value_3_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getCSSRuleLiteral_ValueIDTerminalRuleCall_2_0ElementType());
              				
            }
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_value_3_0);
              				
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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // PsiInternalCssExtDsl.g:2205:1: entryRuleCSSRuleSymbol returns [Boolean current=false] : iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF ;
    public final Boolean entryRuleCSSRuleSymbol() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSRuleSymbol = null;


        try {
            // PsiInternalCssExtDsl.g:2205:55: (iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF )
            // PsiInternalCssExtDsl.g:2206:2: iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSRuleSymbolElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSRuleSymbol=ruleCSSRuleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSRuleSymbol; 
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
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // PsiInternalCssExtDsl.g:2212:1: ruleCSSRuleSymbol returns [Boolean current=false] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) ;
    public final Boolean ruleCSSRuleSymbol() throws RecognitionException {
        Boolean current = false;

        Token this_WS_2=null;
        Token lv_symbol_3_1=null;
        Token lv_symbol_3_2=null;
        Boolean lv_doku_1_0 = null;


        try {
            // PsiInternalCssExtDsl.g:2213:1: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) )
            // PsiInternalCssExtDsl.g:2214:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            {
            // PsiInternalCssExtDsl.g:2214:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            // PsiInternalCssExtDsl.g:2215:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            {
            // PsiInternalCssExtDsl.g:2215:3: ()
            // PsiInternalCssExtDsl.g:2216:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getCSSRuleSymbol_CSSRuleSymbolAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:2222:3: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_JDOC) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2223:4: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // PsiInternalCssExtDsl.g:2223:4: ( (lv_doku_1_0= ruleDoku ) )
                    // PsiInternalCssExtDsl.g:2224:5: (lv_doku_1_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:2224:5: (lv_doku_1_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:2225:6: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSRuleSymbol_DokuDokuParserRuleCall_1_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_doku_1_0=ruleDoku();

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

                    // PsiInternalCssExtDsl.g:2238:4: (this_WS_2= RULE_WS )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_WS) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:2239:5: this_WS_2= RULE_WS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getCSSRuleSymbol_WSTerminalRuleCall_1_1ElementType());
                    	      				
                    	    }
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(this_WS_2);
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalCssExtDsl.g:2248:3: ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            // PsiInternalCssExtDsl.g:2249:4: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            {
            // PsiInternalCssExtDsl.g:2249:4: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            // PsiInternalCssExtDsl.g:2250:5: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
            {
            // PsiInternalCssExtDsl.g:2250:5: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==31) ) {
                alt58=1;
            }
            else if ( (LA58_0==45) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2251:6: lv_symbol_3_1= ','
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSRuleSymbol_SymbolCommaKeyword_2_0_0ElementType());
                      					
                    }
                    lv_symbol_3_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_symbol_3_1);
                      					
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
                    // PsiInternalCssExtDsl.g:2265:6: lv_symbol_3_2= '%'
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getCSSRuleSymbol_SymbolPercentSignKeyword_2_0_1ElementType());
                      					
                    }
                    lv_symbol_3_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_symbol_3_2);
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // PsiInternalCssExtDsl.g:2285:1: entryRuleCSSDefaultValue returns [Boolean current=false] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final Boolean entryRuleCSSDefaultValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCSSDefaultValue = null;


        try {
            // PsiInternalCssExtDsl.g:2285:57: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // PsiInternalCssExtDsl.g:2286:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCSSDefaultValueElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCSSDefaultValue=ruleCSSDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCSSDefaultValue; 
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
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // PsiInternalCssExtDsl.g:2292:1: ruleCSSDefaultValue returns [Boolean current=false] : ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) ;
    public final Boolean ruleCSSDefaultValue() throws RecognitionException {
        Boolean current = false;

        Token lv_ival_2_0=null;
        Token lv_dval_3_0=null;
        Token lv_sval_4_0=null;
        Boolean lv_val_1_0 = null;


        try {
            // PsiInternalCssExtDsl.g:2293:1: ( ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) )
            // PsiInternalCssExtDsl.g:2294:2: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            {
            // PsiInternalCssExtDsl.g:2294:2: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_JDOC:
                {
                alt59=1;
                }
                break;
            case RULE_INT:
                {
                alt59=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt59=3;
                }
                break;
            case RULE_STRING:
                {
                alt59=4;
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
                    // PsiInternalCssExtDsl.g:2295:3: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    {
                    // PsiInternalCssExtDsl.g:2295:3: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    // PsiInternalCssExtDsl.g:2296:4: () ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    {
                    // PsiInternalCssExtDsl.g:2296:4: ()
                    // PsiInternalCssExtDsl.g:2297:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getCSSDefaultValue_CSSDefaultValueAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCssExtDsl.g:2303:4: ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    // PsiInternalCssExtDsl.g:2304:5: (lv_val_1_0= ruleCSSRuleLiteral )
                    {
                    // PsiInternalCssExtDsl.g:2304:5: (lv_val_1_0= ruleCSSRuleLiteral )
                    // PsiInternalCssExtDsl.g:2305:6: lv_val_1_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getCSSDefaultValue_ValCSSRuleLiteralParserRuleCall_0_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleCSSRuleLiteral();

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
                    // PsiInternalCssExtDsl.g:2320:3: ( (lv_ival_2_0= RULE_INT ) )
                    {
                    // PsiInternalCssExtDsl.g:2320:3: ( (lv_ival_2_0= RULE_INT ) )
                    // PsiInternalCssExtDsl.g:2321:4: (lv_ival_2_0= RULE_INT )
                    {
                    // PsiInternalCssExtDsl.g:2321:4: (lv_ival_2_0= RULE_INT )
                    // PsiInternalCssExtDsl.g:2322:5: lv_ival_2_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getCSSDefaultValue_IvalINTTerminalRuleCall_1_0ElementType());
                      				
                    }
                    lv_ival_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_ival_2_0);
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalCssExtDsl.g:2338:3: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    {
                    // PsiInternalCssExtDsl.g:2338:3: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    // PsiInternalCssExtDsl.g:2339:4: (lv_dval_3_0= RULE_DOUBLE )
                    {
                    // PsiInternalCssExtDsl.g:2339:4: (lv_dval_3_0= RULE_DOUBLE )
                    // PsiInternalCssExtDsl.g:2340:5: lv_dval_3_0= RULE_DOUBLE
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getCSSDefaultValue_DvalDOUBLETerminalRuleCall_2_0ElementType());
                      				
                    }
                    lv_dval_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_dval_3_0);
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalCssExtDsl.g:2356:3: ( (lv_sval_4_0= RULE_STRING ) )
                    {
                    // PsiInternalCssExtDsl.g:2356:3: ( (lv_sval_4_0= RULE_STRING ) )
                    // PsiInternalCssExtDsl.g:2357:4: (lv_sval_4_0= RULE_STRING )
                    {
                    // PsiInternalCssExtDsl.g:2357:4: (lv_sval_4_0= RULE_STRING )
                    // PsiInternalCssExtDsl.g:2358:5: lv_sval_4_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getCSSDefaultValue_SvalSTRINGTerminalRuleCall_3_0ElementType());
                      				
                    }
                    lv_sval_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if(!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_sval_4_0);
                      				
                    }

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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // PsiInternalCssExtDsl.g:2377:1: entryRuleSubstructureSelector returns [Boolean current=false] : iv_ruleSubstructureSelector= ruleSubstructureSelector EOF ;
    public final Boolean entryRuleSubstructureSelector() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubstructureSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssExtDsl.g:2379:2: (iv_ruleSubstructureSelector= ruleSubstructureSelector EOF )
            // PsiInternalCssExtDsl.g:2380:2: iv_ruleSubstructureSelector= ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSubstructureSelectorElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubstructureSelector=ruleSubstructureSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureSelector; 
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
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // PsiInternalCssExtDsl.g:2389:1: ruleSubstructureSelector returns [Boolean current=false] : ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) ;
    public final Boolean ruleSubstructureSelector() throws RecognitionException {
        Boolean current = false;

        Token lv_selectorName_1_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;


        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // PsiInternalCssExtDsl.g:2392:2: ( ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) )
            // PsiInternalCssExtDsl.g:2393:2: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            {
            // PsiInternalCssExtDsl.g:2393:2: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            // PsiInternalCssExtDsl.g:2394:3: () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            {
            // PsiInternalCssExtDsl.g:2394:3: ()
            // PsiInternalCssExtDsl.g:2395:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getSubstructureSelector_SubstructureSelectorAction_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            // PsiInternalCssExtDsl.g:2401:3: ( (lv_selectorName_1_0= RULE_ID ) )
            // PsiInternalCssExtDsl.g:2402:4: (lv_selectorName_1_0= RULE_ID )
            {
            // PsiInternalCssExtDsl.g:2402:4: (lv_selectorName_1_0= RULE_ID )
            // PsiInternalCssExtDsl.g:2403:5: lv_selectorName_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getSubstructureSelector_SelectorNameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_selectorName_1_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_selectorName_1_0);
              				
            }

            }


            }

            // PsiInternalCssExtDsl.g:2418:3: (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2419:4: otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getSubstructureSelector_LeftSquareBracketKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCssExtDsl.g:2426:4: ( (lv_var_3_0= RULE_ID ) )
                    // PsiInternalCssExtDsl.g:2427:5: (lv_var_3_0= RULE_ID )
                    {
                    // PsiInternalCssExtDsl.g:2427:5: (lv_var_3_0= RULE_ID )
                    // PsiInternalCssExtDsl.g:2428:6: lv_var_3_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getSubstructureSelector_VarIDTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_var_3_0);
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getSubstructureSelector_RightSquareBracketKeyword_2_2ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
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
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // PsiInternalCssExtDsl.g:2458:1: entryRuleSubstructure returns [Boolean current=false] : iv_ruleSubstructure= ruleSubstructure EOF ;
    public final Boolean entryRuleSubstructure() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubstructure = null;


        try {
            // PsiInternalCssExtDsl.g:2458:54: (iv_ruleSubstructure= ruleSubstructure EOF )
            // PsiInternalCssExtDsl.g:2459:2: iv_ruleSubstructure= ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSubstructureElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubstructure=ruleSubstructure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructure; 
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
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // PsiInternalCssExtDsl.g:2465:1: ruleSubstructure returns [Boolean current=false] : ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) ;
    public final Boolean ruleSubstructure() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Boolean lv_doku_0_0 = null;

        Boolean lv_childs_4_0 = null;


        try {
            // PsiInternalCssExtDsl.g:2466:1: ( ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) )
            // PsiInternalCssExtDsl.g:2467:2: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            {
            // PsiInternalCssExtDsl.g:2467:2: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            // PsiInternalCssExtDsl.g:2468:3: ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}'
            {
            // PsiInternalCssExtDsl.g:2468:3: ( (lv_doku_0_0= ruleDoku ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_JDOC) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2469:4: (lv_doku_0_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:2469:4: (lv_doku_0_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:2470:5: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getSubstructure_DokuDokuParserRuleCall_0_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_doku_0_0=ruleDoku();

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

              			markLeaf(elementTypeProvider.getSubstructure_SubstructureKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCssExtDsl.g:2490:3: ( (lv_name_2_0= RULE_ID ) )
            // PsiInternalCssExtDsl.g:2491:4: (lv_name_2_0= RULE_ID )
            {
            // PsiInternalCssExtDsl.g:2491:4: (lv_name_2_0= RULE_ID )
            // PsiInternalCssExtDsl.g:2492:5: lv_name_2_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getSubstructure_NameIDTerminalRuleCall_2_0ElementType());
              				
            }
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_2_0);
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getSubstructure_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalCssExtDsl.g:2514:3: ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID||LA62_0==RULE_JDOC) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:2515:4: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    {
            	    // PsiInternalCssExtDsl.g:2515:4: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    // PsiInternalCssExtDsl.g:2516:5: lv_childs_4_0= ruleSubstructureStyleclass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getSubstructure_ChildsSubstructureStyleclassParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_childs_4_0=ruleSubstructureStyleclass();

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
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getSubstructure_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // PsiInternalCssExtDsl.g:2540:1: entryRuleSubstructureStyleclass returns [Boolean current=false] : iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF ;
    public final Boolean entryRuleSubstructureStyleclass() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSubstructureStyleclass = null;


        try {
            // PsiInternalCssExtDsl.g:2540:64: (iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF )
            // PsiInternalCssExtDsl.g:2541:2: iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSubstructureStyleclassElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubstructureStyleclass=ruleSubstructureStyleclass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstructureStyleclass; 
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
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // PsiInternalCssExtDsl.g:2547:1: ruleSubstructureStyleclass returns [Boolean current=false] : ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) ;
    public final Boolean ruleSubstructureStyleclass() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_doku_0_0 = null;

        Boolean lv_selectors_3_0 = null;

        Boolean lv_childs_5_0 = null;


        try {
            // PsiInternalCssExtDsl.g:2548:1: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) )
            // PsiInternalCssExtDsl.g:2549:2: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            {
            // PsiInternalCssExtDsl.g:2549:2: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            // PsiInternalCssExtDsl.g:2550:3: ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            {
            // PsiInternalCssExtDsl.g:2550:3: ( (lv_doku_0_0= ruleDoku ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_JDOC) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2551:4: (lv_doku_0_0= ruleDoku )
                    {
                    // PsiInternalCssExtDsl.g:2551:4: (lv_doku_0_0= ruleDoku )
                    // PsiInternalCssExtDsl.g:2552:5: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getSubstructureStyleclass_DokuDokuParserRuleCall_0_0ElementType());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_0_0=ruleDoku();

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

            // PsiInternalCssExtDsl.g:2565:3: ( ( ruleQualifiedName ) )
            // PsiInternalCssExtDsl.g:2566:4: ( ruleQualifiedName )
            {
            // PsiInternalCssExtDsl.g:2566:4: ( ruleQualifiedName )
            // PsiInternalCssExtDsl.g:2567:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getSubstructureStyleclass_ElementElementDefinitionCrossReference_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getSubstructureStyleclass_StyleclassKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCssExtDsl.g:2589:3: ( (lv_selectors_3_0= ruleSubstructureSelector ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==EOF||LA64_2==RULE_ID||LA64_2==RULE_JDOC||(LA64_2>=20 && LA64_2<=21)||LA64_2==43) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // PsiInternalCssExtDsl.g:2590:4: (lv_selectors_3_0= ruleSubstructureSelector )
            	    {
            	    // PsiInternalCssExtDsl.g:2590:4: (lv_selectors_3_0= ruleSubstructureSelector )
            	    // PsiInternalCssExtDsl.g:2591:5: lv_selectors_3_0= ruleSubstructureSelector
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getSubstructureStyleclass_SelectorsSubstructureSelectorParserRuleCall_3_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_selectors_3_0=ruleSubstructureSelector();

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
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            // PsiInternalCssExtDsl.g:2604:3: (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==20) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalCssExtDsl.g:2605:4: otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getSubstructureStyleclass_LeftCurlyBracketKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCssExtDsl.g:2612:4: ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_ID||LA65_0==RULE_JDOC) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // PsiInternalCssExtDsl.g:2613:5: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    {
                    	    // PsiInternalCssExtDsl.g:2613:5: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    // PsiInternalCssExtDsl.g:2614:6: lv_childs_5_0= ruleSubstructureStyleclass
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getSubstructureStyleclass_ChildsSubstructureStyleclassParserRuleCall_4_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_childs_5_0=ruleSubstructureStyleclass();

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
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getSubstructureStyleclass_RightCurlyBracketKeyword_4_2ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
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
        }
        return current;
    }
    // $ANTLR end "ruleSubstructureStyleclass"

    // $ANTLR start synpred1_PsiInternalCssExtDsl
    public final void synpred1_PsiInternalCssExtDsl_fragment() throws RecognitionException {   
        // PsiInternalCssExtDsl.g:194:5: ( '.' )
        // PsiInternalCssExtDsl.g:194:6: '.'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_PsiInternalCssExtDsl

    // Delegated rules

    public final boolean synpred1_PsiInternalCssExtDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_PsiInternalCssExtDsl_fragment(); // can never throw exception
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
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\5\1\21\1\uffff\1\5\2\uffff\1\21";
    static final String dfa_3s = "\1\25\1\uffff\1\23\1\45\1\uffff\1\5\2\uffff\1\45";
    static final String dfa_4s = "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\2\13\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3\1\4\14\uffff\1\4",
            "\1\5\2\uffff\1\6\11\uffff\1\6\1\uffff\1\6\4\uffff\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\6\11\uffff\1\6\1\uffff\1\6\4\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 317:3: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*";
        }
    }
    static final String dfa_7s = "\2\uffff\2\5\5\uffff";
    static final String dfa_8s = "\1\7\1\6\2\5\2\uffff\1\6\2\uffff";
    static final String dfa_9s = "\2\35\2\55\2\uffff\1\35\2\uffff";
    static final String dfa_10s = "\4\uffff\1\3\1\4\1\uffff\1\1\1\2";
    static final String[] dfa_11s = {
            "\1\1\16\uffff\1\2\3\uffff\1\3\1\4\2\5",
            "\1\6\17\uffff\1\2\3\uffff\1\3\1\4\2\5",
            "\4\5\2\uffff\1\5\6\uffff\1\5\3\uffff\1\5\1\7\1\uffff\5\5\1\uffff\1\5\1\uffff\3\5\2\uffff\10\5",
            "\4\5\2\uffff\1\5\6\uffff\1\5\3\uffff\1\5\1\10\1\uffff\5\5\1\uffff\1\5\1\uffff\3\5\2\uffff\10\5",
            "",
            "",
            "\1\6\17\uffff\1\2\3\uffff\1\3\1\4\2\5",
            "",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "452:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )";
        }
    }
    static final String dfa_12s = "\12\uffff";
    static final String dfa_13s = "\2\5\7\uffff\1\5";
    static final String dfa_14s = "\2\55\7\uffff\1\55";
    static final String dfa_15s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String dfa_16s = "\12\uffff}>";
    static final String[] dfa_17s = {
            "\1\4\1\uffff\1\1\1\10\2\uffff\1\7\12\uffff\1\6\3\uffff\4\6\1\uffff\1\5\3\uffff\1\2\7\uffff\1\3\1\uffff\1\5",
            "\1\4\1\11\17\uffff\1\6\3\uffff\4\6\1\uffff\1\5\3\uffff\1\2\11\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\4\1\11\17\uffff\1\6\3\uffff\4\6\1\uffff\1\5\3\uffff\1\2\11\uffff\1\5"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "2005:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000090082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002800A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000034400040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000140100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00004000002004A0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00002808BC4009A0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000003B0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00002808BC4009E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00002808BC4009A2L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000060000040002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200080000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000002000A0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000100022L});

}