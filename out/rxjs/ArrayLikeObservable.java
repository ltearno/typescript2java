package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ArrayLikeObservable.d.ts
  * Package rxjs
  * Name ArrayLikeObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ArrayLikeObservable<T> extends Observable<T> {
    public Object arrayLike;
    public Object scheduler;
    public static native <T> Observable<T> create(ArrayLike<T> arrayLike,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    public Object value;
    @JsConstructor
    public ArrayLikeObservable(ArrayLike<T> arrayLike,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
