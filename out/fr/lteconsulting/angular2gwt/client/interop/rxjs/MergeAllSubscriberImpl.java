package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import rxjs.Observer;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\mergeAll.d.ts
  * Package rxjs
  * Name MergeAllSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="MergeAllSubscriber" )
public class MergeAllSubscriberImpl<T> extends OuterSubscriber<Observable<T>,T> {
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsProperty(name="hasCompleted")
    Object getHasCompleted();
    @JsProperty(name="hasCompleted")
    void setHasCompleted(Object value);
    @JsProperty(name="buffer")
    Object getBuffer();
    @JsProperty(name="buffer")
    void setBuffer(Object value);
    @JsProperty(name="active")
    Object getActive();
    @JsProperty(name="active")
    void setActive(Object value);
    @JsConstructor
    public MergeAllSubscriberImpl(Observer<T> destination,int concurrent) {}
    public native  void _next(Observable<T> observable);
    public native  void _complete();
    public native  void notifyComplete(Subscription innerSub);
}
