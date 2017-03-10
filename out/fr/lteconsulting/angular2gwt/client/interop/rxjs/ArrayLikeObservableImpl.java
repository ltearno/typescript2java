package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\ArrayLikeObservable.d.ts
  * Package rxjs
  * Name ArrayLikeObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="ArrayLikeObservable" )
public class ArrayLikeObservableImpl<T> extends Observable<T> {
    @JsProperty(name="arrayLike")
    Object getArrayLike();
    @JsProperty(name="arrayLike")
    void setArrayLike(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    public static native <T> Observable<T> create(ArrayLike<T> arrayLike,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public ArrayLikeObservableImpl(ArrayLike<T> arrayLike,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
