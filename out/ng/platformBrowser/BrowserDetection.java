package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\testing\browser_util.d.ts
  * Package ng.platformBrowser
  * Name BrowserDetection
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class BrowserDetection  {
    public Object _overrideUa;
    public Object _ua;
    public static native  void setup();
    @JsConstructor
    public BrowserDetection(String ua) {}
    public boolean isFirefox;
    public boolean isAndroid;
    public boolean isEdge;
    public boolean isIE;
    public boolean isWebkit;
    public boolean isIOS7;
    public boolean isSlow;
    public boolean supportsNativeIntlApi;
    public boolean isChromeDesktop;
    public boolean isOldChrome;
}
