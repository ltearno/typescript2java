package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceGathererEvent
  * Typescript fqn RTCIceGathererEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceGathererEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="candidate")
    Object /* Union type */ getCandidate();

    @JsProperty(name="candidate")
    void setCandidate(Object /* Union type */ value);
}
