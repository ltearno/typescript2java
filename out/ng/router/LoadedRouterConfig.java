package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Injector;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router_config_loader.d.ts
  * Package ng.router
  * Name LoadedRouterConfig
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class LoadedRouterConfig  {
    public JsArray<Route> routes;
    public Injector injector;
    public ComponentFactoryResolver factoryResolver;
    public Function injectorFactory;
    @JsConstructor
    public LoadedRouterConfig(JsArray<Route> routes,Injector injector,ComponentFactoryResolver factoryResolver,Function injectorFactory) {}
}
