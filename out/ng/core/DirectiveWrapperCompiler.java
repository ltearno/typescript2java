package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\directive_wrapper_compiler.d.ts
  * Package ng.core
  * Name DirectiveWrapperCompiler
  * We generate directive wrappers to prevent code bloat when a directive is used.
  * A directive wrapper encapsulates
  * the dirty checking for `@Input`, the handling of `@HostListener` / `@HostBinding`
  * and calling the lifecyclehooks `ngOnInit`, `ngOnChanges`, `ngDoCheck`.
  * 
  * So far, only `@Input` and the lifecycle hooks have been implemented.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DirectiveWrapperCompiler  {
    public Object compilerConfig;
    public Object _exprParser;
    public Object _schemaRegistry;
    public Object _console;
    public static native  String dirWrapperClassName(CompileIdentifierMetadata id);
    @JsConstructor
    public DirectiveWrapperCompiler(CompilerConfig compilerConfig,Parser _exprParser,ElementSchemaRegistry _schemaRegistry,Console _console) {}
    public native  DirectiveWrapperCompileResult compile(CompileDirectiveMetadata dirMeta);
}
