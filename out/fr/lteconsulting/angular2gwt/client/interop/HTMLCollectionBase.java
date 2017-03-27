package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLCollectionBase
  * Typescript fqn HTMLCollectionBase
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLCollectionBase {
    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JsProperty(name="length")
    Number getLength();

    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JsProperty(name="length")
    void setLength(Number value);

    /**
     * Retrieves an object from various collections.
     */
    Element item(Number index);
}
