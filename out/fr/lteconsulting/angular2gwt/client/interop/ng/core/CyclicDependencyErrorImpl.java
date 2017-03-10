package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveInjector;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name CyclicDependencyError
  * Thrown when dependencies form a cycle.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/wYQdNos0Tzql3ei1EV9j?p=info))
  * 
  * ```typescript
  * var injector = Injector.resolveAndCreate([
  *    {provide: "one", useFactory: (two) => "two", deps: [[new Inject("two")]]},
  *    {provide: "two", useFactory: (one) => "one", deps: [[new Inject("one")]]}
  * ]);
  * 
  * expect(() => injector.get("one")).toThrowError();
  * ```
  * 
  * Retrieving `A` or `B` throws a `CyclicDependencyError` as the graph above cannot be constructed.
  **/
@JsType( isNative=true, namespace="ng.core", name="CyclicDependencyError" )
public class CyclicDependencyErrorImpl extends AbstractProviderError {
    @JsConstructor
    public CyclicDependencyErrorImpl(ReflectiveInjector injector,ReflectiveKey key) {}
}
