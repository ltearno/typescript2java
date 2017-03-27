package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ClipboardEvent
  * Typescript fqn ClipboardEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ClipboardEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="clipboardData")
    DataTransfer getClipboardData();

    @JsProperty(name="clipboardData")
    void setClipboardData(DataTransfer value);
}
