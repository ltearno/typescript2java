package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\combineLatest.d.ts
  * Package rxjs
  * Name CombineLatestOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class CombineLatestOperator<T,R> extends Operator<T,R> {
    public Object project;
    @JsConstructor
    public CombineLatestOperator(JsFunction1<Array<Object>,R> /* optional */ project) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}