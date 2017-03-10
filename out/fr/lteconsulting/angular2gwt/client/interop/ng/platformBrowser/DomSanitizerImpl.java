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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DomSanitizerImpl extends DomSanitizer {
     String sanitize(/* ng.core.SecurityContext */ int ctx,Object value);
     void checkNotSafeValue();
     SafeHtml bypassSecurityTrustHtml(String value);
     SafeStyle bypassSecurityTrustStyle(String value);
     SafeScript bypassSecurityTrustScript(String value);
     SafeUrl bypassSecurityTrustUrl(String value);
     SafeResourceUrl bypassSecurityTrustResourceUrl(String value);
}
