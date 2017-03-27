package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaKeyStatusMap
  * Typescript fqn MediaKeyStatusMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaKeyStatusMap {
    @JsProperty(name="size")
    Number getSize();

    @JsProperty(name="size")
    void setSize(Number value);

    void forEach(ForEachCallback callback);

    String get(Object keyId);

    boolean has(Object keyId);
}
