/**
 */
package dsl.impl;

import dsl.Column;
import dsl.DslPackage;
import dsl.Field;
import dsl.ForeignKey;
import dsl.NestingObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nesting Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.NestingObjectImpl#getForeignkey <em>Foreignkey</em>}</li>
 *   <li>{@link dsl.impl.NestingObjectImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link dsl.impl.NestingObjectImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestingObjectImpl extends MappingImpl implements NestingObject {
	/**
	 * The cached value of the '{@link #getForeignkey() <em>Foreignkey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignkey()
	 * @generated
	 * @ordered
	 */
	protected ForeignKey foreignkey;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestingObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.NESTING_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKey getForeignkey() {
		if (foreignkey != null && foreignkey.eIsProxy()) {
			InternalEObject oldForeignkey = (InternalEObject)foreignkey;
			foreignkey = (ForeignKey)eResolveProxy(oldForeignkey);
			if (foreignkey != oldForeignkey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.NESTING_OBJECT__FOREIGNKEY, oldForeignkey, foreignkey));
			}
		}
		return foreignkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey basicGetForeignkey() {
		return foreignkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignkey(ForeignKey newForeignkey) {
		ForeignKey oldForeignkey = foreignkey;
		foreignkey = newForeignkey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.NESTING_OBJECT__FOREIGNKEY, oldForeignkey, foreignkey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<Column>(Column.class, this, DslPackage.NESTING_OBJECT__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Field>(Field.class, this, DslPackage.NESTING_OBJECT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.NESTING_OBJECT__FOREIGNKEY:
				if (resolve) return getForeignkey();
				return basicGetForeignkey();
			case DslPackage.NESTING_OBJECT__COLUMNS:
				return getColumns();
			case DslPackage.NESTING_OBJECT__FIELDS:
				return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPackage.NESTING_OBJECT__FOREIGNKEY:
				setForeignkey((ForeignKey)newValue);
				return;
			case DslPackage.NESTING_OBJECT__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DslPackage.NESTING_OBJECT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
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
			case DslPackage.NESTING_OBJECT__FOREIGNKEY:
				setForeignkey((ForeignKey)null);
				return;
			case DslPackage.NESTING_OBJECT__COLUMNS:
				getColumns().clear();
				return;
			case DslPackage.NESTING_OBJECT__FIELDS:
				getFields().clear();
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
			case DslPackage.NESTING_OBJECT__FOREIGNKEY:
				return foreignkey != null;
			case DslPackage.NESTING_OBJECT__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DslPackage.NESTING_OBJECT__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NestingObjectImpl
