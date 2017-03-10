package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ImplicitReceiver;
import ng.core.AST;
import ng.core.Interpolation;
import ng.core.LiteralPrimitive;
import ng.core.PropertyRead;
import ng.core.PropertyWrite;
import ng.core.SafePropertyRead;
import ng.core.MethodCall;
import ng.core.SafeMethodCall;
import ng.core.FunctionCall;
import ng.core.LiteralArray;
import ng.core.LiteralMap;
import ng.core.Binary;
import ng.core.PrefixNot;
import ng.core.Conditional;
import ng.core.BindingPipe;
import ng.core.KeyedRead;
import ng.core.KeyedWrite;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Chain;
import ng.core.Quote;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AstTransformer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AstTransformer extends AstVisitor {
     AST visitImplicitReceiver(ImplicitReceiver ast,Object context);
     AST visitInterpolation(Interpolation ast,Object context);
     AST visitLiteralPrimitive(LiteralPrimitive ast,Object context);
     AST visitPropertyRead(PropertyRead ast,Object context);
     AST visitPropertyWrite(PropertyWrite ast,Object context);
     AST visitSafePropertyRead(SafePropertyRead ast,Object context);
     AST visitMethodCall(MethodCall ast,Object context);
     AST visitSafeMethodCall(SafeMethodCall ast,Object context);
     AST visitFunctionCall(FunctionCall ast,Object context);
     AST visitLiteralArray(LiteralArray ast,Object context);
     AST visitLiteralMap(LiteralMap ast,Object context);
     AST visitBinary(Binary ast,Object context);
     AST visitPrefixNot(PrefixNot ast,Object context);
     AST visitConditional(Conditional ast,Object context);
     AST visitPipe(BindingPipe ast,Object context);
     AST visitKeyedRead(KeyedRead ast,Object context);
     AST visitKeyedWrite(KeyedWrite ast,Object context);
     JsArray<Object> visitAll(JsArray<Object> asts);
     AST visitChain(Chain ast,Object context);
     AST visitQuote(Quote ast,Object context);
}
