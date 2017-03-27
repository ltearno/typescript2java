package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpUnhandled
  * Typescript fqn RTCRtpUnhandled
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpUnhandled {
    /* optional property ssrc*/    @JsProperty(name="ssrc")
    Number getSsrc();

    @JsProperty(name="ssrc")
    void setSsrc(Number value);

    /* optional property payloadType*/    @JsProperty(name="payloadType")
    Number getPayloadType();

    @JsProperty(name="payloadType")
    void setPayloadType(Number value);

    /* optional property muxId*/    @JsProperty(name="muxId")
    String getMuxId();

    @JsProperty(name="muxId")
    void setMuxId(String value);
}
