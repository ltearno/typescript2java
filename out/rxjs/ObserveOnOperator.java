package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\observeOn.d.ts
  * Package rxjs
  * Name ObserveOnOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ObserveOnOperator<T> extends Operator<T,T> {
    public Object scheduler;
    public Object delay;
    @JsConstructor
    public ObserveOnOperator(IScheduler scheduler,int /* optional */ delay) {}
    public native  /* NO SYMBOL */TeardownLogic call(Subscriber<T> subscriber,Object source);
}
