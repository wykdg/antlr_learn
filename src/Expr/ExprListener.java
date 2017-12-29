// Generated from D:/code/test_antlr/xxx\Expr.g4 by ANTLR 4.7
package Expr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ExprParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(ExprParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(ExprParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterStat(ExprParser.StatContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitStat(ExprParser.StatContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#printExpr}.
     *
     * @param ctx the parse tree
     */
    void enterPrintExpr(ExprParser.PrintExprContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#printExpr}.
     *
     * @param ctx the parse tree
     */
    void exitPrintExpr(ExprParser.PrintExprContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#assign}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(ExprParser.AssignContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#assign}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(ExprParser.AssignContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(ExprParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(ExprParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#forStatment}.
     *
     * @param ctx the parse tree
     */
    void enterForStatment(ExprParser.ForStatmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#forStatment}.
     *
     * @param ctx the parse tree
     */
    void exitForStatment(ExprParser.ForStatmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#whileStatment}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatment(ExprParser.WhileStatmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#whileStatment}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatment(ExprParser.WhileStatmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBlockStatement(ExprParser.BlockStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBlockStatement(ExprParser.BlockStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#scopeStatment}.
     *
     * @param ctx the parse tree
     */
    void enterScopeStatment(ExprParser.ScopeStatmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#scopeStatment}.
     *
     * @param ctx the parse tree
     */
    void exitScopeStatment(ExprParser.ScopeStatmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#functionDefExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionDefExpr(ExprParser.FunctionDefExprContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#functionDefExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionDefExpr(ExprParser.FunctionDefExprContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#functionCallExpr}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCallExpr(ExprParser.FunctionCallExprContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#functionCallExpr}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCallExpr(ExprParser.FunctionCallExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code parens}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParens(ExprParser.ParensContext ctx);

    /**
     * Exit a parse tree produced by the {@code parens}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParens(ExprParser.ParensContext ctx);

    /**
     * Enter a parse tree produced by the {@code MulDiv}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulDiv(ExprParser.MulDivContext ctx);

    /**
     * Exit a parse tree produced by the {@code MulDiv}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulDiv(ExprParser.MulDivContext ctx);

    /**
     * Enter a parse tree produced by the {@code AddSub}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAddSub(ExprParser.AddSubContext ctx);

    /**
     * Exit a parse tree produced by the {@code AddSub}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAddSub(ExprParser.AddSubContext ctx);

    /**
     * Enter a parse tree produced by the {@code Cmp}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCmp(ExprParser.CmpContext ctx);

    /**
     * Exit a parse tree produced by the {@code Cmp}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCmp(ExprParser.CmpContext ctx);

    /**
     * Enter a parse tree produced by the {@code id}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterId(ExprParser.IdContext ctx);

    /**
     * Exit a parse tree produced by the {@code id}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitId(ExprParser.IdContext ctx);

    /**
     * Enter a parse tree produced by the {@code int}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterInt(ExprParser.IntContext ctx);

    /**
     * Exit a parse tree produced by the {@code int}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitInt(ExprParser.IntContext ctx);
}