package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import rxjs.Observable;

/**
  * Generated from tests\@angular\router\src\router_config_loader.d.ts
  * Package ng.router
  * Name RouterConfigLoader
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterConfigLoader  {
    public Object loader;
    public Object compiler;
    @JsConstructor
    public RouterConfigLoader(NgModuleFactoryLoader loader,Compiler compiler) {}
    public native  Observable<LoadedRouterConfig> load(Injector parentInjector,/* NO SYMBOL */LoadChildren loadChildren);
    public native  void loadModuleFactory();
}
