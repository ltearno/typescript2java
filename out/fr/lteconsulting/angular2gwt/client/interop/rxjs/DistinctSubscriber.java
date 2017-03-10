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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DistinctSubscriber<T,K> extends OuterSubscriber<T,T> {
    @JsProperty(name="keySelector")
    Object getKeySelector();
    @JsProperty(name="keySelector")
    void setKeySelector(Object value);
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
    @JsConstructor
    public DistinctSubscriber(Subscriber<T> destination,JsFunction1<T,K> keySelector,Observable<Object> flushes) {}
     void notifyNext(T outerValue,T innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,T> innerSub);
     void notifyError(Object error,InnerSubscriber<T,T> innerSub);
     void _next(T value);
     void _useKeySelector();
     void _finalizeNext();
}
