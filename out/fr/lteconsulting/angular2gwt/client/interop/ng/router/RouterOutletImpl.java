package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.router.RouterOutletMap;
import ng.core.EventEmitter;
import ng.core.ViewContainerRef;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import ng.router.ActivatedRoute;
import ng.core.ComponentRef;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ResolvedReflectiveProvider;

/**
  * Generated from tests\@angular\router\src\directives\router_outlet.d.ts
  * Package ng.router
  * Name RouterOutlet
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouterOutlet" )
public class RouterOutletImpl extends OnDestroy {
    @JsProperty(name="parentOutletMap")
    Object getParentOutletMap();
    @JsProperty(name="parentOutletMap")
    void setParentOutletMap(Object value);
    @JsProperty(name="location")
    Object getLocation();
    @JsProperty(name="location")
    void setLocation(Object value);
    @JsProperty(name="resolver")
    Object getResolver();
    @JsProperty(name="resolver")
    void setResolver(Object value);
    @JsProperty(name="name")
    Object getName();
    @JsProperty(name="name")
    void setName(Object value);
    @JsProperty(name="activated")
    Object getActivated();
    @JsProperty(name="activated")
    void setActivated(Object value);
    @JsProperty(name="_activatedRoute")
    Object get_activatedRoute();
    @JsProperty(name="_activatedRoute")
    void set_activatedRoute(Object value);
    @JsProperty(name="outletMap")
    RouterOutletMap getOutletMap();
    @JsProperty(name="outletMap")
    void setOutletMap(RouterOutletMap value);
    @JsProperty(name="activateEvents")
    EventEmitter<Object> getActivateEvents();
    @JsProperty(name="activateEvents")
    void setActivateEvents(EventEmitter<Object> value);
    @JsProperty(name="deactivateEvents")
    EventEmitter<Object> getDeactivateEvents();
    @JsProperty(name="deactivateEvents")
    void setDeactivateEvents(EventEmitter<Object> value);
    @JsConstructor
    public RouterOutletImpl(RouterOutletMap parentOutletMap,ViewContainerRef location,ComponentFactoryResolver resolver,String name) {}
    public native  void ngOnDestroy();
    @JsProperty(name="locationInjector")
    Injector getLocationInjector();
    @JsProperty(name="locationInjector")
    void setLocationInjector(Injector value);
    @JsProperty(name="locationFactoryResolver")
    ComponentFactoryResolver getLocationFactoryResolver();
    @JsProperty(name="locationFactoryResolver")
    void setLocationFactoryResolver(ComponentFactoryResolver value);
    @JsProperty(name="isActivated")
    boolean getIsActivated();
    @JsProperty(name="isActivated")
    void setIsActivated(boolean value);
    @JsProperty(name="component")
    Object getComponent();
    @JsProperty(name="component")
    void setComponent(Object value);
    @JsProperty(name="activatedRoute")
    ActivatedRoute getActivatedRoute();
    @JsProperty(name="activatedRoute")
    void setActivatedRoute(ActivatedRoute value);
    public native  ComponentRef<Object> detach();
    public native  void attach(ComponentRef<Object> ref,ActivatedRoute activatedRoute);
    public native  void deactivate();
    public native  void activate(ActivatedRoute activatedRoute,ComponentFactoryResolver resolver,Injector injector,JsArray<ResolvedReflectiveProvider> providers,RouterOutletMap outletMap);
}
