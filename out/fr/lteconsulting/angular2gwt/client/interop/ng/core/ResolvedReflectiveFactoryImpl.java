package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ReflectiveDependency;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ResolvedReflectiveFactory
  * An internal resolved representation of a factory function created by resolving {@link
  * Provider}.
  **/
@JsType( isNative=true, namespace="ng.core", name="ResolvedReflectiveFactory" )
public class ResolvedReflectiveFactoryImpl  {
    @JsProperty(name="factory")
    Function getFactory();
    @JsProperty(name="factory")
    void setFactory(Function value);
    @JsProperty(name="dependencies")
    JsArray<ReflectiveDependency> getDependencies();
    @JsProperty(name="dependencies")
    void setDependencies(JsArray<ReflectiveDependency> value);
    @JsConstructor
    public ResolvedReflectiveFactoryImpl(Function factory,JsArray<ReflectiveDependency> dependencies) {}
}
