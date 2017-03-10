package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\observeOn.d.ts
  * Package rxjs
  * Name ObserveOnOperator
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ObserveOnOperator<T> extends Operator<T,T> {
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="delay")
    Object getDelay();
    @JsProperty(name="delay")
    void setDelay(Object value);
    @JsConstructor
    public ObserveOnOperator(IScheduler scheduler,int /* optional */ delay) {}
     /* NO SYMBOL */TeardownLogic call(Subscriber<T> subscriber,Object source);
}
