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
@JsType( isNative=true, namespace="ng.router", name="UrlSegment" )
public class UrlSegmentImpl  {
    @JsProperty(name="path")
    String getPath();
    @JsProperty(name="path")
    void setPath(String value);
    @JsProperty(name="parameters")
    JsTypedObject<String,String> getParameters();
    @JsProperty(name="parameters")
    void setParameters(JsTypedObject<String,String> value);
    @JsConstructor
    public UrlSegmentImpl(String path,JsTypedObject<String,String> parameters) {}
    public native  String toString();
}
