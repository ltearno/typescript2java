package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationKeyframeAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationKeyframeAst extends AnimationAst {
    public int offset;
    public AnimationStylesAst styles;
    @JsConstructor
    public AnimationKeyframeAst(int offset,AnimationStylesAst styles) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
