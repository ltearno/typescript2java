package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\combineLatest.d.ts
  * Package rxjs
  * Name CombineLatestOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="CombineLatestOperator" )
public class CombineLatestOperatorImpl<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsConstructor
    public CombineLatestOperatorImpl(JsFunction1<Array<Object>,R> /* optional */ project) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
