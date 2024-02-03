package xtext.python.schemamigration

import dsl.Column
import dsl.Constraint
import dsl.Field
import dsl.ForeignKey
import dsl.Migration
import dsl.MngCollection
import dsl.NotNull
import dsl.RelationalDb
import dsl.Unique
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.DataProcessor.Util
import xtext.Utils

class ConstraintUtils {
	
	def static List<String> getRequiredFieldsForCollection(MngCollection collection,Migration migration){
		val myList = new ArrayList<String>()
		for (Field field : collection.fields){
			if (field.fields.size==0){
				var sourceColumn = Utils.getSourceColumnForField(field,migration)
				if(checkIfCollumnIsRequired(sourceColumn,migration))
				myList.add(field.name)
				
			}
		}
		return myList
	}
	
	def static List<String> getRequiredFieldsForObject(Field field,Migration migration){
		val myList = new ArrayList<String>()
		for (Field nestedField : field.fields){
			if(nestedField.fields.size==0){
				var sourceColumn = Utils.getSourceColumnForField(nestedField,migration)
				if(checkIfCollumnIsRequired(sourceColumn,migration))
					myList.add(nestedField.name)
			}
		}
		return myList		
	}
	
	def static boolean checkIfCollumnIsRequired(Column col, Migration migration){
		
		for(NotNull cons: getAllNotNullConstraints(migration)){
			if(cons.column===col){
				return true
			}			
		}
		return false
	}
	
	def static List<NotNull> getAllNotNullConstraints(Migration mig){
		val myList = new ArrayList<NotNull>()
		for (Constraint cons: mig.relationaldb.constraints){
		if (cons instanceof NotNull) {
    		val notNullConstraint = cons as NotNull
    		myList.add(notNullConstraint)
    		}
		}
		return myList
	}
	
	def static List<Unique> getAllUniqueConstraints(Migration mig){
		val myList = new ArrayList<Unique>()
		for (Constraint cons: mig.relationaldb.constraints){
		if (cons instanceof Unique) {
    		val notNullConstraint = cons as Unique
    		myList.add(notNullConstraint)
    		}
		}
		return myList
	}
	
	def static List<ForeignKey> getAllForeignKeyConstraints(RelationalDb relDb){
		val myList = new ArrayList<ForeignKey>()
		for (Constraint cons: relDb.constraints){
		if (cons instanceof ForeignKey) {
    		val notNullConstraint = cons as ForeignKey
    		myList.add(notNullConstraint)
    		}
		}
		return myList
	}
	
	def static List<String> getColumnNamesForColumns(List<Column> columns){		
		val ret = new ArrayList<String>()
		for(Column col: columns){
			ret.add(col.name)
		}		
		return ret
	}
	
	def static List<String> getReferencedColumnNamesForNestingList(ForeignKey foreignKey, RelationalDb relationalDb){
	//dobavi dr strani kljuc (mora biti spojna tabela)// mozda uvesti ogranicenje da  koji se referencira u nesting list mora biti jedan od dva u spojnoj tabeli
	
	//dobavi tabelu spojnu, dobavi sve strane kljuceve od nje i uzmi onaj koji nije ovaj!
		val referencingColumn = foreignKey.referencing
		var tableName = Utils.getTableNameFromReferencedColumn(relationalDb,referencingColumn.get(0))
		var fkeys = getForeignKeysForTable(tableName, relationalDb)

		for (i:0..<fkeys.size){
			if (fkeys.get(i)!==foreignKey) return getColumnNamesForColumns(fkeys.get(i).refrenced)
			
		}
		
		return null
	}	
	def static List<ForeignKey> getForeignKeysForTable(String tableName, RelationalDb relationalDb){
		val ret = new ArrayList<ForeignKey>()
			//prolaz kroz listu svih fkeys, pa listu svih referencing kolona tog constrainta, pa get table from column	
		for (ForeignKey fkey: getAllForeignKeyConstraints(relationalDb)){
			for(Column col: fkey.referencing){
				val referencingTableName = Utils.getTableNameFromReferencedColumn(relationalDb,col)
				if (referencingTableName.equals(tableName)){
					ret.add(fkey)
				}
			}
		}	
		return ret
	}
	
}