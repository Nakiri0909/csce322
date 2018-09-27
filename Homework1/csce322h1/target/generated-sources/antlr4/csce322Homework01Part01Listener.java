// Generated from csce322Homework01Part01.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csce322Homework01Part01Parser}.
 */
public interface csce322Homework01Part01Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#dominoes}.
	 * @param ctx the parse tree
	 */
	void enterDominoes(@NotNull csce322Homework01Part01Parser.DominoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#dominoes}.
	 * @param ctx the parse tree
	 */
	void exitDominoes(@NotNull csce322Homework01Part01Parser.DominoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#hands}.
	 * @param ctx the parse tree
	 */
	void enterHands(@NotNull csce322Homework01Part01Parser.HandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#hands}.
	 * @param ctx the parse tree
	 */
	void exitHands(@NotNull csce322Homework01Part01Parser.HandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(@NotNull csce322Homework01Part01Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(@NotNull csce322Homework01Part01Parser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#domino}.
	 * @param ctx the parse tree
	 */
	void enterDomino(@NotNull csce322Homework01Part01Parser.DominoContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#domino}.
	 * @param ctx the parse tree
	 */
	void exitDomino(@NotNull csce322Homework01Part01Parser.DominoContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull csce322Homework01Part01Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull csce322Homework01Part01Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322Homework01Part01Parser#trains}.
	 * @param ctx the parse tree
	 */
	void enterTrains(@NotNull csce322Homework01Part01Parser.TrainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322Homework01Part01Parser#trains}.
	 * @param ctx the parse tree
	 */
	void exitTrains(@NotNull csce322Homework01Part01Parser.TrainsContext ctx);
}