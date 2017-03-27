package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TimeRanges
  * Typescript fqn TimeRanges
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TimeRanges {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    Number end(Number index);

    Number start(Number index);
}
