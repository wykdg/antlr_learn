package wyk;

import Expr.ExprBaseVisitor;
import Expr.ExprParser;

import java.util.Objects;

public class EvalVisitor extends ExprBaseVisitor {

    private static ScopeTable scopeTable = new ScopeTable();


    @Override
    public Object visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitInt(ExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Object visitAddSub(ExprParser.AddSubContext ctx) {
        Integer left = (Integer) visit(ctx.expr(0));
        Integer right = (Integer) visit(ctx.expr(1));

        if (ctx.op.getType() == ExprParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitMulDiv(ExprParser.MulDivContext ctx) {
        Integer left = (Integer) visit(ctx.expr(0));
        Integer right = (Integer) visit(ctx.expr(1));

        if (ctx.op.getType() == ExprParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }

    }

    @Override
    public Object visitId(ExprParser.IdContext ctx) {
        String key = ctx.ID().toString();
        return scopeTable.getVariable(key);
//        return super.visitId(ctx);
    }

    @Override
    public Object visitAssign(ExprParser.AssignContext ctx) {
        Integer value = (Integer) visit(ctx.expr());
        String key = ctx.ID().toString();
        scopeTable.setVaribale(key, value);
        return value;
    }


    @Override
    public Object visitIfStatement(ExprParser.IfStatementContext ctx) {
        Integer value = (Integer) visit(ctx.expr());
        if (value != 0) {
            visit(ctx.stat(0));
        } else if (ctx.getChildCount() == 7) {
            visit(ctx.stat(1));
        }
        return 0;
    }


    @Override
    public Integer visitCmp(ExprParser.CmpContext ctx) {
        Integer left = (Integer) visit(ctx.expr(0));
        Integer right = (Integer) visit(ctx.expr(1));

        if (ctx.op.getType() == ExprParser.SMALLER) {
            return left < right ? 1 : 0;
        } else if (ctx.op.getType() == ExprParser.BIGGER) {
            return left > right ? 1 : 0;
        } else if (ctx.op.getType() == ExprParser.EQUAL) {
            return Objects.equals(left, right) ? 1 : 0;
        }
        return 0;
    }

    @Override
    public Object visitPrintExpr(ExprParser.PrintExprContext ctx) {
        Integer rtn = (Integer) visit(ctx.expr());
        System.out.println(rtn.toString());
        return 0;
    }

    @Override
    public Object visitForStatment(ExprParser.ForStatmentContext ctx) {
        visit(ctx.assign(0));

        while (true) {
            Integer x = (Integer) visit(ctx.expr());
            if (x == 0) break;
            visit(ctx.stat());
            visit(ctx.assign(1));
        }
        return 0;
    }

    @Override
    public Object visitWhileStatment(ExprParser.WhileStatmentContext ctx) {
        while (true) {
            Integer x = (Integer) visit(ctx.expr());
            if (x == 0)
                break;
            visit(ctx.stat());
        }
        return 0;
    }

    @Override
    public Object visitBlockStatement(ExprParser.BlockStatementContext ctx) {
//        scopeTable.pushScope("block");
        super.visitBlockStatement(ctx);
//        scopeTable.popScope();
        return 0;

    }

    @Override
    public Object visitScopeStatment(ExprParser.ScopeStatmentContext ctx) {
        scopeTable.pushScope("function_scope");
        visit(ctx.blockStatement());
        scopeTable.popScope();
        return 0;
    }
}
//for (a=1;a<100;a=a+1) if(a<50){print a; a=a+1;} else {print a;}