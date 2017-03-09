package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import fr.lteconsulting.angular2gwt.client.JsFunction5;
import fr.lteconsulting.angular2gwt.client.JsFunction6;
import fr.lteconsulting.angular2gwt.client.JsFunction7;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\BoundCallbackObservable.d.ts
  * Package rxjs
  * Name BoundCallbackObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class BoundCallbackObservable<T> extends Observable<T> {
    public Object callbackFunc;
    public Object selector;
    public Object args;
    public Object context;
    public Object scheduler;
    public AsyncSubject<T> subject;
    public static native  JsFunction<Observable<Void>> create(JsFunction1<JsFunction<Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <R> JsFunction<Observable<R>> create(JsFunction1<JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,R> JsFunction1<T,Observable<R>> create(JsFunction2<T,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,R> JsFunction2<T,T2,Observable<R>> create(JsFunction3<T,T2,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,R> JsFunction3<T,T2,T3,Observable<R>> create(JsFunction4<T,T2,T3,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,R> JsFunction4<T,T2,T3,T4,Observable<R>> create(JsFunction5<T,T2,T3,T4,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,R> JsFunction5<T,T2,T3,T4,T5,Observable<R>> create(JsFunction6<T,T2,T3,T4,T5,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,T6,R> JsFunction6<T,T2,T3,T4,T5,T6,Observable<R>> create(JsFunction7<T,T2,T3,T4,T5,T6,JsFunction1<R,Object>,Object> callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <R> JsFunction<Observable<R>> create(JsFunction1<JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,R> JsFunction1<T,Observable<R>> create(JsFunction2<T,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,R> JsFunction2<T,T2,Observable<R>> create(JsFunction3<T,T2,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,R> JsFunction3<T,T2,T3,Observable<R>> create(JsFunction4<T,T2,T3,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,R> JsFunction4<T,T2,T3,T4,Observable<R>> create(JsFunction5<T,T2,T3,T4,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,R> JsFunction5<T,T2,T3,T4,T5,Observable<R>> create(JsFunction6<T,T2,T3,T4,T5,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T,T2,T3,T4,T5,T6,R> JsFunction6<T,T2,T3,T4,T5,T6,Observable<R>> create(JsFunction7<T,T2,T3,T4,T5,T6,JsFunction1<JsArray<Object>,Object>,Object> callbackFunc,JsFunction1<JsArray<Object>,R> selector,IScheduler /* optional */ scheduler);
    public static native <T> JsFunction1<JsArray<Object>,Observable<T>> create(Function callbackFunc,void /* optional */ selector,IScheduler /* optional */ scheduler);
    public static native <T> JsFunction1<JsArray<Object>,Observable<T>> create(Function callbackFunc,JsFunction1<JsArray<Object>,T> /* optional */ selector,IScheduler /* optional */ scheduler);
    @JsConstructor
    public BoundCallbackObservable(Function callbackFunc,Function selector,JsArray<Object> args,Object context,IScheduler scheduler) {}
    public native  Subscription _subscribe(Subscriber<Object /* UnionType */> subscriber);
    public static native <T> void dispatch(/* TypeLiteral */ Object state);
}
