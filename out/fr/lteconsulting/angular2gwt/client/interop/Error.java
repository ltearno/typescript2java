package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Error
  * Typescript fqn Error
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Error {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="message")
    String getMessage();

    @JsProperty(name="message")
    void setMessage(String value);

    /* optional property stack*/    @JsProperty(name="stack")
    String getStack();

    @JsProperty(name="stack")
    void setStack(String value);
}
