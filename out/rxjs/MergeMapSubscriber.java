package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeMap.d.ts
  * Package rxjs
  * Name MergeMapSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeMapSubscriber<T,I,R> extends OuterSubscriber<T,I> {
    public Object project;
    public Object resultSelector;
    public Object concurrent;
    public Object hasCompleted;
    public Object buffer;
    public Object active;
    public int index;
    @JsConstructor
    public MergeMapSubscriber(Subscriber<I> destination,JsFunction2<T,Integer,/* NO SYMBOL */ObservableInput<I>> project,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  void _next(T value);
    public native  void _tryNext(T value);
    public native  void _innerSub();
    public native  void _complete();
    public native  void notifyNext(T outerValue,I innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,I> innerSub);
    public native  void _notifyResultSelector();
    public native  void notifyComplete(Subscription innerSub);
}
