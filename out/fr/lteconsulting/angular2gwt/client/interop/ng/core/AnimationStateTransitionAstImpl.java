package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStateTransitionExpression;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationWithStepsAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStateTransitionAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationStateTransitionAst" )
public class AnimationStateTransitionAstImpl extends AnimationStateAst {
    @JsProperty(name="stateChanges")
    JsArray<AnimationStateTransitionExpression> getStateChanges();
    @JsProperty(name="stateChanges")
    void setStateChanges(JsArray<AnimationStateTransitionExpression> value);
    @JsProperty(name="animation")
    AnimationWithStepsAst getAnimation();
    @JsProperty(name="animation")
    void setAnimation(AnimationWithStepsAst value);
    @JsConstructor
    public AnimationStateTransitionAstImpl(JsArray<AnimationStateTransitionExpression> stateChanges,AnimationWithStepsAst animation) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
