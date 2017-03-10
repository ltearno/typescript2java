package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\testing\browser_util.d.ts
  * Package ng.platformBrowser
  * Name BrowserDetection
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="BrowserDetection" )
public class BrowserDetectionImpl  {
    @JsProperty(name="_overrideUa")
    Object get_overrideUa();
    @JsProperty(name="_overrideUa")
    void set_overrideUa(Object value);
    @JsProperty(name="_ua")
    Object get_ua();
    @JsProperty(name="_ua")
    void set_ua(Object value);
    public static native  void setup();
    @JsConstructor
    public BrowserDetectionImpl(String ua) {}
    @JsProperty(name="isFirefox")
    boolean getIsFirefox();
    @JsProperty(name="isFirefox")
    void setIsFirefox(boolean value);
    @JsProperty(name="isAndroid")
    boolean getIsAndroid();
    @JsProperty(name="isAndroid")
    void setIsAndroid(boolean value);
    @JsProperty(name="isEdge")
    boolean getIsEdge();
    @JsProperty(name="isEdge")
    void setIsEdge(boolean value);
    @JsProperty(name="isIE")
    boolean getIsIE();
    @JsProperty(name="isIE")
    void setIsIE(boolean value);
    @JsProperty(name="isWebkit")
    boolean getIsWebkit();
    @JsProperty(name="isWebkit")
    void setIsWebkit(boolean value);
    @JsProperty(name="isIOS7")
    boolean getIsIOS7();
    @JsProperty(name="isIOS7")
    void setIsIOS7(boolean value);
    @JsProperty(name="isSlow")
    boolean getIsSlow();
    @JsProperty(name="isSlow")
    void setIsSlow(boolean value);
    @JsProperty(name="supportsNativeIntlApi")
    boolean getSupportsNativeIntlApi();
    @JsProperty(name="supportsNativeIntlApi")
    void setSupportsNativeIntlApi(boolean value);
    @JsProperty(name="isChromeDesktop")
    boolean getIsChromeDesktop();
    @JsProperty(name="isChromeDesktop")
    void setIsChromeDesktop(boolean value);
    @JsProperty(name="isOldChrome")
    boolean getIsOldChrome();
    @JsProperty(name="isOldChrome")
    void setIsOldChrome(boolean value);
}
