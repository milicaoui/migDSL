package xtext.oracle


import dsl.RelationalDb
import java.sql.DriverManager
import java.sql.SQLException

class DataTypeFetcher {
	
	def getColumnDataType(String table, String column,RelationalDb relDb){
		
		val url = "jdbc:oracle:thin:@"+relDb.host+":"+relDb.port+":"+relDb.db
		  val username = relDb.username
		  val password = relDb.username
		  
		  try {
				
			 val connection = DriverManager.getConnection(url, username, password)
			 val statement = connection.createStatement()
		  	
		    val nnQuery = "SELECT DATA_TYPE as dtype
						FROM ALL_TAB_COLUMNS
						WHERE TABLE_NAME = '"+table+"'
						AND COLUMN_NAME = '"+column+"'"
				
		    val resultSet = statement.executeQuery(nnQuery)
		    	 while (resultSet.next()){
			      	return resultSet.getString("dtype")
			      }		      	     

	      	
			      		    
					    
			statement.close()
		    connection.close()
				
				} catch (SQLException e) {
		    System.err.println(e.getMessage())
		  } finally {
		  	

		  }
		  return null			
	}
			
	def  getMongoDataType(String oracleDataType) {
    val oracleToMongoDBMapping = newHashMap(
        'VARCHAR2' -> 'string',
        'CHAR' -> 'string',
        'NUMBER' -> 'number',
        'DATE' -> 'string',
        'TIMESTAMP' -> 'string',
        'CLOB' -> 'string',
        'BLOB' -> 'string',
        'FLOAT' -> 'number',
        'BINARY_FLOAT' -> 'number',
        'BINARY_DOUBLE' -> 'number',
        'BOOLEAN' -> 'boolean',
        'RAW' -> 'string',
        'INTERVAL' -> 'string',
        'XMLTYPE' -> 'string',
        'ROWID' -> 'string',
        'ANYDATA' -> 'string'
    )

    
    return oracleToMongoDBMapping.get(oracleDataType)
}			
			
		
}
	

