package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\multicast.d.ts
  * Package rxjs
  * Name MulticastOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MulticastOperator<T> extends Operator<T,T> {
    public Object subjectFactory;
    public Object selector;
    @JsConstructor
    public MulticastOperator(JsFunction<Subject<T>> subjectFactory,JsFunction1<Observable<T>,Observable<T>> selector) {}
    public native  Object call(Subscriber<T> subscriber,Object source);
}
