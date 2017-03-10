package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\BehaviorSubject.d.ts
  * Package rxjs
  * Name BehaviorSubject
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BehaviorSubject<T> extends Subject<T> {
    @JsProperty(name="_value")
    Object get_value();
    @JsProperty(name="_value")
    void set_value(Object value);
    @JsConstructor
    public BehaviorSubject(T _value) {}
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
     Subscription _subscribe(Subscriber<T> subscriber);
     T getValue();
     void next(T value);
}
