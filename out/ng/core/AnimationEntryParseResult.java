package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_parser.d.ts
  * Package ng.core
  * Name AnimationEntryParseResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationEntryParseResult  {
    public AnimationEntryAst ast;
    public JsArray<AnimationParseError> errors;
    @JsConstructor
    public AnimationEntryParseResult(AnimationEntryAst ast,JsArray<AnimationParseError> errors) {}
}
