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
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInit}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(ExprParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInit}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(ExprParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(ExprParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArray}
	 * labeled alternative in {@link ExprParser#array}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(ExprParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(ExprParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(ExprParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(ExprParser.AssignArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayIndex}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayIndex(ExprParser.AssignArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayIndex}
	 * labeled alternative in {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayIndex(ExprParser.AssignArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void enterForStatment(ExprParser.ForStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forStatment}.
	 * @param ctx the parse tree
	 */
	void exitForStatment(ExprParser.ForStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatment(ExprParser.WhileStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileStatment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatment(ExprParser.WhileStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ExprParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ExprParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#scopeStatment}.
	 * @param ctx the parse tree
	 */
	void enterScopeStatment(ExprParser.ScopeStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#scopeStatment}.
	 * @param ctx the parse tree
	 */
	void exitScopeStatment(ExprParser.ScopeStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionDefExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefExpr(ExprParser.FunctionDefExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionDefExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefExpr(ExprParser.FunctionDefExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnStatment}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatment(ExprParser.ReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnStatment}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatment(ExprParser.ReturnStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionDefParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefParams(ExprParser.FunctionDefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionDefParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefParams(ExprParser.FunctionDefParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(ExprParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(ExprParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(ExprParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(ExprParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(ExprParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(ExprParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#classInnerDef}.
	 * @param ctx the parse tree
	 */
	void enterClassInnerDef(ExprParser.ClassInnerDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#classInnerDef}.
	 * @param ctx the parse tree
	 */
	void exitClassInnerDef(ExprParser.ClassInnerDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classvar}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 */
	void enterClassvar(ExprParser.ClassvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classvar}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 */
	void exitClassvar(ExprParser.ClassvarContext ctx);
	/**
     * Enter a parse tree produced by the {@code classAssign}
     * labeled alternative in {@link ExprParser#classCal}.
     * @param ctx the parse tree
	 */
    void enterClassAssign(ExprParser.ClassAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code classAssign}
     * labeled alternative in {@link ExprParser#classCal}.
     * @param ctx the parse tree
	 */
    void exitClassAssign(ExprParser.ClassAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code classfuncall}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 */
	void enterClassfuncall(ExprParser.ClassfuncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classfuncall}
	 * labeled alternative in {@link ExprParser#classCal}.
	 * @param ctx the parse tree
	 */
	void exitClassfuncall(ExprParser.ClassfuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(ExprParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(ExprParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(ExprParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newClass}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(ExprParser.NewClassContext ctx);
	/**
     * Enter a parse tree produced by the {@code c}
     * labeled alternative in {@link ExprParser#expr}.
     * @param ctx the parse tree
     */
    void enterC(ExprParser.CContext ctx);

    /**
     * Exit a parse tree produced by the {@code c}
     * labeled alternative in {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitC(ExprParser.CContext ctx);

    /**
     * Enter a parse tree produced by the {@code MulDiv}
     * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code f}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterF(ExprParser.FContext ctx);
	/**
	 * Exit a parse tree produced by the {@code f}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitF(ExprParser.FContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayNum}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayNum(ExprParser.ArrayNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayNum}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayNum(ExprParser.ArrayNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp(ExprParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cmp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp(ExprParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprParser.IntContext ctx);
}