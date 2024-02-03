package xtext.python

import dsl.Migration
import xtext.python.schemamigration.ValidatorsGenerator

class SchemaMigrationFileGenerator {
	
	def String generateContentFromMigration(Migration migration) {
		
		var ValidatorsGenerator gen = new ValidatorsGenerator()
		
		var content = ''
		
		content+=StaticTemplates.getMongoImport()
		content+=StaticTemplates.getMongoConnection(migration.mongodb)
		
		for(collection: migration.mongodb.collections){	
			content+=gen.getValidatorForCollection(collection,migration)
			content+=IndexGenerator.generateIndexesForCollection(collection,migration);
		}		
		return content
	}
}
