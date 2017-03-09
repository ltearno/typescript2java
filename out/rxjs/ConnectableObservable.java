package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\ConnectableObservable.d.ts
  * Package rxjs
  * Name ConnectableObservable
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ConnectableObservable<T> extends Observable<T> {
    public Observable<T> source;
    public JsFunction<Subject<T>> subjectFactory;
    public Subject<T> _subject;
    public int _refCount;
    public Subscription _connection;
    @JsConstructor
    public ConnectableObservable(Observable<T> source,JsFunction<Subject<T>> subjectFactory) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  Subject<T> getSubject();
    public native  Subscription connect();
    public native  Observable<T> refCount();
}
