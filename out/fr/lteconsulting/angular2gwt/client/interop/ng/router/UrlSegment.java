package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSegment
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface UrlSegment  {
    @JsProperty(name="path")
    String getPath();
    @JsProperty(name="path")
    void setPath(String value);
    @JsProperty(name="parameters")
    JsTypedObject<String,String> getParameters();
    @JsProperty(name="parameters")
    void setParameters(JsTypedObject<String,String> value);
    @JsConstructor
    public UrlSegment(String path,JsTypedObject<String,String> parameters) {}
     String toString();
}
