package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Observable;
import rxjs.DispatchArg;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\EmptyObservable.d.ts
  * Package rxjs
  * Name EmptyObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface EmptyObservable<T> extends Observable<T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public EmptyObservable(IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
