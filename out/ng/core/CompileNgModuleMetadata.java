package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileNgModuleMetadata
  * Metadata regarding compilation of a module.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileNgModuleMetadata  {
    public CompileTypeMetadata type;
    public JsArray<CompileIdentifierMetadata> declaredDirectives;
    public JsArray<CompileIdentifierMetadata> exportedDirectives;
    public JsArray<CompileIdentifierMetadata> declaredPipes;
    public JsArray<CompileIdentifierMetadata> exportedPipes;
    public JsArray<CompileIdentifierMetadata> entryComponents;
    public JsArray<CompileIdentifierMetadata> bootstrapComponents;
    public JsArray<CompileProviderMetadata> providers;
    public JsArray<CompileNgModuleSummary> importedModules;
    public JsArray<CompileNgModuleSummary> exportedModules;
    public JsArray<SchemaMetadata> schemas;
    public String id;
    public TransitiveCompileNgModuleMetadata transitiveModule;
    @JsConstructor
    public CompileNgModuleMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompileNgModuleSummary toSummary();
}
