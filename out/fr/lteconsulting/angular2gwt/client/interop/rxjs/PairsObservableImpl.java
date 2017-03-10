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
@JsType( isNative=true, namespace="rxjs", name="PairsObservable" )
public class PairsObservableImpl<T> extends Observable<Array<Object /* UnionType */>> {
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
    public static native <T> Observable<Array<Object /* UnionType */>> create(Object obj,IScheduler /* optional */ scheduler);
    @JsConstructor
    public PairsObservableImpl(Object obj,IScheduler /* optional */ scheduler) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<Array<Object /* UnionType */>> subscriber);
}
