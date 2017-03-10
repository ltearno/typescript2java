package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\AsyncSubject.d.ts
  * Package rxjs
  * Name AsyncSubject
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="AsyncSubject" )
public class AsyncSubjectImpl<T> extends Subject<T> {
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsProperty(name="hasNext")
    Object getHasNext();
    @JsProperty(name="hasNext")
    void setHasNext(Object value);
    @JsProperty(name="hasCompleted")
    Object getHasCompleted();
    @JsProperty(name="hasCompleted")
    void setHasCompleted(Object value);
    public native  Subscription _subscribe(Subscriber<Object> subscriber);
    public native  void next(T value);
    public native  void error(Object error);
    public native  void complete();
}
