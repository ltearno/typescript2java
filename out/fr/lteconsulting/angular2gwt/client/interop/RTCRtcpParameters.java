package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtcpParameters
  * Typescript fqn RTCRtcpParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtcpParameters {
    /* optional property ssrc*/    @JsProperty(name="ssrc")
    Number getSsrc();

    @JsProperty(name="ssrc")
    void setSsrc(Number value);

    /* optional property cname*/    @JsProperty(name="cname")
    String getCname();

    @JsProperty(name="cname")
    void setCname(String value);

    /* optional property reducedSize*/    @JsProperty(name="reducedSize")
    boolean getReducedSize();

    @JsProperty(name="reducedSize")
    void setReducedSize(boolean value);

    /* optional property mux*/    @JsProperty(name="mux")
    boolean getMux();

    @JsProperty(name="mux")
    void setMux(boolean value);
}
