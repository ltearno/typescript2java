package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AnimationEntryAst;
import ng.core.AnimationStateDeclarationAst;
import ng.core.AnimationStateTransitionAst;
import ng.core.AnimationStepAst;
import ng.core.AnimationSequenceAst;
import ng.core.AnimationGroupAst;
import ng.core.AnimationKeyframeAst;
import ng.core.AnimationStylesAst;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationAstVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationAstVisitor  {
     Object visitAnimationEntry(AnimationEntryAst ast,Object context);
     Object visitAnimationStateDeclaration(AnimationStateDeclarationAst ast,Object context);
     Object visitAnimationStateTransition(AnimationStateTransitionAst ast,Object context);
     Object visitAnimationStep(AnimationStepAst ast,Object context);
     Object visitAnimationSequence(AnimationSequenceAst ast,Object context);
     Object visitAnimationGroup(AnimationGroupAst ast,Object context);
     Object visitAnimationKeyframe(AnimationKeyframeAst ast,Object context);
     Object visitAnimationStyles(AnimationStylesAst ast,Object context);
}
