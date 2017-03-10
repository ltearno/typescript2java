package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSerializer
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="UrlSerializer" )
public abstract class UrlSerializerImpl  {
    public native  UrlTree parse(String url);
    public native  String serialize(UrlTree tree);
}
