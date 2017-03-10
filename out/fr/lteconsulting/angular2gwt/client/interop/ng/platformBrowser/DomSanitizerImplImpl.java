package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.SafeHtml;
import ng.platformBrowser.SafeStyle;
import ng.platformBrowser.SafeScript;
import ng.platformBrowser.SafeUrl;
import ng.platformBrowser.SafeResourceUrl;

/**
  * Generated from tests\@angular\platform-browser\src\security\dom_sanitization_service.d.ts
  * Package ng.platformBrowser
  * Name DomSanitizerImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomSanitizerImpl" )
public class DomSanitizerImplImpl extends DomSanitizer {
    public native  String sanitize(/* ng.core.SecurityContext */ int ctx,Object value);
    public native  void checkNotSafeValue();
    public native  SafeHtml bypassSecurityTrustHtml(String value);
    public native  SafeStyle bypassSecurityTrustStyle(String value);
    public native  SafeScript bypassSecurityTrustScript(String value);
    public native  SafeUrl bypassSecurityTrustUrl(String value);
    public native  SafeResourceUrl bypassSecurityTrustResourceUrl(String value);
}
