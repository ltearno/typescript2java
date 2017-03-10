package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\shared.d.ts
  * Package ng.router
  * Name NavigationCancelingError
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="NavigationCancelingError" )
public class NavigationCancelingErrorImpl extends Error {
    @JsProperty(name="message")
    String getMessage();
    @JsProperty(name="message")
    void setMessage(String value);
    @JsProperty(name="stack")
    Object getStack();
    @JsProperty(name="stack")
    void setStack(Object value);
    @JsConstructor
    public NavigationCancelingErrorImpl(String message) {}
    public native  String toString();
}
