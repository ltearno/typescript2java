package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import rxjs.Observable;
import ng.router.LoadedRouterConfig;

/**
  * Generated from tests\@angular\router\src\router_config_loader.d.ts
  * Package ng.router
  * Name RouterConfigLoader
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RouterConfigLoader  {
    @JsProperty(name="loader")
    Object getLoader();
    @JsProperty(name="loader")
    void setLoader(Object value);
    @JsProperty(name="compiler")
    Object getCompiler();
    @JsProperty(name="compiler")
    void setCompiler(Object value);
    @JsConstructor
    public RouterConfigLoader(NgModuleFactoryLoader loader,Compiler compiler) {}
     Observable<LoadedRouterConfig> load(Injector parentInjector,/* NO SYMBOL */LoadChildren loadChildren);
     void loadModuleFactory();
}
