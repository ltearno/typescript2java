package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamErrorEvent
  * Typescript fqn MediaStreamErrorEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamErrorEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="error")
    MediaStreamError getError();

    @JsProperty(name="error")
    void setError(MediaStreamError value);
}
