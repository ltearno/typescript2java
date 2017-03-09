package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\SubscribeOnObservable.d.ts
  * Package rxjs
  * Name SubscribeOnObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SubscribeOnObservable<T> extends Observable<T> {
    public Observable<T> source;
    public Object delayTime;
    public Object scheduler;
    public static native <T> Observable<T> create(Observable<T> source,int /* optional */ delay,IScheduler /* optional */ scheduler);
    public static native <T> Subscription dispatch(Action<T> this,DispatchArg<T> arg);
    @JsConstructor
    public SubscribeOnObservable(Observable<T> source,int /* optional */ delayTime,IScheduler /* optional */ scheduler) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
