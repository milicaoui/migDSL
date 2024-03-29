/*
 * generated by Xtext 2.27.0
 */
package xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.parser.antlr.internal.InternalMigDslParser;
import xtext.services.MigDslGrammarAccess;

public class MigDslParser extends AbstractAntlrParser {

	@Inject
	private MigDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMigDslParser createParser(XtextTokenStream stream) {
		return new InternalMigDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Migration";
	}

	public MigDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MigDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
