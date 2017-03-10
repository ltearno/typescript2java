package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.IScheduler;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\ArrayObservable.d.ts
  * Package rxjs
  * Name ArrayObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ArrayObservable<T> extends Observable<T> {
    @JsProperty(name="array")
    Object getArray();
    @JsProperty(name="array")
    void setArray(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public ArrayObservable(JsArray<T> array,IScheduler /* optional */ scheduler) {}
     /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
