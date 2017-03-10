package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\testing\facade\errors.d.ts
  * Package ng.core
  * Name WrappedError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WrappedError extends BaseError {
    @JsProperty(name="originalError")
    Object getOriginalError();
    @JsProperty(name="originalError")
    void setOriginalError(Object value);
    @JsConstructor
    public WrappedError(String message,Object error) {}
    @JsProperty(name="stack")
    Object getStack();
    @JsProperty(name="stack")
    void setStack(Object value);
}
