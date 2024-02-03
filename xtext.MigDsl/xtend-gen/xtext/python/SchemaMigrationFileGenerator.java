package xtext.python;

import dsl.Migration;
import dsl.MngCollection;
import org.eclipse.emf.common.util.EList;
import xtext.python.schemamigration.ValidatorsGenerator;

@SuppressWarnings("all")
public class SchemaMigrationFileGenerator {
  public String generateContentFromMigration(final Migration migration) {
    ValidatorsGenerator gen = new ValidatorsGenerator();
    String content = "";
    String _content = content;
    CharSequence _mongoImport = StaticTemplates.getMongoImport();
    content = (_content + _mongoImport);
    String _content_1 = content;
    String _mongoConnection = StaticTemplates.getMongoConnection(migration.getMongodb());
    content = (_content_1 + _mongoConnection);
    EList<MngCollection> _collections = migration.getMongodb().getCollections();
    for (final MngCollection collection : _collections) {
      {
        String _content_2 = content;
        CharSequence _validatorForCollection = gen.getValidatorForCollection(collection, migration);
        content = (_content_2 + _validatorForCollection);
        String _content_3 = content;
        CharSequence _generateIndexesForCollection = IndexGenerator.generateIndexesForCollection(collection, migration);
        content = (_content_3 + _generateIndexesForCollection);
      }
    }
    return content;
  }
}
