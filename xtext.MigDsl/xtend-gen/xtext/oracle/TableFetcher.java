package xtext.oracle;

import dsl.Column;
import dsl.DslPackage;
import dsl.RelationalDb;
import dsl.Table;
import dsl.impl.DslFactoryImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class TableFetcher {
  public RelationalDb fetchTablesAndColumns(final RelationalDb relDb) {
    try {
      final DslFactoryImpl instance = new DslFactoryImpl();
      String _host = relDb.getHost();
      String _plus = ("jdbc:oracle:thin:@" + _host);
      String _plus_1 = (_plus + ":");
      String _port = relDb.getPort();
      String _plus_2 = (_plus_1 + _port);
      String _plus_3 = (_plus_2 + ":");
      String _db = relDb.getDb();
      final String url = (_plus_3 + _db);
      final String username = relDb.getUsername();
      final String password = relDb.getUsername();
      final Connection connection = DriverManager.getConnection(url, username, password);
      final Statement statement = connection.createStatement();
      try {
        String _upperCase = relDb.getUsername().toUpperCase();
        String _plus_4 = ("SELECT table_name FROM all_tables WHERE OWNER = \'" + _upperCase);
        final String tableQuery = (_plus_4 + "\'");
        System.err.println(tableQuery);
        final ResultSet tableResultSet = statement.executeQuery(tableQuery);
        while (tableResultSet.next()) {
          {
            final String tableName = tableResultSet.getString("table_name");
            InputOutput.<String>println(("Table: " + tableName));
            EObject _create = instance.create(DslPackage.Literals.TABLE);
            Table newTable = ((Table) _create);
            newTable.setName(tableName);
            final String columnQuery = (("SELECT column_name FROM all_tab_columns WHERE table_name = \'" + tableName) + "\'");
            InputOutput.<String>println(columnQuery);
            final Statement columnStatement = connection.createStatement();
            final ResultSet columnResultSet = columnStatement.executeQuery(columnQuery);
            while (columnResultSet.next()) {
              {
                final String columnName = columnResultSet.getString("column_name");
                System.err.println(("  Column: " + columnName));
                EObject _create_1 = instance.create(DslPackage.Literals.COLUMN);
                Column newCol = ((Column) _create_1);
                newCol.setName(columnName);
                newTable.getColumns().add(newCol);
              }
            }
            columnResultSet.close();
            columnStatement.close();
            relDb.getTables().add(newTable);
          }
        }
        tableResultSet.close();
      } catch (final Throwable _t) {
        if (_t instanceof SQLException) {
          final SQLException e = (SQLException)_t;
          System.err.println(e.getMessage());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      } finally {
        statement.close();
        connection.close();
      }
      return relDb;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
