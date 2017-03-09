package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSegment
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class UrlSegment  {
    public String path;
    public JsTypedObject<String,String> parameters;
    @JsConstructor
    public UrlSegment(String path,JsTypedObject<String,String> parameters) {}
    public native  String toString();
}
