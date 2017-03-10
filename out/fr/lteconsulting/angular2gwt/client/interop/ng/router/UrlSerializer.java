package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSerializer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface UrlSerializer  {
     UrlTree parse(String url);
     String serialize(UrlTree tree);
}
