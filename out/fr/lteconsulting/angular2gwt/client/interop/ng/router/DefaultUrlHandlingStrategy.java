package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\url_handling_strategy.d.ts
  * Package ng.router
  * Name DefaultUrlHandlingStrategy
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DefaultUrlHandlingStrategy extends UrlHandlingStrategy {
     boolean shouldProcessUrl(UrlTree url);
     UrlTree extract(UrlTree url);
     UrlTree merge(UrlTree newUrlPart,UrlTree wholeUrl);
}
