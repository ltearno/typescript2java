package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompilePipeMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompilePipeMetadata  {
    public CompileTypeMetadata type;
    public String name;
    public boolean pure;
    @JsConstructor
    public CompilePipeMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompilePipeSummary toSummary();
}
