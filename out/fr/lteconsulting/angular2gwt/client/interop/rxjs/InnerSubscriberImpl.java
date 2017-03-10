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
@JsType( isNative=true, namespace="rxjs", name="InnerSubscriber" )
public class InnerSubscriberImpl<T,R> extends Subscriber<R> {
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
    public InnerSubscriberImpl(OuterSubscriber<T,R> parent,T outerValue,int outerIndex) {}
    public native  void _next(R value);
    public native  void _error(Object error);
    public native  void _complete();
}
