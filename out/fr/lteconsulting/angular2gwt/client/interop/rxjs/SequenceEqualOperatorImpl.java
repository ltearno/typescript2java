package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\sequenceEqual.d.ts
  * Package rxjs
  * Name SequenceEqualOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="SequenceEqualOperator" )
public class SequenceEqualOperatorImpl<T> extends Operator<T,Boolean> {
    @JsProperty(name="compareTo")
    Object getCompareTo();
    @JsProperty(name="compareTo")
    void setCompareTo(Object value);
    @JsProperty(name="comparor")
    Object getComparor();
    @JsProperty(name="comparor")
    void setComparor(Object value);
    @JsConstructor
    public SequenceEqualOperatorImpl(Observable<T> compareTo,JsFunction2<T,T,Boolean> comparor) {}
    public native  Object call(Subscriber<Boolean> subscriber,Object source);
}
