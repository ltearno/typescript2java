package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSMediaKeyMessageEvent
  * Typescript fqn MSMediaKeyMessageEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSMediaKeyMessageEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="destinationURL")
    String getDestinationURL();

    @JsProperty(name="destinationURL")
    void setDestinationURL(String value);

    @JsProperty(name="message")
    Uint8Array getMessage();

    @JsProperty(name="message")
    void setMessage(Uint8Array value);
}
