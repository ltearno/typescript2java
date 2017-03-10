package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\SubscribeOnObservable.d.ts
  * Package rxjs
  * Name DispatchArg
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DispatchArg<T>  {
    @JsProperty(name="source")
    Observable<T> source();
    @JsProperty(name="source")
    void source(Observable<T> value);
    @JsProperty(name="subscriber")
    Subscriber<T> subscriber();
    @JsProperty(name="subscriber")
    void subscriber(Subscriber<T> value);
}
