package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Interpolation
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Interpolation extends AST {
    public JsArray<Object> strings;
    public JsArray<Object> expressions;
    @JsConstructor
    public Interpolation(ParseSpan span,JsArray<Object> strings,JsArray<Object> expressions) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
