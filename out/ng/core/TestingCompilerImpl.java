package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\testing\index.d.ts
  * Package ng.core
  * Name TestingCompilerImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TestingCompilerImpl extends TestingCompiler {
    public Object _compiler;
    public Object _directiveResolver;
    public Object _pipeResolver;
    public Object _moduleResolver;
    public Object _overrider;
    @JsConstructor
    public TestingCompilerImpl(JitCompiler _compiler,MockDirectiveResolver _directiveResolver,MockPipeResolver _pipeResolver,MockNgModuleResolver _moduleResolver) {}
    public Injector injector;
    public native <T> NgModuleFactory<T> compileModuleSync(Type<T> moduleType);
    public native <T> Promise<NgModuleFactory<T>> compileModuleAsync(Type<T> moduleType);
    public native <T> ModuleWithComponentFactories<T> compileModuleAndAllComponentsSync(Type<T> moduleType);
    public native <T> Promise<ModuleWithComponentFactories<T>> compileModuleAndAllComponentsAsync(Type<T> moduleType);
    public native  JsArray<String> getNgContentSelectors(Type<Object> component);
    public native  void overrideModule(Type<Object> ngModule,MetadataOverride<NgModule> override);
    public native  void overrideDirective(Type<Object> directive,MetadataOverride<Directive> override);
    public native  void overrideComponent(Type<Object> component,MetadataOverride<Component> override);
    public native  void overridePipe(Type<Object> pipe,MetadataOverride<Pipe> override);
    public native  void clearCache();
    public native  void clearCacheFor(Type<Object> type);
}
