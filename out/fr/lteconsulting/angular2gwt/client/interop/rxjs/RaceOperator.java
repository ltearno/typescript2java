package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\operator\race.d.ts
  * Package rxjs
  * Name RaceOperator
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RaceOperator<T> extends Operator<T,T> {
     /* NO SYMBOL */TeardownLogic call(Subscriber<T> subscriber,Object source);
}
