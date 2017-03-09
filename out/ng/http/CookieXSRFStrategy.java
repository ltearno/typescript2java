package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\backends\xhr_backend.d.ts
  * Package ng.http
  * Name CookieXSRFStrategy
  * `XSRFConfiguration` sets up Cross Site Request Forgery (XSRF) protection for the application
  * using a cookie. See https://www.owasp.org/index.php/Cross-Site_Request_Forgery_(CSRF)
  * for more information on XSRF.
  * 
  * Applications can configure custom cookie and header names by binding an instance of this class
  * with different `cookieName` and `headerName` values. See the main HTTP documentation for more
  * details.
  **/
@JsType( isNative=true, namespace="ng.http" )
public class CookieXSRFStrategy extends XSRFStrategy {
    public Object _cookieName;
    public Object _headerName;
    @JsConstructor
    public CookieXSRFStrategy(String /* optional */ _cookieName,String /* optional */ _headerName) {}
    public native  void configureRequest(Request req);
}
