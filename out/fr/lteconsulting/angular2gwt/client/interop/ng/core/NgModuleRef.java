package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Injector;
import jsinterop.annotations.JsProperty;
import ng.core.ComponentFactoryResolver;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory.d.ts
  * Package ng.core
  * Name NgModuleRef
  * Represents an instance of an NgModule created via a {@link NgModuleFactory}.
  * 
  * `NgModuleRef` provides access to the NgModule Instance as well other objects related to this
  * NgModule Instance.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgModuleRef<T>  {
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="componentFactoryResolver")
    ComponentFactoryResolver getComponentFactoryResolver();
    @JsProperty(name="componentFactoryResolver")
    void setComponentFactoryResolver(ComponentFactoryResolver value);
    @JsProperty(name="instance")
    T getInstance();
    @JsProperty(name="instance")
    void setInstance(T value);
     void destroy();
     void onDestroy(JsFunction<Void> callback);
}
