package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name StereoPannerNode
  * Typescript fqn StereoPannerNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface StereoPannerNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="pan")
    AudioParam getPan();

    @JsProperty(name="pan")
    void setPan(AudioParam value);
}
