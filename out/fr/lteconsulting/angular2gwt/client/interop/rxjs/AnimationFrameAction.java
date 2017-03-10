package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AnimationFrameScheduler;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.AnimationFrameAction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\AnimationFrameAction.d.ts
  * Package rxjs
  * Name AnimationFrameAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationFrameAction<T> extends AsyncAction<T> {
    @JsProperty(name="scheduler")
    AnimationFrameScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(AnimationFrameScheduler value);
    @JsProperty(name="work")
    JsFunction2<AnimationFrameAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<AnimationFrameAction<T>,T,Void> value);
    @JsConstructor
    public AnimationFrameAction(AnimationFrameScheduler scheduler,JsFunction2<AnimationFrameAction<T>,T,Void> work) {}
     Object requestAsyncId(AnimationFrameScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
     Object recycleAsyncId(AnimationFrameScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
