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

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpressionVisitor  {
     Object visitReadVarExpr(ReadVarExpr ast,Object context);
     Object visitWriteVarExpr(WriteVarExpr expr,Object context);
     Object visitWriteKeyExpr(WriteKeyExpr expr,Object context);
     Object visitWritePropExpr(WritePropExpr expr,Object context);
     Object visitInvokeMethodExpr(InvokeMethodExpr ast,Object context);
     Object visitInvokeFunctionExpr(InvokeFunctionExpr ast,Object context);
     Object visitInstantiateExpr(InstantiateExpr ast,Object context);
     Object visitLiteralExpr(LiteralExpr ast,Object context);
     Object visitExternalExpr(ExternalExpr ast,Object context);
     Object visitConditionalExpr(ConditionalExpr ast,Object context);
     Object visitNotExpr(NotExpr ast,Object context);
     Object visitCastExpr(CastExpr ast,Object context);
     Object visitFunctionExpr(FunctionExpr ast,Object context);
     Object visitBinaryOperatorExpr(BinaryOperatorExpr ast,Object context);
     Object visitReadPropExpr(ReadPropExpr ast,Object context);
     Object visitReadKeyExpr(ReadKeyExpr ast,Object context);
     Object visitLiteralArrayExpr(LiteralArrayExpr ast,Object context);
     Object visitLiteralMapExpr(LiteralMapExpr ast,Object context);
}
