package xtext.oracle

import dsl.DslPackage
import dsl.ForeignKey
import dsl.RelationalDb
import dsl.impl.DslFactoryImpl
import java.sql.DriverManager
import java.sql.SQLException
import xtext.Utils

class ForeignKeyConstraintFetcher implements ConstraintFetcher{
	
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
				WHERE ac.constraint_type = 'R'"
			
			//println(pkQuery)
		
		    val pkResultSet = statement.executeQuery(pkQuery)
		    
		    
    while (pkResultSet.next()) {
    	
      val consName = pkResultSet.getString("cname")
      var newCons = instance.create(DslPackage.Literals.FOREIGN_KEY) as ForeignKey
      	newCons.setName(consName)
     
      val columnQuery = "SELECT
			    a.table_name AS referencing_table,
			    a.column_name AS referencing_column,
			    b.table_name AS referenced_table,
			    b.column_name AS referenced_column
			FROM
			    all_cons_columns a
			    JOIN all_constraints c ON a.constraint_name = c.constraint_name
			    JOIN all_cons_columns b ON c.r_constraint_name = b.constraint_name
			WHERE
			    c.constraint_type = 'R'
			    AND a.constraint_name = '"+consName+"'"

 
      println(columnQuery)
      val columnStatement = connection.createStatement()
      val columnResultSet = columnStatement.executeQuery(columnQuery)

      while (columnResultSet.next()) {
      	     	
      	val referencing_table = columnResultSet.getString("referencing_table")
      	val referencing_column = columnResultSet.getString("referencing_column")
      	
       	val referenced_table = columnResultSet.getString("referenced_table")
      	val referenced_column = columnResultSet.getString("referenced_column")     	
	
      	newCons.refrenced.add(Utils.getColumnFromTableAndColumnName(relDb,referenced_column,referenced_table))
       	newCons.referencing.add(Utils.getColumnFromTableAndColumnName(relDb,referencing_column,referencing_table))
       	   	
      	//newCons.type = ConstraintType.FOREIGN_KEY;
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