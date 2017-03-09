package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\testing\facade\errors.d.ts
  * Package ng.core
  * Name WrappedError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class WrappedError extends BaseError {
    public Object originalError;
    @JsConstructor
    public WrappedError(String message,Object error) {}
    public Object stack;
}
