package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\AsyncSubject.d.ts
  * Package rxjs
  * Name AsyncSubject
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AsyncSubject<T> extends Subject<T> {
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsProperty(name="hasNext")
    Object getHasNext();
    @JsProperty(name="hasNext")
    void setHasNext(Object value);
    @JsProperty(name="hasCompleted")
    Object getHasCompleted();
    @JsProperty(name="hasCompleted")
    void setHasCompleted(Object value);
     Subscription _subscribe(Subscriber<Object> subscriber);
     void next(T value);
     void error(Object error);
     void complete();
}
