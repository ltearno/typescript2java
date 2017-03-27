package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ReadonlySet
  * Typescript fqn ReadonlySet
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ReadonlySet<T> {
    @JsProperty(name="size")
    Number getSize();

    @JsProperty(name="size")
    void setSize(Number value);

    void forEach(JsFunction3<T,T,ReadonlySet<T>,Void> callbackfn, Object /* optional */ thisArg);

    boolean has(T value);
}
