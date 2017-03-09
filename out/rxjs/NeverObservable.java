package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\NeverObservable.d.ts
  * Package rxjs
  * Name NeverObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class NeverObservable<T> extends Observable<T> {
    public static native <T> NeverObservable<T> create();
    @JsConstructor
    public NeverObservable() {}
    public native  void _subscribe(Subscriber<T> subscriber);
}
