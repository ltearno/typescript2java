package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTypeMetadata;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileIdentifierMetadata;
import ng.core.CompileProviderMetadata;
import ng.core.CompileNgModuleSummary;
import ng.core.SchemaMetadata;
import ng.core.TransitiveCompileNgModuleMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileNgModuleMetadata
  * Metadata regarding compilation of a module.
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileNgModuleMetadata" )
public class CompileNgModuleMetadataImpl  {
    @JsProperty(name="type")
    CompileTypeMetadata getType();
    @JsProperty(name="type")
    void setType(CompileTypeMetadata value);
    @JsProperty(name="declaredDirectives")
    JsArray<CompileIdentifierMetadata> getDeclaredDirectives();
    @JsProperty(name="declaredDirectives")
    void setDeclaredDirectives(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="exportedDirectives")
    JsArray<CompileIdentifierMetadata> getExportedDirectives();
    @JsProperty(name="exportedDirectives")
    void setExportedDirectives(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="declaredPipes")
    JsArray<CompileIdentifierMetadata> getDeclaredPipes();
    @JsProperty(name="declaredPipes")
    void setDeclaredPipes(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="exportedPipes")
    JsArray<CompileIdentifierMetadata> getExportedPipes();
    @JsProperty(name="exportedPipes")
    void setExportedPipes(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="entryComponents")
    JsArray<CompileIdentifierMetadata> getEntryComponents();
    @JsProperty(name="entryComponents")
    void setEntryComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="bootstrapComponents")
    JsArray<CompileIdentifierMetadata> getBootstrapComponents();
    @JsProperty(name="bootstrapComponents")
    void setBootstrapComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="providers")
    JsArray<CompileProviderMetadata> getProviders();
    @JsProperty(name="providers")
    void setProviders(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="importedModules")
    JsArray<CompileNgModuleSummary> getImportedModules();
    @JsProperty(name="importedModules")
    void setImportedModules(JsArray<CompileNgModuleSummary> value);
    @JsProperty(name="exportedModules")
    JsArray<CompileNgModuleSummary> getExportedModules();
    @JsProperty(name="exportedModules")
    void setExportedModules(JsArray<CompileNgModuleSummary> value);
    @JsProperty(name="schemas")
    JsArray<SchemaMetadata> getSchemas();
    @JsProperty(name="schemas")
    void setSchemas(JsArray<SchemaMetadata> value);
    @JsProperty(name="id")
    String getId();
    @JsProperty(name="id")
    void setId(String value);
    @JsProperty(name="transitiveModule")
    TransitiveCompileNgModuleMetadata getTransitiveModule();
    @JsProperty(name="transitiveModule")
    void setTransitiveModule(TransitiveCompileNgModuleMetadata value);
    @JsConstructor
    public CompileNgModuleMetadataImpl(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompileNgModuleSummary toSummary();
}
