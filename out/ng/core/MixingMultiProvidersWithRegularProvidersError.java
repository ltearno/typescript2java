package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name MixingMultiProvidersWithRegularProvidersError
  * Thrown when a multi provider and a regular provider are bound to the same token.
  * 
  * ### Example
  * 
  * ```typescript
  * expect(() => Injector.resolveAndCreate([
  *    { provide: "Strings", useValue: "string1", multi: true},
  *    { provide: "Strings", useValue: "string2", multi: false}
  * ])).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MixingMultiProvidersWithRegularProvidersError extends BaseError {
    @JsConstructor
    public MixingMultiProvidersWithRegularProvidersError(Object provider1,Object provider2) {}
}
