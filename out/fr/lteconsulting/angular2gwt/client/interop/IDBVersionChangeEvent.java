package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBVersionChangeEvent
  * Typescript fqn IDBVersionChangeEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBVersionChangeEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="newVersion")
    Number getNewVersion();

    @JsProperty(name="newVersion")
    void setNewVersion(Number value);

    @JsProperty(name="oldVersion")
    Number getOldVersion();

    @JsProperty(name="oldVersion")
    void setOldVersion(Number value);
}
