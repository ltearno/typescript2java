package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\animation_transition_event.d.ts
  * Package ng.core
  * Name AnimationTransitionEvent
  * An instance of this class is returned as an event parameter when an animation
  * callback is captured for an animation either during the start or done phase.
  * 
  * ```typescript
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationTransitionEvent  {
    public String fromState;
    public String toState;
    public int totalTime;
    public String phaseName;
    @JsConstructor
    public AnimationTransitionEvent(/* TypeLiteral */ Object undefined) {}
}
