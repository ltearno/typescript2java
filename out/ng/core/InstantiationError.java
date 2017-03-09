package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name InstantiationError
  * Thrown when a constructing type returns with an Error.
  * 
  * The `InstantiationError` class contains the original error plus the dependency graph which caused
  * this object to be instantiated.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/7aWYdcqTQsP0eNqEdUAf?p=preview))
  * 
  * ```typescript
  * class A {
  *    constructor() {
  *      throw new Error('message');
  *    }
  * }
  * 
  * var injector = Injector.resolveAndCreate([A]);
  * 
  * try {
  *    injector.get(A);
  * } catch (e) {
  *    expect(e instanceof InstantiationError).toBe(true);
  *    expect(e.originalException.message).toEqual("message");
  *    expect(e.originalStack).toBeDefined();
  * }
  * ```
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InstantiationError extends WrappedError {
    @JsConstructor
    public InstantiationError(ReflectiveInjector injector,Object originalException,Object originalStack,ReflectiveKey key) {}
    public native  void addKey(ReflectiveInjector injector,ReflectiveKey key);
    public String message;
    public ReflectiveKey causeKey;
}
