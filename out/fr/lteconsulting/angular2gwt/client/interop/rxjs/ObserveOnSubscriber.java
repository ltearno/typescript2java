package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Action;
import rxjs.ObserveOnMessage;
import rxjs.Subscriber;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\observeOn.d.ts
  * Package rxjs
  * Name ObserveOnSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ObserveOnSubscriber<T> extends Subscriber<T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="delay")
    Object getDelay();
    @JsProperty(name="delay")
    void setDelay(Object value);
    @JsConstructor
    public ObserveOnSubscriber(Subscriber<T> destination,IScheduler scheduler,int /* optional */ delay) {}
     void scheduleMessage();
     void _next(T value);
     void _error(Object err);
     void _complete();
}
