package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationEnd
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class NavigationEnd  {
    public int id;
    public String url;
    public String urlAfterRedirects;
    @JsConstructor
    public NavigationEnd(int id,String url,String urlAfterRedirects) {}
    public native  String toString();
}
