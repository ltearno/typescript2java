package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSManipulationEvent
  * Typescript fqn MSManipulationEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSManipulationEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="currentState")
    Number getCurrentState();

    @JsProperty(name="currentState")
    void setCurrentState(Number value);

    @JsProperty(name="inertiaDestinationX")
    Number getInertiaDestinationX();

    @JsProperty(name="inertiaDestinationX")
    void setInertiaDestinationX(Number value);

    @JsProperty(name="inertiaDestinationY")
    Number getInertiaDestinationY();

    @JsProperty(name="inertiaDestinationY")
    void setInertiaDestinationY(Number value);

    @JsProperty(name="lastState")
    Number getLastState();

    @JsProperty(name="lastState")
    void setLastState(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_ACTIVE")
    Number getMS_MANIPULATION_STATE_ACTIVE();

    @JsProperty(name="MS_MANIPULATION_STATE_ACTIVE")
    void setMS_MANIPULATION_STATE_ACTIVE(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_CANCELLED")
    Number getMS_MANIPULATION_STATE_CANCELLED();

    @JsProperty(name="MS_MANIPULATION_STATE_CANCELLED")
    void setMS_MANIPULATION_STATE_CANCELLED(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_COMMITTED")
    Number getMS_MANIPULATION_STATE_COMMITTED();

    @JsProperty(name="MS_MANIPULATION_STATE_COMMITTED")
    void setMS_MANIPULATION_STATE_COMMITTED(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_DRAGGING")
    Number getMS_MANIPULATION_STATE_DRAGGING();

    @JsProperty(name="MS_MANIPULATION_STATE_DRAGGING")
    void setMS_MANIPULATION_STATE_DRAGGING(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_INERTIA")
    Number getMS_MANIPULATION_STATE_INERTIA();

    @JsProperty(name="MS_MANIPULATION_STATE_INERTIA")
    void setMS_MANIPULATION_STATE_INERTIA(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_PRESELECT")
    Number getMS_MANIPULATION_STATE_PRESELECT();

    @JsProperty(name="MS_MANIPULATION_STATE_PRESELECT")
    void setMS_MANIPULATION_STATE_PRESELECT(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_SELECTING")
    Number getMS_MANIPULATION_STATE_SELECTING();

    @JsProperty(name="MS_MANIPULATION_STATE_SELECTING")
    void setMS_MANIPULATION_STATE_SELECTING(Number value);

    @JsProperty(name="MS_MANIPULATION_STATE_STOPPED")
    Number getMS_MANIPULATION_STATE_STOPPED();

    @JsProperty(name="MS_MANIPULATION_STATE_STOPPED")
    void setMS_MANIPULATION_STATE_STOPPED(Number value);

    void initMSManipulationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number lastState, Number currentState);
}
