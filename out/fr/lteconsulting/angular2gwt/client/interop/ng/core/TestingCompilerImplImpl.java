package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.JitCompiler;
import ng.core.MockDirectiveResolver;
import ng.core.MockPipeResolver;
import ng.core.MockNgModuleResolver;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import ng.core.Type;
import ng.core.NgModuleFactory;
import ng.core.ModuleWithComponentFactories;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.NgModule;
import ng.core.Directive;
import ng.core.Component;
import ng.core.Pipe;

/**
  * Generated from tests\@angular\compiler\testing\index.d.ts
  * Package ng.core
  * Name TestingCompilerImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TestingCompilerImpl" )
public class TestingCompilerImplImpl extends TestingCompiler {
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
    @JsProperty(name="_directiveResolver")
    Object get_directiveResolver();
    @JsProperty(name="_directiveResolver")
    void set_directiveResolver(Object value);
    @JsProperty(name="_pipeResolver")
    Object get_pipeResolver();
    @JsProperty(name="_pipeResolver")
    void set_pipeResolver(Object value);
    @JsProperty(name="_moduleResolver")
    Object get_moduleResolver();
    @JsProperty(name="_moduleResolver")
    void set_moduleResolver(Object value);
    @JsProperty(name="_overrider")
    Object get_overrider();
    @JsProperty(name="_overrider")
    void set_overrider(Object value);
    @JsConstructor
    public TestingCompilerImplImpl(JitCompiler _compiler,MockDirectiveResolver _directiveResolver,MockPipeResolver _pipeResolver,MockNgModuleResolver _moduleResolver) {}
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
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
