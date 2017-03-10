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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BrowserGetTestability extends GetTestability {
     void addToWindow(TestabilityRegistry registry);
     Testability findTestabilityInTree(TestabilityRegistry registry,Object elem,boolean findInAncestors);
}
