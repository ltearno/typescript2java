package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\mergeAll.d.ts
  * Package rxjs
  * Name MergeAllOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MergeAllOperator<T> extends Operator<Observable<T>,T> {
    public Object concurrent;
    @JsConstructor
    public MergeAllOperator(int concurrent) {}
    public native  Object call(Observer<T> observer,Object source);
}
