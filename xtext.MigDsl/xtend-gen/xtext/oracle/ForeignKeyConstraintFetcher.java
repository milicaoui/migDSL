package xtext.oracle;

import dsl.DslPackage;
import dsl.ForeignKey;
import dsl.RelationalDb;
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
public class ForeignKeyConstraintFetcher implements ConstraintFetcher {
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
        final String pkQuery = "SELECT distinct ac.constraint_name as cname\r\n\t\t\t\tFROM user_constraints ac\r\n\t\t\t\tJOIN user_cons_columns acc ON ac.constraint_name = acc.constraint_name\r\n\t\t\t\tWHERE ac.constraint_type = \'R\'";
        final ResultSet pkResultSet = statement.executeQuery(pkQuery);
        while (pkResultSet.next()) {
          {
            final String consName = pkResultSet.getString("cname");
            EObject _create = instance.create(DslPackage.Literals.FOREIGN_KEY);
            ForeignKey newCons = ((ForeignKey) _create);
            newCons.setName(consName);
            final String columnQuery = (("SELECT\r\n\t\t\t    a.table_name AS referencing_table,\r\n\t\t\t    a.column_name AS referencing_column,\r\n\t\t\t    b.table_name AS referenced_table,\r\n\t\t\t    b.column_name AS referenced_column\r\n\t\t\tFROM\r\n\t\t\t    all_cons_columns a\r\n\t\t\t    JOIN all_constraints c ON a.constraint_name = c.constraint_name\r\n\t\t\t    JOIN all_cons_columns b ON c.r_constraint_name = b.constraint_name\r\n\t\t\tWHERE\r\n\t\t\t    c.constraint_type = \'R\'\r\n\t\t\t    AND a.constraint_name = \'" + consName) + "\'");
            InputOutput.<String>println(columnQuery);
            final Statement columnStatement = connection.createStatement();
            final ResultSet columnResultSet = columnStatement.executeQuery(columnQuery);
            while (columnResultSet.next()) {
              {
                final String referencing_table = columnResultSet.getString("referencing_table");
                final String referencing_column = columnResultSet.getString("referencing_column");
                final String referenced_table = columnResultSet.getString("referenced_table");
                final String referenced_column = columnResultSet.getString("referenced_column");
                newCons.getRefrenced().add(Utils.getColumnFromTableAndColumnName(relDb, referenced_column, referenced_table));
                newCons.getReferencing().add(Utils.getColumnFromTableAndColumnName(relDb, referencing_column, referencing_table));
              }
            }
            columnResultSet.close();
            columnStatement.close();
            relDb.getConstraints().add(newCons);
          }
        }
        pkResultSet.close();
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
