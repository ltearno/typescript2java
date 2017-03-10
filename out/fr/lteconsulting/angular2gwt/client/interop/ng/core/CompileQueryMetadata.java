package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTokenMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileQueryMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileQueryMetadata  {
    @JsProperty(name="selectors")
    Array<CompileTokenMetadata> selectors();
    @JsProperty(name="selectors")
    void selectors(Array<CompileTokenMetadata> value);
    @JsProperty(name="descendants")
    boolean descendants();
    @JsProperty(name="descendants")
    void descendants(boolean value);
    @JsProperty(name="first")
    boolean first();
    @JsProperty(name="first")
    void first(boolean value);
    @JsProperty(name="propertyName")
    String propertyName();
    @JsProperty(name="propertyName")
    void propertyName(String value);
    @JsProperty(name="read")
    CompileTokenMetadata read();
    @JsProperty(name="read")
    void read(CompileTokenMetadata value);
}
