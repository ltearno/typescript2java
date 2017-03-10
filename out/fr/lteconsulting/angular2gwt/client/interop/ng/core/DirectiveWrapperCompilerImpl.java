package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileIdentifierMetadata;
import ng.core.CompilerConfig;
import ng.core.Parser;
import ng.core.ElementSchemaRegistry;
import ng.core.Console;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import ng.core.DirectiveWrapperCompileResult;

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
@JsType( isNative=true, namespace="ng.core", name="DirectiveWrapperCompiler" )
public class DirectiveWrapperCompilerImpl  {
    @JsProperty(name="compilerConfig")
    Object getCompilerConfig();
    @JsProperty(name="compilerConfig")
    void setCompilerConfig(Object value);
    @JsProperty(name="_exprParser")
    Object get_exprParser();
    @JsProperty(name="_exprParser")
    void set_exprParser(Object value);
    @JsProperty(name="_schemaRegistry")
    Object get_schemaRegistry();
    @JsProperty(name="_schemaRegistry")
    void set_schemaRegistry(Object value);
    @JsProperty(name="_console")
    Object get_console();
    @JsProperty(name="_console")
    void set_console(Object value);
    public static native  String dirWrapperClassName(CompileIdentifierMetadata id);
    @JsConstructor
    public DirectiveWrapperCompilerImpl(CompilerConfig compilerConfig,Parser _exprParser,ElementSchemaRegistry _schemaRegistry,Console _console) {}
    public native  DirectiveWrapperCompileResult compile(CompileDirectiveMetadata dirMeta);
}
