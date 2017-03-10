package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Observer;

/**
  * Generated from tests\rxjs\operator\mergeAll.d.ts
  * Package rxjs
  * Name MergeAllOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="MergeAllOperator" )
public class MergeAllOperatorImpl<T> extends Operator<Observable<T>,T> {
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsConstructor
    public MergeAllOperatorImpl(int concurrent) {}
    public native  Object call(Observer<T> observer,Object source);
}
