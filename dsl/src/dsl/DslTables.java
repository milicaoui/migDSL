/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /dsl/model/dsl.ecore
 * using:
 *   /dsl/model/dsl.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package dsl;

// import dsl.DslPackage;
// import dsl.DslTables;
import java.lang.String;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DslTables provides the dispatch tables for the dsl for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DslTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DslPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_dsl = IdManager.getNsURIPackageId("http://www.example.org/dsl", null, DslPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Column = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Column", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Constraint = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Constraint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DirectMapping = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("DirectMapping", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Field = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Field", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ForeignKey = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("ForeignKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Mapping = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Mapping", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Migration = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Migration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MngCollection = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("MngCollection", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MongoDb = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("MongoDb", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NestingList = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("NestingList", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NestingObject = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("NestingObject", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NotNull = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("NotNull", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Options = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Options", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrimaryKey = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("PrimaryKey", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RelationalDb = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("RelationalDb", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Table", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Unique = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getClassId("Unique", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_FieldType = DslTables.PACKid_http_c_s_s_www_example_org_s_dsl.getEnumerationId("FieldType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR_Collection_32_names_32_inside_32_MongoDb_32_must_32_be_32_unique = "Collection names inside MongoDb must be unique";
	public static final /*@NonInvalid*/ String STR_Field_32_names_32_inside_32_document_32_must_32_be_32_unique = "Field names inside document must be unique";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DirectMapping = TypeId.BAG.getSpecializedId(DslTables.CLSSid_DirectMapping);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ForeignKey = TypeId.BAG.getSpecializedId(DslTables.CLSSid_ForeignKey);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NestingList = TypeId.BAG.getSpecializedId(DslTables.CLSSid_NestingList);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NestingObject = TypeId.BAG.getSpecializedId(DslTables.CLSSid_NestingObject);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NotNull = TypeId.BAG.getSpecializedId(DslTables.CLSSid_NotNull);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PrimaryKey = TypeId.BAG.getSpecializedId(DslTables.CLSSid_PrimaryKey);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Unique = TypeId.BAG.getSpecializedId(DslTables.CLSSid_Unique);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Column = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_Column);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Constraint = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Field = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_Field);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Mapping = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_Mapping);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MngCollection = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_MngCollection);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Table = TypeId.ORDERED_SET.getSpecializedId(DslTables.CLSSid_Table);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", DslTables.PARTid_, DslTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DslTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Column = new EcoreExecutorType(DslPackage.Literals.COLUMN, PACKAGE, 0);
		public static final EcoreExecutorType _Constraint = new EcoreExecutorType(DslPackage.Literals.CONSTRAINT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DirectMapping = new EcoreExecutorType(DslPackage.Literals.DIRECT_MAPPING, PACKAGE, 0);
		public static final EcoreExecutorType _Field = new EcoreExecutorType(DslPackage.Literals.FIELD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _FieldType = new EcoreExecutorEnumeration(DslPackage.Literals.FIELD_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ForeignKey = new EcoreExecutorType(DslPackage.Literals.FOREIGN_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _Mapping = new EcoreExecutorType(DslPackage.Literals.MAPPING, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Migration = new EcoreExecutorType(DslPackage.Literals.MIGRATION, PACKAGE, 0);
		public static final EcoreExecutorType _MngCollection = new EcoreExecutorType(DslPackage.Literals.MNG_COLLECTION, PACKAGE, 0);
		public static final EcoreExecutorType _MongoDb = new EcoreExecutorType(DslPackage.Literals.MONGO_DB, PACKAGE, 0);
		public static final EcoreExecutorType _NestingList = new EcoreExecutorType(DslPackage.Literals.NESTING_LIST, PACKAGE, 0);
		public static final EcoreExecutorType _NestingObject = new EcoreExecutorType(DslPackage.Literals.NESTING_OBJECT, PACKAGE, 0);
		public static final EcoreExecutorType _NotNull = new EcoreExecutorType(DslPackage.Literals.NOT_NULL, PACKAGE, 0);
		public static final EcoreExecutorType _Options = new EcoreExecutorType(DslPackage.Literals.OPTIONS, PACKAGE, 0);
		public static final EcoreExecutorType _PrimaryKey = new EcoreExecutorType(DslPackage.Literals.PRIMARY_KEY, PACKAGE, 0);
		public static final EcoreExecutorType _RelationalDb = new EcoreExecutorType(DslPackage.Literals.RELATIONAL_DB, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(DslPackage.Literals.TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Unique = new EcoreExecutorType(DslPackage.Literals.UNIQUE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Column,
			_Constraint,
			_DirectMapping,
			_Field,
			_FieldType,
			_ForeignKey,
			_Mapping,
			_Migration,
			_MngCollection,
			_MongoDb,
			_NestingList,
			_NestingObject,
			_NotNull,
			_Options,
			_PrimaryKey,
			_RelationalDb,
			_Table,
			_Unique
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Column__Column = new ExecutorFragment(Types._Column, DslTables.Types._Column);
		private static final ExecutorFragment _Column__OclAny = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Column__OclElement = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, DslTables.Types._Constraint);
		private static final ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DirectMapping__DirectMapping = new ExecutorFragment(Types._DirectMapping, DslTables.Types._DirectMapping);
		private static final ExecutorFragment _DirectMapping__Mapping = new ExecutorFragment(Types._DirectMapping, DslTables.Types._Mapping);
		private static final ExecutorFragment _DirectMapping__OclAny = new ExecutorFragment(Types._DirectMapping, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DirectMapping__OclElement = new ExecutorFragment(Types._DirectMapping, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Field__Field = new ExecutorFragment(Types._Field, DslTables.Types._Field);
		private static final ExecutorFragment _Field__OclAny = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Field__OclElement = new ExecutorFragment(Types._Field, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FieldType__FieldType = new ExecutorFragment(Types._FieldType, DslTables.Types._FieldType);
		private static final ExecutorFragment _FieldType__OclAny = new ExecutorFragment(Types._FieldType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FieldType__OclElement = new ExecutorFragment(Types._FieldType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FieldType__OclEnumeration = new ExecutorFragment(Types._FieldType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _FieldType__OclType = new ExecutorFragment(Types._FieldType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ForeignKey__Constraint = new ExecutorFragment(Types._ForeignKey, DslTables.Types._Constraint);
		private static final ExecutorFragment _ForeignKey__ForeignKey = new ExecutorFragment(Types._ForeignKey, DslTables.Types._ForeignKey);
		private static final ExecutorFragment _ForeignKey__OclAny = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ForeignKey__OclElement = new ExecutorFragment(Types._ForeignKey, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Mapping__Mapping = new ExecutorFragment(Types._Mapping, DslTables.Types._Mapping);
		private static final ExecutorFragment _Mapping__OclAny = new ExecutorFragment(Types._Mapping, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mapping__OclElement = new ExecutorFragment(Types._Mapping, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Migration__Migration = new ExecutorFragment(Types._Migration, DslTables.Types._Migration);
		private static final ExecutorFragment _Migration__OclAny = new ExecutorFragment(Types._Migration, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Migration__OclElement = new ExecutorFragment(Types._Migration, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MngCollection__MngCollection = new ExecutorFragment(Types._MngCollection, DslTables.Types._MngCollection);
		private static final ExecutorFragment _MngCollection__OclAny = new ExecutorFragment(Types._MngCollection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MngCollection__OclElement = new ExecutorFragment(Types._MngCollection, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MongoDb__MongoDb = new ExecutorFragment(Types._MongoDb, DslTables.Types._MongoDb);
		private static final ExecutorFragment _MongoDb__OclAny = new ExecutorFragment(Types._MongoDb, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MongoDb__OclElement = new ExecutorFragment(Types._MongoDb, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NestingList__Mapping = new ExecutorFragment(Types._NestingList, DslTables.Types._Mapping);
		private static final ExecutorFragment _NestingList__NestingList = new ExecutorFragment(Types._NestingList, DslTables.Types._NestingList);
		private static final ExecutorFragment _NestingList__OclAny = new ExecutorFragment(Types._NestingList, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NestingList__OclElement = new ExecutorFragment(Types._NestingList, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NestingObject__Mapping = new ExecutorFragment(Types._NestingObject, DslTables.Types._Mapping);
		private static final ExecutorFragment _NestingObject__NestingObject = new ExecutorFragment(Types._NestingObject, DslTables.Types._NestingObject);
		private static final ExecutorFragment _NestingObject__OclAny = new ExecutorFragment(Types._NestingObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NestingObject__OclElement = new ExecutorFragment(Types._NestingObject, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NotNull__Constraint = new ExecutorFragment(Types._NotNull, DslTables.Types._Constraint);
		private static final ExecutorFragment _NotNull__NotNull = new ExecutorFragment(Types._NotNull, DslTables.Types._NotNull);
		private static final ExecutorFragment _NotNull__OclAny = new ExecutorFragment(Types._NotNull, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NotNull__OclElement = new ExecutorFragment(Types._NotNull, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Options__OclAny = new ExecutorFragment(Types._Options, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Options__OclElement = new ExecutorFragment(Types._Options, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Options__Options = new ExecutorFragment(Types._Options, DslTables.Types._Options);

		private static final ExecutorFragment _PrimaryKey__Constraint = new ExecutorFragment(Types._PrimaryKey, DslTables.Types._Constraint);
		private static final ExecutorFragment _PrimaryKey__OclAny = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrimaryKey__OclElement = new ExecutorFragment(Types._PrimaryKey, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrimaryKey__PrimaryKey = new ExecutorFragment(Types._PrimaryKey, DslTables.Types._PrimaryKey);

		private static final ExecutorFragment _RelationalDb__OclAny = new ExecutorFragment(Types._RelationalDb, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RelationalDb__OclElement = new ExecutorFragment(Types._RelationalDb, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RelationalDb__RelationalDb = new ExecutorFragment(Types._RelationalDb, DslTables.Types._RelationalDb);

		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, DslTables.Types._Table);

		private static final ExecutorFragment _Unique__Constraint = new ExecutorFragment(Types._Unique, DslTables.Types._Constraint);
		private static final ExecutorFragment _Unique__OclAny = new ExecutorFragment(Types._Unique, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Unique__OclElement = new ExecutorFragment(Types._Unique, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Unique__Unique = new ExecutorFragment(Types._Unique, DslTables.Types._Unique);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Column__name = new EcoreExecutorProperty(DslPackage.Literals.COLUMN__NAME, Types._Column, 0);
		public static final ExecutorProperty _Column__DirectMapping__column = new ExecutorPropertyWithImplementation("DirectMapping", Types._Column, 1, new EcoreLibraryOppositeProperty(DslPackage.Literals.DIRECT_MAPPING__COLUMN));
		public static final ExecutorProperty _Column__ForeignKey__referencing = new ExecutorPropertyWithImplementation("ForeignKey", Types._Column, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.FOREIGN_KEY__REFERENCING));
		public static final ExecutorProperty _Column__ForeignKey__refrenced = new ExecutorPropertyWithImplementation("ForeignKey", Types._Column, 3, new EcoreLibraryOppositeProperty(DslPackage.Literals.FOREIGN_KEY__REFRENCED));
		public static final ExecutorProperty _Column__NestingList__columns = new ExecutorPropertyWithImplementation("NestingList", Types._Column, 4, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_LIST__COLUMNS));
		public static final ExecutorProperty _Column__NestingObject__columns = new ExecutorPropertyWithImplementation("NestingObject", Types._Column, 5, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_OBJECT__COLUMNS));
		public static final ExecutorProperty _Column__NotNull__column = new ExecutorPropertyWithImplementation("NotNull", Types._Column, 6, new EcoreLibraryOppositeProperty(DslPackage.Literals.NOT_NULL__COLUMN));
		public static final ExecutorProperty _Column__PrimaryKey__keyColumns = new ExecutorPropertyWithImplementation("PrimaryKey", Types._Column, 7, new EcoreLibraryOppositeProperty(DslPackage.Literals.PRIMARY_KEY__KEY_COLUMNS));
		public static final ExecutorProperty _Column__Table__columns = new ExecutorPropertyWithImplementation("Table", Types._Column, 8, new EcoreLibraryOppositeProperty(DslPackage.Literals.TABLE__COLUMNS));
		public static final ExecutorProperty _Column__Unique__uniqueColumns = new ExecutorPropertyWithImplementation("Unique", Types._Column, 9, new EcoreLibraryOppositeProperty(DslPackage.Literals.UNIQUE__UNIQUE_COLUMNS));

		public static final ExecutorProperty _Constraint__name = new EcoreExecutorProperty(DslPackage.Literals.CONSTRAINT__NAME, Types._Constraint, 0);
		public static final ExecutorProperty _Constraint__RelationalDb__constraints = new ExecutorPropertyWithImplementation("RelationalDb", Types._Constraint, 1, new EcoreLibraryOppositeProperty(DslPackage.Literals.RELATIONAL_DB__CONSTRAINTS));

		public static final ExecutorProperty _DirectMapping__column = new EcoreExecutorProperty(DslPackage.Literals.DIRECT_MAPPING__COLUMN, Types._DirectMapping, 0);

		public static final ExecutorProperty _Field__fields = new EcoreExecutorProperty(DslPackage.Literals.FIELD__FIELDS, Types._Field, 0);
		public static final ExecutorProperty _Field__name = new EcoreExecutorProperty(DslPackage.Literals.FIELD__NAME, Types._Field, 1);
		public static final ExecutorProperty _Field__type = new EcoreExecutorProperty(DslPackage.Literals.FIELD__TYPE, Types._Field, 2);
		public static final ExecutorProperty _Field__Field__fields = new ExecutorPropertyWithImplementation("Field", Types._Field, 3, new EcoreLibraryOppositeProperty(DslPackage.Literals.FIELD__FIELDS));
		public static final ExecutorProperty _Field__MngCollection__fields = new ExecutorPropertyWithImplementation("MngCollection", Types._Field, 4, new EcoreLibraryOppositeProperty(DslPackage.Literals.MNG_COLLECTION__FIELDS));
		public static final ExecutorProperty _Field__NestingList__fields = new ExecutorPropertyWithImplementation("NestingList", Types._Field, 5, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_LIST__FIELDS));
		public static final ExecutorProperty _Field__NestingObject__fields = new ExecutorPropertyWithImplementation("NestingObject", Types._Field, 6, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_OBJECT__FIELDS));

		public static final ExecutorProperty _ForeignKey__referencing = new EcoreExecutorProperty(DslPackage.Literals.FOREIGN_KEY__REFERENCING, Types._ForeignKey, 0);
		public static final ExecutorProperty _ForeignKey__refrenced = new EcoreExecutorProperty(DslPackage.Literals.FOREIGN_KEY__REFRENCED, Types._ForeignKey, 1);
		public static final ExecutorProperty _ForeignKey__NestingList__foreignkey = new ExecutorPropertyWithImplementation("NestingList", Types._ForeignKey, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_LIST__FOREIGNKEY));
		public static final ExecutorProperty _ForeignKey__NestingObject__foreignkey = new ExecutorPropertyWithImplementation("NestingObject", Types._ForeignKey, 3, new EcoreLibraryOppositeProperty(DslPackage.Literals.NESTING_OBJECT__FOREIGNKEY));

		public static final ExecutorProperty _Mapping__name = new EcoreExecutorProperty(DslPackage.Literals.MAPPING__NAME, Types._Mapping, 0);
		public static final ExecutorProperty _Mapping__output = new EcoreExecutorProperty(DslPackage.Literals.MAPPING__OUTPUT, Types._Mapping, 1);
		public static final ExecutorProperty _Mapping__Migration__mappings = new ExecutorPropertyWithImplementation("Migration", Types._Mapping, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.MIGRATION__MAPPINGS));

		public static final ExecutorProperty _Migration__mappings = new EcoreExecutorProperty(DslPackage.Literals.MIGRATION__MAPPINGS, Types._Migration, 0);
		public static final ExecutorProperty _Migration__mongodb = new EcoreExecutorProperty(DslPackage.Literals.MIGRATION__MONGODB, Types._Migration, 1);
		public static final ExecutorProperty _Migration__options = new EcoreExecutorProperty(DslPackage.Literals.MIGRATION__OPTIONS, Types._Migration, 2);
		public static final ExecutorProperty _Migration__relationaldb = new EcoreExecutorProperty(DslPackage.Literals.MIGRATION__RELATIONALDB, Types._Migration, 3);

		public static final ExecutorProperty _MngCollection__fields = new EcoreExecutorProperty(DslPackage.Literals.MNG_COLLECTION__FIELDS, Types._MngCollection, 0);
		public static final ExecutorProperty _MngCollection__name = new EcoreExecutorProperty(DslPackage.Literals.MNG_COLLECTION__NAME, Types._MngCollection, 1);
		public static final ExecutorProperty _MngCollection__MongoDb__collections = new ExecutorPropertyWithImplementation("MongoDb", Types._MngCollection, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.MONGO_DB__COLLECTIONS));

		public static final ExecutorProperty _MongoDb__collections = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__COLLECTIONS, Types._MongoDb, 0);
		public static final ExecutorProperty _MongoDb__db = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__DB, Types._MongoDb, 1);
		public static final ExecutorProperty _MongoDb__host = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__HOST, Types._MongoDb, 2);
		public static final ExecutorProperty _MongoDb__password = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__PASSWORD, Types._MongoDb, 3);
		public static final ExecutorProperty _MongoDb__port = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__PORT, Types._MongoDb, 4);
		public static final ExecutorProperty _MongoDb__username = new EcoreExecutorProperty(DslPackage.Literals.MONGO_DB__USERNAME, Types._MongoDb, 5);
		public static final ExecutorProperty _MongoDb__Migration__mongodb = new ExecutorPropertyWithImplementation("Migration", Types._MongoDb, 6, new EcoreLibraryOppositeProperty(DslPackage.Literals.MIGRATION__MONGODB));

		public static final ExecutorProperty _NestingList__columns = new EcoreExecutorProperty(DslPackage.Literals.NESTING_LIST__COLUMNS, Types._NestingList, 0);
		public static final ExecutorProperty _NestingList__fields = new EcoreExecutorProperty(DslPackage.Literals.NESTING_LIST__FIELDS, Types._NestingList, 1);
		public static final ExecutorProperty _NestingList__foreignkey = new EcoreExecutorProperty(DslPackage.Literals.NESTING_LIST__FOREIGNKEY, Types._NestingList, 2);

		public static final ExecutorProperty _NestingObject__columns = new EcoreExecutorProperty(DslPackage.Literals.NESTING_OBJECT__COLUMNS, Types._NestingObject, 0);
		public static final ExecutorProperty _NestingObject__fields = new EcoreExecutorProperty(DslPackage.Literals.NESTING_OBJECT__FIELDS, Types._NestingObject, 1);
		public static final ExecutorProperty _NestingObject__foreignkey = new EcoreExecutorProperty(DslPackage.Literals.NESTING_OBJECT__FOREIGNKEY, Types._NestingObject, 2);

		public static final ExecutorProperty _NotNull__column = new EcoreExecutorProperty(DslPackage.Literals.NOT_NULL__COLUMN, Types._NotNull, 0);

		public static final ExecutorProperty _Options__AllowAdditionalFields = new EcoreExecutorProperty(DslPackage.Literals.OPTIONS__ALLOW_ADDITIONAL_FIELDS, Types._Options, 0);
		public static final ExecutorProperty _Options__DataTypeMigration = new EcoreExecutorProperty(DslPackage.Literals.OPTIONS__DATA_TYPE_MIGRATION, Types._Options, 1);
		public static final ExecutorProperty _Options__Migration__options = new ExecutorPropertyWithImplementation("Migration", Types._Options, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.MIGRATION__OPTIONS));

		public static final ExecutorProperty _PrimaryKey__keyColumns = new EcoreExecutorProperty(DslPackage.Literals.PRIMARY_KEY__KEY_COLUMNS, Types._PrimaryKey, 0);

		public static final ExecutorProperty _RelationalDb__constraints = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__CONSTRAINTS, Types._RelationalDb, 0);
		public static final ExecutorProperty _RelationalDb__db = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__DB, Types._RelationalDb, 1);
		public static final ExecutorProperty _RelationalDb__host = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__HOST, Types._RelationalDb, 2);
		public static final ExecutorProperty _RelationalDb__password = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__PASSWORD, Types._RelationalDb, 3);
		public static final ExecutorProperty _RelationalDb__port = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__PORT, Types._RelationalDb, 4);
		public static final ExecutorProperty _RelationalDb__tables = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__TABLES, Types._RelationalDb, 5);
		public static final ExecutorProperty _RelationalDb__username = new EcoreExecutorProperty(DslPackage.Literals.RELATIONAL_DB__USERNAME, Types._RelationalDb, 6);
		public static final ExecutorProperty _RelationalDb__Migration__relationaldb = new ExecutorPropertyWithImplementation("Migration", Types._RelationalDb, 7, new EcoreLibraryOppositeProperty(DslPackage.Literals.MIGRATION__RELATIONALDB));

		public static final ExecutorProperty _Table__columns = new EcoreExecutorProperty(DslPackage.Literals.TABLE__COLUMNS, Types._Table, 0);
		public static final ExecutorProperty _Table__name = new EcoreExecutorProperty(DslPackage.Literals.TABLE__NAME, Types._Table, 1);
		public static final ExecutorProperty _Table__RelationalDb__tables = new ExecutorPropertyWithImplementation("RelationalDb", Types._Table, 2, new EcoreLibraryOppositeProperty(DslPackage.Literals.RELATIONAL_DB__TABLES));

		public static final ExecutorProperty _Unique__uniqueColumns = new EcoreExecutorProperty(DslPackage.Literals.UNIQUE__UNIQUE_COLUMNS, Types._Unique, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Column =
			{
				Fragments._Column__OclAny /* 0 */,
				Fragments._Column__OclElement /* 1 */,
				Fragments._Column__Column /* 2 */
			};
		private static final int /*@NonNull*/ [] __Column = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Constraint =
			{
				Fragments._Constraint__OclAny /* 0 */,
				Fragments._Constraint__OclElement /* 1 */,
				Fragments._Constraint__Constraint /* 2 */
			};
		private static final int /*@NonNull*/ [] __Constraint = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DirectMapping =
			{
				Fragments._DirectMapping__OclAny /* 0 */,
				Fragments._DirectMapping__OclElement /* 1 */,
				Fragments._DirectMapping__Mapping /* 2 */,
				Fragments._DirectMapping__DirectMapping /* 3 */
			};
		private static final int /*@NonNull*/ [] __DirectMapping = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Field =
			{
				Fragments._Field__OclAny /* 0 */,
				Fragments._Field__OclElement /* 1 */,
				Fragments._Field__Field /* 2 */
			};
		private static final int /*@NonNull*/ [] __Field = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FieldType =
			{
				Fragments._FieldType__OclAny /* 0 */,
				Fragments._FieldType__OclElement /* 1 */,
				Fragments._FieldType__OclType /* 2 */,
				Fragments._FieldType__OclEnumeration /* 3 */,
				Fragments._FieldType__FieldType /* 4 */
			};
		private static final int /*@NonNull*/ [] __FieldType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ForeignKey =
			{
				Fragments._ForeignKey__OclAny /* 0 */,
				Fragments._ForeignKey__OclElement /* 1 */,
				Fragments._ForeignKey__Constraint /* 2 */,
				Fragments._ForeignKey__ForeignKey /* 3 */
			};
		private static final int /*@NonNull*/ [] __ForeignKey = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mapping =
			{
				Fragments._Mapping__OclAny /* 0 */,
				Fragments._Mapping__OclElement /* 1 */,
				Fragments._Mapping__Mapping /* 2 */
			};
		private static final int /*@NonNull*/ [] __Mapping = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Migration =
			{
				Fragments._Migration__OclAny /* 0 */,
				Fragments._Migration__OclElement /* 1 */,
				Fragments._Migration__Migration /* 2 */
			};
		private static final int /*@NonNull*/ [] __Migration = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MngCollection =
			{
				Fragments._MngCollection__OclAny /* 0 */,
				Fragments._MngCollection__OclElement /* 1 */,
				Fragments._MngCollection__MngCollection /* 2 */
			};
		private static final int /*@NonNull*/ [] __MngCollection = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MongoDb =
			{
				Fragments._MongoDb__OclAny /* 0 */,
				Fragments._MongoDb__OclElement /* 1 */,
				Fragments._MongoDb__MongoDb /* 2 */
			};
		private static final int /*@NonNull*/ [] __MongoDb = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NestingList =
			{
				Fragments._NestingList__OclAny /* 0 */,
				Fragments._NestingList__OclElement /* 1 */,
				Fragments._NestingList__Mapping /* 2 */,
				Fragments._NestingList__NestingList /* 3 */
			};
		private static final int /*@NonNull*/ [] __NestingList = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NestingObject =
			{
				Fragments._NestingObject__OclAny /* 0 */,
				Fragments._NestingObject__OclElement /* 1 */,
				Fragments._NestingObject__Mapping /* 2 */,
				Fragments._NestingObject__NestingObject /* 3 */
			};
		private static final int /*@NonNull*/ [] __NestingObject = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NotNull =
			{
				Fragments._NotNull__OclAny /* 0 */,
				Fragments._NotNull__OclElement /* 1 */,
				Fragments._NotNull__Constraint /* 2 */,
				Fragments._NotNull__NotNull /* 3 */
			};
		private static final int /*@NonNull*/ [] __NotNull = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Options =
			{
				Fragments._Options__OclAny /* 0 */,
				Fragments._Options__OclElement /* 1 */,
				Fragments._Options__Options /* 2 */
			};
		private static final int /*@NonNull*/ [] __Options = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrimaryKey =
			{
				Fragments._PrimaryKey__OclAny /* 0 */,
				Fragments._PrimaryKey__OclElement /* 1 */,
				Fragments._PrimaryKey__Constraint /* 2 */,
				Fragments._PrimaryKey__PrimaryKey /* 3 */
			};
		private static final int /*@NonNull*/ [] __PrimaryKey = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RelationalDb =
			{
				Fragments._RelationalDb__OclAny /* 0 */,
				Fragments._RelationalDb__OclElement /* 1 */,
				Fragments._RelationalDb__RelationalDb /* 2 */
			};
		private static final int /*@NonNull*/ [] __RelationalDb = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__Table /* 2 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Unique =
			{
				Fragments._Unique__OclAny /* 0 */,
				Fragments._Unique__OclElement /* 1 */,
				Fragments._Unique__Constraint /* 2 */,
				Fragments._Unique__Unique /* 3 */
			};
		private static final int /*@NonNull*/ [] __Unique = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Column.initFragments(_Column, __Column);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._DirectMapping.initFragments(_DirectMapping, __DirectMapping);
			Types._Field.initFragments(_Field, __Field);
			Types._FieldType.initFragments(_FieldType, __FieldType);
			Types._ForeignKey.initFragments(_ForeignKey, __ForeignKey);
			Types._Mapping.initFragments(_Mapping, __Mapping);
			Types._Migration.initFragments(_Migration, __Migration);
			Types._MngCollection.initFragments(_MngCollection, __MngCollection);
			Types._MongoDb.initFragments(_MongoDb, __MongoDb);
			Types._NestingList.initFragments(_NestingList, __NestingList);
			Types._NestingObject.initFragments(_NestingObject, __NestingObject);
			Types._NotNull.initFragments(_NotNull, __NotNull);
			Types._Options.initFragments(_Options, __Options);
			Types._PrimaryKey.initFragments(_PrimaryKey, __PrimaryKey);
			Types._RelationalDb.initFragments(_RelationalDb, __RelationalDb);
			Types._Table.initFragments(_Table, __Table);
			Types._Unique.initFragments(_Unique, __Unique);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Column__Column = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Constraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DirectMapping__DirectMapping = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DirectMapping__Mapping = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DirectMapping__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DirectMapping__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Field__Field = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Field__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FieldType__FieldType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FieldType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__ForeignKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ForeignKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Mapping__Mapping = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mapping__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mapping__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Migration__Migration = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Migration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Migration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MngCollection__MngCollection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MngCollection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MngCollection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MongoDb__MongoDb = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MongoDb__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MongoDb__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NestingList__NestingList = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingList__Mapping = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingList__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingList__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NestingObject__NestingObject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingObject__Mapping = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingObject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NestingObject__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NotNull__NotNull = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NotNull__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NotNull__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NotNull__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Options__Options = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Options__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Options__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__PrimaryKey = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrimaryKey__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RelationalDb__RelationalDb = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationalDb__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RelationalDb__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Unique__Unique = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Unique__Constraint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Unique__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Unique__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initOperations(_Column__Column);
			Fragments._Column__OclAny.initOperations(_Column__OclAny);
			Fragments._Column__OclElement.initOperations(_Column__OclElement);

			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);

			Fragments._DirectMapping__DirectMapping.initOperations(_DirectMapping__DirectMapping);
			Fragments._DirectMapping__Mapping.initOperations(_DirectMapping__Mapping);
			Fragments._DirectMapping__OclAny.initOperations(_DirectMapping__OclAny);
			Fragments._DirectMapping__OclElement.initOperations(_DirectMapping__OclElement);

			Fragments._Field__Field.initOperations(_Field__Field);
			Fragments._Field__OclAny.initOperations(_Field__OclAny);
			Fragments._Field__OclElement.initOperations(_Field__OclElement);

			Fragments._FieldType__FieldType.initOperations(_FieldType__FieldType);
			Fragments._FieldType__OclAny.initOperations(_FieldType__OclAny);
			Fragments._FieldType__OclElement.initOperations(_FieldType__OclElement);
			Fragments._FieldType__OclEnumeration.initOperations(_FieldType__OclEnumeration);
			Fragments._FieldType__OclType.initOperations(_FieldType__OclType);

			Fragments._ForeignKey__Constraint.initOperations(_ForeignKey__Constraint);
			Fragments._ForeignKey__ForeignKey.initOperations(_ForeignKey__ForeignKey);
			Fragments._ForeignKey__OclAny.initOperations(_ForeignKey__OclAny);
			Fragments._ForeignKey__OclElement.initOperations(_ForeignKey__OclElement);

			Fragments._Mapping__Mapping.initOperations(_Mapping__Mapping);
			Fragments._Mapping__OclAny.initOperations(_Mapping__OclAny);
			Fragments._Mapping__OclElement.initOperations(_Mapping__OclElement);

			Fragments._Migration__Migration.initOperations(_Migration__Migration);
			Fragments._Migration__OclAny.initOperations(_Migration__OclAny);
			Fragments._Migration__OclElement.initOperations(_Migration__OclElement);

			Fragments._MngCollection__MngCollection.initOperations(_MngCollection__MngCollection);
			Fragments._MngCollection__OclAny.initOperations(_MngCollection__OclAny);
			Fragments._MngCollection__OclElement.initOperations(_MngCollection__OclElement);

			Fragments._MongoDb__MongoDb.initOperations(_MongoDb__MongoDb);
			Fragments._MongoDb__OclAny.initOperations(_MongoDb__OclAny);
			Fragments._MongoDb__OclElement.initOperations(_MongoDb__OclElement);

			Fragments._NestingList__Mapping.initOperations(_NestingList__Mapping);
			Fragments._NestingList__NestingList.initOperations(_NestingList__NestingList);
			Fragments._NestingList__OclAny.initOperations(_NestingList__OclAny);
			Fragments._NestingList__OclElement.initOperations(_NestingList__OclElement);

			Fragments._NestingObject__Mapping.initOperations(_NestingObject__Mapping);
			Fragments._NestingObject__NestingObject.initOperations(_NestingObject__NestingObject);
			Fragments._NestingObject__OclAny.initOperations(_NestingObject__OclAny);
			Fragments._NestingObject__OclElement.initOperations(_NestingObject__OclElement);

			Fragments._NotNull__Constraint.initOperations(_NotNull__Constraint);
			Fragments._NotNull__NotNull.initOperations(_NotNull__NotNull);
			Fragments._NotNull__OclAny.initOperations(_NotNull__OclAny);
			Fragments._NotNull__OclElement.initOperations(_NotNull__OclElement);

			Fragments._Options__OclAny.initOperations(_Options__OclAny);
			Fragments._Options__OclElement.initOperations(_Options__OclElement);
			Fragments._Options__Options.initOperations(_Options__Options);

			Fragments._PrimaryKey__Constraint.initOperations(_PrimaryKey__Constraint);
			Fragments._PrimaryKey__OclAny.initOperations(_PrimaryKey__OclAny);
			Fragments._PrimaryKey__OclElement.initOperations(_PrimaryKey__OclElement);
			Fragments._PrimaryKey__PrimaryKey.initOperations(_PrimaryKey__PrimaryKey);

			Fragments._RelationalDb__OclAny.initOperations(_RelationalDb__OclAny);
			Fragments._RelationalDb__OclElement.initOperations(_RelationalDb__OclElement);
			Fragments._RelationalDb__RelationalDb.initOperations(_RelationalDb__RelationalDb);

			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Fragments._Unique__Constraint.initOperations(_Unique__Constraint);
			Fragments._Unique__OclAny.initOperations(_Unique__OclAny);
			Fragments._Unique__OclElement.initOperations(_Unique__OclElement);
			Fragments._Unique__Unique.initOperations(_Unique__Unique);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Column = {
			DslTables.Properties._Column__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Constraint = {
			DslTables.Properties._Constraint__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DirectMapping = {
			DslTables.Properties._DirectMapping__column,
			DslTables.Properties._Mapping__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Mapping__output
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Field = {
			DslTables.Properties._Field__fields,
			DslTables.Properties._Field__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Field__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FieldType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ForeignKey = {
			DslTables.Properties._Constraint__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._ForeignKey__referencing,
			DslTables.Properties._ForeignKey__refrenced
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mapping = {
			DslTables.Properties._Mapping__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Mapping__output
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Migration = {
			DslTables.Properties._Migration__mappings,
			DslTables.Properties._Migration__mongodb,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Migration__options,
			DslTables.Properties._Migration__relationaldb
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MngCollection = {
			DslTables.Properties._MngCollection__fields,
			DslTables.Properties._MngCollection__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MongoDb = {
			DslTables.Properties._MongoDb__collections,
			DslTables.Properties._MongoDb__db,
			DslTables.Properties._MongoDb__host,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._MongoDb__password,
			DslTables.Properties._MongoDb__port,
			DslTables.Properties._MongoDb__username
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NestingList = {
			DslTables.Properties._NestingList__columns,
			DslTables.Properties._NestingList__fields,
			DslTables.Properties._NestingList__foreignkey,
			DslTables.Properties._Mapping__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Mapping__output
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NestingObject = {
			DslTables.Properties._NestingObject__columns,
			DslTables.Properties._NestingObject__fields,
			DslTables.Properties._NestingObject__foreignkey,
			DslTables.Properties._Mapping__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Mapping__output
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NotNull = {
			DslTables.Properties._NotNull__column,
			DslTables.Properties._Constraint__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Options = {
			DslTables.Properties._Options__AllowAdditionalFields,
			DslTables.Properties._Options__DataTypeMigration,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrimaryKey = {
			DslTables.Properties._PrimaryKey__keyColumns,
			DslTables.Properties._Constraint__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RelationalDb = {
			DslTables.Properties._RelationalDb__constraints,
			DslTables.Properties._RelationalDb__db,
			DslTables.Properties._RelationalDb__host,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._RelationalDb__password,
			DslTables.Properties._RelationalDb__port,
			DslTables.Properties._RelationalDb__tables,
			DslTables.Properties._RelationalDb__username
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			DslTables.Properties._Table__columns,
			DslTables.Properties._Table__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Unique = {
			DslTables.Properties._Constraint__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DslTables.Properties._Unique__uniqueColumns
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initProperties(_Column);
			Fragments._Constraint__Constraint.initProperties(_Constraint);
			Fragments._DirectMapping__DirectMapping.initProperties(_DirectMapping);
			Fragments._Field__Field.initProperties(_Field);
			Fragments._FieldType__FieldType.initProperties(_FieldType);
			Fragments._ForeignKey__ForeignKey.initProperties(_ForeignKey);
			Fragments._Mapping__Mapping.initProperties(_Mapping);
			Fragments._Migration__Migration.initProperties(_Migration);
			Fragments._MngCollection__MngCollection.initProperties(_MngCollection);
			Fragments._MongoDb__MongoDb.initProperties(_MongoDb);
			Fragments._NestingList__NestingList.initProperties(_NestingList);
			Fragments._NestingObject__NestingObject.initProperties(_NestingObject);
			Fragments._NotNull__NotNull.initProperties(_NotNull);
			Fragments._Options__Options.initProperties(_Options);
			Fragments._PrimaryKey__PrimaryKey.initProperties(_PrimaryKey);
			Fragments._RelationalDb__RelationalDb.initProperties(_RelationalDb);
			Fragments._Table__Table.initProperties(_Table);
			Fragments._Unique__Unique.initProperties(_Unique);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _FieldType__Basic = new EcoreExecutorEnumerationLiteral(DslPackage.Literals.FIELD_TYPE.getEEnumLiteral("Basic"), Types._FieldType, 0);
		public static final EcoreExecutorEnumerationLiteral _FieldType__ListField = new EcoreExecutorEnumerationLiteral(DslPackage.Literals.FIELD_TYPE.getEEnumLiteral("ListField"), Types._FieldType, 1);
		public static final EcoreExecutorEnumerationLiteral _FieldType__ObjectField = new EcoreExecutorEnumerationLiteral(DslPackage.Literals.FIELD_TYPE.getEEnumLiteral("ObjectField"), Types._FieldType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _FieldType = {
			_FieldType__Basic,
			_FieldType__ListField,
			_FieldType__ObjectField
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._FieldType.initLiterals(_FieldType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DslTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DslTables();
	}

	private DslTables() {
		super(DslPackage.eNS_URI);
	}
}
