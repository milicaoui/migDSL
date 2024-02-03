package xtext.generator

import dsl.Migration
import java.util.Collections
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xtext.MigrationController
import xtext.configfile.ConfigFileParser
import xtext.oracle.ForeignKeyConstraintFetcher
import xtext.oracle.NotNullConstraintFetcher
import xtext.oracle.PrimaryKeyConstraintFetcher
import xtext.oracle.TableFetcher
import xtext.oracle.UniqueConstraintFetcher
import xtext.python.DataMigrationFileGenerator
import xtext.python.SchemaMigrationFileGenerator

class MigDslGenerator extends AbstractGenerator {
	
	val parser = new ConfigFileParser()
	val configFilePath = "../config.xml"
	
	val tableFetcher = new TableFetcher()
	var constraintFetcher = new UniqueConstraintFetcher()
	var pkconstraintFetcher = new PrimaryKeyConstraintFetcher()
	var nnconstraintFetcher = new NotNullConstraintFetcher()
	var fkconstraintFetcher = new ForeignKeyConstraintFetcher()

	val dataMigGen = new DataMigrationFileGenerator()
	val schemaGen = new SchemaMigrationFileGenerator()
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		var migration = resource.contents.head as Migration
		
		if (migration.relationaldb === null){
									
			val configContent = fsa.readTextFile(configFilePath)
			
			val relDb = parser.getRelDbCredentials(configContent)
			val mongoDb = parser.getMongoDbCredentials(configContent)			
				
			var completeRelDb = tableFetcher.fetchTablesAndColumns(relDb)
			completeRelDb = constraintFetcher.fetchConstraints(completeRelDb)
			completeRelDb = pkconstraintFetcher.fetchConstraints(completeRelDb)
			completeRelDb = nnconstraintFetcher.fetchConstraints(completeRelDb)
			completeRelDb = fkconstraintFetcher.fetchConstraints(completeRelDb)
	
			migration.relationaldb = completeRelDb
			migration.mongodb = mongoDb
						
			resource.save(Collections.emptyMap());												
		}
		
		migration = MigrationController.updateMigration(migration)
		resource.save(Collections.emptyMap());
		
		migration.options = parser.getMigrationOptions(fsa.readTextFile(configFilePath))		
		var schema = schemaGen.generateContentFromMigration(migration)
		var content = dataMigGen.generateContentFromMigration(migration)
	
		fsa.generateFile('schema_migration.py',schema)
		fsa.generateFile('data_migration.py',content)
	}
}
