package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeAll.d.ts
  * Package rxjs
  * Name MergeAllSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeAllSubscriber<T> extends OuterSubscriber<Observable<T>,T> {
    public Object concurrent;
    public Object hasCompleted;
    public Object buffer;
    public Object active;
    @JsConstructor
    public MergeAllSubscriber(Observer<T> destination,int concurrent) {}
    public native  void _next(Observable<T> observable);
    public native  void _complete();
    public native  void notifyComplete(Subscription innerSub);
}
