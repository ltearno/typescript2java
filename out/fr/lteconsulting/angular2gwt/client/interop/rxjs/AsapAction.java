package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AsapScheduler;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.AsapAction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\AsapAction.d.ts
  * Package rxjs
  * Name AsapAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AsapAction<T> extends AsyncAction<T> {
    @JsProperty(name="scheduler")
    AsapScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(AsapScheduler value);
    @JsProperty(name="work")
    JsFunction2<AsapAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<AsapAction<T>,T,Void> value);
    @JsConstructor
    public AsapAction(AsapScheduler scheduler,JsFunction2<AsapAction<T>,T,Void> work) {}
     Object requestAsyncId(AsapScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
     Object recycleAsyncId(AsapScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
