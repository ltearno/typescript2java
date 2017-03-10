package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import rxjs.Operator;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Subscriber;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\Observable.d.ts
  * Package rxjs
  * Name Observable
  * A representation of any set of values over any amount of time. This the most basic building block
  * of RxJS.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Observable<T> extends Subscribable<T> {
    @JsProperty(name="_isScalar")
    boolean get_isScalar();
    @JsProperty(name="_isScalar")
    void set_isScalar(boolean value);
    @JsProperty(name="source")
    Observable<Object> getSource();
    @JsProperty(name="source")
    void setSource(Observable<Object> value);
    @JsProperty(name="operator")
    Operator<Object,T> getOperator();
    @JsProperty(name="operator")
    void setOperator(Operator<Object,T> value);
    @JsConstructor
    public Observable(JsFunction2<Observable<T>,Subscriber<T>,/* NO SYMBOL */TeardownLogic> /* optional */ subscribe) {}
    <R> Observable<R> lift(Operator<T,R> operator);
     Subscription subscribe();
     Subscription subscribe(/* NO SYMBOL */PartialObserver<T> observer);
     Subscription subscribe(JsFunction1<T,Void> /* optional */ next,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
     /* NO SYMBOL */TeardownLogic _trySubscribe(Subscriber<T> sink);
     Promise<Void> forEach(JsFunction1<T,Void> next,UNKNOWN_TYPE_NAME_TypeQuery /* optional */ PromiseCtor);
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Object> subscriber);
}
