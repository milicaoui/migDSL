package xtext.oracle;

import dsl.RelationalDb;

@SuppressWarnings("all")
public interface ConstraintFetcher {
  RelationalDb fetchConstraints(final RelationalDb reldb);
}
