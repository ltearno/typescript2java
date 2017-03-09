package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\PairsObservable.d.ts
  * Package rxjs
  * Name PairsObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class PairsObservable<T> extends Observable<Array<Object /* UnionType */>> {
    public Object obj;
    public Object scheduler;
    public Object keys;
    public static native <T> Observable<Array<Object /* UnionType */>> create(Object obj,IScheduler /* optional */ scheduler);
    @JsConstructor
    public PairsObservable(Object obj,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Array<Object /* UnionType */>> subscriber);
}
