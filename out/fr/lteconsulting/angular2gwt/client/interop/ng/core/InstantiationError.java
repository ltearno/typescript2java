package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveInjector;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;

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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InstantiationError extends WrappedError {
    @JsConstructor
    public InstantiationError(ReflectiveInjector injector,Object originalException,Object originalStack,ReflectiveKey key) {}
     void addKey(ReflectiveInjector injector,ReflectiveKey key);
    @JsProperty(name="message")
    String getMessage();
    @JsProperty(name="message")
    void setMessage(String value);
    @JsProperty(name="causeKey")
    ReflectiveKey getCauseKey();
    @JsProperty(name="causeKey")
    void setCauseKey(ReflectiveKey value);
}
