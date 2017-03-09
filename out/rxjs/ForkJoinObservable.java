package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import fr.lteconsulting.angular2gwt.client.JsFunction5;
import fr.lteconsulting.angular2gwt.client.JsFunction6;

/**
  * Generated from tests\rxjs\observable\ForkJoinObservable.d.ts
  * Package rxjs
  * Name ForkJoinObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ForkJoinObservable<T> extends Observable<T> {
    public Object sources;
    public Object resultSelector;
    @JsConstructor
    public ForkJoinObservable(Array</* NO SYMBOL */SubscribableOrPromise<Object>> sources,JsFunction1<Array<Object>,T> /* optional */ resultSelector) {}
    public static native <T,T2> Observable<JsArray<Object> /* Tuple [T, T2] */> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2);
    public static native <T,T2,T3> Observable<JsArray<Object> /* Tuple [T, T2] */> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3);
    public static native <T,T2,T3,T4> Observable<JsArray<Object> /* Tuple [T, T2] */> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4);
    public static native <T,T2,T3,T4,T5> Observable<JsArray<Object> /* Tuple [T, T2] */> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4,/* NO SYMBOL */SubscribableOrPromise<T5> v5);
    public static native <T,T2,T3,T4,T5,T6> Observable<JsArray<Object> /* Tuple [T, T2] */> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4,/* NO SYMBOL */SubscribableOrPromise<T5> v5,/* NO SYMBOL */SubscribableOrPromise<T6> v6);
    public static native <T,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,JsFunction1<T,R> project);
    public static native <T,T2,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,JsFunction2<T,T2,R> project);
    public static native <T,T2,T3,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,JsFunction3<T,T2,T3,R> project);
    public static native <T,T2,T3,T4,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4,JsFunction4<T,T2,T3,T4,R> project);
    public static native <T,T2,T3,T4,T5,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4,/* NO SYMBOL */SubscribableOrPromise<T5> v5,JsFunction5<T,T2,T3,T4,T5,R> project);
    public static native <T,T2,T3,T4,T5,T6,R> Observable<R> create(/* NO SYMBOL */SubscribableOrPromise<T> v1,/* NO SYMBOL */SubscribableOrPromise<T2> v2,/* NO SYMBOL */SubscribableOrPromise<T3> v3,/* NO SYMBOL */SubscribableOrPromise<T4> v4,/* NO SYMBOL */SubscribableOrPromise<T5> v5,/* NO SYMBOL */SubscribableOrPromise<T6> v6,JsFunction6<T,T2,T3,T4,T5,T6,R> project);
    public static native <T> Observable<JsArray<T>> create(JsArray</* NO SYMBOL */SubscribableOrPromise<T>> sources);
    public static native <R> Observable<R> create(JsArray</* NO SYMBOL */SubscribableOrPromise<Object>> sources);
    public static native <T,R> Observable<R> create(JsArray</* NO SYMBOL */SubscribableOrPromise<T>> sources,JsFunction1<Array<T>,R> project);
    public static native <R> Observable<R> create(JsArray</* NO SYMBOL */SubscribableOrPromise<Object>> sources,JsFunction1<Array<Object>,R> project);
    public static native <T> Observable<JsArray<T>> create(JsArray</* NO SYMBOL */SubscribableOrPromise<T>> /* optional */ undefined);
    public static native <R> Observable<R> create(JsArray</* NO SYMBOL */SubscribableOrPromise<Object>> /* optional */ undefined);
    public native  Subscription _subscribe(Subscriber<Object> subscriber);
}
