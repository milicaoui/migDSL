/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nesting List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.NestingList#getForeignkey <em>Foreignkey</em>}</li>
 *   <li>{@link dsl.NestingList#getColumns <em>Columns</em>}</li>
 *   <li>{@link dsl.NestingList#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getNestingList()
 * @model
 * @generated
 */
public interface NestingList extends Mapping {
	/**
	 * Returns the value of the '<em><b>Foreignkey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreignkey</em>' reference.
	 * @see #setForeignkey(ForeignKey)
	 * @see dsl.DslPackage#getNestingList_Foreignkey()
	 * @model required="true"
	 * @generated
	 */
	ForeignKey getForeignkey();

	/**
	 * Sets the value of the '{@link dsl.NestingList#getForeignkey <em>Foreignkey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreignkey</em>' reference.
	 * @see #getForeignkey()
	 * @generated
	 */
	void setForeignkey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link dsl.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see dsl.DslPackage#getNestingList_Columns()
	 * @model
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link dsl.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see dsl.DslPackage#getNestingList_Fields()
	 * @model
	 * @generated
	 */
	EList<Field> getFields();

} // NestingList
