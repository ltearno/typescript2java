package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name SafeMethodCall
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SafeMethodCall extends AST {
    public AST receiver;
    public String name;
    public JsArray<Object> args;
    @JsConstructor
    public SafeMethodCall(ParseSpan span,AST receiver,String name,JsArray<Object> args) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
