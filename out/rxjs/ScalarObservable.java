package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ScalarObservable.d.ts
  * Package rxjs
  * Name ScalarObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ScalarObservable<T> extends Observable<T> {
    public T value;
    public Object scheduler;
    public static native <T> ScalarObservable<T> create(T value,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    public boolean _isScalar;
    @JsConstructor
    public ScalarObservable(T value,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
