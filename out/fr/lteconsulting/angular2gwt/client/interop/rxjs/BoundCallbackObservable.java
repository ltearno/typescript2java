package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.AsyncSubject;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.IScheduler;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import fr.lteconsulting.angular2gwt.client.JsFunction5;
import fr.lteconsulting.angular2gwt.client.JsFunction6;
import fr.lteconsulting.angular2gwt.client.JsFunction7;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\observable\BoundCallbackObservable.d.ts
  * Package rxjs
  * Name BoundCallbackObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BoundCallbackObservable<T> extends Observable<T> {
    @JsProperty(name="callbackFunc")
    Object getCallbackFunc();
    @JsProperty(name="callbackFunc")
    void setCallbackFunc(Object value);
    @JsProperty(name="selector")
    Object getSelector();
    @JsProperty(name="selector")
    void setSelector(Object value);
    @JsProperty(name="args")
    Object getArgs();
    @JsProperty(name="args")
    void setArgs(Object value);
    @JsProperty(name="context")
    Object getContext();
    @JsProperty(name="context")
    void setContext(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="subject")
    AsyncSubject<T> getSubject();
    @JsProperty(name="subject")
    void setSubject(AsyncSubject<T> value);
    @JsConstructor
    public BoundCallbackObservable(Function callbackFunc,Function selector,JsArray<Object> args,Object context,IScheduler scheduler) {}
     Subscription _subscribe(Subscriber<Object /* UnionType */> subscriber);
}
