/**
 */
package dsl.impl;

import dsl.Column;
import dsl.DslPackage;
import dsl.ForeignKey;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.ForeignKeyImpl#getReferencing <em>Referencing</em>}</li>
 *   <li>{@link dsl.impl.ForeignKeyImpl#getRefrenced <em>Refrenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends ConstraintImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getReferencing() <em>Referencing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencing()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> referencing;

	/**
	 * The cached value of the '{@link #getRefrenced() <em>Refrenced</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrenced()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> refrenced;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getReferencing() {
		if (referencing == null) {
			referencing = new EObjectResolvingEList<Column>(Column.class, this, DslPackage.FOREIGN_KEY__REFERENCING);
		}
		return referencing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getRefrenced() {
		if (refrenced == null) {
			refrenced = new EObjectResolvingEList<Column>(Column.class, this, DslPackage.FOREIGN_KEY__REFRENCED);
		}
		return refrenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.FOREIGN_KEY__REFERENCING:
				return getReferencing();
			case DslPackage.FOREIGN_KEY__REFRENCED:
				return getRefrenced();
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
			case DslPackage.FOREIGN_KEY__REFERENCING:
				getReferencing().clear();
				getReferencing().addAll((Collection<? extends Column>)newValue);
				return;
			case DslPackage.FOREIGN_KEY__REFRENCED:
				getRefrenced().clear();
				getRefrenced().addAll((Collection<? extends Column>)newValue);
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
			case DslPackage.FOREIGN_KEY__REFERENCING:
				getReferencing().clear();
				return;
			case DslPackage.FOREIGN_KEY__REFRENCED:
				getRefrenced().clear();
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
			case DslPackage.FOREIGN_KEY__REFERENCING:
				return referencing != null && !referencing.isEmpty();
			case DslPackage.FOREIGN_KEY__REFRENCED:
				return refrenced != null && !refrenced.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
