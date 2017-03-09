package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name PropertyWrite
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PropertyWrite extends AST {
    public AST receiver;
    public String name;
    public AST value;
    @JsConstructor
    public PropertyWrite(ParseSpan span,AST receiver,String name,AST value) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
