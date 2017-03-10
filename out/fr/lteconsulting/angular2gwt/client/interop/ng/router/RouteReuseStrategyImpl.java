package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRouteSnapshot;

/**
  * Generated from tests\@angular\router\src\route_reuse_strategy.d.ts
  * Package ng.router
  * Name RouteReuseStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouteReuseStrategy" )
public abstract class RouteReuseStrategyImpl  {
    public native  boolean shouldDetach(ActivatedRouteSnapshot route);
    public native  void store(ActivatedRouteSnapshot route,DetachedRouteHandle handle);
    public native  boolean shouldAttach(ActivatedRouteSnapshot route);
    public native  DetachedRouteHandle retrieve(ActivatedRouteSnapshot route);
    public native  boolean shouldReuseRoute(ActivatedRouteSnapshot future,ActivatedRouteSnapshot curr);
}
