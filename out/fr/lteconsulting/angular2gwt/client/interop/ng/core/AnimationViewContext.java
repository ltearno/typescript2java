package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationQueue;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.AnimationPlayer;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\animation_view_context.d.ts
  * Package ng.core
  * Name AnimationViewContext
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationViewContext  {
    @JsProperty(name="_animationQueue")
    Object get_animationQueue();
    @JsProperty(name="_animationQueue")
    void set_animationQueue(Object value);
    @JsProperty(name="_players")
    Object get_players();
    @JsProperty(name="_players")
    void set_players(Object value);
    @JsConstructor
    public AnimationViewContext(AnimationQueue _animationQueue) {}
     void onAllActiveAnimationsDone(JsFunction<Object> callback);
     void queueAnimation(Object element,String animationName,AnimationPlayer player);
     JsArray<AnimationPlayer> getAnimationPlayers(Object element,String /* optional */ animationName);
}
