package xtext.generator;

import dsl.Migration;
import dsl.MongoDb;
import dsl.RelationalDb;
import java.util.Collections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import xtext.MigrationController;
import xtext.configfile.ConfigFileParser;
import xtext.oracle.ForeignKeyConstraintFetcher;
import xtext.oracle.NotNullConstraintFetcher;
import xtext.oracle.PrimaryKeyConstraintFetcher;
import xtext.oracle.TableFetcher;
import xtext.oracle.UniqueConstraintFetcher;
import xtext.python.DataMigrationFileGenerator;
import xtext.python.SchemaMigrationFileGenerator;

@SuppressWarnings("all")
public class MigDslGenerator extends AbstractGenerator {
  private final ConfigFileParser parser = new ConfigFileParser();

  private final String configFilePath = "../config.xml";

  private final TableFetcher tableFetcher = new TableFetcher();

  private UniqueConstraintFetcher constraintFetcher = new UniqueConstraintFetcher();

  private PrimaryKeyConstraintFetcher pkconstraintFetcher = new PrimaryKeyConstraintFetcher();

  private NotNullConstraintFetcher nnconstraintFetcher = new NotNullConstraintFetcher();

  private ForeignKeyConstraintFetcher fkconstraintFetcher = new ForeignKeyConstraintFetcher();

  private final DataMigrationFileGenerator dataMigGen = new DataMigrationFileGenerator();

  private final SchemaMigrationFileGenerator schemaGen = new SchemaMigrationFileGenerator();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      Migration migration = ((Migration) _head);
      RelationalDb _relationaldb = migration.getRelationaldb();
      boolean _tripleEquals = (_relationaldb == null);
      if (_tripleEquals) {
        final CharSequence configContent = fsa.readTextFile(this.configFilePath);
        final RelationalDb relDb = this.parser.getRelDbCredentials(configContent);
        final MongoDb mongoDb = this.parser.getMongoDbCredentials(configContent);
        RelationalDb completeRelDb = this.tableFetcher.fetchTablesAndColumns(relDb);
        completeRelDb = this.constraintFetcher.fetchConstraints(completeRelDb);
        completeRelDb = this.pkconstraintFetcher.fetchConstraints(completeRelDb);
        completeRelDb = this.nnconstraintFetcher.fetchConstraints(completeRelDb);
        completeRelDb = this.fkconstraintFetcher.fetchConstraints(completeRelDb);
        migration.setRelationaldb(completeRelDb);
        migration.setMongodb(mongoDb);
        resource.save(Collections.<Object, Object>emptyMap());
      }
      migration = MigrationController.updateMigration(migration);
      resource.save(Collections.<Object, Object>emptyMap());
      migration.setOptions(this.parser.getMigrationOptions(fsa.readTextFile(this.configFilePath)));
      String schema = this.schemaGen.generateContentFromMigration(migration);
      String content = this.dataMigGen.generateContentFromMigration(migration);
      fsa.generateFile("schema_migration.py", schema);
      fsa.generateFile("data_migration.py", content);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
