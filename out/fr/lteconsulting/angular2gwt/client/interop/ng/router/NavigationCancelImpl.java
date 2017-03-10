package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationCancel
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="NavigationCancel" )
public class NavigationCancelImpl  {
    @JsProperty(name="id")
    int getId();
    @JsProperty(name="id")
    void setId(int value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="reason")
    String getReason();
    @JsProperty(name="reason")
    void setReason(String value);
    @JsConstructor
    public NavigationCancelImpl(int id,String url,String reason) {}
    public native  String toString();
}
