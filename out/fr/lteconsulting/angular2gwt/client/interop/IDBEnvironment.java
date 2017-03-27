package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBEnvironment
  * Typescript fqn IDBEnvironment
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBEnvironment {
    @JsProperty(name="indexedDB")
    IDBFactory getIndexedDB();

    @JsProperty(name="indexedDB")
    void setIndexedDB(IDBFactory value);
}
