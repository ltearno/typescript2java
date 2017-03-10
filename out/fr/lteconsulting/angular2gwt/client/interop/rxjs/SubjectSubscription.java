package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Subject;
import jsinterop.annotations.JsProperty;
import rxjs.Observer;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\SubjectSubscription.d.ts
  * Package rxjs
  * Name SubjectSubscription
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SubjectSubscription<T> extends Subscription {
    @JsProperty(name="subject")
    Subject<T> getSubject();
    @JsProperty(name="subject")
    void setSubject(Subject<T> value);
    @JsProperty(name="subscriber")
    Observer<T> getSubscriber();
    @JsProperty(name="subscriber")
    void setSubscriber(Observer<T> value);
    @JsProperty(name="closed")
    boolean getClosed();
    @JsProperty(name="closed")
    void setClosed(boolean value);
    @JsConstructor
    public SubjectSubscription(Subject<T> subject,Observer<T> subscriber) {}
     void unsubscribe();
}
