package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import ng.core.ComponentFactory;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name ComponentFactoryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ComponentFactoryResolver" )
public abstract class ComponentFactoryResolverImpl  {
    @JsProperty(name="NULL")
    static ComponentFactoryResolver getNULL();
    @JsProperty(name="NULL")
    static void setNULL(ComponentFactoryResolver value);
    public native <T> ComponentFactory<T> resolveComponentFactory(Type<T> component);
}
