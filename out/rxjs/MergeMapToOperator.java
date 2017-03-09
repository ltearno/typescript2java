package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeMapTo.d.ts
  * Package rxjs
  * Name MergeMapToOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeMapToOperator<T,I,R> extends Operator<Observable<T>,R> {
    public Object ish;
    public Object resultSelector;
    public Object concurrent;
    @JsConstructor
    public MergeMapToOperator(/* NO SYMBOL */ObservableInput<I> ish,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  Object call(Subscriber<R> observer,Object source);
}
