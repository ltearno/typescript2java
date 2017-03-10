package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Injector;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import ng.core.NgModule;
import ng.core.Directive;
import ng.core.Component;
import ng.core.Pipe;

/**
  * Generated from tests\@angular\core\testing\test_compiler.d.ts
  * Package ng.core
  * Name TestingCompiler
  * Special interface to the compiler only used by testing
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestingCompiler extends Compiler {
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
     void overrideModule(Type<Object> module,MetadataOverride<NgModule> overrides);
     void overrideDirective(Type<Object> directive,MetadataOverride<Directive> overrides);
     void overrideComponent(Type<Object> component,MetadataOverride<Component> overrides);
     void overridePipe(Type<Object> directive,MetadataOverride<Pipe> overrides);
}
