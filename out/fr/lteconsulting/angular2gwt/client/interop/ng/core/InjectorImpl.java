package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;

/**
  * Generated from tests\@angular\core\src\di\injector.d.ts
  * Package ng.core
  * Name Injector
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Injector" )
public abstract class InjectorImpl  {
    @JsProperty(name="THROW_IF_NOT_FOUND")
    static Object getTHROW_IF_NOT_FOUND();
    @JsProperty(name="THROW_IF_NOT_FOUND")
    static void setTHROW_IF_NOT_FOUND(Object value);
    @JsProperty(name="NULL")
    static Injector getNULL();
    @JsProperty(name="NULL")
    static void setNULL(Injector value);
    public native  Object get(Object token,Object /* optional */ notFoundValue);
}
