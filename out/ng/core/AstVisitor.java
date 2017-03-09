package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AstVisitor
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class AstVisitor  {
    public native  Object visitBinary(Binary ast,Object context);
    public native  Object visitChain(Chain ast,Object context);
    public native  Object visitConditional(Conditional ast,Object context);
    public native  Object visitFunctionCall(FunctionCall ast,Object context);
    public native  Object visitImplicitReceiver(ImplicitReceiver ast,Object context);
    public native  Object visitInterpolation(Interpolation ast,Object context);
    public native  Object visitKeyedRead(KeyedRead ast,Object context);
    public native  Object visitKeyedWrite(KeyedWrite ast,Object context);
    public native  Object visitLiteralArray(LiteralArray ast,Object context);
    public native  Object visitLiteralMap(LiteralMap ast,Object context);
    public native  Object visitLiteralPrimitive(LiteralPrimitive ast,Object context);
    public native  Object visitMethodCall(MethodCall ast,Object context);
    public native  Object visitPipe(BindingPipe ast,Object context);
    public native  Object visitPrefixNot(PrefixNot ast,Object context);
    public native  Object visitPropertyRead(PropertyRead ast,Object context);
    public native  Object visitPropertyWrite(PropertyWrite ast,Object context);
    public native  Object visitQuote(Quote ast,Object context);
    public native  Object visitSafeMethodCall(SafeMethodCall ast,Object context);
    public native  Object visitSafePropertyRead(SafePropertyRead ast,Object context);
}
