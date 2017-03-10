package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\TimerObservable.d.ts
  * Package rxjs
  * Name TimerObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TimerObservable extends Observable<Integer> {
    @JsProperty(name="period")
    Object getPeriod();
    @JsProperty(name="period")
    void setPeriod(Object value);
    @JsProperty(name="dueTime")
    Object getDueTime();
    @JsProperty(name="dueTime")
    void setDueTime(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public TimerObservable(Object /* UnionType */ /* optional */ dueTime,Object /* UnionType */ /* optional */ period,IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Integer> subscriber);
}
