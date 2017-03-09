package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.core.TestabilityRegistry;
import ng.core.Testability;

/**
  * Generated from tests\@angular\platform-browser\src\browser\testability.d.ts
  * Package ng.platformBrowser
  * Name BrowserGetTestability
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class BrowserGetTestability extends GetTestability {
    public static native  void init();
    public native  void addToWindow(TestabilityRegistry registry);
    public native  Testability findTestabilityInTree(TestabilityRegistry registry,Object elem,boolean findInAncestors);
}
