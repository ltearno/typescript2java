package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Float64ArrayConstructor
  * Typescript fqn Float64ArrayConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Float64ArrayConstructor {
    /**
     * Creates an array from an array-like or iterable object.
     */
    Float64Array from(Iterable<Number> arrayLike, JsFunction2<Number,Number,Number> /* optional */ mapfn, Object /* optional */ thisArg);
}
