package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\error_handler.d.ts
  * Package ng.core
  * Name ErrorHandler
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ErrorHandler" )
public class ErrorHandlerImpl  {
    @JsConstructor
    public ErrorHandlerImpl(boolean /* optional */ rethrowError) {}
    public native  void handleError(Object error);
}
