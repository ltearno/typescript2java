package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.router.UrlHandlingStrategy;
import ng.router.RouteReuseStrategy;
import ng.core.Type;
import ng.router.UrlSerializer;
import ng.router.RouterOutletMap;
import ng.core.Location;
import ng.core.Injector;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import jsinterop.annotations.JsConstructor;
import ng.router.RouterState;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.NavigationExtras;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name Router
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="Router" )
public class RouterImpl  {
    @JsProperty(name="rootComponentType")
    Object getRootComponentType();
    @JsProperty(name="rootComponentType")
    void setRootComponentType(Object value);
    @JsProperty(name="urlSerializer")
    Object getUrlSerializer();
    @JsProperty(name="urlSerializer")
    void setUrlSerializer(Object value);
    @JsProperty(name="outletMap")
    Object getOutletMap();
    @JsProperty(name="outletMap")
    void setOutletMap(Object value);
    @JsProperty(name="location")
    Object getLocation();
    @JsProperty(name="location")
    void setLocation(Object value);
    @JsProperty(name="injector")
    Object getInjector();
    @JsProperty(name="injector")
    void setInjector(Object value);
    @JsProperty(name="config")
    Routes getConfig();
    @JsProperty(name="config")
    void setConfig(Routes value);
    @JsProperty(name="currentUrlTree")
    Object getCurrentUrlTree();
    @JsProperty(name="currentUrlTree")
    void setCurrentUrlTree(Object value);
    @JsProperty(name="rawUrlTree")
    Object getRawUrlTree();
    @JsProperty(name="rawUrlTree")
    void setRawUrlTree(Object value);
    @JsProperty(name="navigations")
    Object getNavigations();
    @JsProperty(name="navigations")
    void setNavigations(Object value);
    @JsProperty(name="routerEvents")
    Object getRouterEvents();
    @JsProperty(name="routerEvents")
    void setRouterEvents(Object value);
    @JsProperty(name="currentRouterState")
    Object getCurrentRouterState();
    @JsProperty(name="currentRouterState")
    void setCurrentRouterState(Object value);
    @JsProperty(name="locationSubscription")
    Object getLocationSubscription();
    @JsProperty(name="locationSubscription")
    void setLocationSubscription(Object value);
    @JsProperty(name="navigationId")
    Object getNavigationId();
    @JsProperty(name="navigationId")
    void setNavigationId(Object value);
    @JsProperty(name="configLoader")
    Object getConfigLoader();
    @JsProperty(name="configLoader")
    void setConfigLoader(Object value);
    @JsProperty(name="errorHandler")
    ErrorHandler getErrorHandler();
    @JsProperty(name="errorHandler")
    void setErrorHandler(ErrorHandler value);
    @JsProperty(name="navigated")
    boolean getNavigated();
    @JsProperty(name="navigated")
    void setNavigated(boolean value);
    @JsProperty(name="urlHandlingStrategy")
    UrlHandlingStrategy getUrlHandlingStrategy();
    @JsProperty(name="urlHandlingStrategy")
    void setUrlHandlingStrategy(UrlHandlingStrategy value);
    @JsProperty(name="routeReuseStrategy")
    RouteReuseStrategy getRouteReuseStrategy();
    @JsProperty(name="routeReuseStrategy")
    void setRouteReuseStrategy(RouteReuseStrategy value);
    @JsConstructor
    public RouterImpl(Type<Object> rootComponentType,UrlSerializer urlSerializer,RouterOutletMap outletMap,Location location,Injector injector,NgModuleFactoryLoader loader,Compiler compiler,Routes config) {}
    public native  void initialNavigation();
    public native  void setUpLocationChangeListener();
    @JsProperty(name="routerState")
    RouterState getRouterState();
    @JsProperty(name="routerState")
    void setRouterState(RouterState value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="events")
    Observable</* NO SYMBOL */Event> getEvents();
    @JsProperty(name="events")
    void setEvents(Observable</* NO SYMBOL */Event> value);
    public native  void resetConfig(Routes config);
    public native  void ngOnDestroy();
    public native  void dispose();
    public native  UrlTree createUrlTree(JsArray<Object> commands,NavigationExtras /* optional */ undefined);
    public native  Promise<Boolean> navigateByUrl(Object /* UnionType */ url,NavigationExtras /* optional */ extras);
    public native  Promise<Boolean> navigate(JsArray<Object> commands,NavigationExtras /* optional */ extras);
    public native  String serializeUrl(UrlTree url);
    public native  UrlTree parseUrl(String url);
    public native  boolean isActive(Object /* UnionType */ url,boolean exact);
    public native  void removeEmptyProps();
    public native  void processNavigations();
    public native  void scheduleNavigation();
    public native  void executeScheduledNavigation();
    public native  void runNavigate();
    public native  void resetUrlToCurrentUrlTree();
}
