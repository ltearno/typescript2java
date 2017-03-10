package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\testing\facade\errors.d.ts
  * Package ng.core
  * Name BaseError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BaseError extends Error {
    @JsConstructor
    public BaseError(String message) {}
    @JsProperty(name="message")
    String getMessage();
    @JsProperty(name="message")
    void setMessage(String value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="stack")
    Object getStack();
    @JsProperty(name="stack")
    void setStack(Object value);
     String toString();
}
