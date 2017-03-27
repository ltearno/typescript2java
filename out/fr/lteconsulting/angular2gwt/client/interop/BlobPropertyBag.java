package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name BlobPropertyBag
  * Typescript fqn BlobPropertyBag
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface BlobPropertyBag {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property endings*/    @JsProperty(name="endings")
    String getEndings();

    @JsProperty(name="endings")
    void setEndings(String value);
}
