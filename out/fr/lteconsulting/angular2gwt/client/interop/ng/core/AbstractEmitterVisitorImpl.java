package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionStatement;
import ng.core.EmitterVisitorContext;
import ng.core.ReturnStatement;
import ng.core.CastExpr;
import ng.core.ClassStmt;
import ng.core.IfStmt;
import ng.core.TryCatchStmt;
import ng.core.ThrowStmt;
import ng.core.CommentStmt;
import ng.core.DeclareVarStmt;
import ng.core.WriteVarExpr;
import ng.core.WriteKeyExpr;
import ng.core.WritePropExpr;
import ng.core.InvokeMethodExpr;
import ng.core.InvokeFunctionExpr;
import ng.core.ReadVarExpr;
import ng.core.InstantiateExpr;
import ng.core.LiteralExpr;
import ng.core.ExternalExpr;
import ng.core.ConditionalExpr;
import ng.core.NotExpr;
import ng.core.FunctionExpr;
import ng.core.DeclareFunctionStmt;
import ng.core.BinaryOperatorExpr;
import ng.core.ReadPropExpr;
import ng.core.ReadKeyExpr;
import ng.core.LiteralArrayExpr;
import ng.core.LiteralMapExpr;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Expression;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_emitter.d.ts
  * Package ng.core
  * Name AbstractEmitterVisitor
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AbstractEmitterVisitor" )
public abstract class AbstractEmitterVisitorImpl  {
    @JsProperty(name="_escapeDollarInStrings")
    Object get_escapeDollarInStrings();
    @JsProperty(name="_escapeDollarInStrings")
    void set_escapeDollarInStrings(Object value);
    @JsConstructor
    public AbstractEmitterVisitorImpl(boolean _escapeDollarInStrings) {}
    public native  Object visitExpressionStmt(ExpressionStatement stmt,EmitterVisitorContext ctx);
    public native  Object visitReturnStmt(ReturnStatement stmt,EmitterVisitorContext ctx);
    public native  Object visitCastExpr(CastExpr ast,Object context);
    public native  Object visitDeclareClassStmt(ClassStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitIfStmt(IfStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitTryCatchStmt(TryCatchStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitThrowStmt(ThrowStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitCommentStmt(CommentStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitDeclareVarStmt(DeclareVarStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitWriteVarExpr(WriteVarExpr expr,EmitterVisitorContext ctx);
    public native  Object visitWriteKeyExpr(WriteKeyExpr expr,EmitterVisitorContext ctx);
    public native  Object visitWritePropExpr(WritePropExpr expr,EmitterVisitorContext ctx);
    public native  Object visitInvokeMethodExpr(InvokeMethodExpr expr,EmitterVisitorContext ctx);
    public native  String getBuiltinMethodName(/* ng.core.BuiltinMethod */ int method);
    public native  Object visitInvokeFunctionExpr(InvokeFunctionExpr expr,EmitterVisitorContext ctx);
    public native  Object visitReadVarExpr(ReadVarExpr ast,EmitterVisitorContext ctx);
    public native  Object visitInstantiateExpr(InstantiateExpr ast,EmitterVisitorContext ctx);
    public native  Object visitLiteralExpr(LiteralExpr ast,EmitterVisitorContext ctx);
    public native  Object visitExternalExpr(ExternalExpr ast,EmitterVisitorContext ctx);
    public native  Object visitConditionalExpr(ConditionalExpr ast,EmitterVisitorContext ctx);
    public native  Object visitNotExpr(NotExpr ast,EmitterVisitorContext ctx);
    public native  Object visitFunctionExpr(FunctionExpr ast,EmitterVisitorContext ctx);
    public native  Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,Object context);
    public native  Object visitBinaryOperatorExpr(BinaryOperatorExpr ast,EmitterVisitorContext ctx);
    public native  Object visitReadPropExpr(ReadPropExpr ast,EmitterVisitorContext ctx);
    public native  Object visitReadKeyExpr(ReadKeyExpr ast,EmitterVisitorContext ctx);
    public native  Object visitLiteralArrayExpr(LiteralArrayExpr ast,EmitterVisitorContext ctx);
    public native  Object visitLiteralMapExpr(LiteralMapExpr ast,EmitterVisitorContext ctx);
    public native  void visitAllExpressions(JsArray<Expression> expressions,EmitterVisitorContext ctx,String separator,boolean /* optional */ newLine);
    public native <T> void visitAllObjects(JsFunction1<T,Void> handler,JsArray<T> expressions,EmitterVisitorContext ctx,String separator,boolean /* optional */ newLine);
    public native  void visitAllStatements(JsArray<Statement> statements,EmitterVisitorContext ctx);
}
