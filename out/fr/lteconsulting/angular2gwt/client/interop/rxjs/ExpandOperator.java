package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Observable;
import rxjs.IScheduler;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\expand.d.ts
  * Package rxjs
  * Name ExpandOperator
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpandOperator<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="concurrent")
    Object getConcurrent();
    @JsProperty(name="concurrent")
    void setConcurrent(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    @JsConstructor
    public ExpandOperator(JsFunction2<T,Integer,Observable<R>> project,int concurrent,IScheduler scheduler) {}
     Object call(Subscriber<R> subscriber,Object source);
}
