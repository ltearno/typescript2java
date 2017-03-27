package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpRtxParameters
  * Typescript fqn RTCRtpRtxParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpRtxParameters {
    /* optional property ssrc*/    @JsProperty(name="ssrc")
    Number getSsrc();

    @JsProperty(name="ssrc")
    void setSsrc(Number value);
}
