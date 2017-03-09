package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\sequenceEqual.d.ts
  * Package rxjs
  * Name SequenceEqualOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SequenceEqualOperator<T> extends Operator<T,Boolean> {
    public Object compareTo;
    public Object comparor;
    @JsConstructor
    public SequenceEqualOperator(Observable<T> compareTo,JsFunction2<T,T,Boolean> comparor) {}
    public native  Object call(Subscriber<Boolean> subscriber,Object source);
}
