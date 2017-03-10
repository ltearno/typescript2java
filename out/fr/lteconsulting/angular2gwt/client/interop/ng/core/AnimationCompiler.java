package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationEntryAst;
import ng.core.AnimationEntryCompileResult;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_compiler.d.ts
  * Package ng.core
  * Name AnimationCompiler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationCompiler  {
     JsArray<AnimationEntryCompileResult> compile(String factoryNamePrefix,JsArray<AnimationEntryAst> parsedAnimations);
}
