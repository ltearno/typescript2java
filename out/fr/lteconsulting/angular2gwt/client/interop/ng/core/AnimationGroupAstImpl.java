package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationGroupAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationGroupAst" )
public class AnimationGroupAstImpl extends AnimationWithStepsAst {
    @JsConstructor
    public AnimationGroupAstImpl(JsArray<AnimationAst> steps) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
