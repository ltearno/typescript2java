package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\race.d.ts
  * Package rxjs
  * Name RaceSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class RaceSubscriber<T> extends OuterSubscriber<T,T> {
    public Object hasFirst;
    public Object observables;
    public Object subscriptions;
    @JsConstructor
    public RaceSubscriber(Subscriber<T> destination) {}
    public native  void _next(Object observable);
    public native  void _complete();
    public native  void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
}
