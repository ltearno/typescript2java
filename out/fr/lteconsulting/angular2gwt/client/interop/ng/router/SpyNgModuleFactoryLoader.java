package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SpyNgModuleFactoryLoader extends NgModuleFactoryLoader {
    @JsProperty(name="compiler")
    Object getCompiler();
    @JsProperty(name="compiler")
    void setCompiler(Object value);
    @JsProperty(name="_stubbedModules")
    Object get_stubbedModules();
    @JsProperty(name="_stubbedModules")
    void set_stubbedModules(Object value);
    @JsProperty(name="stubbedModules")
    JsTypedObject<String,Object> getStubbedModules();
    @JsProperty(name="stubbedModules")
    void setStubbedModules(JsTypedObject<String,Object> value);
    @JsConstructor
    public SpyNgModuleFactoryLoader(Compiler compiler) {}
     Promise<NgModuleFactory<Object>> load(String path);
}
