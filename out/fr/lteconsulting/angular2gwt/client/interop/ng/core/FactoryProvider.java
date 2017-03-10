package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\di\provider.d.ts
  * Package ng.core
  * Name FactoryProvider
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FactoryProvider  {
    @JsProperty(name="provide")
    Object provide();
    @JsProperty(name="provide")
    void provide(Object value);
    @JsProperty(name="useFactory")
    Function useFactory();
    @JsProperty(name="useFactory")
    void useFactory(Function value);
    /* optional property deps*/    @JsProperty(name="deps")
    JsArray<Object> deps();
    @JsProperty(name="deps")
    void deps(JsArray<Object> value);
    /* optional property multi*/    @JsProperty(name="multi")
    boolean multi();
    @JsProperty(name="multi")
    void multi(boolean value);
}
