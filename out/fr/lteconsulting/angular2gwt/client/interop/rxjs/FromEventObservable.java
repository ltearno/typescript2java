package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\FromEventObservable.d.ts
  * Package rxjs
  * Name FromEventObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FromEventObservable<T> extends Observable<T> {
    @JsProperty(name="sourceObj")
    Object getSourceObj();
    @JsProperty(name="sourceObj")
    void setSourceObj(Object value);
    @JsProperty(name="eventName")
    Object getEventName();
    @JsProperty(name="eventName")
    void setEventName(Object value);
    @JsProperty(name="selector")
    Object getSelector();
    @JsProperty(name="selector")
    void setSelector(Object value);
    @JsProperty(name="options")
    Object getOptions();
    @JsProperty(name="options")
    void setOptions(Object value);
    @JsConstructor
    public FromEventObservable(/* NO SYMBOL */EventTargetLike sourceObj,String eventName,SelectorMethodSignature<T> /* optional */ selector,/* NO SYMBOL */EventListenerOptions /* optional */ options) {}
     void _subscribe(Subscriber<T> subscriber);
}
