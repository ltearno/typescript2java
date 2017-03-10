package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Subject;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\multicast.d.ts
  * Package rxjs
  * Name MulticastOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="MulticastOperator" )
public class MulticastOperatorImpl<T> extends Operator<T,T> {
    @JsProperty(name="subjectFactory")
    Object getSubjectFactory();
    @JsProperty(name="subjectFactory")
    void setSubjectFactory(Object value);
    @JsProperty(name="selector")
    Object getSelector();
    @JsProperty(name="selector")
    void setSelector(Object value);
    @JsConstructor
    public MulticastOperatorImpl(JsFunction<Subject<T>> subjectFactory,JsFunction1<Observable<T>,Observable<T>> selector) {}
    public native  Object call(Subscriber<T> subscriber,Object source);
}
