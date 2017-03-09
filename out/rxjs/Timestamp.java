package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\timestamp.d.ts
  * Package rxjs
  * Name Timestamp
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class Timestamp<T>  {
    public T value;
    public int timestamp;
    @JsConstructor
    public Timestamp(T value,int timestamp) {}
}
