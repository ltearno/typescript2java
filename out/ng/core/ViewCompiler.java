package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\view_compiler.d.ts
  * Package ng.core
  * Name ViewCompiler
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ViewCompiler  {
    public Object _genConfig;
    public Object _schemaRegistry;
    @JsConstructor
    public ViewCompiler(CompilerConfig _genConfig,ElementSchemaRegistry _schemaRegistry) {}
    public native  ViewCompileResult compileComponent(CompileDirectiveMetadata component,JsArray<TemplateAst> template,Expression styles,JsArray<CompilePipeSummary> pipes,JsArray<AnimationEntryCompileResult> compiledAnimations);
}
