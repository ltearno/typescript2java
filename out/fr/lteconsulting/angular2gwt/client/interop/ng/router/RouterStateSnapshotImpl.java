package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRouteSnapshot;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name RouterStateSnapshot
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouterStateSnapshot" )
public class RouterStateSnapshotImpl extends Tree<ActivatedRouteSnapshot> {
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    public native  String toString();
}
