package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\find.d.ts
  * Package rxjs
  * Name FindValueOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class FindValueOperator<T> extends Operator<T,T> {
    public Object predicate;
    public Object source;
    public Object yieldIndex;
    public Object thisArg;
    @JsConstructor
    public FindValueOperator(JsFunction3<T,Integer,Observable<T>,Boolean> predicate,Observable<T> source,boolean yieldIndex,Object /* optional */ thisArg) {}
    public native  Object call(Subscriber<T> observer,Object source);
}
