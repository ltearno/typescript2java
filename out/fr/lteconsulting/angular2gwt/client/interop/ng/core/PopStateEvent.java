package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\common\src\location\location.d.ts
  * Package ng.core
  * Name PopStateEvent
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PopStateEvent  {
    /* optional property pop*/    @JsProperty(name="pop")
    boolean pop();
    @JsProperty(name="pop")
    void pop(boolean value);
    /* optional property type*/    @JsProperty(name="type")
    String type();
    @JsProperty(name="type")
    void type(String value);
    /* optional property url*/    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
}
