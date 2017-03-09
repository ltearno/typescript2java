package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\zip.d.ts
  * Package rxjs
  * Name ZipOperator
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ZipOperator<T,R> extends Operator<T,R> {
    public JsFunction1<Array<Object>,R> project;
    @JsConstructor
    public ZipOperator(JsFunction1<Array<Object>,R> /* optional */ project) {}
    public native  Object call(Subscriber<R> subscriber,Object source);
}
