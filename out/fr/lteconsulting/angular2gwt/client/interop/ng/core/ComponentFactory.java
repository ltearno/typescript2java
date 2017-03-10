package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import ng.core.AppView;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentRef;

/**
  * Generated from tests\@angular\core\src\linker\component_factory.d.ts
  * Package ng.core
  * Name ComponentFactory
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ComponentFactory<C>  {
    @JsProperty(name="selector")
    String getSelector();
    @JsProperty(name="selector")
    void setSelector(String value);
    @JsProperty(name="_viewClass")
    Object get_viewClass();
    @JsProperty(name="_viewClass")
    void set_viewClass(Object value);
    @JsProperty(name="_componentType")
    Object get_componentType();
    @JsProperty(name="_componentType")
    void set_componentType(Object value);
    @JsConstructor
    public ComponentFactory(String selector,Type<AppView<Object>> _viewClass,Type<Object> _componentType) {}
    @JsProperty(name="componentType")
    Type<Object> getComponentType();
    @JsProperty(name="componentType")
    void setComponentType(Type<Object> value);
     ComponentRef<C> create(Injector injector,JsArray<JsArray<Object>> /* optional */ projectableNodes,Object /* UnionType */ /* optional */ rootSelectorOrNode);
}
