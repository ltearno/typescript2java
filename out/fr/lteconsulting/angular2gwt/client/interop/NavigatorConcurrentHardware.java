package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigatorConcurrentHardware
  * Typescript fqn NavigatorConcurrentHardware
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigatorConcurrentHardware {
    @JsProperty(name="hardwareConcurrency")
    Number getHardwareConcurrency();

    @JsProperty(name="hardwareConcurrency")
    void setHardwareConcurrency(Number value);
}
