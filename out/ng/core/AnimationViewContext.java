package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\animation_view_context.d.ts
  * Package ng.core
  * Name AnimationViewContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationViewContext  {
    public Object _animationQueue;
    public Object _players;
    @JsConstructor
    public AnimationViewContext(AnimationQueue _animationQueue) {}
    public native  void onAllActiveAnimationsDone(JsFunction<Object> callback);
    public native  void queueAnimation(Object element,String animationName,AnimationPlayer player);
    public native  JsArray<AnimationPlayer> getAnimationPlayers(Object element,String /* optional */ animationName);
}
