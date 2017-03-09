package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name DefaultUrlSerializer
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class DefaultUrlSerializer extends UrlSerializer {
    public native  UrlTree parse(String url);
    public native  String serialize(UrlTree tree);
}
