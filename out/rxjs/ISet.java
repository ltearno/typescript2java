package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\rxjs\util\Set.d.ts
  * Package rxjs
  * Name ISet
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ISet<T>  {
    public native  void add(T value);
    public native  boolean has(T value);
    public int size;
    public native  void clear();
}
