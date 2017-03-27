package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Int32ArrayConstructor
  * Typescript fqn Int32ArrayConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Int32ArrayConstructor {
    /**
     * Creates an array from an array-like or iterable object.
     */
    Int32Array from(Iterable<Number> arrayLike, JsFunction2<Number,Number,Number> /* optional */ mapfn, Object /* optional */ thisArg);
}
