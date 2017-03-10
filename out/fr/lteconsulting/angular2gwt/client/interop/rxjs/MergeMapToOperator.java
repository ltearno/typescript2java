package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\mergeMapTo.d.ts
  * Package rxjs
  * Name MergeMapToOperator
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MergeMapToOperator<T,I,R> extends Operator<Observable<T>,R> {
    @JsProperty(name="ish")
    Object getIsh();
    @JsProperty(name="ish")
    void setIsh(Object value);
    @JsProperty(name="resultSelector")
    Object getResultSelector();
    @JsProperty(name="resultSelector")
    void setResultSelector(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsConstructor
    public MergeMapToOperator(/* NO SYMBOL */ObservableInput<I> ish,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
     Object call(Subscriber<R> observer,Object source);
}
