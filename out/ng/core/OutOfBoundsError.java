package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name OutOfBoundsError
  * Thrown when getting an object by index.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/bRs0SX2OTQiJzqvjgl8P?p=preview))
  * 
  * ```typescript
  * class A {}
  * 
  * var injector = Injector.resolveAndCreate([A]);
  * 
  * expect(() => injector.getAt(100)).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core" )
public class OutOfBoundsError extends BaseError {
    @JsConstructor
    public OutOfBoundsError(int index) {}
}
