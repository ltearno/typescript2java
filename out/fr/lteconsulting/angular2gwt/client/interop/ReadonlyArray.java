package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ReadonlyArray
  * Typescript fqn ReadonlyArray
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ReadonlyArray<T> {
    /**
     * Returns the value of the first element in the array where predicate is true, and undefined
     * otherwise.
     */
    Object /* UnionType */ find(JsFunction3<T,Number,ReadonlyArray<T>,Boolean> predicate, Object /* optional */ thisArg);

    /**
     * Returns the index of the first element in the array where predicate is true, and -1
     * otherwise.
     */
    Number findIndex(JsFunction3<T,Number,Array<T>,Boolean> predicate, Object /* optional */ thisArg);
}
