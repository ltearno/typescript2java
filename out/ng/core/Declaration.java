package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name Declaration
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Declaration extends Node {
    public JsTypedObject<String,String> attrs;
    @JsConstructor
    public Declaration(JsTypedObject<String,String> unescapedAttrs) {}
    public native  Object visit(IVisitor visitor);
}
