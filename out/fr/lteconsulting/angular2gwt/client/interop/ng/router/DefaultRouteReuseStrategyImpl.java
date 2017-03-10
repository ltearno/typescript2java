package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRouteSnapshot;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name DefaultRouteReuseStrategy
  * Does not detach any subtrees. Reuses routes as long as their route config is the same.
  **/
@JsType( isNative=true, namespace="ng.router", name="DefaultRouteReuseStrategy" )
public class DefaultRouteReuseStrategyImpl extends RouteReuseStrategy {
    public native  boolean shouldDetach(ActivatedRouteSnapshot route);
    public native  void store(ActivatedRouteSnapshot route,DetachedRouteHandle detachedTree);
    public native  boolean shouldAttach(ActivatedRouteSnapshot route);
    public native  DetachedRouteHandle retrieve(ActivatedRouteSnapshot route);
    public native  boolean shouldReuseRoute(ActivatedRouteSnapshot future,ActivatedRouteSnapshot curr);
}
