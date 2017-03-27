package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDTMFToneChangeEvent
  * Typescript fqn RTCDTMFToneChangeEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDTMFToneChangeEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="tone")
    String getTone();

    @JsProperty(name="tone")
    void setTone(String value);
}
