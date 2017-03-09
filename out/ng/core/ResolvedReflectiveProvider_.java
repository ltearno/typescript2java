package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ResolvedReflectiveProvider_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ResolvedReflectiveProvider_ extends ResolvedReflectiveProvider {
    public ReflectiveKey key;
    public JsArray<ResolvedReflectiveFactory> resolvedFactories;
    public boolean multiProvider;
    @JsConstructor
    public ResolvedReflectiveProvider_(ReflectiveKey key,JsArray<ResolvedReflectiveFactory> resolvedFactories,boolean multiProvider) {}
    public ResolvedReflectiveFactory resolvedFactory;
}
