package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Compiler;
import ng.core.SystemJsNgModuleLoaderConfig;
import jsinterop.annotations.JsConstructor;
import ng.core.NgModuleFactory;

/**
  * Generated from tests\@angular\core\src\linker\system_js_ng_module_factory_loader.d.ts
  * Package ng.core
  * Name SystemJsNgModuleLoader
  * NgModuleFactoryLoader that uses SystemJS to load NgModuleFactory
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SystemJsNgModuleLoader extends NgModuleFactoryLoader {
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
    @JsProperty(name="_config")
    Object get_config();
    @JsProperty(name="_config")
    void set_config(Object value);
    @JsConstructor
    public SystemJsNgModuleLoader(Compiler _compiler,SystemJsNgModuleLoaderConfig /* optional */ config) {}
     Promise<NgModuleFactory<Object>> load(String path);
     void loadAndCompile();
     void loadFactory();
}
