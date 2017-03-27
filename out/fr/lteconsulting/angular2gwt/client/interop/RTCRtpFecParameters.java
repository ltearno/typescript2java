package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpFecParameters
  * Typescript fqn RTCRtpFecParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpFecParameters {
    /* optional property ssrc*/    @JsProperty(name="ssrc")
    Number getSsrc();

    @JsProperty(name="ssrc")
    void setSsrc(Number value);

    /* optional property mechanism*/    @JsProperty(name="mechanism")
    String getMechanism();

    @JsProperty(name="mechanism")
    void setMechanism(String value);
}
