package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\AsapAction.d.ts
  * Package rxjs
  * Name AsapAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AsapAction<T> extends AsyncAction<T> {
    public AsapScheduler scheduler;
    public JsFunction2<AsapAction<T>,T,Void> work;
    @JsConstructor
    public AsapAction(AsapScheduler scheduler,JsFunction2<AsapAction<T>,T,Void> work) {}
    public native  Object requestAsyncId(AsapScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public native  Object recycleAsyncId(AsapScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
