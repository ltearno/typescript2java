package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReadVarExpr;
import ng.core.WriteVarExpr;
import ng.core.WriteKeyExpr;
import ng.core.WritePropExpr;
import ng.core.InvokeMethodExpr;
import ng.core.InvokeFunctionExpr;
import ng.core.InstantiateExpr;
import ng.core.LiteralExpr;
import ng.core.ExternalExpr;
import ng.core.ConditionalExpr;
import ng.core.NotExpr;
import ng.core.CastExpr;
import ng.core.FunctionExpr;
import ng.core.BinaryOperatorExpr;
import ng.core.ReadPropExpr;
import ng.core.ReadKeyExpr;
import ng.core.LiteralArrayExpr;
import ng.core.LiteralMapExpr;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Expression;
import ng.core.DeclareVarStmt;
import ng.core.DeclareFunctionStmt;
import ng.core.ExpressionStatement;
import ng.core.ReturnStatement;
import ng.core.ClassStmt;
import ng.core.IfStmt;
import ng.core.TryCatchStmt;
import ng.core.ThrowStmt;
import ng.core.CommentStmt;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name RecursiveExpressionVisitor
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="RecursiveExpressionVisitor" )
public class RecursiveExpressionVisitorImpl extends StatementVisitor {
    public native  Object visitReadVarExpr(ReadVarExpr ast,Object context);
    public native  Object visitWriteVarExpr(WriteVarExpr expr,Object context);
    public native  Object visitWriteKeyExpr(WriteKeyExpr expr,Object context);
    public native  Object visitWritePropExpr(WritePropExpr expr,Object context);
    public native  Object visitInvokeMethodExpr(InvokeMethodExpr ast,Object context);
    public native  Object visitInvokeFunctionExpr(InvokeFunctionExpr ast,Object context);
    public native  Object visitInstantiateExpr(InstantiateExpr ast,Object context);
    public native  Object visitLiteralExpr(LiteralExpr ast,Object context);
    public native  Object visitExternalExpr(ExternalExpr ast,Object context);
    public native  Object visitConditionalExpr(ConditionalExpr ast,Object context);
    public native  Object visitNotExpr(NotExpr ast,Object context);
    public native  Object visitCastExpr(CastExpr ast,Object context);
    public native  Object visitFunctionExpr(FunctionExpr ast,Object context);
    public native  Object visitBinaryOperatorExpr(BinaryOperatorExpr ast,Object context);
    public native  Object visitReadPropExpr(ReadPropExpr ast,Object context);
    public native  Object visitReadKeyExpr(ReadKeyExpr ast,Object context);
    public native  Object visitLiteralArrayExpr(LiteralArrayExpr ast,Object context);
    public native  Object visitLiteralMapExpr(LiteralMapExpr ast,Object context);
    public native  void visitAllExpressions(JsArray<Expression> exprs,Object context);
    public native  Object visitDeclareVarStmt(DeclareVarStmt stmt,Object context);
    public native  Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,Object context);
    public native  Object visitExpressionStmt(ExpressionStatement stmt,Object context);
    public native  Object visitReturnStmt(ReturnStatement stmt,Object context);
    public native  Object visitDeclareClassStmt(ClassStmt stmt,Object context);
    public native  Object visitIfStmt(IfStmt stmt,Object context);
    public native  Object visitTryCatchStmt(TryCatchStmt stmt,Object context);
    public native  Object visitThrowStmt(ThrowStmt stmt,Object context);
    public native  Object visitCommentStmt(CommentStmt stmt,Object context);
    public native  void visitAllStatements(JsArray<Statement> stmts,Object context);
}
