package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\SubjectSubscription.d.ts
  * Package rxjs
  * Name SubjectSubscription
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SubjectSubscription<T> extends Subscription {
    public Subject<T> subject;
    public Observer<T> subscriber;
    public boolean closed;
    @JsConstructor
    public SubjectSubscription(Subject<T> subject,Observer<T> subscriber) {}
    public native  void unsubscribe();
}
