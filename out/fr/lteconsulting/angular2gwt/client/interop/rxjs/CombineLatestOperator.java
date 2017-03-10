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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CombineLatestOperator<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsConstructor
    public CombineLatestOperator(JsFunction1<Array<Object>,R> /* optional */ project) {}
     Object call(Subscriber<R> subscriber,Object source);
}
