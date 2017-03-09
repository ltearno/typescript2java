package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationGroupAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationGroupAst extends AnimationWithStepsAst {
    @JsConstructor
    public AnimationGroupAst(JsArray<AnimationAst> steps) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}