package xtext.oracle;

import dsl.DslPackage;
import dsl.RelationalDb;
import dsl.Unique;
import dsl.impl.DslFactoryImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xtext.Utils;

@SuppressWarnings("all")
public class UniqueConstraintFetcher implements ConstraintFetcher {
  @Override
  public RelationalDb fetchConstraints(final RelationalDb relDb) {
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
        final String uniqueConsQuery = "SELECT distinct ac.constraint_name as cname\r\n\t\tFROM user_constraints ac\r\n\t\tJOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name\r\n\t\tWHERE ac.constraint_type = \'U\'";
        InputOutput.<String>println(uniqueConsQuery);
        final ResultSet ucResultSet = statement.executeQuery(uniqueConsQuery);
        while (ucResultSet.next()) {
          {
            final String consName = ucResultSet.getString("cname");
            EObject _create = instance.create(DslPackage.Literals.UNIQUE);
            Unique newCons = ((Unique) _create);
            newCons.setName(consName);
            final String columnQuery = (("SELECT acc.column_name as col, acc.table_name as tab\r\n\t\tFROM user_constraints ac\r\n\t\tJOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name\r\n\t\tWHERE ac.constraint_name = \'" + consName) + "\'");
            InputOutput.<String>println(columnQuery);
            final Statement columnStatement = connection.createStatement();
            final ResultSet columnResultSet = columnStatement.executeQuery(columnQuery);
            while (columnResultSet.next()) {
              {
                final String col = columnResultSet.getString("col");
                final String table = columnResultSet.getString("tab");
                newCons.getUniqueColumns().add(Utils.getColumnFromTableAndColumnName(relDb, col, table));
              }
            }
            columnResultSet.close();
            columnStatement.close();
            relDb.getConstraints().add(newCons);
          }
        }
        ucResultSet.close();
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
