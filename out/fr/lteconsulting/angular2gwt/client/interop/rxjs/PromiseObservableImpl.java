package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\PromiseObservable.d.ts
  * Package rxjs
  * Name PromiseObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="PromiseObservable" )
public class PromiseObservableImpl<T> extends Observable<T> {
    @JsProperty(name="promise")
    Object getPromise();
    @JsProperty(name="promise")
    void setPromise(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    public static native <T> Observable<T> create(Promise<T> promise,IScheduler /* optional */ scheduler);
    @JsConstructor
    public PromiseObservableImpl(Promise<T> promise,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
