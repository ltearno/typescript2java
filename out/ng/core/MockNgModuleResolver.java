package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\testing\ng_module_resolver_mock.d.ts
  * Package ng.core
  * Name MockNgModuleResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockNgModuleResolver extends NgModuleResolver {
    public Object _injector;
    public Object _ngModules;
    @JsConstructor
    public MockNgModuleResolver(Injector _injector) {}
    public native  void setNgModule(Type<Object> type,NgModule metadata);
    public native  NgModule resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
    public Object _compiler;
    public native  void _clearCacheFor();
}
