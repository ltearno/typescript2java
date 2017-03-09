package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\DeferObservable.d.ts
  * Package rxjs
  * Name DeferObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class DeferObservable<T> extends Observable<T> {
    public Object observableFactory;
    public static native <T> Observable<T> create(JsFunction<Object /* UnionType */> observableFactory);
    @JsConstructor
    public DeferObservable(JsFunction<Object /* UnionType */> observableFactory) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
