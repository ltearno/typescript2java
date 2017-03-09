package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.Type;
import ng.core.Location;
import ng.core.Injector;
import ng.core.NgModuleFactoryLoader;
import ng.core.Compiler;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name Router
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class Router  {
    public Object rootComponentType;
    public Object urlSerializer;
    public Object outletMap;
    public Object location;
    public Object injector;
    public Routes config;
    public Object currentUrlTree;
    public Object rawUrlTree;
    public Object navigations;
    public Object routerEvents;
    public Object currentRouterState;
    public Object locationSubscription;
    public Object navigationId;
    public Object configLoader;
    public ErrorHandler errorHandler;
    public boolean navigated;
    public UrlHandlingStrategy urlHandlingStrategy;
    public RouteReuseStrategy routeReuseStrategy;
    @JsConstructor
    public Router(Type<Object> rootComponentType,UrlSerializer urlSerializer,RouterOutletMap outletMap,Location location,Injector injector,NgModuleFactoryLoader loader,Compiler compiler,Routes config) {}
    public native  void initialNavigation();
    public native  void setUpLocationChangeListener();
    public RouterState routerState;
    public String url;
    public Observable</* NO SYMBOL */Event> events;
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
