package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\animation_queue.d.ts
  * Package ng.core
  * Name AnimationQueue
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationQueue  {
    public Object _zone;
    public JsArray<AnimationPlayer> entries;
    @JsConstructor
    public AnimationQueue(NgZone _zone) {}
    public native  void enqueue(AnimationPlayer player);
    public native  void flush();
    public native  void _triggerAnimations();
}
