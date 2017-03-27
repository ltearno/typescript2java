package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Blob
  * Typescript fqn Blob
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Blob {
    @JsProperty(name="size")
    Number getSize();

    @JsProperty(name="size")
    void setSize(Number value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    void msClose();

    Object msDetachStream();

    Blob slice(Number /* optional */ start, Number /* optional */ end, String /* optional */ contentType);
}
