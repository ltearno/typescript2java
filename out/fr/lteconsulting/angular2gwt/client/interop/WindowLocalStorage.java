package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WindowLocalStorage
  * Typescript fqn WindowLocalStorage
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WindowLocalStorage {
    @JsProperty(name="localStorage")
    Storage getLocalStorage();

    @JsProperty(name="localStorage")
    void setLocalStorage(Storage value);
}
