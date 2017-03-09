package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\di\injector.d.ts
  * Package ng.core
  * Name Injector
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface Injector  {
    @JsProperty(name="THROW_IF_NOT_FOUND")
    static Object THROW_IF_NOT_FOUND();
    @JsProperty(name="THROW_IF_NOT_FOUND")
    static void THROW_IF_NOT_FOUND(Object value);
    @JsProperty(name="NULL")
    static Injector NULL();
    @JsProperty(name="NULL")
    static void NULL(Injector value);
     Object get(Object token,Object /* optional */ notFoundValue);
}
