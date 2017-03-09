package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\rxjs\AsyncSubject.d.ts
  * Package rxjs
  * Name AsyncSubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AsyncSubject<T> extends Subject<T> {
    public Object value;
    public Object hasNext;
    public Object hasCompleted;
    public native  Subscription _subscribe(Subscriber<Object> subscriber);
    public native  void next(T value);
    public native  void error(Object error);
    public native  void complete();
}
