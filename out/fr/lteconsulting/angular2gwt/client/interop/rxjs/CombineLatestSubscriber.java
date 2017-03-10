package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import rxjs.InnerSubscriber;

/**
  * Generated from tests\rxjs\operator\combineLatest.d.ts
  * Package rxjs
  * Name CombineLatestSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CombineLatestSubscriber<T,R> extends OuterSubscriber<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="active")
    Object getActive();
    @JsProperty(name="active")
    void setActive(Object value);
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
    @JsProperty(name="observables")
    Object getObservables();
    @JsProperty(name="observables")
    void setObservables(Object value);
    @JsProperty(name="toRespond")
    Object getToRespond();
    @JsProperty(name="toRespond")
    void setToRespond(Object value);
    @JsConstructor
    public CombineLatestSubscriber(Subscriber<R> destination,JsFunction1<Array<Object>,R> /* optional */ project) {}
     void _next(Object observable);
     void _complete();
     void notifyComplete(Subscriber<R> unused);
     void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
     void _tryProject();
}
