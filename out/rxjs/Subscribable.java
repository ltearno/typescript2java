package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\Observable.d.ts
  * Package rxjs
  * Name Subscribable
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Subscribable<T>  {
    public native  AnonymousSubscription subscribe(Object /* UnionType */ /* optional */ observerOrNext,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
}
