package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import ng.core.CompileMetadataResolver;
import ng.core.TemplateParser;
import ng.core.StyleCompiler;
import ng.core.ViewCompiler;
import ng.core.NgModuleCompiler;
import ng.core.DirectiveWrapperCompiler;
import ng.core.CompilerConfig;
import ng.core.AnimationParser;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.NgModuleFactory;
import ng.core.ModuleWithComponentFactories;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\jit\compiler.d.ts
  * Package ng.core
  * Name JitCompiler
  * An internal module of the Angular compiler that begins with component types,
  * extracts templates, and eventually produces a compiled version of the component
  * ready for linking into an application.
  **/
@JsType( isNative=true, namespace="ng.core", name="JitCompiler" )
public class JitCompilerImpl extends Compiler {
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_metadataResolver")
    Object get_metadataResolver();
    @JsProperty(name="_metadataResolver")
    void set_metadataResolver(Object value);
    @JsProperty(name="_templateParser")
    Object get_templateParser();
    @JsProperty(name="_templateParser")
    void set_templateParser(Object value);
    @JsProperty(name="_styleCompiler")
    Object get_styleCompiler();
    @JsProperty(name="_styleCompiler")
    void set_styleCompiler(Object value);
    @JsProperty(name="_viewCompiler")
    Object get_viewCompiler();
    @JsProperty(name="_viewCompiler")
    void set_viewCompiler(Object value);
    @JsProperty(name="_ngModuleCompiler")
    Object get_ngModuleCompiler();
    @JsProperty(name="_ngModuleCompiler")
    void set_ngModuleCompiler(Object value);
    @JsProperty(name="_directiveWrapperCompiler")
    Object get_directiveWrapperCompiler();
    @JsProperty(name="_directiveWrapperCompiler")
    void set_directiveWrapperCompiler(Object value);
    @JsProperty(name="_compilerConfig")
    Object get_compilerConfig();
    @JsProperty(name="_compilerConfig")
    void set_compilerConfig(Object value);
    @JsProperty(name="_animationParser")
    Object get_animationParser();
    @JsProperty(name="_animationParser")
    void set_animationParser(Object value);
    @JsProperty(name="_compiledTemplateCache")
    Object get_compiledTemplateCache();
    @JsProperty(name="_compiledTemplateCache")
    void set_compiledTemplateCache(Object value);
    @JsProperty(name="_compiledHostTemplateCache")
    Object get_compiledHostTemplateCache();
    @JsProperty(name="_compiledHostTemplateCache")
    void set_compiledHostTemplateCache(Object value);
    @JsProperty(name="_compiledDirectiveWrapperCache")
    Object get_compiledDirectiveWrapperCache();
    @JsProperty(name="_compiledDirectiveWrapperCache")
    void set_compiledDirectiveWrapperCache(Object value);
    @JsProperty(name="_compiledNgModuleCache")
    Object get_compiledNgModuleCache();
    @JsProperty(name="_compiledNgModuleCache")
    void set_compiledNgModuleCache(Object value);
    @JsProperty(name="_animationCompiler")
    Object get_animationCompiler();
    @JsProperty(name="_animationCompiler")
    void set_animationCompiler(Object value);
    @JsConstructor
    public JitCompilerImpl(Injector _injector,CompileMetadataResolver _metadataResolver,TemplateParser _templateParser,StyleCompiler _styleCompiler,ViewCompiler _viewCompiler,NgModuleCompiler _ngModuleCompiler,DirectiveWrapperCompiler _directiveWrapperCompiler,CompilerConfig _compilerConfig,AnimationParser _animationParser) {}
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    public native <T> NgModuleFactory<T> compileModuleSync(Type<T> moduleType);
    public native <T> Promise<NgModuleFactory<T>> compileModuleAsync(Type<T> moduleType);
    public native <T> ModuleWithComponentFactories<T> compileModuleAndAllComponentsSync(Type<T> moduleType);
    public native <T> Promise<ModuleWithComponentFactories<T>> compileModuleAndAllComponentsAsync(Type<T> moduleType);
    public native  JsArray<String> getNgContentSelectors(Type<Object> component);
    public native <T> void _compileModuleAndComponents();
    public native <T> void _compileModuleAndAllComponents();
    public native  void _loadModules();
    public native <T> void _compileModule();
    public native  void clearCacheFor(Type<Object> type);
    public native  void clearCache();
    public native  void _createCompiledHostTemplate();
    public native  void _createCompiledTemplate();
    public native  void _assertComponentKnown();
    public native  void _assertDirectiveWrapper();
    public native  void _compileDirectiveWrapper();
    public native  void _compileTemplate();
    public native  void _resolveStylesCompileResult();
    public native  void _resolveAndEvalStylesCompileResult();
}
