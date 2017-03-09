package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Text
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Text extends Node {
    public String value;
    @JsConstructor
    public Text(String unescapedValue) {}
    public native  Object visit(IVisitor visitor);
}
