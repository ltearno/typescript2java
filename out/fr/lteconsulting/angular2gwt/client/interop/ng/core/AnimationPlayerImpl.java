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
@JsType( isNative=true, namespace="ng.core", name="AnimationPlayer" )
public abstract class AnimationPlayerImpl  {
    public native  void onDone(JsFunction<Void> fn);
    public native  void onStart(JsFunction<Void> fn);
    public native  void init();
    public native  boolean hasStarted();
    public native  void play();
    public native  void pause();
    public native  void restart();
    public native  void finish();
    public native  void destroy();
    public native  void reset();
    public native  void setPosition(Object p);
    public native  int getPosition();
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
}
