package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name InvalidProviderError
  * Thrown when an object other then {@link Provider} (or `Type`) is passed to {@link Injector}
  * creation.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/YatCFbPAMCL0JSSQ4mvH?p=preview))
  * 
  * ```typescript
  * expect(() => Injector.resolveAndCreate(["not a type"])).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core", name="InvalidProviderError" )
public class InvalidProviderErrorImpl extends BaseError {
    @JsConstructor
    public InvalidProviderErrorImpl(Object provider) {}
}
