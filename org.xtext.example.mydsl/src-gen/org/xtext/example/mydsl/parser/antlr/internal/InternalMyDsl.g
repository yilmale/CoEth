/*
 * generated by Xtext 2.9.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCoEthDSL
entryRuleCoEthDSL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoEthDSLRule()); }
	iv_ruleCoEthDSL=ruleCoEthDSL
	{ $current=$iv_ruleCoEthDSL.current; }
	EOF;

// Rule CoEthDSL
ruleCoEthDSL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CoEth Model'
		{
			newLeafNode(otherlv_0, grammarAccess.getCoEthDSLAccess().getCoEthModelKeyword_0());
		}
		(
			(
				lv_modelName_1_0=RULE_ID
				{
					newLeafNode(lv_modelName_1_0, grammarAccess.getCoEthDSLAccess().getModelNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCoEthDSLRule());
					}
					setWithLastConsumed(
						$current,
						"modelName",
						lv_modelName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCoEthDSLAccess().getEntitiesAgentParserRuleCall_2_0());
				}
				lv_entities_2_0=ruleAgent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoEthDSLRule());
					}
					add(
						$current,
						"entities",
						lv_entities_2_0,
						"org.xtext.example.mydsl.MyDsl.Agent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getCoEthDSLAccess().getEndKeyword_3());
		}
	)
;

// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	iv_ruleAgent=ruleAgent
	{ $current=$iv_ruleAgent.current; }
	EOF;

// Rule Agent
ruleAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='agent'
		{
			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAgentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAgentAccess().getFeaturesFeatureParserRuleCall_3_0());
				}
				lv_features_3_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgentRule());
					}
					add(
						$current,
						"features",
						lv_features_3_0,
						"org.xtext.example.mydsl.MyDsl.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getAgentAccess().getOperationsActionParserRuleCall_4_0());
				}
				lv_operations_4_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgentRule());
					}
					add(
						$current,
						"operations",
						lv_operations_4_0,
						"org.xtext.example.mydsl.MyDsl.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='ecoModel'
		{
			newLeafNode(otherlv_5, grammarAccess.getAgentAccess().getEcoModelKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAgentAccess().getDecoNodesEcoNodeParserRuleCall_7_0());
				}
				lv_decoNodes_7_0=ruleecoNode
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgentRule());
					}
					add(
						$current,
						"decoNodes",
						lv_decoNodes_7_0,
						"org.xtext.example.mydsl.MyDsl.ecoNode");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_8='constraints'
		{
			newLeafNode(otherlv_8, grammarAccess.getAgentAccess().getConstraintsKeyword_8());
		}
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAgentAccess().getConstraintsEcoConstraintParserRuleCall_10_0());
				}
				lv_constraints_10_0=ruleecoConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgentRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_10_0,
						"org.xtext.example.mydsl.MyDsl.ecoConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleecoNode
entryRuleecoNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEcoNodeRule()); }
	iv_ruleecoNode=ruleecoNode
	{ $current=$iv_ruleecoNode.current; }
	EOF;

// Rule ecoNode
ruleecoNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getEcoNodeAccess().getLeftParenthesisKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEcoNodeAccess().getNTypeNodeTypeEnumRuleCall_0_1_0());
					}
					lv_nType_1_0=ruleNodeType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEcoNodeRule());
						}
						set(
							$current,
							"nType",
							lv_nType_1_0,
							"org.xtext.example.mydsl.MyDsl.NodeType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getEcoNodeAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoNodeRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_nDefinition_3_0=RULE_STRING
					{
						newLeafNode(lv_nDefinition_3_0, grammarAccess.getEcoNodeAccess().getNDefinitionSTRINGTerminalRuleCall_0_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoNodeRule());
						}
						setWithLastConsumed(
							$current,
							"nDefinition",
							lv_nDefinition_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				otherlv_4='initial activation'
				{
					newLeafNode(otherlv_4, grammarAccess.getEcoNodeAccess().getInitialActivationKeyword_0_4_0());
				}
				otherlv_5='='
				{
					newLeafNode(otherlv_5, grammarAccess.getEcoNodeAccess().getEqualsSignKeyword_0_4_1());
				}
				(
					(
						lv_activationLevel_6_0=RULE_DOUBLE
						{
							newLeafNode(lv_activationLevel_6_0, grammarAccess.getEcoNodeAccess().getActivationLevelDOUBLETerminalRuleCall_0_4_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEcoNodeRule());
							}
							setWithLastConsumed(
								$current,
								"activationLevel",
								lv_activationLevel_6_0,
								"org.xtext.example.mydsl.MyDsl.DOUBLE");
						}
					)
				)
			)?
			(
				otherlv_7='priority'
				{
					newLeafNode(otherlv_7, grammarAccess.getEcoNodeAccess().getPriorityKeyword_0_5_0());
				}
				otherlv_8='='
				{
					newLeafNode(otherlv_8, grammarAccess.getEcoNodeAccess().getEqualsSignKeyword_0_5_1());
				}
				(
					(
						lv_priority_9_0=RULE_INT
						{
							newLeafNode(lv_priority_9_0, grammarAccess.getEcoNodeAccess().getPriorityINTTerminalRuleCall_0_5_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEcoNodeRule());
							}
							setWithLastConsumed(
								$current,
								"priority",
								lv_priority_9_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)?
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getEcoNodeAccess().getRightParenthesisKeyword_0_6());
			}
		)
		    |
		(
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getEcoNodeAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEcoNodeAccess().getNTypeNodeTypeEnumRuleCall_1_1_0());
					}
					lv_nType_12_0=ruleNodeType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEcoNodeRule());
						}
						set(
							$current,
							"nType",
							lv_nType_12_0,
							"org.xtext.example.mydsl.MyDsl.NodeType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_name_13_0=RULE_ID
					{
						newLeafNode(lv_name_13_0, grammarAccess.getEcoNodeAccess().getNameIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoNodeRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_13_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_14='is'
			{
				newLeafNode(otherlv_14, grammarAccess.getEcoNodeAccess().getIsKeyword_1_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoNodeRule());
						}
					}
					otherlv_15=RULE_ID
					{
						newLeafNode(otherlv_15, grammarAccess.getEcoNodeAccess().getMyActionActionCrossReference_1_4_0());
					}
				)
			)
			(
				(
					lv_bDefinition_16_0=RULE_STRING
					{
						newLeafNode(lv_bDefinition_16_0, grammarAccess.getEcoNodeAccess().getBDefinitionSTRINGTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoNodeRule());
						}
						setWithLastConsumed(
							$current,
							"bDefinition",
							lv_bDefinition_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=')'
			{
				newLeafNode(otherlv_17, grammarAccess.getEcoNodeAccess().getRightParenthesisKeyword_1_6());
			}
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='action'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='definition'
			{
				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDefinitionKeyword_3_0());
			}
			(
				(
					lv_aDefinition_4_0=RULE_STRING
					{
						newLeafNode(lv_aDefinition_4_0, grammarAccess.getActionAccess().getADefinitionSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActionRule());
						}
						setWithLastConsumed(
							$current,
							"aDefinition",
							lv_aDefinition_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleecoConstraint
entryRuleecoConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEcoConstraintRule()); }
	iv_ruleecoConstraint=ruleecoConstraint
	{ $current=$iv_ruleecoConstraint.current; }
	EOF;

// Rule ecoConstraint
ruleecoConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getFacilitateParserRuleCall_0_0());
			}
			this_Facilitate_0=ruleFacilitate
			{
				$current = $this_Facilitate_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getTriggerParserRuleCall_0_1());
			}
			this_Trigger_1=ruleTrigger
			{
				$current = $this_Trigger_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getInhibitParserRuleCall_0_2());
			}
			this_Inhibit_2=ruleInhibit
			{
				$current = $this_Inhibit_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getIncompatibleParserRuleCall_0_3());
			}
			this_Incompatible_3=ruleIncompatible
			{
				$current = $this_Incompatible_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getExplainParserRuleCall_0_4());
			}
			this_Explain_4=ruleExplain
			{
				$current = $this_Explain_4.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getDeduceParserRuleCall_0_5());
			}
			this_Deduce_5=ruleDeduce
			{
				$current = $this_Deduce_5.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getContradictParserRuleCall_0_6());
			}
			this_Contradict_6=ruleContradict
			{
				$current = $this_Contradict_6.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getSimilarParserRuleCall_0_7());
			}
			this_Similar_7=ruleSimilar
			{
				$current = $this_Similar_7.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEcoConstraintAccess().getCompeteParserRuleCall_0_8());
			}
			this_Compete_8=ruleCompete
			{
				$current = $this_Compete_8.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_9='with'
			{
				newLeafNode(otherlv_9, grammarAccess.getEcoConstraintAccess().getWithKeyword_1_0());
			}
			otherlv_10='('
			{
				newLeafNode(otherlv_10, grammarAccess.getEcoConstraintAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEcoConstraintRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getEcoConstraintAccess().getCooperativeUnitsEcoNodeCrossReference_1_2_0());
					}
				)
			)+
			otherlv_12=')'
			{
				newLeafNode(otherlv_12, grammarAccess.getEcoConstraintAccess().getRightParenthesisKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleFacilitate
entryRuleFacilitate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFacilitateRule()); }
	iv_ruleFacilitate=ruleFacilitate
	{ $current=$iv_ruleFacilitate.current; }
	EOF;

// Rule Facilitate
ruleFacilitate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='facilitate'
		{
			newLeafNode(otherlv_0, grammarAccess.getFacilitateAccess().getFacilitateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFacilitateRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFacilitateAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFacilitateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getFacilitateAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getFacilitateAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFacilitateRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleTrigger
entryRuleTrigger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTriggerRule()); }
	iv_ruleTrigger=ruleTrigger
	{ $current=$iv_ruleTrigger.current; }
	EOF;

// Rule Trigger
ruleTrigger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='trigger'
		{
			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getTriggerAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTriggerRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleInhibit
entryRuleInhibit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInhibitRule()); }
	iv_ruleInhibit=ruleInhibit
	{ $current=$iv_ruleInhibit.current; }
	EOF;

// Rule Inhibit
ruleInhibit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='inhibit'
		{
			newLeafNode(otherlv_0, grammarAccess.getInhibitAccess().getInhibitKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInhibitRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getInhibitAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInhibitRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getInhibitAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getInhibitAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInhibitRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleIncompatible
entryRuleIncompatible returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncompatibleRule()); }
	iv_ruleIncompatible=ruleIncompatible
	{ $current=$iv_ruleIncompatible.current; }
	EOF;

// Rule Incompatible
ruleIncompatible returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='incompatible'
		{
			newLeafNode(otherlv_0, grammarAccess.getIncompatibleAccess().getIncompatibleKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncompatibleRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getIncompatibleAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncompatibleRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getIncompatibleAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getIncompatibleAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncompatibleRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleExplain
entryRuleExplain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExplainRule()); }
	iv_ruleExplain=ruleExplain
	{ $current=$iv_ruleExplain.current; }
	EOF;

// Rule Explain
ruleExplain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='explain'
		{
			newLeafNode(otherlv_0, grammarAccess.getExplainAccess().getExplainKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExplainRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getExplainAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExplainRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getExplainAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getExplainAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExplainRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleDeduce
entryRuleDeduce returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeduceRule()); }
	iv_ruleDeduce=ruleDeduce
	{ $current=$iv_ruleDeduce.current; }
	EOF;

// Rule Deduce
ruleDeduce returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='deduce'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeduceAccess().getDeduceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeduceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDeduceAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeduceRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getDeduceAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getDeduceAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeduceRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleContradict
entryRuleContradict returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContradictRule()); }
	iv_ruleContradict=ruleContradict
	{ $current=$iv_ruleContradict.current; }
	EOF;

// Rule Contradict
ruleContradict returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='contradict'
		{
			newLeafNode(otherlv_0, grammarAccess.getContradictAccess().getContradictKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContradictRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getContradictAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContradictRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getContradictAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getContradictAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContradictRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleSimilar
entryRuleSimilar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimilarRule()); }
	iv_ruleSimilar=ruleSimilar
	{ $current=$iv_ruleSimilar.current; }
	EOF;

// Rule Similar
ruleSimilar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='similar'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimilarAccess().getSimilarKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimilarRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getSimilarAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimilarRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getSimilarAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getSimilarAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimilarRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleCompete
entryRuleCompete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompeteRule()); }
	iv_ruleCompete=ruleCompete
	{ $current=$iv_ruleCompete.current; }
	EOF;

// Rule Compete
ruleCompete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='compete'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompeteAccess().getCompeteKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompeteRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCompeteAccess().getSourceEcoNodeCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompeteRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getCompeteAccess().getTargetEcoNodeCrossReference_2_0());
				}
			)
		)
		(
			(
				lv_weight_3_0=RULE_DOUBLE
				{
					newLeafNode(lv_weight_3_0, grammarAccess.getCompeteAccess().getWeightDOUBLETerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompeteRule());
					}
					setWithLastConsumed(
						$current,
						"weight",
						lv_weight_3_0,
						"org.xtext.example.mydsl.MyDsl.DOUBLE");
				}
			)
		)?
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1());
		}
		(
			(
				lv_type_2_0=RULE_ID
				{
					newLeafNode(lv_type_2_0, grammarAccess.getFeatureAccess().getTypeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Rule NodeType
ruleNodeType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='goal'
			{
				$current = grammarAccess.getNodeTypeAccess().getGOALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getGOALEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='belief'
			{
				$current = grammarAccess.getNodeTypeAccess().getBELIEFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getBELIEFEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='evidence'
			{
				$current = grammarAccess.getNodeTypeAccess().getEVIDENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getEVIDENCEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='action'
			{
				$current = grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getACTIONEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
