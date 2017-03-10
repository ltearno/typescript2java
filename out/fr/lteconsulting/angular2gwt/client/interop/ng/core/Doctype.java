package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.IVisitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Doctype
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Doctype extends Node {
    @JsProperty(name="rootTag")
    String getRootTag();
    @JsProperty(name="rootTag")
    void setRootTag(String value);
    @JsProperty(name="dtd")
    String getDtd();
    @JsProperty(name="dtd")
    void setDtd(String value);
    @JsConstructor
    public Doctype(String rootTag,String dtd) {}
     Object visit(IVisitor visitor);
}
