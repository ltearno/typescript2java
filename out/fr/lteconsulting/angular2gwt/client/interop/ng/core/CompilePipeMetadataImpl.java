package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTypeMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.CompilePipeSummary;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompilePipeMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompilePipeMetadata" )
public class CompilePipeMetadataImpl  {
    @JsProperty(name="type")
    CompileTypeMetadata getType();
    @JsProperty(name="type")
    void setType(CompileTypeMetadata value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="pure")
    boolean getPure();
    @JsProperty(name="pure")
    void setPure(boolean value);
    @JsConstructor
    public CompilePipeMetadataImpl(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompilePipeSummary toSummary();
}
