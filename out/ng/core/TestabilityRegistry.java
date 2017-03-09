package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name TestabilityRegistry
  * A global registry of {@link Testability} instances for specific elements.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TestabilityRegistry  {
    @JsConstructor
    public TestabilityRegistry() {}
    public native  void registerApplication(Object token,Testability testability);
    public native  Testability getTestability(Object elem);
    public native  JsArray<Testability> getAllTestabilities();
    public native  JsArray<Object> getAllRootElements();
    public native  Testability findTestabilityInTree(Node elem,boolean /* optional */ findInAncestors);
}
