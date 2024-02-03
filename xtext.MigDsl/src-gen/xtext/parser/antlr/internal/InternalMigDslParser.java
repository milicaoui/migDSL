package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.MigDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMigDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mappings'", "'{'", "'}'", "'options'", "'DataTypeMigration'", "'AllowAdditionalFields'", "'source'", "'/'", "'constraints'", "'target'", "'('", "','", "')'", "'Unique:'", "'uniqueColumns'", "'NotNull:'", "'column'", "'PK:'", "'keyColumns'", "'REFERENCES'", "'name:'", "'output:'", "'input:'", "'NESTING_LIST'", "'inputs:'", "'AS'", "'NESTING_OBJECT'", "'Basic'", "'ListField'", "'ObjectField'"
    };
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMigDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMigDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMigDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMigDsl.g"; }



     	private MigDslGrammarAccess grammarAccess;

        public InternalMigDslParser(TokenStream input, MigDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Migration";
       	}

       	@Override
       	protected MigDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMigration"
    // InternalMigDsl.g:65:1: entryRuleMigration returns [EObject current=null] : iv_ruleMigration= ruleMigration EOF ;
    public final EObject entryRuleMigration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigration = null;


        try {
            // InternalMigDsl.g:65:50: (iv_ruleMigration= ruleMigration EOF )
            // InternalMigDsl.g:66:2: iv_ruleMigration= ruleMigration EOF
            {
             newCompositeNode(grammarAccess.getMigrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMigration=ruleMigration();

            state._fsp--;

             current =iv_ruleMigration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMigration"


    // $ANTLR start "ruleMigration"
    // InternalMigDsl.g:72:1: ruleMigration returns [EObject current=null] : ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ( (lv_relationaldb_5_0= ruleRelationalDb ) )? ( (lv_mongodb_6_0= ruleMongoDb ) )? ( (lv_options_7_0= ruleOptions ) )? ) ;
    public final EObject ruleMigration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;

        EObject lv_relationaldb_5_0 = null;

        EObject lv_mongodb_6_0 = null;

        EObject lv_options_7_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:78:2: ( ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ( (lv_relationaldb_5_0= ruleRelationalDb ) )? ( (lv_mongodb_6_0= ruleMongoDb ) )? ( (lv_options_7_0= ruleOptions ) )? ) )
            // InternalMigDsl.g:79:2: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ( (lv_relationaldb_5_0= ruleRelationalDb ) )? ( (lv_mongodb_6_0= ruleMongoDb ) )? ( (lv_options_7_0= ruleOptions ) )? )
            {
            // InternalMigDsl.g:79:2: ( () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ( (lv_relationaldb_5_0= ruleRelationalDb ) )? ( (lv_mongodb_6_0= ruleMongoDb ) )? ( (lv_options_7_0= ruleOptions ) )? )
            // InternalMigDsl.g:80:3: () otherlv_1= 'mappings' otherlv_2= '{' ( (lv_mappings_3_0= ruleMapping ) )* otherlv_4= '}' ( (lv_relationaldb_5_0= ruleRelationalDb ) )? ( (lv_mongodb_6_0= ruleMongoDb ) )? ( (lv_options_7_0= ruleOptions ) )?
            {
            // InternalMigDsl.g:80:3: ()
            // InternalMigDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMigrationAccess().getMigrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMigrationAccess().getMappingsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMigrationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMigDsl.g:95:3: ( (lv_mappings_3_0= ruleMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMigDsl.g:96:4: (lv_mappings_3_0= ruleMapping )
            	    {
            	    // InternalMigDsl.g:96:4: (lv_mappings_3_0= ruleMapping )
            	    // InternalMigDsl.g:97:5: lv_mappings_3_0= ruleMapping
            	    {

            	    					newCompositeNode(grammarAccess.getMigrationAccess().getMappingsMappingParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_mappings_3_0=ruleMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMigrationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappings",
            	    						lv_mappings_3_0,
            	    						"xtext.MigDsl.Mapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getMigrationAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalMigDsl.g:118:3: ( (lv_relationaldb_5_0= ruleRelationalDb ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NEWLINE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalMigDsl.g:119:4: (lv_relationaldb_5_0= ruleRelationalDb )
                    {
                    // InternalMigDsl.g:119:4: (lv_relationaldb_5_0= ruleRelationalDb )
                    // InternalMigDsl.g:120:5: lv_relationaldb_5_0= ruleRelationalDb
                    {

                    					newCompositeNode(grammarAccess.getMigrationAccess().getRelationaldbRelationalDbParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_relationaldb_5_0=ruleRelationalDb();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMigrationRule());
                    					}
                    					set(
                    						current,
                    						"relationaldb",
                    						lv_relationaldb_5_0,
                    						"xtext.MigDsl.RelationalDb");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMigDsl.g:137:3: ( (lv_mongodb_6_0= ruleMongoDb ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NEWLINE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalMigDsl.g:138:4: (lv_mongodb_6_0= ruleMongoDb )
                    {
                    // InternalMigDsl.g:138:4: (lv_mongodb_6_0= ruleMongoDb )
                    // InternalMigDsl.g:139:5: lv_mongodb_6_0= ruleMongoDb
                    {

                    					newCompositeNode(grammarAccess.getMigrationAccess().getMongodbMongoDbParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_mongodb_6_0=ruleMongoDb();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMigrationRule());
                    					}
                    					set(
                    						current,
                    						"mongodb",
                    						lv_mongodb_6_0,
                    						"xtext.MigDsl.MongoDb");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMigDsl.g:156:3: ( (lv_options_7_0= ruleOptions ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NEWLINE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMigDsl.g:157:4: (lv_options_7_0= ruleOptions )
                    {
                    // InternalMigDsl.g:157:4: (lv_options_7_0= ruleOptions )
                    // InternalMigDsl.g:158:5: lv_options_7_0= ruleOptions
                    {

                    					newCompositeNode(grammarAccess.getMigrationAccess().getOptionsOptionsParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_options_7_0=ruleOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMigrationRule());
                    					}
                    					set(
                    						current,
                    						"options",
                    						lv_options_7_0,
                    						"xtext.MigDsl.Options");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigration"


    // $ANTLR start "entryRuleOptions"
    // InternalMigDsl.g:179:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // InternalMigDsl.g:179:48: (iv_ruleOptions= ruleOptions EOF )
            // InternalMigDsl.g:180:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // InternalMigDsl.g:186:1: ruleOptions returns [EObject current=null] : (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'options' ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) ) ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) ) ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_0=null;
        Token otherlv_1=null;
        Token lv_DataTypeMigration_2_0=null;
        Token lv_AllowAdditionalFields_3_0=null;


        	enterRule();

        try {
            // InternalMigDsl.g:192:2: ( (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'options' ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) ) ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) ) ) )
            // InternalMigDsl.g:193:2: (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'options' ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) ) ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) ) )
            {
            // InternalMigDsl.g:193:2: (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'options' ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) ) ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) ) )
            // InternalMigDsl.g:194:3: this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'options' ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) ) ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) )
            {
            this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_6); 

            			newLeafNode(this_NEWLINE_0, grammarAccess.getOptionsAccess().getNEWLINETerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionsAccess().getOptionsKeyword_1());
            		
            // InternalMigDsl.g:202:3: ( (lv_DataTypeMigration_2_0= 'DataTypeMigration' ) )
            // InternalMigDsl.g:203:4: (lv_DataTypeMigration_2_0= 'DataTypeMigration' )
            {
            // InternalMigDsl.g:203:4: (lv_DataTypeMigration_2_0= 'DataTypeMigration' )
            // InternalMigDsl.g:204:5: lv_DataTypeMigration_2_0= 'DataTypeMigration'
            {
            lv_DataTypeMigration_2_0=(Token)match(input,16,FOLLOW_8); 

            					newLeafNode(lv_DataTypeMigration_2_0, grammarAccess.getOptionsAccess().getDataTypeMigrationDataTypeMigrationKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionsRule());
            					}
            					setWithLastConsumed(current, "DataTypeMigration", lv_DataTypeMigration_2_0 != null, "DataTypeMigration");
            				

            }


            }

            // InternalMigDsl.g:216:3: ( (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' ) )
            // InternalMigDsl.g:217:4: (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' )
            {
            // InternalMigDsl.g:217:4: (lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields' )
            // InternalMigDsl.g:218:5: lv_AllowAdditionalFields_3_0= 'AllowAdditionalFields'
            {
            lv_AllowAdditionalFields_3_0=(Token)match(input,17,FOLLOW_2); 

            					newLeafNode(lv_AllowAdditionalFields_3_0, grammarAccess.getOptionsAccess().getAllowAdditionalFieldsAllowAdditionalFieldsKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionsRule());
            					}
            					setWithLastConsumed(current, "AllowAdditionalFields", lv_AllowAdditionalFields_3_0 != null, "AllowAdditionalFields");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleConstraint"
    // InternalMigDsl.g:234:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalMigDsl.g:234:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalMigDsl.g:235:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalMigDsl.g:241:1: ruleConstraint returns [EObject current=null] : (this_Unique_0= ruleUnique | this_NotNull_1= ruleNotNull | this_PrimaryKey_2= rulePrimaryKey | this_ForeignKey_3= ruleForeignKey ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_Unique_0 = null;

        EObject this_NotNull_1 = null;

        EObject this_PrimaryKey_2 = null;

        EObject this_ForeignKey_3 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:247:2: ( (this_Unique_0= ruleUnique | this_NotNull_1= ruleNotNull | this_PrimaryKey_2= rulePrimaryKey | this_ForeignKey_3= ruleForeignKey ) )
            // InternalMigDsl.g:248:2: (this_Unique_0= ruleUnique | this_NotNull_1= ruleNotNull | this_PrimaryKey_2= rulePrimaryKey | this_ForeignKey_3= ruleForeignKey )
            {
            // InternalMigDsl.g:248:2: (this_Unique_0= ruleUnique | this_NotNull_1= ruleNotNull | this_PrimaryKey_2= rulePrimaryKey | this_ForeignKey_3= ruleForeignKey )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMigDsl.g:249:3: this_Unique_0= ruleUnique
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getUniqueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Unique_0=ruleUnique();

                    state._fsp--;


                    			current = this_Unique_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMigDsl.g:258:3: this_NotNull_1= ruleNotNull
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getNotNullParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotNull_1=ruleNotNull();

                    state._fsp--;


                    			current = this_NotNull_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMigDsl.g:267:3: this_PrimaryKey_2= rulePrimaryKey
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getPrimaryKeyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryKey_2=rulePrimaryKey();

                    state._fsp--;


                    			current = this_PrimaryKey_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMigDsl.g:276:3: this_ForeignKey_3= ruleForeignKey
                    {

                    			newCompositeNode(grammarAccess.getConstraintAccess().getForeignKeyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForeignKey_3=ruleForeignKey();

                    state._fsp--;


                    			current = this_ForeignKey_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelationalDb"
    // InternalMigDsl.g:288:1: entryRuleRelationalDb returns [EObject current=null] : iv_ruleRelationalDb= ruleRelationalDb EOF ;
    public final EObject entryRuleRelationalDb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalDb = null;


        try {
            // InternalMigDsl.g:288:53: (iv_ruleRelationalDb= ruleRelationalDb EOF )
            // InternalMigDsl.g:289:2: iv_ruleRelationalDb= ruleRelationalDb EOF
            {
             newCompositeNode(grammarAccess.getRelationalDbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalDb=ruleRelationalDb();

            state._fsp--;

             current =iv_ruleRelationalDb; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationalDb"


    // $ANTLR start "ruleRelationalDb"
    // InternalMigDsl.g:295:1: ruleRelationalDb returns [EObject current=null] : (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'source' this_NEWLINE_2= RULE_NEWLINE ( (lv_db_3_0= ruleEString ) )? otherlv_4= '/' ( (lv_host_5_0= ruleEString ) )? otherlv_6= '/' ( (lv_port_7_0= ruleEString ) )? otherlv_8= '/' ( (lv_username_9_0= ruleEString ) )? otherlv_10= '/' ( (lv_password_11_0= ruleEString ) )? (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* ) this_NEWLINE_16= RULE_NEWLINE otherlv_17= 'constraints' (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* ) ) ;
    public final EObject ruleRelationalDb() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_0=null;
        Token otherlv_1=null;
        Token this_NEWLINE_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_NEWLINE_12=null;
        Token this_NEWLINE_14=null;
        Token this_NEWLINE_16=null;
        Token otherlv_17=null;
        Token this_NEWLINE_18=null;
        Token this_NEWLINE_20=null;
        AntlrDatatypeRuleToken lv_db_3_0 = null;

        AntlrDatatypeRuleToken lv_host_5_0 = null;

        AntlrDatatypeRuleToken lv_port_7_0 = null;

        AntlrDatatypeRuleToken lv_username_9_0 = null;

        AntlrDatatypeRuleToken lv_password_11_0 = null;

        EObject lv_tables_13_0 = null;

        EObject lv_tables_15_0 = null;

        EObject lv_constraints_19_0 = null;

        EObject lv_constraints_21_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:301:2: ( (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'source' this_NEWLINE_2= RULE_NEWLINE ( (lv_db_3_0= ruleEString ) )? otherlv_4= '/' ( (lv_host_5_0= ruleEString ) )? otherlv_6= '/' ( (lv_port_7_0= ruleEString ) )? otherlv_8= '/' ( (lv_username_9_0= ruleEString ) )? otherlv_10= '/' ( (lv_password_11_0= ruleEString ) )? (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* ) this_NEWLINE_16= RULE_NEWLINE otherlv_17= 'constraints' (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* ) ) )
            // InternalMigDsl.g:302:2: (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'source' this_NEWLINE_2= RULE_NEWLINE ( (lv_db_3_0= ruleEString ) )? otherlv_4= '/' ( (lv_host_5_0= ruleEString ) )? otherlv_6= '/' ( (lv_port_7_0= ruleEString ) )? otherlv_8= '/' ( (lv_username_9_0= ruleEString ) )? otherlv_10= '/' ( (lv_password_11_0= ruleEString ) )? (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* ) this_NEWLINE_16= RULE_NEWLINE otherlv_17= 'constraints' (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* ) )
            {
            // InternalMigDsl.g:302:2: (this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'source' this_NEWLINE_2= RULE_NEWLINE ( (lv_db_3_0= ruleEString ) )? otherlv_4= '/' ( (lv_host_5_0= ruleEString ) )? otherlv_6= '/' ( (lv_port_7_0= ruleEString ) )? otherlv_8= '/' ( (lv_username_9_0= ruleEString ) )? otherlv_10= '/' ( (lv_password_11_0= ruleEString ) )? (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* ) this_NEWLINE_16= RULE_NEWLINE otherlv_17= 'constraints' (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* ) )
            // InternalMigDsl.g:303:3: this_NEWLINE_0= RULE_NEWLINE otherlv_1= 'source' this_NEWLINE_2= RULE_NEWLINE ( (lv_db_3_0= ruleEString ) )? otherlv_4= '/' ( (lv_host_5_0= ruleEString ) )? otherlv_6= '/' ( (lv_port_7_0= ruleEString ) )? otherlv_8= '/' ( (lv_username_9_0= ruleEString ) )? otherlv_10= '/' ( (lv_password_11_0= ruleEString ) )? (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* ) this_NEWLINE_16= RULE_NEWLINE otherlv_17= 'constraints' (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* )
            {
            this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

            			newLeafNode(this_NEWLINE_0, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationalDbAccess().getSourceKeyword_1());
            		
            this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_11); 

            			newLeafNode(this_NEWLINE_2, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_2());
            		
            // InternalMigDsl.g:315:3: ( (lv_db_3_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMigDsl.g:316:4: (lv_db_3_0= ruleEString )
                    {
                    // InternalMigDsl.g:316:4: (lv_db_3_0= ruleEString )
                    // InternalMigDsl.g:317:5: lv_db_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRelationalDbAccess().getDbEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_db_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationalDbRule());
                    					}
                    					set(
                    						current,
                    						"db",
                    						lv_db_3_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationalDbAccess().getSolidusKeyword_4());
            		
            // InternalMigDsl.g:338:3: ( (lv_host_5_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMigDsl.g:339:4: (lv_host_5_0= ruleEString )
                    {
                    // InternalMigDsl.g:339:4: (lv_host_5_0= ruleEString )
                    // InternalMigDsl.g:340:5: lv_host_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRelationalDbAccess().getHostEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_host_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationalDbRule());
                    					}
                    					set(
                    						current,
                    						"host",
                    						lv_host_5_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationalDbAccess().getSolidusKeyword_6());
            		
            // InternalMigDsl.g:361:3: ( (lv_port_7_0= ruleEString ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMigDsl.g:362:4: (lv_port_7_0= ruleEString )
                    {
                    // InternalMigDsl.g:362:4: (lv_port_7_0= ruleEString )
                    // InternalMigDsl.g:363:5: lv_port_7_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRelationalDbAccess().getPortEStringParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_port_7_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationalDbRule());
                    					}
                    					set(
                    						current,
                    						"port",
                    						lv_port_7_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationalDbAccess().getSolidusKeyword_8());
            		
            // InternalMigDsl.g:384:3: ( (lv_username_9_0= ruleEString ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMigDsl.g:385:4: (lv_username_9_0= ruleEString )
                    {
                    // InternalMigDsl.g:385:4: (lv_username_9_0= ruleEString )
                    // InternalMigDsl.g:386:5: lv_username_9_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRelationalDbAccess().getUsernameEStringParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_username_9_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationalDbRule());
                    					}
                    					set(
                    						current,
                    						"username",
                    						lv_username_9_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getRelationalDbAccess().getSolidusKeyword_10());
            		
            // InternalMigDsl.g:407:3: ( (lv_password_11_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMigDsl.g:408:4: (lv_password_11_0= ruleEString )
                    {
                    // InternalMigDsl.g:408:4: (lv_password_11_0= ruleEString )
                    // InternalMigDsl.g:409:5: lv_password_11_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRelationalDbAccess().getPasswordEStringParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_password_11_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelationalDbRule());
                    					}
                    					set(
                    						current,
                    						"password",
                    						lv_password_11_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMigDsl.g:426:3: (this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )* )
            // InternalMigDsl.g:427:4: this_NEWLINE_12= RULE_NEWLINE ( (lv_tables_13_0= ruleTable ) ) (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )*
            {
            this_NEWLINE_12=(Token)match(input,RULE_NEWLINE,FOLLOW_14); 

            				newLeafNode(this_NEWLINE_12, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_12_0());
            			
            // InternalMigDsl.g:431:4: ( (lv_tables_13_0= ruleTable ) )
            // InternalMigDsl.g:432:5: (lv_tables_13_0= ruleTable )
            {
            // InternalMigDsl.g:432:5: (lv_tables_13_0= ruleTable )
            // InternalMigDsl.g:433:6: lv_tables_13_0= ruleTable
            {

            						newCompositeNode(grammarAccess.getRelationalDbAccess().getTablesTableParserRuleCall_12_1_0());
            					
            pushFollow(FOLLOW_10);
            lv_tables_13_0=ruleTable();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationalDbRule());
            						}
            						add(
            							current,
            							"tables",
            							lv_tables_13_0,
            							"xtext.MigDsl.Table");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMigDsl.g:450:4: (this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_NEWLINE) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=RULE_STRING && LA11_1<=RULE_ID)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMigDsl.g:451:5: this_NEWLINE_14= RULE_NEWLINE ( (lv_tables_15_0= ruleTable ) )
            	    {
            	    this_NEWLINE_14=(Token)match(input,RULE_NEWLINE,FOLLOW_14); 

            	    					newLeafNode(this_NEWLINE_14, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_12_2_0());
            	    				
            	    // InternalMigDsl.g:455:5: ( (lv_tables_15_0= ruleTable ) )
            	    // InternalMigDsl.g:456:6: (lv_tables_15_0= ruleTable )
            	    {
            	    // InternalMigDsl.g:456:6: (lv_tables_15_0= ruleTable )
            	    // InternalMigDsl.g:457:7: lv_tables_15_0= ruleTable
            	    {

            	    							newCompositeNode(grammarAccess.getRelationalDbAccess().getTablesTableParserRuleCall_12_2_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_tables_15_0=ruleTable();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRelationalDbRule());
            	    							}
            	    							add(
            	    								current,
            	    								"tables",
            	    								lv_tables_15_0,
            	    								"xtext.MigDsl.Table");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            this_NEWLINE_16=(Token)match(input,RULE_NEWLINE,FOLLOW_15); 

            			newLeafNode(this_NEWLINE_16, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_13());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getRelationalDbAccess().getConstraintsKeyword_14());
            		
            // InternalMigDsl.g:484:3: (this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )* )
            // InternalMigDsl.g:485:4: this_NEWLINE_18= RULE_NEWLINE ( (lv_constraints_19_0= ruleConstraint ) ) (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )*
            {
            this_NEWLINE_18=(Token)match(input,RULE_NEWLINE,FOLLOW_16); 

            				newLeafNode(this_NEWLINE_18, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_15_0());
            			
            // InternalMigDsl.g:489:4: ( (lv_constraints_19_0= ruleConstraint ) )
            // InternalMigDsl.g:490:5: (lv_constraints_19_0= ruleConstraint )
            {
            // InternalMigDsl.g:490:5: (lv_constraints_19_0= ruleConstraint )
            // InternalMigDsl.g:491:6: lv_constraints_19_0= ruleConstraint
            {

            						newCompositeNode(grammarAccess.getRelationalDbAccess().getConstraintsConstraintParserRuleCall_15_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_constraints_19_0=ruleConstraint();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationalDbRule());
            						}
            						add(
            							current,
            							"constraints",
            							lv_constraints_19_0,
            							"xtext.MigDsl.Constraint");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMigDsl.g:508:4: (this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_NEWLINE) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||LA12_1==25||LA12_1==27||LA12_1==29) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMigDsl.g:509:5: this_NEWLINE_20= RULE_NEWLINE ( (lv_constraints_21_0= ruleConstraint ) )
            	    {
            	    this_NEWLINE_20=(Token)match(input,RULE_NEWLINE,FOLLOW_16); 

            	    					newLeafNode(this_NEWLINE_20, grammarAccess.getRelationalDbAccess().getNEWLINETerminalRuleCall_15_2_0());
            	    				
            	    // InternalMigDsl.g:513:5: ( (lv_constraints_21_0= ruleConstraint ) )
            	    // InternalMigDsl.g:514:6: (lv_constraints_21_0= ruleConstraint )
            	    {
            	    // InternalMigDsl.g:514:6: (lv_constraints_21_0= ruleConstraint )
            	    // InternalMigDsl.g:515:7: lv_constraints_21_0= ruleConstraint
            	    {

            	    							newCompositeNode(grammarAccess.getRelationalDbAccess().getConstraintsConstraintParserRuleCall_15_2_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_21_0=ruleConstraint();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRelationalDbRule());
            	    							}
            	    							add(
            	    								current,
            	    								"constraints",
            	    								lv_constraints_21_0,
            	    								"xtext.MigDsl.Constraint");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalDb"


    // $ANTLR start "entryRuleMongoDb"
    // InternalMigDsl.g:538:1: entryRuleMongoDb returns [EObject current=null] : iv_ruleMongoDb= ruleMongoDb EOF ;
    public final EObject entryRuleMongoDb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoDb = null;


        try {
            // InternalMigDsl.g:538:48: (iv_ruleMongoDb= ruleMongoDb EOF )
            // InternalMigDsl.g:539:2: iv_ruleMongoDb= ruleMongoDb EOF
            {
             newCompositeNode(grammarAccess.getMongoDbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMongoDb=ruleMongoDb();

            state._fsp--;

             current =iv_ruleMongoDb; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMongoDb"


    // $ANTLR start "ruleMongoDb"
    // InternalMigDsl.g:545:1: ruleMongoDb returns [EObject current=null] : ( () this_NEWLINE_1= RULE_NEWLINE otherlv_2= 'target' this_NEWLINE_3= RULE_NEWLINE ( (lv_db_4_0= ruleEString ) )? otherlv_5= '/' ( (lv_host_6_0= ruleEString ) )? otherlv_7= '/' ( (lv_port_8_0= ruleEString ) )? otherlv_9= '/' ( (lv_username_10_0= ruleEString ) )? otherlv_11= '/' ( (lv_password_12_0= ruleEString ) )? (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )? ) ;
    public final EObject ruleMongoDb() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_1=null;
        Token otherlv_2=null;
        Token this_NEWLINE_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_NEWLINE_13=null;
        Token this_NEWLINE_15=null;
        AntlrDatatypeRuleToken lv_db_4_0 = null;

        AntlrDatatypeRuleToken lv_host_6_0 = null;

        AntlrDatatypeRuleToken lv_port_8_0 = null;

        AntlrDatatypeRuleToken lv_username_10_0 = null;

        AntlrDatatypeRuleToken lv_password_12_0 = null;

        EObject lv_collections_14_0 = null;

        EObject lv_collections_16_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:551:2: ( ( () this_NEWLINE_1= RULE_NEWLINE otherlv_2= 'target' this_NEWLINE_3= RULE_NEWLINE ( (lv_db_4_0= ruleEString ) )? otherlv_5= '/' ( (lv_host_6_0= ruleEString ) )? otherlv_7= '/' ( (lv_port_8_0= ruleEString ) )? otherlv_9= '/' ( (lv_username_10_0= ruleEString ) )? otherlv_11= '/' ( (lv_password_12_0= ruleEString ) )? (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )? ) )
            // InternalMigDsl.g:552:2: ( () this_NEWLINE_1= RULE_NEWLINE otherlv_2= 'target' this_NEWLINE_3= RULE_NEWLINE ( (lv_db_4_0= ruleEString ) )? otherlv_5= '/' ( (lv_host_6_0= ruleEString ) )? otherlv_7= '/' ( (lv_port_8_0= ruleEString ) )? otherlv_9= '/' ( (lv_username_10_0= ruleEString ) )? otherlv_11= '/' ( (lv_password_12_0= ruleEString ) )? (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )? )
            {
            // InternalMigDsl.g:552:2: ( () this_NEWLINE_1= RULE_NEWLINE otherlv_2= 'target' this_NEWLINE_3= RULE_NEWLINE ( (lv_db_4_0= ruleEString ) )? otherlv_5= '/' ( (lv_host_6_0= ruleEString ) )? otherlv_7= '/' ( (lv_port_8_0= ruleEString ) )? otherlv_9= '/' ( (lv_username_10_0= ruleEString ) )? otherlv_11= '/' ( (lv_password_12_0= ruleEString ) )? (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )? )
            // InternalMigDsl.g:553:3: () this_NEWLINE_1= RULE_NEWLINE otherlv_2= 'target' this_NEWLINE_3= RULE_NEWLINE ( (lv_db_4_0= ruleEString ) )? otherlv_5= '/' ( (lv_host_6_0= ruleEString ) )? otherlv_7= '/' ( (lv_port_8_0= ruleEString ) )? otherlv_9= '/' ( (lv_username_10_0= ruleEString ) )? otherlv_11= '/' ( (lv_password_12_0= ruleEString ) )? (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )?
            {
            // InternalMigDsl.g:553:3: ()
            // InternalMigDsl.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMongoDbAccess().getMongoDbAction_0(),
            					current);
            			

            }

            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_17); 

            			newLeafNode(this_NEWLINE_1, grammarAccess.getMongoDbAccess().getNEWLINETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMongoDbAccess().getTargetKeyword_2());
            		
            this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_11); 

            			newLeafNode(this_NEWLINE_3, grammarAccess.getMongoDbAccess().getNEWLINETerminalRuleCall_3());
            		
            // InternalMigDsl.g:572:3: ( (lv_db_4_0= ruleEString ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMigDsl.g:573:4: (lv_db_4_0= ruleEString )
                    {
                    // InternalMigDsl.g:573:4: (lv_db_4_0= ruleEString )
                    // InternalMigDsl.g:574:5: lv_db_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMongoDbAccess().getDbEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_db_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    					}
                    					set(
                    						current,
                    						"db",
                    						lv_db_4_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMongoDbAccess().getSolidusKeyword_5());
            		
            // InternalMigDsl.g:595:3: ( (lv_host_6_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMigDsl.g:596:4: (lv_host_6_0= ruleEString )
                    {
                    // InternalMigDsl.g:596:4: (lv_host_6_0= ruleEString )
                    // InternalMigDsl.g:597:5: lv_host_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMongoDbAccess().getHostEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_host_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    					}
                    					set(
                    						current,
                    						"host",
                    						lv_host_6_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMongoDbAccess().getSolidusKeyword_7());
            		
            // InternalMigDsl.g:618:3: ( (lv_port_8_0= ruleEString ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMigDsl.g:619:4: (lv_port_8_0= ruleEString )
                    {
                    // InternalMigDsl.g:619:4: (lv_port_8_0= ruleEString )
                    // InternalMigDsl.g:620:5: lv_port_8_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMongoDbAccess().getPortEStringParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_port_8_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    					}
                    					set(
                    						current,
                    						"port",
                    						lv_port_8_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getMongoDbAccess().getSolidusKeyword_9());
            		
            // InternalMigDsl.g:641:3: ( (lv_username_10_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMigDsl.g:642:4: (lv_username_10_0= ruleEString )
                    {
                    // InternalMigDsl.g:642:4: (lv_username_10_0= ruleEString )
                    // InternalMigDsl.g:643:5: lv_username_10_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMongoDbAccess().getUsernameEStringParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_username_10_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    					}
                    					set(
                    						current,
                    						"username",
                    						lv_username_10_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getMongoDbAccess().getSolidusKeyword_11());
            		
            // InternalMigDsl.g:664:3: ( (lv_password_12_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMigDsl.g:665:4: (lv_password_12_0= ruleEString )
                    {
                    // InternalMigDsl.g:665:4: (lv_password_12_0= ruleEString )
                    // InternalMigDsl.g:666:5: lv_password_12_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMongoDbAccess().getPasswordEStringParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_password_12_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    					}
                    					set(
                    						current,
                    						"password",
                    						lv_password_12_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMigDsl.g:683:3: (this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NEWLINE) ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=RULE_STRING && LA19_1<=RULE_ID)) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalMigDsl.g:684:4: this_NEWLINE_13= RULE_NEWLINE ( (lv_collections_14_0= ruleMngCollection ) ) (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )*
                    {
                    this_NEWLINE_13=(Token)match(input,RULE_NEWLINE,FOLLOW_14); 

                    				newLeafNode(this_NEWLINE_13, grammarAccess.getMongoDbAccess().getNEWLINETerminalRuleCall_13_0());
                    			
                    // InternalMigDsl.g:688:4: ( (lv_collections_14_0= ruleMngCollection ) )
                    // InternalMigDsl.g:689:5: (lv_collections_14_0= ruleMngCollection )
                    {
                    // InternalMigDsl.g:689:5: (lv_collections_14_0= ruleMngCollection )
                    // InternalMigDsl.g:690:6: lv_collections_14_0= ruleMngCollection
                    {

                    						newCompositeNode(grammarAccess.getMongoDbAccess().getCollectionsMngCollectionParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_collections_14_0=ruleMngCollection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    						}
                    						add(
                    							current,
                    							"collections",
                    							lv_collections_14_0,
                    							"xtext.MigDsl.MngCollection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:707:4: (this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_NEWLINE) ) {
                            int LA18_1 = input.LA(2);

                            if ( ((LA18_1>=RULE_STRING && LA18_1<=RULE_ID)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMigDsl.g:708:5: this_NEWLINE_15= RULE_NEWLINE ( (lv_collections_16_0= ruleMngCollection ) )
                    	    {
                    	    this_NEWLINE_15=(Token)match(input,RULE_NEWLINE,FOLLOW_14); 

                    	    					newLeafNode(this_NEWLINE_15, grammarAccess.getMongoDbAccess().getNEWLINETerminalRuleCall_13_2_0());
                    	    				
                    	    // InternalMigDsl.g:712:5: ( (lv_collections_16_0= ruleMngCollection ) )
                    	    // InternalMigDsl.g:713:6: (lv_collections_16_0= ruleMngCollection )
                    	    {
                    	    // InternalMigDsl.g:713:6: (lv_collections_16_0= ruleMngCollection )
                    	    // InternalMigDsl.g:714:7: lv_collections_16_0= ruleMngCollection
                    	    {

                    	    							newCompositeNode(grammarAccess.getMongoDbAccess().getCollectionsMngCollectionParserRuleCall_13_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_collections_16_0=ruleMngCollection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMongoDbRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collections",
                    	    								lv_collections_16_0,
                    	    								"xtext.MigDsl.MngCollection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMongoDb"


    // $ANTLR start "entryRuleEString"
    // InternalMigDsl.g:737:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMigDsl.g:737:47: (iv_ruleEString= ruleEString EOF )
            // InternalMigDsl.g:738:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMigDsl.g:744:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMigDsl.g:750:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMigDsl.g:751:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMigDsl.g:751:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMigDsl.g:752:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMigDsl.g:760:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalMigDsl.g:771:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMigDsl.g:771:46: (iv_ruleTable= ruleTable EOF )
            // InternalMigDsl.g:772:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMigDsl.g:778:1: ruleTable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:784:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= ')' ) )
            // InternalMigDsl.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= ')' )
            {
            // InternalMigDsl.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= ')' )
            // InternalMigDsl.g:786:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= ')'
            {
            // InternalMigDsl.g:786:3: ()
            // InternalMigDsl.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            // InternalMigDsl.g:793:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:794:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:794:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:795:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMigDsl.g:816:3: ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMigDsl.g:817:4: ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    {
                    // InternalMigDsl.g:817:4: ( (lv_columns_3_0= ruleColumn ) )
                    // InternalMigDsl.g:818:5: (lv_columns_3_0= ruleColumn )
                    {
                    // InternalMigDsl.g:818:5: (lv_columns_3_0= ruleColumn )
                    // InternalMigDsl.g:819:6: lv_columns_3_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_columns_3_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_3_0,
                    							"xtext.MigDsl.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:836:4: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==23) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMigDsl.g:837:5: otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMigDsl.g:841:5: ( (lv_columns_5_0= ruleColumn ) )
                    	    // InternalMigDsl.g:842:6: (lv_columns_5_0= ruleColumn )
                    	    {
                    	    // InternalMigDsl.g:842:6: (lv_columns_5_0= ruleColumn )
                    	    // InternalMigDsl.g:843:7: lv_columns_5_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_columns_5_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_5_0,
                    	    								"xtext.MigDsl.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMigDsl.g:870:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMigDsl.g:870:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMigDsl.g:871:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMigDsl.g:877:1: ruleColumn returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:883:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMigDsl.g:884:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMigDsl.g:884:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMigDsl.g:885:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMigDsl.g:885:3: ()
            // InternalMigDsl.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalMigDsl.g:892:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:893:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:893:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:894:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleUnique"
    // InternalMigDsl.g:915:1: entryRuleUnique returns [EObject current=null] : iv_ruleUnique= ruleUnique EOF ;
    public final EObject entryRuleUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnique = null;


        try {
            // InternalMigDsl.g:915:47: (iv_ruleUnique= ruleUnique EOF )
            // InternalMigDsl.g:916:2: iv_ruleUnique= ruleUnique EOF
            {
             newCompositeNode(grammarAccess.getUniqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnique=ruleUnique();

            state._fsp--;

             current =iv_ruleUnique; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnique"


    // $ANTLR start "ruleUnique"
    // InternalMigDsl.g:922:1: ruleUnique returns [EObject current=null] : (otherlv_0= 'Unique:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'uniqueColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleUnique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:928:2: ( (otherlv_0= 'Unique:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'uniqueColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) )
            // InternalMigDsl.g:929:2: (otherlv_0= 'Unique:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'uniqueColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            {
            // InternalMigDsl.g:929:2: (otherlv_0= 'Unique:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'uniqueColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            // InternalMigDsl.g:930:3: otherlv_0= 'Unique:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'uniqueColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueAccess().getUniqueKeyword_0());
            		
            // InternalMigDsl.g:934:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:935:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:935:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:936:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUniqueAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniqueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getUniqueAccess().getUniqueColumnsKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getUniqueAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMigDsl.g:961:3: ( ( ruleEString ) )
            // InternalMigDsl.g:962:4: ( ruleEString )
            {
            // InternalMigDsl.g:962:4: ( ruleEString )
            // InternalMigDsl.g:963:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniqueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUniqueAccess().getUniqueColumnsColumnCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:977:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMigDsl.g:978:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUniqueAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMigDsl.g:982:4: ( ( ruleEString ) )
            	    // InternalMigDsl.g:983:5: ( ruleEString )
            	    {
            	    // InternalMigDsl.g:983:5: ( ruleEString )
            	    // InternalMigDsl.g:984:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUniqueRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getUniqueAccess().getUniqueColumnsColumnCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUniqueAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnique"


    // $ANTLR start "entryRuleNotNull"
    // InternalMigDsl.g:1007:1: entryRuleNotNull returns [EObject current=null] : iv_ruleNotNull= ruleNotNull EOF ;
    public final EObject entryRuleNotNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotNull = null;


        try {
            // InternalMigDsl.g:1007:48: (iv_ruleNotNull= ruleNotNull EOF )
            // InternalMigDsl.g:1008:2: iv_ruleNotNull= ruleNotNull EOF
            {
             newCompositeNode(grammarAccess.getNotNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotNull=ruleNotNull();

            state._fsp--;

             current =iv_ruleNotNull; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotNull"


    // $ANTLR start "ruleNotNull"
    // InternalMigDsl.g:1014:1: ruleNotNull returns [EObject current=null] : (otherlv_0= 'NotNull:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'column' ( ( ruleEString ) ) ) ;
    public final EObject ruleNotNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1020:2: ( (otherlv_0= 'NotNull:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'column' ( ( ruleEString ) ) ) )
            // InternalMigDsl.g:1021:2: (otherlv_0= 'NotNull:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'column' ( ( ruleEString ) ) )
            {
            // InternalMigDsl.g:1021:2: (otherlv_0= 'NotNull:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'column' ( ( ruleEString ) ) )
            // InternalMigDsl.g:1022:3: otherlv_0= 'NotNull:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'column' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNotNullAccess().getNotNullKeyword_0());
            		
            // InternalMigDsl.g:1026:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:1027:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:1027:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:1028:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNotNullAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotNullRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNotNullAccess().getColumnKeyword_2());
            		
            // InternalMigDsl.g:1049:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1050:4: ( ruleEString )
            {
            // InternalMigDsl.g:1050:4: ( ruleEString )
            // InternalMigDsl.g:1051:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotNullRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNotNullAccess().getColumnColumnCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotNull"


    // $ANTLR start "entryRulePrimaryKey"
    // InternalMigDsl.g:1069:1: entryRulePrimaryKey returns [EObject current=null] : iv_rulePrimaryKey= rulePrimaryKey EOF ;
    public final EObject entryRulePrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryKey = null;


        try {
            // InternalMigDsl.g:1069:51: (iv_rulePrimaryKey= rulePrimaryKey EOF )
            // InternalMigDsl.g:1070:2: iv_rulePrimaryKey= rulePrimaryKey EOF
            {
             newCompositeNode(grammarAccess.getPrimaryKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryKey=rulePrimaryKey();

            state._fsp--;

             current =iv_rulePrimaryKey; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryKey"


    // $ANTLR start "rulePrimaryKey"
    // InternalMigDsl.g:1076:1: rulePrimaryKey returns [EObject current=null] : (otherlv_0= 'PK:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'keyColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) ;
    public final EObject rulePrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1082:2: ( (otherlv_0= 'PK:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'keyColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) )
            // InternalMigDsl.g:1083:2: (otherlv_0= 'PK:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'keyColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            {
            // InternalMigDsl.g:1083:2: (otherlv_0= 'PK:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'keyColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            // InternalMigDsl.g:1084:3: otherlv_0= 'PK:' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'keyColumns' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimaryKeyAccess().getPKKeyword_0());
            		
            // InternalMigDsl.g:1088:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:1089:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:1089:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:1090:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimaryKeyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimaryKeyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimaryKeyAccess().getKeyColumnsKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPrimaryKeyAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMigDsl.g:1115:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1116:4: ( ruleEString )
            {
            // InternalMigDsl.g:1116:4: ( ruleEString )
            // InternalMigDsl.g:1117:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimaryKeyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPrimaryKeyAccess().getKeyColumnsColumnCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1131:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMigDsl.g:1132:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPrimaryKeyAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMigDsl.g:1136:4: ( ( ruleEString ) )
            	    // InternalMigDsl.g:1137:5: ( ruleEString )
            	    {
            	    // InternalMigDsl.g:1137:5: ( ruleEString )
            	    // InternalMigDsl.g:1138:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPrimaryKeyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPrimaryKeyAccess().getKeyColumnsColumnCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPrimaryKeyAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryKey"


    // $ANTLR start "entryRuleForeignKey"
    // InternalMigDsl.g:1161:1: entryRuleForeignKey returns [EObject current=null] : iv_ruleForeignKey= ruleForeignKey EOF ;
    public final EObject entryRuleForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeignKey = null;


        try {
            // InternalMigDsl.g:1161:51: (iv_ruleForeignKey= ruleForeignKey EOF )
            // InternalMigDsl.g:1162:2: iv_ruleForeignKey= ruleForeignKey EOF
            {
             newCompositeNode(grammarAccess.getForeignKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeignKey=ruleForeignKey();

            state._fsp--;

             current =iv_ruleForeignKey; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalMigDsl.g:1168:1: ruleForeignKey returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'REFERENCES' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1174:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'REFERENCES' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) )
            // InternalMigDsl.g:1175:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'REFERENCES' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            {
            // InternalMigDsl.g:1175:2: ( ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'REFERENCES' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            // InternalMigDsl.g:1176:3: ( (lv_name_0_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'REFERENCES' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
            {
            // InternalMigDsl.g:1176:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMigDsl.g:1177:4: (lv_name_0_0= ruleEString )
            {
            // InternalMigDsl.g:1177:4: (lv_name_0_0= ruleEString )
            // InternalMigDsl.g:1178:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeignKeyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1195:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1196:4: ( ruleEString )
            {
            // InternalMigDsl.g:1196:4: ( ruleEString )
            // InternalMigDsl.g:1197:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getReferencingColumnCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1211:3: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMigDsl.g:1212:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getForeignKeyAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMigDsl.g:1216:4: ( ( ruleEString ) )
            	    // InternalMigDsl.g:1217:5: ( ruleEString )
            	    {
            	    // InternalMigDsl.g:1217:5: ( ruleEString )
            	    // InternalMigDsl.g:1218:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getForeignKeyAccess().getReferencingColumnCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getForeignKeyAccess().getREFERENCESKeyword_3());
            		
            // InternalMigDsl.g:1237:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1238:4: ( ruleEString )
            {
            // InternalMigDsl.g:1238:4: ( ruleEString )
            // InternalMigDsl.g:1239:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeignKeyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getForeignKeyAccess().getRefrencedColumnCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1253:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMigDsl.g:1254:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_6, grammarAccess.getForeignKeyAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMigDsl.g:1258:4: ( ( ruleEString ) )
            	    // InternalMigDsl.g:1259:5: ( ruleEString )
            	    {
            	    // InternalMigDsl.g:1259:5: ( ruleEString )
            	    // InternalMigDsl.g:1260:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForeignKeyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getForeignKeyAccess().getRefrencedColumnCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleMngCollection"
    // InternalMigDsl.g:1279:1: entryRuleMngCollection returns [EObject current=null] : iv_ruleMngCollection= ruleMngCollection EOF ;
    public final EObject entryRuleMngCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMngCollection = null;


        try {
            // InternalMigDsl.g:1279:54: (iv_ruleMngCollection= ruleMngCollection EOF )
            // InternalMigDsl.g:1280:2: iv_ruleMngCollection= ruleMngCollection EOF
            {
             newCompositeNode(grammarAccess.getMngCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMngCollection=ruleMngCollection();

            state._fsp--;

             current =iv_ruleMngCollection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMngCollection"


    // $ANTLR start "ruleMngCollection"
    // InternalMigDsl.g:1286:1: ruleMngCollection returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleMngCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fields_3_0 = null;

        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1292:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )? otherlv_6= '}' ) )
            // InternalMigDsl.g:1293:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )? otherlv_6= '}' )
            {
            // InternalMigDsl.g:1293:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )? otherlv_6= '}' )
            // InternalMigDsl.g:1294:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )? otherlv_6= '}'
            {
            // InternalMigDsl.g:1294:3: ()
            // InternalMigDsl.g:1295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMngCollectionAccess().getMngCollectionAction_0(),
            					current);
            			

            }

            // InternalMigDsl.g:1301:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMigDsl.g:1302:4: (lv_name_1_0= ruleEString )
            {
            // InternalMigDsl.g:1302:4: (lv_name_1_0= ruleEString )
            // InternalMigDsl.g:1303:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMngCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMngCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMngCollectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMigDsl.g:1324:3: ( ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=39 && LA28_0<=41)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMigDsl.g:1325:4: ( (lv_fields_3_0= ruleField ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )*
                    {
                    // InternalMigDsl.g:1325:4: ( (lv_fields_3_0= ruleField ) )
                    // InternalMigDsl.g:1326:5: (lv_fields_3_0= ruleField )
                    {
                    // InternalMigDsl.g:1326:5: (lv_fields_3_0= ruleField )
                    // InternalMigDsl.g:1327:6: lv_fields_3_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getMngCollectionAccess().getFieldsFieldParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_fields_3_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMngCollectionRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_3_0,
                    							"xtext.MigDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:1344:4: (otherlv_4= ',' ( (lv_fields_5_0= ruleField ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==23) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMigDsl.g:1345:5: otherlv_4= ',' ( (lv_fields_5_0= ruleField ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_29); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMngCollectionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMigDsl.g:1349:5: ( (lv_fields_5_0= ruleField ) )
                    	    // InternalMigDsl.g:1350:6: (lv_fields_5_0= ruleField )
                    	    {
                    	    // InternalMigDsl.g:1350:6: (lv_fields_5_0= ruleField )
                    	    // InternalMigDsl.g:1351:7: lv_fields_5_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getMngCollectionAccess().getFieldsFieldParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_fields_5_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMngCollectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_5_0,
                    	    								"xtext.MigDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMngCollectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMngCollection"


    // $ANTLR start "entryRuleField"
    // InternalMigDsl.g:1378:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMigDsl.g:1378:46: (iv_ruleField= ruleField EOF )
            // InternalMigDsl.g:1379:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMigDsl.g:1385:1: ruleField returns [EObject current=null] : ( () ( (lv_type_1_0= ruleFieldType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_fields_6_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1391:2: ( ( () ( (lv_type_1_0= ruleFieldType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )? ) )
            // InternalMigDsl.g:1392:2: ( () ( (lv_type_1_0= ruleFieldType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )? )
            {
            // InternalMigDsl.g:1392:2: ( () ( (lv_type_1_0= ruleFieldType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )? )
            // InternalMigDsl.g:1393:3: () ( (lv_type_1_0= ruleFieldType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )?
            {
            // InternalMigDsl.g:1393:3: ()
            // InternalMigDsl.g:1394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            // InternalMigDsl.g:1400:3: ( (lv_type_1_0= ruleFieldType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=39 && LA29_0<=41)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMigDsl.g:1401:4: (lv_type_1_0= ruleFieldType )
                    {
                    // InternalMigDsl.g:1401:4: (lv_type_1_0= ruleFieldType )
                    // InternalMigDsl.g:1402:5: lv_type_1_0= ruleFieldType
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_type_1_0=ruleFieldType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"xtext.MigDsl.FieldType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMigDsl.g:1419:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMigDsl.g:1420:4: (lv_name_2_0= ruleEString )
            {
            // InternalMigDsl.g:1420:4: (lv_name_2_0= ruleEString )
            // InternalMigDsl.g:1421:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1438:3: (otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMigDsl.g:1439:4: otherlv_3= '{' ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalMigDsl.g:1443:4: ( (lv_fields_4_0= ruleField ) )
                    // InternalMigDsl.g:1444:5: (lv_fields_4_0= ruleField )
                    {
                    // InternalMigDsl.g:1444:5: (lv_fields_4_0= ruleField )
                    // InternalMigDsl.g:1445:6: lv_fields_4_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getFieldsFieldParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_fields_4_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_4_0,
                    							"xtext.MigDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:1462:4: (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMigDsl.g:1463:5: otherlv_5= ',' ( (lv_fields_6_0= ruleField ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_29); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMigDsl.g:1467:5: ( (lv_fields_6_0= ruleField ) )
                    	    // InternalMigDsl.g:1468:6: (lv_fields_6_0= ruleField )
                    	    {
                    	    // InternalMigDsl.g:1468:6: (lv_fields_6_0= ruleField )
                    	    // InternalMigDsl.g:1469:7: lv_fields_6_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getFieldAccess().getFieldsFieldParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_fields_6_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_6_0,
                    	    								"xtext.MigDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMapping"
    // InternalMigDsl.g:1496:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMigDsl.g:1496:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMigDsl.g:1497:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMigDsl.g:1503:1: ruleMapping returns [EObject current=null] : (this_DirectMapping_0= ruleDirectMapping | this_NestingList_1= ruleNestingList | this_NestingObject_2= ruleNestingObject ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_DirectMapping_0 = null;

        EObject this_NestingList_1 = null;

        EObject this_NestingObject_2 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1509:2: ( (this_DirectMapping_0= ruleDirectMapping | this_NestingList_1= ruleNestingList | this_NestingObject_2= ruleNestingObject ) )
            // InternalMigDsl.g:1510:2: (this_DirectMapping_0= ruleDirectMapping | this_NestingList_1= ruleNestingList | this_NestingObject_2= ruleNestingObject )
            {
            // InternalMigDsl.g:1510:2: (this_DirectMapping_0= ruleDirectMapping | this_NestingList_1= ruleNestingList | this_NestingObject_2= ruleNestingObject )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==38) ) {
                        alt32=3;
                    }
                    else if ( (LA32_2==35) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==38) ) {
                        alt32=3;
                    }
                    else if ( (LA32_3==35) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    alt32=3;
                    }
                    break;
                case 35:
                    {
                    alt32=2;
                    }
                    break;
                case 32:
                case 33:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMigDsl.g:1511:3: this_DirectMapping_0= ruleDirectMapping
                    {

                    			newCompositeNode(grammarAccess.getMappingAccess().getDirectMappingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectMapping_0=ruleDirectMapping();

                    state._fsp--;


                    			current = this_DirectMapping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMigDsl.g:1520:3: this_NestingList_1= ruleNestingList
                    {

                    			newCompositeNode(grammarAccess.getMappingAccess().getNestingListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestingList_1=ruleNestingList();

                    state._fsp--;


                    			current = this_NestingList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMigDsl.g:1529:3: this_NestingObject_2= ruleNestingObject
                    {

                    			newCompositeNode(grammarAccess.getMappingAccess().getNestingObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NestingObject_2=ruleNestingObject();

                    state._fsp--;


                    			current = this_NestingObject_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleDirectMapping"
    // InternalMigDsl.g:1541:1: entryRuleDirectMapping returns [EObject current=null] : iv_ruleDirectMapping= ruleDirectMapping EOF ;
    public final EObject entryRuleDirectMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectMapping = null;


        try {
            // InternalMigDsl.g:1541:54: (iv_ruleDirectMapping= ruleDirectMapping EOF )
            // InternalMigDsl.g:1542:2: iv_ruleDirectMapping= ruleDirectMapping EOF
            {
             newCompositeNode(grammarAccess.getDirectMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectMapping=ruleDirectMapping();

            state._fsp--;

             current =iv_ruleDirectMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDirectMapping"


    // $ANTLR start "ruleDirectMapping"
    // InternalMigDsl.g:1548:1: ruleDirectMapping returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'input:' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleDirectMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1554:2: ( ( () otherlv_1= '{' (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'input:' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMigDsl.g:1555:2: ( () otherlv_1= '{' (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'input:' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMigDsl.g:1555:2: ( () otherlv_1= '{' (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'input:' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMigDsl.g:1556:3: () otherlv_1= '{' (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'input:' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalMigDsl.g:1556:3: ()
            // InternalMigDsl.g:1557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectMappingAccess().getDirectMappingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMigDsl.g:1567:3: (otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMigDsl.g:1568:4: otherlv_2= 'name:' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getDirectMappingAccess().getNameKeyword_2_0());
                    			
                    // InternalMigDsl.g:1572:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalMigDsl.g:1573:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalMigDsl.g:1573:5: (lv_name_3_0= ruleEString )
                    // InternalMigDsl.g:1574:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDirectMappingAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectMappingRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"xtext.MigDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDirectMappingAccess().getOutputKeyword_3());
            		
            // InternalMigDsl.g:1596:3: ( (lv_output_5_0= ruleEString ) )
            // InternalMigDsl.g:1597:4: (lv_output_5_0= ruleEString )
            {
            // InternalMigDsl.g:1597:4: (lv_output_5_0= ruleEString )
            // InternalMigDsl.g:1598:5: lv_output_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDirectMappingAccess().getOutputEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
            lv_output_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectMappingRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getDirectMappingAccess().getInputKeyword_5());
            		
            // InternalMigDsl.g:1619:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1620:4: ( ruleEString )
            {
            // InternalMigDsl.g:1620:4: ( ruleEString )
            // InternalMigDsl.g:1621:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectMappingAccess().getColumnColumnCrossReference_6_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDirectMappingAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectMapping"


    // $ANTLR start "entryRuleNestingList"
    // InternalMigDsl.g:1643:1: entryRuleNestingList returns [EObject current=null] : iv_ruleNestingList= ruleNestingList EOF ;
    public final EObject entryRuleNestingList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestingList = null;


        try {
            // InternalMigDsl.g:1643:52: (iv_ruleNestingList= ruleNestingList EOF )
            // InternalMigDsl.g:1644:2: iv_ruleNestingList= ruleNestingList EOF
            {
             newCompositeNode(grammarAccess.getNestingListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestingList=ruleNestingList();

            state._fsp--;

             current =iv_ruleNestingList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestingList"


    // $ANTLR start "ruleNestingList"
    // InternalMigDsl.g:1650:1: ruleNestingList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_LIST' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleNestingList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1656:2: ( ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_LIST' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalMigDsl.g:1657:2: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_LIST' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalMigDsl.g:1657:2: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_LIST' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalMigDsl.g:1658:3: () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_LIST' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalMigDsl.g:1658:3: ()
            // InternalMigDsl.g:1659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNestingListAccess().getNestingListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getNestingListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMigDsl.g:1669:3: ( (lv_name_2_0= ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMigDsl.g:1670:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalMigDsl.g:1670:4: (lv_name_2_0= ruleEString )
                    // InternalMigDsl.g:1671:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getNestingListAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNestingListRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getNestingListAccess().getNESTING_LISTKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getNestingListAccess().getOutputKeyword_4());
            		
            // InternalMigDsl.g:1696:3: ( (lv_output_5_0= ruleEString ) )
            // InternalMigDsl.g:1697:4: (lv_output_5_0= ruleEString )
            {
            // InternalMigDsl.g:1697:4: (lv_output_5_0= ruleEString )
            // InternalMigDsl.g:1698:5: lv_output_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNestingListAccess().getOutputEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_output_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestingListRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getNestingListAccess().getInputsKeyword_6());
            		
            // InternalMigDsl.g:1719:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1720:4: ( ruleEString )
            {
            // InternalMigDsl.g:1720:4: ( ruleEString )
            // InternalMigDsl.g:1721:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestingListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNestingListAccess().getForeignkeyForeignKeyCrossReference_7_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1735:3: (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMigDsl.g:1736:4: otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getNestingListAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalMigDsl.g:1740:4: ( ( ruleEString ) )
                    // InternalMigDsl.g:1741:5: ( ruleEString )
                    {
                    // InternalMigDsl.g:1741:5: ( ruleEString )
                    // InternalMigDsl.g:1742:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestingListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNestingListAccess().getColumnsColumnCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:1756:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==23) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMigDsl.g:1757:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getNestingListAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMigDsl.g:1761:5: ( ( ruleEString ) )
                    	    // InternalMigDsl.g:1762:6: ( ruleEString )
                    	    {
                    	    // InternalMigDsl.g:1762:6: ( ruleEString )
                    	    // InternalMigDsl.g:1763:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNestingListRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNestingListAccess().getColumnsColumnCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_39); 

                    				newLeafNode(otherlv_12, grammarAccess.getNestingListAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalMigDsl.g:1783:3: (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMigDsl.g:1784:4: otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getNestingListAccess().getASKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getNestingListAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMigDsl.g:1792:4: ( ( ruleEString ) )
                    // InternalMigDsl.g:1793:5: ( ruleEString )
                    {
                    // InternalMigDsl.g:1793:5: ( ruleEString )
                    // InternalMigDsl.g:1794:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestingListRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNestingListAccess().getFieldsFieldCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:1808:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==23) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMigDsl.g:1809:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getNestingListAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMigDsl.g:1813:5: ( ( ruleEString ) )
                    	    // InternalMigDsl.g:1814:6: ( ruleEString )
                    	    {
                    	    // InternalMigDsl.g:1814:6: ( ruleEString )
                    	    // InternalMigDsl.g:1815:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNestingListRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNestingListAccess().getFieldsFieldCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,24,FOLLOW_34); 

                    				newLeafNode(otherlv_18, grammarAccess.getNestingListAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getNestingListAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestingList"


    // $ANTLR start "entryRuleNestingObject"
    // InternalMigDsl.g:1843:1: entryRuleNestingObject returns [EObject current=null] : iv_ruleNestingObject= ruleNestingObject EOF ;
    public final EObject entryRuleNestingObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestingObject = null;


        try {
            // InternalMigDsl.g:1843:54: (iv_ruleNestingObject= ruleNestingObject EOF )
            // InternalMigDsl.g:1844:2: iv_ruleNestingObject= ruleNestingObject EOF
            {
             newCompositeNode(grammarAccess.getNestingObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestingObject=ruleNestingObject();

            state._fsp--;

             current =iv_ruleNestingObject; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestingObject"


    // $ANTLR start "ruleNestingObject"
    // InternalMigDsl.g:1850:1: ruleNestingObject returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_OBJECT' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleNestingObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalMigDsl.g:1856:2: ( ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_OBJECT' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // InternalMigDsl.g:1857:2: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_OBJECT' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // InternalMigDsl.g:1857:2: ( () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_OBJECT' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // InternalMigDsl.g:1858:3: () otherlv_1= '{' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'NESTING_OBJECT' otherlv_4= 'output:' ( (lv_output_5_0= ruleEString ) ) otherlv_6= 'inputs:' ( ( ruleEString ) ) (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            // InternalMigDsl.g:1858:3: ()
            // InternalMigDsl.g:1859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNestingObjectAccess().getNestingObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getNestingObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMigDsl.g:1869:3: ( (lv_name_2_0= ruleEString ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMigDsl.g:1870:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalMigDsl.g:1870:4: (lv_name_2_0= ruleEString )
                    // InternalMigDsl.g:1871:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getNestingObjectAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNestingObjectRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"xtext.MigDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getNestingObjectAccess().getNESTING_OBJECTKeyword_3());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getNestingObjectAccess().getOutputKeyword_4());
            		
            // InternalMigDsl.g:1896:3: ( (lv_output_5_0= ruleEString ) )
            // InternalMigDsl.g:1897:4: (lv_output_5_0= ruleEString )
            {
            // InternalMigDsl.g:1897:4: (lv_output_5_0= ruleEString )
            // InternalMigDsl.g:1898:5: lv_output_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNestingObjectAccess().getOutputEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_output_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestingObjectRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"xtext.MigDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getNestingObjectAccess().getInputsKeyword_6());
            		
            // InternalMigDsl.g:1919:3: ( ( ruleEString ) )
            // InternalMigDsl.g:1920:4: ( ruleEString )
            {
            // InternalMigDsl.g:1920:4: ( ruleEString )
            // InternalMigDsl.g:1921:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestingObjectRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNestingObjectAccess().getForeignkeyForeignKeyCrossReference_7_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMigDsl.g:1935:3: (otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMigDsl.g:1936:4: otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getNestingObjectAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalMigDsl.g:1940:4: ( ( ruleEString ) )
                    // InternalMigDsl.g:1941:5: ( ruleEString )
                    {
                    // InternalMigDsl.g:1941:5: ( ruleEString )
                    // InternalMigDsl.g:1942:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestingObjectRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNestingObjectAccess().getColumnsColumnCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:1956:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==23) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMigDsl.g:1957:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getNestingObjectAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMigDsl.g:1961:5: ( ( ruleEString ) )
                    	    // InternalMigDsl.g:1962:6: ( ruleEString )
                    	    {
                    	    // InternalMigDsl.g:1962:6: ( ruleEString )
                    	    // InternalMigDsl.g:1963:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNestingObjectRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNestingObjectAccess().getColumnsColumnCrossReference_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,24,FOLLOW_39); 

                    				newLeafNode(otherlv_12, grammarAccess.getNestingObjectAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalMigDsl.g:1983:3: (otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMigDsl.g:1984:4: otherlv_13= 'AS' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getNestingObjectAccess().getASKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getNestingObjectAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMigDsl.g:1992:4: ( ( ruleEString ) )
                    // InternalMigDsl.g:1993:5: ( ruleEString )
                    {
                    // InternalMigDsl.g:1993:5: ( ruleEString )
                    // InternalMigDsl.g:1994:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNestingObjectRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNestingObjectAccess().getFieldsFieldCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMigDsl.g:2008:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==23) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMigDsl.g:2009:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,23,FOLLOW_14); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getNestingObjectAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMigDsl.g:2013:5: ( ( ruleEString ) )
                    	    // InternalMigDsl.g:2014:6: ( ruleEString )
                    	    {
                    	    // InternalMigDsl.g:2014:6: ( ruleEString )
                    	    // InternalMigDsl.g:2015:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNestingObjectRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNestingObjectAccess().getFieldsFieldCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,24,FOLLOW_34); 

                    				newLeafNode(otherlv_18, grammarAccess.getNestingObjectAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getNestingObjectAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestingObject"


    // $ANTLR start "ruleFieldType"
    // InternalMigDsl.g:2043:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'Basic' ) | (enumLiteral_1= 'ListField' ) | (enumLiteral_2= 'ObjectField' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMigDsl.g:2049:2: ( ( (enumLiteral_0= 'Basic' ) | (enumLiteral_1= 'ListField' ) | (enumLiteral_2= 'ObjectField' ) ) )
            // InternalMigDsl.g:2050:2: ( (enumLiteral_0= 'Basic' ) | (enumLiteral_1= 'ListField' ) | (enumLiteral_2= 'ObjectField' ) )
            {
            // InternalMigDsl.g:2050:2: ( (enumLiteral_0= 'Basic' ) | (enumLiteral_1= 'ListField' ) | (enumLiteral_2= 'ObjectField' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt44=1;
                }
                break;
            case 40:
                {
                alt44=2;
                }
                break;
            case 41:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMigDsl.g:2051:3: (enumLiteral_0= 'Basic' )
                    {
                    // InternalMigDsl.g:2051:3: (enumLiteral_0= 'Basic' )
                    // InternalMigDsl.g:2052:4: enumLiteral_0= 'Basic'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getBasicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getBasicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMigDsl.g:2059:3: (enumLiteral_1= 'ListField' )
                    {
                    // InternalMigDsl.g:2059:3: (enumLiteral_1= 'ListField' )
                    // InternalMigDsl.g:2060:4: enumLiteral_1= 'ListField'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getListFieldEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getListFieldEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMigDsl.g:2067:3: (enumLiteral_2= 'ObjectField' )
                    {
                    // InternalMigDsl.g:2067:3: (enumLiteral_2= 'ObjectField' )
                    // InternalMigDsl.g:2068:4: enumLiteral_2= 'ObjectField'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getObjectFieldEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getObjectFieldEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000002A000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000038000004060L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038000000060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000060L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000404000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000060L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});

}