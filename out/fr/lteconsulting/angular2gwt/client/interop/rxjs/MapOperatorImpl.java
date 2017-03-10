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
@JsType( isNative=true, namespace="rxjs", name="MapOperator" )
public class MapOperatorImpl<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="thisArg")
    Object getThisArg();
    @JsProperty(name="thisArg")
    void setThisArg(Object value);
    @JsConstructor
    public MapOperatorImpl(JsFunction2<T,Integer,R> project,Object thisArg) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
