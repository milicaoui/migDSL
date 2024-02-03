/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.PrimaryKey#getKeyColumns <em>Key Columns</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' reference list.
	 * The list contents are of type {@link dsl.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' reference list.
	 * @see dsl.DslPackage#getPrimaryKey_KeyColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getKeyColumns();

} // PrimaryKey
