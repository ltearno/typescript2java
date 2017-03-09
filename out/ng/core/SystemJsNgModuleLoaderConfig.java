package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\system_js_ng_module_factory_loader.d.ts
  * Package ng.core
  * Name SystemJsNgModuleLoaderConfig
  * Configuration for SystemJsNgModuleLoader.
  * token.
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface SystemJsNgModuleLoaderConfig  {
    @JsProperty(name="factoryPathPrefix")
    String factoryPathPrefix();
    @JsProperty(name="factoryPathPrefix")
    void factoryPathPrefix(String value);
    @JsProperty(name="factoryPathSuffix")
    String factoryPathSuffix();
    @JsProperty(name="factoryPathSuffix")
    void factoryPathSuffix(String value);
}
