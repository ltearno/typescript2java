package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\testing\facade\errors.d.ts
  * Package ng.core
  * Name BaseError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BaseError extends Error {
    @JsConstructor
    public BaseError(String message) {}
    public String message;
    public String name;
    public Object stack;
    public native  String toString();
}
