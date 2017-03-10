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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationWithStepsAst extends AnimationAst {
    @JsProperty(name="steps")
    JsArray<AnimationAst> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<AnimationAst> value);
    @JsConstructor
    public AnimationWithStepsAst(JsArray<AnimationAst> steps) {}
}
