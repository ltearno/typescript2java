package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.core", name="AnimationTransitionEvent" )
public class AnimationTransitionEventImpl  {
    @JsProperty(name="fromState")
    String getFromState();
    @JsProperty(name="fromState")
    void setFromState(String value);
    @JsProperty(name="toState")
    String getToState();
    @JsProperty(name="toState")
    void setToState(String value);
    @JsProperty(name="totalTime")
    int getTotalTime();
    @JsProperty(name="totalTime")
    void setTotalTime(int value);
    @JsProperty(name="phaseName")
    String getPhaseName();
    @JsProperty(name="phaseName")
    void setPhaseName(String value);
    @JsConstructor
    public AnimationTransitionEventImpl(/* TypeLiteral */ Object undefined) {}
}
