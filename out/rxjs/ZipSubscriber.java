package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\rxjs\operator\zip.d.ts
  * Package rxjs
  * Name ZipSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ZipSubscriber<T,R> extends Subscriber<T> {
    public Object values;
    public Object project;
    public Object iterators;
    public Object active;
    @JsConstructor
    public ZipSubscriber(Subscriber<R> destination,JsFunction1<Array<Object>,R> /* optional */ project,Object /* optional */ values) {}
    public native  void _next(Object value);
    public native  void _complete();
    public native  void notifyInactive();
    public native  void checkIterators();
    public native  void _tryProject(JsArray<Object> args);
}
