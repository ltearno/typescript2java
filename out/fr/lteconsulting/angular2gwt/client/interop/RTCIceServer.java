package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceServer
  * Typescript fqn RTCIceServer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceServer {
    /* optional property urls*/    @JsProperty(name="urls")
    Object getUrls();

    @JsProperty(name="urls")
    void setUrls(Object value);

    /* optional property username*/    @JsProperty(name="username")
    String getUsername();

    @JsProperty(name="username")
    void setUsername(String value);

    /* optional property credential*/    @JsProperty(name="credential")
    String getCredential();

    @JsProperty(name="credential")
    void setCredential(String value);
}
