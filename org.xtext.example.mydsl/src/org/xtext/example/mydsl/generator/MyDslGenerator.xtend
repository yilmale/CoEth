package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Agent
import org.xtext.example.mydsl.myDsl.CoEthDSL
import org.xtext.example.mydsl.myDsl.Facilitate
import org.xtext.example.mydsl.myDsl.Trigger
import org.xtext.example.mydsl.myDsl.Inhibit
import org.xtext.example.mydsl.myDsl.Incompatible
import org.xtext.example.mydsl.myDsl.Explain
import org.xtext.example.mydsl.myDsl.Deduce
import org.xtext.example.mydsl.myDsl.Contradict
import org.xtext.example.mydsl.myDsl.Similar
import org.xtext.example.mydsl.myDsl.Compete

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//fsa.generateFile('greetings.txt', 'People to greet: ' + 
		//	resource.allContents
		//		.filter(typeof(Greeting))
		//		.map[name]
		//		.join(', '))
		
		fsa.generateFile("ECoModel.xml", compile(resource))
	}
	
	def compile(Resource res) '''
		<?xml version="1.0"?>
		«FOR ecm: res.allContents.toIterable.filter(CoEthDSL)» <ECoModel> «ENDFOR»
		«FOR a : res.allContents.toIterable.filter(Agent)»  
			<Agent>
			  <name> «a.name» </name>
			  <CoherenceModel>
			  «FOR dn : a.getDecoNodes()»
			    «IF (dn.getNType().getValue()==2)»
			    <evidence>
			        <name>«dn.name»</name>
			        <definition>«dn.getNDefinition()»</definition>
			        «IF (dn.getActivationLevel()!=null)»
			        <activation>«dn.getActivationLevel()»</activation>
			        «ENDIF»
			    </evidence>
			    «ELSEIF (dn.getNType().getValue()==1)»
			    <belief>
			        <name>«dn.name»</name>
			        <definition>«dn.getNDefinition()»</definition>
			        «IF (dn.getActivationLevel()!=null)»
			        <activation>«dn.getActivationLevel()»</activation>
			        «ENDIF»
			     </belief>
			    «ELSEIF (dn.getNType().getValue()==0)»
			     <goal>
			        <name>«dn.name»</name>
			        <definition>«dn.getNDefinition()»</definition>
			        «IF (dn.getActivationLevel()!=null)»
			        <activation>«dn.getActivationLevel()»</activation>
			        «ENDIF»
			     </goal>
			    «ELSEIF (dn.getNType().getValue()==3)»
			     <action>
			        <name>«dn.name»</name>
			        <definition>«dn.getBDefinition()»</definition>
			     </action>
			    «ENDIF» 
			  «ENDFOR»	
			  <constraints>		  
			  «FOR dc : a.getConstraints()»	
			  	 «IF dc instanceof Facilitate»
			  	     <facilitate>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </facilitate>
			  	 «ENDIF»
			  	 «IF dc instanceof Trigger»
			  	     <trigger>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </trigger>
			  	 «ENDIF»
			  	 «IF dc instanceof Inhibit»
			  	     <inhibit>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </inhibit>
			  	 «ENDIF»
			  	 «IF dc instanceof Incompatible»
			  	     <incompatible>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </incompatible>
			  	 «ENDIF»
			  	 «IF dc instanceof Explain»
			  	     <explain>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </explain>
			  	 «ENDIF»
			  	 «IF dc instanceof Deduce»
			  	     <deduce>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </deduce>
			  	 «ENDIF»
			  	 «IF dc instanceof Contradict»
			  	     <contradict>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </contradict>
			  	 «ENDIF»
			  	 «IF dc instanceof Similar»
			  	     <similar>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </similar>
			  	 «ENDIF»
			  	 «IF dc instanceof Compete»
			  	     <compete>
			  	          <source>«dc.getSource().getName()»</source>
			  	          <target>«dc.getTarget().getName()»</target>
			  	          «IF (dc.getWeight()!=null)»
			  	          <weight>«dc.getWeight()»</weight>
			  	          «ELSE» 
			  	          <weight>1.0</weight>
			  	          «ENDIF»
			  	          «IF (dc.getCooperativeUnits().size()>0)»
			  	          «FOR cU : dc.getCooperativeUnits()»
			  	          <coopNode>«cU.name»</coopNode>
			  	          «ENDFOR»	
			           «ENDIF» 
			  	     </compete>
			  	 «ENDIF»
			  «ENDFOR»	
			  </constraints>		
			   </CoherenceModel>		
			</Agent>
		«ENDFOR»
		</ECoModel>
	'''
	
}