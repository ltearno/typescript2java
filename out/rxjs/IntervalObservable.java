package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\IntervalObservable.d.ts
  * Package rxjs
  * Name IntervalObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class IntervalObservable extends Observable<Integer> {
    public Object period;
    public Object scheduler;
    public static native  Observable<Integer> create(int /* optional */ period,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    @JsConstructor
    public IntervalObservable(int /* optional */ period,IScheduler /* optional */ scheduler) {}
    public native  void _subscribe(Subscriber<Integer> subscriber);
}
