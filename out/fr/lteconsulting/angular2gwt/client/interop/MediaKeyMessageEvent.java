package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaKeyMessageEvent
  * Typescript fqn MediaKeyMessageEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaKeyMessageEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="message")
    ArrayBuffer getMessage();

    @JsProperty(name="message")
    void setMessage(ArrayBuffer value);

    @JsProperty(name="messageType")
    String getMessageType();

    @JsProperty(name="messageType")
    void setMessageType(String value);
}
