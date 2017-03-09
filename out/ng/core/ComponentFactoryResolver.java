package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name ComponentFactoryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface ComponentFactoryResolver  {
    @JsProperty(name="NULL")
    static ComponentFactoryResolver NULL();
    @JsProperty(name="NULL")
    static void NULL(ComponentFactoryResolver value);
    <T> ComponentFactory<T> resolveComponentFactory(Type<T> component);
}
