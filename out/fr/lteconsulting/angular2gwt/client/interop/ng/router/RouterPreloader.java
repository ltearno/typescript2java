package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.router.Router;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import ng.core.Injector;
import ng.router.PreloadingStrategy;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RouterPreloader  {
    @JsProperty(name="router")
    Object getRouter();
    @JsProperty(name="router")
    void setRouter(Object value);
    @JsProperty(name="injector")
    Object getInjector();
    @JsProperty(name="injector")
    void setInjector(Object value);
    @JsProperty(name="preloadingStrategy")
    Object getPreloadingStrategy();
    @JsProperty(name="preloadingStrategy")
    void setPreloadingStrategy(Object value);
    @JsProperty(name="loader")
    Object getLoader();
    @JsProperty(name="loader")
    void setLoader(Object value);
    @JsProperty(name="subscription")
    Object getSubscription();
    @JsProperty(name="subscription")
    void setSubscription(Object value);
    @JsConstructor
    public RouterPreloader(Router router,NgModuleFactoryLoader moduleLoader,Compiler compiler,Injector injector,PreloadingStrategy preloadingStrategy) {}
     void setUpPreloading();
     Observable<Object> preload();
     void ngOnDestroy();
     void processRoutes();
     void preloadConfig();
}
