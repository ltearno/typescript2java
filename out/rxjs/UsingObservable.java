package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\UsingObservable.d.ts
  * Package rxjs
  * Name UsingObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class UsingObservable<T> extends Observable<T> {
    public Object resourceFactory;
    public Object observableFactory;
    public static native <T> Observable<T> create(JsFunction<Object /* UnionType */> resourceFactory,JsFunction1<AnonymousSubscription,Object /* UnionType */> observableFactory);
    @JsConstructor
    public UsingObservable(JsFunction<Object /* UnionType */> resourceFactory,JsFunction1<AnonymousSubscription,Object /* UnionType */> observableFactory) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
