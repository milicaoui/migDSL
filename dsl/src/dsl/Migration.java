/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.Migration#getRelationaldb <em>Relationaldb</em>}</li>
 *   <li>{@link dsl.Migration#getMongodb <em>Mongodb</em>}</li>
 *   <li>{@link dsl.Migration#getMappings <em>Mappings</em>}</li>
 *   <li>{@link dsl.Migration#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getMigration()
 * @model
 * @generated
 */
public interface Migration extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationaldb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationaldb</em>' containment reference.
	 * @see #setRelationaldb(RelationalDb)
	 * @see dsl.DslPackage#getMigration_Relationaldb()
	 * @model containment="true"
	 * @generated
	 */
	RelationalDb getRelationaldb();

	/**
	 * Sets the value of the '{@link dsl.Migration#getRelationaldb <em>Relationaldb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationaldb</em>' containment reference.
	 * @see #getRelationaldb()
	 * @generated
	 */
	void setRelationaldb(RelationalDb value);

	/**
	 * Returns the value of the '<em><b>Mongodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mongodb</em>' containment reference.
	 * @see #setMongodb(MongoDb)
	 * @see dsl.DslPackage#getMigration_Mongodb()
	 * @model containment="true"
	 * @generated
	 */
	MongoDb getMongodb();

	/**
	 * Sets the value of the '{@link dsl.Migration#getMongodb <em>Mongodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mongodb</em>' containment reference.
	 * @see #getMongodb()
	 * @generated
	 */
	void setMongodb(MongoDb value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link dsl.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see dsl.DslPackage#getMigration_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Options)
	 * @see dsl.DslPackage#getMigration_Options()
	 * @model containment="true"
	 * @generated
	 */
	Options getOptions();

	/**
	 * Sets the value of the '{@link dsl.Migration#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Options value);

} // Migration
