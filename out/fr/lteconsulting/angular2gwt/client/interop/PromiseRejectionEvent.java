package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PromiseRejectionEvent
  * Typescript fqn PromiseRejectionEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PromiseRejectionEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="promise")
    PromiseLike<Object> getPromise();

    @JsProperty(name="promise")
    void setPromise(PromiseLike<Object> value);

    @JsProperty(name="reason")
    Object getReason();

    @JsProperty(name="reason")
    void setReason(Object value);
}
