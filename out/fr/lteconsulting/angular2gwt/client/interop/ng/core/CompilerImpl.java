package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import ng.core.NgModuleFactory;
import ng.core.ModuleWithComponentFactories;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\compiler.d.ts
  * Package ng.core
  * Name Compiler
  * Low-level service for running the angular compiler during runtime
  * to create {@link ComponentFactory}s, which
  * can later be used to create and render a Component instance.
  * 
  * Each `@NgModule` provides an own `Compiler` to its injector,
  * that will use the directives/pipes of the ng module for compilation
  * of components.
  **/
@JsType( isNative=true, namespace="ng.core", name="Compiler" )
public class CompilerImpl  {
    public native <T> NgModuleFactory<T> compileModuleSync(Type<T> moduleType);
    public native <T> Promise<NgModuleFactory<T>> compileModuleAsync(Type<T> moduleType);
    public native <T> ModuleWithComponentFactories<T> compileModuleAndAllComponentsSync(Type<T> moduleType);
    public native <T> Promise<ModuleWithComponentFactories<T>> compileModuleAndAllComponentsAsync(Type<T> moduleType);
    public native  JsArray<String> getNgContentSelectors(Type<Object> component);
    public native  void clearCache();
    public native  void clearCacheFor(Type<Object> type);
}
