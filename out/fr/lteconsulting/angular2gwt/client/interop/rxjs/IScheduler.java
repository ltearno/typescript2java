package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Action;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\Scheduler.d.ts
  * Package rxjs
  * Name IScheduler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IScheduler  {
     int now();
    <T> Subscription schedule(JsFunction2<Action<T>,T,Void> work,int /* optional */ delay,T /* optional */ state);
}
