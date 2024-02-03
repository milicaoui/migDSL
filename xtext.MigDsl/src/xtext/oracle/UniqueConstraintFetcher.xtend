package xtext.oracle

import dsl.DslPackage
import dsl.RelationalDb
import dsl.Unique
import dsl.impl.DslFactoryImpl
import java.sql.DriverManager
import java.sql.SQLException
import xtext.Utils

class UniqueConstraintFetcher implements ConstraintFetcher{

override  RelationalDb fetchConstraints(RelationalDb relDb) {
  val instance = new DslFactoryImpl()
	//val utils = new Utils()

  val url = "jdbc:oracle:thin:@"+relDb.host+":"+relDb.port+":"+relDb.db
  val username = relDb.username
  val password = relDb.username

  val connection = DriverManager.getConnection(url, username, password)
  val statement = connection.createStatement()
	
  try {
  	
  	//UNIQUE
  		 	
    val uniqueConsQuery = "SELECT distinct ac.constraint_name as cname
		FROM user_constraints ac
		JOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name
		WHERE ac.constraint_type = 'U'"
	
	println(uniqueConsQuery)

    val ucResultSet = statement.executeQuery(uniqueConsQuery)

    while (ucResultSet.next()) {
    	
      val consName = ucResultSet.getString("cname")
      var newCons = instance.create(DslPackage.Literals.UNIQUE) as Unique
      newCons.setName(consName)
     
     
      val columnQuery = "SELECT acc.column_name as col, acc.table_name as tab
		FROM user_constraints ac
		JOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name
		WHERE ac.constraint_name = '"+consName+"'"
      
      println(columnQuery)
      val columnStatement = connection.createStatement()
      val columnResultSet = columnStatement.executeQuery(columnQuery)

      while (columnResultSet.next()) {
      	     	
      	val col = columnResultSet.getString("col")
      	val table = columnResultSet.getString("tab")

      	newCons.uniqueColumns.add(Utils.getColumnFromTableAndColumnName(relDb,col,table))
      	//newCons.type = ConstraintType.UNIQUE;
      }
      columnResultSet.close()
      columnStatement.close()

      relDb.constraints.add(newCons)
    }
    ucResultSet.close()
    
  } catch (SQLException e) {
    System.err.println(e.getMessage())
  } finally {
    statement.close()
    connection.close()
  }

  return relDb
}

}