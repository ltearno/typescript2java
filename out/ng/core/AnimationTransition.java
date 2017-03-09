package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\core\src\animation\animation_transition.d.ts
  * Package ng.core
  * Name AnimationTransition
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationTransition  {
    public Object _player;
    public Object _fromState;
    public Object _toState;
    public Object _totalTime;
    @JsConstructor
    public AnimationTransition(AnimationPlayer _player,String _fromState,String _toState,int _totalTime) {}
    public native  void _createEvent();
    public native  void onStart(JsFunction1<AnimationTransitionEvent,Object> callback);
    public native  void onDone(JsFunction1<AnimationTransitionEvent,Object> callback);
}
