package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.Route;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;

/**
  * Generated from tests\@angular\router\src\router_preloader.d.ts
  * Package ng.router
  * Name PreloadAllModules
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="PreloadAllModules" )
public class PreloadAllModulesImpl extends PreloadingStrategy {
    public native  Observable<Object> preload(Route route,JsFunction<Observable<Object>> fn);
}
