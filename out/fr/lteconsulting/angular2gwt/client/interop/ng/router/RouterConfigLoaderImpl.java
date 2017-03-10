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
@JsType( isNative=true, namespace="ng.router", name="RouterConfigLoader" )
public class RouterConfigLoaderImpl  {
    @JsProperty(name="loader")
    Object getLoader();
    @JsProperty(name="loader")
    void setLoader(Object value);
    @JsProperty(name="compiler")
    Object getCompiler();
    @JsProperty(name="compiler")
    void setCompiler(Object value);
    @JsConstructor
    public RouterConfigLoaderImpl(NgModuleFactoryLoader loader,Compiler compiler) {}
    public native  Observable<LoadedRouterConfig> load(Injector parentInjector,/* NO SYMBOL */LoadChildren loadChildren);
    public native  void loadModuleFactory();
}
