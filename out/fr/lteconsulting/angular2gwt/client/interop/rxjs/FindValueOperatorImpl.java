package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\find.d.ts
  * Package rxjs
  * Name FindValueOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="FindValueOperator" )
public class FindValueOperatorImpl<T> extends Operator<T,T> {
    @JsProperty(name="predicate")
    Object getPredicate();
    @JsProperty(name="predicate")
    void setPredicate(Object value);
    @JsProperty(name="source")
    Object getSource();
    @JsProperty(name="source")
    void setSource(Object value);
    @JsProperty(name="yieldIndex")
    Object getYieldIndex();
    @JsProperty(name="yieldIndex")
    void setYieldIndex(Object value);
    @JsProperty(name="thisArg")
    Object getThisArg();
    @JsProperty(name="thisArg")
    void setThisArg(Object value);
    @JsConstructor
    public FindValueOperatorImpl(JsFunction3<T,Integer,Observable<T>,Boolean> predicate,Observable<T> source,boolean yieldIndex,Object /* optional */ thisArg) {}
    public native  Object call(Subscriber<T> observer,Object source);
}
