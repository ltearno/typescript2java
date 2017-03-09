package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\distinct.d.ts
  * Package rxjs
  * Name DistinctSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class DistinctSubscriber<T,K> extends OuterSubscriber<T,T> {
    public Object keySelector;
    public Object values;
    @JsConstructor
    public DistinctSubscriber(Subscriber<T> destination,JsFunction1<T,K> keySelector,Observable<Object> flushes) {}
    public native  void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
    public native  void notifyError(Object error,InnerSubscriber<T,T> innerSub);
    public native  void _next(T value);
    public native  void _useKeySelector();
    public native  void _finalizeNext();
}
