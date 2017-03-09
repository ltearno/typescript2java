package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ResolvedReflectiveFactory
  * An internal resolved representation of a factory function created by resolving {@link
  * Provider}.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ResolvedReflectiveFactory  {
    public Function factory;
    public JsArray<ReflectiveDependency> dependencies;
    @JsConstructor
    public ResolvedReflectiveFactory(Function factory,JsArray<ReflectiveDependency> dependencies) {}
}
