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
@JsType( isNative=true, namespace="ng.core", name="BaseError" )
public class BaseErrorImpl extends Error {
    @JsConstructor
    public BaseErrorImpl(String message) {}
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
    public native  String toString();
}
