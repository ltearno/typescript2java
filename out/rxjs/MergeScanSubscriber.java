package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeScan.d.ts
  * Package rxjs
  * Name MergeScanSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeScanSubscriber<T,R> extends OuterSubscriber<T,R> {
    public Object accumulator;
    public Object acc;
    public Object concurrent;
    public Object hasValue;
    public Object hasCompleted;
    public Object buffer;
    public Object active;
    public int index;
    @JsConstructor
    public MergeScanSubscriber(Subscriber<R> destination,JsFunction2<R,T,Observable<R>> accumulator,R acc,int concurrent) {}
    public native  void _next(Object value);
    public native  void _innerSub();
    public native  void _complete();
    public native  void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
    public native  void notifyComplete(Subscription innerSub);
}
