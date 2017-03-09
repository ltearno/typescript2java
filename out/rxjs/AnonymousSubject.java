package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name AnonymousSubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AnonymousSubject<T> extends Subject<T> {
    public Observer<T> destination;
    @JsConstructor
    public AnonymousSubject(Observer<T> /* optional */ destination,Observable<T> /* optional */ source) {}
    public native  void next(T value);
    public native  void error(Object err);
    public native  void complete();
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
