package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationPlayer;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\animation\animation_sequence_player.d.ts
  * Package ng.core
  * Name AnimationSequencePlayer
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationSequencePlayer" )
public class AnimationSequencePlayerImpl extends AnimationPlayer {
    @JsProperty(name="_players")
    Object get_players();
    @JsProperty(name="_players")
    void set_players(Object value);
    @JsProperty(name="_currentIndex")
    Object get_currentIndex();
    @JsProperty(name="_currentIndex")
    void set_currentIndex(Object value);
    @JsProperty(name="_activePlayer")
    Object get_activePlayer();
    @JsProperty(name="_activePlayer")
    void set_activePlayer(Object value);
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
    @JsProperty(name="_started")
    Object get_started();
    @JsProperty(name="_started")
    void set_started(Object value);
    @JsProperty(name="_destroyed")
    Object get_destroyed();
    @JsProperty(name="_destroyed")
    void set_destroyed(Object value);
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
    @JsConstructor
    public AnimationSequencePlayerImpl(JsArray<AnimationPlayer> _players) {}
    public native  void _onNext();
    public native  void _onFinish();
    public native  void init();
    public native  void onStart(JsFunction<Void> fn);
    public native  void onDone(JsFunction<Void> fn);
    public native  boolean hasStarted();
    public native  void play();
    public native  void pause();
    public native  void restart();
    public native  void reset();
    public native  void finish();
    public native  void destroy();
    public native  void setPosition(int p);
    public native  int getPosition();
    @JsProperty(name="players")
    JsArray<AnimationPlayer> getPlayers();
    @JsProperty(name="players")
    void setPlayers(JsArray<AnimationPlayer> value);
}
