package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBIndexParameters
  * Typescript fqn IDBIndexParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBIndexParameters {
    /* optional property multiEntry*/    @JsProperty(name="multiEntry")
    boolean getMultiEntry();

    @JsProperty(name="multiEntry")
    void setMultiEntry(boolean value);

    /* optional property unique*/    @JsProperty(name="unique")
    boolean getUnique();

    @JsProperty(name="unique")
    void setUnique(boolean value);
}
