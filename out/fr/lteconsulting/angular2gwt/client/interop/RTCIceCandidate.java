package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceCandidate
  * Typescript fqn RTCIceCandidate
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceCandidate {
    @JsProperty(name="candidate")
    String getCandidate();

    @JsProperty(name="candidate")
    void setCandidate(String value);

    @JsProperty(name="sdpMLineIndex")
    Number getSdpMLineIndex();

    @JsProperty(name="sdpMLineIndex")
    void setSdpMLineIndex(Number value);

    @JsProperty(name="sdpMid")
    String getSdpMid();

    @JsProperty(name="sdpMid")
    void setSdpMid(String value);

    Object toJSON();
}
