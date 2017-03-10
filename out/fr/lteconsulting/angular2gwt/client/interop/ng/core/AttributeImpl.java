package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Attribute
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Attribute" )
public class AttributeImpl extends Node {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="valueSpan")
    ParseSourceSpan getValueSpan();
    @JsProperty(name="valueSpan")
    void setValueSpan(ParseSourceSpan value);
    @JsConstructor
    public AttributeImpl(String name,String value,ParseSourceSpan sourceSpan,ParseSourceSpan /* optional */ valueSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
