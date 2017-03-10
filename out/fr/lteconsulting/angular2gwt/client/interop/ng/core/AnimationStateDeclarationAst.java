package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationStylesAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStateDeclarationAst
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStateDeclarationAst extends AnimationStateAst {
    @JsProperty(name="stateName")
    String getStateName();
    @JsProperty(name="stateName")
    void setStateName(String value);
    @JsProperty(name="styles")
    AnimationStylesAst getStyles();
    @JsProperty(name="styles")
    void setStyles(AnimationStylesAst value);
    @JsConstructor
    public AnimationStateDeclarationAst(String stateName,AnimationStylesAst styles) {}
     Object visit(AnimationAstVisitor visitor,Object context);
}
