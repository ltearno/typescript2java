package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AstTransformer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AstTransformer extends AstVisitor {
    public native  AST visitImplicitReceiver(ImplicitReceiver ast,Object context);
    public native  AST visitInterpolation(Interpolation ast,Object context);
    public native  AST visitLiteralPrimitive(LiteralPrimitive ast,Object context);
    public native  AST visitPropertyRead(PropertyRead ast,Object context);
    public native  AST visitPropertyWrite(PropertyWrite ast,Object context);
    public native  AST visitSafePropertyRead(SafePropertyRead ast,Object context);
    public native  AST visitMethodCall(MethodCall ast,Object context);
    public native  AST visitSafeMethodCall(SafeMethodCall ast,Object context);
    public native  AST visitFunctionCall(FunctionCall ast,Object context);
    public native  AST visitLiteralArray(LiteralArray ast,Object context);
    public native  AST visitLiteralMap(LiteralMap ast,Object context);
    public native  AST visitBinary(Binary ast,Object context);
    public native  AST visitPrefixNot(PrefixNot ast,Object context);
    public native  AST visitConditional(Conditional ast,Object context);
    public native  AST visitPipe(BindingPipe ast,Object context);
    public native  AST visitKeyedRead(KeyedRead ast,Object context);
    public native  AST visitKeyedWrite(KeyedWrite ast,Object context);
    public native  JsArray<Object> visitAll(JsArray<Object> asts);
    public native  AST visitChain(Chain ast,Object context);
    public native  AST visitQuote(Quote ast,Object context);
}
