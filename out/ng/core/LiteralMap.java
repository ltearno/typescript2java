package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralMap
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralMap extends AST {
    public JsArray<Object> keys;
    public JsArray<Object> values;
    @JsConstructor
    public LiteralMap(ParseSpan span,JsArray<Object> keys,JsArray<Object> values) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
