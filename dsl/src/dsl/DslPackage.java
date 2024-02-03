/**
 */
package dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsl.DslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsl.impl.MigrationImpl <em>Migration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.MigrationImpl
	 * @see dsl.impl.DslPackageImpl#getMigration()
	 * @generated
	 */
	int MIGRATION = 0;

	/**
	 * The feature id for the '<em><b>Relationaldb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__RELATIONALDB = 0;

	/**
	 * The feature id for the '<em><b>Mongodb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__MONGODB = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION__OPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Migration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.MongoDbImpl <em>Mongo Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.MongoDbImpl
	 * @see dsl.impl.DslPackageImpl#getMongoDb()
	 * @generated
	 */
	int MONGO_DB = 1;

	/**
	 * The feature id for the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__DB = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__HOST = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__PORT = 2;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__COLLECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__USERNAME = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB__PASSWORD = 5;

	/**
	 * The number of structural features of the '<em>Mongo Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Unique Collection Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB___UNIQUE_COLLECTION_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Mongo Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsl.impl.RelationalDbImpl <em>Relational Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.RelationalDbImpl
	 * @see dsl.impl.DslPackageImpl#getRelationalDb()
	 * @generated
	 */
	int RELATIONAL_DB = 2;

	/**
	 * The feature id for the '<em><b>Db</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__DB = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__HOST = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__PORT = 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__USERNAME = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB__CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>Relational Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Relational Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_DB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.MngCollectionImpl <em>Mng Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.MngCollectionImpl
	 * @see dsl.impl.DslPackageImpl#getMngCollection()
	 * @generated
	 */
	int MNG_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNG_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNG_COLLECTION__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Mng Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNG_COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Unique Field Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNG_COLLECTION___UNIQUE_FIELD_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Mng Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNG_COLLECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsl.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.TableImpl
	 * @see dsl.impl.DslPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.ColumnImpl
	 * @see dsl.impl.DslPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.FieldImpl
	 * @see dsl.impl.DslPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.MappingImpl
	 * @see dsl.impl.DslPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.ConstraintImpl
	 * @see dsl.impl.DslPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.UniqueImpl
	 * @see dsl.impl.DslPackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Unique Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__UNIQUE_COLUMNS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NotNullImpl <em>Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NotNullImpl
	 * @see dsl.impl.DslPackageImpl#getNotNull()
	 * @generated
	 */
	int NOT_NULL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL__COLUMN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.PrimaryKeyImpl
	 * @see dsl.impl.DslPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Key Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__KEY_COLUMNS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.OptionsImpl
	 * @see dsl.impl.DslPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 12;

	/**
	 * The feature id for the '<em><b>Data Type Migration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__DATA_TYPE_MIGRATION = 0;

	/**
	 * The feature id for the '<em><b>Allow Additional Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__ALLOW_ADDITIONAL_FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.ForeignKeyImpl
	 * @see dsl.impl.DslPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Referencing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCING = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refrenced</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFRENCED = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.DirectMappingImpl <em>Direct Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.DirectMappingImpl
	 * @see dsl.impl.DslPackageImpl#getDirectMapping()
	 * @generated
	 */
	int DIRECT_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MAPPING__NAME = MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MAPPING__OUTPUT = MAPPING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MAPPING__COLUMN = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direct Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NestingListImpl <em>Nesting List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NestingListImpl
	 * @see dsl.impl.DslPackageImpl#getNestingList()
	 * @generated
	 */
	int NESTING_LIST = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST__NAME = MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST__OUTPUT = MAPPING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Foreignkey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST__FOREIGNKEY = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST__COLUMNS = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST__FIELDS = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nesting List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Nesting List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_LIST_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NestingObjectImpl <em>Nesting Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NestingObjectImpl
	 * @see dsl.impl.DslPackageImpl#getNestingObject()
	 * @generated
	 */
	int NESTING_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT__NAME = MAPPING__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT__OUTPUT = MAPPING__OUTPUT;

	/**
	 * The feature id for the '<em><b>Foreignkey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT__FOREIGNKEY = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT__COLUMNS = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT__FIELDS = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nesting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Nesting Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTING_OBJECT_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.FieldType <em>Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.FieldType
	 * @see dsl.impl.DslPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link dsl.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration</em>'.
	 * @see dsl.Migration
	 * @generated
	 */
	EClass getMigration();

	/**
	 * Returns the meta object for the containment reference '{@link dsl.Migration#getRelationaldb <em>Relationaldb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationaldb</em>'.
	 * @see dsl.Migration#getRelationaldb()
	 * @see #getMigration()
	 * @generated
	 */
	EReference getMigration_Relationaldb();

	/**
	 * Returns the meta object for the containment reference '{@link dsl.Migration#getMongodb <em>Mongodb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mongodb</em>'.
	 * @see dsl.Migration#getMongodb()
	 * @see #getMigration()
	 * @generated
	 */
	EReference getMigration_Mongodb();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.Migration#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see dsl.Migration#getMappings()
	 * @see #getMigration()
	 * @generated
	 */
	EReference getMigration_Mappings();

	/**
	 * Returns the meta object for the containment reference '{@link dsl.Migration#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see dsl.Migration#getOptions()
	 * @see #getMigration()
	 * @generated
	 */
	EReference getMigration_Options();

	/**
	 * Returns the meta object for class '{@link dsl.MongoDb <em>Mongo Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Db</em>'.
	 * @see dsl.MongoDb
	 * @generated
	 */
	EClass getMongoDb();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MongoDb#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db</em>'.
	 * @see dsl.MongoDb#getDb()
	 * @see #getMongoDb()
	 * @generated
	 */
	EAttribute getMongoDb_Db();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MongoDb#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see dsl.MongoDb#getHost()
	 * @see #getMongoDb()
	 * @generated
	 */
	EAttribute getMongoDb_Host();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MongoDb#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see dsl.MongoDb#getPort()
	 * @see #getMongoDb()
	 * @generated
	 */
	EAttribute getMongoDb_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.MongoDb#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see dsl.MongoDb#getCollections()
	 * @see #getMongoDb()
	 * @generated
	 */
	EReference getMongoDb_Collections();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MongoDb#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see dsl.MongoDb#getUsername()
	 * @see #getMongoDb()
	 * @generated
	 */
	EAttribute getMongoDb_Username();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MongoDb#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see dsl.MongoDb#getPassword()
	 * @see #getMongoDb()
	 * @generated
	 */
	EAttribute getMongoDb_Password();

	/**
	 * Returns the meta object for the '{@link dsl.MongoDb#uniqueCollectionNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Collection Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Collection Names</em>' operation.
	 * @see dsl.MongoDb#uniqueCollectionNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMongoDb__UniqueCollectionNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsl.RelationalDb <em>Relational Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Db</em>'.
	 * @see dsl.RelationalDb
	 * @generated
	 */
	EClass getRelationalDb();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RelationalDb#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db</em>'.
	 * @see dsl.RelationalDb#getDb()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EAttribute getRelationalDb_Db();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RelationalDb#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see dsl.RelationalDb#getHost()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EAttribute getRelationalDb_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.RelationalDb#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see dsl.RelationalDb#getTables()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EReference getRelationalDb_Tables();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RelationalDb#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see dsl.RelationalDb#getPort()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EAttribute getRelationalDb_Port();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RelationalDb#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see dsl.RelationalDb#getUsername()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EAttribute getRelationalDb_Username();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RelationalDb#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see dsl.RelationalDb#getPassword()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EAttribute getRelationalDb_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.RelationalDb#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see dsl.RelationalDb#getConstraints()
	 * @see #getRelationalDb()
	 * @generated
	 */
	EReference getRelationalDb_Constraints();

	/**
	 * Returns the meta object for class '{@link dsl.MngCollection <em>Mng Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mng Collection</em>'.
	 * @see dsl.MngCollection
	 * @generated
	 */
	EClass getMngCollection();

	/**
	 * Returns the meta object for the attribute '{@link dsl.MngCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.MngCollection#getName()
	 * @see #getMngCollection()
	 * @generated
	 */
	EAttribute getMngCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.MngCollection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see dsl.MngCollection#getFields()
	 * @see #getMngCollection()
	 * @generated
	 */
	EReference getMngCollection_Fields();

	/**
	 * Returns the meta object for the '{@link dsl.MngCollection#uniqueFieldNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Field Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Field Names</em>' operation.
	 * @see dsl.MngCollection#uniqueFieldNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMngCollection__UniqueFieldNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsl.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see dsl.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see dsl.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link dsl.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see dsl.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for class '{@link dsl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see dsl.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.Field#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see dsl.Field#getFields()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Fields();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsl.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link dsl.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see dsl.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Mapping#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see dsl.Mapping#getOutput()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Output();

	/**
	 * Returns the meta object for class '{@link dsl.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see dsl.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the reference list '{@link dsl.Unique#getUniqueColumns <em>Unique Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unique Columns</em>'.
	 * @see dsl.Unique#getUniqueColumns()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_UniqueColumns();

	/**
	 * Returns the meta object for class '{@link dsl.NotNull <em>Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null</em>'.
	 * @see dsl.NotNull
	 * @generated
	 */
	EClass getNotNull();

	/**
	 * Returns the meta object for the reference '{@link dsl.NotNull#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see dsl.NotNull#getColumn()
	 * @see #getNotNull()
	 * @generated
	 */
	EReference getNotNull_Column();

	/**
	 * Returns the meta object for class '{@link dsl.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see dsl.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference list '{@link dsl.PrimaryKey#getKeyColumns <em>Key Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Columns</em>'.
	 * @see dsl.PrimaryKey#getKeyColumns()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_KeyColumns();

	/**
	 * Returns the meta object for class '{@link dsl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see dsl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link dsl.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see dsl.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Options#isDataTypeMigration <em>Data Type Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Migration</em>'.
	 * @see dsl.Options#isDataTypeMigration()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_DataTypeMigration();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Options#isAllowAdditionalFields <em>Allow Additional Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Additional Fields</em>'.
	 * @see dsl.Options#isAllowAdditionalFields()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_AllowAdditionalFields();

	/**
	 * Returns the meta object for class '{@link dsl.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see dsl.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference list '{@link dsl.ForeignKey#getReferencing <em>Referencing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing</em>'.
	 * @see dsl.ForeignKey#getReferencing()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Referencing();

	/**
	 * Returns the meta object for the reference list '{@link dsl.ForeignKey#getRefrenced <em>Refrenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refrenced</em>'.
	 * @see dsl.ForeignKey#getRefrenced()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Refrenced();

	/**
	 * Returns the meta object for class '{@link dsl.DirectMapping <em>Direct Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Mapping</em>'.
	 * @see dsl.DirectMapping
	 * @generated
	 */
	EClass getDirectMapping();

	/**
	 * Returns the meta object for the reference '{@link dsl.DirectMapping#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see dsl.DirectMapping#getColumn()
	 * @see #getDirectMapping()
	 * @generated
	 */
	EReference getDirectMapping_Column();

	/**
	 * Returns the meta object for class '{@link dsl.NestingList <em>Nesting List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nesting List</em>'.
	 * @see dsl.NestingList
	 * @generated
	 */
	EClass getNestingList();

	/**
	 * Returns the meta object for the reference '{@link dsl.NestingList#getForeignkey <em>Foreignkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreignkey</em>'.
	 * @see dsl.NestingList#getForeignkey()
	 * @see #getNestingList()
	 * @generated
	 */
	EReference getNestingList_Foreignkey();

	/**
	 * Returns the meta object for the reference list '{@link dsl.NestingList#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see dsl.NestingList#getColumns()
	 * @see #getNestingList()
	 * @generated
	 */
	EReference getNestingList_Columns();

	/**
	 * Returns the meta object for the reference list '{@link dsl.NestingList#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see dsl.NestingList#getFields()
	 * @see #getNestingList()
	 * @generated
	 */
	EReference getNestingList_Fields();

	/**
	 * Returns the meta object for class '{@link dsl.NestingObject <em>Nesting Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nesting Object</em>'.
	 * @see dsl.NestingObject
	 * @generated
	 */
	EClass getNestingObject();

	/**
	 * Returns the meta object for the reference '{@link dsl.NestingObject#getForeignkey <em>Foreignkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreignkey</em>'.
	 * @see dsl.NestingObject#getForeignkey()
	 * @see #getNestingObject()
	 * @generated
	 */
	EReference getNestingObject_Foreignkey();

	/**
	 * Returns the meta object for the reference list '{@link dsl.NestingObject#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see dsl.NestingObject#getColumns()
	 * @see #getNestingObject()
	 * @generated
	 */
	EReference getNestingObject_Columns();

	/**
	 * Returns the meta object for the reference list '{@link dsl.NestingObject#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see dsl.NestingObject#getFields()
	 * @see #getNestingObject()
	 * @generated
	 */
	EReference getNestingObject_Fields();

	/**
	 * Returns the meta object for enum '{@link dsl.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Type</em>'.
	 * @see dsl.FieldType
	 * @generated
	 */
	EEnum getFieldType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsl.impl.MigrationImpl <em>Migration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.MigrationImpl
		 * @see dsl.impl.DslPackageImpl#getMigration()
		 * @generated
		 */
		EClass MIGRATION = eINSTANCE.getMigration();

		/**
		 * The meta object literal for the '<em><b>Relationaldb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION__RELATIONALDB = eINSTANCE.getMigration_Relationaldb();

		/**
		 * The meta object literal for the '<em><b>Mongodb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION__MONGODB = eINSTANCE.getMigration_Mongodb();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION__MAPPINGS = eINSTANCE.getMigration_Mappings();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION__OPTIONS = eINSTANCE.getMigration_Options();

		/**
		 * The meta object literal for the '{@link dsl.impl.MongoDbImpl <em>Mongo Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.MongoDbImpl
		 * @see dsl.impl.DslPackageImpl#getMongoDb()
		 * @generated
		 */
		EClass MONGO_DB = eINSTANCE.getMongoDb();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__DB = eINSTANCE.getMongoDb_Db();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__HOST = eINSTANCE.getMongoDb_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__PORT = eINSTANCE.getMongoDb_Port();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONGO_DB__COLLECTIONS = eINSTANCE.getMongoDb_Collections();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__USERNAME = eINSTANCE.getMongoDb_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB__PASSWORD = eINSTANCE.getMongoDb_Password();

		/**
		 * The meta object literal for the '<em><b>Unique Collection Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MONGO_DB___UNIQUE_COLLECTION_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMongoDb__UniqueCollectionNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsl.impl.RelationalDbImpl <em>Relational Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.RelationalDbImpl
		 * @see dsl.impl.DslPackageImpl#getRelationalDb()
		 * @generated
		 */
		EClass RELATIONAL_DB = eINSTANCE.getRelationalDb();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__DB = eINSTANCE.getRelationalDb_Db();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__HOST = eINSTANCE.getRelationalDb_Host();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_DB__TABLES = eINSTANCE.getRelationalDb_Tables();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__PORT = eINSTANCE.getRelationalDb_Port();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__USERNAME = eINSTANCE.getRelationalDb_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_DB__PASSWORD = eINSTANCE.getRelationalDb_Password();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_DB__CONSTRAINTS = eINSTANCE.getRelationalDb_Constraints();

		/**
		 * The meta object literal for the '{@link dsl.impl.MngCollectionImpl <em>Mng Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.MngCollectionImpl
		 * @see dsl.impl.DslPackageImpl#getMngCollection()
		 * @generated
		 */
		EClass MNG_COLLECTION = eINSTANCE.getMngCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MNG_COLLECTION__NAME = eINSTANCE.getMngCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MNG_COLLECTION__FIELDS = eINSTANCE.getMngCollection_Fields();

		/**
		 * The meta object literal for the '<em><b>Unique Field Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MNG_COLLECTION___UNIQUE_FIELD_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMngCollection__UniqueFieldNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsl.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.TableImpl
		 * @see dsl.impl.DslPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link dsl.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.ColumnImpl
		 * @see dsl.impl.DslPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '{@link dsl.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.FieldImpl
		 * @see dsl.impl.DslPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FIELDS = eINSTANCE.getField_Fields();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link dsl.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.MappingImpl
		 * @see dsl.impl.DslPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__OUTPUT = eINSTANCE.getMapping_Output();

		/**
		 * The meta object literal for the '{@link dsl.impl.UniqueImpl <em>Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.UniqueImpl
		 * @see dsl.impl.DslPackageImpl#getUnique()
		 * @generated
		 */
		EClass UNIQUE = eINSTANCE.getUnique();

		/**
		 * The meta object literal for the '<em><b>Unique Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE__UNIQUE_COLUMNS = eINSTANCE.getUnique_UniqueColumns();

		/**
		 * The meta object literal for the '{@link dsl.impl.NotNullImpl <em>Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NotNullImpl
		 * @see dsl.impl.DslPackageImpl#getNotNull()
		 * @generated
		 */
		EClass NOT_NULL = eINSTANCE.getNotNull();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_NULL__COLUMN = eINSTANCE.getNotNull_Column();

		/**
		 * The meta object literal for the '{@link dsl.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.PrimaryKeyImpl
		 * @see dsl.impl.DslPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Key Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__KEY_COLUMNS = eINSTANCE.getPrimaryKey_KeyColumns();

		/**
		 * The meta object literal for the '{@link dsl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.ConstraintImpl
		 * @see dsl.impl.DslPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link dsl.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.OptionsImpl
		 * @see dsl.impl.DslPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Data Type Migration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__DATA_TYPE_MIGRATION = eINSTANCE.getOptions_DataTypeMigration();

		/**
		 * The meta object literal for the '<em><b>Allow Additional Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__ALLOW_ADDITIONAL_FIELDS = eINSTANCE.getOptions_AllowAdditionalFields();

		/**
		 * The meta object literal for the '{@link dsl.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.ForeignKeyImpl
		 * @see dsl.impl.DslPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Referencing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCING = eINSTANCE.getForeignKey_Referencing();

		/**
		 * The meta object literal for the '<em><b>Refrenced</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFRENCED = eINSTANCE.getForeignKey_Refrenced();

		/**
		 * The meta object literal for the '{@link dsl.impl.DirectMappingImpl <em>Direct Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.DirectMappingImpl
		 * @see dsl.impl.DslPackageImpl#getDirectMapping()
		 * @generated
		 */
		EClass DIRECT_MAPPING = eINSTANCE.getDirectMapping();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_MAPPING__COLUMN = eINSTANCE.getDirectMapping_Column();

		/**
		 * The meta object literal for the '{@link dsl.impl.NestingListImpl <em>Nesting List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NestingListImpl
		 * @see dsl.impl.DslPackageImpl#getNestingList()
		 * @generated
		 */
		EClass NESTING_LIST = eINSTANCE.getNestingList();

		/**
		 * The meta object literal for the '<em><b>Foreignkey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_LIST__FOREIGNKEY = eINSTANCE.getNestingList_Foreignkey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_LIST__COLUMNS = eINSTANCE.getNestingList_Columns();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_LIST__FIELDS = eINSTANCE.getNestingList_Fields();

		/**
		 * The meta object literal for the '{@link dsl.impl.NestingObjectImpl <em>Nesting Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NestingObjectImpl
		 * @see dsl.impl.DslPackageImpl#getNestingObject()
		 * @generated
		 */
		EClass NESTING_OBJECT = eINSTANCE.getNestingObject();

		/**
		 * The meta object literal for the '<em><b>Foreignkey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_OBJECT__FOREIGNKEY = eINSTANCE.getNestingObject_Foreignkey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_OBJECT__COLUMNS = eINSTANCE.getNestingObject_Columns();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTING_OBJECT__FIELDS = eINSTANCE.getNestingObject_Fields();

		/**
		 * The meta object literal for the '{@link dsl.FieldType <em>Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.FieldType
		 * @see dsl.impl.DslPackageImpl#getFieldType()
		 * @generated
		 */
		EEnum FIELD_TYPE = eINSTANCE.getFieldType();

	}

} //DslPackage
