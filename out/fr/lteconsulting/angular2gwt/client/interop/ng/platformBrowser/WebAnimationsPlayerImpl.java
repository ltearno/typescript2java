package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.AnimationPlayer;
import ng.platformBrowser.WebAnimationsPlayer;
import jsinterop.annotations.JsConstructor;
import ng.platformBrowser.DomAnimatePlayer;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\platform-browser\src\dom\web_animations_player.d.ts
  * Package ng.platformBrowser
  * Name WebAnimationsPlayer
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="WebAnimationsPlayer" )
public class WebAnimationsPlayerImpl extends AnimationPlayer {
    @JsProperty(name="element")
    Object getElement();
    @JsProperty(name="element")
    void setElement(Object value);
    @JsProperty(name="keyframes")
    JsArray<JsTypedObject<String,Object /* UnionType */>> getKeyframes();
    @JsProperty(name="keyframes")
    void setKeyframes(JsArray<JsTypedObject<String,Object /* UnionType */>> value);
    @JsProperty(name="options")
    JsTypedObject<String,Object /* UnionType */> getOptions();
    @JsProperty(name="options")
    void setOptions(JsTypedObject<String,Object /* UnionType */> value);
    @JsProperty(name="_onDoneFns")
    Object get_onDoneFns();
    @JsProperty(name="_onDoneFns")
    void set_onDoneFns(Object value);
    @JsProperty(name="_onStartFns")
    Object get_onStartFns();
    @JsProperty(name="_onStartFns")
    void set_onStartFns(Object value);
    @JsProperty(name="_player")
    Object get_player();
    @JsProperty(name="_player")
    void set_player(Object value);
    @JsProperty(name="_duration")
    Object get_duration();
    @JsProperty(name="_duration")
    void set_duration(Object value);
    @JsProperty(name="_initialized")
    Object get_initialized();
    @JsProperty(name="_initialized")
    void set_initialized(Object value);
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
    @JsProperty(name="_finalKeyframe")
    Object get_finalKeyframe();
    @JsProperty(name="_finalKeyframe")
    void set_finalKeyframe(Object value);
    @JsProperty(name="parentPlayer")
    AnimationPlayer getParentPlayer();
    @JsProperty(name="parentPlayer")
    void setParentPlayer(AnimationPlayer value);
    @JsProperty(name="previousStyles")
    JsTypedObject<String,Object /* UnionType */> getPreviousStyles();
    @JsProperty(name="previousStyles")
    void setPreviousStyles(JsTypedObject<String,Object /* UnionType */> value);
    @JsConstructor
    public WebAnimationsPlayerImpl(Object element,JsArray<JsTypedObject<String,Object /* UnionType */>> keyframes,JsTypedObject<String,Object /* UnionType */> options,JsArray<WebAnimationsPlayer> /* optional */ previousPlayers) {}
    public native  void _onFinish();
    public native  void init();
    @JsProperty(name="domPlayer")
    DomAnimatePlayer getDomPlayer();
    @JsProperty(name="domPlayer")
    void setDomPlayer(DomAnimatePlayer value);
    public native  void onStart(JsFunction<Void> fn);
    public native  void onDone(JsFunction<Void> fn);
    public native  void play();
    public native  void pause();
    public native  void finish();
    public native  void reset();
    public native  void _resetDomPlayerState();
    public native  void restart();
    public native  boolean hasStarted();
    public native  void destroy();
    @JsProperty(name="totalTime")
    int getTotalTime();
    @JsProperty(name="totalTime")
    void setTotalTime(int value);
    public native  void setPosition(int p);
    public native  int getPosition();
    public native  void _captureStyles();
}
