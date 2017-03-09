package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionVisitor
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ExpressionVisitor  {
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
}
