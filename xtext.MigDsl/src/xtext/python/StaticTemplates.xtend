package xtext.python

import dsl.MongoDb
import dsl.RelationalDb

class StaticTemplates {



def static getMongoImport(){
	'''
	from pymongo import MongoClient
	
	'''
}

def static getOracleImport(){
	'''
	import cx_Oracle
	'''
}

def static String getOracleConnection(RelationalDb relDb){

	'''
	connection = cx_Oracle.connect(	
		user="«relDb.username»",
		password="«relDb.password»",
		dsn="«relDb.host»:«relDb.port»/«relDb.db»"
	)	
	'''
}


def static String closeOracleConnection(){
	return 'connection.close()'+'\n'
}


def static String getMongoConnection(MongoDb mongoDb){
	'''
	client = MongoClient('mongodb+srv://«mongoDb.username»:«mongoDb.password»@«mongoDb.host».mongodb.net/&authSource=admin')
	database = client['«mongoDb.db»']
	
	'''
}


}