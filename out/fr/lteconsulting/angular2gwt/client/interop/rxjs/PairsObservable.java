package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\PairsObservable.d.ts
  * Package rxjs
  * Name PairsObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PairsObservable<T> extends Observable<Array<Object /* UnionType */>> {
    @JsProperty(name="obj")
    Object getObj();
    @JsProperty(name="obj")
    void setObj(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="keys")
    Object getKeys();
    @JsProperty(name="keys")
    void setKeys(Object value);
    @JsConstructor
    public PairsObservable(Object obj,IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Array<Object /* UnionType */>> subscriber);
}
