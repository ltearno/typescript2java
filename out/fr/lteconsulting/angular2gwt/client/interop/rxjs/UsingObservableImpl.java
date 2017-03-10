package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import rxjs.AnonymousSubscription;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\UsingObservable.d.ts
  * Package rxjs
  * Name UsingObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="UsingObservable" )
public class UsingObservableImpl<T> extends Observable<T> {
    @JsProperty(name="resourceFactory")
    Object getResourceFactory();
    @JsProperty(name="resourceFactory")
    void setResourceFactory(Object value);
    @JsProperty(name="observableFactory")
    Object getObservableFactory();
    @JsProperty(name="observableFactory")
    void setObservableFactory(Object value);
    public static native <T> Observable<T> create(JsFunction<Object /* UnionType */> resourceFactory,JsFunction1<AnonymousSubscription,Object /* UnionType */> observableFactory);
    @JsConstructor
    public UsingObservableImpl(JsFunction<Object /* UnionType */> resourceFactory,JsFunction1<AnonymousSubscription,Object /* UnionType */> observableFactory) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
