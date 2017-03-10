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
@JsType( isNative=true, namespace="rxjs", name="Observable" )
public class ObservableImpl<T> extends Subscribable<T> {
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
    public ObservableImpl(JsFunction2<Observable<T>,Subscriber<T>,/* NO SYMBOL */TeardownLogic> /* optional */ subscribe) {}
    @JsProperty(name="create")
    static Function getCreate();
    @JsProperty(name="create")
    static void setCreate(Function value);
    public native <R> Observable<R> lift(Operator<T,R> operator);
    public native  Subscription subscribe();
    public native  Subscription subscribe(/* NO SYMBOL */PartialObserver<T> observer);
    public native  Subscription subscribe(JsFunction1<T,Void> /* optional */ next,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
    public native  /* NO SYMBOL */TeardownLogic _trySubscribe(Subscriber<T> sink);
    public native  Promise<Void> forEach(JsFunction1<T,Void> next,UNKNOWN_TYPE_NAME_TypeQuery /* optional */ PromiseCtor);
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Object> subscriber);
    @JsProperty(name="if")
    static UNKNOWN_TYPE_NAME_TypeQuery getIf();
    @JsProperty(name="if")
    static void setIf(UNKNOWN_TYPE_NAME_TypeQuery value);
    @JsProperty(name="throw")
    static UNKNOWN_TYPE_NAME_TypeQuery getThrow();
    @JsProperty(name="throw")
    static void setThrow(UNKNOWN_TYPE_NAME_TypeQuery value);
}
