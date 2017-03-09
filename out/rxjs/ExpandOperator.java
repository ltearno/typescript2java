package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\expand.d.ts
  * Package rxjs
  * Name ExpandOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ExpandOperator<T,R> extends Operator<T,R> {
    public Object project;
    public Object concurrent;
    public Object scheduler;
    @JsConstructor
    public ExpandOperator(JsFunction2<T,Integer,Observable<R>> project,int concurrent,IScheduler scheduler) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
