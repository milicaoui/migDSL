/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.ForeignKey#getReferencing <em>Referencing</em>}</li>
 *   <li>{@link dsl.ForeignKey#getRefrenced <em>Refrenced</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Referencing</b></em>' reference list.
	 * The list contents are of type {@link dsl.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing</em>' reference list.
	 * @see dsl.DslPackage#getForeignKey_Referencing()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getReferencing();

	/**
	 * Returns the value of the '<em><b>Refrenced</b></em>' reference list.
	 * The list contents are of type {@link dsl.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refrenced</em>' reference list.
	 * @see dsl.DslPackage#getForeignKey_Refrenced()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getRefrenced();

} // ForeignKey
