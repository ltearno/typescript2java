package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\reduce.d.ts
  * Package rxjs
  * Name ReduceOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ReduceOperator<T,R> extends Operator<T,R> {
    public Object accumulator;
    public Object seed;
    public Object hasSeed;
    @JsConstructor
    public ReduceOperator(JsFunction3<R,T,Integer,R> accumulator,R /* optional */ seed,boolean /* optional */ hasSeed) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
