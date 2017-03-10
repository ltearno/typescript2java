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
@JsType( isNative=true, namespace="rxjs", name="RaceSubscriber" )
public class RaceSubscriberImpl<T> extends OuterSubscriber<T,T> {
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
    public RaceSubscriberImpl(Subscriber<T> destination) {}
    public native  void _next(Object observable);
    public native  void _complete();
    public native  void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
}
