package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\observeOn.d.ts
  * Package rxjs
  * Name ObserveOnSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ObserveOnSubscriber<T> extends Subscriber<T> {
    public Object scheduler;
    public Object delay;
    public static native  void dispatch(Action<ObserveOnMessage> this,ObserveOnMessage arg);
    @JsConstructor
    public ObserveOnSubscriber(Subscriber<T> destination,IScheduler scheduler,int /* optional */ delay) {}
    public native  void scheduleMessage();
    public native  void _next(T value);
    public native  void _error(Object err);
    public native  void _complete();
}
