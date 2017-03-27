package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WindowSessionStorage
  * Typescript fqn WindowSessionStorage
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WindowSessionStorage {
    @JsProperty(name="sessionStorage")
    Storage getSessionStorage();

    @JsProperty(name="sessionStorage")
    void setSessionStorage(Storage value);
}
