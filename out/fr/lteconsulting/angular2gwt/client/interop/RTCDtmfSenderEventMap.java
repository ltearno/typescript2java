package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDtmfSenderEventMap
  * Typescript fqn RTCDtmfSenderEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDtmfSenderEventMap {
    @JsProperty(name="tonechange")
    RTCDTMFToneChangeEvent getTonechange();

    @JsProperty(name="tonechange")
    void setTonechange(RTCDTMFToneChangeEvent value);
}
