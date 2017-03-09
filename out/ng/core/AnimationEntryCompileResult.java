package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_compiler.d.ts
  * Package ng.core
  * Name AnimationEntryCompileResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationEntryCompileResult  {
    public String name;
    public JsArray<Statement> statements;
    public Expression fnExp;
    @JsConstructor
    public AnimationEntryCompileResult(String name,JsArray<Statement> statements,Expression fnExp) {}
}
