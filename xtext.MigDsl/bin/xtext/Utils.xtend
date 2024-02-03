package xtext

import dsl.Column
import dsl.DirectMapping
import dsl.Field
import dsl.Mapping
import dsl.Migration
import dsl.MngCollection
import dsl.NestingList
import dsl.NestingObject
import dsl.RelationalDb
import java.util.ArrayList
import java.util.List

class Utils {
	

	
	def static String getTableNameFromReferencedColumn(RelationalDb relationalDb, Column referencedColumn) {
		for (table : relationalDb.tables) {
			for (column : table.columns) {
				if (column === referencedColumn) {
					return table.name
				}
			}
		}
	return null
	}
	
	def static Column getColumnFromTableAndColumnName(RelationalDb relationalDb, String columnName, String tableName) {
		for (table : relationalDb.tables) {
			if (table.name == tableName){
				for (column: table.columns){
					if(column.name == columnName){
						return column
					}
				}
			}
		}
	return null
	}
	
	def static getSourceColumnForField(Field field, Migration migration){
		
		System.err.println("Polje za koje se trazi source column: "+field.name)
		
		var mapping = getMappingForField(field,migration)
		
		if(mapping instanceof DirectMapping){
			
			val mapp = mapping as DirectMapping
			return mapp.column
			
		}else if (mapping instanceof NestingList){
			
			val mapp = mapping as NestingList

			var input_columns = mapp.columns
			var resulting_fields = mapp.fields
			
			for(i:0..<resulting_fields.size){
				if(resulting_fields.get(i)==field){
					println("Source kolona za "+field.name+" je "+input_columns.get(i).name)
					return input_columns.get(i)
				
				}
			}			
			return mapp.columns.get(0)
			
		}else{
			val mapp = mapping as NestingObject

			var input_columns = mapp.columns
			var resulting_fields = mapp.fields
			
			for(i:0..<resulting_fields.size){
				if(resulting_fields.get(i)==field){
					println("Source kolona za "+field.name+" je "+input_columns.get(i).name)
					return input_columns.get(i)
				
				}
			}			
			return mapp.columns.get(0)					
		}
				
	}
	//ustv moze biti da se field zove isto u razlicitim kolekcijama (POPRAVITI)
	
    def static getMappingForField(Field field, Migration migration) {
    	
        for (Mapping mapping: migration.mappings) {

            if (mapping instanceof DirectMapping) {

                if (mapping.output.split('\\.').get(1).equals(field.name)){
                	println("NASAO JE DA SE POLJE "+ field.name+" nalazi u direktnom mapiranju")
                	return mapping
                } 
            }else {
			//u sustini, ja sva mapiranja provjeravam (i za norm polja nested mapiranja(sto mozda i nema smisla ali okej). Ugl ovo bi trebaol samo preskociti)
					if (getParentFieldForChildField(field,migration)!==null){
		            	if (mapping.output.split('\\.').get(1).equals(getParentFieldForChildField(field,migration).name)){
		            		println("NASAO JE DA SE POLJE "+ field.name+" nalazi u nested mapiranju")
		        			return mapping
	            	}					
				}
            }
        }
        return null
    }
    
    def static Field getParentFieldForChildField(Field field, Migration migration){
    	
    	for (Field parentField: getNestedFields(migration)){
    		for(Field nestedField: parentField.fields){
    			if (nestedField === field ) return parentField
    		}
    	}
    	
    }
    def static List<Field> getNestedFields(Migration migration){
    	val myList = new ArrayList<Field>()
    	for (MngCollection col: migration.mongodb.collections){
    		for(Field field: col.fields){
    			if (field.fields.size!=0) myList.add(field)
    		}
    	}   	
    	return myList
    }
    
    def static getCollectionNameFromOutput(String output){
    	val parts = output.split('\\.')
    	return parts.get(0)
    }
    def static getFieldNameFromOutput(String output){
    	val parts = output.split('\\.')
    	return parts.get(1)
    }
}