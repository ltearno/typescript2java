package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.NeverObservable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\NeverObservable.d.ts
  * Package rxjs
  * Name NeverObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NeverObservable<T> extends Observable<T> {
    @JsConstructor
    public NeverObservable() {}
     void _subscribe(Subscriber<T> subscriber);
}
