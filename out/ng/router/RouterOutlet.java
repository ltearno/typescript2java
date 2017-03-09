package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.EventEmitter;
import ng.core.ViewContainerRef;
import ng.core.ComponentFactoryResolver;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import ng.core.ComponentRef;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ResolvedReflectiveProvider;

/**
  * Generated from tests\@angular\router\src\directives\router_outlet.d.ts
  * Package ng.router
  * Name RouterOutlet
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterOutlet extends OnDestroy {
    public Object parentOutletMap;
    public Object location;
    public Object resolver;
    public Object name;
    public Object activated;
    public Object _activatedRoute;
    public RouterOutletMap outletMap;
    public EventEmitter<Object> activateEvents;
    public EventEmitter<Object> deactivateEvents;
    @JsConstructor
    public RouterOutlet(RouterOutletMap parentOutletMap,ViewContainerRef location,ComponentFactoryResolver resolver,String name) {}
    public native  void ngOnDestroy();
    public Injector locationInjector;
    public ComponentFactoryResolver locationFactoryResolver;
    public boolean isActivated;
    public Object component;
    public ActivatedRoute activatedRoute;
    public native  ComponentRef<Object> detach();
    public native  void attach(ComponentRef<Object> ref,ActivatedRoute activatedRoute);
    public native  void deactivate();
    public native  void activate(ActivatedRoute activatedRoute,ComponentFactoryResolver resolver,Injector injector,JsArray<ResolvedReflectiveProvider> providers,RouterOutletMap outletMap);
}
