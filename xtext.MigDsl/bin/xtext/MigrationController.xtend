package xtext

import dsl.DirectMapping
import dsl.DslPackage
import dsl.Field
import dsl.FieldType
import dsl.Migration
import dsl.MngCollection
import dsl.NestingList
import dsl.NestingObject
import dsl.impl.DslFactoryImpl

class MigrationController {
	
		def static Migration updateMigration(Migration migration){
		//todo: fix, ne radi za dalje ugnjezdavanja od levela (IPAK MNOGO KOMPLEKSNIJI PROBLEM)
		
		
		val instance = new DslFactoryImpl()
		val mongo = migration.mongodb
		
		for(mapping: migration.mappings){
			
				val output = mapping.output
		    	val parts = output.split('\\.')					
				val collection_name = parts.get(0)
				val output_field = parts.get(1)
				val newCollection = instance.create(DslPackage.Literals.MNG_COLLECTION) as MngCollection
				newCollection.name = collection_name
			
			if (mapping instanceof DirectMapping){
				
				val collectionExists = mongo.collections.exists[ c | c.name == collection_name ]
				
				if (!collectionExists) {
					
				    val newField = instance.create(DslPackage.Literals.FIELD) as Field
				    newField.name = output_field
				    newCollection.fields.add(newField)
				    mongo.collections.add(newCollection)
				    
				} else {
				    val existingCollection = mongo.collections.findFirst[ c | c.name == collection_name ]
				    
				    if (existingCollection !== null) {
				    	
				        val fieldExists = existingCollection.fields.exists[ f | f.name == output_field ]
				        
				        if (!fieldExists) {
				            val newField = instance.create(DslPackage.Literals.FIELD) as Field
				            newField.name = output_field
				            existingCollection.fields.add(newField)
				        } else {
				            // Field already exists, handle the case accordingly
				            // You can choose to ignore, update, or perform any other desired action
				        }
				    } else {
				        // Handle the case where the collection was not found
				    }
				}
			
			}else if (mapping instanceof NestingObject){
				
				//OSTALE VRSTE MAPIRANJA
				val mapp = mapping as NestingObject
				
				val collectionExists = mongo.collections.exists[ c | c.name == collection_name ]
				
					var input_columns = mapp.columns
					var output_fields = mapp.fields		
				
				if (!collectionExists) {
					
					//KADA SE MAPIRANJE TEK NAPRAVI NE POSTOJI REF FIELDS PA GA MI SADA NAPRAVIMO (SAMO AKO VEC NE POSTOJI)
					
					
					//ako kolekcija ne postoji, onda sig ni polje ne postoji
					val newField = instance.create(DslPackage.Literals.FIELD) as Field
				    newField.name = output_field
					
					for (i:output_fields.size..<input_columns.size){
						
					    val field = instance.create(DslPackage.Literals.FIELD) as Field
					    field.name = input_columns.get(i).name
					    
					    field.type=FieldType.OBJECT_FIELD
					    
					    newField.fields.add(field)
					    
					    mapp.fields.add(field)
					
					}
					
					newCollection.fields.add(newField)				    
				    mongo.collections.add(newCollection)
				    
				} else {
				    val existingCollection = mongo.collections.findFirst[ c | c.name == collection_name ]
				    
				    if (existingCollection !== null) {
				    	
				        val fieldExists = existingCollection.fields.exists[ f | f.name == output_field ]
				        
				        if (!fieldExists) {

							val newField = instance.create(DslPackage.Literals.FIELD) as Field
						    newField.name = output_field
							
							for (i:output_fields.size..<input_columns.size){
								
							    val field = instance.create(DslPackage.Literals.FIELD) as Field
							    field.name = input_columns.get(i).name
							    field.type=FieldType.OBJECT_FIELD
							    newField.fields.add(field)
							    
							    mapp.fields.add(field)				
							}				            
				            
				            
				            existingCollection.fields.add(newField)			            
				            
				        } else {
				            // Field already exists, handle the case accordingly
				            // You can choose to ignore, update, or perform any other desired action
				        }
				    } else {
				        // Handle the case where the collection was not found
				    }
				}
			}
			else{
				
				//OSTALE VRSTE MAPIRANJA
				val mapp = mapping as NestingList
				
				val collectionExists = mongo.collections.exists[ c | c.name == collection_name ]
				
					var input_columns = mapp.columns
					var output_fields = mapp.fields		
				
				if (!collectionExists) {
					
					//KADA SE MAPIRANJE TEK NAPRAVI NE POSTOJI REF FIELDS PA GA MI SADA NAPRAVIMO (SAMO AKO VEC NE POSTOJI)
					
					
					//ako kolekcija ne postoji, onda sig ni polje ne postoji
					val newField = instance.create(DslPackage.Literals.FIELD) as Field
				    newField.name = output_field
					
					for (i:output_fields.size..<input_columns.size){
						
					    val field = instance.create(DslPackage.Literals.FIELD) as Field
					    field.name = input_columns.get(i).name
					    
					    field.type=FieldType.OBJECT_FIELD
					    
					    newField.fields.add(field)
					    
					    mapp.fields.add(field)
					
					}
					
					newCollection.fields.add(newField)				    
				    mongo.collections.add(newCollection)
				    
				} else {
				    val existingCollection = mongo.collections.findFirst[ c | c.name == collection_name ]
				    
				    if (existingCollection !== null) {
				    	
				        val fieldExists = existingCollection.fields.exists[ f | f.name == output_field ]
				        
				        if (!fieldExists) {

							val newField = instance.create(DslPackage.Literals.FIELD) as Field
						    newField.name = output_field
							
							for (i:output_fields.size..<input_columns.size){
								
							    val field = instance.create(DslPackage.Literals.FIELD) as Field
							    field.name = input_columns.get(i).name
							    field.type=FieldType.OBJECT_FIELD
							    newField.fields.add(field)
							    
							    mapp.fields.add(field)				
							}				            
				            
				            
				            existingCollection.fields.add(newField)			            
				            
				        } else {
				            // Field already exists, handle the case accordingly
				            // You can choose to ignore, update, or perform any other desired action
				        }
				    } else {
				        // Handle the case where the collection was not found
				    }
				}				
				
				
				
				
			}
		}
		migration.mongodb = mongo
		return migration;	
	}
}