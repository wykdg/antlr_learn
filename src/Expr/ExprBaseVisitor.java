// Generated from D:/code/test_antlr/xxx\Expr.g4 by ANTLR 4.7
package Expr;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ExprVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ExprVisitor<T> {
	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitProg(ExprParser.ProgContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitStat(ExprParser.StatContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitArrayInit(ExprParser.ArrayInitContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitNewArray(ExprParser.NewArrayContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitPrintExpr(ExprParser.PrintExprContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitAssignExpr(ExprParser.AssignExprContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitAssignArray(ExprParser.AssignArrayContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitAssignArrayIndex(ExprParser.AssignArrayIndexContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitIfStatement(ExprParser.IfStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitForStatment(ExprParser.ForStatmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitWhileStatment(ExprParser.WhileStatmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitBlockStatement(ExprParser.BlockStatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitScopeStatment(ExprParser.ScopeStatmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitFunctionDefExpr(ExprParser.FunctionDefExprContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitFunctionCallExpr(ExprParser.FunctionCallExprContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitParens(ExprParser.ParensContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitMulDiv(ExprParser.MulDivContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitAddSub(ExprParser.AddSubContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitArrayNum(ExprParser.ArrayNumContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitCmp(ExprParser.CmpContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitId(ExprParser.IdContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public T visitInt(ExprParser.IntContext ctx) {
		return visitChildren(ctx);
	}
}