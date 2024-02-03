package xtext.python

import dsl.Column
import dsl.Field
import dsl.Migration
import dsl.MngCollection
import dsl.Unique
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import xtext.Utils
import xtext.python.schemamigration.ConstraintUtils

class IndexGenerator {
	
	def static generateIndexesForCollection(MngCollection collection,Migration migration){
		
		val map = getUniqueFieldsForCollection(collection,migration)
		'''
		
		«FOR entry : map.entrySet()»
		collection = database['«collection.name»']
		«IF entry.value.size==1»
		collection.create_index("«entry.value.get(0)»", unique=True)
		«ELSE»
		collection.create_index([«FOR i:0..<entry.value.size»("«entry.value.get(i)»",1)«IF i != entry.value.length - 1»,«ENDIF»«ENDFOR»], unique=True)
		«ENDIF»
		«ENDFOR»
		'''
	}
	
	def static HashMap<String, List<String>> getUniqueFieldsForCollection(MngCollection collection,Migration migration){
		
		val map = new HashMap<String, List<String>>()
		
		var uniqueCons = ConstraintUtils.getAllUniqueConstraints(migration)
		for(Unique unique: uniqueCons){
			if (checkIfUniqueConstraintApplies(unique,collection,migration)){
				map.put(unique.name, getFieldNames(unique,collection,migration))
			}
		}
		return map			
	}
	
	def static List<String> getFieldNames(Unique unique, MngCollection collection, Migration migration){
		
		var sourceCols = getSourceColListForCollection(collection,migration)
		val indices = newArrayList
		
		  for (Column col : unique.uniqueColumns) {
		    val index = sourceCols.indexOf(col)
		    if (index >= 0) {//mada ne bi nikada trebalo da se desi jer je kao provjereno
		      indices.add(index)
		    }
		  }
		  var fields = new ArrayList<String>()
		  for (i: indices) fields.add(collection.fields.get(i).name)
		  return fields
	}
		
	def static boolean checkIfUniqueConstraintApplies(Unique unique, MngCollection collection, Migration migration){
		
		val sourceCols= getSourceColListForCollection(collection,migration)
		  for (Column col : unique.uniqueColumns) {
		    if (!sourceCols.contains(col)) {
		      return false
		    }
		  }
		  return true
	}
	
	def static List<Column> getSourceColListForCollection(MngCollection collection, Migration migration){
		val myList = new ArrayList<Column>()
		for(Field field: collection.fields){
			if(field.fields.size==0){
				myList.add(Utils.getSourceColumnForField(field,migration))
			}else{
				myList.add(null)//potrebno jako (cooresponding indexes)
			}
		}		
		return myList
	}
	
}