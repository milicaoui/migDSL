package xtext.oracle

import dsl.Column
import dsl.DslPackage
import dsl.NotNull
import dsl.RelationalDb
import dsl.Table
import dsl.impl.DslFactoryImpl
import java.sql.DriverManager
import java.sql.SQLException
import xtext.Utils

class NotNullConstraintFetcher implements ConstraintFetcher{
	
	
	
	
	override fetchConstraints(RelationalDb relDb) {
		
		val instance = new DslFactoryImpl()		
		  val url = "jdbc:oracle:thin:@"+relDb.host+":"+relDb.port+":"+relDb.db
		  val username = relDb.username
		  val password = relDb.username
		

	
		
		for (Table table: relDb.tables){
			for(Column column: table.columns){	
				
					
			try {
				
			 val connection = DriverManager.getConnection(url, username, password)
			  val statement = connection.createStatement()
		  	
		    val nnQuery = "SELECT 1
					FROM user_tab_columns
					where nullable = 'N' and table_name='"+table.name+"' and column_name='"+column.name+"'"
			
			//println(nnQuery)
		
		    val nnResultSet = statement.executeQuery(nnQuery)
		    
		    
			      while (nnResultSet.next()) {			      	     
			      	var newCons = instance.create(DslPackage.Literals.NOT_NULL) as NotNull
      				newCons.setName(table.name+'.'+column.name+'-NN')				
			      	newCons.column = Utils.getColumnFromTableAndColumnName(relDb,column.name,table.name)
			      	//newCons.type = ConstraintType.NOT_NULL;
			      	
			      	relDb.constraints.add(newCons)		      	
			      }		    
					    
			statement.close()
		    connection.close()
				
				} catch (SQLException e) {
		    System.err.println(e.getMessage())
		  } finally {
		  	

		  }				
			}
		}

		return relDb
	}
	
	
}