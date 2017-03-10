package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observer;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name AnonymousSubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="AnonymousSubject" )
public class AnonymousSubjectImpl<T> extends Subject<T> {
    @JsProperty(name="destination")
    Observer<T> getDestination();
    @JsProperty(name="destination")
    void setDestination(Observer<T> value);
    @JsConstructor
    public AnonymousSubjectImpl(Observer<T> /* optional */ destination,Observable<T> /* optional */ source) {}
    public native  void next(T value);
    public native  void error(Object err);
    public native  void complete();
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
