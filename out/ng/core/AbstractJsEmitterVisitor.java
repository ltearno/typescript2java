package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_js_emitter.d.ts
  * Package ng.core
  * Name AbstractJsEmitterVisitor
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface AbstractJsEmitterVisitor extends AbstractEmitterVisitor {
    @JsConstructor
    public AbstractJsEmitterVisitor() {}
     Object visitDeclareClassStmt(ClassStmt stmt,EmitterVisitorContext ctx);
     void _visitClassConstructor();
     void _visitClassGetter();
     void _visitClassMethod();
     String visitReadVarExpr(ReadVarExpr ast,EmitterVisitorContext ctx);
     Object visitDeclareVarStmt(DeclareVarStmt stmt,EmitterVisitorContext ctx);
     Object visitCastExpr(CastExpr ast,EmitterVisitorContext ctx);
     String visitInvokeFunctionExpr(InvokeFunctionExpr expr,EmitterVisitorContext ctx);
     Object visitFunctionExpr(FunctionExpr ast,EmitterVisitorContext ctx);
     Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,EmitterVisitorContext ctx);
     Object visitTryCatchStmt(TryCatchStmt stmt,EmitterVisitorContext ctx);
     void _visitParams();
     String getBuiltinMethodName(/* ng.core.BuiltinMethod */ int method);
}
