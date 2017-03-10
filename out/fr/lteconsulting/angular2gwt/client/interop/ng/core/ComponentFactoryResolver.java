package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ComponentFactoryResolver;
import ng.core.Type;
import ng.core.ComponentFactory;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name ComponentFactoryResolver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ComponentFactoryResolver  {
    <T> ComponentFactory<T> resolveComponentFactory(Type<T> component);
}
