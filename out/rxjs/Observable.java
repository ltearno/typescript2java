package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\Observable.d.ts
  * Package rxjs
  * Name Observable
  * A representation of any set of values over any amount of time. This the most basic building block
  * of RxJS.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class Observable<T> extends Subscribable<T> {
    public boolean _isScalar;
    public Observable<Object> source;
    public Operator<Object,T> operator;
    @JsConstructor
    public Observable(JsFunction2<Observable<T>,Subscriber<T>,/* NO SYMBOL */TeardownLogic> /* optional */ subscribe) {}
    public static Function create;
    public native <R> Observable<R> lift(Operator<T,R> operator);
    public native  Subscription subscribe();
    public native  Subscription subscribe(/* NO SYMBOL */PartialObserver<T> observer);
    public native  Subscription subscribe(JsFunction1<T,Void> /* optional */ next,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
    public native  /* NO SYMBOL */TeardownLogic _trySubscribe(Subscriber<T> sink);
    public native  Promise<Void> forEach(JsFunction1<T,Void> next,UNKNOWN_TYPE_NAME_TypeQuery /* optional */ PromiseCtor);
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Object> subscriber);
    public static UNKNOWN_TYPE_NAME_TypeQuery if;
    public static UNKNOWN_TYPE_NAME_TypeQuery throw;
}
