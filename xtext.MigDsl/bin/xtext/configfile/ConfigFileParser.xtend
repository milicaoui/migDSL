package xtext.configfile;

import dsl.impl.DslFactoryImpl
import dsl.DslPackage

import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element
import java.io.ByteArrayInputStream
import dsl.RelationalDb
import dsl.MongoDb
import dsl.Options

class ConfigFileParser {
	
	
	
def getRelDbCredentials(CharSequence xmlContent) {
	
    val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val inputStream = new ByteArrayInputStream(xmlContent.toString().getBytes("UTF-8"))
    val document = builder.parse(inputStream)

 val configElement = document.getDocumentElement()
    
    // Source element
    val sourceElement = configElement.getElementsByTagName("source").item(0) as Element
    val sourceHost = getElementContent(sourceElement, "host")
    val sourcePort = getElementContent(sourceElement, "port")
    val sourceDb = getElementContent(sourceElement, "db")
    val sourceUsername = getElementContent(sourceElement, "username")
    val sourcePassword = getElementContent(sourceElement, "password")
    
    	val instance = new DslFactoryImpl()
		
		var relDb = instance.create(DslPackage.Literals.RELATIONAL_DB) as RelationalDb;
		relDb.host = sourceHost
		relDb.port = sourcePort
		relDb.db = sourceDb
		relDb.username = sourceUsername
		relDb.password = sourcePassword
		
		return relDb
}


def getMongoDbCredentials(CharSequence xmlContent) {
	
   val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val inputStream = new ByteArrayInputStream(xmlContent.toString().getBytes("UTF-8"))
    val document = builder.parse(inputStream)

 val configElement = document.getDocumentElement()
    
    // Target element
    val targetElement = configElement.getElementsByTagName("target").item(0) as Element
    val targetHost = getElementContent(targetElement, "host")
    val targetPort = getElementContent(targetElement, "port")
    val targetDb = getElementContent(targetElement, "db")
    val targetUsername = getElementContent(targetElement, "username")
    val targetPassword = getElementContent(targetElement, "password")
    
    	val instance = new DslFactoryImpl()
		
		var mongoDb = instance.create(DslPackage.Literals.MONGO_DB) as MongoDb;
		mongoDb.host = targetHost
		mongoDb.port = targetPort
		mongoDb.db = targetDb
		mongoDb.username = targetUsername
		mongoDb.password = targetPassword
		
		return mongoDb
}

def getMigrationOptions(CharSequence xmlContent){
	
   val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val inputStream = new ByteArrayInputStream(xmlContent.toString().getBytes("UTF-8"))
    val document = builder.parse(inputStream)

 val configElement = document.getDocumentElement()
    
    // Target element
    val sourceElement = configElement.getElementsByTagName("options").item(0) as Element
    val dTypes = getElementContent(sourceElement, "MigrateDataTypes")
    val addFields = getElementContent(sourceElement, "AdditionalFieldsAllowed")
    
    	val instance = new DslFactoryImpl()
		
		var options = instance.create(DslPackage.Literals.OPTIONS) as Options;
		options.dataTypeMigration = Boolean::valueOf(dTypes)
		options.allowAdditionalFields = Boolean::valueOf(addFields)
		
		return options
}

def String getElementContent(Element parentElement, String tagName) {
    val elements = parentElement.getElementsByTagName(tagName)
    if (elements.getLength() > 0) {
        return elements.item(0).getTextContent()
    }
    return ""
}
	
	
	
	
	
	
}