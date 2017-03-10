package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\observable\DeferObservable.d.ts
  * Package rxjs
  * Name DeferObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="DeferObservable" )
public class DeferObservableImpl<T> extends Observable<T> {
    @JsProperty(name="observableFactory")
    Object getObservableFactory();
    @JsProperty(name="observableFactory")
    void setObservableFactory(Object value);
    public static native <T> Observable<T> create(JsFunction<Object /* UnionType */> observableFactory);
    @JsConstructor
    public DeferObservableImpl(JsFunction<Object /* UnionType */> observableFactory) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
