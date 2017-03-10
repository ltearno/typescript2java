package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveInjector;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name NoProviderError
  * Thrown when trying to retrieve a dependency by key from {@link Injector}, but the
  * {@link Injector} does not have a {@link Provider} for the given key.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/vq8D3FRB9aGbnWJqtEPE?p=preview))
  * 
  * ```typescript
  * class A {
  *    constructor(b:B) {}
  * }
  * 
  * expect(() => Injector.resolveAndCreate([A])).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core", name="NoProviderError" )
public class NoProviderErrorImpl extends AbstractProviderError {
    @JsConstructor
    public NoProviderErrorImpl(ReflectiveInjector injector,ReflectiveKey key) {}
}
