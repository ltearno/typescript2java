package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCSessionDescriptionInit
  * Typescript fqn RTCSessionDescriptionInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCSessionDescriptionInit {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property sdp*/    @JsProperty(name="sdp")
    String getSdp();

    @JsProperty(name="sdp")
    void setSdp(String value);
}
