package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\IfObservable.d.ts
  * Package rxjs
  * Name IfObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IfObservable<T,R> extends Observable<T> {
    @JsProperty(name="condition")
    Object getCondition();
    @JsProperty(name="condition")
    void setCondition(Object value);
    @JsProperty(name="thenSource")
    Object getThenSource();
    @JsProperty(name="thenSource")
    void setThenSource(Object value);
    @JsProperty(name="elseSource")
    Object getElseSource();
    @JsProperty(name="elseSource")
    void setElseSource(Object value);
    @JsConstructor
    public IfObservable(JsFunction<Object /* UnionType */> condition,Object /* UnionType */ /* optional */ thenSource,Object /* UnionType */ /* optional */ elseSource) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Object /* UnionType */> subscriber);
}
