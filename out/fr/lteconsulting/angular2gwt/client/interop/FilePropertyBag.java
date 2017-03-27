package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name FilePropertyBag
  * Typescript fqn FilePropertyBag
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface FilePropertyBag {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property lastModified*/    @JsProperty(name="lastModified")
    Number getLastModified();

    @JsProperty(name="lastModified")
    void setLastModified(Number value);
}
