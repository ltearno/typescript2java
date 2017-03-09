package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name CodegenComponentFactoryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CodegenComponentFactoryResolver extends ComponentFactoryResolver {
    public Object _parent;
    public Object _factories;
    @JsConstructor
    public CodegenComponentFactoryResolver(JsArray<ComponentFactory<Object>> factories,ComponentFactoryResolver _parent) {}
    public native <T> ComponentFactory<T> resolveComponentFactory(/* TypeLiteral */ Object component);
}
