package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationAst;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationWithStepsAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationWithStepsAst" )
public abstract class AnimationWithStepsAstImpl extends AnimationAst {
    @JsProperty(name="steps")
    JsArray<AnimationAst> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<AnimationAst> value);
    @JsConstructor
    public AnimationWithStepsAstImpl(JsArray<AnimationAst> steps) {}
}
