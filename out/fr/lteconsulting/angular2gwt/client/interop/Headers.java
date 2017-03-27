package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Headers
  * Typescript fqn Headers
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Headers {
    void append(String name, String value);

    void delete(String name);

    void forEach(ForEachCallback callback);

    Object /* UnionType */ get(String name);

    boolean has(String name);

    void set(String name, String value);
}
