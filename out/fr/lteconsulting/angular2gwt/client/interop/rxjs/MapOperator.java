package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\map.d.ts
  * Package rxjs
  * Name MapOperator
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MapOperator<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="thisArg")
    Object getThisArg();
    @JsProperty(name="thisArg")
    void setThisArg(Object value);
    @JsConstructor
    public MapOperator(JsFunction2<T,Integer,R> project,Object thisArg) {}
     Object call(Subscriber<R> subscriber,Object source);
}
