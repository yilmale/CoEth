/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Co Eth DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CoEthDSL#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CoEthDSL#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCoEthDSL()
 * @model
 * @generated
 */
public interface CoEthDSL extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Name</em>' attribute.
   * @see #setModelName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCoEthDSL_ModelName()
   * @model
   * @generated
   */
  String getModelName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CoEthDSL#getModelName <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Name</em>' attribute.
   * @see #getModelName()
   * @generated
   */
  void setModelName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCoEthDSL_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getEntities();

} // CoEthDSL