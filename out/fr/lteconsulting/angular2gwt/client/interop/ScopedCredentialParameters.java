package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ScopedCredentialParameters
  * Typescript fqn ScopedCredentialParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ScopedCredentialParameters {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property algorithm*/    @JsProperty(name="algorithm")
    Object /* Union type */ getAlgorithm();

    @JsProperty(name="algorithm")
    void setAlgorithm(Object /* Union type */ value);
}
