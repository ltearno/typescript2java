package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.Compiler;
import jsinterop.annotations.JsConstructor;
import ng.core.NgModuleFactory;

/**
  * Generated from tests\@angular\router\testing\router_testing_module.d.ts
  * Package ng.router
  * Name SpyNgModuleFactoryLoader
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class SpyNgModuleFactoryLoader extends NgModuleFactoryLoader {
    public Object compiler;
    public Object _stubbedModules;
    public JsTypedObject<String,Object> stubbedModules;
    @JsConstructor
    public SpyNgModuleFactoryLoader(Compiler compiler) {}
    public native  Promise<NgModuleFactory<Object>> load(String path);
}
