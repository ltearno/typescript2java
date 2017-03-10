package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRoute;
import ng.router.RouterStateSnapshot;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name RouterState
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouterState" )
public class RouterStateImpl extends Tree<ActivatedRoute> {
    @JsProperty(name="snapshot")
    RouterStateSnapshot getSnapshot();
    @JsProperty(name="snapshot")
    void setSnapshot(RouterStateSnapshot value);
    public native  String toString();
}
