package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileDiDependencyMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileTypeMetadata
  * Metadata regarding compilation of a type.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileTypeMetadata extends CompileIdentifierMetadata {
    @JsProperty(name="diDeps")
    JsArray<CompileDiDependencyMetadata> diDeps();
    @JsProperty(name="diDeps")
    void diDeps(JsArray<CompileDiDependencyMetadata> value);
    @JsProperty(name="lifecycleHooks")
    JsArray</* ng.core.LifecycleHooks */ int> lifecycleHooks();
    @JsProperty(name="lifecycleHooks")
    void lifecycleHooks(JsArray</* ng.core.LifecycleHooks */ int> value);
    @JsProperty(name="reference")
    Object reference();
    @JsProperty(name="reference")
    void reference(Object value);
}
