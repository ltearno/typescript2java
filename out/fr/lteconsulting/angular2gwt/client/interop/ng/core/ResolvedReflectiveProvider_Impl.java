package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ResolvedReflectiveFactory;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ResolvedReflectiveProvider_
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ResolvedReflectiveProvider_" )
public class ResolvedReflectiveProvider_Impl extends ResolvedReflectiveProvider {
    @JsProperty(name="key")
    ReflectiveKey getKey();
    @JsProperty(name="key")
    void setKey(ReflectiveKey value);
    @JsProperty(name="resolvedFactories")
    JsArray<ResolvedReflectiveFactory> getResolvedFactories();
    @JsProperty(name="resolvedFactories")
    void setResolvedFactories(JsArray<ResolvedReflectiveFactory> value);
    @JsProperty(name="multiProvider")
    boolean getMultiProvider();
    @JsProperty(name="multiProvider")
    void setMultiProvider(boolean value);
    @JsConstructor
    public ResolvedReflectiveProvider_Impl(ReflectiveKey key,JsArray<ResolvedReflectiveFactory> resolvedFactories,boolean multiProvider) {}
    @JsProperty(name="resolvedFactory")
    ResolvedReflectiveFactory getResolvedFactory();
    @JsProperty(name="resolvedFactory")
    void setResolvedFactory(ResolvedReflectiveFactory value);
}
