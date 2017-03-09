package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\RangeObservable.d.ts
  * Package rxjs
  * Name RangeObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class RangeObservable extends Observable<Integer> {
    public static native  Observable<Integer> create(int /* optional */ start,int /* optional */ count,IScheduler /* optional */ scheduler);
    public static native  void dispatch(Object state);
    public Object start;
    public Object _count;
    public Object scheduler;
    @JsConstructor
    public RangeObservable(int start,int count,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Integer> subscriber);
}
