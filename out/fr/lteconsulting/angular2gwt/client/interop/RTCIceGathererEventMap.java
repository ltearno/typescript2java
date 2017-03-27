package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceGathererEventMap
  * Typescript fqn RTCIceGathererEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceGathererEventMap {
    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="localcandidate")
    RTCIceGathererEvent getLocalcandidate();

    @JsProperty(name="localcandidate")
    void setLocalcandidate(RTCIceGathererEvent value);
}
