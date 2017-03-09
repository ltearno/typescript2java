package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStateDeclarationAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStateDeclarationAst extends AnimationStateAst {
    public String stateName;
    public AnimationStylesAst styles;
    @JsConstructor
    public AnimationStateDeclarationAst(String stateName,AnimationStylesAst styles) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
