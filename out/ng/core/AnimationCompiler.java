package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_compiler.d.ts
  * Package ng.core
  * Name AnimationCompiler
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationCompiler  {
    public native  JsArray<AnimationEntryCompileResult> compile(String factoryNamePrefix,JsArray<AnimationEntryAst> parsedAnimations);
}
