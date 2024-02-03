/**
 */
package dsl.impl;

import dsl.DslPackage;
import dsl.Mapping;
import dsl.Migration;
import dsl.MongoDb;
import dsl.Options;
import dsl.RelationalDb;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsl.impl.MigrationImpl#getRelationaldb <em>Relationaldb</em>}</li>
 *   <li>{@link dsl.impl.MigrationImpl#getMongodb <em>Mongodb</em>}</li>
 *   <li>{@link dsl.impl.MigrationImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link dsl.impl.MigrationImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrationImpl extends MinimalEObjectImpl.Container implements Migration {
	/**
	 * The cached value of the '{@link #getRelationaldb() <em>Relationaldb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationaldb()
	 * @generated
	 * @ordered
	 */
	protected RelationalDb relationaldb;

	/**
	 * The cached value of the '{@link #getMongodb() <em>Mongodb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongodb()
	 * @generated
	 * @ordered
	 */
	protected MongoDb mongodb;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Options options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.MIGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalDb getRelationaldb() {
		return relationaldb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationaldb(RelationalDb newRelationaldb, NotificationChain msgs) {
		RelationalDb oldRelationaldb = relationaldb;
		relationaldb = newRelationaldb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__RELATIONALDB, oldRelationaldb, newRelationaldb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationaldb(RelationalDb newRelationaldb) {
		if (newRelationaldb != relationaldb) {
			NotificationChain msgs = null;
			if (relationaldb != null)
				msgs = ((InternalEObject)relationaldb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__RELATIONALDB, null, msgs);
			if (newRelationaldb != null)
				msgs = ((InternalEObject)newRelationaldb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__RELATIONALDB, null, msgs);
			msgs = basicSetRelationaldb(newRelationaldb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__RELATIONALDB, newRelationaldb, newRelationaldb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MongoDb getMongodb() {
		return mongodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMongodb(MongoDb newMongodb, NotificationChain msgs) {
		MongoDb oldMongodb = mongodb;
		mongodb = newMongodb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__MONGODB, oldMongodb, newMongodb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMongodb(MongoDb newMongodb) {
		if (newMongodb != mongodb) {
			NotificationChain msgs = null;
			if (mongodb != null)
				msgs = ((InternalEObject)mongodb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__MONGODB, null, msgs);
			if (newMongodb != null)
				msgs = ((InternalEObject)newMongodb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__MONGODB, null, msgs);
			msgs = basicSetMongodb(newMongodb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__MONGODB, newMongodb, newMongodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, DslPackage.MIGRATION__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Options getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Options newOptions, NotificationChain msgs) {
		Options oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(Options newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.MIGRATION__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.MIGRATION__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.MIGRATION__RELATIONALDB:
				return basicSetRelationaldb(null, msgs);
			case DslPackage.MIGRATION__MONGODB:
				return basicSetMongodb(null, msgs);
			case DslPackage.MIGRATION__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case DslPackage.MIGRATION__OPTIONS:
				return basicSetOptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.MIGRATION__RELATIONALDB:
				return getRelationaldb();
			case DslPackage.MIGRATION__MONGODB:
				return getMongodb();
			case DslPackage.MIGRATION__MAPPINGS:
				return getMappings();
			case DslPackage.MIGRATION__OPTIONS:
				return getOptions();
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
			case DslPackage.MIGRATION__RELATIONALDB:
				setRelationaldb((RelationalDb)newValue);
				return;
			case DslPackage.MIGRATION__MONGODB:
				setMongodb((MongoDb)newValue);
				return;
			case DslPackage.MIGRATION__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case DslPackage.MIGRATION__OPTIONS:
				setOptions((Options)newValue);
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
			case DslPackage.MIGRATION__RELATIONALDB:
				setRelationaldb((RelationalDb)null);
				return;
			case DslPackage.MIGRATION__MONGODB:
				setMongodb((MongoDb)null);
				return;
			case DslPackage.MIGRATION__MAPPINGS:
				getMappings().clear();
				return;
			case DslPackage.MIGRATION__OPTIONS:
				setOptions((Options)null);
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
			case DslPackage.MIGRATION__RELATIONALDB:
				return relationaldb != null;
			case DslPackage.MIGRATION__MONGODB:
				return mongodb != null;
			case DslPackage.MIGRATION__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case DslPackage.MIGRATION__OPTIONS:
				return options != null;
		}
		return super.eIsSet(featureID);
	}

} //MigrationImpl
