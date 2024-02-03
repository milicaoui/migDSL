package xtext.python;

import dsl.MongoDb;
import dsl.RelationalDb;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class StaticTemplates {
  public static CharSequence getMongoImport() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from pymongo import MongoClient");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }

  public static CharSequence getOracleImport() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import cx_Oracle");
    _builder.newLine();
    return _builder;
  }

  public static String getOracleConnection(final RelationalDb relDb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("connection = cx_Oracle.connect(\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("user=\"");
    String _username = relDb.getUsername();
    _builder.append(_username, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("password=\"");
    String _password = relDb.getPassword();
    _builder.append(_password, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("dsn=\"");
    String _host = relDb.getHost();
    _builder.append(_host, "\t");
    _builder.append(":");
    String _port = relDb.getPort();
    _builder.append(_port, "\t");
    _builder.append("/");
    String _db = relDb.getDb();
    _builder.append(_db, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append(")\t");
    _builder.newLine();
    return _builder.toString();
  }

  public static String closeOracleConnection() {
    return ("connection.close()" + "\n");
  }

  public static String getMongoConnection(final MongoDb mongoDb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("client = MongoClient(\'mongodb+srv://");
    String _username = mongoDb.getUsername();
    _builder.append(_username);
    _builder.append(":");
    String _password = mongoDb.getPassword();
    _builder.append(_password);
    _builder.append("@");
    String _host = mongoDb.getHost();
    _builder.append(_host);
    _builder.append(".mongodb.net/&authSource=admin\')");
    _builder.newLineIfNotEmpty();
    _builder.append("database = client[\'");
    String _db = mongoDb.getDb();
    _builder.append(_db);
    _builder.append("\']");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
}
