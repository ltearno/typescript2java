package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.AnimationPlayer;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\animation\animation_player.d.ts
  * Package ng.core
  * Name AnimationPlayer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationPlayer  {
     void onDone(JsFunction<Void> fn);
     void onStart(JsFunction<Void> fn);
     void init();
     boolean hasStarted();
     void play();
     void pause();
     void restart();
     void finish();
     void destroy();
     void reset();
     void setPosition(Object p);
     int getPosition();
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
}
