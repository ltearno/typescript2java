package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name GainNode
  * Typescript fqn GainNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface GainNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="gain")
    AudioParam getGain();

    @JsProperty(name="gain")
    void setGain(AudioParam value);
}
