package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.NgModule;

/**
  * Generated from tests\@angular\compiler\testing\ng_module_resolver_mock.d.ts
  * Package ng.core
  * Name MockNgModuleResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="MockNgModuleResolver" )
public class MockNgModuleResolverImpl extends NgModuleResolver {
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_ngModules")
    Object get_ngModules();
    @JsProperty(name="_ngModules")
    void set_ngModules(Object value);
    @JsConstructor
    public MockNgModuleResolverImpl(Injector _injector) {}
    public native  void setNgModule(Type<Object> type,NgModule metadata);
    public native  NgModule resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
    public native  void _clearCacheFor();
}
