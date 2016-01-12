package org.eclipse.fx.ide.css.cssext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.fx.ide.css.cssext.services.CssExtDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCssExtDslParser extends AbstractInternalAntlrParser {
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


        public InternalCssExtDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssExtDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssExtDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCssExtDsl.g"; }



     	private CssExtDslGrammarAccess grammarAccess;

        public InternalCssExtDslParser(TokenStream input, CssExtDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CssExtension";
       	}

       	@Override
       	protected CssExtDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCssExtension"
    // InternalCssExtDsl.g:64:1: entryRuleCssExtension returns [EObject current=null] : iv_ruleCssExtension= ruleCssExtension EOF ;
    public final EObject entryRuleCssExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCssExtension = null;


        try {
            // InternalCssExtDsl.g:64:53: (iv_ruleCssExtension= ruleCssExtension EOF )
            // InternalCssExtDsl.g:65:2: iv_ruleCssExtension= ruleCssExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCssExtensionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCssExtension"


    // $ANTLR start "ruleCssExtension"
    // InternalCssExtDsl.g:71:1: ruleCssExtension returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? ) ;
    public final EObject ruleCssExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_packageDef_3_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:77:2: ( (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? ) )
            // InternalCssExtDsl.g:78:2: (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? )
            {
            // InternalCssExtDsl.g:78:2: (otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )? )
            // InternalCssExtDsl.g:79:3: otherlv_0= 'namespace' ( (lv_namespace_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_packageDef_3_0= rulePackageDefinition ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCssExtensionAccess().getNamespaceKeyword_0());
              		
            }
            // InternalCssExtDsl.g:83:3: ( (lv_namespace_1_0= RULE_STRING ) )
            // InternalCssExtDsl.g:84:4: (lv_namespace_1_0= RULE_STRING )
            {
            // InternalCssExtDsl.g:84:4: (lv_namespace_1_0= RULE_STRING )
            // InternalCssExtDsl.g:85:5: lv_namespace_1_0= RULE_STRING
            {
            lv_namespace_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_namespace_1_0, grammarAccess.getCssExtensionAccess().getNamespaceSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCssExtensionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"namespace",
              						lv_namespace_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalCssExtDsl.g:101:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCssExtDsl.g:102:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalCssExtDsl.g:102:4: (lv_imports_2_0= ruleImport )
            	    // InternalCssExtDsl.g:103:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCssExtensionAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCssExtensionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
            	      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCssExtDsl.g:120:3: ( (lv_packageDef_3_0= rulePackageDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_JDOC||LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCssExtDsl.g:121:4: (lv_packageDef_3_0= rulePackageDefinition )
                    {
                    // InternalCssExtDsl.g:121:4: (lv_packageDef_3_0= rulePackageDefinition )
                    // InternalCssExtDsl.g:122:5: lv_packageDef_3_0= rulePackageDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCssExtensionAccess().getPackageDefPackageDefinitionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_packageDef_3_0=rulePackageDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCssExtensionRule());
                      					}
                      					set(
                      						current,
                      						"packageDef",
                      						lv_packageDef_3_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.PackageDefinition");
                      					afterParserOrEnumRuleCall();
                      				
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
        }
        return current;
    }
    // $ANTLR end "ruleCssExtension"


    // $ANTLR start "entryRuleImport"
    // InternalCssExtDsl.g:143:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalCssExtDsl.g:143:47: (iv_ruleImport= ruleImport EOF )
            // InternalCssExtDsl.g:144:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalCssExtDsl.g:150:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:156:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // InternalCssExtDsl.g:157:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // InternalCssExtDsl.g:157:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // InternalCssExtDsl.g:158:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalCssExtDsl.g:162:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // InternalCssExtDsl.g:163:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // InternalCssExtDsl.g:163:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // InternalCssExtDsl.g:164:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleValidID"
    // InternalCssExtDsl.g:185:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalCssExtDsl.g:185:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalCssExtDsl.g:186:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCssExtDsl.g:192:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCssExtDsl.g:198:2: (this_ID_0= RULE_ID )
            // InternalCssExtDsl.g:199:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCssExtDsl.g:209:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCssExtDsl.g:209:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCssExtDsl.g:210:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCssExtDsl.g:216:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:222:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalCssExtDsl.g:223:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalCssExtDsl.g:223:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalCssExtDsl.g:224:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:234:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) && (synpred1_InternalCssExtDsl())) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalCssExtDsl.g:235:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalCssExtDsl.g:235:4: ( ( '.' )=>kw= '.' )
            	    // InternalCssExtDsl.g:236:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_6);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:258:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalCssExtDsl.g:258:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalCssExtDsl.g:259:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalCssExtDsl.g:265:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:271:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalCssExtDsl.g:272:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalCssExtDsl.g:272:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalCssExtDsl.g:273:3: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:283:3: (kw= '.' kw= '*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCssExtDsl.g:284:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1());
                      			
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRulePackageDefinition"
    // InternalCssExtDsl.g:299:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalCssExtDsl.g:299:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalCssExtDsl.g:300:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalCssExtDsl.g:306:1: rulePackageDefinition returns [EObject current=null] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_doku_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_subpackages_6_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:312:2: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' ) )
            // InternalCssExtDsl.g:313:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            {
            // InternalCssExtDsl.g:313:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}' )
            // InternalCssExtDsl.g:314:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )* otherlv_8= '}'
            {
            // InternalCssExtDsl.g:314:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_JDOC) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCssExtDsl.g:315:4: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // InternalCssExtDsl.g:315:4: ( (lv_doku_0_0= ruleDoku ) )
                    // InternalCssExtDsl.g:316:5: (lv_doku_0_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:316:5: (lv_doku_0_0= ruleDoku )
                    // InternalCssExtDsl.g:317:6: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getDokuDokuParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"doku",
                      							lv_doku_0_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:334:4: (this_WS_1= RULE_WS )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_WS) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:335:5: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_1, grammarAccess.getPackageDefinitionAccess().getWSTerminalRuleCall_0_1());
                    	      				
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

            otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_1());
              		
            }
            // InternalCssExtDsl.g:345:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalCssExtDsl.g:346:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalCssExtDsl.g:346:4: (lv_name_3_0= ruleQualifiedName )
            // InternalCssExtDsl.g:347:5: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCssExtDsl.g:368:3: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*
            loop7:
            do {
                int alt7=4;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalCssExtDsl.g:369:4: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    {
            	    // InternalCssExtDsl.g:369:4: ( (lv_rules_5_0= ruleCSSRuleDefinition ) )
            	    // InternalCssExtDsl.g:370:5: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    {
            	    // InternalCssExtDsl.g:370:5: (lv_rules_5_0= ruleCSSRuleDefinition )
            	    // InternalCssExtDsl.g:371:6: lv_rules_5_0= ruleCSSRuleDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getRulesCSSRuleDefinitionParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_rules_5_0=ruleCSSRuleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"rules",
            	      							lv_rules_5_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCssExtDsl.g:389:4: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    {
            	    // InternalCssExtDsl.g:389:4: ( (lv_subpackages_6_0= rulePackageDefinition ) )
            	    // InternalCssExtDsl.g:390:5: (lv_subpackages_6_0= rulePackageDefinition )
            	    {
            	    // InternalCssExtDsl.g:390:5: (lv_subpackages_6_0= rulePackageDefinition )
            	    // InternalCssExtDsl.g:391:6: lv_subpackages_6_0= rulePackageDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getSubpackagesPackageDefinitionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_subpackages_6_0=rulePackageDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"subpackages",
            	      							lv_subpackages_6_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.PackageDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCssExtDsl.g:409:4: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    {
            	    // InternalCssExtDsl.g:409:4: ( (lv_elements_7_0= ruleElementDefinition ) )
            	    // InternalCssExtDsl.g:410:5: (lv_elements_7_0= ruleElementDefinition )
            	    {
            	    // InternalCssExtDsl.g:410:5: (lv_elements_7_0= ruleElementDefinition )
            	    // InternalCssExtDsl.g:411:6: lv_elements_7_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getElementsElementDefinitionParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_elements_7_0=ruleElementDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_7_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.ElementDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRuleDoku"
    // InternalCssExtDsl.g:437:1: entryRuleDoku returns [EObject current=null] : iv_ruleDoku= ruleDoku EOF ;
    public final EObject entryRuleDoku() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoku = null;


        try {
            // InternalCssExtDsl.g:437:45: (iv_ruleDoku= ruleDoku EOF )
            // InternalCssExtDsl.g:438:2: iv_ruleDoku= ruleDoku EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDokuRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoku"


    // $ANTLR start "ruleDoku"
    // InternalCssExtDsl.g:444:1: ruleDoku returns [EObject current=null] : ( (lv_content_0_0= RULE_JDOC ) ) ;
    public final EObject ruleDoku() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;


        	enterRule();

        try {
            // InternalCssExtDsl.g:450:2: ( ( (lv_content_0_0= RULE_JDOC ) ) )
            // InternalCssExtDsl.g:451:2: ( (lv_content_0_0= RULE_JDOC ) )
            {
            // InternalCssExtDsl.g:451:2: ( (lv_content_0_0= RULE_JDOC ) )
            // InternalCssExtDsl.g:452:3: (lv_content_0_0= RULE_JDOC )
            {
            // InternalCssExtDsl.g:452:3: (lv_content_0_0= RULE_JDOC )
            // InternalCssExtDsl.g:453:4: lv_content_0_0= RULE_JDOC
            {
            lv_content_0_0=(Token)match(input,RULE_JDOC,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_content_0_0, grammarAccess.getDokuAccess().getContentJDOCTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDokuRule());
              				}
              				setWithLastConsumed(
              					current,
              					"content",
              					lv_content_0_0,
              					"org.eclipse.fx.ide.css.cssext.CssExtDsl.JDOC");
              			
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
    // $ANTLR end "ruleDoku"


    // $ANTLR start "entryRuleCSSBaseType"
    // InternalCssExtDsl.g:472:1: entryRuleCSSBaseType returns [EObject current=null] : iv_ruleCSSBaseType= ruleCSSBaseType EOF ;
    public final EObject entryRuleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSBaseType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:474:2: (iv_ruleCSSBaseType= ruleCSSBaseType EOF )
            // InternalCssExtDsl.g:475:2: iv_ruleCSSBaseType= ruleCSSBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSBaseTypeRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSBaseType"


    // $ANTLR start "ruleCSSBaseType"
    // InternalCssExtDsl.g:484:1: ruleCSSBaseType returns [EObject current=null] : this_CSSType_0= ruleCSSType ;
    public final EObject ruleCSSBaseType() throws RecognitionException {
        EObject current = null;

        EObject this_CSSType_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:491:2: (this_CSSType_0= ruleCSSType )
            // InternalCssExtDsl.g:492:2: this_CSSType_0= ruleCSSType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getCSSBaseTypeAccess().getCSSTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_CSSType_0=ruleCSSType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_CSSType_0;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSBaseType"


    // $ANTLR start "entryRuleCSSType"
    // InternalCssExtDsl.g:506:1: entryRuleCSSType returns [EObject current=null] : iv_ruleCSSType= ruleCSSType EOF ;
    public final EObject entryRuleCSSType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSType = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:508:2: (iv_ruleCSSType= ruleCSSType EOF )
            // InternalCssExtDsl.g:509:2: iv_ruleCSSType= ruleCSSType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSTypeRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSType"


    // $ANTLR start "ruleCSSType"
    // InternalCssExtDsl.g:518:1: ruleCSSType returns [EObject current=null] : ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) ) ;
    public final EObject ruleCSSType() throws RecognitionException {
        EObject current = null;

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
        EObject lv_doku_1_0 = null;

        EObject lv_doku_14_0 = null;

        EObject lv_doku_27_0 = null;

        EObject lv_rule_31_0 = null;

        EObject lv_doku_33_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:525:2: ( ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) ) )
            // InternalCssExtDsl.g:526:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )
            {
            // InternalCssExtDsl.g:526:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalCssExtDsl.g:527:3: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    {
                    // InternalCssExtDsl.g:527:3: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' )
                    // InternalCssExtDsl.g:528:4: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')'
                    {
                    // InternalCssExtDsl.g:528:4: ()
                    // InternalCssExtDsl.g:529:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCSSTypeAccess().getCSSRangedIntTypeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:535:4: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_JDOC) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCssExtDsl.g:536:5: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:536:5: ( (lv_doku_1_0= ruleDoku ) )
                            // InternalCssExtDsl.g:537:6: (lv_doku_1_0= ruleDoku )
                            {
                            // InternalCssExtDsl.g:537:6: (lv_doku_1_0= ruleDoku )
                            // InternalCssExtDsl.g:538:7: lv_doku_1_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_doku_1_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              							}
                              							set(
                              								current,
                              								"doku",
                              								lv_doku_1_0,
                              								"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCssExtDsl.g:555:5: (this_WS_2= RULE_WS )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==RULE_WS) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:556:6: this_WS_2= RULE_WS
                            	    {
                            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_WS_2, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_1_1());
                            	      					
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

                    // InternalCssExtDsl.g:562:4: ( (lv_type_3_0= '@INT' ) )
                    // InternalCssExtDsl.g:563:5: (lv_type_3_0= '@INT' )
                    {
                    // InternalCssExtDsl.g:563:5: (lv_type_3_0= '@INT' )
                    // InternalCssExtDsl.g:564:6: lv_type_3_0= '@INT'
                    {
                    lv_type_3_0=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_3_0, "@INT");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_0_3());
                      			
                    }
                    // InternalCssExtDsl.g:580:4: (this_WS_5= RULE_WS )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:581:5: this_WS_5= RULE_WS
                    	    {
                    	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_5, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_4());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalCssExtDsl.g:586:4: ( (lv_from_6_0= RULE_INT ) )
                    // InternalCssExtDsl.g:587:5: (lv_from_6_0= RULE_INT )
                    {
                    // InternalCssExtDsl.g:587:5: (lv_from_6_0= RULE_INT )
                    // InternalCssExtDsl.g:588:6: lv_from_6_0= RULE_INT
                    {
                    lv_from_6_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_from_6_0, grammarAccess.getCSSTypeAccess().getFromINTTerminalRuleCall_0_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"from",
                      							lv_from_6_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.INT");
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:604:4: (this_WS_7= RULE_WS )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:605:5: this_WS_7= RULE_WS
                    	    {
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_7, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_6());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_0_7());
                      			
                    }
                    // InternalCssExtDsl.g:614:4: (this_WS_9= RULE_WS )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:615:5: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_9, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_8());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalCssExtDsl.g:620:4: ( (lv_to_10_0= RULE_INT ) )
                    // InternalCssExtDsl.g:621:5: (lv_to_10_0= RULE_INT )
                    {
                    // InternalCssExtDsl.g:621:5: (lv_to_10_0= RULE_INT )
                    // InternalCssExtDsl.g:622:6: lv_to_10_0= RULE_INT
                    {
                    lv_to_10_0=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_to_10_0, grammarAccess.getCSSTypeAccess().getToINTTerminalRuleCall_0_9_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"to",
                      							lv_to_10_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.INT");
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:638:4: (this_WS_11= RULE_WS )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_WS) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:639:5: this_WS_11= RULE_WS
                    	    {
                    	    this_WS_11=(Token)match(input,RULE_WS,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_11, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_0_10());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_0_11());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:650:3: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    {
                    // InternalCssExtDsl.g:650:3: ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' )
                    // InternalCssExtDsl.g:651:4: () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')'
                    {
                    // InternalCssExtDsl.g:651:4: ()
                    // InternalCssExtDsl.g:652:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCSSTypeAccess().getCSSRangedDoubleTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:658:4: ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_JDOC) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCssExtDsl.g:659:5: ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:659:5: ( (lv_doku_14_0= ruleDoku ) )
                            // InternalCssExtDsl.g:660:6: (lv_doku_14_0= ruleDoku )
                            {
                            // InternalCssExtDsl.g:660:6: (lv_doku_14_0= ruleDoku )
                            // InternalCssExtDsl.g:661:7: lv_doku_14_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_doku_14_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              							}
                              							set(
                              								current,
                              								"doku",
                              								lv_doku_14_0,
                              								"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCssExtDsl.g:678:5: (this_WS_15= RULE_WS )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_WS) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:679:6: this_WS_15= RULE_WS
                            	    {
                            	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_16); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_WS_15, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_1_1());
                            	      					
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

                    // InternalCssExtDsl.g:685:4: ( (lv_type_16_0= '@NUM' ) )
                    // InternalCssExtDsl.g:686:5: (lv_type_16_0= '@NUM' )
                    {
                    // InternalCssExtDsl.g:686:5: (lv_type_16_0= '@NUM' )
                    // InternalCssExtDsl.g:687:6: lv_type_16_0= '@NUM'
                    {
                    lv_type_16_0=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_16_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_16_0, "@NUM");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_1_3());
                      			
                    }
                    // InternalCssExtDsl.g:703:4: (this_WS_18= RULE_WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:704:5: this_WS_18= RULE_WS
                    	    {
                    	    this_WS_18=(Token)match(input,RULE_WS,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_18, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_4());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalCssExtDsl.g:709:4: ( (lv_from_19_0= RULE_DOUBLE ) )
                    // InternalCssExtDsl.g:710:5: (lv_from_19_0= RULE_DOUBLE )
                    {
                    // InternalCssExtDsl.g:710:5: (lv_from_19_0= RULE_DOUBLE )
                    // InternalCssExtDsl.g:711:6: lv_from_19_0= RULE_DOUBLE
                    {
                    lv_from_19_0=(Token)match(input,RULE_DOUBLE,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_from_19_0, grammarAccess.getCSSTypeAccess().getFromDOUBLETerminalRuleCall_1_5_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"from",
                      							lv_from_19_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.DOUBLE");
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:727:4: (this_WS_20= RULE_WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:728:5: this_WS_20= RULE_WS
                    	    {
                    	    this_WS_20=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_20, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_6());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getCSSTypeAccess().getHyphenMinusGreaterThanSignKeyword_1_7());
                      			
                    }
                    // InternalCssExtDsl.g:737:4: (this_WS_22= RULE_WS )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:738:5: this_WS_22= RULE_WS
                    	    {
                    	    this_WS_22=(Token)match(input,RULE_WS,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_22, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_8());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalCssExtDsl.g:743:4: ( (lv_to_23_0= RULE_DOUBLE ) )
                    // InternalCssExtDsl.g:744:5: (lv_to_23_0= RULE_DOUBLE )
                    {
                    // InternalCssExtDsl.g:744:5: (lv_to_23_0= RULE_DOUBLE )
                    // InternalCssExtDsl.g:745:6: lv_to_23_0= RULE_DOUBLE
                    {
                    lv_to_23_0=(Token)match(input,RULE_DOUBLE,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_to_23_0, grammarAccess.getCSSTypeAccess().getToDOUBLETerminalRuleCall_1_9_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"to",
                      							lv_to_23_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.DOUBLE");
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:761:4: (this_WS_24= RULE_WS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:762:5: this_WS_24= RULE_WS
                    	    {
                    	    this_WS_24=(Token)match(input,RULE_WS,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_24, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_1_10());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_1_11());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:773:3: ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' )
                    {
                    // InternalCssExtDsl.g:773:3: ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' )
                    // InternalCssExtDsl.g:774:4: () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')'
                    {
                    // InternalCssExtDsl.g:774:4: ()
                    // InternalCssExtDsl.g:775:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCSSTypeAccess().getCSSPropertyRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:781:4: ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_JDOC) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalCssExtDsl.g:782:5: ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:782:5: ( (lv_doku_27_0= ruleDoku ) )
                            // InternalCssExtDsl.g:783:6: (lv_doku_27_0= ruleDoku )
                            {
                            // InternalCssExtDsl.g:783:6: (lv_doku_27_0= ruleDoku )
                            // InternalCssExtDsl.g:784:7: lv_doku_27_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_18);
                            lv_doku_27_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              							}
                              							set(
                              								current,
                              								"doku",
                              								lv_doku_27_0,
                              								"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCssExtDsl.g:801:5: (this_WS_28= RULE_WS )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_WS) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:802:6: this_WS_28= RULE_WS
                            	    {
                            	    this_WS_28=(Token)match(input,RULE_WS,FOLLOW_18); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_WS_28, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_2_1_1());
                            	      					
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

                    // InternalCssExtDsl.g:808:4: ( (lv_type_29_0= '@PROPERTY_REF' ) )
                    // InternalCssExtDsl.g:809:5: (lv_type_29_0= '@PROPERTY_REF' )
                    {
                    // InternalCssExtDsl.g:809:5: (lv_type_29_0= '@PROPERTY_REF' )
                    // InternalCssExtDsl.g:810:6: lv_type_29_0= '@PROPERTY_REF'
                    {
                    lv_type_29_0=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_29_0, grammarAccess.getCSSTypeAccess().getTypePROPERTY_REFKeyword_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSTypeRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_29_0, "@PROPERTY_REF");
                      					
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getCSSTypeAccess().getLeftParenthesisKeyword_2_3());
                      			
                    }
                    // InternalCssExtDsl.g:826:4: ( (lv_rule_31_0= ruleCSSRuleRef ) )
                    // InternalCssExtDsl.g:827:5: (lv_rule_31_0= ruleCSSRuleRef )
                    {
                    // InternalCssExtDsl.g:827:5: (lv_rule_31_0= ruleCSSRuleRef )
                    // InternalCssExtDsl.g:828:6: lv_rule_31_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSTypeAccess().getRuleCSSRuleRefParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_rule_31_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                      						}
                      						set(
                      							current,
                      							"rule",
                      							lv_rule_31_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getCSSTypeAccess().getRightParenthesisKeyword_2_5());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:851:3: ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) )
                    {
                    // InternalCssExtDsl.g:851:3: ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) )
                    // InternalCssExtDsl.g:852:4: ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) )
                    {
                    // InternalCssExtDsl.g:852:4: ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_JDOC) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalCssExtDsl.g:853:5: ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:853:5: ( (lv_doku_33_0= ruleDoku ) )
                            // InternalCssExtDsl.g:854:6: (lv_doku_33_0= ruleDoku )
                            {
                            // InternalCssExtDsl.g:854:6: (lv_doku_33_0= ruleDoku )
                            // InternalCssExtDsl.g:855:7: lv_doku_33_0= ruleDoku
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCSSTypeAccess().getDokuDokuParserRuleCall_3_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_doku_33_0=ruleDoku();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCSSTypeRule());
                              							}
                              							set(
                              								current,
                              								"doku",
                              								lv_doku_33_0,
                              								"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCssExtDsl.g:872:5: (this_WS_34= RULE_WS )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_WS) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:873:6: this_WS_34= RULE_WS
                            	    {
                            	    this_WS_34=(Token)match(input,RULE_WS,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_WS_34, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_0_1());
                            	      					
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

                    // InternalCssExtDsl.g:879:4: ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) )
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
                            // InternalCssExtDsl.g:880:5: ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* )
                            {
                            // InternalCssExtDsl.g:880:5: ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* )
                            // InternalCssExtDsl.g:881:6: ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:881:6: ( (lv_type_35_0= '@INT' ) )
                            // InternalCssExtDsl.g:882:7: (lv_type_35_0= '@INT' )
                            {
                            // InternalCssExtDsl.g:882:7: (lv_type_35_0= '@INT' )
                            // InternalCssExtDsl.g:883:8: lv_type_35_0= '@INT'
                            {
                            lv_type_35_0=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_type_35_0, grammarAccess.getCSSTypeAccess().getTypeINTKeyword_3_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCSSTypeRule());
                              								}
                              								setWithLastConsumed(current, "type", lv_type_35_0, "@INT");
                              							
                            }

                            }


                            }

                            // InternalCssExtDsl.g:895:6: (this_WS_36= RULE_WS )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==RULE_WS) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:896:7: this_WS_36= RULE_WS
                            	    {
                            	    this_WS_36=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_36, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_0_1());
                            	      						
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
                            // InternalCssExtDsl.g:903:5: ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* )
                            {
                            // InternalCssExtDsl.g:903:5: ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* )
                            // InternalCssExtDsl.g:904:6: ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:904:6: ( (lv_type_37_0= '@NUM' ) )
                            // InternalCssExtDsl.g:905:7: (lv_type_37_0= '@NUM' )
                            {
                            // InternalCssExtDsl.g:905:7: (lv_type_37_0= '@NUM' )
                            // InternalCssExtDsl.g:906:8: lv_type_37_0= '@NUM'
                            {
                            lv_type_37_0=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_type_37_0, grammarAccess.getCSSTypeAccess().getTypeNUMKeyword_3_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCSSTypeRule());
                              								}
                              								setWithLastConsumed(current, "type", lv_type_37_0, "@NUM");
                              							
                            }

                            }


                            }

                            // InternalCssExtDsl.g:918:6: (this_WS_38= RULE_WS )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_WS) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:919:7: this_WS_38= RULE_WS
                            	    {
                            	    this_WS_38=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_38, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_1_1());
                            	      						
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
                            // InternalCssExtDsl.g:926:5: ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* )
                            {
                            // InternalCssExtDsl.g:926:5: ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* )
                            // InternalCssExtDsl.g:927:6: ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:927:6: ( (lv_type_39_0= '@STRING' ) )
                            // InternalCssExtDsl.g:928:7: (lv_type_39_0= '@STRING' )
                            {
                            // InternalCssExtDsl.g:928:7: (lv_type_39_0= '@STRING' )
                            // InternalCssExtDsl.g:929:8: lv_type_39_0= '@STRING'
                            {
                            lv_type_39_0=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_type_39_0, grammarAccess.getCSSTypeAccess().getTypeSTRINGKeyword_3_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCSSTypeRule());
                              								}
                              								setWithLastConsumed(current, "type", lv_type_39_0, "@STRING");
                              							
                            }

                            }


                            }

                            // InternalCssExtDsl.g:941:6: (this_WS_40= RULE_WS )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_WS) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:942:7: this_WS_40= RULE_WS
                            	    {
                            	    this_WS_40=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_40, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_2_1());
                            	      						
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
                            // InternalCssExtDsl.g:949:5: ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* )
                            {
                            // InternalCssExtDsl.g:949:5: ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* )
                            // InternalCssExtDsl.g:950:6: ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )*
                            {
                            // InternalCssExtDsl.g:950:6: ( (lv_type_41_0= '@URL' ) )
                            // InternalCssExtDsl.g:951:7: (lv_type_41_0= '@URL' )
                            {
                            // InternalCssExtDsl.g:951:7: (lv_type_41_0= '@URL' )
                            // InternalCssExtDsl.g:952:8: lv_type_41_0= '@URL'
                            {
                            lv_type_41_0=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_type_41_0, grammarAccess.getCSSTypeAccess().getTypeURLKeyword_3_1_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getCSSTypeRule());
                              								}
                              								setWithLastConsumed(current, "type", lv_type_41_0, "@URL");
                              							
                            }

                            }


                            }

                            // InternalCssExtDsl.g:964:6: (this_WS_42= RULE_WS )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_WS) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalCssExtDsl.g:965:7: this_WS_42= RULE_WS
                            	    {
                            	    this_WS_42=(Token)match(input,RULE_WS,FOLLOW_22); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_42, grammarAccess.getCSSTypeAccess().getWSTerminalRuleCall_3_1_3_1());
                            	      						
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
    // $ANTLR end "ruleCSSType"


    // $ANTLR start "entryRuleElementDefinition"
    // InternalCssExtDsl.g:980:1: entryRuleElementDefinition returns [EObject current=null] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final EObject entryRuleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDefinition = null;


        try {
            // InternalCssExtDsl.g:980:58: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // InternalCssExtDsl.g:981:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefinitionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // InternalCssExtDsl.g:987:1: ruleElementDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_styleclass_8_0=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_pseudoClasses_11_0 = null;

        EObject lv_substructures_12_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:993:2: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' ) )
            // InternalCssExtDsl.g:994:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            {
            // InternalCssExtDsl.g:994:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}' )
            // InternalCssExtDsl.g:995:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )* otherlv_13= '}'
            {
            // InternalCssExtDsl.g:995:3: ()
            // InternalCssExtDsl.g:996:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getElementDefinitionAccess().getElementDefinitionAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:1002:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_JDOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCssExtDsl.g:1003:4: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:1003:4: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:1004:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getElementDefinitionAccess().getDokuDokuParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_1_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssExtDsl.g:1021:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalCssExtDsl.g:1022:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1022:4: (lv_name_2_0= ruleQualifiedName )
            // InternalCssExtDsl.g:1023:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssExtDsl.g:1040:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCssExtDsl.g:1041:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getElementDefinitionAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalCssExtDsl.g:1045:4: ( ( ruleQualifiedName ) )
                    // InternalCssExtDsl.g:1046:5: ( ruleQualifiedName )
                    {
                    // InternalCssExtDsl.g:1046:5: ( ruleQualifiedName )
                    // InternalCssExtDsl.g:1047:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getElementDefinitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:1061:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:1062:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getElementDefinitionAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalCssExtDsl.g:1066:5: ( ( ruleQualifiedName ) )
                    	    // InternalCssExtDsl.g:1067:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalCssExtDsl.g:1067:6: ( ruleQualifiedName )
                    	    // InternalCssExtDsl.g:1068:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getElementDefinitionRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getElementDefinitionAccess().getSuperElementDefinitionCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
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

            // InternalCssExtDsl.g:1084:3: (otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCssExtDsl.g:1085:4: otherlv_7= 'styleclass' ( (lv_styleclass_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getElementDefinitionAccess().getStyleclassKeyword_4_0());
                      			
                    }
                    // InternalCssExtDsl.g:1089:4: ( (lv_styleclass_8_0= RULE_ID ) )
                    // InternalCssExtDsl.g:1090:5: (lv_styleclass_8_0= RULE_ID )
                    {
                    // InternalCssExtDsl.g:1090:5: (lv_styleclass_8_0= RULE_ID )
                    // InternalCssExtDsl.g:1091:6: lv_styleclass_8_0= RULE_ID
                    {
                    lv_styleclass_8_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_styleclass_8_0, grammarAccess.getElementDefinitionAccess().getStyleclassIDTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getElementDefinitionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"styleclass",
                      							lv_styleclass_8_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getElementDefinitionAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalCssExtDsl.g:1112:3: ( ( (lv_properties_10_0= rulePropertyDefinition ) ) | ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) ) | ( (lv_substructures_12_0= ruleSubstructure ) ) )*
            loop34:
            do {
                int alt34=4;
                switch ( input.LA(1) ) {
                case RULE_JDOC:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        alt34=1;
                        }
                        break;
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
            	    // InternalCssExtDsl.g:1113:4: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    {
            	    // InternalCssExtDsl.g:1113:4: ( (lv_properties_10_0= rulePropertyDefinition ) )
            	    // InternalCssExtDsl.g:1114:5: (lv_properties_10_0= rulePropertyDefinition )
            	    {
            	    // InternalCssExtDsl.g:1114:5: (lv_properties_10_0= rulePropertyDefinition )
            	    // InternalCssExtDsl.g:1115:6: lv_properties_10_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getElementDefinitionAccess().getPropertiesPropertyDefinitionParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_properties_10_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"properties",
            	      							lv_properties_10_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.PropertyDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCssExtDsl.g:1133:4: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    {
            	    // InternalCssExtDsl.g:1133:4: ( (lv_pseudoClasses_11_0= rulePseudoClassDefinition ) )
            	    // InternalCssExtDsl.g:1134:5: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    {
            	    // InternalCssExtDsl.g:1134:5: (lv_pseudoClasses_11_0= rulePseudoClassDefinition )
            	    // InternalCssExtDsl.g:1135:6: lv_pseudoClasses_11_0= rulePseudoClassDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getElementDefinitionAccess().getPseudoClassesPseudoClassDefinitionParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_pseudoClasses_11_0=rulePseudoClassDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"pseudoClasses",
            	      							lv_pseudoClasses_11_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.PseudoClassDefinition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCssExtDsl.g:1153:4: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    {
            	    // InternalCssExtDsl.g:1153:4: ( (lv_substructures_12_0= ruleSubstructure ) )
            	    // InternalCssExtDsl.g:1154:5: (lv_substructures_12_0= ruleSubstructure )
            	    {
            	    // InternalCssExtDsl.g:1154:5: (lv_substructures_12_0= ruleSubstructure )
            	    // InternalCssExtDsl.g:1155:6: lv_substructures_12_0= ruleSubstructure
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getElementDefinitionAccess().getSubstructuresSubstructureParserRuleCall_6_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_substructures_12_0=ruleSubstructure();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getElementDefinitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"substructures",
            	      							lv_substructures_12_0,
            	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.Substructure");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_13=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getElementDefinitionAccess().getRightCurlyBracketKeyword_7());
              		
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // InternalCssExtDsl.g:1181:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // InternalCssExtDsl.g:1181:59: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // InternalCssExtDsl.g:1182:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // InternalCssExtDsl.g:1188:1: rulePropertyDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:1194:2: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' ) )
            // InternalCssExtDsl.g:1195:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            {
            // InternalCssExtDsl.g:1195:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';' )
            // InternalCssExtDsl.g:1196:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_rule_3_0= ruleCSSRuleOr ) ) (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )? otherlv_6= ';'
            {
            // InternalCssExtDsl.g:1196:3: ()
            // InternalCssExtDsl.g:1197:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:1203:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_JDOC) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCssExtDsl.g:1204:4: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:1204:4: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:1205:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDokuDokuParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_1_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssExtDsl.g:1222:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalCssExtDsl.g:1223:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1223:4: (lv_name_2_0= ruleQualifiedName )
            // InternalCssExtDsl.g:1224:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssExtDsl.g:1241:3: ( (lv_rule_3_0= ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:1242:4: (lv_rule_3_0= ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:1242:4: (lv_rule_3_0= ruleCSSRuleOr )
            // InternalCssExtDsl.g:1243:5: lv_rule_3_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getRuleCSSRuleOrParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_rule_3_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              					}
              					set(
              						current,
              						"rule",
              						lv_rule_3_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCssExtDsl.g:1260:3: (otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCssExtDsl.g:1261:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getDefaultKeyword_4_0());
                      			
                    }
                    // InternalCssExtDsl.g:1265:4: ( (lv_default_5_0= ruleCSSDefaultValue ) )
                    // InternalCssExtDsl.g:1266:5: (lv_default_5_0= ruleCSSDefaultValue )
                    {
                    // InternalCssExtDsl.g:1266:5: (lv_default_5_0= ruleCSSDefaultValue )
                    // InternalCssExtDsl.g:1267:6: lv_default_5_0= ruleCSSDefaultValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultCSSDefaultValueParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_default_5_0=ruleCSSDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_5_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSDefaultValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRulePseudoClassDefinition"
    // InternalCssExtDsl.g:1293:1: entryRulePseudoClassDefinition returns [EObject current=null] : iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF ;
    public final EObject entryRulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePseudoClassDefinition = null;


        try {
            // InternalCssExtDsl.g:1293:62: (iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF )
            // InternalCssExtDsl.g:1294:2: iv_rulePseudoClassDefinition= rulePseudoClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPseudoClassDefinitionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePseudoClassDefinition"


    // $ANTLR start "rulePseudoClassDefinition"
    // InternalCssExtDsl.g:1300:1: rulePseudoClassDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) ;
    public final EObject rulePseudoClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_doku_1_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:1306:2: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) ) )
            // InternalCssExtDsl.g:1307:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            {
            // InternalCssExtDsl.g:1307:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) ) )
            // InternalCssExtDsl.g:1308:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= RULE_PSEUDO ) )
            {
            // InternalCssExtDsl.g:1308:3: ()
            // InternalCssExtDsl.g:1309:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPseudoClassDefinitionAccess().getPseudoClassDefinitionAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:1315:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_JDOC) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCssExtDsl.g:1316:4: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:1316:4: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:1317:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPseudoClassDefinitionAccess().getDokuDokuParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_30);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPseudoClassDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_1_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssExtDsl.g:1334:3: ( (lv_name_2_0= RULE_PSEUDO ) )
            // InternalCssExtDsl.g:1335:4: (lv_name_2_0= RULE_PSEUDO )
            {
            // InternalCssExtDsl.g:1335:4: (lv_name_2_0= RULE_PSEUDO )
            // InternalCssExtDsl.g:1336:5: lv_name_2_0= RULE_PSEUDO
            {
            lv_name_2_0=(Token)match(input,RULE_PSEUDO,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getPseudoClassDefinitionAccess().getNamePSEUDOTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPseudoClassDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.PSEUDO");
              				
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
    // $ANTLR end "rulePseudoClassDefinition"


    // $ANTLR start "entryRuleCSSRuleRef"
    // InternalCssExtDsl.g:1356:1: entryRuleCSSRuleRef returns [EObject current=null] : iv_ruleCSSRuleRef= ruleCSSRuleRef EOF ;
    public final EObject entryRuleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRef = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:1358:2: (iv_ruleCSSRuleRef= ruleCSSRuleRef EOF )
            // InternalCssExtDsl.g:1359:2: iv_ruleCSSRuleRef= ruleCSSRuleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRefRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRef"


    // $ANTLR start "ruleCSSRuleRef"
    // InternalCssExtDsl.g:1368:1: ruleCSSRuleRef returns [EObject current=null] : ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) ;
    public final EObject ruleCSSRuleRef() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_doku_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:1375:2: ( ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' ) )
            // InternalCssExtDsl.g:1376:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            {
            // InternalCssExtDsl.g:1376:2: ( ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>' )
            // InternalCssExtDsl.g:1377:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )? otherlv_2= '<' ( ( ruleQualifiedName ) ) otherlv_4= '>'
            {
            // InternalCssExtDsl.g:1377:3: ( ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_JDOC) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCssExtDsl.g:1378:4: ( (lv_doku_0_0= ruleDoku ) ) (this_WS_1= RULE_WS )*
                    {
                    // InternalCssExtDsl.g:1378:4: ( (lv_doku_0_0= ruleDoku ) )
                    // InternalCssExtDsl.g:1379:5: (lv_doku_0_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:1379:5: (lv_doku_0_0= ruleDoku )
                    // InternalCssExtDsl.g:1380:6: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSRuleRefAccess().getDokuDokuParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSRuleRefRule());
                      						}
                      						set(
                      							current,
                      							"doku",
                      							lv_doku_0_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:1397:4: (this_WS_1= RULE_WS )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_WS) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:1398:5: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_31); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_1, grammarAccess.getCSSRuleRefAccess().getWSTerminalRuleCall_0_1());
                    	      				
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

            otherlv_2=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCSSRuleRefAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalCssExtDsl.g:1408:3: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:1409:4: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1409:4: ( ruleQualifiedName )
            // InternalCssExtDsl.g:1410:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCSSRuleRefRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSSRuleRefAccess().getRefDefinitionCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_32);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getCSSRuleRefAccess().getGreaterThanSignKeyword_3());
              		
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
    // $ANTLR end "ruleCSSRuleRef"


    // $ANTLR start "entryRuleCSSRuleDefinition"
    // InternalCssExtDsl.g:1435:1: entryRuleCSSRuleDefinition returns [EObject current=null] : iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF ;
    public final EObject entryRuleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleDefinition = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1437:2: (iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF )
            // InternalCssExtDsl.g:1438:2: iv_ruleCSSRuleDefinition= ruleCSSRuleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleDefinitionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleDefinition"


    // $ANTLR start "ruleCSSRuleDefinition"
    // InternalCssExtDsl.g:1447:1: ruleCSSRuleDefinition returns [EObject current=null] : ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleCSSRuleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_doku_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_func_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1454:2: ( ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' ) )
            // InternalCssExtDsl.g:1455:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            {
            // InternalCssExtDsl.g:1455:2: ( () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';' )
            // InternalCssExtDsl.g:1456:3: () ( (lv_doku_1_0= ruleDoku ) )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) ) otherlv_6= ';'
            {
            // InternalCssExtDsl.g:1456:3: ()
            // InternalCssExtDsl.g:1457:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleDefinitionAccess().getCSSRuleDefinitionAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:1463:3: ( (lv_doku_1_0= ruleDoku ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_JDOC) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCssExtDsl.g:1464:4: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:1464:4: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:1465:5: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getDokuDokuParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_1_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssExtDsl.g:1482:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalCssExtDsl.g:1483:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalCssExtDsl.g:1483:4: (lv_name_2_0= ruleQualifiedName )
            // InternalCssExtDsl.g:1484:5: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCSSRuleDefinitionAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalCssExtDsl.g:1505:3: ( ( (lv_rule_4_0= ruleCSSRuleOr ) ) | ( (lv_func_5_0= ruleCSSRuleFunc ) ) )
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
                    // InternalCssExtDsl.g:1506:4: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    {
                    // InternalCssExtDsl.g:1506:4: ( (lv_rule_4_0= ruleCSSRuleOr ) )
                    // InternalCssExtDsl.g:1507:5: (lv_rule_4_0= ruleCSSRuleOr )
                    {
                    // InternalCssExtDsl.g:1507:5: (lv_rule_4_0= ruleCSSRuleOr )
                    // InternalCssExtDsl.g:1508:6: lv_rule_4_0= ruleCSSRuleOr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getRuleCSSRuleOrParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_rule_4_0=ruleCSSRuleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"rule",
                      							lv_rule_4_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleOr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:1526:4: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    {
                    // InternalCssExtDsl.g:1526:4: ( (lv_func_5_0= ruleCSSRuleFunc ) )
                    // InternalCssExtDsl.g:1527:5: (lv_func_5_0= ruleCSSRuleFunc )
                    {
                    // InternalCssExtDsl.g:1527:5: (lv_func_5_0= ruleCSSRuleFunc )
                    // InternalCssExtDsl.g:1528:6: lv_func_5_0= ruleCSSRuleFunc
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSRuleDefinitionAccess().getFuncCSSRuleFuncParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_func_5_0=ruleCSSRuleFunc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSRuleDefinitionRule());
                      						}
                      						set(
                      							current,
                      							"func",
                      							lv_func_5_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleFunc");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getCSSRuleDefinitionAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleCSSRuleDefinition"


    // $ANTLR start "entryRuleCSSRuleFunc"
    // InternalCssExtDsl.g:1557:1: entryRuleCSSRuleFunc returns [EObject current=null] : iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF ;
    public final EObject entryRuleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleFunc = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:1559:2: (iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF )
            // InternalCssExtDsl.g:1560:2: iv_ruleCSSRuleFunc= ruleCSSRuleFunc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleFuncRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleFunc"


    // $ANTLR start "ruleCSSRuleFunc"
    // InternalCssExtDsl.g:1569:1: ruleCSSRuleFunc returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) ;
    public final EObject ruleCSSRuleFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:1576:2: ( ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' ) )
            // InternalCssExtDsl.g:1577:2: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            {
            // InternalCssExtDsl.g:1577:2: ( () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')' )
            // InternalCssExtDsl.g:1578:3: () ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_params_4_0= ruleCSSRuleOr ) ) otherlv_5= ')'
            {
            // InternalCssExtDsl.g:1578:3: ()
            // InternalCssExtDsl.g:1579:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleFuncAccess().getCSSRuleFuncAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:1585:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalCssExtDsl.g:1586:4: (lv_name_1_0= ruleValidID )
            {
            // InternalCssExtDsl.g:1586:4: (lv_name_1_0= ruleValidID )
            // InternalCssExtDsl.g:1587:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCSSRuleFuncAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalCssExtDsl.g:1608:3: (this_WS_3= RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCssExtDsl.g:1609:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_3, grammarAccess.getCSSRuleFuncAccess().getWSTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalCssExtDsl.g:1614:3: ( (lv_params_4_0= ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:1615:4: (lv_params_4_0= ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:1615:4: (lv_params_4_0= ruleCSSRuleOr )
            // InternalCssExtDsl.g:1616:5: lv_params_4_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSSRuleFuncAccess().getParamsCSSRuleOrParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_params_4_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSSRuleFuncRule());
              					}
              					set(
              						current,
              						"params",
              						lv_params_4_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCSSRuleFuncAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleCSSRuleFunc"


    // $ANTLR start "entryRuleCSSRuleOr"
    // InternalCssExtDsl.g:1644:1: entryRuleCSSRuleOr returns [EObject current=null] : iv_ruleCSSRuleOr= ruleCSSRuleOr EOF ;
    public final EObject entryRuleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleOr = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:1646:2: (iv_ruleCSSRuleOr= ruleCSSRuleOr EOF )
            // InternalCssExtDsl.g:1647:2: iv_ruleCSSRuleOr= ruleCSSRuleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleOrRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleOr"


    // $ANTLR start "ruleCSSRuleOr"
    // InternalCssExtDsl.g:1656:1: ruleCSSRuleOr returns [EObject current=null] : (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) ;
    public final EObject ruleCSSRuleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleXor_0 = null;

        EObject lv_ors_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalCssExtDsl.g:1663:2: ( (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? ) )
            // InternalCssExtDsl.g:1664:2: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            {
            // InternalCssExtDsl.g:1664:2: (this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )? )
            // InternalCssExtDsl.g:1665:3: this_CSSRuleXor_0= ruleCSSRuleXor ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCSSRuleOrAccess().getCSSRuleXorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_CSSRuleXor_0=ruleCSSRuleXor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleXor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:1673:3: ( () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+ )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCssExtDsl.g:1674:4: () (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
                    {
                    // InternalCssExtDsl.g:1674:4: ()
                    // InternalCssExtDsl.g:1675:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getCSSRuleOrAccess().getCSSRuleOrOrsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:1681:4: (otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) ) )+
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
                    	    // InternalCssExtDsl.g:1682:5: otherlv_2= '|' ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getCSSRuleOrAccess().getVerticalLineKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalCssExtDsl.g:1686:5: ( (lv_ors_3_0= ruleCSSRuleXor ) )
                    	    // InternalCssExtDsl.g:1687:6: (lv_ors_3_0= ruleCSSRuleXor )
                    	    {
                    	    // InternalCssExtDsl.g:1687:6: (lv_ors_3_0= ruleCSSRuleXor )
                    	    // InternalCssExtDsl.g:1688:7: lv_ors_3_0= ruleCSSRuleXor
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCSSRuleOrAccess().getOrsCSSRuleXorParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
                    	    lv_ors_3_0=ruleCSSRuleXor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCSSRuleOrRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ors",
                    	      								lv_ors_3_0,
                    	      								"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleXor");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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
    // $ANTLR end "ruleCSSRuleOr"


    // $ANTLR start "entryRuleCSSRuleXor"
    // InternalCssExtDsl.g:1714:1: entryRuleCSSRuleXor returns [EObject current=null] : iv_ruleCSSRuleXor= ruleCSSRuleXor EOF ;
    public final EObject entryRuleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleXor = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1716:2: (iv_ruleCSSRuleXor= ruleCSSRuleXor EOF )
            // InternalCssExtDsl.g:1717:2: iv_ruleCSSRuleXor= ruleCSSRuleXor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleXorRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleXor"


    // $ANTLR start "ruleCSSRuleXor"
    // InternalCssExtDsl.g:1726:1: ruleCSSRuleXor returns [EObject current=null] : (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) ;
    public final EObject ruleCSSRuleXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRuleConcat_0 = null;

        EObject lv_xors_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1733:2: ( (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? ) )
            // InternalCssExtDsl.g:1734:2: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            {
            // InternalCssExtDsl.g:1734:2: (this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )? )
            // InternalCssExtDsl.g:1735:3: this_CSSRuleConcat_0= ruleCSSRuleConcat ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCSSRuleXorAccess().getCSSRuleConcatParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_CSSRuleConcat_0=ruleCSSRuleConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleConcat_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:1743:3: ( () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+ )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCssExtDsl.g:1744:4: () (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
                    {
                    // InternalCssExtDsl.g:1744:4: ()
                    // InternalCssExtDsl.g:1745:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getCSSRuleXorAccess().getCSSRuleXorXorsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:1751:4: (otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) ) )+
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
                    	    // InternalCssExtDsl.g:1752:5: otherlv_2= '||' ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getCSSRuleXorAccess().getVerticalLineVerticalLineKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalCssExtDsl.g:1756:5: ( (lv_xors_3_0= ruleCSSRuleConcat ) )
                    	    // InternalCssExtDsl.g:1757:6: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    {
                    	    // InternalCssExtDsl.g:1757:6: (lv_xors_3_0= ruleCSSRuleConcat )
                    	    // InternalCssExtDsl.g:1758:7: lv_xors_3_0= ruleCSSRuleConcat
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCSSRuleXorAccess().getXorsCSSRuleConcatParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_xors_3_0=ruleCSSRuleConcat();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCSSRuleXorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"xors",
                    	      								lv_xors_3_0,
                    	      								"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleConcat");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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
    // $ANTLR end "ruleCSSRuleXor"


    // $ANTLR start "entryRuleCSSRuleConcat"
    // InternalCssExtDsl.g:1784:1: entryRuleCSSRuleConcat returns [EObject current=null] : iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF ;
    public final EObject entryRuleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcat = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1786:2: (iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF )
            // InternalCssExtDsl.g:1787:2: iv_ruleCSSRuleConcat= ruleCSSRuleConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcat"


    // $ANTLR start "ruleCSSRuleConcat"
    // InternalCssExtDsl.g:1796:1: ruleCSSRuleConcat returns [EObject current=null] : (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) ;
    public final EObject ruleCSSRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject this_CSSRuleConcatWithoutSpace_0 = null;

        EObject lv_conc_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1803:2: ( (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? ) )
            // InternalCssExtDsl.g:1804:2: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            {
            // InternalCssExtDsl.g:1804:2: (this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )? )
            // InternalCssExtDsl.g:1805:3: this_CSSRuleConcatWithoutSpace_0= ruleCSSRuleConcatWithoutSpace ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatWithoutSpaceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_CSSRuleConcatWithoutSpace_0=ruleCSSRuleConcatWithoutSpace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRuleConcatWithoutSpace_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:1813:3: ( () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+ )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||(LA48_0>=RULE_JDOC && LA48_0<=RULE_INT)||LA48_0==RULE_REGEX||LA48_0==22||(LA48_0>=26 && LA48_0<=29)||LA48_0==31||LA48_0==35||LA48_0==43||LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCssExtDsl.g:1814:4: () ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
                    {
                    // InternalCssExtDsl.g:1814:4: ()
                    // InternalCssExtDsl.g:1815:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getCSSRuleConcatAccess().getCSSRuleConcatConcAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:1821:4: ( (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace ) )+
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
                    	    // InternalCssExtDsl.g:1822:5: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    {
                    	    // InternalCssExtDsl.g:1822:5: (lv_conc_2_0= ruleCSSRuleConcatWithoutSpace )
                    	    // InternalCssExtDsl.g:1823:6: lv_conc_2_0= ruleCSSRuleConcatWithoutSpace
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getCSSRuleConcatAccess().getConcCSSRuleConcatWithoutSpaceParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_conc_2_0=ruleCSSRuleConcatWithoutSpace();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getCSSRuleConcatRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"conc",
                    	      							lv_conc_2_0,
                    	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleConcatWithoutSpace");
                    	      						afterParserOrEnumRuleCall();
                    	      					
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
    // $ANTLR end "ruleCSSRuleConcat"


    // $ANTLR start "entryRuleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:1848:1: entryRuleCSSRuleConcatWithoutSpace returns [EObject current=null] : iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF ;
    public final EObject entryRuleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleConcatWithoutSpace = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1850:2: (iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF )
            // InternalCssExtDsl.g:1851:2: iv_ruleCSSRuleConcatWithoutSpace= ruleCSSRuleConcatWithoutSpace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleConcatWithoutSpace"


    // $ANTLR start "ruleCSSRuleConcatWithoutSpace"
    // InternalCssExtDsl.g:1860:1: ruleCSSRuleConcatWithoutSpace returns [EObject current=null] : (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) ;
    public final EObject ruleCSSRuleConcatWithoutSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CSSRulePostfix_0 = null;

        EObject lv_conc_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1867:2: ( (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? ) )
            // InternalCssExtDsl.g:1868:2: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            {
            // InternalCssExtDsl.g:1868:2: (this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )? )
            // InternalCssExtDsl.g:1869:3: this_CSSRulePostfix_0= ruleCSSRulePostfix ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRulePostfixParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_CSSRulePostfix_0=ruleCSSRulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRulePostfix_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:1877:3: ( () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCssExtDsl.g:1878:4: () (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
                    {
                    // InternalCssExtDsl.g:1878:4: ()
                    // InternalCssExtDsl.g:1879:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getCSSRuleConcatWithoutSpaceConcAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:1885:4: (otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) ) )+
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
                    	    // InternalCssExtDsl.g:1886:5: otherlv_2= '~' ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getTildeKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalCssExtDsl.g:1890:5: ( (lv_conc_3_0= ruleCSSRulePostfix ) )
                    	    // InternalCssExtDsl.g:1891:6: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    {
                    	    // InternalCssExtDsl.g:1891:6: (lv_conc_3_0= ruleCSSRulePostfix )
                    	    // InternalCssExtDsl.g:1892:7: lv_conc_3_0= ruleCSSRulePostfix
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCSSRuleConcatWithoutSpaceAccess().getConcCSSRulePostfixParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_conc_3_0=ruleCSSRulePostfix();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCSSRuleConcatWithoutSpaceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"conc",
                    	      								lv_conc_3_0,
                    	      								"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRulePostfix");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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
    // $ANTLR end "ruleCSSRuleConcatWithoutSpace"


    // $ANTLR start "entryRuleCSSRulePostfix"
    // InternalCssExtDsl.g:1918:1: entryRuleCSSRulePostfix returns [EObject current=null] : iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF ;
    public final EObject entryRuleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePostfix = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1920:2: (iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF )
            // InternalCssExtDsl.g:1921:2: iv_ruleCSSRulePostfix= ruleCSSRulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePostfixRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePostfix"


    // $ANTLR start "ruleCSSRulePostfix"
    // InternalCssExtDsl.g:1930:1: ruleCSSRulePostfix returns [EObject current=null] : (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) ;
    public final EObject ruleCSSRulePostfix() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        EObject this_CSSRulePrimary_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:1937:2: ( (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? ) )
            // InternalCssExtDsl.g:1938:2: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            {
            // InternalCssExtDsl.g:1938:2: (this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )? )
            // InternalCssExtDsl.g:1939:3: this_CSSRulePrimary_0= ruleCSSRulePrimary ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCSSRulePostfixAccess().getCSSRulePrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_CSSRulePrimary_0=ruleCSSRulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CSSRulePrimary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCssExtDsl.g:1947:3: ( () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18||(LA52_0>=41 && LA52_0<=42)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCssExtDsl.g:1948:4: () ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    {
                    // InternalCssExtDsl.g:1948:4: ()
                    // InternalCssExtDsl.g:1949:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getCSSRulePostfixAccess().getCSSRulePostfixRuleAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:1955:4: ( ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) ) )
                    // InternalCssExtDsl.g:1956:5: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    {
                    // InternalCssExtDsl.g:1956:5: ( (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' ) )
                    // InternalCssExtDsl.g:1957:6: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
                    {
                    // InternalCssExtDsl.g:1957:6: (lv_cardinality_2_1= '*' | lv_cardinality_2_2= '+' | lv_cardinality_2_3= '?' )
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
                            // InternalCssExtDsl.g:1958:7: lv_cardinality_2_1= '*'
                            {
                            lv_cardinality_2_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_cardinality_2_1, grammarAccess.getCSSRulePostfixAccess().getCardinalityAsteriskKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              							}
                              							setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalCssExtDsl.g:1969:7: lv_cardinality_2_2= '+'
                            {
                            lv_cardinality_2_2=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_cardinality_2_2, grammarAccess.getCSSRulePostfixAccess().getCardinalityPlusSignKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              							}
                              							setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalCssExtDsl.g:1980:7: lv_cardinality_2_3= '?'
                            {
                            lv_cardinality_2_3=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_cardinality_2_3, grammarAccess.getCSSRulePostfixAccess().getCardinalityQuestionMarkKeyword_1_1_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getCSSRulePostfixRule());
                              							}
                              							setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                              						
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
    // $ANTLR end "ruleCSSRulePostfix"


    // $ANTLR start "entryRuleCSSRuleBracket"
    // InternalCssExtDsl.g:2001:1: entryRuleCSSRuleBracket returns [EObject current=null] : iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF ;
    public final EObject entryRuleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleBracket = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2003:2: (iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF )
            // InternalCssExtDsl.g:2004:2: iv_ruleCSSRuleBracket= ruleCSSRuleBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleBracketRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleBracket"


    // $ANTLR start "ruleCSSRuleBracket"
    // InternalCssExtDsl.g:2013:1: ruleCSSRuleBracket returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) ;
    public final EObject ruleCSSRuleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_inner_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2020:2: ( ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' ) )
            // InternalCssExtDsl.g:2021:2: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            {
            // InternalCssExtDsl.g:2021:2: ( () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']' )
            // InternalCssExtDsl.g:2022:3: () otherlv_1= '[' ( (lv_inner_2_0= ruleCSSRuleOr ) ) otherlv_3= ']'
            {
            // InternalCssExtDsl.g:2022:3: ()
            // InternalCssExtDsl.g:2023:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleBracketAccess().getCSSRuleBracketAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCSSRuleBracketAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalCssExtDsl.g:2033:3: ( (lv_inner_2_0= ruleCSSRuleOr ) )
            // InternalCssExtDsl.g:2034:4: (lv_inner_2_0= ruleCSSRuleOr )
            {
            // InternalCssExtDsl.g:2034:4: (lv_inner_2_0= ruleCSSRuleOr )
            // InternalCssExtDsl.g:2035:5: lv_inner_2_0= ruleCSSRuleOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCSSRuleBracketAccess().getInnerCSSRuleOrParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_inner_2_0=ruleCSSRuleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCSSRuleBracketRule());
              					}
              					set(
              						current,
              						"inner",
              						lv_inner_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCSSRuleBracketAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleCSSRuleBracket"


    // $ANTLR start "entryRuleCSSRulePrimary"
    // InternalCssExtDsl.g:2063:1: entryRuleCSSRulePrimary returns [EObject current=null] : iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF ;
    public final EObject entryRuleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRulePrimary = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2065:2: (iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF )
            // InternalCssExtDsl.g:2066:2: iv_ruleCSSRulePrimary= ruleCSSRulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRulePrimaryRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRulePrimary"


    // $ANTLR start "ruleCSSRulePrimary"
    // InternalCssExtDsl.g:2075:1: ruleCSSRulePrimary returns [EObject current=null] : (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCSSRulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_7_0=null;
        EObject this_CSSRuleRef_0 = null;

        EObject this_CSSRuleBracket_1 = null;

        EObject this_CSSRuleLiteral_2 = null;

        EObject this_CSSRuleSymbol_3 = null;

        EObject this_CSSBaseType_4 = null;

        EObject this_CSSRuleRegex_5 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2082:2: ( (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // InternalCssExtDsl.g:2083:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // InternalCssExtDsl.g:2083:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt53=7;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalCssExtDsl.g:2084:3: this_CSSRuleRef_0= ruleCSSRuleRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleRef_0=ruleCSSRuleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:2093:3: this_CSSRuleBracket_1= ruleCSSRuleBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleBracketParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleBracket_1=ruleCSSRuleBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleBracket_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:2102:3: this_CSSRuleLiteral_2= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleLiteral_2=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:2111:3: this_CSSRuleSymbol_3= ruleCSSRuleSymbol
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleSymbolParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleSymbol_3=ruleCSSRuleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleSymbol_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCssExtDsl.g:2120:3: this_CSSBaseType_4= ruleCSSBaseType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSBaseTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSBaseType_4=ruleCSSBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSBaseType_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCssExtDsl.g:2129:3: this_CSSRuleRegex_5= ruleCSSRuleRegex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCSSRulePrimaryAccess().getCSSRuleRegexParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CSSRuleRegex_5=ruleCSSRuleRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CSSRuleRegex_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCssExtDsl.g:2138:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalCssExtDsl.g:2138:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalCssExtDsl.g:2139:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalCssExtDsl.g:2139:4: ()
                    // InternalCssExtDsl.g:2140:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCSSRulePrimaryAccess().getCSSNumLiteralAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:2146:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalCssExtDsl.g:2147:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalCssExtDsl.g:2147:5: (lv_value_7_0= RULE_INT )
                    // InternalCssExtDsl.g:2148:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getCSSRulePrimaryAccess().getValueINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSRulePrimaryRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.INT");
                      					
                    }

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCSSRulePrimary"


    // $ANTLR start "entryRuleCSSRuleRegex"
    // InternalCssExtDsl.g:2172:1: entryRuleCSSRuleRegex returns [EObject current=null] : iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF ;
    public final EObject entryRuleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleRegex = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2174:2: (iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF )
            // InternalCssExtDsl.g:2175:2: iv_ruleCSSRuleRegex= ruleCSSRuleRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleRegexRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleRegex"


    // $ANTLR start "ruleCSSRuleRegex"
    // InternalCssExtDsl.g:2184:1: ruleCSSRuleRegex returns [EObject current=null] : ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) ;
    public final EObject ruleCSSRuleRegex() throws RecognitionException {
        EObject current = null;

        Token lv_regex_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");

        try {
            // InternalCssExtDsl.g:2191:2: ( ( () ( (lv_regex_1_0= RULE_REGEX ) ) ) )
            // InternalCssExtDsl.g:2192:2: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            {
            // InternalCssExtDsl.g:2192:2: ( () ( (lv_regex_1_0= RULE_REGEX ) ) )
            // InternalCssExtDsl.g:2193:3: () ( (lv_regex_1_0= RULE_REGEX ) )
            {
            // InternalCssExtDsl.g:2193:3: ()
            // InternalCssExtDsl.g:2194:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleRegexAccess().getCSSRuleRegexAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:2200:3: ( (lv_regex_1_0= RULE_REGEX ) )
            // InternalCssExtDsl.g:2201:4: (lv_regex_1_0= RULE_REGEX )
            {
            // InternalCssExtDsl.g:2201:4: (lv_regex_1_0= RULE_REGEX )
            // InternalCssExtDsl.g:2202:5: lv_regex_1_0= RULE_REGEX
            {
            lv_regex_1_0=(Token)match(input,RULE_REGEX,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_regex_1_0, grammarAccess.getCSSRuleRegexAccess().getRegexREGEXTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCSSRuleRegexRule());
              					}
              					setWithLastConsumed(
              						current,
              						"regex",
              						lv_regex_1_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.REGEX");
              				
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
    // $ANTLR end "ruleCSSRuleRegex"


    // $ANTLR start "entryRuleCSSRuleLiteral"
    // InternalCssExtDsl.g:2225:1: entryRuleCSSRuleLiteral returns [EObject current=null] : iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF ;
    public final EObject entryRuleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleLiteral = null;


        try {
            // InternalCssExtDsl.g:2225:55: (iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF )
            // InternalCssExtDsl.g:2226:2: iv_ruleCSSRuleLiteral= ruleCSSRuleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleLiteralRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleLiteral"


    // $ANTLR start "ruleCSSRuleLiteral"
    // InternalCssExtDsl.g:2232:1: ruleCSSRuleLiteral returns [EObject current=null] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleCSSRuleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_value_3_0=null;
        EObject lv_doku_1_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:2238:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) ) )
            // InternalCssExtDsl.g:2239:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            {
            // InternalCssExtDsl.g:2239:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) ) )
            // InternalCssExtDsl.g:2240:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_value_3_0= RULE_ID ) )
            {
            // InternalCssExtDsl.g:2240:3: ()
            // InternalCssExtDsl.g:2241:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleLiteralAccess().getCSSRuleLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:2247:3: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_JDOC) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCssExtDsl.g:2248:4: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // InternalCssExtDsl.g:2248:4: ( (lv_doku_1_0= ruleDoku ) )
                    // InternalCssExtDsl.g:2249:5: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:2249:5: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:2250:6: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSRuleLiteralAccess().getDokuDokuParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSRuleLiteralRule());
                      						}
                      						set(
                      							current,
                      							"doku",
                      							lv_doku_1_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:2267:4: (this_WS_2= RULE_WS )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==RULE_WS) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:2268:5: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_2, grammarAccess.getCSSRuleLiteralAccess().getWSTerminalRuleCall_1_1());
                    	      				
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

            // InternalCssExtDsl.g:2274:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalCssExtDsl.g:2275:4: (lv_value_3_0= RULE_ID )
            {
            // InternalCssExtDsl.g:2275:4: (lv_value_3_0= RULE_ID )
            // InternalCssExtDsl.g:2276:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_3_0, grammarAccess.getCSSRuleLiteralAccess().getValueIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCSSRuleLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_3_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.ID");
              				
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
    // $ANTLR end "ruleCSSRuleLiteral"


    // $ANTLR start "entryRuleCSSRuleSymbol"
    // InternalCssExtDsl.g:2296:1: entryRuleCSSRuleSymbol returns [EObject current=null] : iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF ;
    public final EObject entryRuleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSRuleSymbol = null;


        try {
            // InternalCssExtDsl.g:2296:54: (iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF )
            // InternalCssExtDsl.g:2297:2: iv_ruleCSSRuleSymbol= ruleCSSRuleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSRuleSymbolRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSRuleSymbol"


    // $ANTLR start "ruleCSSRuleSymbol"
    // InternalCssExtDsl.g:2303:1: ruleCSSRuleSymbol returns [EObject current=null] : ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) ;
    public final EObject ruleCSSRuleSymbol() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token lv_symbol_3_1=null;
        Token lv_symbol_3_2=null;
        EObject lv_doku_1_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:2309:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) ) )
            // InternalCssExtDsl.g:2310:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            {
            // InternalCssExtDsl.g:2310:2: ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) ) )
            // InternalCssExtDsl.g:2311:3: () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            {
            // InternalCssExtDsl.g:2311:3: ()
            // InternalCssExtDsl.g:2312:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCSSRuleSymbolAccess().getCSSRuleSymbolAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:2318:3: ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_JDOC) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCssExtDsl.g:2319:4: ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )*
                    {
                    // InternalCssExtDsl.g:2319:4: ( (lv_doku_1_0= ruleDoku ) )
                    // InternalCssExtDsl.g:2320:5: (lv_doku_1_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:2320:5: (lv_doku_1_0= ruleDoku )
                    // InternalCssExtDsl.g:2321:6: lv_doku_1_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSRuleSymbolAccess().getDokuDokuParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_doku_1_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSRuleSymbolRule());
                      						}
                      						set(
                      							current,
                      							"doku",
                      							lv_doku_1_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCssExtDsl.g:2338:4: (this_WS_2= RULE_WS )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_WS) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalCssExtDsl.g:2339:5: this_WS_2= RULE_WS
                    	    {
                    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_2, grammarAccess.getCSSRuleSymbolAccess().getWSTerminalRuleCall_1_1());
                    	      				
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

            // InternalCssExtDsl.g:2345:3: ( ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) ) )
            // InternalCssExtDsl.g:2346:4: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            {
            // InternalCssExtDsl.g:2346:4: ( (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' ) )
            // InternalCssExtDsl.g:2347:5: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
            {
            // InternalCssExtDsl.g:2347:5: (lv_symbol_3_1= ',' | lv_symbol_3_2= '%' )
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
                    // InternalCssExtDsl.g:2348:6: lv_symbol_3_1= ','
                    {
                    lv_symbol_3_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_3_1, grammarAccess.getCSSRuleSymbolAccess().getSymbolCommaKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      						}
                      						setWithLastConsumed(current, "symbol", lv_symbol_3_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:2359:6: lv_symbol_3_2= '%'
                    {
                    lv_symbol_3_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_3_2, grammarAccess.getCSSRuleSymbolAccess().getSymbolPercentSignKeyword_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCSSRuleSymbolRule());
                      						}
                      						setWithLastConsumed(current, "symbol", lv_symbol_3_2, null);
                      					
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
    // $ANTLR end "ruleCSSRuleSymbol"


    // $ANTLR start "entryRuleCSSDefaultValue"
    // InternalCssExtDsl.g:2376:1: entryRuleCSSDefaultValue returns [EObject current=null] : iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF ;
    public final EObject entryRuleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSSDefaultValue = null;


        try {
            // InternalCssExtDsl.g:2376:56: (iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF )
            // InternalCssExtDsl.g:2377:2: iv_ruleCSSDefaultValue= ruleCSSDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSSDefaultValueRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSDefaultValue"


    // $ANTLR start "ruleCSSDefaultValue"
    // InternalCssExtDsl.g:2383:1: ruleCSSDefaultValue returns [EObject current=null] : ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSSDefaultValue() throws RecognitionException {
        EObject current = null;

        Token lv_ival_2_0=null;
        Token lv_dval_3_0=null;
        Token lv_sval_4_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:2389:2: ( ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) ) )
            // InternalCssExtDsl.g:2390:2: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
            {
            // InternalCssExtDsl.g:2390:2: ( ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) ) | ( (lv_ival_2_0= RULE_INT ) ) | ( (lv_dval_3_0= RULE_DOUBLE ) ) | ( (lv_sval_4_0= RULE_STRING ) ) )
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
                    // InternalCssExtDsl.g:2391:3: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    {
                    // InternalCssExtDsl.g:2391:3: ( () ( (lv_val_1_0= ruleCSSRuleLiteral ) ) )
                    // InternalCssExtDsl.g:2392:4: () ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    {
                    // InternalCssExtDsl.g:2392:4: ()
                    // InternalCssExtDsl.g:2393:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCSSDefaultValueAccess().getCSSDefaultValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCssExtDsl.g:2399:4: ( (lv_val_1_0= ruleCSSRuleLiteral ) )
                    // InternalCssExtDsl.g:2400:5: (lv_val_1_0= ruleCSSRuleLiteral )
                    {
                    // InternalCssExtDsl.g:2400:5: (lv_val_1_0= ruleCSSRuleLiteral )
                    // InternalCssExtDsl.g:2401:6: lv_val_1_0= ruleCSSRuleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCSSDefaultValueAccess().getValCSSRuleLiteralParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleCSSRuleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCSSDefaultValueRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.CSSRuleLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCssExtDsl.g:2420:3: ( (lv_ival_2_0= RULE_INT ) )
                    {
                    // InternalCssExtDsl.g:2420:3: ( (lv_ival_2_0= RULE_INT ) )
                    // InternalCssExtDsl.g:2421:4: (lv_ival_2_0= RULE_INT )
                    {
                    // InternalCssExtDsl.g:2421:4: (lv_ival_2_0= RULE_INT )
                    // InternalCssExtDsl.g:2422:5: lv_ival_2_0= RULE_INT
                    {
                    lv_ival_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_ival_2_0, grammarAccess.getCSSDefaultValueAccess().getIvalINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"ival",
                      						lv_ival_2_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.INT");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCssExtDsl.g:2439:3: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    {
                    // InternalCssExtDsl.g:2439:3: ( (lv_dval_3_0= RULE_DOUBLE ) )
                    // InternalCssExtDsl.g:2440:4: (lv_dval_3_0= RULE_DOUBLE )
                    {
                    // InternalCssExtDsl.g:2440:4: (lv_dval_3_0= RULE_DOUBLE )
                    // InternalCssExtDsl.g:2441:5: lv_dval_3_0= RULE_DOUBLE
                    {
                    lv_dval_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_dval_3_0, grammarAccess.getCSSDefaultValueAccess().getDvalDOUBLETerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"dval",
                      						lv_dval_3_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.DOUBLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCssExtDsl.g:2458:3: ( (lv_sval_4_0= RULE_STRING ) )
                    {
                    // InternalCssExtDsl.g:2458:3: ( (lv_sval_4_0= RULE_STRING ) )
                    // InternalCssExtDsl.g:2459:4: (lv_sval_4_0= RULE_STRING )
                    {
                    // InternalCssExtDsl.g:2459:4: (lv_sval_4_0= RULE_STRING )
                    // InternalCssExtDsl.g:2460:5: lv_sval_4_0= RULE_STRING
                    {
                    lv_sval_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sval_4_0, grammarAccess.getCSSDefaultValueAccess().getSvalSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCSSDefaultValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sval",
                      						lv_sval_4_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

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
    // $ANTLR end "ruleCSSDefaultValue"


    // $ANTLR start "entryRuleSubstructureSelector"
    // InternalCssExtDsl.g:2480:1: entryRuleSubstructureSelector returns [EObject current=null] : iv_ruleSubstructureSelector= ruleSubstructureSelector EOF ;
    public final EObject entryRuleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureSelector = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:2482:2: (iv_ruleSubstructureSelector= ruleSubstructureSelector EOF )
            // InternalCssExtDsl.g:2483:2: iv_ruleSubstructureSelector= ruleSubstructureSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureSelectorRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructureSelector"


    // $ANTLR start "ruleSubstructureSelector"
    // InternalCssExtDsl.g:2492:1: ruleSubstructureSelector returns [EObject current=null] : ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSubstructureSelector() throws RecognitionException {
        EObject current = null;

        Token lv_selectorName_1_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCssExtDsl.g:2499:2: ( ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? ) )
            // InternalCssExtDsl.g:2500:2: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            {
            // InternalCssExtDsl.g:2500:2: ( () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )? )
            // InternalCssExtDsl.g:2501:3: () ( (lv_selectorName_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            {
            // InternalCssExtDsl.g:2501:3: ()
            // InternalCssExtDsl.g:2502:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSubstructureSelectorAccess().getSubstructureSelectorAction_0(),
              					current);
              			
            }

            }

            // InternalCssExtDsl.g:2508:3: ( (lv_selectorName_1_0= RULE_ID ) )
            // InternalCssExtDsl.g:2509:4: (lv_selectorName_1_0= RULE_ID )
            {
            // InternalCssExtDsl.g:2509:4: (lv_selectorName_1_0= RULE_ID )
            // InternalCssExtDsl.g:2510:5: lv_selectorName_1_0= RULE_ID
            {
            lv_selectorName_1_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_selectorName_1_0, grammarAccess.getSubstructureSelectorAccess().getSelectorNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSubstructureSelectorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"selectorName",
              						lv_selectorName_1_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.ID");
              				
            }

            }


            }

            // InternalCssExtDsl.g:2526:3: (otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCssExtDsl.g:2527:4: otherlv_2= '[' ( (lv_var_3_0= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSubstructureSelectorAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalCssExtDsl.g:2531:4: ( (lv_var_3_0= RULE_ID ) )
                    // InternalCssExtDsl.g:2532:5: (lv_var_3_0= RULE_ID )
                    {
                    // InternalCssExtDsl.g:2532:5: (lv_var_3_0= RULE_ID )
                    // InternalCssExtDsl.g:2533:6: lv_var_3_0= RULE_ID
                    {
                    lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_var_3_0, grammarAccess.getSubstructureSelectorAccess().getVarIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSubstructureSelectorRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"var",
                      							lv_var_3_0,
                      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.ID");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSubstructureSelectorAccess().getRightSquareBracketKeyword_2_2());
                      			
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
    // $ANTLR end "ruleSubstructureSelector"


    // $ANTLR start "entryRuleSubstructure"
    // InternalCssExtDsl.g:2561:1: entryRuleSubstructure returns [EObject current=null] : iv_ruleSubstructure= ruleSubstructure EOF ;
    public final EObject entryRuleSubstructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructure = null;


        try {
            // InternalCssExtDsl.g:2561:53: (iv_ruleSubstructure= ruleSubstructure EOF )
            // InternalCssExtDsl.g:2562:2: iv_ruleSubstructure= ruleSubstructure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructure"


    // $ANTLR start "ruleSubstructure"
    // InternalCssExtDsl.g:2568:1: ruleSubstructure returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSubstructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_doku_0_0 = null;

        EObject lv_childs_4_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:2574:2: ( ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' ) )
            // InternalCssExtDsl.g:2575:2: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            {
            // InternalCssExtDsl.g:2575:2: ( ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}' )
            // InternalCssExtDsl.g:2576:3: ( (lv_doku_0_0= ruleDoku ) )? otherlv_1= 'substructure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+ otherlv_5= '}'
            {
            // InternalCssExtDsl.g:2576:3: ( (lv_doku_0_0= ruleDoku ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_JDOC) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCssExtDsl.g:2577:4: (lv_doku_0_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:2577:4: (lv_doku_0_0= ruleDoku )
                    // InternalCssExtDsl.g:2578:5: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubstructureAccess().getDokuDokuParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubstructureRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_0_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSubstructureAccess().getSubstructureKeyword_1());
              		
            }
            // InternalCssExtDsl.g:2599:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCssExtDsl.g:2600:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCssExtDsl.g:2600:4: (lv_name_2_0= RULE_ID )
            // InternalCssExtDsl.g:2601:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getSubstructureAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSubstructureRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.fx.ide.css.cssext.CssExtDsl.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSubstructureAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCssExtDsl.g:2621:3: ( (lv_childs_4_0= ruleSubstructureStyleclass ) )+
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
            	    // InternalCssExtDsl.g:2622:4: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    {
            	    // InternalCssExtDsl.g:2622:4: (lv_childs_4_0= ruleSubstructureStyleclass )
            	    // InternalCssExtDsl.g:2623:5: lv_childs_4_0= ruleSubstructureStyleclass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubstructureAccess().getChildsSubstructureStyleclassParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_childs_4_0=ruleSubstructureStyleclass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSubstructureRule());
            	      					}
            	      					add(
            	      						current,
            	      						"childs",
            	      						lv_childs_4_0,
            	      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.SubstructureStyleclass");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSubstructureAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleSubstructure"


    // $ANTLR start "entryRuleSubstructureStyleclass"
    // InternalCssExtDsl.g:2648:1: entryRuleSubstructureStyleclass returns [EObject current=null] : iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF ;
    public final EObject entryRuleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstructureStyleclass = null;


        try {
            // InternalCssExtDsl.g:2648:63: (iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF )
            // InternalCssExtDsl.g:2649:2: iv_ruleSubstructureStyleclass= ruleSubstructureStyleclass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstructureStyleclassRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstructureStyleclass"


    // $ANTLR start "ruleSubstructureStyleclass"
    // InternalCssExtDsl.g:2655:1: ruleSubstructureStyleclass returns [EObject current=null] : ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleSubstructureStyleclass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_doku_0_0 = null;

        EObject lv_selectors_3_0 = null;

        EObject lv_childs_5_0 = null;



        	enterRule();

        try {
            // InternalCssExtDsl.g:2661:2: ( ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? ) )
            // InternalCssExtDsl.g:2662:2: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            {
            // InternalCssExtDsl.g:2662:2: ( ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )? )
            // InternalCssExtDsl.g:2663:3: ( (lv_doku_0_0= ruleDoku ) )? ( ( ruleQualifiedName ) ) otherlv_2= 'styleclass' ( (lv_selectors_3_0= ruleSubstructureSelector ) )+ (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            {
            // InternalCssExtDsl.g:2663:3: ( (lv_doku_0_0= ruleDoku ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_JDOC) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCssExtDsl.g:2664:4: (lv_doku_0_0= ruleDoku )
                    {
                    // InternalCssExtDsl.g:2664:4: (lv_doku_0_0= ruleDoku )
                    // InternalCssExtDsl.g:2665:5: lv_doku_0_0= ruleDoku
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getDokuDokuParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_5);
                    lv_doku_0_0=ruleDoku();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                      					}
                      					set(
                      						current,
                      						"doku",
                      						lv_doku_0_0,
                      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.Doku");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCssExtDsl.g:2682:3: ( ( ruleQualifiedName ) )
            // InternalCssExtDsl.g:2683:4: ( ruleQualifiedName )
            {
            // InternalCssExtDsl.g:2683:4: ( ruleQualifiedName )
            // InternalCssExtDsl.g:2684:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSubstructureStyleclassRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getElementElementDefinitionCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSubstructureStyleclassAccess().getStyleclassKeyword_2());
              		
            }
            // InternalCssExtDsl.g:2702:3: ( (lv_selectors_3_0= ruleSubstructureSelector ) )+
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
            	    // InternalCssExtDsl.g:2703:4: (lv_selectors_3_0= ruleSubstructureSelector )
            	    {
            	    // InternalCssExtDsl.g:2703:4: (lv_selectors_3_0= ruleSubstructureSelector )
            	    // InternalCssExtDsl.g:2704:5: lv_selectors_3_0= ruleSubstructureSelector
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getSelectorsSubstructureSelectorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_selectors_3_0=ruleSubstructureSelector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"selectors",
            	      						lv_selectors_3_0,
            	      						"org.eclipse.fx.ide.css.cssext.CssExtDsl.SubstructureSelector");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            // InternalCssExtDsl.g:2721:3: (otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==20) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCssExtDsl.g:2722:4: otherlv_4= '{' ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSubstructureStyleclassAccess().getLeftCurlyBracketKeyword_4_0());
                      			
                    }
                    // InternalCssExtDsl.g:2726:4: ( (lv_childs_5_0= ruleSubstructureStyleclass ) )+
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
                    	    // InternalCssExtDsl.g:2727:5: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    {
                    	    // InternalCssExtDsl.g:2727:5: (lv_childs_5_0= ruleSubstructureStyleclass )
                    	    // InternalCssExtDsl.g:2728:6: lv_childs_5_0= ruleSubstructureStyleclass
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSubstructureStyleclassAccess().getChildsSubstructureStyleclassParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_childs_5_0=ruleSubstructureStyleclass();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getSubstructureStyleclassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"childs",
                    	      							lv_childs_5_0,
                    	      							"org.eclipse.fx.ide.css.cssext.CssExtDsl.SubstructureStyleclass");
                    	      						afterParserOrEnumRuleCall();
                    	      					
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

                    otherlv_6=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSubstructureStyleclassAccess().getRightCurlyBracketKeyword_4_2());
                      			
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
        }
        return current;
    }
    // $ANTLR end "ruleSubstructureStyleclass"

    // $ANTLR start synpred1_InternalCssExtDsl
    public final void synpred1_InternalCssExtDsl_fragment() throws RecognitionException {   
        // InternalCssExtDsl.g:236:5: ( '.' )
        // InternalCssExtDsl.g:236:6: '.'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCssExtDsl

    // Delegated rules

    public final boolean synpred1_InternalCssExtDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCssExtDsl_fragment(); // can never throw exception
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
    static final String dfa_4s = "\1\uffff\1\4\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\2\13\uffff\1\4\1\uffff\1\1",
            "",
            "\1\3\1\4\14\uffff\1\4",
            "\1\5\2\uffff\1\7\11\uffff\1\7\1\uffff\1\7\4\uffff\1\6",
            "",
            "\1\10",
            "",
            "",
            "\1\5\2\uffff\1\7\11\uffff\1\7\1\uffff\1\7\4\uffff\1\6"
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
            return "()* loopback of 368:3: ( ( (lv_rules_5_0= ruleCSSRuleDefinition ) ) | ( (lv_subpackages_6_0= rulePackageDefinition ) ) | ( (lv_elements_7_0= ruleElementDefinition ) ) )*";
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
            return "526:2: ( ( () ( ( (lv_doku_1_0= ruleDoku ) ) (this_WS_2= RULE_WS )* )? ( (lv_type_3_0= '@INT' ) ) otherlv_4= '(' (this_WS_5= RULE_WS )* ( (lv_from_6_0= RULE_INT ) ) (this_WS_7= RULE_WS )* otherlv_8= '->' (this_WS_9= RULE_WS )* ( (lv_to_10_0= RULE_INT ) ) (this_WS_11= RULE_WS )* otherlv_12= ')' ) | ( () ( ( (lv_doku_14_0= ruleDoku ) ) (this_WS_15= RULE_WS )* )? ( (lv_type_16_0= '@NUM' ) ) otherlv_17= '(' (this_WS_18= RULE_WS )* ( (lv_from_19_0= RULE_DOUBLE ) ) (this_WS_20= RULE_WS )* otherlv_21= '->' (this_WS_22= RULE_WS )* ( (lv_to_23_0= RULE_DOUBLE ) ) (this_WS_24= RULE_WS )* otherlv_25= ')' ) | ( () ( ( (lv_doku_27_0= ruleDoku ) ) (this_WS_28= RULE_WS )* )? ( (lv_type_29_0= '@PROPERTY_REF' ) ) otherlv_30= '(' ( (lv_rule_31_0= ruleCSSRuleRef ) ) otherlv_32= ')' ) | ( ( ( (lv_doku_33_0= ruleDoku ) ) (this_WS_34= RULE_WS )* )? ( ( ( (lv_type_35_0= '@INT' ) ) (this_WS_36= RULE_WS )* ) | ( ( (lv_type_37_0= '@NUM' ) ) (this_WS_38= RULE_WS )* ) | ( ( (lv_type_39_0= '@STRING' ) ) (this_WS_40= RULE_WS )* ) | ( ( (lv_type_41_0= '@URL' ) ) (this_WS_42= RULE_WS )* ) ) ) )";
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
            return "2083:2: (this_CSSRuleRef_0= ruleCSSRuleRef | this_CSSRuleBracket_1= ruleCSSRuleBracket | this_CSSRuleLiteral_2= ruleCSSRuleLiteral | this_CSSRuleSymbol_3= ruleCSSRuleSymbol | this_CSSBaseType_4= ruleCSSBaseType | this_CSSRuleRegex_5= ruleCSSRuleRegex | ( () ( (lv_value_7_0= RULE_INT ) ) ) )";
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