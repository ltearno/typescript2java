package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\IteratorObservable.d.ts
  * Package rxjs
  * Name IteratorObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class IteratorObservable<T> extends Observable<T> {
    public Object scheduler;
    public Object iterator;
    public static native <T> IteratorObservable<T> create(Object iterator,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsConstructor
    public IteratorObservable(Object iterator,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
