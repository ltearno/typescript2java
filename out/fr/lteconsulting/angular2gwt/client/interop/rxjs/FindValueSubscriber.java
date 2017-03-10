package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\find.d.ts
  * Package rxjs
  * Name FindValueSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FindValueSubscriber<T> extends Subscriber<T> {
    @JsProperty(name="predicate")
    Object getPredicate();
    @JsProperty(name="predicate")
    void setPredicate(Object value);
    @JsProperty(name="source")
    Object getSource();
    @JsProperty(name="source")
    void setSource(Object value);
    @JsProperty(name="yieldIndex")
    Object getYieldIndex();
    @JsProperty(name="yieldIndex")
    void setYieldIndex(Object value);
    @JsProperty(name="thisArg")
    Object getThisArg();
    @JsProperty(name="thisArg")
    void setThisArg(Object value);
    @JsProperty(name="index")
    Object getIndex();
    @JsProperty(name="index")
    void setIndex(Object value);
    @JsConstructor
    public FindValueSubscriber(Subscriber<T> destination,JsFunction3<T,Integer,Observable<T>,Boolean> predicate,Observable<T> source,boolean yieldIndex,Object /* optional */ thisArg) {}
     void notifyComplete();
     void _next(T value);
     void _complete();
}
