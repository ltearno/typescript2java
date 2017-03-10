package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.RouterOutlet;

/**
  * Generated from tests\@angular\router\src\router_outlet_map.d.ts
  * Package ng.router
  * Name RouterOutletMap
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouterOutletMap" )
public class RouterOutletMapImpl  {
    public native  void registerOutlet(String name,RouterOutlet outlet);
    public native  void removeOutlet(String name);
}
