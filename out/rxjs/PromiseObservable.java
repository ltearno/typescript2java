package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\PromiseObservable.d.ts
  * Package rxjs
  * Name PromiseObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class PromiseObservable<T> extends Observable<T> {
    public Object promise;
    public Object scheduler;
    public T value;
    public static native <T> Observable<T> create(Promise<T> promise,IScheduler /* optional */ scheduler);
    @JsConstructor
    public PromiseObservable(Promise<T> promise,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
