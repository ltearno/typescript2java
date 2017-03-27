package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DelayNode
  * Typescript fqn DelayNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DelayNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="delayTime")
    AudioParam getDelayTime();

    @JsProperty(name="delayTime")
    void setDelayTime(AudioParam value);
}
