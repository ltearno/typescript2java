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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnonymousSubject<T> extends Subject<T> {
    @JsProperty(name="destination")
    Observer<T> getDestination();
    @JsProperty(name="destination")
    void setDestination(Observer<T> value);
    @JsConstructor
    public AnonymousSubject(Observer<T> /* optional */ destination,Observable<T> /* optional */ source) {}
     void next(T value);
     void error(Object err);
     void complete();
     Subscription _subscribe(Subscriber<T> subscriber);
}
