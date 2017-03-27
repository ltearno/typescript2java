package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDtlsFingerprint
  * Typescript fqn RTCDtlsFingerprint
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDtlsFingerprint {
    /* optional property algorithm*/    @JsProperty(name="algorithm")
    String getAlgorithm();

    @JsProperty(name="algorithm")
    void setAlgorithm(String value);

    /* optional property value*/    @JsProperty(name="value")
    String getValue();

    @JsProperty(name="value")
    void setValue(String value);
}
