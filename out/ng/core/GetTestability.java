package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name GetTestability
  * Adapter interface for retrieving the `Testability` service associated for a
  * particular context.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class GetTestability  {
    public native  void addToWindow(TestabilityRegistry registry);
    public native  Testability findTestabilityInTree(TestabilityRegistry registry,Object elem,boolean findInAncestors);
}
