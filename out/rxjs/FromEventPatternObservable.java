package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\FromEventPatternObservable.d.ts
  * Package rxjs
  * Name FromEventPatternObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class FromEventPatternObservable<T> extends Observable<T> {
    public Object addHandler;
    public Object removeHandler;
    public Object selector;
    public static native <T> FromEventPatternObservable<T> create(JsFunction1<Function,Object> addHandler,JsFunction2<Function,Object,Void> /* optional */ removeHandler,JsFunction1<Array<Object>,T> /* optional */ selector);
    @JsConstructor
    public FromEventPatternObservable(JsFunction1<Function,Object> addHandler,JsFunction2<Function,Object,Void> /* optional */ removeHandler,JsFunction1<Array<Object>,T> /* optional */ selector) {}
    public native  void _subscribe(Subscriber<T> subscriber);
    public native  void _callSelector();
    public native  void _callAddHandler();
}
