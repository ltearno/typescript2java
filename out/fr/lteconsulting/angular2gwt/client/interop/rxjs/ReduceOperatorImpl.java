package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\reduce.d.ts
  * Package rxjs
  * Name ReduceOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="ReduceOperator" )
public class ReduceOperatorImpl<T,R> extends Operator<T,R> {
    @JsProperty(name="accumulator")
    Object getAccumulator();
    @JsProperty(name="accumulator")
    void setAccumulator(Object value);
    @JsProperty(name="seed")
    Object getSeed();
    @JsProperty(name="seed")
    void setSeed(Object value);
    @JsProperty(name="hasSeed")
    Object getHasSeed();
    @JsProperty(name="hasSeed")
    void setHasSeed(Object value);
    @JsConstructor
    public ReduceOperatorImpl(JsFunction3<R,T,Integer,R> accumulator,R /* optional */ seed,boolean /* optional */ hasSeed) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
