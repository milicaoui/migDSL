package xtext.python;

import dsl.Column;
import dsl.Field;
import dsl.Migration;
import dsl.MngCollection;
import dsl.Unique;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import xtext.Utils;
import xtext.python.schemamigration.ConstraintUtils;

@SuppressWarnings("all")
public class IndexGenerator {
  public static CharSequence generateIndexesForCollection(final MngCollection collection, final Migration migration) {
    CharSequence _xblockexpression = null;
    {
      final HashMap<String, List<String>> map = IndexGenerator.getUniqueFieldsForCollection(collection, migration);
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        Set<Map.Entry<String, List<String>>> _entrySet = map.entrySet();
        for(final Map.Entry<String, List<String>> entry : _entrySet) {
          _builder.append("collection = database[\'");
          String _name = collection.getName();
          _builder.append(_name);
          _builder.append("\']");
          _builder.newLineIfNotEmpty();
          {
            int _size = entry.getValue().size();
            boolean _equals = (_size == 1);
            if (_equals) {
              _builder.append("collection.create_index(\"");
              String _get = entry.getValue().get(0);
              _builder.append(_get);
              _builder.append("\", unique=True)");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("collection.create_index([");
              {
                int _size_1 = entry.getValue().size();
                ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
                for(final Integer i : _doubleDotLessThan) {
                  _builder.append("(\"");
                  String _get_1 = entry.getValue().get((i).intValue());
                  _builder.append(_get_1);
                  _builder.append("\",1)");
                  {
                    int _length = ((Object[])Conversions.unwrapArray(entry.getValue(), Object.class)).length;
                    int _minus = (_length - 1);
                    boolean _notEquals = ((i).intValue() != _minus);
                    if (_notEquals) {
                      _builder.append(",");
                    }
                  }
                }
              }
              _builder.append("], unique=True)");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public static HashMap<String, List<String>> getUniqueFieldsForCollection(final MngCollection collection, final Migration migration) {
    final HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    List<Unique> uniqueCons = ConstraintUtils.getAllUniqueConstraints(migration);
    for (final Unique unique : uniqueCons) {
      boolean _checkIfUniqueConstraintApplies = IndexGenerator.checkIfUniqueConstraintApplies(unique, collection, migration);
      if (_checkIfUniqueConstraintApplies) {
        map.put(unique.getName(), IndexGenerator.getFieldNames(unique, collection, migration));
      }
    }
    return map;
  }

  public static List<String> getFieldNames(final Unique unique, final MngCollection collection, final Migration migration) {
    List<Column> sourceCols = IndexGenerator.getSourceColListForCollection(collection, migration);
    final ArrayList<Integer> indices = CollectionLiterals.<Integer>newArrayList();
    EList<Column> _uniqueColumns = unique.getUniqueColumns();
    for (final Column col : _uniqueColumns) {
      {
        final int index = sourceCols.indexOf(col);
        if ((index >= 0)) {
          indices.add(Integer.valueOf(index));
        }
      }
    }
    ArrayList<String> fields = new ArrayList<String>();
    for (final Integer i : indices) {
      fields.add(collection.getFields().get((i).intValue()).getName());
    }
    return fields;
  }

  public static boolean checkIfUniqueConstraintApplies(final Unique unique, final MngCollection collection, final Migration migration) {
    final List<Column> sourceCols = IndexGenerator.getSourceColListForCollection(collection, migration);
    EList<Column> _uniqueColumns = unique.getUniqueColumns();
    for (final Column col : _uniqueColumns) {
      boolean _contains = sourceCols.contains(col);
      boolean _not = (!_contains);
      if (_not) {
        return false;
      }
    }
    return true;
  }

  public static List<Column> getSourceColListForCollection(final MngCollection collection, final Migration migration) {
    final ArrayList<Column> myList = new ArrayList<Column>();
    EList<Field> _fields = collection.getFields();
    for (final Field field : _fields) {
      int _size = field.getFields().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        myList.add(Utils.getSourceColumnForField(field, migration));
      } else {
        myList.add(null);
      }
    }
    return myList;
  }
}
