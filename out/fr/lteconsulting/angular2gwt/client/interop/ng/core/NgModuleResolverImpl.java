package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ReflectorReader;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.NgModule;

/**
  * Generated from tests\@angular\compiler\src\ng_module_resolver.d.ts
  * Package ng.core
  * Name NgModuleResolver
  * Resolves types to {@link NgModule}.
  **/
@JsType( isNative=true, namespace="ng.core", name="NgModuleResolver" )
public class NgModuleResolverImpl  {
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsConstructor
    public NgModuleResolverImpl(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isNgModule(Object type);
    public native  NgModule resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
