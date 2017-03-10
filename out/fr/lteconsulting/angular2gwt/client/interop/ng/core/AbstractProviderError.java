package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveInjector;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name AbstractProviderError
  * Base class for all errors arising from misconfigured providers.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AbstractProviderError extends BaseError {
    @JsConstructor
    public AbstractProviderError(ReflectiveInjector injector,ReflectiveKey key,Function constructResolvingMessage) {}
     void addKey(ReflectiveInjector injector,ReflectiveKey key);
}
