package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Binary;
import ng.core.Chain;
import ng.core.Conditional;
import ng.core.FunctionCall;
import ng.core.ImplicitReceiver;
import ng.core.Interpolation;
import ng.core.KeyedRead;
import ng.core.KeyedWrite;
import ng.core.LiteralArray;
import ng.core.LiteralMap;
import ng.core.LiteralPrimitive;
import ng.core.MethodCall;
import ng.core.BindingPipe;
import ng.core.PrefixNot;
import ng.core.PropertyRead;
import ng.core.PropertyWrite;
import ng.core.Quote;
import ng.core.SafeMethodCall;
import ng.core.SafePropertyRead;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AstVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AstVisitor  {
     Object visitBinary(Binary ast,Object context);
     Object visitChain(Chain ast,Object context);
     Object visitConditional(Conditional ast,Object context);
     Object visitFunctionCall(FunctionCall ast,Object context);
     Object visitImplicitReceiver(ImplicitReceiver ast,Object context);
     Object visitInterpolation(Interpolation ast,Object context);
     Object visitKeyedRead(KeyedRead ast,Object context);
     Object visitKeyedWrite(KeyedWrite ast,Object context);
     Object visitLiteralArray(LiteralArray ast,Object context);
     Object visitLiteralMap(LiteralMap ast,Object context);
     Object visitLiteralPrimitive(LiteralPrimitive ast,Object context);
     Object visitMethodCall(MethodCall ast,Object context);
     Object visitPipe(BindingPipe ast,Object context);
     Object visitPrefixNot(PrefixNot ast,Object context);
     Object visitPropertyRead(PropertyRead ast,Object context);
     Object visitPropertyWrite(PropertyWrite ast,Object context);
     Object visitQuote(Quote ast,Object context);
     Object visitSafeMethodCall(SafeMethodCall ast,Object context);
     Object visitSafePropertyRead(SafePropertyRead ast,Object context);
}
