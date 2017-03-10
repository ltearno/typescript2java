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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AbstractEmitterVisitor  {
    @JsProperty(name="_escapeDollarInStrings")
    Object get_escapeDollarInStrings();
    @JsProperty(name="_escapeDollarInStrings")
    void set_escapeDollarInStrings(Object value);
    @JsConstructor
    public AbstractEmitterVisitor(boolean _escapeDollarInStrings) {}
     Object visitExpressionStmt(ExpressionStatement stmt,EmitterVisitorContext ctx);
     Object visitReturnStmt(ReturnStatement stmt,EmitterVisitorContext ctx);
     Object visitCastExpr(CastExpr ast,Object context);
     Object visitDeclareClassStmt(ClassStmt stmt,EmitterVisitorContext ctx);
     Object visitIfStmt(IfStmt stmt,EmitterVisitorContext ctx);
     Object visitTryCatchStmt(TryCatchStmt stmt,EmitterVisitorContext ctx);
     Object visitThrowStmt(ThrowStmt stmt,EmitterVisitorContext ctx);
     Object visitCommentStmt(CommentStmt stmt,EmitterVisitorContext ctx);
     Object visitDeclareVarStmt(DeclareVarStmt stmt,EmitterVisitorContext ctx);
     Object visitWriteVarExpr(WriteVarExpr expr,EmitterVisitorContext ctx);
     Object visitWriteKeyExpr(WriteKeyExpr expr,EmitterVisitorContext ctx);
     Object visitWritePropExpr(WritePropExpr expr,EmitterVisitorContext ctx);
     Object visitInvokeMethodExpr(InvokeMethodExpr expr,EmitterVisitorContext ctx);
     String getBuiltinMethodName(/* ng.core.BuiltinMethod */ int method);
     Object visitInvokeFunctionExpr(InvokeFunctionExpr expr,EmitterVisitorContext ctx);
     Object visitReadVarExpr(ReadVarExpr ast,EmitterVisitorContext ctx);
     Object visitInstantiateExpr(InstantiateExpr ast,EmitterVisitorContext ctx);
     Object visitLiteralExpr(LiteralExpr ast,EmitterVisitorContext ctx);
     Object visitExternalExpr(ExternalExpr ast,EmitterVisitorContext ctx);
     Object visitConditionalExpr(ConditionalExpr ast,EmitterVisitorContext ctx);
     Object visitNotExpr(NotExpr ast,EmitterVisitorContext ctx);
     Object visitFunctionExpr(FunctionExpr ast,EmitterVisitorContext ctx);
     Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,Object context);
     Object visitBinaryOperatorExpr(BinaryOperatorExpr ast,EmitterVisitorContext ctx);
     Object visitReadPropExpr(ReadPropExpr ast,EmitterVisitorContext ctx);
     Object visitReadKeyExpr(ReadKeyExpr ast,EmitterVisitorContext ctx);
     Object visitLiteralArrayExpr(LiteralArrayExpr ast,EmitterVisitorContext ctx);
     Object visitLiteralMapExpr(LiteralMapExpr ast,EmitterVisitorContext ctx);
     void visitAllExpressions(JsArray<Expression> expressions,EmitterVisitorContext ctx,String separator,boolean /* optional */ newLine);
    <T> void visitAllObjects(JsFunction1<T,Void> handler,JsArray<T> expressions,EmitterVisitorContext ctx,String separator,boolean /* optional */ newLine);
     void visitAllStatements(JsArray<Statement> statements,EmitterVisitorContext ctx);
}
