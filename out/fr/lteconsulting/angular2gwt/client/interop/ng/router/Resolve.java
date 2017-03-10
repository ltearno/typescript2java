package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRouteSnapshot;
import ng.router.RouterStateSnapshot;

/**
  * Generated from tests\@angular\router\src\interfaces.d.ts
  * Package ng.router
  * Name Resolve
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Resolve<T>  {
     Object /* UnionType */ resolve(ActivatedRouteSnapshot route,RouterStateSnapshot state);
}
