package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\rxjs\Scheduler.d.ts
  * Package rxjs
  * Name IScheduler
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class IScheduler  {
    public native  int now();
    public native <T> Subscription schedule(JsFunction2<Action<T>,T,Void> work,int /* optional */ delay,T /* optional */ state);
}
