package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.Route;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router_config_loader.d.ts
  * Package ng.router
  * Name LoadedRouterConfig
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="LoadedRouterConfig" )
public class LoadedRouterConfigImpl  {
    @JsProperty(name="routes")
    JsArray<Route> getRoutes();
    @JsProperty(name="routes")
    void setRoutes(JsArray<Route> value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="factoryResolver")
    ComponentFactoryResolver getFactoryResolver();
    @JsProperty(name="factoryResolver")
    void setFactoryResolver(ComponentFactoryResolver value);
    @JsProperty(name="injectorFactory")
    Function getInjectorFactory();
    @JsProperty(name="injectorFactory")
    void setInjectorFactory(Function value);
    @JsConstructor
    public LoadedRouterConfigImpl(JsArray<Route> routes,Injector injector,ComponentFactoryResolver factoryResolver,Function injectorFactory) {}
}
