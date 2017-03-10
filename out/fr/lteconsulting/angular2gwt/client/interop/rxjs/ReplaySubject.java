package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\ReplaySubject.d.ts
  * Package rxjs
  * Name ReplaySubject
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReplaySubject<T> extends Subject<T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="_events")
    Object get_events();
    @JsProperty(name="_events")
    void set_events(Object value);
    @JsProperty(name="_bufferSize")
    Object get_bufferSize();
    @JsProperty(name="_bufferSize")
    void set_bufferSize(Object value);
    @JsProperty(name="_windowTime")
    Object get_windowTime();
    @JsProperty(name="_windowTime")
    void set_windowTime(Object value);
    @JsConstructor
    public ReplaySubject(int /* optional */ bufferSize,int /* optional */ windowTime,IScheduler /* optional */ scheduler) {}
     void next(T value);
     Subscription _subscribe(Subscriber<T> subscriber);
     int _getNow();
     void _trimBufferThenGetEvents();
}
