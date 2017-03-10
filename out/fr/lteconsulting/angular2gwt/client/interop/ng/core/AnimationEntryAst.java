package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStateDeclarationAst;
import ng.core.AnimationStateTransitionAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationEntryAst
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationEntryAst extends AnimationAst {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="stateDeclarations")
    JsArray<AnimationStateDeclarationAst> getStateDeclarations();
    @JsProperty(name="stateDeclarations")
    void setStateDeclarations(JsArray<AnimationStateDeclarationAst> value);
    @JsProperty(name="stateTransitions")
    JsArray<AnimationStateTransitionAst> getStateTransitions();
    @JsProperty(name="stateTransitions")
    void setStateTransitions(JsArray<AnimationStateTransitionAst> value);
    @JsConstructor
    public AnimationEntryAst(String name,JsArray<AnimationStateDeclarationAst> stateDeclarations,JsArray<AnimationStateTransitionAst> stateTransitions) {}
     Object visit(AnimationAstVisitor visitor,Object context);
}
