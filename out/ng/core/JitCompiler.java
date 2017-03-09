package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\jit\compiler.d.ts
  * Package ng.core
  * Name JitCompiler
  * An internal module of the Angular compiler that begins with component types,
  * extracts templates, and eventually produces a compiled version of the component
  * ready for linking into an application.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class JitCompiler extends Compiler {
    public Object _injector;
    public Object _metadataResolver;
    public Object _templateParser;
    public Object _styleCompiler;
    public Object _viewCompiler;
    public Object _ngModuleCompiler;
    public Object _directiveWrapperCompiler;
    public Object _compilerConfig;
    public Object _animationParser;
    public Object _compiledTemplateCache;
    public Object _compiledHostTemplateCache;
    public Object _compiledDirectiveWrapperCache;
    public Object _compiledNgModuleCache;
    public Object _animationCompiler;
    @JsConstructor
    public JitCompiler(Injector _injector,CompileMetadataResolver _metadataResolver,TemplateParser _templateParser,StyleCompiler _styleCompiler,ViewCompiler _viewCompiler,NgModuleCompiler _ngModuleCompiler,DirectiveWrapperCompiler _directiveWrapperCompiler,CompilerConfig _compilerConfig,AnimationParser _animationParser) {}
    public Injector injector;
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
