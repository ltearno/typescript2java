package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\operator\groupBy.d.ts
  * Package rxjs
  * Name RefCountSubscription
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class RefCountSubscription  {
    public int count;
    public JsFunction<Void> unsubscribe;
    public boolean closed;
    public boolean attemptedToUnsubscribe;
}
