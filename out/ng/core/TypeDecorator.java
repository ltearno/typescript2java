package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\util\decorators.d.ts
  * Package ng.core
  * Name TypeDecorator
  * An interface implemented by all Angular type decorators, which allows them to be used as ES7
  * decorators as well as
  * Angular DSL syntax.
  * 
  * DSL syntax:
  * 
  * ```
  * var MyClass = ng
  *    .Component({...})
  *    .Class({...});
  * ```
  * 
  * ES7 syntax:
  * 
  * ```
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class TypeDecorator  {
    // ignored CallSignature
    // ignored CallSignature
    public JsArray<Object> annotations;
    public native  Type<Object> Class(ClassDefinition obj);
}
