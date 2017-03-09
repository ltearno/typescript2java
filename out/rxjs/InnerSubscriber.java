package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\InnerSubscriber.d.ts
  * Package rxjs
  * Name InnerSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class InnerSubscriber<T,R> extends Subscriber<R> {
    public Object parent;
    public Object outerValue;
    public Object outerIndex;
    public Object index;
    @JsConstructor
    public InnerSubscriber(OuterSubscriber<T,R> parent,T outerValue,int outerIndex) {}
    public native  void _next(R value);
    public native  void _error(Object error);
    public native  void _complete();
}
