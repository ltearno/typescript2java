package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpHeaderExtensionParameters
  * Typescript fqn RTCRtpHeaderExtensionParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpHeaderExtensionParameters {
    /* optional property uri*/    @JsProperty(name="uri")
    String getUri();

    @JsProperty(name="uri")
    void setUri(String value);

    /* optional property id*/    @JsProperty(name="id")
    Number getId();

    @JsProperty(name="id")
    void setId(Number value);

    /* optional property encrypt*/    @JsProperty(name="encrypt")
    boolean getEncrypt();

    @JsProperty(name="encrypt")
    void setEncrypt(boolean value);
}
