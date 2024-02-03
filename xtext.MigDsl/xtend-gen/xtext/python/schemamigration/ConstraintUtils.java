package xtext.python.schemamigration;

import dsl.Column;
import dsl.Constraint;
import dsl.Field;
import dsl.ForeignKey;
import dsl.Migration;
import dsl.MngCollection;
import dsl.NotNull;
import dsl.RelationalDb;
import dsl.Unique;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import xtext.Utils;

@SuppressWarnings("all")
public class ConstraintUtils {
  public static List<String> getRequiredFieldsForCollection(final MngCollection collection, final Migration migration) {
    final ArrayList<String> myList = new ArrayList<String>();
    EList<Field> _fields = collection.getFields();
    for (final Field field : _fields) {
      int _size = field.getFields().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        Column sourceColumn = Utils.getSourceColumnForField(field, migration);
        boolean _checkIfCollumnIsRequired = ConstraintUtils.checkIfCollumnIsRequired(sourceColumn, migration);
        if (_checkIfCollumnIsRequired) {
          myList.add(field.getName());
        }
      }
    }
    return myList;
  }

  public static List<String> getRequiredFieldsForObject(final Field field, final Migration migration) {
    final ArrayList<String> myList = new ArrayList<String>();
    EList<Field> _fields = field.getFields();
    for (final Field nestedField : _fields) {
      int _size = nestedField.getFields().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        Column sourceColumn = Utils.getSourceColumnForField(nestedField, migration);
        boolean _checkIfCollumnIsRequired = ConstraintUtils.checkIfCollumnIsRequired(sourceColumn, migration);
        if (_checkIfCollumnIsRequired) {
          myList.add(nestedField.getName());
        }
      }
    }
    return myList;
  }

  public static boolean checkIfCollumnIsRequired(final Column col, final Migration migration) {
    List<NotNull> _allNotNullConstraints = ConstraintUtils.getAllNotNullConstraints(migration);
    for (final NotNull cons : _allNotNullConstraints) {
      Column _column = cons.getColumn();
      boolean _tripleEquals = (_column == col);
      if (_tripleEquals) {
        return true;
      }
    }
    return false;
  }

  public static List<NotNull> getAllNotNullConstraints(final Migration mig) {
    final ArrayList<NotNull> myList = new ArrayList<NotNull>();
    EList<Constraint> _constraints = mig.getRelationaldb().getConstraints();
    for (final Constraint cons : _constraints) {
      if ((cons instanceof NotNull)) {
        final NotNull notNullConstraint = ((NotNull) cons);
        myList.add(notNullConstraint);
      }
    }
    return myList;
  }

  public static List<Unique> getAllUniqueConstraints(final Migration mig) {
    final ArrayList<Unique> myList = new ArrayList<Unique>();
    EList<Constraint> _constraints = mig.getRelationaldb().getConstraints();
    for (final Constraint cons : _constraints) {
      if ((cons instanceof Unique)) {
        final Unique notNullConstraint = ((Unique) cons);
        myList.add(notNullConstraint);
      }
    }
    return myList;
  }

  public static List<ForeignKey> getAllForeignKeyConstraints(final RelationalDb relDb) {
    final ArrayList<ForeignKey> myList = new ArrayList<ForeignKey>();
    EList<Constraint> _constraints = relDb.getConstraints();
    for (final Constraint cons : _constraints) {
      if ((cons instanceof ForeignKey)) {
        final ForeignKey notNullConstraint = ((ForeignKey) cons);
        myList.add(notNullConstraint);
      }
    }
    return myList;
  }

  public static List<String> getColumnNamesForColumns(final List<Column> columns) {
    final ArrayList<String> ret = new ArrayList<String>();
    for (final Column col : columns) {
      ret.add(col.getName());
    }
    return ret;
  }

  public static List<String> getReferencedColumnNamesForNestingList(final ForeignKey foreignKey, final RelationalDb relationalDb) {
    final EList<Column> referencingColumn = foreignKey.getReferencing();
    String tableName = Utils.getTableNameFromReferencedColumn(relationalDb, referencingColumn.get(0));
    List<ForeignKey> fkeys = ConstraintUtils.getForeignKeysForTable(tableName, relationalDb);
    int _size = fkeys.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      ForeignKey _get = fkeys.get((i).intValue());
      boolean _tripleNotEquals = (_get != foreignKey);
      if (_tripleNotEquals) {
        return ConstraintUtils.getColumnNamesForColumns(fkeys.get((i).intValue()).getRefrenced());
      }
    }
    return null;
  }

  public static List<ForeignKey> getForeignKeysForTable(final String tableName, final RelationalDb relationalDb) {
    final ArrayList<ForeignKey> ret = new ArrayList<ForeignKey>();
    List<ForeignKey> _allForeignKeyConstraints = ConstraintUtils.getAllForeignKeyConstraints(relationalDb);
    for (final ForeignKey fkey : _allForeignKeyConstraints) {
      EList<Column> _referencing = fkey.getReferencing();
      for (final Column col : _referencing) {
        {
          final String referencingTableName = Utils.getTableNameFromReferencedColumn(relationalDb, col);
          boolean _equals = referencingTableName.equals(tableName);
          if (_equals) {
            ret.add(fkey);
          }
        }
      }
    }
    return ret;
  }
}
