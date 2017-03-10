package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Subject;
import rxjs.Subscription;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\ConnectableObservable.d.ts
  * Package rxjs
  * Name ConnectableObservable
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="ConnectableObservable" )
public class ConnectableObservableImpl<T> extends Observable<T> {
    @JsProperty(name="source")
    Observable<T> getSource();
    @JsProperty(name="source")
    void setSource(Observable<T> value);
    @JsProperty(name="subjectFactory")
    JsFunction<Subject<T>> getSubjectFactory();
    @JsProperty(name="subjectFactory")
    void setSubjectFactory(JsFunction<Subject<T>> value);
    @JsProperty(name="_subject")
    Subject<T> get_subject();
    @JsProperty(name="_subject")
    void set_subject(Subject<T> value);
    @JsProperty(name="_refCount")
    int get_refCount();
    @JsProperty(name="_refCount")
    void set_refCount(int value);
    @JsProperty(name="_connection")
    Subscription get_connection();
    @JsProperty(name="_connection")
    void set_connection(Subscription value);
    @JsConstructor
    public ConnectableObservableImpl(Observable<T> source,JsFunction<Subject<T>> subjectFactory) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  Subject<T> getSubject();
    public native  Subscription connect();
    public native  Observable<T> refCount();
}
