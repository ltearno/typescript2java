package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_parser.d.ts
  * Package ng.core
  * Name AnimationParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationParser  {
    public Object _schema;
    @JsConstructor
    public AnimationParser(ElementSchemaRegistry _schema) {}
    public native  JsArray<AnimationEntryAst> parseComponent(CompileDirectiveMetadata component);
    public native  AnimationEntryParseResult parseEntry(CompileAnimationEntryMetadata entry);
}
