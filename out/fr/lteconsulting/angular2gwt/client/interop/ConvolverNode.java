package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ConvolverNode
  * Typescript fqn ConvolverNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ConvolverNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="buffer")
    AudioBuffer getBuffer();

    @JsProperty(name="buffer")
    void setBuffer(AudioBuffer value);

    @JsProperty(name="normalize")
    boolean getNormalize();

    @JsProperty(name="normalize")
    void setNormalize(boolean value);
}
