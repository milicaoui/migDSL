/**
 */
package dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.Options#isDataTypeMigration <em>Data Type Migration</em>}</li>
 *   <li>{@link dsl.Options#isAllowAdditionalFields <em>Allow Additional Fields</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getOptions()
 * @model
 * @generated
 */
public interface Options extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Migration</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Migration</em>' attribute.
	 * @see #setDataTypeMigration(boolean)
	 * @see dsl.DslPackage#getOptions_DataTypeMigration()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isDataTypeMigration();

	/**
	 * Sets the value of the '{@link dsl.Options#isDataTypeMigration <em>Data Type Migration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Migration</em>' attribute.
	 * @see #isDataTypeMigration()
	 * @generated
	 */
	void setDataTypeMigration(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Additional Fields</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Additional Fields</em>' attribute.
	 * @see #setAllowAdditionalFields(boolean)
	 * @see dsl.DslPackage#getOptions_AllowAdditionalFields()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isAllowAdditionalFields();

	/**
	 * Sets the value of the '{@link dsl.Options#isAllowAdditionalFields <em>Allow Additional Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Additional Fields</em>' attribute.
	 * @see #isAllowAdditionalFields()
	 * @generated
	 */
	void setAllowAdditionalFields(boolean value);

} // Options
