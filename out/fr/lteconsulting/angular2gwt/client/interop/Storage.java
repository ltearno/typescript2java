package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Storage
  * Typescript fqn Storage
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Storage {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    void clear();

    Object /* UnionType */ getItem(String key);

    Object /* UnionType */ key(Number index);

    void removeItem(String key);

    void setItem(String key, String data);
}
