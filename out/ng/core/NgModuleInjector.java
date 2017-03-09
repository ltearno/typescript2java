package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory.d.ts
  * Package ng.core
  * Name NgModuleInjector
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface NgModuleInjector<T> extends Injector {
    @JsProperty(name="parent")
    Injector parent();
    @JsProperty(name="parent")
    void parent(Injector value);
    @JsProperty(name="bootstrapFactories")
    JsArray<ComponentFactory<Object>> bootstrapFactories();
    @JsProperty(name="bootstrapFactories")
    void bootstrapFactories(JsArray<ComponentFactory<Object>> value);
    @JsProperty(name="_destroyListeners")
    Object _destroyListeners();
    @JsProperty(name="_destroyListeners")
    void _destroyListeners(Object value);
    @JsProperty(name="_destroyed")
    Object _destroyed();
    @JsProperty(name="_destroyed")
    void _destroyed(Object value);
    @JsProperty(name="instance")
    T instance();
    @JsProperty(name="instance")
    void instance(T value);
    @JsConstructor
    public NgModuleInjector(Injector parent,JsArray<ComponentFactory<Object>> factories,JsArray<ComponentFactory<Object>> bootstrapFactories) {}
     void create();
     T createInternal();
     Object get(Object token,Object /* optional */ notFoundValue);
     Object getInternal(Object token,Object notFoundValue);
    @JsProperty(name="injector")
    Injector injector();
    @JsProperty(name="injector")
    void injector(Injector value);
    @JsProperty(name="componentFactoryResolver")
    ComponentFactoryResolver componentFactoryResolver();
    @JsProperty(name="componentFactoryResolver")
    void componentFactoryResolver(ComponentFactoryResolver value);
     void destroy();
     void onDestroy(JsFunction<Void> callback);
     void destroyInternal();
}
