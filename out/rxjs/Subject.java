package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name Subject
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class Subject<T> extends ISubscription {
    public JsArray<Observer<T>> observers;
    public boolean closed;
    public boolean isStopped;
    public boolean hasError;
    public Object thrownError;
    @JsConstructor
    public Subject() {}
    public static Function create;
    public native <R> Observable<T> lift(Operator<T,R> operator);
    public native  void next(T /* optional */ value);
    public native  void error(Object err);
    public native  void complete();
    public native  void unsubscribe();
    public native  /* NO SYMBOL */TeardownLogic _trySubscribe(Subscriber<T> subscriber);
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  Observable<T> asObservable();
}
