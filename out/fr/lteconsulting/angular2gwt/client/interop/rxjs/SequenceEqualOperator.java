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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SequenceEqualOperator<T> extends Operator<T,Boolean> {
    @JsProperty(name="compareTo")
    Object getCompareTo();
    @JsProperty(name="compareTo")
    void setCompareTo(Object value);
    @JsProperty(name="comparor")
    Object getComparor();
    @JsProperty(name="comparor")
    void setComparor(Object value);
    @JsConstructor
    public SequenceEqualOperator(Observable<T> compareTo,JsFunction2<T,T,Boolean> comparor) {}
     Object call(Subscriber<Boolean> subscriber,Object source);
}
