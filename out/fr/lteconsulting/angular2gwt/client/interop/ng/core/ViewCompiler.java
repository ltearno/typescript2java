package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompilerConfig;
import ng.core.ElementSchemaRegistry;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.TemplateAst;
import ng.core.Expression;
import ng.core.CompilePipeSummary;
import ng.core.AnimationEntryCompileResult;
import ng.core.ViewCompileResult;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\view_compiler.d.ts
  * Package ng.core
  * Name ViewCompiler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ViewCompiler  {
    @JsProperty(name="_genConfig")
    Object get_genConfig();
    @JsProperty(name="_genConfig")
    void set_genConfig(Object value);
    @JsProperty(name="_schemaRegistry")
    Object get_schemaRegistry();
    @JsProperty(name="_schemaRegistry")
    void set_schemaRegistry(Object value);
    @JsConstructor
    public ViewCompiler(CompilerConfig _genConfig,ElementSchemaRegistry _schemaRegistry) {}
     ViewCompileResult compileComponent(CompileDirectiveMetadata component,JsArray<TemplateAst> template,Expression styles,JsArray<CompilePipeSummary> pipes,JsArray<AnimationEntryCompileResult> compiledAnimations);
}
