package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSNamespaceRule
  * Typescript fqn CSSNamespaceRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSNamespaceRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="namespaceURI")
    String getNamespaceURI();

    @JsProperty(name="namespaceURI")
    void setNamespaceURI(String value);

    @JsProperty(name="prefix")
    String getPrefix();

    @JsProperty(name="prefix")
    void setPrefix(String value);
}
