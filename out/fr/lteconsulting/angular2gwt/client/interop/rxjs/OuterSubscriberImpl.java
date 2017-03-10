package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.InnerSubscriber;

/**
  * Generated from tests\rxjs\OuterSubscriber.d.ts
  * Package rxjs
  * Name OuterSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="OuterSubscriber" )
public class OuterSubscriberImpl<T,R> extends Subscriber<T> {
    public native  void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
    public native  void notifyError(Object error,InnerSubscriber<T,R> innerSub);
    public native  void notifyComplete(InnerSubscriber<T,R> innerSub);
}
