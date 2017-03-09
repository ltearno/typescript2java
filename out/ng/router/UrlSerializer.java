package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSerializer
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public interface UrlSerializer  {
     UrlTree parse(String url);
     String serialize(UrlTree tree);
}
