package xtext.python.datamigration

import dsl.DirectMapping
import dsl.Mapping
import dsl.RelationalDb
import xtext.Utils

class DirectMappingGenerator {
	
	def String getDirectMappingContent(Mapping mapping, RelationalDb relDb){
		
		val map = mapping as DirectMapping
		
		val input_table_name = Utils.getTableNameFromReferencedColumn(relDb, map.column)
		val collection_name = Utils.getCollectionNameFromOutput(map.output)
		val output_field = Utils.getFieldNameFromOutput(map.output)
		
		'''	
		# %% Direct mapping of «map.column.name»«IF map.name!==null»:«map.name»«ENDIF»
		
		cursor = connection.cursor()
		cursor.execute("SELECT «map.column.name» FROM «input_table_name»")
		rows = cursor.fetchall()
		cursor.close()
			
		simple_list = []
		simple_list = [item[0] for item in rows]

		collection = database['«collection_name»']
		
		for index,i in enumerate(simple_list):
			new_document = {"«output_field»": i}		
			
			if collection.count_documents({}) == index:
				collection.insert_one(new_document)
			else:
				cursor = collection.find()
				count = 0
				for document in cursor:
					count += 1
					if count == index+1:		
						collection.update_one({'_id': document['_id']}, {'$set': new_document})
						
		'''
	}
}
