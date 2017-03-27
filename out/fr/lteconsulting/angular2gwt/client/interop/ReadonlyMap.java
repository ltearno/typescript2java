package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ReadonlyMap
  * Typescript fqn ReadonlyMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ReadonlyMap<K, V> {
    @JsProperty(name="size")
    Number getSize();

    @JsProperty(name="size")
    void setSize(Number value);

    void forEach(JsFunction3<V,K,ReadonlyMap<K, V>,Void> callbackfn, Object /* optional */ thisArg);

    Object /* UnionType */ get(K key);

    boolean has(K key);
}
