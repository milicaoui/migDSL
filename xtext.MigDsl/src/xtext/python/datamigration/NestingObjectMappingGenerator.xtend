package xtext.python.datamigration

import dsl.Mapping
import dsl.NestingObject
import dsl.RelationalDb
import xtext.Utils
import xtext.python.schemamigration.ConstraintUtils

class NestingObjectMappingGenerator {

	
	def String getNestingObjectMappingContent(Mapping mapping, RelationalDb relDb){
		
		val map = mapping as NestingObject
		val referencedColumnNames = ConstraintUtils.getColumnNamesForColumns(map.foreignkey.refrenced)
		val referencingColumnNames = ConstraintUtils.getColumnNamesForColumns(map.foreignkey.referencing)
		
		val collection_name = Utils.getCollectionNameFromOutput(map.output)
		val output_field = Utils.getFieldNameFromOutput(map.output)
		val input_table_name = Utils.getTableNameFromReferencedColumn(relDb,map.foreignkey.referencing.get(0))
		val ref_table_name = Utils.getTableNameFromReferencedColumn(relDb,map.foreignkey.refrenced.get(0))
		
		'''
		# %% Nesting object mapping «IF map.name!==null»:«map.name»«ENDIF»
		
		collection_name = '«collection_name»'
		collection = database['«collection_name»']
		
		first_cursor = connection.cursor()
		first_cursor.execute("SELECT «FOR i:0..<referencingColumnNames.size»«referencingColumnNames.get(i)»«IF i != referencingColumnNames.length - 1»,«ENDIF»«ENDFOR» from «input_table_name»")
		rows = first_cursor.fetchall()
		
		for index,i in enumerate(rows):
			if str(i[0])!='None':
				second_cursor = connection.cursor()
				second_cursor.execute("select «FOR i:0..<map.columns.size»«map.columns.get(i).name»«IF i != map.columns.length - 1»,«ENDIF»«ENDFOR» from «ref_table_name» where «FOR i:0..<referencedColumnNames.size»«referencedColumnNames.get(i)» ='"+str(i[«i»])+"'"«IF i != referencedColumnNames.length - 1» AND «ENDIF»)«ENDFOR»                                       
				result = second_cursor.fetchall()
				second_cursor.close()
				
				document={«FOR i:0..<map.fields.size»'«map.fields.get(i).name»' : result[0][«i»]«IF i != map.columns.length - 1»,«ENDIF»«ENDFOR»}		
				new_document = {'«output_field»': document}
				
				if collection.count_documents({}) == index:
					collection.insert_one(new_document)
				else:
					cursor = collection.find()
					count = 0
					for document in cursor:
						count += 1
						if count == index+1:
							collection.update_one({'_id': document['_id']}, {'$set': new_document})
							break
			else:
				new_document = {'«output_field»': None}
				if collection.count_documents({}) == index:
					collection.insert_one(new_document)
				else:
					cursor = collection.find()
					count = 0
					for document in cursor:
						count += 1
						if count == index+1:
							collection.update_one({'_id': document['_id']}, {'$set': new_document})
							break
		first_cursor.close()
		
		'''
	}
}