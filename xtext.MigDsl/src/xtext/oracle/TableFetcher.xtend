package xtext.oracle

import dsl.DslPackage
import dsl.RelationalDb
import dsl.impl.DslFactoryImpl
import java.sql.DriverManager
import java.sql.SQLException
import dsl.Table
import dsl.Column

class TableFetcher {
	
def RelationalDb fetchTablesAndColumns(RelationalDb relDb) {
  val instance = new DslFactoryImpl()

  val url = "jdbc:oracle:thin:@"+relDb.host+":"+relDb.port+":"+relDb.db
  val username = relDb.username
  val password = relDb.username

  val connection = DriverManager.getConnection(url, username, password)
  val statement = connection.createStatement()

  try {
    val tableQuery = 'SELECT table_name FROM all_tables WHERE OWNER = \''+relDb.username.toUpperCase+'\''
    System.err.println(tableQuery)

    val tableResultSet = statement.executeQuery(tableQuery)

    while (tableResultSet.next()) {
      val tableName = tableResultSet.getString("table_name")
      println("Table: " + tableName)

      var newTable = instance.create(DslPackage.Literals.TABLE) as Table
      newTable.name = tableName

      val columnQuery = 'SELECT column_name FROM all_tab_columns WHERE table_name = \'' + tableName + '\''
      println(columnQuery)
      val columnStatement = connection.createStatement()
      val columnResultSet = columnStatement.executeQuery(columnQuery)

      while (columnResultSet.next()) {
        val columnName = columnResultSet.getString("column_name")
        System.err.println("  Column: " + columnName)

        var newCol = instance.create(DslPackage.Literals.COLUMN) as Column
        newCol.name = columnName
        newTable.columns.add(newCol)
      }

      columnResultSet.close()
      columnStatement.close()

      relDb.tables.add(newTable)
    }

    tableResultSet.close()

  } catch (SQLException e) {
    System.err.println(e.getMessage())
  } finally {
    statement.close()
    connection.close()
  }

  return relDb
}

	  
}