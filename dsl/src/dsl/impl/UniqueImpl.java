/**
 */
package dsl.impl;

import dsl.Column;
import dsl.DslPackage;
import dsl.Unique;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.UniqueImpl#getUniqueColumns <em>Unique Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueImpl extends ConstraintImpl implements Unique {
	/**
	 * The cached value of the '{@link #getUniqueColumns() <em>Unique Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> uniqueColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.UNIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getUniqueColumns() {
		if (uniqueColumns == null) {
			uniqueColumns = new EObjectResolvingEList<Column>(Column.class, this, DslPackage.UNIQUE__UNIQUE_COLUMNS);
		}
		return uniqueColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.UNIQUE__UNIQUE_COLUMNS:
				return getUniqueColumns();
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
			case DslPackage.UNIQUE__UNIQUE_COLUMNS:
				getUniqueColumns().clear();
				getUniqueColumns().addAll((Collection<? extends Column>)newValue);
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
			case DslPackage.UNIQUE__UNIQUE_COLUMNS:
				getUniqueColumns().clear();
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
			case DslPackage.UNIQUE__UNIQUE_COLUMNS:
				return uniqueColumns != null && !uniqueColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniqueImpl
