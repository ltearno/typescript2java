package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.OuterSubscriber;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\InnerSubscriber.d.ts
  * Package rxjs
  * Name InnerSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InnerSubscriber<T,R> extends Subscriber<R> {
    @JsProperty(name="parent")
    Object getParent();
    @JsProperty(name="parent")
    void setParent(Object value);
    @JsProperty(name="outerValue")
    Object getOuterValue();
    @JsProperty(name="outerValue")
    void setOuterValue(Object value);
    @JsProperty(name="outerIndex")
    Object getOuterIndex();
    @JsProperty(name="outerIndex")
    void setOuterIndex(Object value);
    @JsProperty(name="index")
    Object getIndex();
    @JsProperty(name="index")
    void setIndex(Object value);
    @JsConstructor
    public InnerSubscriber(OuterSubscriber<T,R> parent,T outerValue,int outerIndex) {}
     void _next(R value);
     void _error(Object error);
     void _complete();
}
