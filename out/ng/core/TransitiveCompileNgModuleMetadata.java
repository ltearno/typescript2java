package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name TransitiveCompileNgModuleMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TransitiveCompileNgModuleMetadata  {
    public Set<Object> directivesSet;
    public JsArray<CompileIdentifierMetadata> directives;
    public Set<Object> exportedDirectivesSet;
    public JsArray<CompileIdentifierMetadata> exportedDirectives;
    public Set<Object> pipesSet;
    public JsArray<CompileIdentifierMetadata> pipes;
    public Set<Object> exportedPipesSet;
    public JsArray<CompileIdentifierMetadata> exportedPipes;
    public Set<Object> modulesSet;
    public JsArray<CompileTypeMetadata> modules;
    public Set<Object> entryComponentsSet;
    public JsArray<CompileIdentifierMetadata> entryComponents;
    public JsArray</* TypeLiteral */ Object> providers;
    public native  void addProvider(CompileProviderMetadata provider,CompileIdentifierMetadata module);
    public native  void addDirective(CompileIdentifierMetadata id);
    public native  void addExportedDirective(CompileIdentifierMetadata id);
    public native  void addPipe(CompileIdentifierMetadata id);
    public native  void addExportedPipe(CompileIdentifierMetadata id);
    public native  void addModule(CompileTypeMetadata id);
    public native  void addEntryComponent(CompileIdentifierMetadata id);
}
