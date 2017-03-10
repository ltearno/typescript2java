package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.IVisitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Text
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Text" )
public class TextImpl extends Node {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsConstructor
    public TextImpl(String unescapedValue) {}
    public native  Object visit(IVisitor visitor);
}
