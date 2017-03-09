package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.core" )
public interface NgModuleRef<T>  {
    @JsProperty(name="injector")
    Injector injector();
    @JsProperty(name="injector")
    void injector(Injector value);
    @JsProperty(name="componentFactoryResolver")
    ComponentFactoryResolver componentFactoryResolver();
    @JsProperty(name="componentFactoryResolver")
    void componentFactoryResolver(ComponentFactoryResolver value);
    @JsProperty(name="instance")
    T instance();
    @JsProperty(name="instance")
    void instance(T value);
     void destroy();
     void onDestroy(JsFunction<Void> callback);
}
