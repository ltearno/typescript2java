package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\util.d.ts
  * Package ng.core
  * Name SyncAsyncResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SyncAsyncResult<T>  {
    public T syncResult;
    public Promise<T> asyncResult;
    @JsConstructor
    public SyncAsyncResult(T syncResult,Promise<T> /* optional */ asyncResult) {}
}
