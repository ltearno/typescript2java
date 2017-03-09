package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\system_js_ng_module_factory_loader.d.ts
  * Package ng.core
  * Name SystemJsNgModuleLoader
  * NgModuleFactoryLoader that uses SystemJS to load NgModuleFactory
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SystemJsNgModuleLoader extends NgModuleFactoryLoader {
    public Object _compiler;
    public Object _config;
    @JsConstructor
    public SystemJsNgModuleLoader(Compiler _compiler,SystemJsNgModuleLoaderConfig /* optional */ config) {}
    public native  Promise<NgModuleFactory<Object>> load(String path);
    public native  void loadAndCompile();
    public native  void loadFactory();
}
