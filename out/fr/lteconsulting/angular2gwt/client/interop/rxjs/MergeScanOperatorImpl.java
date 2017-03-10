package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\mergeScan.d.ts
  * Package rxjs
  * Name MergeScanOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="MergeScanOperator" )
public class MergeScanOperatorImpl<T,R> extends Operator<T,R> {
    @JsProperty(name="accumulator")
    Object getAccumulator();
    @JsProperty(name="accumulator")
    void setAccumulator(Object value);
    @JsProperty(name="seed")
    Object getSeed();
    @JsProperty(name="seed")
    void setSeed(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsConstructor
    public MergeScanOperatorImpl(JsFunction2<R,T,Observable<R>> accumulator,R seed,int concurrent) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
