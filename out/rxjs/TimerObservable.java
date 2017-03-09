package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\TimerObservable.d.ts
  * Package rxjs
  * Name TimerObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class TimerObservable extends Observable<Integer> {
    public static native  Observable<Integer> create(Object /* UnionType */ /* optional */ initialDelay,Object /* UnionType */ /* optional */ period,IScheduler /* optional */ scheduler);
    public static native  Object dispatch(Object state);
    public Object period;
    public Object dueTime;
    public Object scheduler;
    @JsConstructor
    public TimerObservable(Object /* UnionType */ /* optional */ dueTime,Object /* UnionType */ /* optional */ period,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Integer> subscriber);
}
