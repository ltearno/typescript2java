package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\util\Set.d.ts
  * Package rxjs
  * Name ISet
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ISet<T>  {
     void add(T value);
     boolean has(T value);
    @JsProperty(name="size")
    int size();
    @JsProperty(name="size")
    void size(int value);
     void clear();
}
