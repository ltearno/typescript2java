package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ng_module_resolver.d.ts
  * Package ng.core
  * Name NgModuleResolver
  * Resolves types to {@link NgModule}.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgModuleResolver  {
    public Object _reflector;
    @JsConstructor
    public NgModuleResolver(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isNgModule(Object type);
    public native  NgModule resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
