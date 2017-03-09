package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name RoutesRecognized
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RoutesRecognized  {
    public int id;
    public String url;
    public String urlAfterRedirects;
    public RouterStateSnapshot state;
    @JsConstructor
    public RoutesRecognized(int id,String url,String urlAfterRedirects,RouterStateSnapshot state) {}
    public native  String toString();
}
