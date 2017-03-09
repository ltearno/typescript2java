package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\FromEventObservable.d.ts
  * Package rxjs
  * Name FromEventObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class FromEventObservable<T> extends Observable<T> {
    public Object sourceObj;
    public Object eventName;
    public Object selector;
    public Object options;
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,SelectorMethodSignature<T> selector);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,/* NO SYMBOL */EventListenerOptions options);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,/* NO SYMBOL */EventListenerOptions options,SelectorMethodSignature<T> selector);
    @JsConstructor
    public FromEventObservable(/* NO SYMBOL */EventTargetLike sourceObj,String eventName,SelectorMethodSignature<T> /* optional */ selector,/* NO SYMBOL */EventListenerOptions /* optional */ options) {}
    public static native <T> void setupSubscription(UNKNOWN_TYPE_NAME_QuestionToken options);
    public native  void _subscribe(Subscriber<T> subscriber);
}
