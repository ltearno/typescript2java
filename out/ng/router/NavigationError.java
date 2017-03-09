package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationError
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class NavigationError  {
    public int id;
    public String url;
    public Object error;
    @JsConstructor
    public NavigationError(int id,String url,Object error) {}
    public native  String toString();
}
