package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceCandidatePairChangedEvent
  * Typescript fqn RTCIceCandidatePairChangedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceCandidatePairChangedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="pair")
    RTCIceCandidatePair getPair();

    @JsProperty(name="pair")
    void setPair(RTCIceCandidatePair value);
}
