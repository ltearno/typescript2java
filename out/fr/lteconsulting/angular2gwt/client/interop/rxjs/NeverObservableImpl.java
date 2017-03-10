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
@JsType( isNative=true, namespace="rxjs", name="NeverObservable" )
public class NeverObservableImpl<T> extends Observable<T> {
    public static native <T> NeverObservable<T> create();
    @JsConstructor
    public NeverObservableImpl() {}
    public native  void _subscribe(Subscriber<T> subscriber);
}
