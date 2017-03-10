package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTypeMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompilePipeSummary
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompilePipeSummary extends CompileTypeSummary {
    @JsProperty(name="type")
    CompileTypeMetadata type();
    @JsProperty(name="type")
    void type(CompileTypeMetadata value);
    @JsProperty(name="name")
    String name();
    @JsProperty(name="name")
    void name(String value);
    @JsProperty(name="pure")
    boolean pure();
    @JsProperty(name="pure")
    void pure(boolean value);
}
