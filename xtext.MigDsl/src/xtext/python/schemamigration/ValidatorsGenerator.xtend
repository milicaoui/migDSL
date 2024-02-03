package xtext.python.schemamigration

import dsl.Field
import dsl.Migration
import dsl.MngCollection
import java.util.List
import xtext.Utils
import xtext.oracle.DataTypeFetcher

class ValidatorsGenerator {
	
	def getValidatorForCollection(MngCollection collection,Migration migration){
		'''
		collectionValidator = {
			'$jsonSchema': {
				'type': 'object',
				'properties': {
					«FOR i:0..<collection.fields.size»
					«IF collection.fields.get(i).fields.size==0»
					'«collection.fields.get(i).name»': {
						«IF migration.options.dataTypeMigration»«getDataType(collection.fields.get(i),migration)»«ENDIF»
					}«IF i != collection.fields.length - 1»,«ENDIF»
					«ELSE»
					«getObjectProperties(collection.fields.get(i),migration)»
					«ENDIF»
					«ENDFOR»
				}«getRequiredFields(collection,migration)»«IF !migration.options.allowAdditionalFields»,
				'additionalProperties': False«ENDIF»
			}
		}
		
		database.create_collection('«collection.name»')
		database.command("collMod", "«collection.name»",validator=collectionValidator)
		'''	
	}
	
	def getObjectProperties(Field field, Migration mig){
		println("Funkcija je pozvana jednom")
		'''
		'«field.name»':{
			'type': 'object',
			'properties':{
				«FOR i:0..<field.fields.size»
				«IF field.fields.get(i).fields.size==0»
					'«field.fields.get(i).name»': {
						«IF mig.options.dataTypeMigration»«getDataType(field.fields.get(i),mig)»«ENDIF»
					}«IF i != field.fields.length - 1»,«ENDIF»
					«ELSE»
					«getObjectProperties(field.fields.get(i),mig)»
					«ENDIF»
				«ENDFOR»
			}«requiredFieldsForObject(field,mig)»«IF !mig.options.allowAdditionalFields»,
			'additionalProperties': False«ENDIF»
		}
	
		'''
	}
	def getRequiredFields(MngCollection collection,Migration migration){
		val List<String> required = ConstraintUtils.getRequiredFieldsForCollection(collection,migration)
		'''
		«IF required.length != 0»,
		'required':[«FOR i:0..<required.size»'«required.get(i)»'«IF i != required.length - 1»,«ENDIF»«ENDFOR»]«ENDIF»
		'''
	}
	
	def requiredFieldsForObject(Field field, Migration migration){
		val List<String> required = ConstraintUtils.getRequiredFieldsForObject(field,migration)
		'''
		«IF required.length != 0»,
		'required':[«FOR i:0..<required.size»'«required.get(i)»'«IF i != required.length - 1»,«ENDIF»«ENDFOR»]«ENDIF»
		'''
	}
	
	def getDataType(Field field, Migration migration){
		var fetcher = new DataTypeFetcher()
		val sourceColumn = Utils.getSourceColumnForField(field,migration)
		var oracleType = fetcher.getColumnDataType(
			Utils.getTableNameFromReferencedColumn(migration.relationaldb, sourceColumn), sourceColumn.name,migration.relationaldb)
		
		val mongoType = fetcher.getMongoDataType(oracleType)
		'''
		'type': '«mongoType»'
		'''
	}
}