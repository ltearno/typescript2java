package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaEncryptedEvent
  * Typescript fqn MediaEncryptedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaEncryptedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="initData")
    ArrayBuffer getInitData();

    @JsProperty(name="initData")
    void setInitData(ArrayBuffer value);

    @JsProperty(name="initDataType")
    String getInitDataType();

    @JsProperty(name="initDataType")
    void setInitDataType(String value);
}
