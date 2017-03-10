package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.ClassStmt;
import ng.core.EmitterVisitorContext;
import ng.core.ReadVarExpr;
import ng.core.DeclareVarStmt;
import ng.core.CastExpr;
import ng.core.InvokeFunctionExpr;
import ng.core.FunctionExpr;
import ng.core.DeclareFunctionStmt;
import ng.core.TryCatchStmt;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_js_emitter.d.ts
  * Package ng.core
  * Name AbstractJsEmitterVisitor
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AbstractJsEmitterVisitor" )
public abstract class AbstractJsEmitterVisitorImpl extends AbstractEmitterVisitor {
    @JsConstructor
    public AbstractJsEmitterVisitorImpl() {}
    public native  Object visitDeclareClassStmt(ClassStmt stmt,EmitterVisitorContext ctx);
    public native  void _visitClassConstructor();
    public native  void _visitClassGetter();
    public native  void _visitClassMethod();
    public native  String visitReadVarExpr(ReadVarExpr ast,EmitterVisitorContext ctx);
    public native  Object visitDeclareVarStmt(DeclareVarStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitCastExpr(CastExpr ast,EmitterVisitorContext ctx);
    public native  String visitInvokeFunctionExpr(InvokeFunctionExpr expr,EmitterVisitorContext ctx);
    public native  Object visitFunctionExpr(FunctionExpr ast,EmitterVisitorContext ctx);
    public native  Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,EmitterVisitorContext ctx);
    public native  Object visitTryCatchStmt(TryCatchStmt stmt,EmitterVisitorContext ctx);
    public native  void _visitParams();
    public native  String getBuiltinMethodName(/* ng.core.BuiltinMethod */ int method);
}
