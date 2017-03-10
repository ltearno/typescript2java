package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\error_handler.d.ts
  * Package ng.core
  * Name ErrorHandler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ErrorHandler  {
    @JsConstructor
    public ErrorHandler(boolean /* optional */ rethrowError) {}
     void handleError(Object error);
}
