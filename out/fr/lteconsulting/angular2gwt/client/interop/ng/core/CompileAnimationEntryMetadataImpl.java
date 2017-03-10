package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileAnimationStateMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationEntryMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationEntryMetadata" )
public class CompileAnimationEntryMetadataImpl  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="definitions")
    JsArray<CompileAnimationStateMetadata> getDefinitions();
    @JsProperty(name="definitions")
    void setDefinitions(JsArray<CompileAnimationStateMetadata> value);
    @JsConstructor
    public CompileAnimationEntryMetadataImpl(String /* optional */ name,JsArray<CompileAnimationStateMetadata> /* optional */ definitions) {}
}
