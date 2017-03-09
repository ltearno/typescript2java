package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\FromObservable.d.ts
  * Package rxjs
  * Name FromObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class FromObservable<T> extends Observable<T> {
    public Object ish;
    public Object scheduler;
    @JsConstructor
    public FromObservable(/* NO SYMBOL */ObservableInput<T> ish,IScheduler /* optional */ scheduler) {}
    public static native <T> Observable<T> create(/* NO SYMBOL */ObservableInput<T> ish,IScheduler /* optional */ scheduler);
    public static native <T,R> Observable<R> create(ArrayLike<T> ish,IScheduler /* optional */ scheduler);
    public native  Object _subscribe(Subscriber<T> subscriber);
}
