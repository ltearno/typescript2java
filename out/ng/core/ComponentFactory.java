package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\component_factory.d.ts
  * Package ng.core
  * Name ComponentFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ComponentFactory<C>  {
    public String selector;
    public Object _viewClass;
    public Object _componentType;
    @JsConstructor
    public ComponentFactory(String selector,Type<AppView<Object>> _viewClass,Type<Object> _componentType) {}
    public Type<Object> componentType;
    public native  ComponentRef<C> create(Injector injector,JsArray<JsArray<Object>> /* optional */ projectableNodes,Object /* UnionType */ /* optional */ rootSelectorOrNode);
}
