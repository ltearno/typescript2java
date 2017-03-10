package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.ErrorObservable;
import rxjs.DispatchArg;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ErrorObservable.d.ts
  * Package rxjs
  * Name ErrorObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ErrorObservable extends Observable<Object> {
    @JsProperty(name="error")
    Object getError();
    @JsProperty(name="error")
    void setError(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public ErrorObservable(Object error,IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Object subscriber);
}
