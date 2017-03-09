package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\IfObservable.d.ts
  * Package rxjs
  * Name IfObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class IfObservable<T,R> extends Observable<T> {
    public Object condition;
    public Object thenSource;
    public Object elseSource;
    public static native <T,R> Observable<Object /* UnionType */> create(JsFunction<Object /* UnionType */> condition,Object /* UnionType */ /* optional */ thenSource,Object /* UnionType */ /* optional */ elseSource);
    @JsConstructor
    public IfObservable(JsFunction<Object /* UnionType */> condition,Object /* UnionType */ /* optional */ thenSource,Object /* UnionType */ /* optional */ elseSource) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Object /* UnionType */> subscriber);
}
