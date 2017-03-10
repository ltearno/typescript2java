package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.Testability;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name TestabilityRegistry
  * A global registry of {@link Testability} instances for specific elements.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestabilityRegistry  {
    @JsConstructor
    public TestabilityRegistry() {}
     void registerApplication(Object token,Testability testability);
     Testability getTestability(Object elem);
     JsArray<Testability> getAllTestabilities();
     JsArray<Object> getAllRootElements();
     Testability findTestabilityInTree(Node elem,boolean /* optional */ findInAncestors);
}
