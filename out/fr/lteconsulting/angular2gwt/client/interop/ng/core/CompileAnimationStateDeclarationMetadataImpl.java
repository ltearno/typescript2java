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
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationStateDeclarationMetadata" )
public class CompileAnimationStateDeclarationMetadataImpl extends CompileAnimationStateMetadata {
    @JsProperty(name="stateNameExpr")
    String getStateNameExpr();
    @JsProperty(name="stateNameExpr")
    void setStateNameExpr(String value);
    @JsProperty(name="styles")
    CompileAnimationStyleMetadata getStyles();
    @JsProperty(name="styles")
    void setStyles(CompileAnimationStyleMetadata value);
    @JsConstructor
    public CompileAnimationStateDeclarationMetadataImpl(String stateNameExpr,CompileAnimationStyleMetadata styles) {}
}
