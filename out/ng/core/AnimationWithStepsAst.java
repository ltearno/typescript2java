package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationWithStepsAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface AnimationWithStepsAst extends AnimationAst {
    @JsProperty(name="steps")
    JsArray<AnimationAst> steps();
    @JsProperty(name="steps")
    void steps(JsArray<AnimationAst> value);
    @JsConstructor
    public AnimationWithStepsAst(JsArray<AnimationAst> steps) {}
}
