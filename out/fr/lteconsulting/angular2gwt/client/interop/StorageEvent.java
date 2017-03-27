package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name StorageEvent
  * Typescript fqn StorageEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface StorageEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="url")
    String getUrl();

    @JsProperty(name="url")
    void setUrl(String value);

    /* optional property key*/    @JsProperty(name="key")
    String getKey();

    @JsProperty(name="key")
    void setKey(String value);

    /* optional property oldValue*/    @JsProperty(name="oldValue")
    String getOldValue();

    @JsProperty(name="oldValue")
    void setOldValue(String value);

    /* optional property newValue*/    @JsProperty(name="newValue")
    String getNewValue();

    @JsProperty(name="newValue")
    void setNewValue(String value);

    /* optional property storageArea*/    @JsProperty(name="storageArea")
    Storage getStorageArea();

    @JsProperty(name="storageArea")
    void setStorageArea(Storage value);
}
