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
@JsType( isNative=true, namespace="ng.core", name="AnimationStateTransitionExpression" )
public class AnimationStateTransitionExpressionImpl  {
    @JsProperty(name="fromState")
    String getFromState();
    @JsProperty(name="fromState")
    void setFromState(String value);
    @JsProperty(name="toState")
    String getToState();
    @JsProperty(name="toState")
    void setToState(String value);
    @JsConstructor
    public AnimationStateTransitionExpressionImpl(String fromState,String toState) {}
}
