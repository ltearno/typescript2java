package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\find.d.ts
  * Package rxjs
  * Name FindValueSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class FindValueSubscriber<T> extends Subscriber<T> {
    public Object predicate;
    public Object source;
    public Object yieldIndex;
    public Object thisArg;
    public Object index;
    @JsConstructor
    public FindValueSubscriber(Subscriber<T> destination,JsFunction3<T,Integer,Observable<T>,Boolean> predicate,Observable<T> source,boolean yieldIndex,Object /* optional */ thisArg) {}
    public native  void notifyComplete();
    public native  void _next(T value);
    public native  void _complete();
}
