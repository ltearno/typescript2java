package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MessagePortEventMap
  * Typescript fqn MessagePortEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MessagePortEventMap {
    @JsProperty(name="message")
    MessageEvent getMessage();

    @JsProperty(name="message")
    void setMessage(MessageEvent value);
}
