package xtext.oracle;

import dsl.RelationalDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class DataTypeFetcher {
  public String getColumnDataType(final String table, final String column, final RelationalDb relDb) {
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
    try {
      final Connection connection = DriverManager.getConnection(url, username, password);
      final Statement statement = connection.createStatement();
      final String nnQuery = (((("SELECT DATA_TYPE as dtype\r\n\t\t\t\t\t\tFROM ALL_TAB_COLUMNS\r\n\t\t\t\t\t\tWHERE TABLE_NAME = \'" + table) + "\'\r\n\t\t\t\t\t\tAND COLUMN_NAME = \'") + column) + "\'");
      final ResultSet resultSet = statement.executeQuery(nnQuery);
      while (resultSet.next()) {
        return resultSet.getString("dtype");
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
    return null;
  }

  public String getMongoDataType(final String oracleDataType) {
    Pair<String, String> _mappedTo = Pair.<String, String>of("VARCHAR2", "string");
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("CHAR", "string");
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("NUMBER", "number");
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("DATE", "string");
    Pair<String, String> _mappedTo_4 = Pair.<String, String>of("TIMESTAMP", "string");
    Pair<String, String> _mappedTo_5 = Pair.<String, String>of("CLOB", "string");
    Pair<String, String> _mappedTo_6 = Pair.<String, String>of("BLOB", "string");
    Pair<String, String> _mappedTo_7 = Pair.<String, String>of("FLOAT", "number");
    Pair<String, String> _mappedTo_8 = Pair.<String, String>of("BINARY_FLOAT", "number");
    Pair<String, String> _mappedTo_9 = Pair.<String, String>of("BINARY_DOUBLE", "number");
    Pair<String, String> _mappedTo_10 = Pair.<String, String>of("BOOLEAN", "boolean");
    Pair<String, String> _mappedTo_11 = Pair.<String, String>of("RAW", "string");
    Pair<String, String> _mappedTo_12 = Pair.<String, String>of("INTERVAL", "string");
    Pair<String, String> _mappedTo_13 = Pair.<String, String>of("XMLTYPE", "string");
    Pair<String, String> _mappedTo_14 = Pair.<String, String>of("ROWID", "string");
    Pair<String, String> _mappedTo_15 = Pair.<String, String>of("ANYDATA", "string");
    final HashMap<String, String> oracleToMongoDBMapping = CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8, _mappedTo_9, _mappedTo_10, _mappedTo_11, _mappedTo_12, _mappedTo_13, _mappedTo_14, _mappedTo_15);
    return oracleToMongoDBMapping.get(oracleDataType);
  }
}
