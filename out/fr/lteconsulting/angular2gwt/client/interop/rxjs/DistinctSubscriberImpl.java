package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;

/**
  * Generated from tests\rxjs\operator\distinct.d.ts
  * Package rxjs
  * Name DistinctSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="DistinctSubscriber" )
public class DistinctSubscriberImpl<T,K> extends OuterSubscriber<T,T> {
    @JsProperty(name="keySelector")
    Object getKeySelector();
    @JsProperty(name="keySelector")
    void setKeySelector(Object value);
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
    @JsConstructor
    public DistinctSubscriberImpl(Subscriber<T> destination,JsFunction1<T,K> keySelector,Observable<Object> flushes) {}
    public native  void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
    public native  void notifyError(Object error,InnerSubscriber<T,T> innerSub);
    public native  void _next(T value);
    public native  void _useKeySelector();
    public native  void _finalizeNext();
}
