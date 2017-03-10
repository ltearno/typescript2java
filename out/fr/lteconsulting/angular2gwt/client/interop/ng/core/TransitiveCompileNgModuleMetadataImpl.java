package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileIdentifierMetadata;
import ng.core.CompileTypeMetadata;
import ng.core.CompileProviderMetadata;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name TransitiveCompileNgModuleMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TransitiveCompileNgModuleMetadata" )
public class TransitiveCompileNgModuleMetadataImpl  {
    @JsProperty(name="directivesSet")
    Set<Object> getDirectivesSet();
    @JsProperty(name="directivesSet")
    void setDirectivesSet(Set<Object> value);
    @JsProperty(name="directives")
    JsArray<CompileIdentifierMetadata> getDirectives();
    @JsProperty(name="directives")
    void setDirectives(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="exportedDirectivesSet")
    Set<Object> getExportedDirectivesSet();
    @JsProperty(name="exportedDirectivesSet")
    void setExportedDirectivesSet(Set<Object> value);
    @JsProperty(name="exportedDirectives")
    JsArray<CompileIdentifierMetadata> getExportedDirectives();
    @JsProperty(name="exportedDirectives")
    void setExportedDirectives(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="pipesSet")
    Set<Object> getPipesSet();
    @JsProperty(name="pipesSet")
    void setPipesSet(Set<Object> value);
    @JsProperty(name="pipes")
    JsArray<CompileIdentifierMetadata> getPipes();
    @JsProperty(name="pipes")
    void setPipes(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="exportedPipesSet")
    Set<Object> getExportedPipesSet();
    @JsProperty(name="exportedPipesSet")
    void setExportedPipesSet(Set<Object> value);
    @JsProperty(name="exportedPipes")
    JsArray<CompileIdentifierMetadata> getExportedPipes();
    @JsProperty(name="exportedPipes")
    void setExportedPipes(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="modulesSet")
    Set<Object> getModulesSet();
    @JsProperty(name="modulesSet")
    void setModulesSet(Set<Object> value);
    @JsProperty(name="modules")
    JsArray<CompileTypeMetadata> getModules();
    @JsProperty(name="modules")
    void setModules(JsArray<CompileTypeMetadata> value);
    @JsProperty(name="entryComponentsSet")
    Set<Object> getEntryComponentsSet();
    @JsProperty(name="entryComponentsSet")
    void setEntryComponentsSet(Set<Object> value);
    @JsProperty(name="entryComponents")
    JsArray<CompileIdentifierMetadata> getEntryComponents();
    @JsProperty(name="entryComponents")
    void setEntryComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="providers")
    JsArray</* TypeLiteral */ Object> getProviders();
    @JsProperty(name="providers")
    void setProviders(JsArray</* TypeLiteral */ Object> value);
    public native  void addProvider(CompileProviderMetadata provider,CompileIdentifierMetadata module);
    public native  void addDirective(CompileIdentifierMetadata id);
    public native  void addExportedDirective(CompileIdentifierMetadata id);
    public native  void addPipe(CompileIdentifierMetadata id);
    public native  void addExportedPipe(CompileIdentifierMetadata id);
    public native  void addModule(CompileTypeMetadata id);
    public native  void addEntryComponent(CompileIdentifierMetadata id);
}
