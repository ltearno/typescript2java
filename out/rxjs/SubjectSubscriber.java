package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subject.d.ts
  * Package rxjs
  * Name SubjectSubscriber
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SubjectSubscriber<T> extends Subscriber<T> {
    public Subject<T> destination;
    @JsConstructor
    public SubjectSubscriber(Subject<T> destination) {}
}
