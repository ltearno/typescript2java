package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observer;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\sequenceEqual.d.ts
  * Package rxjs
  * Name SequenceEqualSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SequenceEqualSubscriber<T,R> extends Subscriber<T> {
    @JsProperty(name="compareTo")
    Object getCompareTo();
    @JsProperty(name="compareTo")
    void setCompareTo(Object value);
    @JsProperty(name="comparor")
    Object getComparor();
    @JsProperty(name="comparor")
    void setComparor(Object value);
    @JsProperty(name="_a")
    Object get_a();
    @JsProperty(name="_a")
    void set_a(Object value);
    @JsProperty(name="_b")
    Object get_b();
    @JsProperty(name="_b")
    void set_b(Object value);
    @JsProperty(name="_oneComplete")
    Object get_oneComplete();
    @JsProperty(name="_oneComplete")
    void set_oneComplete(Object value);
    @JsConstructor
    public SequenceEqualSubscriber(Observer<R> destination,Observable<T> compareTo,JsFunction2<T,T,Boolean> comparor) {}
     void _next(T value);
     void _complete();
     void checkValues();
     void emit(boolean value);
     void nextB(T value);
}
