package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Float32ArrayConstructor
  * Typescript fqn Float32ArrayConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Float32ArrayConstructor {
    /**
     * Creates an array from an array-like or iterable object.
     */
    Float32Array from(Iterable<Number> arrayLike, JsFunction2<Number,Number,Number> /* optional */ mapfn, Object /* optional */ thisArg);
}
