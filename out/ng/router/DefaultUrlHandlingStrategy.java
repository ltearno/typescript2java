package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\router\src\url_handling_strategy.d.ts
  * Package ng.router
  * Name DefaultUrlHandlingStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class DefaultUrlHandlingStrategy extends UrlHandlingStrategy {
    public native  boolean shouldProcessUrl(UrlTree url);
    public native  UrlTree extract(UrlTree url);
    public native  UrlTree merge(UrlTree newUrlPart,UrlTree wholeUrl);
}
