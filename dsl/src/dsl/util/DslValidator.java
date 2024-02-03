/**
 */
package dsl.util;

import dsl.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dsl.DslPackage
 * @generated
 */
public class DslValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DslValidator INSTANCE = new DslValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dsl";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Collection Names' of 'Mongo Db'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MONGO_DB__UNIQUE_COLLECTION_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Field Names' of 'Mng Collection'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MNG_COLLECTION__UNIQUE_FIELD_NAMES = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DslPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DslPackage.MIGRATION:
				return validateMigration((Migration)value, diagnostics, context);
			case DslPackage.MONGO_DB:
				return validateMongoDb((MongoDb)value, diagnostics, context);
			case DslPackage.RELATIONAL_DB:
				return validateRelationalDb((RelationalDb)value, diagnostics, context);
			case DslPackage.MNG_COLLECTION:
				return validateMngCollection((MngCollection)value, diagnostics, context);
			case DslPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case DslPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case DslPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case DslPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case DslPackage.UNIQUE:
				return validateUnique((Unique)value, diagnostics, context);
			case DslPackage.NOT_NULL:
				return validateNotNull((NotNull)value, diagnostics, context);
			case DslPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case DslPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case DslPackage.OPTIONS:
				return validateOptions((Options)value, diagnostics, context);
			case DslPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case DslPackage.DIRECT_MAPPING:
				return validateDirectMapping((DirectMapping)value, diagnostics, context);
			case DslPackage.NESTING_LIST:
				return validateNestingList((NestingList)value, diagnostics, context);
			case DslPackage.NESTING_OBJECT:
				return validateNestingObject((NestingObject)value, diagnostics, context);
			case DslPackage.FIELD_TYPE:
				return validateFieldType((FieldType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigration(Migration migration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(migration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMongoDb(MongoDb mongoDb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mongoDb, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mongoDb, diagnostics, context);
		if (result || diagnostics != null) result &= validateMongoDb_uniqueCollectionNames(mongoDb, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueCollectionNames constraint of '<em>Mongo Db</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMongoDb_uniqueCollectionNames(MongoDb mongoDb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mongoDb.uniqueCollectionNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalDb(RelationalDb relationalDb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationalDb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMngCollection(MngCollection mngCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mngCollection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mngCollection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMngCollection_uniqueFieldNames(mngCollection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueFieldNames constraint of '<em>Mng Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMngCollection_uniqueFieldNames(MngCollection mngCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mngCollection.uniqueFieldNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnique(Unique unique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotNull(NotNull notNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notNull, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptions(Options options, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(options, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(foreignKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectMapping(DirectMapping directMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestingList(NestingList nestingList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nestingList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestingObject(NestingObject nestingObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nestingObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldType(FieldType fieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DslValidator
