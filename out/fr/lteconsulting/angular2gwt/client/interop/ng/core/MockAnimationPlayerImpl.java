package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationPlayer;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\testing\mock_animation_player.d.ts
  * Package ng.core
  * Name MockAnimationPlayer
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="MockAnimationPlayer" )
public class MockAnimationPlayerImpl extends AnimationPlayer {
    @JsProperty(name="startingStyles")
    JsTypedObject<String,Object /* UnionType */> getStartingStyles();
    @JsProperty(name="startingStyles")
    void setStartingStyles(JsTypedObject<String,Object /* UnionType */> value);
    @JsProperty(name="keyframes")
    Array<JsArray<Object> /* Tuple [Integer, JsTypedObject<String,Object /* UnionType */>] */> getKeyframes();
    @JsProperty(name="keyframes")
    void setKeyframes(Array<JsArray<Object> /* Tuple [Integer, JsTypedObject<String,Object /* UnionType */>] */> value);
    @JsProperty(name="_onDoneFns")
    Object get_onDoneFns();
    @JsProperty(name="_onDoneFns")
    void set_onDoneFns(Object value);
    @JsProperty(name="_onStartFns")
    Object get_onStartFns();
    @JsProperty(name="_onStartFns")
    void set_onStartFns(Object value);
    @JsProperty(name="_finished")
    Object get_finished();
    @JsProperty(name="_finished")
    void set_finished(Object value);
    @JsProperty(name="_destroyed")
    Object get_destroyed();
    @JsProperty(name="_destroyed")
    void set_destroyed(Object value);
    @JsProperty(name="_started")
    Object get_started();
    @JsProperty(name="_started")
    void set_started(Object value);
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
    @JsProperty(name="previousStyles")
    JsTypedObject<String,Object /* UnionType */> getPreviousStyles();
    @JsProperty(name="previousStyles")
    void setPreviousStyles(JsTypedObject<String,Object /* UnionType */> value);
    @JsProperty(name="log")
    JsArray<Object> getLog();
    @JsProperty(name="log")
    void setLog(JsArray<Object> value);
    @JsConstructor
    public MockAnimationPlayerImpl(JsTypedObject<String,Object /* UnionType */> /* optional */ startingStyles,Array<JsArray<Object> /* Tuple [Integer, JsTypedObject<String,Object /* UnionType */>] */> /* optional */ keyframes,JsArray<AnimationPlayer> /* optional */ previousPlayers) {}
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
