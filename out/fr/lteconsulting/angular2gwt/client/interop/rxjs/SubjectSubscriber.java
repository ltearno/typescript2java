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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SubjectSubscriber<T> extends Subscriber<T> {
    @JsProperty(name="destination")
    Subject<T> getDestination();
    @JsProperty(name="destination")
    void setDestination(Subject<T> value);
    @JsConstructor
    public SubjectSubscriber(Subject<T> destination) {}
}
