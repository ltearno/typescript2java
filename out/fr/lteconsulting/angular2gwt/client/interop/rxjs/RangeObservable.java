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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RangeObservable extends Observable<Integer> {
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
    public RangeObservable(int start,int count,IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Integer> subscriber);
}
