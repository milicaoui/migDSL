/**
 */
package dsl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mng Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.MngCollection#getName <em>Name</em>}</li>
 *   <li>{@link dsl.MngCollection#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getMngCollection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueFieldNames'"
 * @generated
 */
public interface MngCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsl.DslPackage#getMngCollection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsl.MngCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link dsl.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see dsl.DslPackage#getMngCollection_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Field names inside document must be unique\',\n\tstatus : Boolean = \n\t\t\tself.fields-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name)\n}.status'"
	 * @generated
	 */
	boolean uniqueFieldNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // MngCollection
