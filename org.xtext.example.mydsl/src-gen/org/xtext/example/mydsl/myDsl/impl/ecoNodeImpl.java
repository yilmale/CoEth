/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NodeType;
import org.xtext.example.mydsl.myDsl.ecoNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>eco Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getNType <em>NType</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getNDefinition <em>NDefinition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getActivationLevel <em>Activation Level</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getMyAction <em>My Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ecoNodeImpl#getBDefinition <em>BDefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ecoNodeImpl extends MinimalEObjectImpl.Container implements ecoNode
{
  /**
   * The default value of the '{@link #getNType() <em>NType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNType()
   * @generated
   * @ordered
   */
  protected static final NodeType NTYPE_EDEFAULT = NodeType.GOAL;

  /**
   * The cached value of the '{@link #getNType() <em>NType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNType()
   * @generated
   * @ordered
   */
  protected NodeType nType = NTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNDefinition() <em>NDefinition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNDefinition()
   * @generated
   * @ordered
   */
  protected static final String NDEFINITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNDefinition() <em>NDefinition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNDefinition()
   * @generated
   * @ordered
   */
  protected String nDefinition = NDEFINITION_EDEFAULT;

  /**
   * The default value of the '{@link #getActivationLevel() <em>Activation Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivationLevel()
   * @generated
   * @ordered
   */
  protected static final String ACTIVATION_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActivationLevel() <em>Activation Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivationLevel()
   * @generated
   * @ordered
   */
  protected String activationLevel = ACTIVATION_LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMyAction() <em>My Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMyAction()
   * @generated
   * @ordered
   */
  protected Action myAction;

  /**
   * The default value of the '{@link #getBDefinition() <em>BDefinition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBDefinition()
   * @generated
   * @ordered
   */
  protected static final String BDEFINITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBDefinition() <em>BDefinition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBDefinition()
   * @generated
   * @ordered
   */
  protected String bDefinition = BDEFINITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ecoNodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ECO_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType getNType()
  {
    return nType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNType(NodeType newNType)
  {
    NodeType oldNType = nType;
    nType = newNType == null ? NTYPE_EDEFAULT : newNType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__NTYPE, oldNType, nType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNDefinition()
  {
    return nDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNDefinition(String newNDefinition)
  {
    String oldNDefinition = nDefinition;
    nDefinition = newNDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__NDEFINITION, oldNDefinition, nDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActivationLevel()
  {
    return activationLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivationLevel(String newActivationLevel)
  {
    String oldActivationLevel = activationLevel;
    activationLevel = newActivationLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__ACTIVATION_LEVEL, oldActivationLevel, activationLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getMyAction()
  {
    if (myAction != null && myAction.eIsProxy())
    {
      InternalEObject oldMyAction = (InternalEObject)myAction;
      myAction = (Action)eResolveProxy(oldMyAction);
      if (myAction != oldMyAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ECO_NODE__MY_ACTION, oldMyAction, myAction));
      }
    }
    return myAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetMyAction()
  {
    return myAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMyAction(Action newMyAction)
  {
    Action oldMyAction = myAction;
    myAction = newMyAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__MY_ACTION, oldMyAction, myAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBDefinition()
  {
    return bDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBDefinition(String newBDefinition)
  {
    String oldBDefinition = bDefinition;
    bDefinition = newBDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECO_NODE__BDEFINITION, oldBDefinition, bDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ECO_NODE__NTYPE:
        return getNType();
      case MyDslPackage.ECO_NODE__NAME:
        return getName();
      case MyDslPackage.ECO_NODE__NDEFINITION:
        return getNDefinition();
      case MyDslPackage.ECO_NODE__ACTIVATION_LEVEL:
        return getActivationLevel();
      case MyDslPackage.ECO_NODE__PRIORITY:
        return getPriority();
      case MyDslPackage.ECO_NODE__MY_ACTION:
        if (resolve) return getMyAction();
        return basicGetMyAction();
      case MyDslPackage.ECO_NODE__BDEFINITION:
        return getBDefinition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ECO_NODE__NTYPE:
        setNType((NodeType)newValue);
        return;
      case MyDslPackage.ECO_NODE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.ECO_NODE__NDEFINITION:
        setNDefinition((String)newValue);
        return;
      case MyDslPackage.ECO_NODE__ACTIVATION_LEVEL:
        setActivationLevel((String)newValue);
        return;
      case MyDslPackage.ECO_NODE__PRIORITY:
        setPriority((Integer)newValue);
        return;
      case MyDslPackage.ECO_NODE__MY_ACTION:
        setMyAction((Action)newValue);
        return;
      case MyDslPackage.ECO_NODE__BDEFINITION:
        setBDefinition((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ECO_NODE__NTYPE:
        setNType(NTYPE_EDEFAULT);
        return;
      case MyDslPackage.ECO_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.ECO_NODE__NDEFINITION:
        setNDefinition(NDEFINITION_EDEFAULT);
        return;
      case MyDslPackage.ECO_NODE__ACTIVATION_LEVEL:
        setActivationLevel(ACTIVATION_LEVEL_EDEFAULT);
        return;
      case MyDslPackage.ECO_NODE__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case MyDslPackage.ECO_NODE__MY_ACTION:
        setMyAction((Action)null);
        return;
      case MyDslPackage.ECO_NODE__BDEFINITION:
        setBDefinition(BDEFINITION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ECO_NODE__NTYPE:
        return nType != NTYPE_EDEFAULT;
      case MyDslPackage.ECO_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.ECO_NODE__NDEFINITION:
        return NDEFINITION_EDEFAULT == null ? nDefinition != null : !NDEFINITION_EDEFAULT.equals(nDefinition);
      case MyDslPackage.ECO_NODE__ACTIVATION_LEVEL:
        return ACTIVATION_LEVEL_EDEFAULT == null ? activationLevel != null : !ACTIVATION_LEVEL_EDEFAULT.equals(activationLevel);
      case MyDslPackage.ECO_NODE__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case MyDslPackage.ECO_NODE__MY_ACTION:
        return myAction != null;
      case MyDslPackage.ECO_NODE__BDEFINITION:
        return BDEFINITION_EDEFAULT == null ? bDefinition != null : !BDEFINITION_EDEFAULT.equals(bDefinition);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nType: ");
    result.append(nType);
    result.append(", name: ");
    result.append(name);
    result.append(", nDefinition: ");
    result.append(nDefinition);
    result.append(", activationLevel: ");
    result.append(activationLevel);
    result.append(", priority: ");
    result.append(priority);
    result.append(", bDefinition: ");
    result.append(bDefinition);
    result.append(')');
    return result.toString();
  }

} //ecoNodeImpl