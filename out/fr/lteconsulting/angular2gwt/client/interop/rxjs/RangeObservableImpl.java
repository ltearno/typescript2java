package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\RangeObservable.d.ts
  * Package rxjs
  * Name RangeObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="RangeObservable" )
public class RangeObservableImpl extends Observable<Integer> {
    public static native  Observable<Integer> create(int /* optional */ start,int /* optional */ count,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsProperty(name="start")
    Object getStart();
    @JsProperty(name="start")
    void setStart(Object value);
    @JsProperty(name="_count")
    Object get_count();
    @JsProperty(name="_count")
    void set_count(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public RangeObservableImpl(int start,int count,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Integer> subscriber);
}
