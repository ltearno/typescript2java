package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileAnimationStyleMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationStateDeclarationMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileAnimationStateDeclarationMetadata extends CompileAnimationStateMetadata {
    @JsProperty(name="stateNameExpr")
    String getStateNameExpr();
    @JsProperty(name="stateNameExpr")
    void setStateNameExpr(String value);
    @JsProperty(name="styles")
    CompileAnimationStyleMetadata getStyles();
    @JsProperty(name="styles")
    void setStyles(CompileAnimationStyleMetadata value);
    @JsConstructor
    public CompileAnimationStateDeclarationMetadata(String stateNameExpr,CompileAnimationStyleMetadata styles) {}
}
