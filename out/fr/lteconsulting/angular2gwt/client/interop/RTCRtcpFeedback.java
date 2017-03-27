package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtcpFeedback
  * Typescript fqn RTCRtcpFeedback
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtcpFeedback {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property parameter*/    @JsProperty(name="parameter")
    String getParameter();

    @JsProperty(name="parameter")
    void setParameter(String value);
}
