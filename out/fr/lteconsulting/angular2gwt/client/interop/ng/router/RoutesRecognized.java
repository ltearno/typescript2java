package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.router.RouterStateSnapshot;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name RoutesRecognized
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RoutesRecognized  {
    @JsProperty(name="id")
    int getId();
    @JsProperty(name="id")
    void setId(int value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="urlAfterRedirects")
    String getUrlAfterRedirects();
    @JsProperty(name="urlAfterRedirects")
    void setUrlAfterRedirects(String value);
    @JsProperty(name="state")
    RouterStateSnapshot getState();
    @JsProperty(name="state")
    void setState(RouterStateSnapshot value);
    @JsConstructor
    public RoutesRecognized(int id,String url,String urlAfterRedirects,RouterStateSnapshot state) {}
     String toString();
}
