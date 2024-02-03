package xtext.python.datamigration;

import dsl.DirectMapping;
import dsl.Mapping;
import dsl.RelationalDb;
import org.eclipse.xtend2.lib.StringConcatenation;
import xtext.Utils;

@SuppressWarnings("all")
public class DirectMappingGenerator {
  public String getDirectMappingContent(final Mapping mapping, final RelationalDb relDb) {
    String _xblockexpression = null;
    {
      final DirectMapping map = ((DirectMapping) mapping);
      final String input_table_name = Utils.getTableNameFromReferencedColumn(relDb, map.getColumn());
      final String collection_name = Utils.getCollectionNameFromOutput(map.getOutput());
      final String output_field = Utils.getFieldNameFromOutput(map.getOutput());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("# %% Direct mapping of ");
      String _name = map.getColumn().getName();
      _builder.append(_name);
      {
        String _name_1 = map.getName();
        boolean _tripleNotEquals = (_name_1 != null);
        if (_tripleNotEquals) {
          _builder.append(":");
          String _name_2 = map.getName();
          _builder.append(_name_2);
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("cursor = connection.cursor()");
      _builder.newLine();
      _builder.append("cursor.execute(\"SELECT ");
      String _name_3 = map.getColumn().getName();
      _builder.append(_name_3);
      _builder.append(" FROM ");
      _builder.append(input_table_name);
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("rows = cursor.fetchall()");
      _builder.newLine();
      _builder.append("cursor.close()");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("simple_list = []");
      _builder.newLine();
      _builder.append("simple_list = [item[0] for item in rows]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("collection = database[\'");
      _builder.append(collection_name);
      _builder.append("\']");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("for index,i in enumerate(simple_list):");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new_document = {\"");
      _builder.append(output_field, "\t");
      _builder.append("\": i}\t\t");
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
      _builder.append("if count == index+1:\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("collection.update_one({\'_id\': document[\'_id\']}, {\'$set\': new_document})");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
