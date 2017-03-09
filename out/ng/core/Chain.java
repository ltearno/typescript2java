package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Chain
  * Multiple expressions separated by a semicolon.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Chain extends AST {
    public JsArray<Object> expressions;
    @JsConstructor
    public Chain(ParseSpan span,JsArray<Object> expressions) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
