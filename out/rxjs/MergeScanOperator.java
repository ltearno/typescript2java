package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeScan.d.ts
  * Package rxjs
  * Name MergeScanOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeScanOperator<T,R> extends Operator<T,R> {
    public Object accumulator;
    public Object seed;
    public Object concurrent;
    @JsConstructor
    public MergeScanOperator(JsFunction2<R,T,Observable<R>> accumulator,R seed,int concurrent) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
