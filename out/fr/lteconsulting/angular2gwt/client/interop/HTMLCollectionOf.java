package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLCollectionOf
  * Typescript fqn HTMLCollectionOf
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLCollectionOf<T> extends Object /* no JavaNode for symbol */ {
    T item(Number index);

    T namedItem(String name);
}
