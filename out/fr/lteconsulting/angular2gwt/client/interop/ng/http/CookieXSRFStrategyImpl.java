package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.http.Request;

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
@JsType( isNative=true, namespace="ng.http", name="CookieXSRFStrategy" )
public class CookieXSRFStrategyImpl extends XSRFStrategy {
    @JsProperty(name="_cookieName")
    Object get_cookieName();
    @JsProperty(name="_cookieName")
    void set_cookieName(Object value);
    @JsProperty(name="_headerName")
    Object get_headerName();
    @JsProperty(name="_headerName")
    void set_headerName(Object value);
    @JsConstructor
    public CookieXSRFStrategyImpl(String /* optional */ _cookieName,String /* optional */ _headerName) {}
    public native  void configureRequest(Request req);
}
