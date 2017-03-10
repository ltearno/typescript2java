package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\di\provider.d.ts
  * Package ng.core
  * Name ValueProvider
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ValueProvider  {
    @JsProperty(name="provide")
    Object provide();
    @JsProperty(name="provide")
    void provide(Object value);
    @JsProperty(name="useValue")
    Object useValue();
    @JsProperty(name="useValue")
    void useValue(Object value);
    /* optional property multi*/    @JsProperty(name="multi")
    boolean multi();
    @JsProperty(name="multi")
    void multi(boolean value);
}
