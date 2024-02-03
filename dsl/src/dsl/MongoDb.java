/**
 */
package dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.MongoDb#getDb <em>Db</em>}</li>
 *   <li>{@link dsl.MongoDb#getHost <em>Host</em>}</li>
 *   <li>{@link dsl.MongoDb#getPort <em>Port</em>}</li>
 *   <li>{@link dsl.MongoDb#getCollections <em>Collections</em>}</li>
 *   <li>{@link dsl.MongoDb#getUsername <em>Username</em>}</li>
 *   <li>{@link dsl.MongoDb#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getMongoDb()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCollectionNames'"
 * @generated
 */
public interface MongoDb extends EObject {
	/**
	 * Returns the value of the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' attribute.
	 * @see #setDb(String)
	 * @see dsl.DslPackage#getMongoDb_Db()
	 * @model required="true"
	 * @generated
	 */
	String getDb();

	/**
	 * Sets the value of the '{@link dsl.MongoDb#getDb <em>Db</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' attribute.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see dsl.DslPackage#getMongoDb_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link dsl.MongoDb#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see dsl.DslPackage#getMongoDb_Port()
	 * @model required="true"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link dsl.MongoDb#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link dsl.MngCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see dsl.DslPackage#getMongoDb_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MngCollection> getCollections();

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see dsl.DslPackage#getMongoDb_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link dsl.MongoDb#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see dsl.DslPackage#getMongoDb_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link dsl.MongoDb#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Collection names inside MongoDb must be unique\',\n\tstatus : Boolean = \n\t\t self.collections-&gt; collect(name) -&gt; asSet() -&gt; size() = self.collections -&gt; size()\n}.status'"
	 * @generated
	 */
	boolean uniqueCollectionNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MongoDb
