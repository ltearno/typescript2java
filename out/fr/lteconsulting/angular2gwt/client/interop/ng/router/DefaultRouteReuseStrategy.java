package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRouteSnapshot;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name DefaultRouteReuseStrategy
  * Does not detach any subtrees. Reuses routes as long as their route config is the same.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DefaultRouteReuseStrategy extends RouteReuseStrategy {
     boolean shouldDetach(ActivatedRouteSnapshot route);
     void store(ActivatedRouteSnapshot route,DetachedRouteHandle detachedTree);
     boolean shouldAttach(ActivatedRouteSnapshot route);
     DetachedRouteHandle retrieve(ActivatedRouteSnapshot route);
     boolean shouldReuseRoute(ActivatedRouteSnapshot future,ActivatedRouteSnapshot curr);
}
