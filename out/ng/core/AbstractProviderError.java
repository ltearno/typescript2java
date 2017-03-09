package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name AbstractProviderError
  * Base class for all errors arising from misconfigured providers.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AbstractProviderError extends BaseError {
    @JsConstructor
    public AbstractProviderError(ReflectiveInjector injector,ReflectiveKey key,Function constructResolvingMessage) {}
    public native  void addKey(ReflectiveInjector injector,ReflectiveKey key);
}
