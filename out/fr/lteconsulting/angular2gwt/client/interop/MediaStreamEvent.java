package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamEvent
  * Typescript fqn MediaStreamEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="stream")
    MediaStream getStream();

    @JsProperty(name="stream")
    void setStream(MediaStream value);
}
