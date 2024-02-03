package xtext.python;

import dsl.DirectMapping;
import dsl.Mapping;
import dsl.Migration;
import dsl.NestingList;
import org.eclipse.emf.common.util.EList;
import xtext.python.datamigration.DirectMappingGenerator;
import xtext.python.datamigration.NestingListMappingGenerator;
import xtext.python.datamigration.NestingObjectMappingGenerator;

@SuppressWarnings("all")
public class DataMigrationFileGenerator {
  public String generateContentFromMigration(final Migration migration) {
    String content = "";
    String _content = content;
    CharSequence _oracleImport = StaticTemplates.getOracleImport();
    content = (_content + _oracleImport);
    String _content_1 = content;
    CharSequence _mongoImport = StaticTemplates.getMongoImport();
    content = (_content_1 + _mongoImport);
    String _content_2 = content;
    String _oracleConnection = StaticTemplates.getOracleConnection(migration.getRelationaldb());
    content = (_content_2 + _oracleConnection);
    String _content_3 = content;
    String _mongoConnection = StaticTemplates.getMongoConnection(migration.getMongodb());
    content = (_content_3 + _mongoConnection);
    EList<Mapping> _mappings = migration.getMappings();
    for (final Mapping mapping : _mappings) {
      if ((mapping instanceof DirectMapping)) {
        final DirectMappingGenerator gen = new DirectMappingGenerator();
        String _content_4 = content;
        String _directMappingContent = gen.getDirectMappingContent(mapping, migration.getRelationaldb());
        content = (_content_4 + _directMappingContent);
      } else {
        if ((mapping instanceof NestingList)) {
          final NestingListMappingGenerator gen_1 = new NestingListMappingGenerator();
          String _content_5 = content;
          String _nestingListMappingContent = gen_1.getNestingListMappingContent(mapping, migration.getRelationaldb());
          content = (_content_5 + _nestingListMappingContent);
        } else {
          final NestingObjectMappingGenerator gen_2 = new NestingObjectMappingGenerator();
          String _content_6 = content;
          String _nestingObjectMappingContent = gen_2.getNestingObjectMappingContent(mapping, migration.getRelationaldb());
          content = (_content_6 + _nestingObjectMappingContent);
        }
      }
    }
    String _content_7 = content;
    String _closeOracleConnection = StaticTemplates.closeOracleConnection();
    content = (_content_7 + _closeOracleConnection);
    return content;
  }
}
