package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\testing\mock_animation_player.d.ts
  * Package ng.core
  * Name MockAnimationPlayer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockAnimationPlayer extends AnimationPlayer {
    public JsTypedObject<String,Object /* UnionType */> startingStyles;
    public Array<JsArray<Object> /* Tuple [Integer, JsTypedObject<String,Object /* UnionType */>] */> keyframes;
    public Object _onDoneFns;
    public Object _onStartFns;
    public Object _finished;
    public Object _destroyed;
    public Object _started;
    public AnimationPlayer parentPlayer;
    public JsTypedObject<String,Object /* UnionType */> previousStyles;
    public JsArray<Object> log;
    @JsConstructor
    public MockAnimationPlayer(JsTypedObject<String,Object /* UnionType */> /* optional */ startingStyles,Array<JsArray<Object> /* Tuple [Integer, JsTypedObject<String,Object /* UnionType */>] */> /* optional */ keyframes,JsArray<AnimationPlayer> /* optional */ previousPlayers) {}
    public native  void _onFinish();
    public native  void init();
    public native  void onDone(JsFunction<Void> fn);
    public native  void onStart(JsFunction<Void> fn);
    public native  boolean hasStarted();
    public native  void play();
    public native  void pause();
    public native  void restart();
    public native  void finish();
    public native  void reset();
    public native  void destroy();
    public native  void setPosition(int p);
    public native  int getPosition();
    public native  void _captureStyles();
}
