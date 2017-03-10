package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralMap
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralMap" )
public class LiteralMapImpl extends AST {
    @JsProperty(name="keys")
    JsArray<Object> getKeys();
    @JsProperty(name="keys")
    void setKeys(JsArray<Object> value);
    @JsProperty(name="values")
    JsArray<Object> getValues();
    @JsProperty(name="values")
    void setValues(JsArray<Object> value);
    @JsConstructor
    public LiteralMapImpl(ParseSpan span,JsArray<Object> keys,JsArray<Object> values) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
