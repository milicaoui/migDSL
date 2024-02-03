package xtext.python

import dsl.DirectMapping
import dsl.Migration
import dsl.NestingList
import xtext.python.datamigration.DirectMappingGenerator
import xtext.python.datamigration.NestingListMappingGenerator
import xtext.python.datamigration.NestingObjectMappingGenerator

class DataMigrationFileGenerator {


def String generateContentFromMigration(Migration migration) {
	
	var content = ''
	
	content+=StaticTemplates.getOracleImport()
	content+=StaticTemplates.getMongoImport()
	content+=StaticTemplates.getOracleConnection(migration.relationaldb)
	content+=StaticTemplates.getMongoConnection(migration.mongodb)
	
	for(mapping: migration.mappings){
		
			
			if (mapping instanceof DirectMapping) {
				
				val gen = new DirectMappingGenerator()
				content+=gen.getDirectMappingContent(mapping, migration.relationaldb)				
			}			
			else if (mapping instanceof NestingList){
				
				val gen = new NestingListMappingGenerator()
				content+=gen.getNestingListMappingContent(mapping, migration.relationaldb)				
			}			
			else {				
				val gen = new NestingObjectMappingGenerator()
				content+=gen.getNestingObjectMappingContent(mapping, migration.relationaldb)					
		}		
	}

	
	content+=StaticTemplates.closeOracleConnection()
	return content
}
	
}