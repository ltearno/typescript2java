package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.IVisitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Declaration
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Declaration extends Node {
    @JsProperty(name="attrs")
    JsTypedObject<String,String> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsTypedObject<String,String> value);
    @JsConstructor
    public Declaration(JsTypedObject<String,String> unescapedAttrs) {}
     Object visit(IVisitor visitor);
}
