package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBObjectStoreParameters
  * Typescript fqn IDBObjectStoreParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBObjectStoreParameters {
    /* optional property autoIncrement*/    @JsProperty(name="autoIncrement")
    boolean getAutoIncrement();

    @JsProperty(name="autoIncrement")
    void setAutoIncrement(boolean value);

    /* optional property keyPath*/    @JsProperty(name="keyPath")
    String getKeyPath();

    @JsProperty(name="keyPath")
    void setKeyPath(String value);
}
