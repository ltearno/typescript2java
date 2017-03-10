package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\opaque_token.d.ts
  * Package ng.core
  * Name OpaqueToken
  * Creates a token that can be used in a DI Provider.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/Ys9ezXpj2Mnoy3Uc8KBp?p=preview))
  * 
  * ```typescript
  * var t = new OpaqueToken("value");
  * 
  * var injector = Injector.resolveAndCreate([
  *    {provide: t, useValue: "bindingValue"}
  * ]);
  * 
  * expect(injector.get(t)).toEqual("bindingValue");
  * ```
  * 
  * Using an `OpaqueToken` is preferable to using strings as tokens because of possible collisions
  * caused by multiple providers using the same string as two different tokens.
  * 
  * Using an `OpaqueToken` is preferable to using an `Object` as tokens because it provides better
  * error messages.
  **/
@JsType( isNative=true, namespace="ng.core", name="OpaqueToken" )
public class OpaqueTokenImpl  {
    @JsProperty(name="_desc")
    Object get_desc();
    @JsProperty(name="_desc")
    void set_desc(Object value);
    @JsConstructor
    public OpaqueTokenImpl(String _desc) {}
    public native  String toString();
}
