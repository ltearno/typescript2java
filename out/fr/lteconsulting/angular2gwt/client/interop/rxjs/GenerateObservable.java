package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import rxjs.GenerateBaseOptions;
import rxjs.GenerateOptions;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\GenerateObservable.d.ts
  * Package rxjs
  * Name GenerateObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface GenerateObservable<T,S> extends Observable<T> {
    @JsProperty(name="initialState")
    Object getInitialState();
    @JsProperty(name="initialState")
    void setInitialState(Object value);
    @JsProperty(name="condition")
    Object getCondition();
    @JsProperty(name="condition")
    void setCondition(Object value);
    @JsProperty(name="iterate")
    Object getIterate();
    @JsProperty(name="iterate")
    void setIterate(Object value);
    @JsProperty(name="resultSelector")
    Object getResultSelector();
    @JsProperty(name="resultSelector")
    void setResultSelector(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public GenerateObservable(S initialState,ConditionFunc<S> condition,IterateFunc<S> iterate,ResultFunc<S,T> resultSelector,IScheduler /* optional */ scheduler) {}
     Object /* UnionType */ _subscribe(Subscriber<Object> subscriber);
}
