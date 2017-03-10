package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\url_handling_strategy.d.ts
  * Package ng.router
  * Name UrlHandlingStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="UrlHandlingStrategy" )
public abstract class UrlHandlingStrategyImpl  {
    public native  boolean shouldProcessUrl(UrlTree url);
    public native  UrlTree extract(UrlTree url);
    public native  UrlTree merge(UrlTree newUrlPart,UrlTree rawUrl);
}
