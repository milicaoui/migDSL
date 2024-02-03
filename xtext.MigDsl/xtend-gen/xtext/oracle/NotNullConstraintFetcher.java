package xtext.oracle;

import dsl.Column;
import dsl.DslPackage;
import dsl.NotNull;
import dsl.RelationalDb;
import dsl.Table;
import dsl.impl.DslFactoryImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import xtext.Utils;

@SuppressWarnings("all")
public class NotNullConstraintFetcher implements ConstraintFetcher {
  @Override
  public RelationalDb fetchConstraints(final RelationalDb relDb) {
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
    EList<Table> _tables = relDb.getTables();
    for (final Table table : _tables) {
      EList<Column> _columns = table.getColumns();
      for (final Column column : _columns) {
        try {
          final Connection connection = DriverManager.getConnection(url, username, password);
          final Statement statement = connection.createStatement();
          String _name = table.getName();
          String _plus_4 = ("SELECT 1\r\n\t\t\t\t\tFROM user_tab_columns\r\n\t\t\t\t\twhere nullable = \'N\' and table_name=\'" + _name);
          String _plus_5 = (_plus_4 + "\' and column_name=\'");
          String _name_1 = column.getName();
          String _plus_6 = (_plus_5 + _name_1);
          final String nnQuery = (_plus_6 + "\'");
          final ResultSet nnResultSet = statement.executeQuery(nnQuery);
          while (nnResultSet.next()) {
            {
              EObject _create = instance.create(DslPackage.Literals.NOT_NULL);
              NotNull newCons = ((NotNull) _create);
              String _name_2 = table.getName();
              String _plus_7 = (_name_2 + ".");
              String _name_3 = column.getName();
              String _plus_8 = (_plus_7 + _name_3);
              String _plus_9 = (_plus_8 + "-NN");
              newCons.setName(_plus_9);
              newCons.setColumn(Utils.getColumnFromTableAndColumnName(relDb, column.getName(), table.getName()));
              relDb.getConstraints().add(newCons);
            }
          }
          statement.close();
          connection.close();
        } catch (final Throwable _t) {
          if (_t instanceof SQLException) {
            final SQLException e = (SQLException)_t;
            System.err.println(e.getMessage());
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        } finally {
        }
      }
    }
    return relDb;
  }
}
