package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.ScalarObservable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\ScalarObservable.d.ts
  * Package rxjs
  * Name ScalarObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="ScalarObservable" )
public class ScalarObservableImpl<T> extends Observable<T> {
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    public static native <T> ScalarObservable<T> create(T value,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsProperty(name="_isScalar")
    boolean get_isScalar();
    @JsProperty(name="_isScalar")
    void set_isScalar(boolean value);
    @JsConstructor
    public ScalarObservableImpl(T value,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
