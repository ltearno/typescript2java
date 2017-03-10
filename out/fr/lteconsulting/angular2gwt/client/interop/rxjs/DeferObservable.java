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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DeferObservable<T> extends Observable<T> {
    @JsProperty(name="observableFactory")
    Object getObservableFactory();
    @JsProperty(name="observableFactory")
    void setObservableFactory(Object value);
    @JsConstructor
    public DeferObservable(JsFunction<Object /* UnionType */> observableFactory) {}
     Subscription _subscribe(Subscriber<T> subscriber);
}
