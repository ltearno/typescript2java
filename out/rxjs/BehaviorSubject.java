package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\BehaviorSubject.d.ts
  * Package rxjs
  * Name BehaviorSubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class BehaviorSubject<T> extends Subject<T> {
    public Object _value;
    @JsConstructor
    public BehaviorSubject(T _value) {}
    public T value;
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  T getValue();
    public native  void next(T value);
}
