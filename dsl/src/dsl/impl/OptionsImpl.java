/**
 */
package dsl.impl;

import dsl.DslPackage;
import dsl.Options;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.OptionsImpl#isDataTypeMigration <em>Data Type Migration</em>}</li>
 *   <li>{@link dsl.impl.OptionsImpl#isAllowAdditionalFields <em>Allow Additional Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionsImpl extends MinimalEObjectImpl.Container implements Options {
	/**
	 * The default value of the '{@link #isDataTypeMigration() <em>Data Type Migration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataTypeMigration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_TYPE_MIGRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataTypeMigration() <em>Data Type Migration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataTypeMigration()
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeMigration = DATA_TYPE_MIGRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowAdditionalFields() <em>Allow Additional Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAdditionalFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_ADDITIONAL_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowAdditionalFields() <em>Allow Additional Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAdditionalFields()
	 * @generated
	 * @ordered
	 */
	protected boolean allowAdditionalFields = ALLOW_ADDITIONAL_FIELDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDataTypeMigration() {
		return dataTypeMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTypeMigration(boolean newDataTypeMigration) {
		boolean oldDataTypeMigration = dataTypeMigration;
		dataTypeMigration = newDataTypeMigration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.OPTIONS__DATA_TYPE_MIGRATION, oldDataTypeMigration, dataTypeMigration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowAdditionalFields() {
		return allowAdditionalFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAdditionalFields(boolean newAllowAdditionalFields) {
		boolean oldAllowAdditionalFields = allowAdditionalFields;
		allowAdditionalFields = newAllowAdditionalFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.OPTIONS__ALLOW_ADDITIONAL_FIELDS, oldAllowAdditionalFields, allowAdditionalFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.OPTIONS__DATA_TYPE_MIGRATION:
				return isDataTypeMigration();
			case DslPackage.OPTIONS__ALLOW_ADDITIONAL_FIELDS:
				return isAllowAdditionalFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPackage.OPTIONS__DATA_TYPE_MIGRATION:
				setDataTypeMigration((Boolean)newValue);
				return;
			case DslPackage.OPTIONS__ALLOW_ADDITIONAL_FIELDS:
				setAllowAdditionalFields((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslPackage.OPTIONS__DATA_TYPE_MIGRATION:
				setDataTypeMigration(DATA_TYPE_MIGRATION_EDEFAULT);
				return;
			case DslPackage.OPTIONS__ALLOW_ADDITIONAL_FIELDS:
				setAllowAdditionalFields(ALLOW_ADDITIONAL_FIELDS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslPackage.OPTIONS__DATA_TYPE_MIGRATION:
				return dataTypeMigration != DATA_TYPE_MIGRATION_EDEFAULT;
			case DslPackage.OPTIONS__ALLOW_ADDITIONAL_FIELDS:
				return allowAdditionalFields != ALLOW_ADDITIONAL_FIELDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (DataTypeMigration: ");
		result.append(dataTypeMigration);
		result.append(", AllowAdditionalFields: ");
		result.append(allowAdditionalFields);
		result.append(')');
		return result.toString();
	}

} //OptionsImpl
