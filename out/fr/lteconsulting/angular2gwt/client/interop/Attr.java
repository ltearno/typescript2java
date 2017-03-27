package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Attr
  * Typescript fqn Attr
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Attr extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="ownerElement")
    Element getOwnerElement();

    @JsProperty(name="ownerElement")
    void setOwnerElement(Element value);

    @JsProperty(name="prefix")
    String getPrefix();

    @JsProperty(name="prefix")
    void setPrefix(String value);

    @JsProperty(name="specified")
    boolean getSpecified();

    @JsProperty(name="specified")
    void setSpecified(boolean value);

    @JsProperty(name="value")
    String getValue();

    @JsProperty(name="value")
    void setValue(String value);
}
