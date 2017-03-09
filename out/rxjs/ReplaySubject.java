package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\ReplaySubject.d.ts
  * Package rxjs
  * Name ReplaySubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ReplaySubject<T> extends Subject<T> {
    public Object scheduler;
    public Object _events;
    public Object _bufferSize;
    public Object _windowTime;
    @JsConstructor
    public ReplaySubject(int /* optional */ bufferSize,int /* optional */ windowTime,IScheduler /* optional */ scheduler) {}
    public native  void next(T value);
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  int _getNow();
    public native  void _trimBufferThenGetEvents();
}
