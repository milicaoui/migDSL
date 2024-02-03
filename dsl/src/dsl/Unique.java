/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.Unique#getUniqueColumns <em>Unique Columns</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getUnique()
 * @model
 * @generated
 */
public interface Unique extends Constraint {
	/**
	 * Returns the value of the '<em><b>Unique Columns</b></em>' reference list.
	 * The list contents are of type {@link dsl.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Columns</em>' reference list.
	 * @see dsl.DslPackage#getUnique_UniqueColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getUniqueColumns();

} // Unique
