package xtext.configfile;

import dsl.DslPackage;
import dsl.MongoDb;
import dsl.Options;
import dsl.RelationalDb;
import dsl.impl.DslFactoryImpl;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@SuppressWarnings("all")
public class ConfigFileParser {
  public RelationalDb getRelDbCredentials(final CharSequence xmlContent) {
    try {
      final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder builder = factory.newDocumentBuilder();
      byte[] _bytes = xmlContent.toString().getBytes("UTF-8");
      final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
      final Document document = builder.parse(inputStream);
      final Element configElement = document.getDocumentElement();
      Node _item = configElement.getElementsByTagName("source").item(0);
      final Element sourceElement = ((Element) _item);
      final String sourceHost = this.getElementContent(sourceElement, "host");
      final String sourcePort = this.getElementContent(sourceElement, "port");
      final String sourceDb = this.getElementContent(sourceElement, "db");
      final String sourceUsername = this.getElementContent(sourceElement, "username");
      final String sourcePassword = this.getElementContent(sourceElement, "password");
      final DslFactoryImpl instance = new DslFactoryImpl();
      EObject _create = instance.create(DslPackage.Literals.RELATIONAL_DB);
      RelationalDb relDb = ((RelationalDb) _create);
      relDb.setHost(sourceHost);
      relDb.setPort(sourcePort);
      relDb.setDb(sourceDb);
      relDb.setUsername(sourceUsername);
      relDb.setPassword(sourcePassword);
      return relDb;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public MongoDb getMongoDbCredentials(final CharSequence xmlContent) {
    try {
      final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder builder = factory.newDocumentBuilder();
      byte[] _bytes = xmlContent.toString().getBytes("UTF-8");
      final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
      final Document document = builder.parse(inputStream);
      final Element configElement = document.getDocumentElement();
      Node _item = configElement.getElementsByTagName("target").item(0);
      final Element targetElement = ((Element) _item);
      final String targetHost = this.getElementContent(targetElement, "host");
      final String targetPort = this.getElementContent(targetElement, "port");
      final String targetDb = this.getElementContent(targetElement, "db");
      final String targetUsername = this.getElementContent(targetElement, "username");
      final String targetPassword = this.getElementContent(targetElement, "password");
      final DslFactoryImpl instance = new DslFactoryImpl();
      EObject _create = instance.create(DslPackage.Literals.MONGO_DB);
      MongoDb mongoDb = ((MongoDb) _create);
      mongoDb.setHost(targetHost);
      mongoDb.setPort(targetPort);
      mongoDb.setDb(targetDb);
      mongoDb.setUsername(targetUsername);
      mongoDb.setPassword(targetPassword);
      return mongoDb;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public Options getMigrationOptions(final CharSequence xmlContent) {
    try {
      final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      final DocumentBuilder builder = factory.newDocumentBuilder();
      byte[] _bytes = xmlContent.toString().getBytes("UTF-8");
      final ByteArrayInputStream inputStream = new ByteArrayInputStream(_bytes);
      final Document document = builder.parse(inputStream);
      final Element configElement = document.getDocumentElement();
      Node _item = configElement.getElementsByTagName("options").item(0);
      final Element sourceElement = ((Element) _item);
      final String dTypes = this.getElementContent(sourceElement, "MigrateDataTypes");
      final String addFields = this.getElementContent(sourceElement, "AdditionalFieldsAllowed");
      final DslFactoryImpl instance = new DslFactoryImpl();
      EObject _create = instance.create(DslPackage.Literals.OPTIONS);
      Options options = ((Options) _create);
      options.setDataTypeMigration((Boolean.valueOf(dTypes)).booleanValue());
      options.setAllowAdditionalFields((Boolean.valueOf(addFields)).booleanValue());
      return options;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String getElementContent(final Element parentElement, final String tagName) {
    final NodeList elements = parentElement.getElementsByTagName(tagName);
    int _length = elements.getLength();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      return elements.item(0).getTextContent();
    }
    return "";
  }
}
