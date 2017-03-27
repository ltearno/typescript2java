package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpSenderEventMap
  * Typescript fqn RTCRtpSenderEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpSenderEventMap {
    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="ssrcconflict")
    RTCSsrcConflictEvent getSsrcconflict();

    @JsProperty(name="ssrcconflict")
    void setSsrcconflict(RTCSsrcConflictEvent value);
}
