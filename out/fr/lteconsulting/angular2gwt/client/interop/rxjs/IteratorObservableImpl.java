package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.IteratorObservable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\IteratorObservable.d.ts
  * Package rxjs
  * Name IteratorObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="IteratorObservable" )
public class IteratorObservableImpl<T> extends Observable<T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="iterator")
    Object getIterator();
    @JsProperty(name="iterator")
    void setIterator(Object value);
    public static native <T> IteratorObservable<T> create(Object iterator,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsConstructor
    public IteratorObservableImpl(Object iterator,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
