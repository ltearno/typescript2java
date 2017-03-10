package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Binary;
import ng.core.Chain;
import ng.core.Conditional;
import ng.core.BindingPipe;
import ng.core.FunctionCall;
import ng.core.ImplicitReceiver;
import ng.core.Interpolation;
import ng.core.KeyedRead;
import ng.core.KeyedWrite;
import ng.core.LiteralArray;
import ng.core.LiteralMap;
import ng.core.LiteralPrimitive;
import ng.core.MethodCall;
import ng.core.PrefixNot;
import ng.core.PropertyRead;
import ng.core.PropertyWrite;
import ng.core.SafePropertyRead;
import ng.core.SafeMethodCall;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AST;
import ng.core.Quote;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name RecursiveAstVisitor
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="RecursiveAstVisitor" )
public class RecursiveAstVisitorImpl extends AstVisitor {
    public native  Object visitBinary(Binary ast,Object context);
    public native  Object visitChain(Chain ast,Object context);
    public native  Object visitConditional(Conditional ast,Object context);
    public native  Object visitPipe(BindingPipe ast,Object context);
    public native  Object visitFunctionCall(FunctionCall ast,Object context);
    public native  Object visitImplicitReceiver(ImplicitReceiver ast,Object context);
    public native  Object visitInterpolation(Interpolation ast,Object context);
    public native  Object visitKeyedRead(KeyedRead ast,Object context);
    public native  Object visitKeyedWrite(KeyedWrite ast,Object context);
    public native  Object visitLiteralArray(LiteralArray ast,Object context);
    public native  Object visitLiteralMap(LiteralMap ast,Object context);
    public native  Object visitLiteralPrimitive(LiteralPrimitive ast,Object context);
    public native  Object visitMethodCall(MethodCall ast,Object context);
    public native  Object visitPrefixNot(PrefixNot ast,Object context);
    public native  Object visitPropertyRead(PropertyRead ast,Object context);
    public native  Object visitPropertyWrite(PropertyWrite ast,Object context);
    public native  Object visitSafePropertyRead(SafePropertyRead ast,Object context);
    public native  Object visitSafeMethodCall(SafeMethodCall ast,Object context);
    public native  Object visitAll(JsArray<AST> asts,Object context);
    public native  Object visitQuote(Quote ast,Object context);
}
