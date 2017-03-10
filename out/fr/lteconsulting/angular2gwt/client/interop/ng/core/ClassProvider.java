package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\di\provider.d.ts
  * Package ng.core
  * Name ClassProvider
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ClassProvider  {
    @JsProperty(name="provide")
    Object provide();
    @JsProperty(name="provide")
    void provide(Object value);
    @JsProperty(name="useClass")
    Type<Object> useClass();
    @JsProperty(name="useClass")
    void useClass(Type<Object> value);
    /* optional property multi*/    @JsProperty(name="multi")
    boolean multi();
    @JsProperty(name="multi")
    void multi(boolean value);
}
