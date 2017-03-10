package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.AsyncSubject;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;
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
  * Generated from tests\rxjs\observable\BoundNodeCallbackObservable.d.ts
  * Package rxjs
  * Name BoundNodeCallbackObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="BoundNodeCallbackObservable" )
public class BoundNodeCallbackObservableImpl<T> extends Observable<T> {
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
    IScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(IScheduler value);
    @JsProperty(name="subject")
    AsyncSubject<T> getSubject();
    @JsProperty(name="subject")
    void setSubject(AsyncSubject<T> value);
    public static native <R> JsFunction<Observable<R>> create(JsFunction1<JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,R> JsFunction1<T,Observable<R>> create(JsFunction2<T,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,R> JsFunction2<T,T2,Observable<R>> create(JsFunction3<T,T2,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,R> JsFunction3<T,T2,T3,Observable<R>> create(JsFunction4<T,T2,T3,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,R> JsFunction4<T,T2,T3,T4,Observable<R>> create(JsFunction5<T,T2,T3,T4,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,R> JsFunction5<T,T2,T3,T4,T5,Observable<R>> create(JsFunction6<T,T2,T3,T4,T5,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,T6,R> JsFunction6<T,T2,T3,T4,T5,T6,Observable<R>> create(JsFunction7<T,T2,T3,T4,T5,T6,JsFunction2<Object,R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T> JsFunction1<JsArray<Object>,Observable<T>> create(Function callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T> JsFunction1<JsArray<Object>,Observable<T>> create(Function callbackFunc,JsFunction1<JsArray<Object>,T> /* optional */ selector,IScheduler /* optional */ scheduler);
    @JsConstructor
    public BoundNodeCallbackObservableImpl(Function callbackFunc,Function selector,JsArray<Object> args,Object context,IScheduler scheduler) {}
    public native  Subscription _subscribe(Subscriber<Object /* UnionType */> subscriber);
}
