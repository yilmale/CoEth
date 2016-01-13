/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>eco Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getCooperativeUnits <em>Cooperative Units</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getecoConstraint()
 * @model
 * @generated
 */
public interface ecoConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Cooperative Units</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ecoNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cooperative Units</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cooperative Units</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getecoConstraint_CooperativeUnits()
   * @model
   * @generated
   */
  EList<ecoNode> getCooperativeUnits();

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ecoNode)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getecoConstraint_Source()
   * @model
   * @generated
   */
  ecoNode getSource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ecoNode value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ecoNode)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getecoConstraint_Target()
   * @model
   * @generated
   */
  ecoNode getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ecoNode value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getecoConstraint_Weight()
   * @model
   * @generated
   */
  String getWeight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ecoConstraint#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(String value);

} // ecoConstraint