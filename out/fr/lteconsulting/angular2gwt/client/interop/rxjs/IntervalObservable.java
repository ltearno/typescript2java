package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\IntervalObservable.d.ts
  * Package rxjs
  * Name IntervalObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IntervalObservable extends Observable<Integer> {
    @JsProperty(name="period")
    Object getPeriod();
    @JsProperty(name="period")
    void setPeriod(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public IntervalObservable(int /* optional */ period,IScheduler /* optional */ scheduler) {}
     void _subscribe(Subscriber<Integer> subscriber);
}
