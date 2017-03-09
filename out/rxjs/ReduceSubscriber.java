package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\reduce.d.ts
  * Package rxjs
  * Name ReduceSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ReduceSubscriber<T,R> extends Subscriber<T> {
    public Object accumulator;
    public Object hasSeed;
    public Object index;
    public Object acc;
    public Object hasValue;
    @JsConstructor
    public ReduceSubscriber(Subscriber<R> destination,JsFunction3<R,T,Integer,R> accumulator,R seed,boolean hasSeed) {}
    public native  void _next(T value);
    public native  void _tryReduce();
    public native  void _complete();
}
