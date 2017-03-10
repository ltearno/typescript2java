package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationPlayer;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\animation\animation_player.d.ts
  * Package ng.core
  * Name NoOpAnimationPlayer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NoOpAnimationPlayer extends AnimationPlayer {
    @JsProperty(name="_onDoneFns")
    Object get_onDoneFns();
    @JsProperty(name="_onDoneFns")
    void set_onDoneFns(Object value);
    @JsProperty(name="_onStartFns")
    Object get_onStartFns();
    @JsProperty(name="_onStartFns")
    void set_onStartFns(Object value);
    @JsProperty(name="_started")
    Object get_started();
    @JsProperty(name="_started")
    void set_started(Object value);
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
    @JsConstructor
    public NoOpAnimationPlayer() {}
     void onStart(JsFunction<Void> fn);
     void onDone(JsFunction<Void> fn);
     boolean hasStarted();
     void init();
     void play();
     void pause();
     void restart();
     void finish();
     void destroy();
     void reset();
     void setPosition(int p);
     int getPosition();
}
