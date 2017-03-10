package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.Observer;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Operator;
import rxjs.Observable;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name Subject
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Subject<T> extends ISubscription {
    @JsProperty(name="observers")
    JsArray<Observer<T>> getObservers();
    @JsProperty(name="observers")
    void setObservers(JsArray<Observer<T>> value);
    @JsProperty(name="closed")
    boolean getClosed();
    @JsProperty(name="closed")
    void setClosed(boolean value);
    @JsProperty(name="isStopped")
    boolean getIsStopped();
    @JsProperty(name="isStopped")
    void setIsStopped(boolean value);
    @JsProperty(name="hasError")
    boolean getHasError();
    @JsProperty(name="hasError")
    void setHasError(boolean value);
    @JsProperty(name="thrownError")
    Object getThrownError();
    @JsProperty(name="thrownError")
    void setThrownError(Object value);
    @JsConstructor
    public Subject() {}
    <R> Observable<T> lift(Operator<T,R> operator);
     void next(T /* optional */ value);
     void error(Object err);
     void complete();
     void unsubscribe();
     /* NO SYMBOL */TeardownLogic _trySubscribe(Subscriber<T> subscriber);
     Subscription _subscribe(Subscriber<T> subscriber);
     Observable<T> asObservable();
}
