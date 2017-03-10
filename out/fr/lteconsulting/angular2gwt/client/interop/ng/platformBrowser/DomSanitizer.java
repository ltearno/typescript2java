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
  * Name DomSanitizer
  * DomSanitizer helps preventing Cross Site Scripting Security bugs (XSS) by sanitizing
  * values to be safe to use in the different DOM contexts.
  * 
  * For example, when binding a URL in an `<a [href]="someValue">` hyperlink, `someValue` will be
  * sanitized so that an attacker cannot inject e.g. a `javascript:` URL that would execute code on
  * the website.
  * 
  * In specific situations, it might be necessary to disable sanitization, for example if the
  * application genuinely needs to produce a `javascript:` style link with a dynamic value in it.
  * Users can bypass security by constructing a value with one of the `bypassSecurityTrust...`
  * methods, and then binding to that value from the template.
  * 
  * These situations should be very rare, and extraordinary care must be taken to avoid creating a
  * Cross Site Scripting (XSS) security bug!
  * 
  * When using `bypassSecurityTrust...`, make sure to call the method as early as possible and as
  * close as possible to the source of the value, to make it easy to verify no security bug is
  * created by its use.
  * 
  * It is not required (and not recommended) to bypass security if the value is safe, e.g. a URL that
  * does not start with a suspicious protocol, or an HTML snippet that does not contain dangerous
  * code. The sanitizer leaves safe values intact.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DomSanitizer extends Sanitizer {
     String sanitize(/* ng.core.SecurityContext */ int context,Object value);
     SafeHtml bypassSecurityTrustHtml(String value);
     SafeStyle bypassSecurityTrustStyle(String value);
     SafeScript bypassSecurityTrustScript(String value);
     SafeUrl bypassSecurityTrustUrl(String value);
     SafeResourceUrl bypassSecurityTrustResourceUrl(String value);
}
