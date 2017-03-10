package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentFactory;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name CodegenComponentFactoryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CodegenComponentFactoryResolver" )
public class CodegenComponentFactoryResolverImpl extends ComponentFactoryResolver {
    @JsProperty(name="_parent")
    Object get_parent();
    @JsProperty(name="_parent")
    void set_parent(Object value);
    @JsProperty(name="_factories")
    Object get_factories();
    @JsProperty(name="_factories")
    void set_factories(Object value);
    @JsConstructor
    public CodegenComponentFactoryResolverImpl(JsArray<ComponentFactory<Object>> factories,ComponentFactoryResolver _parent) {}
    public native <T> ComponentFactory<T> resolveComponentFactory(/* TypeLiteral */ Object component);
}
