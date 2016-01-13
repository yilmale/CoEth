/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getDecoNodes <em>Deco Nodes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Agent#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Agent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Action> getOperations();

  /**
   * Returns the value of the '<em><b>Deco Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ecoNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deco Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deco Nodes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_DecoNodes()
   * @model containment="true"
   * @generated
   */
  EList<ecoNode> getDecoNodes();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ecoConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAgent_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<ecoConstraint> getConstraints();

} // Agent