package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\router\src\url_handling_strategy.d.ts
  * Package ng.router
  * Name UrlHandlingStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public interface UrlHandlingStrategy  {
     boolean shouldProcessUrl(UrlTree url);
     UrlTree extract(UrlTree url);
     UrlTree merge(UrlTree newUrlPart,UrlTree rawUrl);
}
