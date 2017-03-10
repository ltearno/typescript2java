package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\reduce.d.ts
  * Package rxjs
  * Name ReduceSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReduceSubscriber<T,R> extends Subscriber<T> {
    @JsProperty(name="accumulator")
    Object getAccumulator();
    @JsProperty(name="accumulator")
    void setAccumulator(Object value);
    @JsProperty(name="hasSeed")
    Object getHasSeed();
    @JsProperty(name="hasSeed")
    void setHasSeed(Object value);
    @JsProperty(name="index")
    Object getIndex();
    @JsProperty(name="index")
    void setIndex(Object value);
    @JsProperty(name="acc")
    Object getAcc();
    @JsProperty(name="acc")
    void setAcc(Object value);
    @JsProperty(name="hasValue")
    Object getHasValue();
    @JsProperty(name="hasValue")
    void setHasValue(Object value);
    @JsConstructor
    public ReduceSubscriber(Subscriber<R> destination,JsFunction3<R,T,Integer,R> accumulator,R seed,boolean hasSeed) {}
     void _next(T value);
     void _tryReduce();
     void _complete();
}
