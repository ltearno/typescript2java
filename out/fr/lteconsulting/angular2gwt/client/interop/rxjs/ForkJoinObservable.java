package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import fr.lteconsulting.angular2gwt.client.JsFunction5;
import fr.lteconsulting.angular2gwt.client.JsFunction6;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\observable\ForkJoinObservable.d.ts
  * Package rxjs
  * Name ForkJoinObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ForkJoinObservable<T> extends Observable<T> {
    @JsProperty(name="sources")
    Object getSources();
    @JsProperty(name="sources")
    void setSources(Object value);
    @JsProperty(name="resultSelector")
    Object getResultSelector();
    @JsProperty(name="resultSelector")
    void setResultSelector(Object value);
    @JsConstructor
    public ForkJoinObservable(Array</* NO SYMBOL */SubscribableOrPromise<Object>> sources,JsFunction1<Array<Object>,T> /* optional */ resultSelector) {}
     Subscription _subscribe(Subscriber<Object> subscriber);
}
