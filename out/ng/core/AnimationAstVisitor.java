package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationAstVisitor
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class AnimationAstVisitor  {
    public native  Object visitAnimationEntry(AnimationEntryAst ast,Object context);
    public native  Object visitAnimationStateDeclaration(AnimationStateDeclarationAst ast,Object context);
    public native  Object visitAnimationStateTransition(AnimationStateTransitionAst ast,Object context);
    public native  Object visitAnimationStep(AnimationStepAst ast,Object context);
    public native  Object visitAnimationSequence(AnimationSequenceAst ast,Object context);
    public native  Object visitAnimationGroup(AnimationGroupAst ast,Object context);
    public native  Object visitAnimationKeyframe(AnimationKeyframeAst ast,Object context);
    public native  Object visitAnimationStyles(AnimationStylesAst ast,Object context);
}
