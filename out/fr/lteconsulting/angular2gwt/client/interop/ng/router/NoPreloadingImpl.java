package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.Route;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;

/**
  * Generated from tests\@angular\router\src\router_preloader.d.ts
  * Package ng.router
  * Name NoPreloading
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="NoPreloading" )
public class NoPreloadingImpl extends PreloadingStrategy {
    public native  Observable<Object> preload(Route route,JsFunction<Observable<Object>> fn);
}
