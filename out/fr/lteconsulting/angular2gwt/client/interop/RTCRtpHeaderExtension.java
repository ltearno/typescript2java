package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpHeaderExtension
  * Typescript fqn RTCRtpHeaderExtension
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpHeaderExtension {
    /* optional property kind*/    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    /* optional property uri*/    @JsProperty(name="uri")
    String getUri();

    @JsProperty(name="uri")
    void setUri(String value);

    /* optional property preferredId*/    @JsProperty(name="preferredId")
    Number getPreferredId();

    @JsProperty(name="preferredId")
    void setPreferredId(Number value);

    /* optional property preferredEncrypt*/    @JsProperty(name="preferredEncrypt")
    boolean getPreferredEncrypt();

    @JsProperty(name="preferredEncrypt")
    void setPreferredEncrypt(boolean value);
}
