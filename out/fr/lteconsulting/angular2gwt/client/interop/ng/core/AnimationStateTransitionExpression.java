package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStateTransitionExpression
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStateTransitionExpression  {
    @JsProperty(name="fromState")
    String getFromState();
    @JsProperty(name="fromState")
    void setFromState(String value);
    @JsProperty(name="toState")
    String getToState();
    @JsProperty(name="toState")
    void setToState(String value);
    @JsConstructor
    public AnimationStateTransitionExpression(String fromState,String toState) {}
}
