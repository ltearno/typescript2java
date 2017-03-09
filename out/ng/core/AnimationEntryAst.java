package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationEntryAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationEntryAst extends AnimationAst {
    public String name;
    public JsArray<AnimationStateDeclarationAst> stateDeclarations;
    public JsArray<AnimationStateTransitionAst> stateTransitions;
    @JsConstructor
    public AnimationEntryAst(String name,JsArray<AnimationStateDeclarationAst> stateDeclarations,JsArray<AnimationStateTransitionAst> stateTransitions) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
