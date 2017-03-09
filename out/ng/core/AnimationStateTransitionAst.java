package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStateTransitionAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStateTransitionAst extends AnimationStateAst {
    public JsArray<AnimationStateTransitionExpression> stateChanges;
    public AnimationWithStepsAst animation;
    @JsConstructor
    public AnimationStateTransitionAst(JsArray<AnimationStateTransitionExpression> stateChanges,AnimationWithStepsAst animation) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
