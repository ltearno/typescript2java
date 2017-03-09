package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.AnimationPlayer;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\platform-browser\src\dom\web_animations_player.d.ts
  * Package ng.platformBrowser
  * Name WebAnimationsPlayer
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class WebAnimationsPlayer extends AnimationPlayer {
    public Object element;
    public JsArray<JsTypedObject<String,Object /* UnionType */>> keyframes;
    public JsTypedObject<String,Object /* UnionType */> options;
    public Object _onDoneFns;
    public Object _onStartFns;
    public Object _player;
    public Object _duration;
    public Object _initialized;
    public Object _finished;
    public Object _started;
    public Object _destroyed;
    public Object _finalKeyframe;
    public AnimationPlayer parentPlayer;
    public JsTypedObject<String,Object /* UnionType */> previousStyles;
    @JsConstructor
    public WebAnimationsPlayer(Object element,JsArray<JsTypedObject<String,Object /* UnionType */>> keyframes,JsTypedObject<String,Object /* UnionType */> options,JsArray<WebAnimationsPlayer> /* optional */ previousPlayers) {}
    public native  void _onFinish();
    public native  void init();
    public DomAnimatePlayer domPlayer;
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
    public int totalTime;
    public native  void setPosition(int p);
    public native  int getPosition();
    public native  void _captureStyles();
}
