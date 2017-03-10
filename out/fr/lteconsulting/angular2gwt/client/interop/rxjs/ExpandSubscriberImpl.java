package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Observable;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\expand.d.ts
  * Package rxjs
  * Name ExpandSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="ExpandSubscriber" )
public class ExpandSubscriberImpl<T,R> extends OuterSubscriber<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="index")
    Object getIndex();
    @JsProperty(name="index")
    void setIndex(Object value);
    @JsProperty(name="active")
    Object getActive();
    @JsProperty(name="active")
    void setActive(Object value);
    @JsProperty(name="hasCompleted")
    Object getHasCompleted();
    @JsProperty(name="hasCompleted")
    void setHasCompleted(Object value);
    @JsProperty(name="buffer")
    Object getBuffer();
    @JsProperty(name="buffer")
    void setBuffer(Object value);
    @JsConstructor
    public ExpandSubscriberImpl(Subscriber<R> destination,JsFunction2<T,Integer,Observable<R>> project,int concurrent,IScheduler scheduler) {}
    public static native <T,R> void dispatch();
    public native  void _next(Object value);
    public native  void subscribeToProjection();
    public native  void _complete();
    public native  void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
    public native  void notifyComplete(Subscription innerSub);
}
