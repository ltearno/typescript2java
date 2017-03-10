package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\mergeMap.d.ts
  * Package rxjs
  * Name MergeMapSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="MergeMapSubscriber" )
public class MergeMapSubscriberImpl<T,I,R> extends OuterSubscriber<T,I> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
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
    public MergeMapSubscriberImpl(Subscriber<I> destination,JsFunction2<T,Integer,/* NO SYMBOL */ObservableInput<I>> project,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  void _next(T value);
    public native  void _tryNext(T value);
    public native  void _innerSub();
    public native  void _complete();
    public native  void notifyNext(T outerValue,I innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,I> innerSub);
    public native  void _notifyResultSelector();
    public native  void notifyComplete(Subscription innerSub);
}
