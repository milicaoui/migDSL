package xtext.oracle

import dsl.RelationalDb

interface ConstraintFetcher {
	
	def RelationalDb fetchConstraints(RelationalDb reldb)
}