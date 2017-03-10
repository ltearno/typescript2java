package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.TestabilityRegistry;
import ng.core.Testability;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name GetTestability
  * Adapter interface for retrieving the `Testability` service associated for a
  * particular context.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface GetTestability  {
     void addToWindow(TestabilityRegistry registry);
     Testability findTestabilityInTree(TestabilityRegistry registry,Object elem,boolean findInAncestors);
}
