package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NavigationError  {
    @JsProperty(name="id")
    int getId();
    @JsProperty(name="id")
    void setId(int value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="error")
    Object getError();
    @JsProperty(name="error")
    void setError(Object value);
    @JsConstructor
    public NavigationError(int id,String url,Object error) {}
     String toString();
}
