package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AnimationEntryAst;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationParseError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_parser.d.ts
  * Package ng.core
  * Name AnimationEntryParseResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationEntryParseResult  {
    @JsProperty(name="ast")
    AnimationEntryAst getAst();
    @JsProperty(name="ast")
    void setAst(AnimationEntryAst value);
    @JsProperty(name="errors")
    JsArray<AnimationParseError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<AnimationParseError> value);
    @JsConstructor
    public AnimationEntryParseResult(AnimationEntryAst ast,JsArray<AnimationParseError> errors) {}
}
