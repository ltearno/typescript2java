package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceTransportEventMap
  * Typescript fqn RTCIceTransportEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceTransportEventMap {
    @JsProperty(name="candidatepairchange")
    RTCIceCandidatePairChangedEvent getCandidatepairchange();

    @JsProperty(name="candidatepairchange")
    void setCandidatepairchange(RTCIceCandidatePairChangedEvent value);

    @JsProperty(name="icestatechange")
    RTCIceTransportStateChangedEvent getIcestatechange();

    @JsProperty(name="icestatechange")
    void setIcestatechange(RTCIceTransportStateChangedEvent value);
}
