package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.FromEventPatternObservable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\FromEventPatternObservable.d.ts
  * Package rxjs
  * Name FromEventPatternObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FromEventPatternObservable<T> extends Observable<T> {
    @JsProperty(name="addHandler")
    Object getAddHandler();
    @JsProperty(name="addHandler")
    void setAddHandler(Object value);
    @JsProperty(name="removeHandler")
    Object getRemoveHandler();
    @JsProperty(name="removeHandler")
    void setRemoveHandler(Object value);
    @JsProperty(name="selector")
    Object getSelector();
    @JsProperty(name="selector")
    void setSelector(Object value);
    @JsConstructor
    public FromEventPatternObservable(JsFunction1<Function,Object> addHandler,JsFunction2<Function,Object,Void> /* optional */ removeHandler,JsFunction1<Array<Object>,T> /* optional */ selector) {}
     void _subscribe(Subscriber<T> subscriber);
     void _callSelector();
     void _callAddHandler();
}
