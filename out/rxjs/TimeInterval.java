package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\timeInterval.d.ts
  * Package rxjs
  * Name TimeInterval
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class TimeInterval<T>  {
    public T value;
    public int interval;
    @JsConstructor
    public TimeInterval(T value,int interval) {}
}
