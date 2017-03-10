package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ElementSchemaRegistry;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationEntryAst;
import ng.core.CompileAnimationEntryMetadata;
import ng.core.AnimationEntryParseResult;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_parser.d.ts
  * Package ng.core
  * Name AnimationParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationParser" )
public class AnimationParserImpl  {
    @JsProperty(name="_schema")
    Object get_schema();
    @JsProperty(name="_schema")
    void set_schema(Object value);
    @JsConstructor
    public AnimationParserImpl(ElementSchemaRegistry _schema) {}
    public native  JsArray<AnimationEntryAst> parseComponent(CompileDirectiveMetadata component);
    public native  AnimationEntryParseResult parseEntry(CompileAnimationEntryMetadata entry);
}
