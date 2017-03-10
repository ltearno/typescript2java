package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationPlayer;
import ng.core.NgZone;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\animation_queue.d.ts
  * Package ng.core
  * Name AnimationQueue
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationQueue  {
    @JsProperty(name="_zone")
    Object get_zone();
    @JsProperty(name="_zone")
    void set_zone(Object value);
    @JsProperty(name="entries")
    JsArray<AnimationPlayer> getEntries();
    @JsProperty(name="entries")
    void setEntries(JsArray<AnimationPlayer> value);
    @JsConstructor
    public AnimationQueue(NgZone _zone) {}
     void enqueue(AnimationPlayer player);
     void flush();
     void _triggerAnimations();
}
