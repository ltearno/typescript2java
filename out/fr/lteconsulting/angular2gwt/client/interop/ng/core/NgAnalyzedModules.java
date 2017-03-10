package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileNgModuleMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.StaticSymbol;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler.d.ts
  * Package ng.core
  * Name NgAnalyzedModules
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgAnalyzedModules  {
    @JsProperty(name="ngModules")
    JsArray<CompileNgModuleMetadata> ngModules();
    @JsProperty(name="ngModules")
    void ngModules(JsArray<CompileNgModuleMetadata> value);
    @JsProperty(name="ngModuleByPipeOrDirective")
    Map<StaticSymbol,CompileNgModuleMetadata> ngModuleByPipeOrDirective();
    @JsProperty(name="ngModuleByPipeOrDirective")
    void ngModuleByPipeOrDirective(Map<StaticSymbol,CompileNgModuleMetadata> value);
    @JsProperty(name="files")
    Array</* TypeLiteral */ Object> files();
    @JsProperty(name="files")
    void files(Array</* TypeLiteral */ Object> value);
    /* optional property symbolsMissingModule*/    @JsProperty(name="symbolsMissingModule")
    JsArray<StaticSymbol> symbolsMissingModule();
    @JsProperty(name="symbolsMissingModule")
    void symbolsMissingModule(JsArray<StaticSymbol> value);
}
