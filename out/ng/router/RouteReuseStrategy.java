package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\router\src\route_reuse_strategy.d.ts
  * Package ng.router
  * Name RouteReuseStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public interface RouteReuseStrategy  {
     boolean shouldDetach(ActivatedRouteSnapshot route);
     void store(ActivatedRouteSnapshot route,DetachedRouteHandle handle);
     boolean shouldAttach(ActivatedRouteSnapshot route);
     DetachedRouteHandle retrieve(ActivatedRouteSnapshot route);
     boolean shouldReuseRoute(ActivatedRouteSnapshot future,ActivatedRouteSnapshot curr);
}
