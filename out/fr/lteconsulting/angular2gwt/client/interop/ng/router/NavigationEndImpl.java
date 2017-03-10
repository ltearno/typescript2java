package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationEnd
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="NavigationEnd" )
public class NavigationEndImpl  {
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
    @JsConstructor
    public NavigationEndImpl(int id,String url,String urlAfterRedirects) {}
    public native  String toString();
}
