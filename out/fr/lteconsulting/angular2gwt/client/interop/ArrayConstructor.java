package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ArrayConstructor
  * Typescript fqn ArrayConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ArrayConstructor {
    /**
     * Creates an array from an iterable object.
     */
    <T,U> Array<U> from(Iterable<T> iterable, JsFunction2<T,Number,U> mapfn, Object /* optional */ thisArg);

    /**
     * Creates an array from an iterable object.
     */
    <T> Array<T> from(Iterable<T> iterable);
}
