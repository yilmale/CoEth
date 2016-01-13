package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CoEth Model'", "'end'", "'agent'", "'{'", "'ecoModel'", "'constraints'", "'}'", "'('", "'initial activation'", "'='", "'priority'", "')'", "'is'", "'action'", "'definition'", "'with'", "'facilitate'", "'trigger'", "'inhibit'", "'incompatible'", "'explain'", "'deduce'", "'contradict'", "'similar'", "'compete'", "':'", "'goal'", "'belief'", "'evidence'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CoEthDSL";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCoEthDSL"
    // InternalMyDsl.g:65:1: entryRuleCoEthDSL returns [EObject current=null] : iv_ruleCoEthDSL= ruleCoEthDSL EOF ;
    public final EObject entryRuleCoEthDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoEthDSL = null;


        try {
            // InternalMyDsl.g:65:49: (iv_ruleCoEthDSL= ruleCoEthDSL EOF )
            // InternalMyDsl.g:66:2: iv_ruleCoEthDSL= ruleCoEthDSL EOF
            {
             newCompositeNode(grammarAccess.getCoEthDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoEthDSL=ruleCoEthDSL();

            state._fsp--;

             current =iv_ruleCoEthDSL; 
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
    // $ANTLR end "entryRuleCoEthDSL"


    // $ANTLR start "ruleCoEthDSL"
    // InternalMyDsl.g:72:1: ruleCoEthDSL returns [EObject current=null] : (otherlv_0= 'CoEth Model' ( (lv_modelName_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleAgent ) )* otherlv_3= 'end' ) ;
    public final EObject ruleCoEthDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_modelName_1_0=null;
        Token otherlv_3=null;
        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'CoEth Model' ( (lv_modelName_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleAgent ) )* otherlv_3= 'end' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'CoEth Model' ( (lv_modelName_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleAgent ) )* otherlv_3= 'end' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'CoEth Model' ( (lv_modelName_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleAgent ) )* otherlv_3= 'end' )
            // InternalMyDsl.g:80:3: otherlv_0= 'CoEth Model' ( (lv_modelName_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleAgent ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoEthDSLAccess().getCoEthModelKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_modelName_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_modelName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_modelName_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_modelName_1_0= RULE_ID
            {
            lv_modelName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_modelName_1_0, grammarAccess.getCoEthDSLAccess().getModelNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoEthDSLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelName",
            						lv_modelName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:102:3: ( (lv_entities_2_0= ruleAgent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: (lv_entities_2_0= ruleAgent )
            	    {
            	    // InternalMyDsl.g:103:4: (lv_entities_2_0= ruleAgent )
            	    // InternalMyDsl.g:104:5: lv_entities_2_0= ruleAgent
            	    {

            	    					newCompositeNode(grammarAccess.getCoEthDSLAccess().getEntitiesAgentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleAgent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoEthDSLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Agent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCoEthDSLAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleCoEthDSL"


    // $ANTLR start "entryRuleAgent"
    // InternalMyDsl.g:129:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalMyDsl.g:129:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalMyDsl.g:130:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalMyDsl.g:136:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* ( (lv_operations_4_0= ruleAction ) )* otherlv_5= 'ecoModel' otherlv_6= '{' ( (lv_decoNodes_7_0= ruleecoNode ) )+ otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleecoConstraint ) )+ otherlv_11= '}' otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_features_3_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_decoNodes_7_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:142:2: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* ( (lv_operations_4_0= ruleAction ) )* otherlv_5= 'ecoModel' otherlv_6= '{' ( (lv_decoNodes_7_0= ruleecoNode ) )+ otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleecoConstraint ) )+ otherlv_11= '}' otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMyDsl.g:143:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* ( (lv_operations_4_0= ruleAction ) )* otherlv_5= 'ecoModel' otherlv_6= '{' ( (lv_decoNodes_7_0= ruleecoNode ) )+ otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleecoConstraint ) )+ otherlv_11= '}' otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMyDsl.g:143:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* ( (lv_operations_4_0= ruleAction ) )* otherlv_5= 'ecoModel' otherlv_6= '{' ( (lv_decoNodes_7_0= ruleecoNode ) )+ otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleecoConstraint ) )+ otherlv_11= '}' otherlv_12= '}' otherlv_13= '}' )
            // InternalMyDsl.g:144:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* ( (lv_operations_4_0= ruleAction ) )* otherlv_5= 'ecoModel' otherlv_6= '{' ( (lv_decoNodes_7_0= ruleecoNode ) )+ otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleecoConstraint ) )+ otherlv_11= '}' otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalMyDsl.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:170:3: ( (lv_features_3_0= ruleFeature ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:171:4: (lv_features_3_0= ruleFeature )
            	    {
            	    // InternalMyDsl.g:171:4: (lv_features_3_0= ruleFeature )
            	    // InternalMyDsl.g:172:5: lv_features_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getFeaturesFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:189:3: ( (lv_operations_4_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:190:4: (lv_operations_4_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:190:4: (lv_operations_4_0= ruleAction )
            	    // InternalMyDsl.g:191:5: lv_operations_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getOperationsActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_4_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAgentAccess().getEcoModelKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:216:3: ( (lv_decoNodes_7_0= ruleecoNode ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:217:4: (lv_decoNodes_7_0= ruleecoNode )
            	    {
            	    // InternalMyDsl.g:217:4: (lv_decoNodes_7_0= ruleecoNode )
            	    // InternalMyDsl.g:218:5: lv_decoNodes_7_0= ruleecoNode
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getDecoNodesEcoNodeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_decoNodes_7_0=ruleecoNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decoNodes",
            	    						lv_decoNodes_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.ecoNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getAgentAccess().getConstraintsKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:243:3: ( (lv_constraints_10_0= ruleecoConstraint ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=28 && LA5_0<=36)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:244:4: (lv_constraints_10_0= ruleecoConstraint )
            	    {
            	    // InternalMyDsl.g:244:4: (lv_constraints_10_0= ruleecoConstraint )
            	    // InternalMyDsl.g:245:5: lv_constraints_10_0= ruleecoConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getConstraintsEcoConstraintParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_constraints_10_0=ruleecoConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_10_0,
            	    						"org.xtext.example.mydsl.MyDsl.ecoConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_11=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleecoNode"
    // InternalMyDsl.g:278:1: entryRuleecoNode returns [EObject current=null] : iv_ruleecoNode= ruleecoNode EOF ;
    public final EObject entryRuleecoNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecoNode = null;


        try {
            // InternalMyDsl.g:278:48: (iv_ruleecoNode= ruleecoNode EOF )
            // InternalMyDsl.g:279:2: iv_ruleecoNode= ruleecoNode EOF
            {
             newCompositeNode(grammarAccess.getEcoNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleecoNode=ruleecoNode();

            state._fsp--;

             current =iv_ruleecoNode; 
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
    // $ANTLR end "entryRuleecoNode"


    // $ANTLR start "ruleecoNode"
    // InternalMyDsl.g:285:1: ruleecoNode returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' ) ) ;
    public final EObject ruleecoNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_nDefinition_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_activationLevel_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_priority_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_bDefinition_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_nType_1_0 = null;

        Enumerator lv_nType_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( ( (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' ) ) )
            // InternalMyDsl.g:292:2: ( (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' ) )
            {
            // InternalMyDsl.g:292:2: ( (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_ID) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==24) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_STRING) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_ID) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==24) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_STRING) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_ID) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==24) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_STRING) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==RULE_ID) ) {
                        int LA8_6 = input.LA(4);

                        if ( (LA8_6==24) ) {
                            alt8=2;
                        }
                        else if ( (LA8_6==RULE_STRING) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:293:3: (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' )
                    {
                    // InternalMyDsl.g:293:3: (otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')' )
                    // InternalMyDsl.g:294:4: otherlv_0= '(' ( (lv_nType_1_0= ruleNodeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_nDefinition_3_0= RULE_STRING ) ) (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )? (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )? otherlv_10= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getEcoNodeAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyDsl.g:298:4: ( (lv_nType_1_0= ruleNodeType ) )
                    // InternalMyDsl.g:299:5: (lv_nType_1_0= ruleNodeType )
                    {
                    // InternalMyDsl.g:299:5: (lv_nType_1_0= ruleNodeType )
                    // InternalMyDsl.g:300:6: lv_nType_1_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getEcoNodeAccess().getNTypeNodeTypeEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_nType_1_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEcoNodeRule());
                    						}
                    						set(
                    							current,
                    							"nType",
                    							lv_nType_1_0,
                    							"org.xtext.example.mydsl.MyDsl.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:317:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalMyDsl.g:318:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:318:5: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:319:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEcoNodeAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEcoNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:335:4: ( (lv_nDefinition_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:336:5: (lv_nDefinition_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:336:5: (lv_nDefinition_3_0= RULE_STRING )
                    // InternalMyDsl.g:337:6: lv_nDefinition_3_0= RULE_STRING
                    {
                    lv_nDefinition_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_nDefinition_3_0, grammarAccess.getEcoNodeAccess().getNDefinitionSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEcoNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nDefinition",
                    							lv_nDefinition_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:353:4: (otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:354:5: otherlv_4= 'initial activation' otherlv_5= '=' ( (lv_activationLevel_6_0= RULE_DOUBLE ) )
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getEcoNodeAccess().getInitialActivationKeyword_0_4_0());
                            				
                            otherlv_5=(Token)match(input,21,FOLLOW_17); 

                            					newLeafNode(otherlv_5, grammarAccess.getEcoNodeAccess().getEqualsSignKeyword_0_4_1());
                            				
                            // InternalMyDsl.g:362:5: ( (lv_activationLevel_6_0= RULE_DOUBLE ) )
                            // InternalMyDsl.g:363:6: (lv_activationLevel_6_0= RULE_DOUBLE )
                            {
                            // InternalMyDsl.g:363:6: (lv_activationLevel_6_0= RULE_DOUBLE )
                            // InternalMyDsl.g:364:7: lv_activationLevel_6_0= RULE_DOUBLE
                            {
                            lv_activationLevel_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_18); 

                            							newLeafNode(lv_activationLevel_6_0, grammarAccess.getEcoNodeAccess().getActivationLevelDOUBLETerminalRuleCall_0_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEcoNodeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"activationLevel",
                            								lv_activationLevel_6_0,
                            								"org.xtext.example.mydsl.MyDsl.DOUBLE");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:381:4: (otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:382:5: otherlv_7= 'priority' otherlv_8= '=' ( (lv_priority_9_0= RULE_INT ) )
                            {
                            otherlv_7=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_7, grammarAccess.getEcoNodeAccess().getPriorityKeyword_0_5_0());
                            				
                            otherlv_8=(Token)match(input,21,FOLLOW_19); 

                            					newLeafNode(otherlv_8, grammarAccess.getEcoNodeAccess().getEqualsSignKeyword_0_5_1());
                            				
                            // InternalMyDsl.g:390:5: ( (lv_priority_9_0= RULE_INT ) )
                            // InternalMyDsl.g:391:6: (lv_priority_9_0= RULE_INT )
                            {
                            // InternalMyDsl.g:391:6: (lv_priority_9_0= RULE_INT )
                            // InternalMyDsl.g:392:7: lv_priority_9_0= RULE_INT
                            {
                            lv_priority_9_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                            							newLeafNode(lv_priority_9_0, grammarAccess.getEcoNodeAccess().getPriorityINTTerminalRuleCall_0_5_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEcoNodeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"priority",
                            								lv_priority_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getEcoNodeAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:415:3: (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' )
                    {
                    // InternalMyDsl.g:415:3: (otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')' )
                    // InternalMyDsl.g:416:4: otherlv_11= '(' ( (lv_nType_12_0= ruleNodeType ) ) ( (lv_name_13_0= RULE_ID ) ) otherlv_14= 'is' ( (otherlv_15= RULE_ID ) ) ( (lv_bDefinition_16_0= RULE_STRING ) ) otherlv_17= ')'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getEcoNodeAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:420:4: ( (lv_nType_12_0= ruleNodeType ) )
                    // InternalMyDsl.g:421:5: (lv_nType_12_0= ruleNodeType )
                    {
                    // InternalMyDsl.g:421:5: (lv_nType_12_0= ruleNodeType )
                    // InternalMyDsl.g:422:6: lv_nType_12_0= ruleNodeType
                    {

                    						newCompositeNode(grammarAccess.getEcoNodeAccess().getNTypeNodeTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_nType_12_0=ruleNodeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEcoNodeRule());
                    						}
                    						set(
                    							current,
                    							"nType",
                    							lv_nType_12_0,
                    							"org.xtext.example.mydsl.MyDsl.NodeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:439:4: ( (lv_name_13_0= RULE_ID ) )
                    // InternalMyDsl.g:440:5: (lv_name_13_0= RULE_ID )
                    {
                    // InternalMyDsl.g:440:5: (lv_name_13_0= RULE_ID )
                    // InternalMyDsl.g:441:6: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_name_13_0, grammarAccess.getEcoNodeAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEcoNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_13_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getEcoNodeAccess().getIsKeyword_1_3());
                    			
                    // InternalMyDsl.g:461:4: ( (otherlv_15= RULE_ID ) )
                    // InternalMyDsl.g:462:5: (otherlv_15= RULE_ID )
                    {
                    // InternalMyDsl.g:462:5: (otherlv_15= RULE_ID )
                    // InternalMyDsl.g:463:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEcoNodeRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_15, grammarAccess.getEcoNodeAccess().getMyActionActionCrossReference_1_4_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:474:4: ( (lv_bDefinition_16_0= RULE_STRING ) )
                    // InternalMyDsl.g:475:5: (lv_bDefinition_16_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:475:5: (lv_bDefinition_16_0= RULE_STRING )
                    // InternalMyDsl.g:476:6: lv_bDefinition_16_0= RULE_STRING
                    {
                    lv_bDefinition_16_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_bDefinition_16_0, grammarAccess.getEcoNodeAccess().getBDefinitionSTRINGTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEcoNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"bDefinition",
                    							lv_bDefinition_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getEcoNodeAccess().getRightParenthesisKeyword_1_6());
                    			

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
    // $ANTLR end "ruleecoNode"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:501:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:501:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:502:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:508:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_aDefinition_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:514:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:515:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:515:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) ) otherlv_5= '}' )
            // InternalMyDsl.g:516:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalMyDsl.g:520:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:521:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:521:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:522:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:542:3: (otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:543:4: otherlv_3= 'definition' ( (lv_aDefinition_4_0= RULE_STRING ) )
            {
            otherlv_3=(Token)match(input,26,FOLLOW_14); 

            				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDefinitionKeyword_3_0());
            			
            // InternalMyDsl.g:547:4: ( (lv_aDefinition_4_0= RULE_STRING ) )
            // InternalMyDsl.g:548:5: (lv_aDefinition_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:548:5: (lv_aDefinition_4_0= RULE_STRING )
            // InternalMyDsl.g:549:6: lv_aDefinition_4_0= RULE_STRING
            {
            lv_aDefinition_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            						newLeafNode(lv_aDefinition_4_0, grammarAccess.getActionAccess().getADefinitionSTRINGTerminalRuleCall_3_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getActionRule());
            						}
            						setWithLastConsumed(
            							current,
            							"aDefinition",
            							lv_aDefinition_4_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleecoConstraint"
    // InternalMyDsl.g:574:1: entryRuleecoConstraint returns [EObject current=null] : iv_ruleecoConstraint= ruleecoConstraint EOF ;
    public final EObject entryRuleecoConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleecoConstraint = null;


        try {
            // InternalMyDsl.g:574:54: (iv_ruleecoConstraint= ruleecoConstraint EOF )
            // InternalMyDsl.g:575:2: iv_ruleecoConstraint= ruleecoConstraint EOF
            {
             newCompositeNode(grammarAccess.getEcoConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleecoConstraint=ruleecoConstraint();

            state._fsp--;

             current =iv_ruleecoConstraint; 
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
    // $ANTLR end "entryRuleecoConstraint"


    // $ANTLR start "ruleecoConstraint"
    // InternalMyDsl.g:581:1: ruleecoConstraint returns [EObject current=null] : ( (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete ) (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )? ) ;
    public final EObject ruleecoConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject this_Facilitate_0 = null;

        EObject this_Trigger_1 = null;

        EObject this_Inhibit_2 = null;

        EObject this_Incompatible_3 = null;

        EObject this_Explain_4 = null;

        EObject this_Deduce_5 = null;

        EObject this_Contradict_6 = null;

        EObject this_Similar_7 = null;

        EObject this_Compete_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:587:2: ( ( (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete ) (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )? ) )
            // InternalMyDsl.g:588:2: ( (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete ) (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )? )
            {
            // InternalMyDsl.g:588:2: ( (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete ) (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )? )
            // InternalMyDsl.g:589:3: (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete ) (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )?
            {
            // InternalMyDsl.g:589:3: (this_Facilitate_0= ruleFacilitate | this_Trigger_1= ruleTrigger | this_Inhibit_2= ruleInhibit | this_Incompatible_3= ruleIncompatible | this_Explain_4= ruleExplain | this_Deduce_5= ruleDeduce | this_Contradict_6= ruleContradict | this_Similar_7= ruleSimilar | this_Compete_8= ruleCompete )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 31:
                {
                alt9=4;
                }
                break;
            case 32:
                {
                alt9=5;
                }
                break;
            case 33:
                {
                alt9=6;
                }
                break;
            case 34:
                {
                alt9=7;
                }
                break;
            case 35:
                {
                alt9=8;
                }
                break;
            case 36:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:590:4: this_Facilitate_0= ruleFacilitate
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getFacilitateParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_23);
                    this_Facilitate_0=ruleFacilitate();

                    state._fsp--;


                    				current = this_Facilitate_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:599:4: this_Trigger_1= ruleTrigger
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getTriggerParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_Trigger_1=ruleTrigger();

                    state._fsp--;


                    				current = this_Trigger_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:608:4: this_Inhibit_2= ruleInhibit
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getInhibitParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_23);
                    this_Inhibit_2=ruleInhibit();

                    state._fsp--;


                    				current = this_Inhibit_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:617:4: this_Incompatible_3= ruleIncompatible
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getIncompatibleParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_23);
                    this_Incompatible_3=ruleIncompatible();

                    state._fsp--;


                    				current = this_Incompatible_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:626:4: this_Explain_4= ruleExplain
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getExplainParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_23);
                    this_Explain_4=ruleExplain();

                    state._fsp--;


                    				current = this_Explain_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:635:4: this_Deduce_5= ruleDeduce
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getDeduceParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_23);
                    this_Deduce_5=ruleDeduce();

                    state._fsp--;


                    				current = this_Deduce_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:644:4: this_Contradict_6= ruleContradict
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getContradictParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_23);
                    this_Contradict_6=ruleContradict();

                    state._fsp--;


                    				current = this_Contradict_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:653:4: this_Similar_7= ruleSimilar
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getSimilarParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_23);
                    this_Similar_7=ruleSimilar();

                    state._fsp--;


                    				current = this_Similar_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:662:4: this_Compete_8= ruleCompete
                    {

                    				newCompositeNode(grammarAccess.getEcoConstraintAccess().getCompeteParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_23);
                    this_Compete_8=ruleCompete();

                    state._fsp--;


                    				current = this_Compete_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:671:3: (otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:672:4: otherlv_9= 'with' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )+ otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getEcoConstraintAccess().getWithKeyword_1_0());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEcoConstraintAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyDsl.g:680:4: ( (otherlv_11= RULE_ID ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:681:5: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:681:5: (otherlv_11= RULE_ID )
                    	    // InternalMyDsl.g:682:6: otherlv_11= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEcoConstraintRule());
                    	    						}
                    	    					
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_24); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getEcoConstraintAccess().getCooperativeUnitsEcoNodeCrossReference_1_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_12=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getEcoConstraintAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleecoConstraint"


    // $ANTLR start "entryRuleFacilitate"
    // InternalMyDsl.g:702:1: entryRuleFacilitate returns [EObject current=null] : iv_ruleFacilitate= ruleFacilitate EOF ;
    public final EObject entryRuleFacilitate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacilitate = null;


        try {
            // InternalMyDsl.g:702:51: (iv_ruleFacilitate= ruleFacilitate EOF )
            // InternalMyDsl.g:703:2: iv_ruleFacilitate= ruleFacilitate EOF
            {
             newCompositeNode(grammarAccess.getFacilitateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacilitate=ruleFacilitate();

            state._fsp--;

             current =iv_ruleFacilitate; 
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
    // $ANTLR end "entryRuleFacilitate"


    // $ANTLR start "ruleFacilitate"
    // InternalMyDsl.g:709:1: ruleFacilitate returns [EObject current=null] : (otherlv_0= 'facilitate' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleFacilitate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:715:2: ( (otherlv_0= 'facilitate' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:716:2: (otherlv_0= 'facilitate' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:716:2: (otherlv_0= 'facilitate' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:717:3: otherlv_0= 'facilitate' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacilitateAccess().getFacilitateKeyword_0());
            		
            // InternalMyDsl.g:721:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:722:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:722:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:723:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacilitateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getFacilitateAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:734:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:735:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:735:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:736:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacilitateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getFacilitateAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:747:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOUBLE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:748:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:748:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:749:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getFacilitateAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFacilitateRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleFacilitate"


    // $ANTLR start "entryRuleTrigger"
    // InternalMyDsl.g:769:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalMyDsl.g:769:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalMyDsl.g:770:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalMyDsl.g:776:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:782:2: ( (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:783:2: (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:783:2: (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:784:3: otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalMyDsl.g:788:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:789:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:789:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:790:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:801:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:802:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:802:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:803:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:814:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOUBLE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:815:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:815:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:816:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getTriggerAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleInhibit"
    // InternalMyDsl.g:836:1: entryRuleInhibit returns [EObject current=null] : iv_ruleInhibit= ruleInhibit EOF ;
    public final EObject entryRuleInhibit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInhibit = null;


        try {
            // InternalMyDsl.g:836:48: (iv_ruleInhibit= ruleInhibit EOF )
            // InternalMyDsl.g:837:2: iv_ruleInhibit= ruleInhibit EOF
            {
             newCompositeNode(grammarAccess.getInhibitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInhibit=ruleInhibit();

            state._fsp--;

             current =iv_ruleInhibit; 
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
    // $ANTLR end "entryRuleInhibit"


    // $ANTLR start "ruleInhibit"
    // InternalMyDsl.g:843:1: ruleInhibit returns [EObject current=null] : (otherlv_0= 'inhibit' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleInhibit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( (otherlv_0= 'inhibit' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:850:2: (otherlv_0= 'inhibit' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:850:2: (otherlv_0= 'inhibit' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:851:3: otherlv_0= 'inhibit' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInhibitAccess().getInhibitKeyword_0());
            		
            // InternalMyDsl.g:855:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:856:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:856:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:857:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInhibitRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getInhibitAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:868:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:869:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:869:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:870:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInhibitRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getInhibitAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:881:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOUBLE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:882:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:882:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:883:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getInhibitAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInhibitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleInhibit"


    // $ANTLR start "entryRuleIncompatible"
    // InternalMyDsl.g:903:1: entryRuleIncompatible returns [EObject current=null] : iv_ruleIncompatible= ruleIncompatible EOF ;
    public final EObject entryRuleIncompatible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncompatible = null;


        try {
            // InternalMyDsl.g:903:53: (iv_ruleIncompatible= ruleIncompatible EOF )
            // InternalMyDsl.g:904:2: iv_ruleIncompatible= ruleIncompatible EOF
            {
             newCompositeNode(grammarAccess.getIncompatibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncompatible=ruleIncompatible();

            state._fsp--;

             current =iv_ruleIncompatible; 
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
    // $ANTLR end "entryRuleIncompatible"


    // $ANTLR start "ruleIncompatible"
    // InternalMyDsl.g:910:1: ruleIncompatible returns [EObject current=null] : (otherlv_0= 'incompatible' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleIncompatible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:916:2: ( (otherlv_0= 'incompatible' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:917:2: (otherlv_0= 'incompatible' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:917:2: (otherlv_0= 'incompatible' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:918:3: otherlv_0= 'incompatible' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIncompatibleAccess().getIncompatibleKeyword_0());
            		
            // InternalMyDsl.g:922:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:923:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:923:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:924:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncompatibleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getIncompatibleAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:935:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:936:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:936:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:937:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncompatibleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getIncompatibleAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:948:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOUBLE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:949:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:949:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:950:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getIncompatibleAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIncompatibleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleIncompatible"


    // $ANTLR start "entryRuleExplain"
    // InternalMyDsl.g:970:1: entryRuleExplain returns [EObject current=null] : iv_ruleExplain= ruleExplain EOF ;
    public final EObject entryRuleExplain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplain = null;


        try {
            // InternalMyDsl.g:970:48: (iv_ruleExplain= ruleExplain EOF )
            // InternalMyDsl.g:971:2: iv_ruleExplain= ruleExplain EOF
            {
             newCompositeNode(grammarAccess.getExplainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplain=ruleExplain();

            state._fsp--;

             current =iv_ruleExplain; 
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
    // $ANTLR end "entryRuleExplain"


    // $ANTLR start "ruleExplain"
    // InternalMyDsl.g:977:1: ruleExplain returns [EObject current=null] : (otherlv_0= 'explain' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleExplain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:983:2: ( (otherlv_0= 'explain' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:984:2: (otherlv_0= 'explain' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:984:2: (otherlv_0= 'explain' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:985:3: otherlv_0= 'explain' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExplainAccess().getExplainKeyword_0());
            		
            // InternalMyDsl.g:989:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:990:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:990:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:991:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplainRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getExplainAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1002:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1003:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1003:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1004:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExplainRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getExplainAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1015:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOUBLE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1016:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:1016:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:1017:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getExplainAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExplainRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleExplain"


    // $ANTLR start "entryRuleDeduce"
    // InternalMyDsl.g:1037:1: entryRuleDeduce returns [EObject current=null] : iv_ruleDeduce= ruleDeduce EOF ;
    public final EObject entryRuleDeduce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeduce = null;


        try {
            // InternalMyDsl.g:1037:47: (iv_ruleDeduce= ruleDeduce EOF )
            // InternalMyDsl.g:1038:2: iv_ruleDeduce= ruleDeduce EOF
            {
             newCompositeNode(grammarAccess.getDeduceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeduce=ruleDeduce();

            state._fsp--;

             current =iv_ruleDeduce; 
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
    // $ANTLR end "entryRuleDeduce"


    // $ANTLR start "ruleDeduce"
    // InternalMyDsl.g:1044:1: ruleDeduce returns [EObject current=null] : (otherlv_0= 'deduce' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleDeduce() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1050:2: ( (otherlv_0= 'deduce' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:1051:2: (otherlv_0= 'deduce' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:1051:2: (otherlv_0= 'deduce' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:1052:3: otherlv_0= 'deduce' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeduceAccess().getDeduceKeyword_0());
            		
            // InternalMyDsl.g:1056:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1057:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1057:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1058:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeduceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getDeduceAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1069:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1070:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1070:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1071:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeduceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getDeduceAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1082:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOUBLE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1083:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:1083:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:1084:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getDeduceAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDeduceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleDeduce"


    // $ANTLR start "entryRuleContradict"
    // InternalMyDsl.g:1104:1: entryRuleContradict returns [EObject current=null] : iv_ruleContradict= ruleContradict EOF ;
    public final EObject entryRuleContradict() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContradict = null;


        try {
            // InternalMyDsl.g:1104:51: (iv_ruleContradict= ruleContradict EOF )
            // InternalMyDsl.g:1105:2: iv_ruleContradict= ruleContradict EOF
            {
             newCompositeNode(grammarAccess.getContradictRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContradict=ruleContradict();

            state._fsp--;

             current =iv_ruleContradict; 
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
    // $ANTLR end "entryRuleContradict"


    // $ANTLR start "ruleContradict"
    // InternalMyDsl.g:1111:1: ruleContradict returns [EObject current=null] : (otherlv_0= 'contradict' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleContradict() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1117:2: ( (otherlv_0= 'contradict' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:1118:2: (otherlv_0= 'contradict' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:1118:2: (otherlv_0= 'contradict' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:1119:3: otherlv_0= 'contradict' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContradictAccess().getContradictKeyword_0());
            		
            // InternalMyDsl.g:1123:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1124:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1124:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1125:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContradictRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getContradictAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1136:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1137:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1137:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1138:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContradictRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getContradictAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1149:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOUBLE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1150:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:1150:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:1151:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getContradictAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContradictRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleContradict"


    // $ANTLR start "entryRuleSimilar"
    // InternalMyDsl.g:1171:1: entryRuleSimilar returns [EObject current=null] : iv_ruleSimilar= ruleSimilar EOF ;
    public final EObject entryRuleSimilar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimilar = null;


        try {
            // InternalMyDsl.g:1171:48: (iv_ruleSimilar= ruleSimilar EOF )
            // InternalMyDsl.g:1172:2: iv_ruleSimilar= ruleSimilar EOF
            {
             newCompositeNode(grammarAccess.getSimilarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimilar=ruleSimilar();

            state._fsp--;

             current =iv_ruleSimilar; 
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
    // $ANTLR end "entryRuleSimilar"


    // $ANTLR start "ruleSimilar"
    // InternalMyDsl.g:1178:1: ruleSimilar returns [EObject current=null] : (otherlv_0= 'similar' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleSimilar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1184:2: ( (otherlv_0= 'similar' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:1185:2: (otherlv_0= 'similar' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:1185:2: (otherlv_0= 'similar' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:1186:3: otherlv_0= 'similar' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimilarAccess().getSimilarKeyword_0());
            		
            // InternalMyDsl.g:1190:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1191:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1191:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1192:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimilarRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getSimilarAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1203:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1204:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1204:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1205:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimilarRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getSimilarAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1216:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOUBLE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1217:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:1217:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:1218:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getSimilarAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimilarRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleSimilar"


    // $ANTLR start "entryRuleCompete"
    // InternalMyDsl.g:1238:1: entryRuleCompete returns [EObject current=null] : iv_ruleCompete= ruleCompete EOF ;
    public final EObject entryRuleCompete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompete = null;


        try {
            // InternalMyDsl.g:1238:48: (iv_ruleCompete= ruleCompete EOF )
            // InternalMyDsl.g:1239:2: iv_ruleCompete= ruleCompete EOF
            {
             newCompositeNode(grammarAccess.getCompeteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompete=ruleCompete();

            state._fsp--;

             current =iv_ruleCompete; 
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
    // $ANTLR end "entryRuleCompete"


    // $ANTLR start "ruleCompete"
    // InternalMyDsl.g:1245:1: ruleCompete returns [EObject current=null] : (otherlv_0= 'compete' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) ;
    public final EObject ruleCompete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1251:2: ( (otherlv_0= 'compete' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? ) )
            // InternalMyDsl.g:1252:2: (otherlv_0= 'compete' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            {
            // InternalMyDsl.g:1252:2: (otherlv_0= 'compete' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )? )
            // InternalMyDsl.g:1253:3: otherlv_0= 'compete' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_weight_3_0= RULE_DOUBLE ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompeteAccess().getCompeteKeyword_0());
            		
            // InternalMyDsl.g:1257:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1258:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1258:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1259:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompeteRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getCompeteAccess().getSourceEcoNodeCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:1270:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1271:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1271:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1272:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompeteRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getCompeteAccess().getTargetEcoNodeCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1283:3: ( (lv_weight_3_0= RULE_DOUBLE ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOUBLE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1284:4: (lv_weight_3_0= RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:1284:4: (lv_weight_3_0= RULE_DOUBLE )
                    // InternalMyDsl.g:1285:5: lv_weight_3_0= RULE_DOUBLE
                    {
                    lv_weight_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    					newLeafNode(lv_weight_3_0, grammarAccess.getCompeteAccess().getWeightDOUBLETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompeteRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"weight",
                    						lv_weight_3_0,
                    						"org.xtext.example.mydsl.MyDsl.DOUBLE");
                    				

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
    // $ANTLR end "ruleCompete"


    // $ANTLR start "entryRuleFeature"
    // InternalMyDsl.g:1305:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalMyDsl.g:1305:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalMyDsl.g:1306:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalMyDsl.g:1312:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1318:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1319:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1319:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:1320:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1320:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1321:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1321:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1322:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1342:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalMyDsl.g:1343:4: (lv_type_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1343:4: (lv_type_2_0= RULE_ID )
            // InternalMyDsl.g:1344:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getFeatureAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleNodeType"
    // InternalMyDsl.g:1364:1: ruleNodeType returns [Enumerator current=null] : ( (enumLiteral_0= 'goal' ) | (enumLiteral_1= 'belief' ) | (enumLiteral_2= 'evidence' ) | (enumLiteral_3= 'action' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1370:2: ( ( (enumLiteral_0= 'goal' ) | (enumLiteral_1= 'belief' ) | (enumLiteral_2= 'evidence' ) | (enumLiteral_3= 'action' ) ) )
            // InternalMyDsl.g:1371:2: ( (enumLiteral_0= 'goal' ) | (enumLiteral_1= 'belief' ) | (enumLiteral_2= 'evidence' ) | (enumLiteral_3= 'action' ) )
            {
            // InternalMyDsl.g:1371:2: ( (enumLiteral_0= 'goal' ) | (enumLiteral_1= 'belief' ) | (enumLiteral_2= 'evidence' ) | (enumLiteral_3= 'action' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            case 25:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1372:3: (enumLiteral_0= 'goal' )
                    {
                    // InternalMyDsl.g:1372:3: (enumLiteral_0= 'goal' )
                    // InternalMyDsl.g:1373:4: enumLiteral_0= 'goal'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getGOALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getGOALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1380:3: (enumLiteral_1= 'belief' )
                    {
                    // InternalMyDsl.g:1380:3: (enumLiteral_1= 'belief' )
                    // InternalMyDsl.g:1381:4: enumLiteral_1= 'belief'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getBELIEFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getBELIEFEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1388:3: (enumLiteral_2= 'evidence' )
                    {
                    // InternalMyDsl.g:1388:3: (enumLiteral_2= 'evidence' )
                    // InternalMyDsl.g:1389:4: enumLiteral_2= 'evidence'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getEVIDENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getEVIDENCEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1396:3: (enumLiteral_3= 'action' )
                    {
                    // InternalMyDsl.g:1396:3: (enumLiteral_3= 'action' )
                    // InternalMyDsl.g:1397:4: enumLiteral_3= 'action'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleNodeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001FF0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001FF0040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000001C002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});

}