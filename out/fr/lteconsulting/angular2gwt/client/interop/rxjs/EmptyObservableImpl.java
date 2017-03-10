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
@JsType( isNative=true, namespace="rxjs", name="EmptyObservable" )
public class EmptyObservableImpl<T> extends Observable<T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    public static native <T> Observable<T> create(IScheduler /* optional */ scheduler);
    public static native <T> void dispatch(DispatchArg<T> arg);
    @JsConstructor
    public EmptyObservableImpl(IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
