package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileDiDependencyMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileFactoryMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileFactoryMetadata extends CompileIdentifierMetadata {
    @JsProperty(name="diDeps")
    JsArray<CompileDiDependencyMetadata> diDeps();
    @JsProperty(name="diDeps")
    void diDeps(JsArray<CompileDiDependencyMetadata> value);
    @JsProperty(name="reference")
    Object reference();
    @JsProperty(name="reference")
    void reference(Object value);
}
