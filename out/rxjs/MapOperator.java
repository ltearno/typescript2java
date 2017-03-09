package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\map.d.ts
  * Package rxjs
  * Name MapOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MapOperator<T,R> extends Operator<T,R> {
    public Object project;
    public Object thisArg;
    @JsConstructor
    public MapOperator(JsFunction2<T,Integer,R> project,Object thisArg) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
