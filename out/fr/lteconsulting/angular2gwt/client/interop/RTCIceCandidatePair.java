package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceCandidatePair
  * Typescript fqn RTCIceCandidatePair
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceCandidatePair {
    /* optional property local*/    @JsProperty(name="local")
    RTCIceCandidateDictionary getLocal();

    @JsProperty(name="local")
    void setLocal(RTCIceCandidateDictionary value);

    /* optional property remote*/    @JsProperty(name="remote")
    RTCIceCandidateDictionary getRemote();

    @JsProperty(name="remote")
    void setRemote(RTCIceCandidateDictionary value);
}
