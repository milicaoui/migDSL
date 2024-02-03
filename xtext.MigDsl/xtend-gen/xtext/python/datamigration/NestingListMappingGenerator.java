package xtext.python.datamigration;

import dsl.Mapping;
import dsl.NestingList;
import dsl.RelationalDb;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import xtext.Utils;
import xtext.python.schemamigration.ConstraintUtils;

@SuppressWarnings("all")
public class NestingListMappingGenerator {
  public String getNestingListMappingContent(final Mapping mapping, final RelationalDb relDb) {
    String _xblockexpression = null;
    {
      final NestingList map = ((NestingList) mapping);
      final List<String> referencedColumnNames = ConstraintUtils.getColumnNamesForColumns(map.getForeignkey().getReferencing());
      final List<String> referencingColumnNames = ConstraintUtils.getColumnNamesForColumns(map.getForeignkey().getRefrenced());
      final String collection_name = Utils.getCollectionNameFromOutput(map.getOutput());
      final String output_field = Utils.getFieldNameFromOutput(map.getOutput());
      final String input_table_name = Utils.getTableNameFromReferencedColumn(relDb, map.getForeignkey().getRefrenced().get(0));
      final String ref_table_name = Utils.getTableNameFromReferencedColumn(relDb, map.getForeignkey().getReferencing().get(0));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# %% Nesting list mapping ");
      {
        String _name = map.getName();
        boolean _tripleNotEquals = (_name != null);
        if (_tripleNotEquals) {
          _builder.append(":");
          String _name_1 = map.getName();
          _builder.append(_name_1);
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("collection_name = \'");
      _builder.append(collection_name);
      _builder.append("\'");
      _builder.newLineIfNotEmpty();
      _builder.append("collection = database[\'");
      _builder.append(collection_name);
      _builder.append("\']");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("first_cursor = connection.cursor()");
      _builder.newLine();
      _builder.append("first_cursor.execute(\"SELECT ");
      {
        int _size = referencingColumnNames.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for(final Integer i : _doubleDotLessThan) {
          String _get = referencingColumnNames.get((i).intValue());
          _builder.append(_get);
          {
            int _length = ((Object[])Conversions.unwrapArray(referencingColumnNames, Object.class)).length;
            int _minus = (_length - 1);
            boolean _notEquals = ((i).intValue() != _minus);
            if (_notEquals) {
              _builder.append(",");
            }
          }
        }
      }
      _builder.append(" from ");
      _builder.append(input_table_name);
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("rows = first_cursor.fetchall()");
      _builder.newLine();
      _builder.newLine();
      _builder.append("for index,i in enumerate(rows):");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("second_cursor = connection.cursor()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("second_cursor.execute(\"select ");
      {
        int _size_1 = map.getColumns().size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for(final Integer i_1 : _doubleDotLessThan_1) {
          String _name_2 = map.getColumns().get((i_1).intValue()).getName();
          _builder.append(_name_2, "\t");
          {
            int _length_1 = ((Object[])Conversions.unwrapArray(map.getColumns(), Object.class)).length;
            int _minus_1 = (_length_1 - 1);
            boolean _notEquals_1 = ((i_1).intValue() != _minus_1);
            if (_notEquals_1) {
              _builder.append(",");
            }
          }
        }
      }
      _builder.append(" from ");
      _builder.append(ref_table_name, "\t");
      _builder.append(" where ");
      {
        int _size_2 = referencedColumnNames.size();
        ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_2, true);
        for(final Integer i_2 : _doubleDotLessThan_2) {
          String _get_1 = referencedColumnNames.get((i_2).intValue());
          _builder.append(_get_1, "\t");
          _builder.append(" =\'\"+str(i[");
          _builder.append(i_2, "\t");
          _builder.append("])+\"\'\"");
          {
            int _length_2 = ((Object[])Conversions.unwrapArray(referencedColumnNames, Object.class)).length;
            int _minus_2 = (_length_2 - 1);
            boolean _notEquals_2 = ((i_2).intValue() != _minus_2);
            if (_notEquals_2) {
              _builder.append(" AND ");
            }
          }
          _builder.append(")");
        }
      }
      _builder.append("                                       ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("result = second_cursor.fetchall()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("second_cursor.close()");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("documents = []");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("for row in result:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("document = {");
      {
        int _size_3 = map.getFields().size();
        ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _size_3, true);
        for(final Integer i_3 : _doubleDotLessThan_3) {
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\'");
          String _name_3 = map.getFields().get((i_3).intValue()).getName();
          _builder.append(_name_3, "\t\t");
          _builder.append("\' : row[");
          _builder.append(i_3, "\t\t");
          _builder.append("]");
          {
            int _length_3 = ((Object[])Conversions.unwrapArray(map.getColumns(), Object.class)).length;
            int _minus_3 = (_length_3 - 1);
            boolean _notEquals_3 = ((i_3).intValue() != _minus_3);
            if (_notEquals_3) {
              _builder.append(",");
            }
          }
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("documents.append(document)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new_document = {\'");
      _builder.append(output_field, "\t");
      _builder.append("\': documents}");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if collection.count_documents({}) == index:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("collection.insert_one(new_document)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("else:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("cursor = collection.find()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("count = 0");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for document in cursor:");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("count += 1");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if count == index+1:");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("collection.update_one({\'_id\': document[\'_id\']}, {\'$set\': new_document})");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("break");
      _builder.newLine();
      _builder.append("first_cursor.close()");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
