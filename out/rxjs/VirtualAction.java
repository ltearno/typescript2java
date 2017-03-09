package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\VirtualTimeScheduler.d.ts
  * Package rxjs
  * Name VirtualAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class VirtualAction<T> extends AsyncAction<T> {
    public VirtualTimeScheduler scheduler;
    public JsFunction2<VirtualAction<T>,T,Void> work;
    public int index;
    @JsConstructor
    public VirtualAction(VirtualTimeScheduler scheduler,JsFunction2<VirtualAction<T>,T,Void> work,int /* optional */ index) {}
    public native  Subscription schedule(T /* optional */ state,int /* optional */ delay);
    public native  Object requestAsyncId(VirtualTimeScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public native  Object recycleAsyncId(VirtualTimeScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public static native <T> int sortActions(VirtualAction<T> a,VirtualAction<T> b);
}
