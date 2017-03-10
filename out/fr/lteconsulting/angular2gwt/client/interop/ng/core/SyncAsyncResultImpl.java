package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\util.d.ts
  * Package ng.core
  * Name SyncAsyncResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="SyncAsyncResult" )
public class SyncAsyncResultImpl<T>  {
    @JsProperty(name="syncResult")
    T getSyncResult();
    @JsProperty(name="syncResult")
    void setSyncResult(T value);
    @JsProperty(name="asyncResult")
    Promise<T> getAsyncResult();
    @JsProperty(name="asyncResult")
    void setAsyncResult(Promise<T> value);
    @JsConstructor
    public SyncAsyncResultImpl(T syncResult,Promise<T> /* optional */ asyncResult) {}
}
