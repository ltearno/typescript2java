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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationGroupAst extends AnimationWithStepsAst {
    @JsConstructor
    public AnimationGroupAst(JsArray<AnimationAst> steps) {}
     Object visit(AnimationAstVisitor visitor,Object context);
}
