package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\zip.d.ts
  * Package rxjs
  * Name ZipOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="ZipOperator" )
public class ZipOperatorImpl<T,R> extends Operator<T,R> {
    @JsProperty(name="project")
    JsFunction1<Array<Object>,R> getProject();
    @JsProperty(name="project")
    void setProject(JsFunction1<Array<Object>,R> value);
    @JsConstructor
    public ZipOperatorImpl(JsFunction1<Array<Object>,R> /* optional */ project) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
