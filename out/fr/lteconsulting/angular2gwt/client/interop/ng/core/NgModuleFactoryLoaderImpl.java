package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.NgModuleFactory;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory_loader.d.ts
  * Package ng.core
  * Name NgModuleFactoryLoader
  * Used to load ng module factories.
  **/
@JsType( isNative=true, namespace="ng.core", name="NgModuleFactoryLoader" )
public abstract class NgModuleFactoryLoaderImpl  {
    public native  Promise<NgModuleFactory<Object>> load(String path);
}
