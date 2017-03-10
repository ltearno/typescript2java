package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.NgModuleFactory;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentFactory;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\compiler.d.ts
  * Package ng.core
  * Name ModuleWithComponentFactories
  * Combination of NgModuleFactory and ComponentFactorys.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ModuleWithComponentFactories<T>  {
    @JsProperty(name="ngModuleFactory")
    NgModuleFactory<T> getNgModuleFactory();
    @JsProperty(name="ngModuleFactory")
    void setNgModuleFactory(NgModuleFactory<T> value);
    @JsProperty(name="componentFactories")
    JsArray<ComponentFactory<Object>> getComponentFactories();
    @JsProperty(name="componentFactories")
    void setComponentFactories(JsArray<ComponentFactory<Object>> value);
    @JsConstructor
    public ModuleWithComponentFactories(NgModuleFactory<T> ngModuleFactory,JsArray<ComponentFactory<Object>> componentFactories) {}
}
