package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\mergeScan.d.ts
  * Package rxjs
  * Name MergeScanSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MergeScanSubscriber<T,R> extends OuterSubscriber<T,R> {
    @JsProperty(name="accumulator")
    Object getAccumulator();
    @JsProperty(name="accumulator")
    void setAccumulator(Object value);
    @JsProperty(name="acc")
    Object getAcc();
    @JsProperty(name="acc")
    void setAcc(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsProperty(name="hasValue")
    Object getHasValue();
    @JsProperty(name="hasValue")
    void setHasValue(Object value);
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
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public MergeScanSubscriber(Subscriber<R> destination,JsFunction2<R,T,Observable<R>> accumulator,R acc,int concurrent) {}
     void _next(Object value);
     void _innerSub();
     void _complete();
     void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
     void notifyComplete(Subscription innerSub);
}
