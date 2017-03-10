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
@JsType( isNative=true, namespace="ng.core", name="AbstractProviderError" )
public class AbstractProviderErrorImpl extends BaseError {
    @JsConstructor
    public AbstractProviderErrorImpl(ReflectiveInjector injector,ReflectiveKey key,Function constructResolvingMessage) {}
    public native  void addKey(ReflectiveInjector injector,ReflectiveKey key);
}
