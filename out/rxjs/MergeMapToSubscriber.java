package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeMapTo.d.ts
  * Package rxjs
  * Name MergeMapToSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeMapToSubscriber<T,I,R> extends OuterSubscriber<T,I> {
    public Object ish;
    public Object resultSelector;
    public Object concurrent;
    public Object hasCompleted;
    public Object buffer;
    public Object active;
    public int index;
    @JsConstructor
    public MergeMapToSubscriber(Subscriber<R> destination,/* NO SYMBOL */ObservableInput<I> ish,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  void _next(T value);
    public native  void _innerSub();
    public native  void _complete();
    public native  void notifyNext(T outerValue,I innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,I> innerSub);
    public native  void trySelectResult();
    public native  void notifyError(Object err);
    public native  void notifyComplete(Subscription innerSub);
}
