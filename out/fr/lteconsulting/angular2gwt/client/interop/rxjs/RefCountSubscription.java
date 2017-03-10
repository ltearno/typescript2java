package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\operator\groupBy.d.ts
  * Package rxjs
  * Name RefCountSubscription
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RefCountSubscription  {
    @JsProperty(name="count")
    int count();
    @JsProperty(name="count")
    void count(int value);
    @JsProperty(name="unsubscribe")
    JsFunction<Void> unsubscribe();
    @JsProperty(name="unsubscribe")
    void unsubscribe(JsFunction<Void> value);
    @JsProperty(name="closed")
    boolean closed();
    @JsProperty(name="closed")
    void closed(boolean value);
    @JsProperty(name="attemptedToUnsubscribe")
    boolean attemptedToUnsubscribe();
    @JsProperty(name="attemptedToUnsubscribe")
    void attemptedToUnsubscribe(boolean value);
}
