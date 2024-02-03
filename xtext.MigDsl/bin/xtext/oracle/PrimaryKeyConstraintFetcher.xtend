package xtext.oracle

import dsl.DslPackage
import dsl.PrimaryKey
import dsl.RelationalDb
import dsl.impl.DslFactoryImpl
import java.sql.DriverManager
import java.sql.SQLException
import xtext.Utils

class PrimaryKeyConstraintFetcher implements ConstraintFetcher{
	
	override RelationalDb fetchConstraints(RelationalDb relDb) {
		
		  val instance = new DslFactoryImpl()
		//val utils = new Utils()
		
		  val url = "jdbc:oracle:thin:@"+relDb.host+":"+relDb.port+":"+relDb.db
		  val username = relDb.username
		  val password = relDb.username
		
		  val connection = DriverManager.getConnection(url, username, password)
		  val statement = connection.createStatement()
			
		  try {
		  	
		    val pkQuery = "SELECT distinct ac.constraint_name as cname
				FROM user_constraints ac
				JOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name
				WHERE ac.constraint_type = 'P'"
			
			//println(pkQuery)
		
		    val pkResultSet = statement.executeQuery(pkQuery)
		    
		    
    while (pkResultSet.next()) {
    	
      val consName = pkResultSet.getString("cname")
      var newCons = instance.create(DslPackage.Literals.PRIMARY_KEY) as PrimaryKey
      newCons.setName(consName)
     
      val columnQuery = "SELECT acc.column_name as col, acc.table_name as tab
		FROM user_constraints ac
		JOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name
		WHERE ac.constraint_name = '"+consName+"'"
      
      //println(columnQuery)
      val columnStatement = connection.createStatement()
      val columnResultSet = columnStatement.executeQuery(columnQuery)

      while (columnResultSet.next()) {
      	     	
      	val col = columnResultSet.getString("col")
      	val table = columnResultSet.getString("tab")
	
      	newCons.keyColumns.add(Utils.getColumnFromTableAndColumnName(relDb,col,table))
      	//newCons.type = ConstraintType.PRIMARY_KEY;
      }
      columnResultSet.close()
      columnStatement.close()

      relDb.constraints.add(newCons)
    }
		    pkResultSet.close()     
		  } catch (SQLException e) {
		    System.err.println(e.getMessage())
		  } finally {
		    statement.close()
		    connection.close()
		  }
		
		  return relDb			
	}
	
}