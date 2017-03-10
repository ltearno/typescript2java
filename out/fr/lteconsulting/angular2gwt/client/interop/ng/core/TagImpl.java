package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;
import ng.core.IVisitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Tag
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Tag" )
public class TagImpl extends Node {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="children")
    JsArray<Node> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<Node> value);
    @JsProperty(name="attrs")
    JsTypedObject<String,String> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsTypedObject<String,String> value);
    @JsConstructor
    public TagImpl(String name,JsTypedObject<String,String> /* optional */ unescapedAttrs,JsArray<Node> /* optional */ children) {}
    public native  Object visit(IVisitor visitor);
}
