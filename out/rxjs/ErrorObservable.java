package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ErrorObservable.d.ts
  * Package rxjs
  * Name ErrorObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ErrorObservable extends Observable<Object> {
    public Object error;
    public Object scheduler;
    public static native  ErrorObservable create(Object error,IScheduler /* optional */ scheduler);
    public static native  void dispatch(DispatchArg arg);
    @JsConstructor
    public ErrorObservable(Object error,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Object subscriber);
}
