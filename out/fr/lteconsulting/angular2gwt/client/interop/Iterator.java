package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Iterator
  * Typescript fqn Iterator
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Iterator<T> {
    IteratorResult<T> next(Object /* optional */ value);

    /* optional */ IteratorResult<T> return(Object /* optional */ value);

    /* optional */ IteratorResult<T> throw(Object /* optional */ e);
}
