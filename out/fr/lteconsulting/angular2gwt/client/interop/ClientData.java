package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ClientData
  * Typescript fqn ClientData
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ClientData {
    /* optional property challenge*/    @JsProperty(name="challenge")
    String getChallenge();

    @JsProperty(name="challenge")
    void setChallenge(String value);

    /* optional property origin*/    @JsProperty(name="origin")
    String getOrigin();

    @JsProperty(name="origin")
    void setOrigin(String value);

    /* optional property rpId*/    @JsProperty(name="rpId")
    String getRpId();

    @JsProperty(name="rpId")
    void setRpId(String value);

    /* optional property hashAlg*/    @JsProperty(name="hashAlg")
    Object /* Union type */ getHashAlg();

    @JsProperty(name="hashAlg")
    void setHashAlg(Object /* Union type */ value);

    /* optional property tokenBinding*/    @JsProperty(name="tokenBinding")
    String getTokenBinding();

    @JsProperty(name="tokenBinding")
    void setTokenBinding(String value);

    /* optional property extensions*/    @JsProperty(name="extensions")
    WebAuthnExtensions getExtensions();

    @JsProperty(name="extensions")
    void setExtensions(WebAuthnExtensions value);
}
