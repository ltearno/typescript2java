package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeMap.d.ts
  * Package rxjs
  * Name MergeMapOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeMapOperator<T,I,R> extends Operator<T,I> {
    public Object project;
    public Object resultSelector;
    public Object concurrent;
    @JsConstructor
    public MergeMapOperator(JsFunction2<T,Integer,/* NO SYMBOL */ObservableInput<I>> project,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  Object call(Subscriber<I> observer,Object source);
}
