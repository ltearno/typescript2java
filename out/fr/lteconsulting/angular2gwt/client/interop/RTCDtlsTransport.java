package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDtlsTransport
  * Typescript fqn RTCDtlsTransport
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDtlsTransport extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="ondtlsstatechange")
    JsFunction2<RTCDtlsTransport,RTCDtlsTransportStateChangedEvent,Object> getOndtlsstatechange();

    @JsProperty(name="ondtlsstatechange")
    void setOndtlsstatechange(JsFunction2<RTCDtlsTransport,RTCDtlsTransportStateChangedEvent,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<RTCDtlsTransport,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<RTCDtlsTransport,Event,Object> value);

    @JsProperty(name="state")
    String getState();

    @JsProperty(name="state")
    void setState(String value);

    @JsProperty(name="transport")
    RTCIceTransport getTransport();

    @JsProperty(name="transport")
    void setTransport(RTCIceTransport value);

    RTCDtlsParameters getLocalParameters();

    JsArray<ArrayBuffer> getRemoteCertificates();

    Object /* UnionType */ getRemoteParameters();

    void start(RTCDtlsParameters remoteParameters);

    void stop();

    <K> void addEventListener(K type, JsFunction2<RTCDtlsTransport,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
