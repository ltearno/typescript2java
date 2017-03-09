package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationCancel
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class NavigationCancel  {
    public int id;
    public String url;
    public String reason;
    @JsConstructor
    public NavigationCancel(int id,String url,String reason) {}
    public native  String toString();
}
