// Generated from D:/code/test_antlr/xxx\Expr.g4 by ANTLR 4.7
package Expr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInit}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInit(ExprParser.ArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(ExprParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(ExprParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(ExprParser.AssignArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayIndex}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayIndex(ExprParser.AssignArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#forStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatment(ExprParser.ForStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#whileStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatment(ExprParser.WhileStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ExprParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#scopeStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeStatment(ExprParser.ScopeStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionDefExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefExpr(ExprParser.FunctionDefExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#returnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment(ExprParser.ReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionDefParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefParams(ExprParser.FunctionDefParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(ExprParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParams(ExprParser.FunctionCallParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(ExprParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#classInnerDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInnerDef(ExprParser.ClassInnerDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classvar}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvar(ExprParser.ClassvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classAssign}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAssign(ExprParser.ClassAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classfuncall}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassfuncall(ExprParser.ClassfuncallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(ExprParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(ExprParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(ExprParser.CContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(ExprParser.FContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayNum}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNum(ExprParser.ArrayNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(ExprParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprParser.IntContext ctx);
}