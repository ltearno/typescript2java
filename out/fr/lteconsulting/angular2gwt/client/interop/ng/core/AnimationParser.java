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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationParser  {
    @JsProperty(name="_schema")
    Object get_schema();
    @JsProperty(name="_schema")
    void set_schema(Object value);
    @JsConstructor
    public AnimationParser(ElementSchemaRegistry _schema) {}
     JsArray<AnimationEntryAst> parseComponent(CompileDirectiveMetadata component);
     AnimationEntryParseResult parseEntry(CompileAnimationEntryMetadata entry);
}
