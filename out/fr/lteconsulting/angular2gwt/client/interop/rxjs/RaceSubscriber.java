package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;

/**
  * Generated from tests\rxjs\operator\race.d.ts
  * Package rxjs
  * Name RaceSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RaceSubscriber<T> extends OuterSubscriber<T,T> {
    @JsProperty(name="hasFirst")
    Object getHasFirst();
    @JsProperty(name="hasFirst")
    void setHasFirst(Object value);
    @JsProperty(name="observables")
    Object getObservables();
    @JsProperty(name="observables")
    void setObservables(Object value);
    @JsProperty(name="subscriptions")
    Object getSubscriptions();
    @JsProperty(name="subscriptions")
    void setSubscriptions(Object value);
    @JsConstructor
    public RaceSubscriber(Subscriber<T> destination) {}
     void _next(Object observable);
     void _complete();
     void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
}
