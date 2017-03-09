package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\compiler.d.ts
  * Package ng.core
  * Name ModuleWithComponentFactories
  * Combination of NgModuleFactory and ComponentFactorys.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ModuleWithComponentFactories<T>  {
    public NgModuleFactory<T> ngModuleFactory;
    public JsArray<ComponentFactory<Object>> componentFactories;
    @JsConstructor
    public ModuleWithComponentFactories(NgModuleFactory<T> ngModuleFactory,JsArray<ComponentFactory<Object>> componentFactories) {}
}
