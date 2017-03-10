package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name NoAnnotationError
  * Thrown when the class has no annotation information.
  * 
  * Lack of annotation information prevents the {@link Injector} from determining which dependencies
  * need to be injected into the constructor.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/rHnZtlNS7vJOPQ6pcVkm?p=preview))
  * 
  * ```typescript
  * class A {
  *    constructor(b) {}
  * }
  * 
  * expect(() => Injector.resolveAndCreate([A])).toThrowError();
  * ```
  * 
  * This error is also thrown when the class not marked with {@link Injectable} has parameter types.
  * 
  * ```typescript
  * class B {}
  * 
  * class A {
  *    constructor(b:B) {} // no information about the parameter types of A is available at runtime.
  * }
  * 
  * expect(() => Injector.resolveAndCreate([A,B])).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core", name="NoAnnotationError" )
public class NoAnnotationErrorImpl extends BaseError {
    @JsConstructor
    public NoAnnotationErrorImpl(Object /* UnionType */ typeOrFunc,JsArray<JsArray<Object>> params) {}
    public static native  void _genMessage();
}
