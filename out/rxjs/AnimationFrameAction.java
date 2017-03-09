package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\AnimationFrameAction.d.ts
  * Package rxjs
  * Name AnimationFrameAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AnimationFrameAction<T> extends AsyncAction<T> {
    public AnimationFrameScheduler scheduler;
    public JsFunction2<AnimationFrameAction<T>,T,Void> work;
    @JsConstructor
    public AnimationFrameAction(AnimationFrameScheduler scheduler,JsFunction2<AnimationFrameAction<T>,T,Void> work) {}
    public native  Object requestAsyncId(AnimationFrameScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public native  Object recycleAsyncId(AnimationFrameScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
