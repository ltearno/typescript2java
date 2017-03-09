package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStepAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStepAst extends AnimationAst {
    public AnimationStylesAst startingStyles;
    public JsArray<AnimationKeyframeAst> keyframes;
    public int duration;
    public int delay;
    public String easing;
    @JsConstructor
    public AnimationStepAst(AnimationStylesAst startingStyles,JsArray<AnimationKeyframeAst> keyframes,int duration,int delay,String easing) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
