package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IteratorResult
  * Typescript fqn IteratorResult
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IteratorResult<T> {
    @JsProperty(name="done")
    boolean getDone();

    @JsProperty(name="done")
    void setDone(boolean value);

    @JsProperty(name="value")
    T getValue();

    @JsProperty(name="value")
    void setValue(T value);
}
