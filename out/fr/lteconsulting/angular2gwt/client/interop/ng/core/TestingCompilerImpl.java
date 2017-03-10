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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestingCompilerImpl extends TestingCompiler {
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
    public TestingCompilerImpl(JitCompiler _compiler,MockDirectiveResolver _directiveResolver,MockPipeResolver _pipeResolver,MockNgModuleResolver _moduleResolver) {}
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    <T> NgModuleFactory<T> compileModuleSync(Type<T> moduleType);
    <T> Promise<NgModuleFactory<T>> compileModuleAsync(Type<T> moduleType);
    <T> ModuleWithComponentFactories<T> compileModuleAndAllComponentsSync(Type<T> moduleType);
    <T> Promise<ModuleWithComponentFactories<T>> compileModuleAndAllComponentsAsync(Type<T> moduleType);
     JsArray<String> getNgContentSelectors(Type<Object> component);
     void overrideModule(Type<Object> ngModule,MetadataOverride<NgModule> override);
     void overrideDirective(Type<Object> directive,MetadataOverride<Directive> override);
     void overrideComponent(Type<Object> component,MetadataOverride<Component> override);
     void overridePipe(Type<Object> pipe,MetadataOverride<Pipe> override);
     void clearCache();
     void clearCacheFor(Type<Object> type);
}
