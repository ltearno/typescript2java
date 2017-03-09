package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Tag
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Tag extends Node {
    public String name;
    public JsArray<Node> children;
    public JsTypedObject<String,String> attrs;
    @JsConstructor
    public Tag(String name,JsTypedObject<String,String> /* optional */ unescapedAttrs,JsArray<Node> /* optional */ children) {}
    public native  Object visit(IVisitor visitor);
}
