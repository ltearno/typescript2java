package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\expand.d.ts
  * Package rxjs
  * Name ExpandSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ExpandSubscriber<T,R> extends OuterSubscriber<T,R> {
    public Object project;
    public Object concurrent;
    public Object scheduler;
    public Object index;
    public Object active;
    public Object hasCompleted;
    public Object buffer;
    @JsConstructor
    public ExpandSubscriber(Subscriber<R> destination,JsFunction2<T,Integer,Observable<R>> project,int concurrent,IScheduler scheduler) {}
    public static native <T,R> void dispatch();
    public native  void _next(Object value);
    public native  void subscribeToProjection();
    public native  void _complete();
    public native  void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
    public native  void notifyComplete(Subscription innerSub);
}
