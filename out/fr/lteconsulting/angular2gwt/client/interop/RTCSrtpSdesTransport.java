package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCSrtpSdesTransport
  * Typescript fqn RTCSrtpSdesTransport
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCSrtpSdesTransport extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="onerror")
    JsFunction2<RTCSrtpSdesTransport,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<RTCSrtpSdesTransport,Event,Object> value);

    @JsProperty(name="transport")
    RTCIceTransport getTransport();

    @JsProperty(name="transport")
    void setTransport(RTCIceTransport value);

    <K> void addEventListener(K type, JsFunction2<RTCSrtpSdesTransport,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
