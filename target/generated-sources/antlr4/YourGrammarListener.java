// Generated from YourGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YourGrammarParser}.
 */
public interface YourGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YourGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YourGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#windmill_statement}.
	 * @param ctx the parse tree
	 */
	void enterWindmill_statement(YourGrammarParser.Windmill_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#windmill_statement}.
	 * @param ctx the parse tree
	 */
	void exitWindmill_statement(YourGrammarParser.Windmill_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statements(YourGrammarParser.Block_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statements(YourGrammarParser.Block_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YourGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YourGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(YourGrammarParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(YourGrammarParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#equivalence_statement}.
	 * @param ctx the parse tree
	 */
	void enterEquivalence_statement(YourGrammarParser.Equivalence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#equivalence_statement}.
	 * @param ctx the parse tree
	 */
	void exitEquivalence_statement(YourGrammarParser.Equivalence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(YourGrammarParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(YourGrammarParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(YourGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(YourGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#gust_expression}.
	 * @param ctx the parse tree
	 */
	void enterGust_expression(YourGrammarParser.Gust_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#gust_expression}.
	 * @param ctx the parse tree
	 */
	void exitGust_expression(YourGrammarParser.Gust_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#whirl_term}.
	 * @param ctx the parse tree
	 */
	void enterWhirl_term(YourGrammarParser.Whirl_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#whirl_term}.
	 * @param ctx the parse tree
	 */
	void exitWhirl_term(YourGrammarParser.Whirl_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#whirl_factor}.
	 * @param ctx the parse tree
	 */
	void enterWhirl_factor(YourGrammarParser.Whirl_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#whirl_factor}.
	 * @param ctx the parse tree
	 */
	void exitWhirl_factor(YourGrammarParser.Whirl_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YourGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(YourGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link YourGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(YourGrammarParser.IdentifierContext ctx);
}