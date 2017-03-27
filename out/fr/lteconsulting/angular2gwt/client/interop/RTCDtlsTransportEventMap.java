package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDtlsTransportEventMap
  * Typescript fqn RTCDtlsTransportEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDtlsTransportEventMap {
    @JsProperty(name="dtlsstatechange")
    RTCDtlsTransportStateChangedEvent getDtlsstatechange();

    @JsProperty(name="dtlsstatechange")
    void setDtlsstatechange(RTCDtlsTransportStateChangedEvent value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);
}
