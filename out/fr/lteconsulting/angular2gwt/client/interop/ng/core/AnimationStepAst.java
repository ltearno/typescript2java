package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AnimationStylesAst;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationKeyframeAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStepAst
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStepAst extends AnimationAst {
    @JsProperty(name="startingStyles")
    AnimationStylesAst getStartingStyles();
    @JsProperty(name="startingStyles")
    void setStartingStyles(AnimationStylesAst value);
    @JsProperty(name="keyframes")
    JsArray<AnimationKeyframeAst> getKeyframes();
    @JsProperty(name="keyframes")
    void setKeyframes(JsArray<AnimationKeyframeAst> value);
    @JsProperty(name="duration")
    int getDuration();
    @JsProperty(name="duration")
    void setDuration(int value);
    @JsProperty(name="delay")
    int getDelay();
    @JsProperty(name="delay")
    void setDelay(int value);
    @JsProperty(name="easing")
    String getEasing();
    @JsProperty(name="easing")
    void setEasing(String value);
    @JsConstructor
    public AnimationStepAst(AnimationStylesAst startingStyles,JsArray<AnimationKeyframeAst> keyframes,int duration,int delay,String easing) {}
     Object visit(AnimationAstVisitor visitor,Object context);
}
