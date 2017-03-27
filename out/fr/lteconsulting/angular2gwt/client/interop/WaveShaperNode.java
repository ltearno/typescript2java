package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WaveShaperNode
  * Typescript fqn WaveShaperNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WaveShaperNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="curve")
    Float32Array getCurve();

    @JsProperty(name="curve")
    void setCurve(Float32Array value);

    @JsProperty(name="oversample")
    String getOversample();

    @JsProperty(name="oversample")
    void setOversample(String value);
}
