package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\mergeMapTo.d.ts
  * Package rxjs
  * Name MergeMapToSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MergeMapToSubscriber<T,I,R> extends OuterSubscriber<T,I> {
    @JsProperty(name="ish")
    Object getIsh();
    @JsProperty(name="ish")
    void setIsh(Object value);
    @JsProperty(name="resultSelector")
    Object getResultSelector();
    @JsProperty(name="resultSelector")
    void setResultSelector(Object value);
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
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public MergeMapToSubscriber(Subscriber<R> destination,/* NO SYMBOL */ObservableInput<I> ish,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
     void _next(T value);
     void _innerSub();
     void _complete();
     void notifyNext(T outerValue,I innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,I> innerSub);
     void trySelectResult();
     void notifyError(Object err);
     void notifyComplete(Subscription innerSub);
}
