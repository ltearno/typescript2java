package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Subject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name SubjectSubscriber
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="SubjectSubscriber" )
public class SubjectSubscriberImpl<T> extends Subscriber<T> {
    @JsProperty(name="destination")
    Subject<T> getDestination();
    @JsProperty(name="destination")
    void setDestination(Subject<T> value);
    @JsConstructor
    public SubjectSubscriberImpl(Subject<T> destination) {}
}
