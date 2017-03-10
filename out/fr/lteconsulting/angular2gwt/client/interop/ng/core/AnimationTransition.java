package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationPlayer;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.AnimationTransitionEvent;

/**
  * Generated from tests\@angular\core\src\animation\animation_transition.d.ts
  * Package ng.core
  * Name AnimationTransition
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationTransition  {
    @JsProperty(name="_player")
    Object get_player();
    @JsProperty(name="_player")
    void set_player(Object value);
    @JsProperty(name="_fromState")
    Object get_fromState();
    @JsProperty(name="_fromState")
    void set_fromState(Object value);
    @JsProperty(name="_toState")
    Object get_toState();
    @JsProperty(name="_toState")
    void set_toState(Object value);
    @JsProperty(name="_totalTime")
    Object get_totalTime();
    @JsProperty(name="_totalTime")
    void set_totalTime(Object value);
    @JsConstructor
    public AnimationTransition(AnimationPlayer _player,String _fromState,String _toState,int _totalTime) {}
     void _createEvent();
     void onStart(JsFunction1<AnimationTransitionEvent,Object> callback);
     void onDone(JsFunction1<AnimationTransitionEvent,Object> callback);
}
