package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCPeerConnectionEventMap
  * Typescript fqn RTCPeerConnectionEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCPeerConnectionEventMap {
    @JsProperty(name="addstream")
    MediaStreamEvent getAddstream();

    @JsProperty(name="addstream")
    void setAddstream(MediaStreamEvent value);

    @JsProperty(name="icecandidate")
    RTCPeerConnectionIceEvent getIcecandidate();

    @JsProperty(name="icecandidate")
    void setIcecandidate(RTCPeerConnectionIceEvent value);

    @JsProperty(name="iceconnectionstatechange")
    Event getIceconnectionstatechange();

    @JsProperty(name="iceconnectionstatechange")
    void setIceconnectionstatechange(Event value);

    @JsProperty(name="icegatheringstatechange")
    Event getIcegatheringstatechange();

    @JsProperty(name="icegatheringstatechange")
    void setIcegatheringstatechange(Event value);

    @JsProperty(name="negotiationneeded")
    Event getNegotiationneeded();

    @JsProperty(name="negotiationneeded")
    void setNegotiationneeded(Event value);

    @JsProperty(name="removestream")
    MediaStreamEvent getRemovestream();

    @JsProperty(name="removestream")
    void setRemovestream(MediaStreamEvent value);

    @JsProperty(name="signalingstatechange")
    Event getSignalingstatechange();

    @JsProperty(name="signalingstatechange")
    void setSignalingstatechange(Event value);
}
