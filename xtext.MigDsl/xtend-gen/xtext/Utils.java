package xtext;

import com.google.common.base.Objects;
import dsl.Column;
import dsl.DirectMapping;
import dsl.Field;
import dsl.Mapping;
import dsl.Migration;
import dsl.MngCollection;
import dsl.NestingList;
import dsl.NestingObject;
import dsl.RelationalDb;
import dsl.Table;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Utils {
  public static String getTableNameFromReferencedColumn(final RelationalDb relationalDb, final Column referencedColumn) {
    EList<Table> _tables = relationalDb.getTables();
    for (final Table table : _tables) {
      EList<Column> _columns = table.getColumns();
      for (final Column column : _columns) {
        if ((column == referencedColumn)) {
          return table.getName();
        }
      }
    }
    return null;
  }

  public static Column getColumnFromTableAndColumnName(final RelationalDb relationalDb, final String columnName, final String tableName) {
    EList<Table> _tables = relationalDb.getTables();
    for (final Table table : _tables) {
      String _name = table.getName();
      boolean _equals = Objects.equal(_name, tableName);
      if (_equals) {
        EList<Column> _columns = table.getColumns();
        for (final Column column : _columns) {
          String _name_1 = column.getName();
          boolean _equals_1 = Objects.equal(_name_1, columnName);
          if (_equals_1) {
            return column;
          }
        }
      }
    }
    return null;
  }

  public static Column getSourceColumnForField(final Field field, final Migration migration) {
    String _name = field.getName();
    String _plus = ("Polje za koje se trazi source column: " + _name);
    System.err.println(_plus);
    Mapping mapping = Utils.getMappingForField(field, migration);
    if ((mapping instanceof DirectMapping)) {
      final DirectMapping mapp = ((DirectMapping) mapping);
      return mapp.getColumn();
    } else {
      if ((mapping instanceof NestingList)) {
        final NestingList mapp_1 = ((NestingList) mapping);
        EList<Column> input_columns = mapp_1.getColumns();
        EList<Field> resulting_fields = mapp_1.getFields();
        int _size = resulting_fields.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer i : _doubleDotLessThan) {
          Field _get = resulting_fields.get((i).intValue());
          boolean _equals = Objects.equal(_get, field);
          if (_equals) {
            String _name_1 = field.getName();
            String _plus_1 = ("Source kolona za " + _name_1);
            String _plus_2 = (_plus_1 + " je ");
            String _name_2 = input_columns.get((i).intValue()).getName();
            String _plus_3 = (_plus_2 + _name_2);
            InputOutput.<String>println(_plus_3);
            return input_columns.get((i).intValue());
          }
        }
        return mapp_1.getColumns().get(0);
      } else {
        final NestingObject mapp_2 = ((NestingObject) mapping);
        EList<Column> input_columns_1 = mapp_2.getColumns();
        EList<Field> resulting_fields_1 = mapp_2.getFields();
        int _size_1 = resulting_fields_1.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer i_1 : _doubleDotLessThan_1) {
          Field _get_1 = resulting_fields_1.get((i_1).intValue());
          boolean _equals_1 = Objects.equal(_get_1, field);
          if (_equals_1) {
            String _name_3 = field.getName();
            String _plus_4 = ("Source kolona za " + _name_3);
            String _plus_5 = (_plus_4 + " je ");
            String _name_4 = input_columns_1.get((i_1).intValue()).getName();
            String _plus_6 = (_plus_5 + _name_4);
            InputOutput.<String>println(_plus_6);
            return input_columns_1.get((i_1).intValue());
          }
        }
        return mapp_2.getColumns().get(0);
      }
    }
  }

  public static Mapping getMappingForField(final Field field, final Migration migration) {
    EList<Mapping> _mappings = migration.getMappings();
    for (final Mapping mapping : _mappings) {
      if ((mapping instanceof DirectMapping)) {
        boolean _equals = (((DirectMapping)mapping).getOutput().split("\\.")[1]).equals(field.getName());
        if (_equals) {
          String _name = field.getName();
          String _plus = ("NASAO JE DA SE POLJE " + _name);
          String _plus_1 = (_plus + " nalazi u direktnom mapiranju");
          InputOutput.<String>println(_plus_1);
          return mapping;
        }
      } else {
        Field _parentFieldForChildField = Utils.getParentFieldForChildField(field, migration);
        boolean _tripleNotEquals = (_parentFieldForChildField != null);
        if (_tripleNotEquals) {
          boolean _equals_1 = (mapping.getOutput().split("\\.")[1]).equals(Utils.getParentFieldForChildField(field, migration).getName());
          if (_equals_1) {
            String _name_1 = field.getName();
            String _plus_2 = ("NASAO JE DA SE POLJE " + _name_1);
            String _plus_3 = (_plus_2 + " nalazi u nested mapiranju");
            InputOutput.<String>println(_plus_3);
            return mapping;
          }
        }
      }
    }
    return null;
  }

  public static Field getParentFieldForChildField(final Field field, final Migration migration) {
    List<Field> _nestedFields = Utils.getNestedFields(migration);
    for (final Field parentField : _nestedFields) {
      EList<Field> _fields = parentField.getFields();
      for (final Field nestedField : _fields) {
        if ((nestedField == field)) {
          return parentField;
        }
      }
    }
    return null;
  }

  public static List<Field> getNestedFields(final Migration migration) {
    final ArrayList<Field> myList = new ArrayList<Field>();
    EList<MngCollection> _collections = migration.getMongodb().getCollections();
    for (final MngCollection col : _collections) {
      EList<Field> _fields = col.getFields();
      for (final Field field : _fields) {
        int _size = field.getFields().size();
        boolean _notEquals = (_size != 0);
        if (_notEquals) {
          myList.add(field);
        }
      }
    }
    return myList;
  }

  public static String getCollectionNameFromOutput(final String output) {
    final String[] parts = output.split("\\.");
    return parts[0];
  }

  public static String getFieldNameFromOutput(final String output) {
    final String[] parts = output.split("\\.");
    return parts[1];
  }
}
