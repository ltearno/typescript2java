package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCPeerConnectionIceEvent
  * Typescript fqn RTCPeerConnectionIceEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCPeerConnectionIceEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="candidate")
    RTCIceCandidate getCandidate();

    @JsProperty(name="candidate")
    void setCandidate(RTCIceCandidate value);
}
