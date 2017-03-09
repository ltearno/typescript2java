package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\shared.d.ts
  * Package ng.router
  * Name NavigationCancelingError
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class NavigationCancelingError extends Error {
    public String message;
    public Object stack;
    @JsConstructor
    public NavigationCancelingError(String message) {}
    public native  String toString();
}
