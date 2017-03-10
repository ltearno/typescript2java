package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Injector;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentFactory;
import jsinterop.annotations.JsConstructor;
import ng.core.ComponentFactoryResolver;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory.d.ts
  * Package ng.core
  * Name NgModuleInjector
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="NgModuleInjector" )
public abstract class NgModuleInjectorImpl<T> extends Injector {
    @JsProperty(name="parent")
    Injector getParent();
    @JsProperty(name="parent")
    void setParent(Injector value);
    @JsProperty(name="bootstrapFactories")
    JsArray<ComponentFactory<Object>> getBootstrapFactories();
    @JsProperty(name="bootstrapFactories")
    void setBootstrapFactories(JsArray<ComponentFactory<Object>> value);
    @JsProperty(name="_destroyListeners")
    Object get_destroyListeners();
    @JsProperty(name="_destroyListeners")
    void set_destroyListeners(Object value);
    @JsProperty(name="_destroyed")
    Object get_destroyed();
    @JsProperty(name="_destroyed")
    void set_destroyed(Object value);
    @JsProperty(name="instance")
    T getInstance();
    @JsProperty(name="instance")
    void setInstance(T value);
    @JsConstructor
    public NgModuleInjectorImpl(Injector parent,JsArray<ComponentFactory<Object>> factories,JsArray<ComponentFactory<Object>> bootstrapFactories) {}
    public native  void create();
    public native  T createInternal();
    public native  Object get(Object token,Object /* optional */ notFoundValue);
    public native  Object getInternal(Object token,Object notFoundValue);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="componentFactoryResolver")
    ComponentFactoryResolver getComponentFactoryResolver();
    @JsProperty(name="componentFactoryResolver")
    void setComponentFactoryResolver(ComponentFactoryResolver value);
    public native  void destroy();
    public native  void onDestroy(JsFunction<Void> callback);
    public native  void destroyInternal();
}
