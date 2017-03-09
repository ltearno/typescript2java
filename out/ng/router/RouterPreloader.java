package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;

/**
  * Generated from tests\@angular\router\src\router_preloader.d.ts
  * Package ng.router
  * Name RouterPreloader
  * The preloader optimistically loads all router configurations to
  * make navigations into lazily-loaded sections of the application faster.
  * 
  * The preloader runs in the background. When the router bootstraps, the preloader
  * starts listening to all navigation events. After every such event, the preloader
  * will check if any configurations can be loaded lazily.
  * 
  * If a route is protected by `canLoad` guards, the preloaded will not load it.
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterPreloader  {
    public Object router;
    public Object injector;
    public Object preloadingStrategy;
    public Object loader;
    public Object subscription;
    @JsConstructor
    public RouterPreloader(Router router,NgModuleFactoryLoader moduleLoader,Compiler compiler,Injector injector,PreloadingStrategy preloadingStrategy) {}
    public native  void setUpPreloading();
    public native  Observable<Object> preload();
    public native  void ngOnDestroy();
    public native  void processRoutes();
    public native  void preloadConfig();
}
