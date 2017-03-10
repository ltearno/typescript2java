package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\ArrayObservable.d.ts
  * Package rxjs
  * Name ArrayObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="ArrayObservable" )
public class ArrayObservableImpl<T> extends Observable<T> {
    @JsProperty(name="array")
    Object getArray();
    @JsProperty(name="array")
    void setArray(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    public static native <T> Observable<T> create(JsArray<T> array,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,T item5,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(T item1,T item2,T item3,T item4,T item5,T item6,IScheduler /* optional */ scheduler);
    public static native <T> Observable<T> of(Array<Object /* UnionType */> /* optional */ undefined);
    public static native  void dispatch(Object state);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public ArrayObservableImpl(JsArray<T> array,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
