package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\GenerateObservable.d.ts
  * Package rxjs
  * Name GenerateObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class GenerateObservable<T,S> extends Observable<T> {
    public Object initialState;
    public Object condition;
    public Object iterate;
    public Object resultSelector;
    public Object scheduler;
    @JsConstructor
    public GenerateObservable(S initialState,ConditionFunc<S> condition,IterateFunc<S> iterate,ResultFunc<S,T> resultSelector,IScheduler /* optional */ scheduler) {}
    public static native <T,S> Observable<T> create(S initialState,ConditionFunc<S> condition,IterateFunc<S> iterate,ResultFunc<S,T> resultSelector,IScheduler /* optional */ scheduler);
    public static native <S> Observable<S> create(S initialState,ConditionFunc<S> condition,IterateFunc<S> iterate,IScheduler /* optional */ scheduler);
    public static native <S> Observable<S> create(GenerateBaseOptions<S> options);
    public static native <T,S> Observable<T> create(GenerateOptions<T,S> options);
    public native  Object /* UnionType */ _subscribe(Subscriber<Object> subscriber);
    public static native <T,S> void dispatch();
}
