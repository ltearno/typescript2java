package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSStream
  * Typescript fqn MSStream
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSStream {
    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    void msClose();

    Object msDetachStream();
}
