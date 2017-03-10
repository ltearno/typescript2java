package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.AnonymousSubscription;

/**
  * Generated from tests\rxjs\Observable.d.ts
  * Package rxjs
  * Name Subscribable
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Subscribable<T>  {
     AnonymousSubscription subscribe(Object /* UnionType */ /* optional */ observerOrNext,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
}
