package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ArrayObservable.d.ts
  * Package rxjs
  * Name ArrayObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ArrayObservable<T> extends Observable<T> {
    public Object array;
    public Object scheduler;
    public static native <T> Observable<T> create(JsArray<T> array,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,T item5,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,T item5,T item6,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(Array<Object /* UnionType */> /* optional */ undefined);
    public static native  void dispatch(Object state);
    public Object value;
    @JsConstructor
    public ArrayObservable(JsArray<T> array,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
