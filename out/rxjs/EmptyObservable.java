package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\EmptyObservable.d.ts
  * Package rxjs
  * Name EmptyObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class EmptyObservable<T> extends Observable<T> {
    public Object scheduler;
    public static native <T> Observable<T> create(IScheduler /* optional */ scheduler);
    public static native <T> void dispatch(DispatchArg<T> arg);
    @JsConstructor
    public EmptyObservable(IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
