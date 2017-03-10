package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\FromObservable.d.ts
  * Package rxjs
  * Name FromObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FromObservable<T> extends Observable<T> {
    @JsProperty(name="ish")
    Object getIsh();
    @JsProperty(name="ish")
    void setIsh(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public FromObservable(/* NO SYMBOL */ObservableInput<T> ish,IScheduler /* optional */ scheduler) {}
     Object _subscribe(Subscriber<T> subscriber);
}
