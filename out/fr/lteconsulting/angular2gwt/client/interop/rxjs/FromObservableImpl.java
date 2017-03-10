package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\FromObservable.d.ts
  * Package rxjs
  * Name FromObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="FromObservable" )
public class FromObservableImpl<T> extends Observable<T> {
    @JsProperty(name="ish")
    Object getIsh();
    @JsProperty(name="ish")
    void setIsh(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public FromObservableImpl(/* NO SYMBOL */ObservableInput<T> ish,IScheduler /* optional */ scheduler) {}
    public static native <T> Observable<T> create(/* NO SYMBOL */ObservableInput<T> ish,IScheduler /* optional */ scheduler);
    public static native <T,R> Observable<R> create(ArrayLike<T> ish,IScheduler /* optional */ scheduler);
    public native  Object _subscribe(Subscriber<T> subscriber);
}
