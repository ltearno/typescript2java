package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Doctype
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Doctype extends Node {
    public String rootTag;
    public String dtd;
    @JsConstructor
    public Doctype(String rootTag,String dtd) {}
    public native  Object visit(IVisitor visitor);
}
