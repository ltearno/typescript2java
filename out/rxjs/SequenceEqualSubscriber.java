package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\sequenceEqual.d.ts
  * Package rxjs
  * Name SequenceEqualSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SequenceEqualSubscriber<T,R> extends Subscriber<T> {
    public Object compareTo;
    public Object comparor;
    public Object _a;
    public Object _b;
    public Object _oneComplete;
    @JsConstructor
    public SequenceEqualSubscriber(Observer<R> destination,Observable<T> compareTo,JsFunction2<T,T,Boolean> comparor) {}
    public native  void _next(T value);
    public native  void _complete();
    public native  void checkValues();
    public native  void emit(boolean value);
    public native  void nextB(T value);
}
