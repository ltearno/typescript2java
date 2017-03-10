package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import fr.lteconsulting.angular2gwt.client.JsFunction4;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\mergeMap.d.ts
  * Package rxjs
  * Name MergeMapOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="MergeMapOperator" )
public class MergeMapOperatorImpl<T,I,R> extends Operator<T,I> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="resultSelector")
    Object getResultSelector();
    @JsProperty(name="resultSelector")
    void setResultSelector(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsConstructor
    public MergeMapOperatorImpl(JsFunction2<T,Integer,/* NO SYMBOL */ObservableInput<I>> project,JsFunction4<T,I,Integer,Integer,R> /* optional */ resultSelector,int /* optional */ concurrent) {}
    public native  Object call(Subscriber<I> observer,Object source);
}
