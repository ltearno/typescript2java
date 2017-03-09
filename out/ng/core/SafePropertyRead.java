package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name SafePropertyRead
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SafePropertyRead extends AST {
    public AST receiver;
    public String name;
    @JsConstructor
    public SafePropertyRead(ParseSpan span,AST receiver,String name) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
